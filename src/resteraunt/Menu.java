package resteraunt;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> aItems, Date aLastUpdated){
        items = aItems;
        lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    public void setLastUpdated(Date aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> addItem(MenuItem item){
        this.items.add(item);
        Date date= Calendar.getInstance().getTime();
        this.setLastUpdated(date);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem removeItem){
        int indexOfRemoved=-1;
        for (int i=0; i<this.items.size(); i++) {
            if (items.get(i).equals(removeItem)){
                indexOfRemoved=i;
            }
        }
        this.items.remove(indexOfRemoved);
        return this.items;
    }

    public String lastUpdate(){
        return ("Updated on:" + this.lastUpdated);
    }

    public void printMenu(){
        for (MenuItem item : items){
            System.out.println(item);
        }
    }

}
