package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.button.Button;
import ch.oliumbi.unclet.components.link.Link;
import ch.oliumbi.unclet.components.typography.H2;
import ch.oliumbi.unclet.components.typography.P;
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
        new P("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse lacinia lectus quis porttitor auctor. Praesent sed mollis nibh. Ut sit amet suscipit nisi. Aliquam varius aliquam massa. Duis ultricies consequat ullamcorper. Nunc risus massa, tempor sed metus et, lacinia ornare turpis. Morbi imperdiet semper nibh sit amet aliquet. Ut in nulla non mauris facilisis efficitur. Vestibulum sed pulvinar ipsum."),
        new Link(
            "/privatkoch",
            false,
            new Button("Mehr erfahren", false)
        )
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .widthMax(Global.xl())
            .height("100%")
            .widthMax(Global.m())
            .margin("auto")
            .padding("4rem")
            .flex("column", "nowrap", "center", "flex-start", "1rem")
            .fontColor(Global.whiteLight()));
  }

  @Override
  protected State m() {
    return new State()
        .normal(new Style()
            .padding("3rem"));
  }

  @Override
  protected State s() {
    return new State()
        .normal(new Style()
            .padding("2rem"));
  }

  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .padding("1rem"));
  }
}
