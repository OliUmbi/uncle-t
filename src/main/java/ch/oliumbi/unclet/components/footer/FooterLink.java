package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextAlign;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.compass.ui.style.TextDecoration;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.compass.ui.style.WidthMax;
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
  protected List<Style> xl() {
    return List.of(
        new Width("100%"),
        new Padding("0.5rem 1rem"),
        new TextAlign("center")
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
}
