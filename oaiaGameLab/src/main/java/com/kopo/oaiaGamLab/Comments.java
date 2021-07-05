package com.kopo.oaiaGamLab;

public class Comments {
	int idx;
	String comments;
	String user_nickname;
	String created;
	int board_idx;
	
	Comments(){
		
	}
	
	Comments(String user_nickname, String comments, String created, int board_idx){
		this.user_nickname = user_nickname;
		this.comments = comments;
		this.created = created;
		this.board_idx = board_idx;
	}
	
	Comments(int idx, String user_nickname, String comments, String created, int board_idx){
		this.idx = idx;
		this.user_nickname = user_nickname;
		this.comments = comments;
		this.created = created;
		this.board_idx = board_idx;
	}
	
}
