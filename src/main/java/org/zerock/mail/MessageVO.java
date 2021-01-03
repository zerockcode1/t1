package org.zerock.mail;


public class MessageVO {
	
	private String toEmail;
	
	private String title;
	
	private String content;

	public MessageVO(String toEmail, String title, String content) {
		super();
		this.toEmail = toEmail;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "MessageVO [toEmail=" + toEmail + ", title=" + title + ", content=" + content + "]";
	}

	public String getToEmail() {
		return toEmail;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
	
}
