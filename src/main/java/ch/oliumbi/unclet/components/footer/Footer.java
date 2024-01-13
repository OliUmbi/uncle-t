package ch.oliumbi.unclet.components.footer;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
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
  protected State xl() {
    return new State()
        .normal(new Style()
            .widthMax(Global.xl())
            .margin("auto")
            .padding("6rem")
            .grid("1fr 1fr 1fr 1fr", "auto", "start", "start", "2rem"));
  }
}
