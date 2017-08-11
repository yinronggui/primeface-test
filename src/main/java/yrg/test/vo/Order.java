package yrg.test.vo;

/**
 * Created by yrg
 * date: 2017/8/8
 * time: 15:14
 */
public class Order {
    private boolean selected ;
    private String name;

    public Order(boolean selected, String name) {
        this.selected = selected;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "selected=" + selected +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
