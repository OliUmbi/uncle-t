package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
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
  protected State xl() {
    return new State()
        .normal(new Style()
            .position("absolute")
            .elevation("2")
            .width("100%")
            .height("100%")
            .background("#00000080"));
  }
}
