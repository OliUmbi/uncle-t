package ch.oliumbi.unclet.components.contact;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.components.split.Split;
import ch.oliumbi.unclet.components.typography.H3;
import ch.oliumbi.unclet.components.typography.P;
import ch.oliumbi.unclet.components.typography.Small;
import java.util.List;

public class Contact extends Component {

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new P("Wenn Sie eine Frage haben oder einen Termin vereinbaren möchten, kontaktieren Sie mich einfach."),
        new Split(
            new ContactEmail(),
            new ContactAddress()
        )
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Flex("column", "nowrap", "flex-start", "stretch", "4rem")
    );
  }
}
