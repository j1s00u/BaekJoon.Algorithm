package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Josephus01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<Integer>();

        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=n; i++){
                dq.add(i);
        }

        while(!dq.isEmpty()){
            for(int i = 0; i<m-1; i++){
                dq.addLast(dq.removeFirst());
            }
            sb.append(dq.removeFirst()+", ");
        }
        System.out.println(sb.toString().substring(0,sb.length()-2)+">");
    }
}
