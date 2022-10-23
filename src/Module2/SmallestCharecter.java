package Module2;

public class SmallestCharecter {

    public static void main(String[] args) {
        char[] letters = {'c','d','e','j'};
        char target  ='j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;


        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                 end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        // the next Greater Element and Smallest of that rnage is where start points when target is not found
        // this is Ceiling of Number

        return letters[start % letters.length];

    }

}
