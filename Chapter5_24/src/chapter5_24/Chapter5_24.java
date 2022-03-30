/*
Chapter 5 Programming excercise 24
Riky Hernandez
9/8/21
Description: A program that sums 1/3 to 97/99 go up by two
──────────────▐█████───────
──────▄▄████████████▄──────
────▄██▀▀────▐███▐████▄────
──▄██▀───────███▌▐██─▀██▄──
─▐██────────▐███─▐██───██▌─
─██▌────────███▌─▐██───▐██─
▐██────────▐███──▐██────██▌
██▌────────███▌──▐██────▐██
██▌───────▐███───▐██────▐██
██▌───────███▌──▄─▀█────▐██
██▌──────▐████████▄─────▐██
██▌──────█████████▀─────▐██
▐██─────▐██▌────▀─▄█────██▌
─██▌────███─────▄███───▐██─
─▐██▄──▐██▌───────────▄██▌─
──▀███─███─────────▄▄███▀──
──────▐██▌─▀█████████▀▀────
──────███──────────────────
*/
package chapter5_24;
public class Chapter5_24 {
public static void main(String[] args) {
    
         double sum = 0;   //value to hold the answer of the equation
 
  for (int i = 1; i <= 97; i += 2) {    //the equation to increase the series by 2
   sum += (i / (i + 2.0));
  }
                                                    //the sum of all equations
  System.out.println("Sum of the series is:" + sum);
    }
    
}
