package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.button.Button;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import ch.oliumbi.unclet.components.typography.H2;
import ch.oliumbi.unclet.components.typography.H3;
import ch.oliumbi.unclet.components.typography.H4;
import ch.oliumbi.unclet.components.typography.P;
import ch.oliumbi.unclet.components.typography.Small;
import java.util.List;

@Autoload
public class Home extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Eyecatcher(),
        new Personal(),
        new Section(
            new Catering()
        ),
        new Section(
            new Courses()
        )
    );
  }

  @Override
  public String path() {
    return "/";
  }

  @Override
  protected String title() {
    return "Uncle-T";
  }

  @Override
  protected String description() {
    return "Uncle-T Homepage";
  }
}
