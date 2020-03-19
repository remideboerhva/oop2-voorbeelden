package week06.comparator;

import week06.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLauncher {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(21, "Marie"));
        list.add(new User(8, "Jaap"));
        list.add(new User(5, "Annet"));
        list.add(new User(3, "Zack"));
        list.add(new User(13, "Janet"));

        Collections.sort(list, new UserIdComparator());

        System.out.println(list);

        Collections.sort(list, new UserNaamComparator());

        System.out.println(list);

    }
}
