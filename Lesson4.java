public class Lesson4 {
    public static void main(String[] args) {
        int [] seq = new int [10];

        for (int i = 0; i < seq.length; i++) { 
            seq[i] = new java.util.Random().nextInt(4);
        }

        for (int i = 0; i < seq.length; i++) {
            char [] base = {'A', 'T', 'G', 'C'};
            System.out.println(base[seq[i]] + "" );
        }
    }
}
