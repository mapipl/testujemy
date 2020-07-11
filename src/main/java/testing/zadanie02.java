package testing;

public class zadanie02 {

    public static String makeShoppingList(String[] shoppingList) {
        String list = "";
        for (String name : shoppingList) {
            list += name;
            list += ", ";
        }

        return list;
    }

    public static void main(String[] args) {
        String[] names = {"ser", "bula", "szynka"};
        String shoppingList = makeShoppingList(names);
        System.out.println(shoppingList);
    }
}