import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

// -----------    SCOTTISH ISLANDS   ---------------//
        List<String> scottishIslands = new ArrayList<>();

        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");


//     1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//    2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//    3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//    4. Print out the index position of "Skye"
        int skyePosition = scottishIslands.indexOf("Skye");
        System.out.println("Index position of Skye: " + skyePosition);

//    5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//    6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//    7. Print the number of islands in your arraylist
        int totalIslandsInList = scottishIslands.size();
        System.out.println("Number of Islands in List: " + totalIslandsInList);

//    8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//    9. Print out all the islands using a for loop

        System.out.println("Names of All the Islands: ");

        for ( int i = 0; i < scottishIslands.size(); i++){
            System.out.println(scottishIslands.get(i));
        }



// ---------------      NUMBERS     ----------------------//

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//     1. Print out a list of the even integers

        System.out.println("Even Numbers: ");
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

//     2. Print the difference between the largest and smallest value

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
            System.out.println(max - min);

//     3. Print True if the list contains a 1 next to a 1 somewhere.

        for (int i = 0; i < numbers.size()-1; i++){
            if (numbers.get(i) == numbers.get(i+1)){
                System.out.println("True");
            }
        }

//     4. Print the sum of the numbers,
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println("Sum of Numbers: " + sum);

//     5. Print the sum of the numbers...
//        ...except the number 13 is unlucky, so it does not count...
        int sum1 = 0;
        int Position13 = numbers.indexOf(13);
        for (int number : numbers){
            if (number == numbers.get(Position13)){
                continue;
            }
            sum1 += number;
        }
        System.out.println("Sum without 13: " + sum1);

//        ...and numbers that come immediately after a 13 also do not count.
        int sum2 = 0;
        for (int number : numbers){
            if (number == numbers.get(Position13)){
                break;
            }
            sum2 += number;
        }
        System.out.println("Sum of Number after 13: " + sum2);

//      So [2, 7, 13, 2] would have sum of 9.

        List<Integer> lastArray = new ArrayList<>();

        lastArray.add(2);
        lastArray.add(7);
        lastArray.add(13);
        lastArray.add(2);


        int sum3 =0;
        for (int i = 0; i < lastArray.size()-1; i++){
            if (lastArray.get(i) + lastArray.get(i+1) == 9){
                sum3 = 9;
            };

        }

        System.out.println("The array has a sum of: " + sum3);




    }

}
