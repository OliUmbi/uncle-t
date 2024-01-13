package ch.oliumbi.unclet.components.header;

import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.image.Image;

public class HeaderLogo extends Image {

  public HeaderLogo() {
    super("/static/svg/logo.svg", "Logo Uncle-T", 1483, 512);
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .width("auto")
            .height("4rem"));
  }

  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .height("3rem"));
  }
}
