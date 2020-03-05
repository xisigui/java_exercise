import java.util.HashMap;
public class board{
	public static void main(String []args){
		CreateBoard(3,3);
	}
	public static void CreateBoard(int x, int y){
		HashMap<Integer> val = new HashMap<Integer>();
		int [][] b = {{0,11,33},{3,21,55}};

		for(int i = 0;i<b.length;i++){
			int n = b[i];
			for(int j = 0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println(n);
		}

	}
}