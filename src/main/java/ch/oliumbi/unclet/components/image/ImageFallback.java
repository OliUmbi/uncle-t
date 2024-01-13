package ch.oliumbi.unclet.components.image;

import ch.oliumbi.compass.ui.style.Fit;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import java.util.List;

public class ImageFallback extends Image {

  public ImageFallback(String url, String description, Integer width, Integer height) {
    super(url, description, width, height);
  }


  @Override
  protected List<Style> xl() {
    return List.of(
        new Width("100%"),
        new Height("100%"),
        new Fit("cover")
    );
  }
}
