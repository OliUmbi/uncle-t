package ch.oliumbi.unclet.components.navigation;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.H1;
import java.util.List;

public class MainLink extends Component {

  private final String name;
  private final String url;

  public MainLink(String name, String url) {
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
        new H1(name)
    );
  }

  @Override
  protected List<Attribute> attributes() {
    return List.of(
        new Attribute("href", url)
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Width("100%")
    );
  }

  @Override
  protected List<Style> xlHover() {
    return List.of(
        new TextColor(Global.primary())
    );
  }

  @Override
  protected List<Style> xlAction() {
    return List.of(
        new TextColor(Global.primaryDark())
    );
  }

  @Override
  protected List<Style> xlFocus() {
    return List.of(
        Global.outline()
    );
  }
}
