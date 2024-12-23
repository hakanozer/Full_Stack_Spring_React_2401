package appPack;

public class Odev5 {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D", "E", "F"};
        Action action = new Action();
        arr1 = action.soru4(arr1);
        for(String item : arr1) {
            System.out.println(item);
        }

        String[] arr2 = {"Ali", "Emre", "Kemal", "Zehra", "Ayşe"};
        action.soru_5(arr2);

        String datas = "Bugün günlerden çok javalı";
        StringBuilder builder = new StringBuilder(datas);
        String newData = builder.reverse().toString();
        System.out.println(newData);

        System.out.println("===========================");
        String[] days = { "Salı", "Pazartesi", "Cuma", "Çarşamba", "Perşembe", "Cuma", "Pazartesi"};
        action.soru_9(days);

    }
}
