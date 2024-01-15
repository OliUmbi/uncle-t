package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Elevation;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Height;
import ch.oliumbi.compass.ui.style.Margin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Position;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.compass.ui.style.Width;
import ch.oliumbi.compass.ui.style.WidthMax;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.button.Button;
import ch.oliumbi.unclet.components.link.Link;
import ch.oliumbi.unclet.components.typography.H2;
import ch.oliumbi.unclet.components.typography.P;
import java.nio.channels.FileLock;
import java.util.List;

public class PersonalBody extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new H2("Privatkoch"),
        new Link(
            "/privatkoch",
            false,
            new Button("Mehr erfahren", false)
        )
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new WidthMax(Global.m()),
        new Height("100%"),
        new Margin("auto"),
        new Padding("4rem"),
        new TextColor(Global.whiteLight()),
        new Flex("column", "nowrap", "center", "flex-start", "1rem")
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
