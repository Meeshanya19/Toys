package toys.entity.commodity;

import toys.entity.Country;
import toys.entity.Enum.Sex;
import toys.entity.Orders;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class Mams extends Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToMany
    @JoinTable(name ="orders_mams",
            joinColumns = @JoinColumn(name="mams_id"),
            inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private List<Orders> orders;



    public Mams() {
    }

    public Mams(int price, String name, String description, Country country, String brand, Sex sex) {
        super(price, name, description, country, brand);
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mams{" +
                "id=" + id +
                ", sex=" + sex +
                '}';
    }
}
