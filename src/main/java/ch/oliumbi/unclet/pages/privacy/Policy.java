package ch.oliumbi.unclet.pages.privacy;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.typography.H4;
import ch.oliumbi.unclet.components.typography.P;
import java.util.ArrayList;
import java.util.List;

public class Policy extends Component {

  private final String title;
  private final List<String> policies;

  public Policy(String title, String... policies) {
    this.title = title;
    this.policies = List.of(policies);
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    List<Component> components = new ArrayList<>();

    components.add(new H4(title));
    for (String policy : policies) {
      components.add(new P(policy));
    }

    return components;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Padding("4rem 0"),
        new Flex("column", "nowrap", "flex-start", "flex-start", "2rem")
    );
  }
}
