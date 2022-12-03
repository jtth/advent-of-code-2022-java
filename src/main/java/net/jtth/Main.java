package net.jtth;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    Day1 day1 = new Day1("src/main/resources/day1.dat");
    System.out.println("1-1\n " + day1.getBestSum());
    System.out.println("\n1-2 " + day1.getTop3SumsSummed());

    Day2 day21 = new Day2("src/main/resources/day2.dat", true);
    System.out.println("\n2-1 " + day21.getMyHighScore());
    Day2 day22 = new Day2("src/main/resources/day2.dat", false);
    System.out.println("\n2-2 " + day22.getMyHighScore());

    Day3 day3 = new Day3("src/main/resources/day3.dat");
    System.out.println("\n3-1 " + day3.printScore());
    System.out.println("\n3-2 " + day3.printGroupScore());
  }
}