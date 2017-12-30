package com.load.entity;

/**
 * 
 * 项目名称：loadMore 
 * 类名称：Reply 
 * 类描述： 回复类
 * 创建人：edwarder 
 * 创建时间：2017年7月18日 下午9:19:46
 * 
 */
public class Reply {
	private Integer id;

	private String name;

	private String title;

	private String content;

	
	public Reply() {
		super();
	}

	public Reply(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", name=" + name + ", title=" + title + ", content=" + content + "]";
	}

}
