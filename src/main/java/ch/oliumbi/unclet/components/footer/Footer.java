package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Margin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.WidthMax;
import ch.oliumbi.unclet.Global;
import java.util.List;

public class Footer extends Component {

  @Override
  protected String tag() {
    return "footer";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new FooterLink("Impressum", "/impressum"),
        new FooterLink("Datenschutz", "/datenschutz"),
        new FooterIcon(),
        new FooterLink("Kontakt", "/kontakt"),
        new FooterLink("Geschäftsbedingungen", "/geschaeftsbedingung")
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new WidthMax(Global.xl()),
        new Margin("auto"),
        new Padding("6rem"),
        new Grid("2fr 2fr 1fr 2fr 2fr", "auto", "center", "center", "2rem")
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
        new Padding("4rem"),
        new Grid("1fr", "auto", "center", "center", "1rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Padding("3rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("2rem")
    );
  }
}
