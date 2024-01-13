package ch.oliumbi.unclet.components.header;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.link.Link;
import ch.oliumbi.unclet.components.navigation.Navigation;
import java.util.List;

public class Header extends Component {

  @Override
  protected String tag() {
    return "header";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Link("/", false, new HeaderLogo()),
        new Navigation()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Padding("5rem"),
        new Flex("row", "nowrap", "space-between", "center", "0")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Padding("4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Padding("3rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Padding("2rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("1rem")
    );
  }
}
