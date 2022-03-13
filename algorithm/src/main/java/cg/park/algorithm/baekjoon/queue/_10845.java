package cg.park.algorithm.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 백준 큐 10845 문제
// https://www.acmicpc.net/problem/10845
public class _10845 {

    static Queue<Integer> queue = new LinkedList<>();
    public static void toQueue(String command) {
        if (command.startsWith("push")) {
            queue.offer(Integer.parseInt(command.split(" ")[1]));
            return;
        }
        if (command.startsWith("p")) {
            if (queue.isEmpty()) {
                System.out.println(-1);
                return;
            }
            System.out.println(queue.poll());
            return;
        }
        if (command.startsWith("s")) {
            System.out.println(queue.size());
            return;
        }
        if (command.startsWith("e")) {
            if (queue.isEmpty()) {
                System.out.println(1);
                return;
            }
            System.out.println(0);
            return;
        }
        if (command.startsWith("f")) {
            if (queue.isEmpty()) {
                System.out.println("-1");
                return;
            }
            System.out.println(queue.peek());
            return;
        }
        if (command.startsWith("b")) {
            if (queue.isEmpty()) {
                System.out.println("-1");
                return;
            }
            System.out.println(((LinkedList)queue).peekLast());
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) toQueue(br.readLine());
    }
}
