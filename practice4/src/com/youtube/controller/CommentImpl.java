package com.youtube.controller;

import com.youtube.model.Comment;

public interface CommentImpl {
	
	public void addCommment(String id, String password, Comment comment);
	public Comment viewComment(int index);
	public void updateComment(int index, Comment comment);
	public void deleteComment(int index);
}