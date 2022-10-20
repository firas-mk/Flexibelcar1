public class CarRenter extends User {
    public String SearchCar;
    public String Order;
    public  int Pay;

    public CarRenter(String username, int telephone_nr, String email, String address, int credit_card_nr,Boolean cancelOrder,String searchCar,String order,int Pay) {
        super(username, telephone_nr, email, address, credit_card_nr,cancelOrder);
        this.SearchCar=searchCar;
        this.Order=order;
        this.Pay=Pay;
    }

    public String getSearchCar() {
        return SearchCar;
    }

    public void setSearchCar(String searchCar) {
        SearchCar = searchCar;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public int getPay() {
        return Pay;
    }

    public void setPay(int pay) {
        Pay = pay;
    }
}
