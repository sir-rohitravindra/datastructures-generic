package MiscJava.DataStructures.Queue;

import MiscJava.DataStructures.Exceptions.UnderflowException;

public class App {

    public static void main(String[] args) {

        Queue<String> queue = new Queue<String>();

        queue.add("S1");
        try {
            System.out.println(queue.peek());
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        queue.add("S2");
        try {
            System.out.println(queue.peek());
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            queue.dequeue();
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            System.out.println(queue.peek());
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            queue.dequeue();
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            System.out.println(queue.peek());
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            queue.dequeue();
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        queue.add("S0");
        try {
            System.out.println(queue.peek());
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            queue.dequeue();
        } catch (UnderflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
