package LabSessions3;
import java.util.*;
class BalancedBrackets {
    public static void validator(String input_str) {
        Stack<Character> s = new Stack<Character>();
        for (char st : input_str.toCharArray()) {
            if (st == '(' || st == '{' || st == '[') {
                s.push(st);
            }
            else {
                if(s.empty()) {
                    System.out.println(input_str +
                            " contains invalid parentheses.");
                    return;
                }
                else{
                    char top = (Character) s.peek();
                    if(st == ')' && top == '(' ||
                            st == '}' && top == '{' ||
                            st == ']' && top == '['){
                        s.pop();
                    }
                    else{
                        System.out.println("The entered Strings do not contain Balanced Brackets");
                        return;
                    }
                }
            }
        }
        if(s.empty()) {
            System.out.println("The entered String has Balanced Brackets");
        }
        else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
    public static void main( String args[] ) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        validator(string);
    }
}
