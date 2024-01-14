package ch.oliumbi.unclet.components.picture;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.style.Display;
import ch.oliumbi.compass.ui.style.Overflow;
import ch.oliumbi.compass.ui.style.Radius;
import ch.oliumbi.compass.ui.style.Style;
import java.util.ArrayList;
import java.util.List;

public class PictureStyled extends Picture {

  public PictureStyled(String description, Integer width, Integer height, PictureSource... pictureSources) {
    super(description, width, height, pictureSources);
  }

  @Override
  protected List<Style> xl() {
    List<Style> styles = new ArrayList<>(super.xl());
    styles.add(new Display("inline-block"));
    styles.add(new Radius("0.5rem"));
    styles.add(new Overflow("hidden"));

    return styles;
  }
}
