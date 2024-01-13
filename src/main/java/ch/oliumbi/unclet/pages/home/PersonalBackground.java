package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.Elevation;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import java.util.List;

public class PersonalBackground extends Picture {

  public PersonalBackground() {
    super("Home", 1600, 1600, new PictureSource("/static/jpg/ikzy", MimeType.JPEG));
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Position("absolute"),
        new Elevation("1"),
        new Width("100%"),
        new Height("100%")
    );
  }
}
