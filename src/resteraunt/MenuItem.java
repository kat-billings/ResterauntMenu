package resteraunt;

public class MenuItem {
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        String types = "appetizer main course dessert";
        if(!types.contains(aCategory)){
            System.out.println("Invalid Category");
        }
        category = aCategory;
    }

    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }
}
