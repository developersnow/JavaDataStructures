
public class floodFuill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = { { 0, 1, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1, 0 }, { 0, 1, 0, 0, 0, 0, 0 } };
		//floodfill(maze, 0, 0, "");

		floodfill1(maze, new boolean[maze.length][maze[0].length], 0, 0, "");
	}

	public static int counter = 0;

	// Proactive Approach
	public static void floodfill(int[][] maze, int sr, int sc, String psf) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(++counter + "." + psf);
			return;
		}
		if (sc - 1 >= 0 && maze[sr][sc - 1] == 0) {
			maze[sr][sc - 1] = 1;
			floodfill(maze, sr, sc - 1, psf + "L");
			maze[sr][sc - 1] = 0;
		}

		if (sr + 1 < maze.length && maze[sr + 1][sc] == 0) {
			maze[sr + 1][sc] = 1;
			floodfill(maze, sr + 1, sc, psf + "D");
			maze[sr + 1][sc] = 0;

		}
		if (sc + 1 < maze[0].length && maze[sr][sc + 1] == 0) {
			maze[sr][sc + 1] = 1;
			floodfill(maze, sr, sc + 1, psf + "R");
			maze[sr][sc + 1] = 0;
		}

		if (sr - 1 >= 0 && maze[sr - 1][sc] == 0) {
			maze[sr - 1][sc] = 1;
			floodfill(maze, sr - 1, sc, psf + "T");
			maze[sr - 1][sc] = 0;
		}

	}

	public static void floodfill1(int[][] maze, boolean[][] visited, int sr, int sc, String psf) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(++counter + "." + psf);
			return;
		}
		if (isthisinvalidspot(maze, visited, sr, sc, "")) {
			return;
		}
		visited[sr][sc] = true;
		floodfill1(maze, visited, sr, sc - 1, psf + "L");
		floodfill1(maze, visited, sr + 1, sc, psf + "D");
		floodfill1(maze, visited, sr, sc + 1, psf + "R");
		floodfill1(maze, visited, sr - 1, sc, psf + "T");
		visited[sr][sc]=false;
	}

	public static boolean isthisinvalidspot(int[][] maze, boolean[][] visited, int sr, int sc, String psf) {
		if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1
				|| visited[sr][sc] == true) {
			return true;
		} else {
			return false;
		}
	}

}
