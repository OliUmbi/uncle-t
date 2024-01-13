package ch.oliumbi.unclet.pages.legal;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.mail.EMail;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class Address extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new P("Verantwortlich für den Inhalt der Seiten"),
        new P("Uncle-T GmbH"),
        new P("Thomas Habegger"),
        new P("Zelgliweg 2"),
        new P("5506 Mägenwil"),
        new EMail("info@uncle-t.ch")
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .flex("column", "nowrap", "flex-start", "flex-start", "0.5rem"));
  }
}
