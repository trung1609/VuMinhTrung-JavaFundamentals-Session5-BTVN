package Session5;

public class kha2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        long start, end;
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str1 += " World";
        }
        end = System.currentTimeMillis();
        System.out.printf("Thoi gian thuc hien voi String: %d ms\n", (end - start));

        long startSB, endSB;
        StringBuilder sb = new StringBuilder("Hello");
        startSB = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(" World");
        }
        endSB = System.currentTimeMillis();
        System.out.printf("Thoi gian thuc hien voi StringBuilder: %d ms\n", (endSB - startSB));

        long startSBF, endSBF;
        StringBuffer sbf = new StringBuffer("Hello");
        startSBF = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbf.append(" World");
        }
        endSBF = System.currentTimeMillis();
        System.out.printf("Thoi gian thuc hien voi StringBuffer: %d ms\n", (endSBF - startSBF));
    }
}
