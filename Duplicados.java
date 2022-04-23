/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicados;
import java.util.Stack;

/**
 *
 * @author mafer
 */
public class Duplicados {

   
    public static void main(String[] args) {
        String s = "((x+y))+z";
        String a = "((x+y)+z";

        if (duplicar(s)) {
            System.out.println(s);
            System.out.println(duplicar(s));
            
        } else {
            System.out.println("Incorrecto");
        }
    }
        
    public static boolean duplicar(String s){
        Stack<Character> pila = new Stack<>();

        char[] str = s.toCharArray();
        for (char ch : str) {

            if (ch == ')') {
                char top = pila.peek();
                pila.pop();
                int elementos = 0;

                while (top != '(') {
                    elementos++;
                    top = pila.peek();
                    pila.pop();
                }

                if (elementos < 1) {
                    return true;
                }
            } else {
                pila.push(ch);
            }
        }

        return false;
    }
    
}
