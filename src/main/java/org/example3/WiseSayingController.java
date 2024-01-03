package org.example3;
import org.example.Rq;
import org.example2.WiseSaying;

import java.util.*;
import java.util.Scanner;
public class WiseSayingController {
  private List<WiseSaying> ws;
  int id=1;
  Scanner sc = new Scanner(System.in);

  public WiseSayingController() {
    ws = new ArrayList<WiseSaying>();
  }


  public void 등록() {
    System.out.print("등록");
    System.out.print("이름을 입력하세요");
    String name = sc.nextLine();
    System.out.println("작가를 입력하세요");
    String auther = sc.nextLine();
    ws.add(new WiseSaying(id,name,auther));
    id++;

  }

  public void 목록() {
  }

  public void 수정(int index) {
    Iterator<WiseSaying> e = ws.listIterator();
    WiseSaying wiseSaying = null;
    int indexValue=인덱스밸류값찾기(index);
    System.out.print("수정할 내용");
    String str1=sc.nextLine();
    System.out.println("수정할 작가");
    String str2=sc.nextLine();

    ws.get(indexValue).setContent(str1);
    ws.get(indexValue).setAuthor(str2);
    System.out.println("수정된 내용"+ws.get(indexValue).getContent());
    System.out.println("수정된 작가"+ws.get(indexValue).getAuthor());
  }

  public int 인덱스밸류값찾기(int index) {
    Iterator<WiseSaying> e = ws.listIterator();
    WiseSaying wiseSaying = null;
    int indexValue=0;
    while(e.hasNext()){
      wiseSaying=e.next();
      if(wiseSaying.getId()==index){
        break;
      }
      indexValue++;
    }
    return indexValue;
  }

  public void 상세보기(int index) {
  }

  public void 삭제(int index) {

  }
}
