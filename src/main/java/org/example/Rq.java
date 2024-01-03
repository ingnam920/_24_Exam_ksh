package org.example;

public class Rq {

  public static String Rqrun1(String cmd) {
    String[] strcmd = cmd.split("\\?");
    return strcmd[0];
  }

  public static int Rqrun2(String cmd) {
    String[] strcmd = cmd.split("\\?");
    String[] strcmdbits = strcmd[1].split("\\=");
    return Integer.parseInt(strcmdbits[1]);
  }
}
