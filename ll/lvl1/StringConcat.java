public class StringConcat {
    public static String concatStrings(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("A");
        }
        return sb.toString();
    }
}
