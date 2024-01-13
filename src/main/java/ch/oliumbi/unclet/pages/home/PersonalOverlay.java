package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Elevation;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import java.util.List;

public class PersonalOverlay extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new PersonalBody()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Position("absolute"),
        new Elevation("2"),
        new Width("100%"),
        new Height("100%"),
        new Background("#00000080")
    );
  }
}
