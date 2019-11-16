package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu ();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Tomato Soup", "Soup made from tomatoes", "Soups", 3.99, new Date());
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Grilled Cheese Sandwich", "Hot sandwich made from white bread and American Cheese", "Sandwiches", 5.99, new Date());
        menuItems.add(menuItem2);

        menu.setMenuItems(menuItems);

        for (int i = 0; i < menuItems.size(); i++) {

            System.out.println(menuItems.get(i));
//            System.out.println(MenuItem.getName());
        }
//        System.out.println(menuItems);
    }
}
