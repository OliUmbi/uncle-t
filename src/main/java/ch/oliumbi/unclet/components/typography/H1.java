package ch.oliumbi.unclet.components.typography;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextFamily;
import ch.oliumbi.compass.ui.style.TextHeight;
import ch.oliumbi.compass.ui.style.TextSize;
import ch.oliumbi.compass.ui.style.TextWeight;
import java.util.List;

public class H1 extends Component {

  private final String value;

  public H1(String value) {
    this.value = value;
  }

  @Override
  protected String tag() {
    return "h1";
  }

  @Override
  protected String value() {
    return value;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new TextFamily("\"geist\", sans-serif"),
        new TextWeight("800"),
        new TextSize("4.5rem"),
        new TextHeight("4.95rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new TextSize("4rem"),
        new TextHeight("4.4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new TextSize("3.5rem"),
        new TextHeight("3.85rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new TextSize("3rem"),
        new TextHeight("3.3rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new TextSize("2.5rem"),
        new TextHeight("2.75rem")
    );
  }
}
