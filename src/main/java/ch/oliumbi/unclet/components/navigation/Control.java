package ch.oliumbi.unclet.components.navigation;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.script.Listener;
import ch.oliumbi.compass.ui.script.Script;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Border;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Icons;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.pages.legal.Element;
import java.util.List;

public class Control extends Component {

  private final boolean open;

  public Control(boolean open) {
    this.open = open;
  }

  @Override
  protected String tag() {
    return "button";
  }

  @Override
  protected List<Component> components() {

    if (open) {
      return List.of(Icons.menu());
    } else {
      return List.of(Icons.close());
    }
  }

  @Override
  protected List<Script> scripts() {
    return List.of(
        new Listener("click", """
            event("navigation")
            """)
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Padding("0.5rem"),
        new Border("none"),
        new Background(Global.white())
    );
  }

  @Override
  protected List<Style> xlHover() {
    return List.of(
        new Background(Global.whiteDark())
    );
  }

  @Override
  protected List<Style> xlAction() {
    return List.of(
        new Background(Global.primary())
    );
  }

  @Override
  protected List<Style> xlFocus() {
    return List.of(
        Global.outline()
    );
  }
}
