package toys.entity;

import toys.entity.commodity.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String shippingAddress;
    private Date date;
    private int totalAmount;



    @ManyToOne
    @JoinColumn(name="user_id")
   private User user;

    @ManyToMany
    @JoinTable(name ="orders_clothing",
            joinColumns = @JoinColumn(name="orders_id "),
            inverseJoinColumns = @JoinColumn(name = "clothing_id"))
    private List<Clothing> clothings=new ArrayList<Clothing>();

    @ManyToMany
    @JoinTable(name ="orders_furniture",
            joinColumns = @JoinColumn(name="orders_id "),
            inverseJoinColumns = @JoinColumn(name = "furniture_id"))
    private List<Furniture> furniture;

    @ManyToMany
    @JoinTable(name ="orders_mams",
            joinColumns = @JoinColumn(name="orders_id "),
            inverseJoinColumns = @JoinColumn(name = "mams_id"))
    private List<Mams> mams;

    @ManyToMany
    @JoinTable(name ="orders_toys",
            joinColumns = @JoinColumn(name="orders_id "),
            inverseJoinColumns = @JoinColumn(name = "toys_id"))
    private List<Toys> toys;

    public Orders() {
    }

  /*  public Orders(String shippingAddress, int totalAmount, User user, List<Clothing> clothings, List<Furniture> furniture, List<Mams> mams, List<Toys> toys) {
        this.shippingAddress = shippingAddress;
        this.date = new Date();
        this.totalAmount = totalAmount;
        this.user = user;
        this.clothings = clothings;
        this.furniture = furniture;
        this.mams = mams;
        this.toys = toys;
    }*/

    public List<Clothing> getClothings() {
        System.out.println("!!!" +
                "!!!!" +
                "!!!!" +
                "!!!");
        return clothings;
    }

    public void setClothings(List<Clothing> clothings) {
        this.clothings = clothings;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    public List<Mams> getMams() {
        return mams;
    }

    public void setMams(List<Mams> mams) {
        this.mams = mams;
    }

    public List<Toys> getToys() {
        return toys;
    }

    public void setToys(List<Toys> toys) {
        this.toys = toys;
    }

    public Orders(String shippingAddress, int totalAmount) {
        this.shippingAddress = shippingAddress;
        this.date = new Date();
        this.totalAmount = totalAmount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", date=" + date +
                ", totalAmount=" + totalAmount +
                ", user=" + user +
                ", clothings=" + clothings +
                ", furniture=" + furniture +
                ", mams=" + mams +
                ", toys=" + toys +
                '}';
    }
}
