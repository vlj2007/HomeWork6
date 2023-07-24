public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        System.out.println("Задача 1");
        for(int i =1; i < 11; i++){
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2(){
        System.out.println("Задача 2");
        for(int i =10; i > 0; i--){
            System.out.println("Итерация цикла " + i);
        }
    }
}