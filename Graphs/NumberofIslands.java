package Graphs;

public class NumberofIslands {
    private static final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;

    }

    private void dfs(char[][] grid, int x, int y) {
        int m = grid.length, n = grid[0].length;

        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';

        for (int[] dir : DIRECTIONS) {
            dfs(grid, x + dir[0], y + dir[1]);
        }
    }

}

// Leetcode question link:
// https://leetcode.com/problems/number-of-islands/
