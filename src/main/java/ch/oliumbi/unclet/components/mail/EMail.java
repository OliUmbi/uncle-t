package ch.oliumbi.unclet.components.mail;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Background;
import ch.oliumbi.compass.ui.style.Display;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.compass.ui.style.TextWeight;
import ch.oliumbi.unclet.Global;
import java.util.List;

public class EMail extends Component {

  private String email;

  public EMail(String email) {
    this.email = email;
  }

  @Override
  protected String tag() {
    return "a";
  }

  @Override
  protected String value() {
    return email;
  }

  @Override
  protected List<Attribute> attributes() {
    return List.of(
        new Attribute("href", STR."mailto:\{email}")
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Display("inline-block"),
        new Padding("1rem 2rem"),
        new Background(Global.primary()),
        new TextColor(Global.whiteLight()),
        new TextWeight("600")
    );
  }

  @Override
  protected List<Style> xlHover() {
    return List.of(
        new Background(Global.primaryLight())
    );
  }

  @Override
  protected List<Style> xlAction() {
    return List.of(
        new Background(Global.primaryDark())
    );
  }

  @Override
  protected List<Style> xlFocus() {
    return List.of(
        Global.outline()
    );
  }
}
