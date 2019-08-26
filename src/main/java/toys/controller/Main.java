package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import toys.entity.Enum.Sex;
import toys.entity.Enum.Size;
import toys.service.CountriService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michail on 8/9/2019.
 */
public class Main {
    public static void main(String[] args) {



        List<Size> sizeList=new ArrayList<Size>(Arrays.asList(Size.values()));
        System.out.println(sizeList);
        System.out.println(Sex.BABY);
        Sex sex=Sex.BABY;
        Sex sex2=Sex.BOY;
        String name=sex.name();
        System.out.println(sex.name());
        System.out.println(sex2.name());

        System.out.println("------------------------------");
        System.out.println(sex.name());


    }
}
