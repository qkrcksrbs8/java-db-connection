package cg.park.algorithm.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/10828
public class _10828 {
    static Stack<Integer> stack = new Stack<>();


    public static void toStack(String command) {
        if (command.startsWith("push")) {
            stack.push(Integer.parseInt(command.split(" ")[1]));
            return;
        }
        if ("pop".equals(command)) {
            System.out.println(stack.empty()? -1 : stack.pop());
            return;
        }
        if ("size".equals(command)) {
            System.out.println(stack.size());
            return;
        }
        if ("empty".equals(command)) {
            System.out.println(stack.empty()? 1 : 0);
            return;
        }
        if ("top".equals(command)) {
            System.out.println(stack.empty()? -1 : stack.peek());
            return;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) toStack(br.readLine());
    }
}
