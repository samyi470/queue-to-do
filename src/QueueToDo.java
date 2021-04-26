public class QueueToDo {
    public static int solution(int start, int length) {
        int xor = 0;
        int skip = length;

        //loop until all IDs are skipped
        while (skip > 0) {
            //loop for length of line
            for (int i = 0; i < length; i++) {
                //checksum IDs before skip index
                if (i < skip) {
                    xor ^= start;
                }

                //increment id for each position of line
                start++;
            }
            //decrement skip index
            skip--;
        }

        return xor;
    }
}
