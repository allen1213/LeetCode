package com.example.simple;

public class AvailableCapturesForRook {

    public static void main(String[] args) {
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };

        System.out.println(numRookCaptures(board));

    }

    /**题解
     *
     *
     *
     * @param board
     * @return
     */
    public static int numRookCaptures(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return cap(board,i,j,0,1) +
                            cap(board,i,j,0,-1) +
                            cap(board,i,j,1,0) +
                            cap(board,i,j,-1,0);
                }
            }
        }

        return 0;
    }

    private static int cap(char[][] board, int i, int j, int x, int y) {

        while (i >= 0  && i < board.length && j >= 0 && j < board[i].length && board[i][j] != 'B') {
            if (board[i][j] == 'p') {
                return 1;
            }
            i += x;
            j += y;
        }

        return 0;
    }

}
/**
 *
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 *
 * 返回车能够在一次移动中捕获到的卒的数量。
 *
 * 提示：
 *
 * board.length == board[i].length == 8
 * board[i][j] 可以是 'R'，'.'，'B' 或 'p'
 * 只有一个格子上存在 board[i][j] == 'R'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/available-captures-for-rook
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
