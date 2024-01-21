package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Margin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.WidthMax;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.image.Image;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import ch.oliumbi.unclet.components.picture.PictureStyled;
import ch.oliumbi.unclet.components.typography.P;
import ch.oliumbi.unclet.files.Jpg;
import java.util.List;

public class Eyecatcher extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new PictureStyled("Thomas Habegger, Uncle-T", 1600, 1600, new PictureSource("/static/jpg/cdke", MimeType.JPEG)),
        new EyecatcherGroup()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new WidthMax(Global.xl()),
        new Margin("auto"),
        new Padding("5rem"),
        new Grid("1fr 1fr", "auto", "start", "center", "4rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Padding("4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Padding("3rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Padding("2rem"),
        new Grid("1fr", "auto", "center", "start", "2rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("1rem")
    );
  }
}
