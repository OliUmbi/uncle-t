package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.H2;
import java.util.List;

public class Body extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new H2("Privatkoch")
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .widthMax(Global.xl())
            .height("100%")
            .margin("auto")
            .padding("4rem")
            .flex("column", "nowrap", "center", "flex-start", "1rem")
            .fontColor(Global.whiteLight()));
  }
}
