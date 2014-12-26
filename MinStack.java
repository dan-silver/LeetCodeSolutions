//https://oj.leetcode.com/problems/min-stack/

/**

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

**/

class MinStack {

    private Stack<Integer> min_stack = new Stack<Integer>();
    private Stack<Integer> all_stack = new Stack<Integer>();
    
    public void push(int x) {
        all_stack.push(x);
        if (min_stack.size() == 0 || top() <= getMin()) {
            min_stack.push(x);
        }
    }

    public void pop() {
        if (all_stack.size() > 0) {
            if (top() == getMin()) {
                min_stack.pop();
            }
            all_stack.pop();
        }
    }

    public int top() {
        return all_stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
