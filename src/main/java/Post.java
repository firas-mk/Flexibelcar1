public class Post {

    public String title;
    public String descriptionCar;
    public int time_available;
    private int price;


    public Post(String title, String descriptionCar, int time_available, int price) {
        this.title = title;
        this.descriptionCar = descriptionCar;
        this.time_available = time_available;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionCar() {
        return descriptionCar;
    }

    public void setDescriptionCar(String descriptionCar) {
        this.descriptionCar = descriptionCar;
    }

    public int getTime_available() {
        return time_available;
    }

    public void setTime_available(int time_available) {
        this.time_available = time_available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
