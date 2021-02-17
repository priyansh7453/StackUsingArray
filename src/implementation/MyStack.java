package implementation;

import myinterface.StackADT;
public class MyStack implements StackADT{
    //maximum number of element
        private final int MAX_CAPACITY;
        // to store element of stack
        private int[] arr;

        int top;
        public MyStack(int MAX_CAPACITY){
                this.MAX_CAPACITY = MAX_CAPACITY;
                // create array
                arr = new int [MAX_CAPACITY];
                top = 0;
        }

        @Override
        public void push(int element) {
                if(top != MAX_CAPACITY){                // for index -1   if (top != MAX_CAPACITY-1)
                        arr[top] = element;             // top ++
                        top++;                          // arr[top]= element
                }
                else{
                        System.out.println("Stack OverFlow");
                }
        }

        @Override
        public int pop() {
                int response = 0; // consideration invalid data
                if (!isEmpty()){
                        top--;
                        response = arr[top];
                }
                else {
                        System.out.println("Stack Underflow");
                }
                return response;
        }

        @Override
        public int peek() {
                int response = 0; // consideration invalid data
                if (!isEmpty()){
                        response = arr[top-1];
                }
                else {
                        System.out.println("Stack is Empty");
                }
                return response;
        }

        @Override
        public boolean isEmpty() {
                return top==0;
        }
        @Override
        public int size(){
                return top;
        }
        public void traverse(){
                for (int i = 0; i < top; i++) {
                        System.out.print(arr[i] +" ,");
                }
                System.out.println();
        }
        public boolean search(int searchElement){
                boolean response = false;
                for (int i = 0; i < top; i++) {
                        if (arr[i] == searchElement){
                                response = true;
                                break;
                        }
                }
                return response;
        }

}