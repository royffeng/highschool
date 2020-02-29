public class Gameboard{
	public char[][] board = new char[8][8];
	public Gameboard(boolean setup){
		if(setup){
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < board[i].length; j++){
					if(((i + j) % 2) == 0){
						board[i][j] = '-';
					}else{
						board[i][j] = 'r';
					}
				}
			}
			for(int i = 3; i < 5; i++){
				for(int j = 0; j < board[i].length; j++){
					board[i][j] = '-';
				}
			}
			for(int i = 5; i < 8; i++){
				for(int j = 0; j < board[i].length; j++){
					if(((i + j) % 2) == 0){
						board[i][j] = '-';
					}else{
						board[i][j] = 'w';
					}
				}
			}
		}else{
			for(int i = 0; i < board.length; i++){
				for(int j = 0; j < board[i].length; j++){
					board[i][j] = '-';
				}
			}
		}
	}
	public String toString(){
		String toPrint = "";
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				toPrint += (board[i][j] + " ");
			}
			toPrint += "\n";
		}
		return(toPrint);
	}
	public boolean move(int x, int y, boolean left){
		boolean moved = false;
		if(board[x][y] == 'r'){
			if((y + 2) < 8 && (x + 2) < 8 && board[x + 2][y + 2] == '-' && board[x + 1][y + 1] == 'w'){
				this.jump(x, y);
				moved = true;
			}else if((y - 2) >= 0 && (x + 2) < 8 && board[x + 2][y - 2] == '-' && board[x + 1][y - 1] == 'w'){
				this.jump(x, y);
				moved = true;
			}else if(left && (y + 1) < 8 && (x + 1) < 8 && board[x + 1][y + 1] == '-'){
				board[x + 1][y + 1] = 'r';
				board[x][y] = '-';
				moved = true;
			}else if(!left && (y - 1) >= 0 && (x + 1) < 8 && board[x + 1][y - 1] == '-'){
				board[x + 1][y - 1] = 'r';
				board[x][y] = '-';
				moved = true;
			}
		}else if(board[x][y] == 'w'){
			if((y - 2) >= 0 && (x - 2) >= 0 && board[x - 2][y - 2] == '-' && board[x - 1][y - 1] == 'r'){
				this.jump(x, y);
				moved = true;
			}else if((y + 2) < 8 && (x - 2) >= 0 && board[x - 2][y + 2] == '-' && board[x - 1][y + 1] == 'r'){
				this.jump(x, y);
				moved = true;
			}else if(left && (y - 1) >= 0 && (x - 1) >= 0 && board[x - 1][y - 1] == '-'){
				board[x - 1][y - 1] = 'w';
				board[x][y] = '-';
				moved = true;
			}else if(!left && (y + 1) < 8 && (x - 1) >= 0 && board[x - 1][y + 1] == '-'){
				board[x - 1][y + 1] = 'w';
				board[x][y] = '-';
				moved = true;
			}
		}
		return(moved);
	}
	public boolean jump(int x, int y){
		boolean jumped = false;
		if(board[x][y] == 'r' && (y + 2) <= 7 && (x + 2) <= 7 && board[x + 2][y + 2] == '-' && board[x + 1][y + 1] == 'w'){
			board[x + 1][y + 1] = '-';
			board[x + 2][y + 2] = 'r';
			board[x][y] = '-';
			this.jump(x + 2, y + 2);
			jumped = true;
		}else if(board[x][y] == 'r' && (y - 2) >= 0 && (x + 2) < 8 && board[x + 2][y - 2] == '-' && board[x + 1][y - 1] == 'w'){
			board[x + 1][y - 1] = '-';
			board[x + 2][y - 2] = 'r';
			board[x][y] = '-';
			this.jump(x + 2, y - 2);
			jumped = true;
		}else if(board[x][y] == 'w' && (y - 2) >= 0 && (x - 2) >= 0 && board[x - 2][y - 2] == '-' && board[x - 1][y - 1] == 'r'){
			board[x - 1][y - 1] = '-';
			board[x - 2][y - 2] = 'w';
			board[x][y] = '-';
			this.jump(x - 2, y - 2);
			jumped = true;
		}else if(board[x][y] == 'w' && (y + 2) < 8 && (x - 2) >= 0 && board[x - 2][y + 2] == '-' && board[x - 1][y + 1] == 'r'){
			board[x - 1][y + 1] = '-';
			board[x - 2][y + 2] = 'w';
			board[x][y] = '-';
			this.jump(x - 2,y + 2);
			jumped = true;
		}
		return(jumped);
	}
	public boolean kingMe(int x, int y){
		if(x >= 0 && x < 8 && y >= 0 && y < 8){
		    if(board[x][y] == 'w' && x == 0){
			    board[x][y] = 'W';
			    return true;
		    }else if(board[x][y] == 'r' && x == 7){
			    board[x][y] = 'R';
			    return true;
		    }else if(board[x][y] == '-'){
			    return false;
		    }
		}
		return false;
	}
}
