package com.company;

import java.util.*;
class SpecialStack
{
    private int size;
    private List<Integer> stack = new ArrayList<Integer>(size);
    private int min=0;

    public SpecialStack(int size) {
        this.size = size;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public boolean isFull()
    {
        if(stack.size()==size)
            return true;
        else
            return false;
    }

    public void push(int num)
    {
        if(isFull())
        {
            System.out.println("Stack is full. ");
        }
        else
        {
            stack.add(num);
            System.out.println(num+" pushed into stack");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
            return 0;
        }
        else{
            int item = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            System.out.println(item+" popped from stack");
            return item;
        }
    }

    public void show()
    {
        System.out.println("Stack is :");
        System.out.println(stack);
        System.out.println();
    }

    public void getMin()
    {
        System.out.println("Minimum element : " + Collections.min(stack));
    }

}

public class Ques7 {
    public static void main(String[] args) {
        //Design a Data Structure SpecialStack that supports all the stack operations like
        // push(), pop(), isEmpty(), isFull() and an additional operation getMin() which
        // should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
        SpecialStack specialStack = new SpecialStack(7);
        specialStack.push(22);
        specialStack.push(13);
        specialStack.push(25);
        specialStack.push(27);
        specialStack.push(35);
        specialStack.show();
        specialStack.getMin();
        specialStack.pop();
        specialStack.show();
        specialStack.getMin();
    }
}
