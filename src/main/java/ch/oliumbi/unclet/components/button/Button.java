package ch.oliumbi.unclet.components.button;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Border;
import ch.oliumbi.compass.ui.style.Outline;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Radius;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class Button extends Component {

  private final String value;
  private final boolean primary;

  public Button(String value, boolean primary) {
    this.value = value;
    this.primary = primary;
  }

  @Override
  public String tag() {
    return "button";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new P(value)
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Background(primary ? Global.primary() : Global.accent()),
        new TextColor(primary ? Global.white() : Global.black()),
        new Border("none"),
        new Padding("1rem 3rem"),
        new Radius("0.2rem")
    );
  }

  @Override
  protected List<Style> xlHover() {
    return List.of(
        new Background(primary ? Global.primaryDark() : Global.accentDark())
    );
  }

  @Override
  protected List<Style> xlAction() {
    return List.of(
        new Background(primary ? Global.primaryLight() : Global.accentLight())
    );
  }

  @Override
  protected List<Style> xlFocus() {
    return List.of(
        Global.outline()
    );
  }

  @Override
  protected List<Style> xlError() {
    return List.of(
        Global.error()
    );
  }
}
