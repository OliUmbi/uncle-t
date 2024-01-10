package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Theme;
import ch.oliumbi.unclet.components.typography.P;
import java.util.ArrayList;
import java.util.List;

public class Condition extends Component {

  private final List<String> conditions;

  public Condition(List<String> conditions) {
    this.conditions = conditions;
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {

    List<Component> components = new ArrayList<>();

    for (String condition : conditions) {
      components.add(new P(condition, Theme.blackDark()));
    }

    return components;
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .flex("column", "nowrap", "flex-start", "center", "1rem")
            .fontAlign("center"));
  }

  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .flex("column", "nowrap", "flex-start", "flex-start", "1rem")
            .fontAlign("left"));
  }
}
