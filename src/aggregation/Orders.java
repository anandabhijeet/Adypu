package aggregation;

public class Orders {
    int id;
    String orderId;
    String product;
    User userId;

    Orders(int id, String orderId, String product, User userId){
        this.id = id;
        this.orderId = orderId;
        this.product = product;
        this.userId = userId;
    }

    void showData(){
        System.out.println("Id: "+ id +"\n"+
                "order Id: " +orderId+"\n"+
                "Produc: " +product+"\n"+
                "User Name: " +userId.Name+"\n"+
                "User Id: " +userId.id+"\n");
    }

    public static void main(String[] args) {
        User user = new User(312, "Ammser");
        Orders orders = new Orders(12, "qwer12", "mobile", user);
        orders.showData();
    }
}


