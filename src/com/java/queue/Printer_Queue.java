package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Printer_Queue {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트케이스
        LinkedList<Integer> q = new LinkedList<Integer>(); //프린트 물을 넣을 큐
        StringBuilder build = new StringBuilder();

        for(int n = 0; n<T; n++){
            String[] input = br.readLine().split(" ");
            String[] priority = br.readLine().split(" "); //프린트 물 우선 순위
            int N = Integer.parseInt(input[0]); //문서의 수
            int M = Integer.parseInt(input[1]); //알고싶은 프린트 물의 위치
            int cnt = 0;
            q.clear();
            for(int i = 0; i<N; i++)
                q.add(Integer.parseInt(priority[i])); //우선순위를 큐에 넣음
            while(!q.isEmpty()){
                boolean isPriority = true; //우선순위 값을 true 넣음

                for(int i = 1; i<q.size();i++){
                    if(q.peek() <q.get(i)){ //앞에가 우선순위가 더 높지 않으면
                        isPriority = false;
                        break;
                    }
                }
                if(isPriority){ //우선순위가 높으면
                    cnt++; //카운트를 증가 시키고
                    q.poll(); //값을 빼기

                    if(M==0) //내가 찾고자하는 값이라면
                        break;
                    else //아니라면 (값이 하나가 사라졌으니)
                        M -=1;
                }
                else{
                    int temp = q.poll(); //우선순위가 아닌 값을 빼서
                    q.add(temp); //뒤에 다시 넣음
                    M=(M==0)?q.size()-1:--M; //알고자하는 값의 인덱스가 0이면 size-1, 0이 아니면 --M
                }
            }
            build.append(cnt).append("\n");
        }
        System.out.println(build);
    }
}
