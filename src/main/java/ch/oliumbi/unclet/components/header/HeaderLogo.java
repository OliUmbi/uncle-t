package ch.oliumbi.unclet.components.header;

import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.unclet.components.image.Image;
import java.util.List;

public class HeaderLogo extends Image {

  public HeaderLogo() {
    super("/static/svg/logo.svg", "Logo Uncle-T", 1483, 512);
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Width("auto"),
        new Height("4rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Height("3rem")
    );
  }
}
