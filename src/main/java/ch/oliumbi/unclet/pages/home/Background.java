package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.image.Picture;
import java.util.List;

public class Background extends Picture {

  public Background() {
    super(new Image("/static/jpg/ikzy", MimeType.JPEG, "Home", 1600, 1600));
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .position("absolute")
            .elevation("1")
            .width("100%")
            .height("100%"));
  }
}
