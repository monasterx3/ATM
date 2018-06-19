import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class calculator {
   public static void main(String args[]){
       // Created a Stack - ADT
       Stack<Character> myStack = new Stack<Character>();
       ArrayList<Character> myArray = new ArrayList<Character>();
      
       // Boolean statements
       boolean lastOperator = false;
       boolean lastOpenParen = false;
       boolean lastClosedParen = false;
       boolean lastInt = false;
       boolean prevToken = false; // if prev token was an operand
      
       // Scanner for user input
       Scanner sc = new Scanner(System.in);
      
       // User infix input
       System.out.println("Enter infix expression (q to quit): ");
       String infixString = sc.nextLine();
       char infix[] = infixString.toCharArray();
      
       // Error Message - No operator between operands
       if(infix[infix.length-1] == '/' || infix[infix.length-1] == '*' || infix[infix.length-1] == '%' ||
           infix[infix.length-1] == '+' || infix[infix.length-1] == '-'){
           System.out.println("Error in expression! No operator between operands.\n" +
            "Also last token must be an operand or closed parenthesis.");
           System.exit(-1);
       }
      
       // Error Message - No operands or open parenthesis before operator
       if(infix[0] == '/' || infix[0] == '*' || infix[0] == '%' || infix[0] == '+' || infix[0] == '-'){
           System.out.println("Error in expression! First token must be an"
                   + " operand or open paranthesis.");
           System.exit(-1);
       }
      
       //infixString = infixString;
       for(int i = 0; i < infixString.length(); i++){
           if(infix[i] == ' '){
               continue;
           }
           infix[i] = infixString.charAt(i);
           switch(infix[i]){
          
           // INTEGERS
           case '1': case '2': case '3': case '4':
           case '5': case '6': case '7': case '8':
           case '9': case '0':
               if(lastClosedParen){
                   System.out.println("Error in expression! An integer cannot directly"
                           + " follow a closed parenthesis.");
                   System.exit(-1);
               }
//               if(lastInt){
//                   System.out.println("Error in expression! An integer cannot directly"
//                           + " follow another integer.");
//                   System.exit(-1);
//               }
               lastOperator = false;
               lastOpenParen = false;
               lastClosedParen = false;
               lastInt = true;
               myArray.add(infix[i]);
               break;
              
           // SPACES
           case ' ': continue;
              
           // X VARIABLE - with user input - no non-integers allowed to be inputed
                  
           case 'x':try{
                       System.out.println("Enter value of x: ");
                       int xVarInt = sc.nextInt();
                       String xVar = Integer.toString(xVarInt);
                       myArray.add(xVar.charAt(0));
                       } catch(InputMismatchException e){
                           System.out.println("Error in exception! The x variable must be an integer!");
                           System.exit(-1);
                       }
                   break;
                  
           // UNARY OPERATORS & BINARY OPERATORS
           case '+': case '/':
           case '%':
                      if (lastOperator){
                          System.out.println("Error in expression! An operator cannot"
                               + " directly follow another operator.");
                          System.exit(-1);
                      }
                      if (lastOpenParen){
                          System.out.println("Error in expression! An operator cannot"
                               + " directly follow an open parenthesis.");
                          System.exit(-1);
                      }
                      lastOperator = true;
                      lastOpenParen = false;
                      lastClosedParen = false;
                      lastInt = false;
              
                      while(!myStack.isEmpty() && myStack.peek() != '(' &&
                              precedence(infix[i]) <= precedence(myStack.peek())){
                          myArray.add(myStack.pop());
                      }
                      myStack.push(infix[i]);
                      break;

           case '*':  
//                              if (lastOpenParen){
//                                  System.out.println("Error in expression! An operator cannot"
//                                       + " directly follow an open parenthesis.");
//                                  System.exit(-1);
//                              }
//                              lastOperator = true;
//                              lastOpenParen = false;
//                              lastClosedParen = false;
//                              lastInt = false;
                           try{
                           while(!myStack.isEmpty() && myStack.peek() != '(' &&
                                      precedence(infix[i]) <= precedence(myStack.peek())){
                                  myArray.add(myStack.pop());
                              }
                              myStack.push('*');
                              break;
                           } catch(EmptyStackException e){
                                  System.out.println("Error in expresion! The * operator cannot be preceded by a * operator.");
                                  System.exit(-1);
                              }
//                              while(myStack.peek() != '*'){
//                                  myArray.add('*');
//                              }
//                              myStack.push('*');
//                              break;
//                          } catch(EmptyStackException e){
//                              System.out.println("Error in expresion! The * operator cannot be preceded by a * operator.");
//                              System.exit(-1);
//                          }
                     
           case '-': while(!myStack.isEmpty() && myStack.peek() != '(' &&
                      precedence(infix[i]) <= precedence(myStack.peek())){
                      myArray.add(myStack.pop());
                      }
                      myStack.push('-');
                      break;
                  
           // PARENTHESIS
           case '(': myStack.push(infix[i]);
                      lastOperator = false;
                      lastOpenParen = true;
                      lastClosedParen = false;
                      lastInt = false;
                      break;
                  
           case ')': if(lastOperator){
                       System.out.println("Error in expression! A closed parenthesis"
                       + " cannot directly follow an operator.");
                      System.exit(-1);
           }
                      lastOperator = false;
                      lastOpenParen = false;
                      lastClosedParen = true;
                      lastInt = false;
                      try{
                          while(myStack.peek() != '('){
                              myArray.add(myStack.pop());
                          }
                          myStack.pop();
                          break;
                      } catch(EmptyStackException e){
                          System.out.println("Error in expression! No matching left parentheses for"
                               + " a right parentheses.");
                          System.exit(-1);
                      }
          
           // NO FLOATING POINT NUMBERS
           case '.': System.out.println("Error in expression! Cannot "
                   + "accept floating point numbers.");
                      System.exit(-1);
          
           // QUIT - Q
           case 'q': case 'Q':
                   System.out.println("Shutting down . . .");
                   System.out.println("Goodbye!");
                   System.exit(-1);
                  
                          
           // DEFAULT CASE - if not binary, unary, or parentheses - illegal character
           default:
               System.out.println("Illegal character used. Please try again."); break;
          
           } // End Switch
       } // End For-Loop
      
       while(!myStack.isEmpty()){
           if(myStack.peek() == '('){
               System.out.println("Error in expression! No matching right parenthesis for"
                       + " left parentehesis");
               System.exit(-1);
           }
           myArray.add(myStack.pop());
       }
       System.out.print("Converted Expression: ");
       for(int i = 0; i < myArray.size(); i++){
           System.out.print(myArray.get(i));
       }
       System.out.println();
       System.out.println("Answer to Expression: " + postFixEvaluation(myArray));
      
   } // End Main
  
   // PRECONDITION: Takes in a char variable to check for precedence - if - then return 2 else return 1
   // POSTCONDITION: Returns 2 for higher precedence if its a / % or * - Returns 1 if anything else
   // Heirarchy of operators
   public static int precedence(char a){
       if(a == '/' || a == '%' || a == '*'){
           return 2;
       } else
           return 1;
   }
  
   // PRECONDITION: Takes in an Arraylist of Characters
   // POSTCONDITION: Returns values calculated by each case depending on user input
   // Post fix stack evaluation
   public static int postFixEvaluation(ArrayList<Character> a){
       Stack <Integer> evaluateStack = new Stack <Integer> ();
       for(int i = 0; i < a.size(); i++){
           if(Character.isDigit(a.get(i))){
               evaluateStack.push(Character.getNumericValue(a.get(i)));
           } else{
               int second = evaluateStack.pop();
               int first = evaluateStack.pop();
               switch(a.get(i)){
               case '+': evaluateStack.push(first + second); break;
               case '-': evaluateStack.push(first - second); break;
               case '*': evaluateStack.push(first * second); break;
               case '/': evaluateStack.push(first / second); break;
               case '%': evaluateStack.push(first % second); break;
               }
           }
       }
       return evaluateStack.pop();
   }
  
} // End Class

