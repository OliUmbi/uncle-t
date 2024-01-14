package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.Elevation;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Overflow;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Radius;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import java.util.ArrayList;
import java.util.List;

public class PersonalBackground extends Picture {

  public PersonalBackground() {
    super("Home", 1600, 1600, new PictureSource("/static/jpg/ikzy", MimeType.JPEG));
  }

  @Override
  protected List<Style> xl() {
    List<Style> styles = new ArrayList<>(super.xl());
    styles.add(new Position("absolute"));
    styles.add(new Elevation("1"));
    styles.add(new Width("100%"));
    styles.add(new Height("100%"));

    return styles;
  }
}
