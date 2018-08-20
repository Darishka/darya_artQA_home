package first;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of HashMap");

        int size_hm=sc.nextInt();
        Map <Integer, String> map = new HashMap<>(size_hm);
        for (int i =0; i< size_hm;i++){
            System.out.println("Input key and value");
            map.put(sc.nextInt(),sc.next());
        }

      Set<Integer> keySet = map.keySet();
        for (Integer value :keySet){
if(map.get(value).contains("hello")){
    System.out.println(value+" ");
}

        }

    }
}