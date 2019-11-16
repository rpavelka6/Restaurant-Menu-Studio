package restaurant;
import java.util.Date;

public class MenuItem {

    public Integer itemId;
    public String name;
    public String description;
    public String category;
    public Date lastUpdate;
    private Double price;

    public MenuItem(Integer itemId, String name, String description, String category, Double price, Date lastUpdate) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.lastUpdate = lastUpdate;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", price=" + price +
                '}';
    }
}
