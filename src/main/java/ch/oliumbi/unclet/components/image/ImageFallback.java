package ch.oliumbi.unclet.components.image;

import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;

public class ImageFallback extends Image {

  public ImageFallback(String url, String description, Integer width, Integer height) {
    super(url, description, width, height);
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .width("100%")
            .height("100%")
            .fit("cover"));
  }
}
