package cg.park.algorithm.baekjoon.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1158 {

    static int member = 0;
    static int count = 0;
    public static ArrayList<Integer> toArr() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < member+1; i++) arr.add(i);
        return arr;
    }

    public static void toJosephus(ArrayList<Integer> arr) {
        int index = count;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!arr.isEmpty()) {
            sb.append(arr.get(index-1)).append(",");
            arr.remove(index-1);
            index += count;
            if (index > member) index = index - member;
            --member;
        }
        sb.append(">");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
        member = Integer.parseInt(tk.nextToken());
        count = Integer.parseInt(tk.nextToken());
        toJosephus(toArr());
    }
}
