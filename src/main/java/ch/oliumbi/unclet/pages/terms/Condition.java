package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextAlign;
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
      components.add(new P(condition));
    }

    return components;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new TextAlign("center"),
        new Flex("column", "nowrap", "flex-start", "center", "1rem")
    );
  }


  @Override
  protected List<Style> xs() {
    return List.of(
        new TextAlign("left"),
        new Flex("column", "nowrap", "flex-start", "flex-start", "1rem")
    );
  }
}
