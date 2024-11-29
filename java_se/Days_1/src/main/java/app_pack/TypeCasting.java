package app_pack;

public class TypeCasting {

    public static void main(String[] args) {

        // Tür Dönüşümü - Type Casting
        String stringN1 = "40";
        int intN1 = Integer.parseInt(stringN1);
        System.out.println( intN1 * 5 );

        String stringStatus = "true";
        boolean boolStatus = Boolean.parseBoolean(stringStatus);

        String stringDouble = "3.14";
        double doubleDouble = Double.parseDouble(stringDouble);
        System.out.println( doubleDouble + 6.66 );

        String stDouble = ""+intN1;

    }

}
