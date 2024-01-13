package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Margin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.WidthMax;
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
  protected List<Style> xl() {
    return List.of(
        new WidthMax(Global.xl()),
        new Margin("auto"),
        new Padding("6rem"),
        new Grid("2fr 1fr", "auto", "start", "center", "2rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Padding("5rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Padding("4rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Padding("3rem"),
        new Grid("1fr", "auto", "center", "start", "1rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("2rem")
    );
  }
}
