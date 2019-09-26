package toys.entity.commodity;

import org.springframework.stereotype.Component;
import toys.entity.Country;
import toys.entity.Enum.Sex;
import toys.entity.Enum.Size;
import toys.entity.Orders;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class Clothing extends Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Enumerated(EnumType.STRING)
    private Size size;

    @ManyToMany
    @JoinTable(name ="orders_clothing",
    joinColumns = @JoinColumn(name="clothing_id"),
    inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private List<Orders> orders;



    public Clothing() {
    }

    public Clothing(int price, String name, String description, Country country, String brand,
                    int age, Sex sex, Size size) {
        super(price, name, description, country, brand);
        this.age = age;
        this.sex = sex;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                ", size=" + size +
                '}'+
                super.toString();
    }
}
