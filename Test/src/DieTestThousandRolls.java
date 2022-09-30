public class DieTestThousandRolls {
    public static void main(String[] args) {

        double x = 0, avg;

        Die testdie = new Die();
        for(int count = 1; count < 1000; count++){
            testdie.roll();
            x = x + testdie.roll();
        }

        avg = x/1000;
        System.out.println(avg);

    }

}
