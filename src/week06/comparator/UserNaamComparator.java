package week06.comparator;

import week06.User;

import java.util.Comparator;

public class UserNaamComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getNaam().compareTo(o2.getNaam());
    }
}
