package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import java.util.List;

public class Personal extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new PersonalBackground(),
        new PersonalOverlay()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Position("relative"),
        new Width("100%"),
        new Height("80rem")
    );
  }
}
