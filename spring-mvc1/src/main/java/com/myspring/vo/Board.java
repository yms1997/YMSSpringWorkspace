package com.myspring.vo;

import lombok.Data;

@Data
public class Board {
	private int idx;
	private String title;
	private String content;
	private String writer;
	private String indate;
	private int count;
}
