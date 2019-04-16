public class Main{
  public static void main(String[] args){
    System.out.println("Pluralize tests");

    int dogCount = 1;
    System.out.println("I have " + dogCount + pluralize(" dog", dogCount) +".");

    int catCount = 3;
    System.out.println("I have " + catCount + pluralize(" cat", catCount) +".");

    int turtleCount = 0;
    System.out.println("I have " + turtleCount + pluralize(" turtle", turtleCount) +".");

    System.out.println("\n\nCoin Flip Tests");
  
    System.out.println("\nTest 1: 2 heads in a row");
    flipNHeads(2);

    System.out.println("\nTest 1: 4 heads in a row");
    flipNHeads(4);


  }

  public static String pluralize(String word, int count){
    return (word + ((count > 1 || count == 0) ? "s" : ""));
  }

  public static void flipNHeads(int targetHeads){
    int flips = 0;
    int flippedHeads = 0;
    while(flippedHeads < targetHeads){
      long result = Math.round(Math.random());

      if(result == 1){
        flippedHeads++;
      }
      if(result == 0){
        flippedHeads = 0;
      }
      flips++;
      System.out.println((result == 1) ? "heads" : "tails");
    }
    System.out.println("It took " + flips + " flips to flip " + targetHeads + " heads in a row.");
  }
}