package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.HeightMax;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.image.Image;
import java.util.ArrayList;
import java.util.List;

public class FooterIcon extends Image {

  public FooterIcon() {
    super("/static/svg/icon.svg", "Uncle-T icon", 448, 448);
  }

  @Override
  protected List<Style> xl() {
    List<Style> styles = new ArrayList<>(super.xl());
    styles.add(new Height("auto"));
    styles.add(new HeightMax("8rem"));

    return styles;
  }
}
