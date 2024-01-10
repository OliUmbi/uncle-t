package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class Personal extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Background(),
        new Overlay()
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .position("relative")
            .width("100%")
            .height("100dvh"));
  }
}
