public class LeapYear {
    public boolean isLeap(int year) {
        if(year%400==0)
        {
            return true;
        }        // your code here
        if(year%4 == 0 && year%100 !=0){
            return  true;
        }
        return false;
    }
}
