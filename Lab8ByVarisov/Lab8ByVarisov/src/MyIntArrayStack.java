

public class MyIntArrayStack implements MyIntStack {
    private Integer[] contents;
    private int topOfTheStack;

    public MyIntArrayStack(Integer capacity) {
        contents = new Integer[capacity];
        this.topOfTheStack = -1;
    }

    @Override
    public void push(Integer element) {
        if (isFull()) {
            System.out.println("Loading");
        }
        contents[++topOfTheStack] = element;
    }

    @Override
        public int pop() {
        int result = contents[topOfTheStack];
        topOfTheStack--;
        return result;
    }


    @Override
    public int peek() {
        if(!isEmpty()){
            return contents[topOfTheStack];
        }
        return -1;
    }

    public boolean isEmpty() {
        return topOfTheStack == -1;
    }

    public boolean isFull(){
        return topOfTheStack == (contents.length - 1);
    }
}
