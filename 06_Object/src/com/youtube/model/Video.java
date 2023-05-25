package com.youtube.model;

import java.util.Date;

public class Video {

	private String title;
	private String comment;
	private Date uploadAt;
	private int count; // views
	private String imgUrl;
	private String filUrl;

	/*
	 * Create : 추가 Read : 읽기 (1개, 목록) Update : 수정 Delete : 삭제
	 * */
	
	public Video Upload() {// 영상 업로드
		return null;
	}

	public Video[] videoList() {// 영상 목록
		return null;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", filUrl=" + filUrl + "]";
	}

	public Video(String title, String comment, Date uploadAt, int count, String imgUrl, String filUrl) {
		super();
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
		this.filUrl = filUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFilUrl() {
		return filUrl;
	}

	public void setFilUrl(String filUrl) {
		this.filUrl = filUrl;
	}

	public Video viewVideo() {// 영상 1개 보기
		return null;
	}

	public Video updateVideo() {// 동영상 수정
		return null;
	}

	public boolean videoDelete() {// 동영상 삭제
        return false;
	}
	// 영상 업로드
	// 영상 목록
	// 영상 1개 보기
	// 동영상 수정0
	// 동영상 삭제

}
