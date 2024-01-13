package ch.oliumbi.unclet;

import ch.oliumbi.unclet.components.image.Image;

public class Icons {

  public static Image menu() {
    return new Image("/static/svg/menu.svg", "menu", 32, 32);
  }

  public static Image close() {
    return new Image("/static/svg/close.svg", "menu", 32, 32);
  }
}
