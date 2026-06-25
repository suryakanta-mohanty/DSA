package ArrayQuestions;

class Solution10{
    public boolean checkIfPangram(String sentence){
        /*
        ```this is one me mine:```

        String engAlpha = "abcdefghijklmnopqrstuvwxyz";

        if(sentence.length() >= 26){
            for(int i = 0 ; i < 26 ; i++){
//                int count = 0;
                boolean found = false;
                for(int j = 0 ; j < sentence.length() ; j++){
                    if(engAlpha.charAt(i) == sentence.charAt(j)){
//                        count++;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return false;
                }

            }
            return true;

        }
        return false;

        */

        /*
        boolean[] seen = new boolean[26];
        for(int i = 0 ; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            seen[ch - 'a'] = true;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(seen[i] == false){
                return false;
            }
        }

        return true;

        */

        // Better than above
        boolean[] seen = new boolean[26];
        int unique = 0;

        for(char ch: sentence.toCharArray()){
            if(!seen[ch - 'a']){
                seen[ch - 'a'] = true;
                unique++;
            }
        }
        return unique == 26;
    }
}

public class Ques10 {
    public static void main(String[] args){
        Solution10 obj = new Solution10();
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        System.out.println(obj.checkIfPangram(sentence));
    }
}
