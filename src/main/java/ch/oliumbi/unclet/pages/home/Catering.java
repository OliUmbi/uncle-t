package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.image.Image;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class Catering extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new CateringPicture(),
        new CateringBody()
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .grid("3fr 2fr", "auto", "start", "center", "6rem"));
  }

  @Override
  protected State l() {
    return new State()
        .normal(new Style()
            .grid("1fr 1fr", "auto", "start", "center", "4rem"));
  }

  @Override
  protected State m() {
    return new State()
        .normal(new Style()
            .grid("1fr", "auto", "start", "start", "2rem"));
  }
}
