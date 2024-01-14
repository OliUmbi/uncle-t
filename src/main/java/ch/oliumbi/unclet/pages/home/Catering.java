package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.picture.PictureSource;
import ch.oliumbi.unclet.components.picture.PictureStyled;
import java.util.List;

public class Catering extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new PictureStyled("Catering", 1600, 1600, new PictureSource("/static/jpg/dsgf", MimeType.JPEG)),
        new CateringBody()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Grid("3fr 2fr", "auto", "start", "center", "6rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Grid("1fr 1fr", "auto", "start", "center", "4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Grid("1fr", "auto", "start", "start", "2rem")
    );
  }
}
