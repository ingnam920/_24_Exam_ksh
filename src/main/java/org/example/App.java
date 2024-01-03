package org.example;

import org.example3.WiseSayingController;

import java.util.Scanner;

public class App {
  Scanner sc = new Scanner(System.in);
  public void run() {

    WiseSayingController wiseSayingController = new WiseSayingController();

    while (true) {
      System.out.println("== 명언앱실행 ==");
      String cmd = sc.nextLine();
      String Rqcmd = Rq.Rqrun1(cmd);
      int Rqindex = Rq.Rqrun2(cmd);

      if (Rqcmd.equals("등록")) {
        wiseSayingController.등록();
      }
      else if (Rqcmd.equals("목록")) {
        wiseSayingController.목록();
      }
      else if (Rqcmd.equals("수정")) {
        wiseSayingController.수정(Rqindex);
      }
      else if (Rqcmd.equals("상세보기")) {
        wiseSayingController.상세보기(Rqindex);
      }
      else if (Rqcmd.equals("삭제")) {
        wiseSayingController.삭제(Rqindex);
      }


    }

  }
}
