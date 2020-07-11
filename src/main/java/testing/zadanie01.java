package testing;

public class zadanie01 {

    public static void helloUser(String[] users) {
        for (String user : users) {
            System.out.println("Hello " + user);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Michal", "Sara", "Kamil", "Zaneta", "Lukasz"};
        helloUser(names);
    }
}