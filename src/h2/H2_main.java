package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 12;
        int j = 32;
        int k = 676;
        int max;
        int min;
        min = Math.min(i, j );
        min = Math.min(min, k);
        max = Math.max(i, j );
        max = Math.max(max, k);
        System.out.print("min: ");
        System.out.println(min);
        System.out.print("max: ");
        System.out.println(max);
    }
}



