package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.typography.Small;
import java.util.ArrayList;
import java.util.List;

public class FooterGroup extends Component {

  private final String title;
  private final List<Component> body;

  public FooterGroup(String title, Component... body) {
    this.title = title;
    this.body = List.of(body);
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    List<Component> components = new ArrayList<>();

    components.add(new Small(title));
    components.addAll(body);

    return components;
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .flex("column", "nowrap", "flex-start", "flex-start", "0.5rem"));
  }
}
