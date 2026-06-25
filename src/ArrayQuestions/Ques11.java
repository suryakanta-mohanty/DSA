package ArrayQuestions;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution11{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int result = 0;
        // write code here

        /*  more ways

        int key = 0;
        if(ruleKey.equals("color")){
            key = 1;

        } else if (ruleKey.equals("name")) {
            key = 2;
        }

        */

        int key = ruleKey.equals("type")? 0 :
                ruleKey.equals("color")? 1 : 2;

        /*
        *   by switch case:

            switch(ruleKey){
                case "type":
                    key = 0;
                    break;

                case "color":
                    key = 1;
                    break;

                default: key = 2;
            }
        * */

        for(List<String> item : items){
            if(item.get(key).equals(ruleValue)) result ++;
        }


        return result;
    }
}

public class Ques11 {
    public static void main(String[] a){
        Solution11 obj = new Solution11();

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","phone"));
        items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(obj.countMatches(items, ruleKey, ruleValue));
    }
}
