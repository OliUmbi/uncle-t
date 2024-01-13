package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;

public class CoursesPicture extends Picture {

  public CoursesPicture() {
    super("Kurse", 1600, 1600, new PictureSource("/static/jpg/msdv", MimeType.JPEG));
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .radius("0.5rem")
            .overflow("hidden"));
  }
}
