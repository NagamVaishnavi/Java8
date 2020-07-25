import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stringa {


    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();
        list1.add("vac");
        list1.add("aab");
        list1.add("abc");
        list1.add("ache");
        list1.add("angel");
        list1=search(list1);
        for(String i:list1)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}