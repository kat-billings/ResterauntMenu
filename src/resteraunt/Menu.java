package resteraunt;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

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
}
