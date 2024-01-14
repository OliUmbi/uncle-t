package ch.oliumbi.unclet.pages.courses;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class CoursesGroup extends Component {

  private final List<Component> components;

  public CoursesGroup(Component... components) {
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
  protected List<Style> xl() {
    return List.of(
        new Height("100%"),
        new Flex("column", "nowrap", "flex-start", "flex-start", "2rem")
    );
  }
}
