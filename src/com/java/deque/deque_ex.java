package deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class deque_ex {
    public static void main(String[] args) throws Exception{
        Deque<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i<cnt;i++){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("push_back")){
                int num = Integer.parseInt(cmd[1]);
                deque.addLast(num);
            }else if(cmd[0].equals("push_front")){
                int num = Integer.parseInt(cmd[1]);
                deque.addFirst(num);
            }else if(cmd[0].equals("pop_front")){
                System.out.println(deque.isEmpty()?-1:deque.pop());
            }else if(cmd[0].equals("pop_back")){
                System.out.println(deque.isEmpty()?-1:deque.removeLast());
            }else if(cmd[0].equals("size")){
                System.out.println(deque.size());
            }else if(cmd[0].equals("empty")){
                System.out.println(deque.isEmpty()?1:0);
            }else if(cmd[0].equals("front")){
                System.out.println(deque.isEmpty()?-1:deque.peek());
            }else if(cmd[0].equals("back")){
                System.out.println(deque.isEmpty()?-1:deque.peekLast());
            }


        }
    }
}
