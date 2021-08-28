public class Ticket {
    public double calculate(double limit, double actualSpeed) {
        // your code here

        double fine=0;

        double diffrence = actualSpeed - limit;

        if(diffrence > 5 && diffrence<= 20){
            fine = 25;
        } else if(diffrence> 20 && diffrence<= 30){
            fine = 50;
        }else if(diffrence > 30){
            fine = 100;
        }

        return fine;
    }
}

