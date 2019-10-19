public class VariablesAndDataTypes{
  public static void main(String [] args) {
    String statement =  "The temperature in Baguio City has warmed throughout the years.";
    char determiner = 'A';
    float dawnTemp = 16;
    double noonTemp = 23.5;
    byte hours = 24;
    short days = 7;
    int weeks = 4;
    long months = 12;
    boolean yes = true;
    if(yes == true){
      System.out.print(statement + "\n\t" + 
              determiner + " recent news article stated that the City has been averaging " + dawnTemp + " degrees celsius at dawn and " + noonTemp + " at noon.\n" +
              "\t\tRegardless, lowlanders still feel cold " + hours + " hours a day, " + days + " days a week, " + weeks + " weeks per month and " + months + " months each year."); 
    }
    else {
       System.out.print("The boolean was changed to a False value");
    }
  }
}