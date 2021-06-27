package com.example.recursion;

public class Maze {

    private static void initMap(int[][] map) {
        for (int i = 0; i < map[0].length; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 1; i < map.length-1; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        printMap(map);
    }

    private static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 判断路是否可走
     * 小球先从 i，j 开始 往 上下左右四个方向走，若能走到某一个位置，说明路是可走的
     * 0表示没有走过，1表示墙，2表示，3表示已经走过但是不通
     */
    public static boolean isWay(int[][]map,int i,int j) {

        if (map[6][5] == 2) return true;
        //若路没有走过
        if (map[i][j] == 0) {
            //先假设i j 是可以走的
            map[i][j] = 2;
            if (isWay(map,i + 1,j)) { //向下走
                return true;
            } else if (isWay(map,i,j + 1)) { //向右走
                return true;
            } else if (isWay(map,i -  1,j)) { //向上走
                return true;
            } else if (isWay(map,i,j - 1)) { //向左走
                return true;
            } else {
                map[i][j] = 3;//此路不通
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] map = new int[8][7];
        initMap(map);
        printMap(map);
        isWay(map,1,1);
        System.out.println();
        printMap(map);
    }

}
