package ch.oliumbi.unclet.pages.courses;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import java.util.List;

@Autoload
public class Courses extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Kurse")
        )
    );
  }

  @Override
  public String path() {
    return "/kurse";
  }

  @Override
  protected String title() {
    return "Uncle-T - Kurse";
  }

  @Override
  protected String description() {
    return "Uncle-T Kurse";
  }
}
