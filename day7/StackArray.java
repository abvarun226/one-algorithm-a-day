
class Stack<T> {
    static final int MAX = 1000;
    int top;
    T[] data = (T[]) new Object[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    boolean push(T item) {
        if(top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    T pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return null;
        }
        return data[top--];
    }

    T peek() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return null;
        }
        return data[top];
    }
}

class StackArray {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Is stack empty?" + stk.isEmpty());

        stk.push(30);
        stk.push(5);

        System.out.println("Peek Element: " + stk.peek());

        System.out.println("Pop Element: " + stk.pop());
        System.out.println("Pop Element: " + stk.pop());
        System.out.println("Pop Element: " + stk.pop());

    }
}
