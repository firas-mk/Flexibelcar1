public class CarOwner extends User {

    public String PublishPictures;
    public String Confirm_request;
    public int receivepayment;

    public boolean pay_subscription;



    public CarOwner(String username, int telephone_nr, String email, String address, int credit_card_nr,Boolean cancelOrder,String publishPictures,String confirm_request,int receivepayment,boolean pay_subscription) {
        super(username, telephone_nr, email, address, credit_card_nr,cancelOrder);
        this.PublishPictures=publishPictures;
        this.Confirm_request=confirm_request;
        this.receivepayment=receivepayment;
        this.pay_subscription=pay_subscription;
    }

    public String getPublishPictures() {
        return PublishPictures;
    }

    public void setPoblishPictures(String publishPictures) {
        PublishPictures = publishPictures;
    }

    public String getConfirm() {
        return Confirm_request;
    }

    public void setConfirm_request(String confirm_request) {
        Confirm_request = confirm_request;
    }

    public int getReceivepayment() {
        return receivepayment;
    }

    public void setReceivepayment(int receivepayment) {
        this.receivepayment = receivepayment;
    }

    public void setPublishPictures(String publishPictures) {
        PublishPictures = publishPictures;
    }

    public String getConfirm_request() {
        return Confirm_request;
    }

    public boolean isPay_subscription() {
        return pay_subscription;
    }

    public void setPay_subscription(boolean pay_subscription) {
        this.pay_subscription = pay_subscription;
    }
}
