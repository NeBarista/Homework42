public class Main {
    public static void main(String[] args) {
        int[] newArray = adg(new int[] {1, 2, 3, 4, 5});
        for (int number : newArray) {
            System.out.println(number);
        }
    }
    public static int [] adg(int [] array) {
        int [] res = new int [array.length];
        for (int a = 0; a < res.length - 1; a++) {
            res[a] = array[a] + array[a + 1];
        }
        res[res.length - 1] = array[array.length - 1];
        return res;
    }
}