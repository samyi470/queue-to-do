public class QueueToDoTest {
    public static void main(String[] args) {
        System.out.println("starting id: 0, line length: 1");
        System.out.println("xor: " + QueueToDo.solution(0, 1));

        System.out.println("starting id: 1, line length: 1");
        System.out.println("xor: " + QueueToDo.solution(1, 1));

        System.out.println("starting id: 0, line length: 3");
        System.out.println("xor: " + QueueToDo.solution(0, 3));

        System.out.println("starting id: 17, line length: 4");
        System.out.println("xor: " + QueueToDo.solution(17, 4));
    }
}
