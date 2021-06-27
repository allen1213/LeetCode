package com.example.simple;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack1;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {


        return stack1.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack1.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

public class ImplementQueueUsingStacks {


}
