public class ElectricBill {
    public double calculate(int kwh) {
//        electricity consumed (kWh)	cost per kWh
//        first 100	5 cents
//        next 500	8 cents
//        above 600	10 cents
        double price =0;
        if(kwh <= 0){
            return 0;
        }
        if( kwh <= 100 ){
            System.out.println(kwh*0.05);
            price = kwh*0.05;
        }

        if(kwh <= 600 ){
            price = 100*0.05 + (kwh -100)*0.08;
        }
        if(kwh > 600){
            double rest = kwh - 600;
            price = 100*0.05 + 500*0.08 + rest*0.10;

        }

        return price;
    }

    public static void main( String[] args){
        ElectricBill test = new ElectricBill();
        double x = test.calculate(20);

        System.out.println(x);

    }
}