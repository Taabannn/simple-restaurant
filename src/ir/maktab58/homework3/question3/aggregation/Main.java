package ir.maktab58.homework3.question3.aggregation;

public class Main {
    public static void main(String[] args) {
        Clerk clerk1 = new Clerk("Paul");
        Market market1 = new Market("Local Market");
        System.out.println(clerk1.getClerkName() + " is a clerk of " + market1.getMarketName());
    }
}
