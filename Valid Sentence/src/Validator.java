import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private boolean valid;
    private final Pattern numberRegex = Pattern.compile("\\d{1,2}");


    public boolean validateSentence(String sentence){
        valid = true;
        //Check string starts with capital
        if(!Character.isUpperCase(sentence.charAt(0)))
            valid = false;

        //Check string has even "" and only one .
        int quotationCount = 0;
        int periodCount = 0;
        for(char c : sentence.toCharArray()){
            if(c == '"'){
                quotationCount++;
            }
            else if(c == '.')
                periodCount++;
        }
        if(quotationCount % 2 != 0 || periodCount > 1)
            valid = false;

        //Check string ends with .
        if(sentence.charAt(sentence.length() -1) != '.')
            valid = false;

        //Check string has spelled out 1-12
        Matcher m = numberRegex.matcher(sentence);
        while(m.find()){
            String matched = m.group(0);
            int matchedInt = Integer.parseInt(matched);
            if(matchedInt > 0 && matchedInt < 13)
                valid = false;
        }
        return valid;
    }
}
