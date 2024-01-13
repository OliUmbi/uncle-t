package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.Overflow;
import ch.oliumbi.compass.ui.style.Radius;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import java.util.List;

public class CateringPicture extends Picture {

  public CateringPicture() {
    super("Catering", 1600, 1600, new PictureSource("/static/jpg/dsgf", MimeType.JPEG));
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Radius("0.5rem"),
        new Overflow("hidden")
    );
  }
}
