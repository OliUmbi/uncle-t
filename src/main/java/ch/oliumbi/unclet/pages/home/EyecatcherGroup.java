package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.typography.H4;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

public class EyecatcherGroup extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new H4("Herzlich Willkommen"),
        new P("Mein Name ist Thomas und ich freue mich, dass du den Weg zu meiner Seite gefunden hast. Lass mich einen kurzen Blick in meine kulinarische Reise mit dir teilen. ")
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "flex-start", "1rem")
    );
  }
}
