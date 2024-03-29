package ch.oliumbi.unclet;

import ch.oliumbi.compass.ui.style.Outline;
import ch.oliumbi.compass.ui.style.Style;

public class Global {

  public static String whiteLight() {
    return "#FFFFFF";
  }

  public static String white() {
    return "#E6E6E6";
  }

  public static String whiteDark() {
    return "#CCCCCC";
  }

  public static String blackLight() {
    return "#4D4D4D";
  }

  public static String black() {
    return "#262626";
  }

  public static String blackDark() {
    return "#000000";
  }

  public static String primaryLight() {
    return "#52637A";
  }

  public static String primary() {
    return "#3D4A5C";
  }

  public static String primaryDark() {
    return "#29313D";
  }

  public static String accentLight() {
    return "#F0E142";
  }

  public static String accent() {
    return "#ECDA13";
  }

  public static String accentDark() {
    return "#BDAE0F";
  }

  public static Style outline() {
    return new Outline(STR."0.125rem solid \{black()}");
  }

  public static Style error() {
    return new Outline(STR."0.125rem solid \{accent()}");
  }

  public static String xl() {
    return "100rem";
  }

  public static String l() {
    return "80rem";
  }

  public static String m() {
    return "60rem";
  }

  public static String s() {
    return "40rem";
  }

  public static String xs() {
    return "20rem";
  }
}
