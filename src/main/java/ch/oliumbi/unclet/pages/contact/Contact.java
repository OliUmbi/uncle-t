package ch.oliumbi.unclet.pages.contact;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import java.util.List;

@Autoload
public class Contact extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Kontakt"),
            new ch.oliumbi.unclet.components.contact.Contact()
        )
    );
  }

  @Override
  public String path() {
    return "/kontakt";
  }

  @Override
  protected String title() {
    return "Uncle-T - Kontakt";
  }

  @Override
  protected String description() {
    return "Uncle-T Kontakt";
  }
}
