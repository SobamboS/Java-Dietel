package Chapter7.Example;

public class StudentPoll {
    public static void main ( String[] args ) {

        int [] responses = {1, 2,2,3,3,4,4,5,5,5};
        int [] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf(" responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");

         // output each array element's value
         for (int rating = 1; rating < frequency.length; rating++) {
             System.out.printf ( "%6d%10d%n", rating, frequency[rating] );
         }
    }
}
