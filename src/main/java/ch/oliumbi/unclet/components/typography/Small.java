package ch.oliumbi.unclet.components.typography;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextFamily;
import ch.oliumbi.compass.ui.style.TextHeight;
import ch.oliumbi.compass.ui.style.TextSize;
import ch.oliumbi.compass.ui.style.TextWeight;
import java.util.List;

public class Small extends Component {

  private final String value;

  public Small(String value) {
    this.value = value;
  }

  @Override
  protected String tag() {
    return "small";
  }

  @Override
  protected String value() {
    return value;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new TextFamily("\"geist\", sans-serif"),
        new TextWeight("300"),
        new TextSize("0.875rem"),
        new TextHeight("1.3125rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new TextSize("0.8125rem"),
        new TextHeight("1.21875rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new TextSize("0.75rem"),
        new TextHeight("1.125rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new TextSize("0.6875rem"),
        new TextHeight("1.03125rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new TextSize("0.625rem"),
        new TextHeight("0.9375rem")
    );
  }
}
