package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.image.Image;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class Eyecatcher extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Image("/static/svg/logo.svg", "Logo Uncle-T", 1483, 512),
        new P("Mein Name ist Thomas Habegger und ich arbeite seit 13 Jahren leidenschaftlich gerne als Koch. Die Kunden und deren Gäste mit meinen Kochkünsten zu verzaubern bereitet mir grosse Freude. ")
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .widthMax(Global.xl())
            .margin("auto")
            .padding("6rem")
            .grid("2fr 1fr", "auto", "start", "center", "2rem"));
  }

  @Override
  protected State l() {
    return new State()
        .normal(new Style()
            .padding("4rem"));
  }

  @Override
  protected State m() {
    return new State()
        .normal(new Style()
            .padding("4rem"));
  }

  @Override
  protected State s() {
    return new State()
        .normal(new Style()
            .padding("3rem")
            .grid("1fr", "auto", "center", "start", "1rem"));
  }


  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .padding("2rem"));
  }

}
