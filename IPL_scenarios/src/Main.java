public class Main {
    public static void main(String[] args) {
//        ReadMatches o1 = new ReadMatches();
        ReadMatches.matchesReader();
//        ReadDeliveries o2 = new ReadDeliveries();
        ReadDeliveries.deliveriesReader();
//        Task1 o3 = new Task1();
        System.out.println("Task1 : Number of matches played per year of all the years in IPL.");
        System.out.print("Solution :");
        Task1.prob1();
        System.out.println();
        //System.out.println(o3);
//        Task2 o4 = new Task2();
        System.out.println("Task2 : Number of matches won of all teams over all the years of IPL.");
        System.out.print("Solution :");
        Task2.prob2();
        System.out.println();
       Task3 o5 = new Task3();
//        o5.prob3();
//        Task4 o6 = new Task4();
        Task4.prob4();
//        CustomTask o7 = new CustomTask();
        System.out.println("CustomTask : Number of matches played in each city");
        System.out.print("Solution :");
        CustomTask.prob5();
        System.out.println();
    }
}
