package ch.oliumbi.unclet.components.link;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import java.util.List;

public class Link extends Component {

  private final String url;
  private final boolean newTab;
  private final List<Component> components;

  public Link(String url, boolean newTab, Component... components) {
    this.url = url;
    this.newTab = newTab;
    this.components = List.of(components);
  }

  @Override
  protected String tag() {
    return "a";
  }

  @Override
  protected List<Component> components() {
    return components;
  }

  @Override
  protected List<Attribute> attributes() {
    return List.of(
        new Attribute("href", url),
        new Attribute("target", newTab ? "_blank" : "_self"),
        new Attribute("rel", "noreferrer")
    );
  }
}
