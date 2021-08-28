public class truncate {
  public  String verify(String original){
    int length = original.length();
    String result = original;
    if(length> 30){
        result = original.substring(0, 27) + "...";
    }
    return  result;
  }

  public static void main( String[] args){

      String x="For example, the String When all" +
              " mankind shall receive the same opportunity " +
              "of education and the equality of men and women be realized, " +
              "the foundations of war will be utterly destroyed. " +
              "is longer than 10 characters so we take the first 27" +
              " and add teh ellipsis to get When all mankind " +
              "shall rece.... But the String Equality has less" +
              " than 30 characters so the original sString will" +
              " be returned untouched.";

      truncate baybay = new truncate();

      String result1 = baybay.verify(x);
      String result2 = baybay.verify("marouane");

      System.out.println(result1);
      System.out.println(result1.length());
      System.out.println(result2);
  }

};
