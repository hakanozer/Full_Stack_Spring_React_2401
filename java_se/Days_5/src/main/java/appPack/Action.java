package appPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Action {

    public String[] soru4( String[] arr ) {
        String[] arrNew = new String[arr.length];
        int x = 0;
        for( int i = arr.length -1; i >= 0; i-- ) {
            String item = arr[i];
            // arrNew[ (arr.length -1) - i  ] = item;
            arrNew[ x ] = item;
            x++;
        }
        return arrNew;
    }


    public void soru_5( String[] arr ) {
        List<String> ls = Arrays.asList(arr);
        Collections.sort(ls);
        System.out.println(ls);
    }

    public boolean soru_7( String[] arr, String data ) {
        for (String item : arr) {
            if(item.equals(data)) {
                return true;
            }
        }
        return false;
    }

    // { "Salı", "Pazartesi", "Çarşamba", "Perşembe", "Cuma", "Pazartesi"};
    public void soru_9( String[] arr ) {

        /*lbl: for (int i = 0; i < arr.length; i++) {
            String item = arr[i];
            for (int j = 0; j < arr.length; j++) {
                String subitem = arr[j];
                if (subitem.equals(item) && i != j) {
                    System.out.println("Tekrarlanıyor: " + item);
                    break lbl;
                }
            }
        }
         */

       for (int i = 0; i < arr.length; i++) {
            String item = arr[i];
            for (int j = 0; j < arr.length; j++) {
                String subitem = arr[j];
                if (subitem.equals(item) && i != j) {
                    System.out.println("Tekrarlanıyor: " + item + " - index : " + i);
                }
            }

        }

    }


}
