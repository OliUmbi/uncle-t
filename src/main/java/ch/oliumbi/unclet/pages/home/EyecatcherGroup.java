package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.typography.H1;
import ch.oliumbi.unclet.components.typography.H3;
import ch.oliumbi.unclet.components.typography.H4;
import ch.oliumbi.unclet.components.typography.P;
import ch.oliumbi.unclet.components.typography.Small;
import java.util.List;

public class EyecatcherGroup extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Small("Thomas Habegger"),
        new H1("Uncle-T"),
        new P("Ich bin Thomas und es freut mich sehr, dass Sie den Weg zu meiner kulinarischen Welt gefunden haben. Erlaube mir, Ihnen einen kurzen Einblick in meine Passion als Privatkoch und Catering-Experte zu geben.")
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "flex-start", "1rem")
    );
  }
}
