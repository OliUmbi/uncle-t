package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class FooterLink extends Component {

  private final String name;
  private final String url;

  public FooterLink(String name, String url) {
    this.name = name;
    this.url = url;
  }

  @Override
  protected String tag() {
    return "a";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new P(name)
    );
  }

  @Override
  protected List<Attribute> attributes() {
    return List.of(
        new Attribute("href", url)
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .padding("0.25rem 1rem")
            .fontColor(Global.black())
            .fontDecoration("none"))
        .hover(new Style()
            .background(Global.white()));
  }
}
