package MiscJava.DataStructures.Stack;

import MiscJava.DataStructures.Exceptions.UnderflowException;

public class App {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        try {
            System.out.println(stack.peek());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(stack.peek());
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            stack.pop();
        } catch (UnderflowException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(stack.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
