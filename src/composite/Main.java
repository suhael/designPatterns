package composite;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Main {
    public static void main(String[] args) {

        MenuComponent dinerMenu = new Menu("DINER menu", "lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "dinner");
        MenuComponent desertMenu = new Menu("DESSERT Menu", "desserts");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(desertMenu);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
