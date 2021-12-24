public class ChickenOrEgg extends Thread{
    String name;
    int priority;
    public ChickenOrEgg (String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public  void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);
        for(int i = 0;i <= 7; i ++){
            try {
                Thread.sleep(333);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ChickenOrEgg egg = new ChickenOrEgg("Яичко", 3);
        ChickenOrEgg chicken = new ChickenOrEgg("Курочка", 3);
        egg.start();
        chicken.start();
        while(true){
            egg.isAlive();
            chicken.isAlive();
            if(egg.isAlive() == false){
                System.out.println("Яичко появилось раньше");
                break;

            }
            else if (chicken.isAlive() == false){
                System.out.println("Курочка появилась раньше");
                break;
            }
            }
    }
}