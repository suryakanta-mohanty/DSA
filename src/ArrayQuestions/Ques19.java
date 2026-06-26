/*
     You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates
     the birth and death years of the ith person.

    The population of some year x is the number of people alive during that year.
    The ith person is counted in year x's population if x is in the inclusive
    range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

    Return the earliest year with the maximum population.

    Example 1:

    Input: logs = [[1993,1999],[2000,2010]]
    Output: 1993
    Explanation: The maximum population is 1, and 1993 is the earliest year with this
    population.
*/

package ArrayQuestions;

class Solution19{
    public int maximumPopulation(int[][] logs){
        int maxPopulation = 0;
        int ansYear = 1950;
        for(int year= 1950 ; year <= 2050 ; year++){
            int population = 0;

            for(int[] person : logs){
                if(year >= person[0] && year < person[1]){
                    population++;
                }

                if(population > maxPopulation){
                    maxPopulation = population;
                    ansYear = year;
                }
            }
        }
        return ansYear;
    }
}

public class Ques19 {
    public static void main(String[] a){
        Solution19 obj = new Solution19();
        int[][] logs = {{1950,1961}, {1960,1971}, {1970,1981}};
        System.out.println(obj.maximumPopulation(logs));
    }
}
