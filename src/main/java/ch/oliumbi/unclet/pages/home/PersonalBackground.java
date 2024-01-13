package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;

public class PersonalBackground extends Picture {

  public PersonalBackground() {
    super("Home", 1600, 1600, new PictureSource("/static/jpg/ikzy", MimeType.JPEG));
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
