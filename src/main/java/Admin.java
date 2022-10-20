public class Admin {

    public int credit_nr;
    public int license;


    public Admin(int credit_nr, int license) {
        this.credit_nr = credit_nr;
        this.license = license;
    }


    public int getCredit_nr() {
        return credit_nr;
    }

    public void setCredit_nr(int credit_nr) {
        this.credit_nr = credit_nr;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }
}
