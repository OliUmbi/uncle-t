package ch.oliumbi.unclet.pages.legal;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.typography.H3;
import java.util.ArrayList;
import java.util.List;

public class Element extends Component {

  private final String title;
  private final List<Component> body;

  public Element(String title, Component... body) {
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
    components.add(new H3(title));
    components.addAll(body);

    return components;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "flex-start", "1rem")
    );
  }
}
