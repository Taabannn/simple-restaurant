package ir.maktab58.homework3.question1;

public class MenuItems {
    private String itemName;
    private int itemId;
    private int itemPrice;
    private int itemCount;

    public MenuItems(String itemName, int itemId, int itemPrice, int itemCount) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                ", itemPrice=" + itemPrice + " T" +
                ", itemCount=" + itemCount +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
