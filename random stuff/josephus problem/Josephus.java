public class Josephus {
  public static void main(String[] args) {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);

    // initialize the queue
    Queue<Integer> q = new Queue<Integer>();
    for (int i = 0; i < N; i++)
      q.enqueue(i);

    while (!q.isEmpty()) {
      for (int i = 0; i < M-1; i++)
        q.enqueue(q.dequeue());
      StdOut.print(q.dequeue() + " ");
    } 
    StdOut.println();
  }
}