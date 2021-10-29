package resteraunt;

public class MenuItem {
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double aPrice, String aDescription, String aCategory, boolean aIsNew) {
        price = aPrice;
        description = aDescription;
        category = aCategory;
        isNew = aIsNew;
    }

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

    public String toString(){
        if(isNew){
            return String.format("*NEW* %s($%.2f)", this.description, this.price);
        } else {
            return String.format("%s($%.2f)", this.description, this.price);
        }
    }
    public boolean equals(Object objectToCheck) {

        if (objectToCheck == this) {
            return true;
        }

        if (objectToCheck == null) {
            return false;
        }

        if (objectToCheck.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) objectToCheck;
        return theItem.getDescription().equals(getDescription());
    }
}
