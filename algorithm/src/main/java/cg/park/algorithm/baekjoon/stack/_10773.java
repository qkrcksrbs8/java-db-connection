package cg.park.algorithm.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 제로 10773
// https://www.acmicpc.net/problem/10773
public class _10773 {

    static Stack<Integer> stack = new Stack<>();

    public static void toStack(String command) {
        if ("0".equals(command)) {
            stack.pop();
            return;
        }
        stack.push(Integer.parseInt(command));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) toStack(br.readLine());
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
