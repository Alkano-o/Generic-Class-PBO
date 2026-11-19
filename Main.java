public class Main {
    public static void main(String[] args) {
        // Pengujian Cell dengan tipe Integer
        Cell<Integer> intCell = new Cell<>();
        intCell.setValue(100);
        System.out.println("=== Pengujian Cell<Integer> ===");
        System.out.println("Nilai     : " + intCell.getValue());
        intCell.displayType();

        System.out.println();

        // Pengujian Cell dengan tipe String
        Cell<String> stringCell = new Cell<>();
        stringCell.setValue("Pemrograman Berorientasi Objek");
        System.out.println("=== Pengujian Cell<String> ===");
        System.out.println("Nilai     : " + stringCell.getValue());
        stringCell.displayType();
    }
}