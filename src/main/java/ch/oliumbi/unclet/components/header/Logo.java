package ch.oliumbi.unclet.components.header;

import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.image.Img;

public class Logo extends Img {

  public Logo() {
    super("/static/svg/logo.svg", "Logo Uncle-T", 1483, 512);
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .width("auto")
            .height("4rem"));
  }
}
