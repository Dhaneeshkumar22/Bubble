import java.util.*;

class asses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String v = s.nextLine();

        char d[] = v.toCharArray(); // convert string to character array
        int n = d.length;

        char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};

        int left = 0;
        int right = n - 1;

        // loop from both ends
        while (left < right) {
            boolean leftVowel = false;
            boolean rightVowel = false;

            // check if left character is vowel
            for (int i = 0; i < vowels.length; i++) {
                if (d[left] == vowels[i]) {
                    leftVowel = true;
                    break;
                }
            }

            // check if right character is vowel
            for (int i = 0; i < vowels.length; i++) {
                if (d[right] == vowels[i]) {
                    rightVowel = true;
                    break;
                }
            }

            // if both are vowels, swap them
            if (leftVowel && rightVowel) {
                char temp = d[left];
                d[left] = d[right];
                d[right] = temp;
                left++;
                right--;
            }
            // if left is not vowel, move right side
            else if (!leftVowel) {
                left++;
            }
            // if right is not vowel, move left side
            else if (!rightVowel) {
                right--;
            }
        }

        // print the final result
        System.out.println("After swapping vowels:");
        System.out.println(new String(d));

        s.close();
    }
}
