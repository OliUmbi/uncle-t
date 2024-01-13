package ch.oliumbi.unclet.components.typography;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextFamily;
import ch.oliumbi.compass.ui.style.TextHeight;
import ch.oliumbi.compass.ui.style.TextSize;
import ch.oliumbi.compass.ui.style.TextWeight;
import java.util.List;

public class P extends Component {

  private final String value;

  public P(String value) {
    this.value = value;
  }

  @Override
  protected String tag() {
    return "p";
  }

  @Override
  protected String value() {
    return value;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new TextFamily("\"geist\", sans-serif"),
        new TextWeight("400"),
        new TextSize("1.125rem"),
        new TextHeight("1.6875rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new TextSize("1.0625rem"),
        new TextHeight("1.59375rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new TextSize("1rem"),
        new TextHeight("1.5rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new TextSize("0.9375rem"),
        new TextHeight("1.40625rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new TextSize("0.875rem"),
        new TextHeight("1.3125rem")
    );
  }
}
