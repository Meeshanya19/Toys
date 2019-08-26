package toys.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String shippindAddress;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders;


    public User() {
    }

    public User(String name, String pssword, String email, String shippindAddress) {
        super(name, pssword, email);
        this.shippindAddress = shippindAddress;
    }



    public String getShippindAddress() {
        return shippindAddress;
    }

    public void setShippindAddress(String shippindAddress) {
        this.shippindAddress = shippindAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        String s= super.toString();
        return   "id=" + id +"  "+s+
                ", shippindAddress='" + shippindAddress + '\'' +
                '}';
    }
}
