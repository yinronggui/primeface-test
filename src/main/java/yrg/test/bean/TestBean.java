package yrg.test.bean;


import yrg.test.vo.Order;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@javax.faces.bean.SessionScoped
public class TestBean {

    private List<Order> orderList = new ArrayList<>();
    private List<Order> selectedOrder = new ArrayList<>();
    private boolean allSelect = false;

    public TestBean() {
        for (int i = 0; i < 9; i++) {

            orderList.add(new Order(false, "订单--------------------" + i));
        }
    }

    public void submit() {
        selectedOrder.clear();
        for (Order order : orderList) {
            System.out.println(order.toString());
            if (order.isSelected()) {
                selectedOrder.add(order);
            }
        }
    }

    public void allSelectChange() {
        if (allSelect) {
            for (Order order : orderList) {
                order.setSelected(true);
            }
        } else {
            for (Order order : orderList) {
                order.setSelected(false);
            }
        }
    }


    public boolean isAllSelect() {
        return allSelect;
    }

    public void setAllSelect(boolean allSelect) {
        this.allSelect = allSelect;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getSelectedOrder() {
        return selectedOrder;
    }

    public void setSelectedOrder(List<Order> selectedOrder) {
        this.selectedOrder = selectedOrder;
    }
}
