import metadata.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;


    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderLog> getOrderLog() {
        return orderLog;
    }
    public void setOrderLog(List<OrderLog> orderLog) {
        this.orderLog = orderLog;
    }


    public boolean sendForShipment() {return true;}


    public boolean makePayment(Payment payment);


    public boolean addOrderLog(OrderLog orderLog) {
        this.orderLog.add(orderLog);
    }
}