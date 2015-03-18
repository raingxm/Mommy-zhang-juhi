public class Mommy {
    private final String vowels = "aeiou";

    public String translate(String input) {
        if(!isVowelsCharMoreThan30Percentage(input)) return input;

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += replace(input, i);
        }
        return output;
    }

    public boolean isVowel(char ch) {
        return vowels.indexOf(ch) != -1;
    }

    public boolean isNextCharVowel(String input, int index) {
        return (index + 1 < input.length()) && isVowel(input.charAt(index + 1));
    }

    public String replace(String input, int index) {
        if(isVowel(input.charAt(index))) {
            if(!isNextCharVowel(input, index))
                return "mommy";
            return "";
        }
        return input.charAt(index) + "";
    }

    public int numOfVowelsInInput(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isVowelsCharMoreThan30Percentage(String input) {
        return ((double)numOfVowelsInInput(input) / input.length()) >= 0.3;
    }
}
