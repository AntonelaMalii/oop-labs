package lab2ex2;


import java.util.ArrayList;

public class Queue {

    private int maxSize;
    private int rear;
    private ArrayList<Integer> queue;

    public Queue(){
      this.queue = new ArrayList<Integer>();
      this.rear=0;
      this.maxSize=this.rear+1;
    }

    public Queue(int max){

        this.maxSize=max;
        this.queue= new ArrayList<Integer>(maxSize);
        this.rear=0;

    }

    public void push(int data)
    {
        queue.add(data);
        this.rear++;

    }
    public void push2(int data){
        if(this.rear<this.maxSize){
            queue.add(data);
            this.rear++;
        }else{
            System.out.println("Can not add element/full queue\n");
        }
    }
    public void pop(){
        if(queue.size()>0) {
            int index = 0;
            queue.remove(index);
            this.rear--;
        }
    }

    public int getRear() {
        return rear;
    }
    public int getMaxSize(){
        return maxSize;
    }

    public boolean isFull()
    {
        return this.rear==this.maxSize;

    }
    public boolean isEmpty(){
        return this.rear==0;
    }
    public void showElements(){
            System.out.println(this.queue);

    }

}


