package ch.oliumbi.unclet.components.navigation;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.script.Custom;
import ch.oliumbi.compass.ui.script.Script;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Elevation;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Right;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Top;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.unclet.Global;
import java.util.List;

public class Drawer extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Control(false),
        new MainGroup(),
        new SubGroup()
    );
  }

  @Override
  protected List<Script> scripts() {
    return List.of(
        new Custom("navigation", """
            if (component.style.right === "") {
              component.style.right = "0%";
            } else {
              component.style.right = "";
            }
            """)
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Position("fixed"),
        new Elevation("10"),
        new Top("0"),
        new Right("-100%"),
        new Width("40rem"),
        new Height("100%"),
        new Background(Global.white()),
        new Padding("4rem"),
        new Flex("column", "nowrap", "space-between", "flex-end", "0")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Width("36rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Width("32rem"),
        new Padding("3rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Width("100%"),
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
