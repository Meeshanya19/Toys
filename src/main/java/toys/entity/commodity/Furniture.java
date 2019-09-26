package toys.entity.commodity;

import toys.entity.Country;
import toys.entity.Enum.Material;
import toys.entity.Enum.Sex;
import toys.entity.Orders;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class Furniture extends Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Enumerated(EnumType.STRING)
    private Material material;

    @ManyToMany
    @JoinTable(name = "orders_furniture",
            joinColumns = @JoinColumn(name = "furniture_id "),
            inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private List<Orders> orders;


    public Furniture() {
    }

    public Furniture(int price, String name, String description, Country country,
                     String brand, int age, Sex sex, Material material) {
        super(price, name, description, country, brand);
        this.age = age;
        this.sex = sex;
        this.material = material;
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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                ", material=" + material +
                '}';
    }
}
