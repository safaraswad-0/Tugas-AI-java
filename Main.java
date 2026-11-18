public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b == 0) {
            System.out.println("Error: Tidak boleh dibagi nol");
            return;
        }

        int hasil = a / b;
        System.out.println("Hasil: " + hasil);
    }
}
