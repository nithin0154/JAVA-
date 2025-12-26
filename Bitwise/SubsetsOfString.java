public class SubsetsOfString {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        int total = 1 << n; // 2^n

        for (int i = 0; i < total; i++) {
            StringBuilder subset = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.append(s.charAt(j));
                }
            }
            System.out.println(subset);
        }
    }
}
