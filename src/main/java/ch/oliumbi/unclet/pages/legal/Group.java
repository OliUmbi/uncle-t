package ch.oliumbi.unclet.pages.legal;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class Group extends Component {

  private final List<Component> components;

  public Group(Component... components) {
    this.components = List.of(components);
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return components;
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .flex("column", "nowrap", "flex-start", "flex-start", "4rem"));
  }
}
