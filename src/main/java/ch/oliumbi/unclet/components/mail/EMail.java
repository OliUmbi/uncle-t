package ch.oliumbi.unclet.components.mail;

import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Theme;
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
  protected State xl() {
    return new State()
        .normal(new Style()
            .display("inline-block")
            .padding("1rem 2rem")
            .background(Theme.primary())
            .fontColor(Theme.whiteLight())
            .fontWeight("600")
            .fontDecoration("none"))
        .hover(new Style()
            .background(Theme.primaryLight()))
        .action(new Style()
            .background(Theme.primaryDark()))
        .focus(new Style()
            .background(Theme.outline()));
  }
}
