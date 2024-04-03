class PracticalNo8 extends Thread{

    int TNo;
    PracticalNo8(int TNo)
    {
        this.TNo=TNo;
    }
    public void run()
    {
        System.out.println("Thread No : "+TNo);
        TNo++;
    }

    public static void main(String []args)
    {
        PracticalNo8 T1 = new PracticalNo8(1);
          PracticalNo8 T2 = new PracticalNo8(2);
             PracticalNo8 T3 = new PracticalNo8(3);
                 PracticalNo8 T4 = new PracticalNo8(4);
                    PracticalNo8 T5 = new PracticalNo8(5);

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();

        System.out.println("Thread 5 state"+T5.getState());
        T5.start();

        T5.suspend();
        System.out.println("Thread 5 state"+T5.getState());

        T5.resume();
        System.out.println("Thread 5 state"+T5.getState());

       
    }
}
