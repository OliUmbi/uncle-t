package ch.oliumbi.unclet.components.button;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
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
  public State xl() {
    return new State()
        .normal(new Style()
            .background(primary ? Global.primary() : Global.accent())
            .fontColor(primary ? Global.white() : Global.black())
            .border("none")
            .padding("1rem 3rem")
            .radius("0.2rem"))
        .hover(new Style()
            .background(primary ? Global.primaryDark() : Global.accentDark()))
        .action(new Style()
            .background(primary ? Global.primaryLight() : Global.accentLight()))
        .focus(new Style()
            .outline(Global.outline()))
        .disabled(new Style()
            .opacity("0.5"))
        .error(new Style()
            .background(Global.error()));
  }
}
