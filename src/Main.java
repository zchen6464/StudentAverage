public class Main {

    public static void main(String[] args) {

        int[] record = {0,1,2,3,4,5};
        int[] record2 = {1,3,2,5,4,0};
        StudentRecord one = new StudentRecord(record);
        StudentRecord two = new StudentRecord(record2);
        System.out.println(one.finalAverage());
        System.out.println(two.finalAverage());
    }
}
