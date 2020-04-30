/*
 * import java.util.Scanner;
 * 
 * public class 아기상어 { static int[][] map; static int sharkX ; static int sharkY
 * ; static int level= 2; static int experience = 0; static int distance; static
 * int targetX; static int targetY; public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in); int n = scan.nextInt(); map = new
 * int[n][n]; for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {
 * map[i][j] = scan.nextInt(); if(map[i][j] == 9) { sharkX = i; sharkY = j; } }
 * }
 * 
 * find();
 * 
 * 
 * 
 * 
 * } private static void find() { // TODO Auto-generated method stub int fish =
 * 0 ; int time = 0 ; // 물고기 타겟 정하기 for(int i = map.length-1; i>=0; i++ ) {
 * for(int j=map.length-1; j>=0; j++) {
 * 
 * if(check(sharkX,sharkY,i,j)) {
 * 
 * }
 * 
 * } }
 * 
 * // 물고기 먹기 for(int i = map.length-1; i>=0; i++ ) { for(int j=map.length-1;
 * j>=0; j++) { if(map[i][j] != 0 && movePromise(i, j)) { fish ++; } } }
 * 
 * //if(movePromise(level, experience,i, j)) {
 * 
 * //} } private static void check(int tmpsharkX,int tmpsharkY,int i, int j) {
 * // TODO Auto-generated method stub if(tmpsharkX == i && tmpsharkY== j) {
 * break; }
 * 
 * 
 * if(tmpsharkX < i &&movePromise(tmpsharkX+1, j)) { check(i+1, j); } else
 * if(movePromise(i, j+1)) {
 * 
 * }
 * 
 * return false; } private static boolean movePromise(int i, int j) { // TODO
 * Auto-generated method stub if(map[i][j] < level) { experience++;
 * if(experience == level) { level++; experience=0; } return true; } else
 * if(map[i][j] == level) { return true; }
 * 
 * return false; } }
 */