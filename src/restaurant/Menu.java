package restaurant;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<> ();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
