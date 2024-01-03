package org.example2;


public class WiseSaying {
  private int id;
  private String regDate;
  private String content;
  private String author;

  public WiseSaying(int id, String regDate, String content, String author) {
    this.id = id;
    this.regDate = regDate;
    this.content = content;
    this.author = author;
  }

  public WiseSaying(int id, String name, String auther) {
    this.id = id;
    this.content = content;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public String getRegDate() {
    return regDate;
  }

  public String getContent() {
    return content;
  }

  public String getAuthor() {
    return author;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
