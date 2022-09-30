public class DieTest {

    public static void main(String[] args) {

        Die testdie = new Die();
        for(int count = 1; count < 1000; count++){
            testdie.roll();

            if(testdie.roll() < 1 || testdie.roll() > 6){
                System.out.println("Fejl");
                break;
            }

        }

    }

}
