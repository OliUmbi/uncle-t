package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.button.Button;
import ch.oliumbi.unclet.components.link.Link;
import ch.oliumbi.unclet.components.typography.H2;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class CoursesBody extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new H2("Kurse"),
        new Link(
            "/kurse",
            false,
            new Button("Mehr erfahren", true)
        )
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "flex-start", "2rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "flex-start", "1rem")
    );
  }
}
