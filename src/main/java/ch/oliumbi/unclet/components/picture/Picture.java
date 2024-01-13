package ch.oliumbi.unclet.components.picture;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.unclet.components.image.ImageFallback;
import java.util.ArrayList;
import java.util.List;

public class Picture extends Component {

  private final String description;
  private final Integer width;
  private final Integer height;
  private final List<PictureSource> pictureSources;

  public Picture(String description, Integer width, Integer height, PictureSource... pictureSources) {
    this.description = description;
    this.width = width;
    this.height = height;
    this.pictureSources = List.of(pictureSources);
  }

  @Override
  protected String tag() {
    return "picture";
  }

  @Override
  protected List<Component> components() {
    List<Component> components = new ArrayList<>();
    components.addAll(pictureSources);

    PictureSource fallback = pictureSources.getFirst();
    components.add(new ImageFallback(
        STR."\{fallback.getPath()}-xl\{fallback.getType().extension()}",
        description,
        width,
        height));

    return components;
  }
}
