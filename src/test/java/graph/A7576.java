package graph;

import javafx.util.Pair;
import org.junit.Test;

import java.util.*;

// https://www.acmicpc.net/problem/7576
public class A7576 {
    int M = 6;
    int N = 4;
    int[][] tomatos = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1},
    };
    int dx[] = {1, 0, -1, 0};
    int dy[] = {0, -1, 0, 1};
    boolean visited[][] = new boolean[N][M];

    static class Dot {
        private int x;
        private int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    boolean useDFS = true;

    @Test
    public void tomato() {
        Stack<Dot> stack = null;
        LinkedList<Dot> queue = null;
        if (useDFS)
            stack = new Stack<>();
        else
            queue = new LinkedList<>();
        //익은 토마토가 있는 모든 위치를 큐에 담는다.

        for (int i = 0; i < tomatos.length; i++) {
            for (int j = 0; j < tomatos[i].length; j++) {
                if (tomatos[i][j] == 1) {
                    if (useDFS)
                        stack.push(new Dot(i, j));
                    else
                        queue.add(new Dot(i, j));
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            Dot dot;
            if (useDFS)
                dot = stack.pop();
            else
                dot = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = dot.x + dx[i];
                int nextY = dot.y + dy[i];

                if ((nextX >= 0 && nextX < N) && (nextY >= 0 && nextY < M)) {
                    if (tomatos[nextX][nextY] == 0 && !visited[nextX][nextY]) {
                        if (useDFS)
                            stack.push(new Dot(nextX, nextY));
                        else
                            queue.add(new Dot(nextX, nextY));

                        visited[nextX][nextY] = true;
                        tomatos[nextX][nextY] = 1;
                    }
                }
            }
        }
    }
}
