
public class Nasa {
    public int numberOfDays(int distanceInFeet, double topSpeed) {

        double distacePerDay = topSpeed* 5;
        System.out.println(distanceInFeet / distacePerDay );
        Nasa isIt = new Nasa();
        boolean isTrue = isIt.isInt(distanceInFeet / distacePerDay);
        int days;
                if(isTrue){
                     days = (int) Math.round(distanceInFeet / distacePerDay );
                }else{
                     days = (int) Math.round(distanceInFeet / distacePerDay + 0.5 );
                }

        return days;
    }

    public boolean isInt( double a){
         int x = (int) a;
         return  x-a == 0;
    }


    public static void main( String[] args){
        Nasa test = new Nasa();

        int result= test.numberOfDays(5 , 1);
        System.out.println(result);
    }
}
