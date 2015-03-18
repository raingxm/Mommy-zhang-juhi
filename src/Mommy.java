public class Mommy {
    private final String vowels = "aeiou";

    public String translate(String input) {
        String output = "";
        if (isMoreVowelsCharThanThrityPercentage(input)) {
            for (int i = 0; i < input.length(); i++) {
                if (isVowel(input.charAt(i))) {
                    if (!isContinuous(i, input))
                        output += "mommy";
                } else output += input.charAt(i);
            }
            return output;
        }
        return input;
    }

    public boolean isVowel(char ch) {
        return vowels.indexOf(ch) != -1;
    }

    public boolean isContinuous(int index, String input) {
        return index > 0 && isVowel(input.charAt(index)) && isVowel(input.charAt(index - 1));
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

    public boolean isMoreVowelsCharThanThrityPercentage(String input) {
        System.out.printf("sum"+numOfVowelsInInput(input) / input.length());
        return numOfVowelsInInput(input) / input.length() > 0.3;
    }
}
