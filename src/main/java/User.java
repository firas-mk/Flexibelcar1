public class User {

    public String Username;
    public int telephone_nr;
    public String email;
    public String address;
    public int credit_card_nr;
    
    public Boolean CancelOrder;

    public User(String username, int telephone_nr, String email, String address, int credit_card_nr,Boolean cancelOrder) {
        Username = username;
        this.telephone_nr = telephone_nr;
        this.email = email;
        this.address = address;
        this.credit_card_nr = credit_card_nr;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getTelephone_nr() {
        return telephone_nr;
    }

    public void setTelephone_nr(int telephone_nr) {
        this.telephone_nr = telephone_nr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCredit_card_nr() {
        return credit_card_nr;
    }

    public void setCredit_card_nr(int credit_card_nr) {
        this.credit_card_nr = credit_card_nr;
    }

    public Boolean getCancelOrder() {
        return CancelOrder;
    }

    public void setCancelOrder(Boolean cancelOrder) {
        CancelOrder = cancelOrder;
    }
}




