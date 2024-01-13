package ch.oliumbi.unclet.components.footer;

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

public class Footer extends Component {

  @Override
  protected String tag() {
    return "footer";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Image("/static/svg/icon.svg", "Uncle-T icon", 448, 448),
        new FooterGroup("Bedingungen",
            new FooterLink("Kontakt", "/kontakt"),
            new FooterLink("Geschäftsbedingungen", "/geschaeftsbedingung"),
            new FooterLink("Datenschutz", "/datenschutz"),
            new FooterLink("Impressum", "/impressum")),
        new FooterGroup("Addresse",
            new P("Uncle-T GmbH"),
            new P("Thomas Habegger"),
            new P("Zelgliweg 2"),
            new P("5506 Mägenwil"))
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new WidthMax(Global.xl()),
        new Margin("auto"),
        new Padding("6rem"),
        new Grid("1fr 1fr 1fr 1fr", "auto", "start", "start", "2rem")
    );
  }
}
