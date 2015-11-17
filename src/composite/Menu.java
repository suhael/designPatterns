package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList menuComponents = new ArrayList();

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
