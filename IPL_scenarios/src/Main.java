public class Main {
    public static void main(String[] args) {
        ReadMatches o1 = new ReadMatches();
        o1.reader1();
        ReadDeliveries o2 = new ReadDeliveries();
        o2.reader2();
        Task1 o3 = new Task1();
        o3.prob1();
        //System.out.println(o3);
        Task2 o4 = new Task2();
        o4.prob2();
        Task3 o5 = new Task3();
        o5.prob3();
        Task4 o6 = new Task4();
        o6.prob4();
        CustomTask o7 = new CustomTask();
        o7.prob5();
    }
}
