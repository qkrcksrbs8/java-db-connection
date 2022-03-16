package cg.park.algorithm.baekjoon.parenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 괄호 9012
// https://www.acmicpc.net/problem/9012
public class _9012 {

    public static void toChar(char[] chars) {
        Stack<Character> stack = new Stack<>();
        for(char x : chars) {
            if (stack.empty() && x == ')') {
                System.out.println("NO");
                return;
            }
            if (x == '(') stack.push('(');
            if (x == ')') stack.pop();
        }
        if (!stack.empty()) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String parenthesis = br.readLine();
            toChar(parenthesis.toCharArray());
        }
    }
}
