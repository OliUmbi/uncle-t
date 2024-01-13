package ch.oliumbi.unclet.components.navigation;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.Width;
import java.util.List;

public class SubGroup extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new SubLink("Kontakt", "/kontakt"),
        new SubLink("Geschäftsbedingung", "/geschaeftsbedingung"),
        new SubLink("Datenschutz", "/datenschutz"),
        new SubLink("Impressum", "/impressum")
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Width("100%")
    );
  }
}
