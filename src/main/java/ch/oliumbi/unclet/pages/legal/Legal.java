package ch.oliumbi.unclet.pages.legal;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.mail.EMail;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H3;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

@Autoload
public class Legal extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new Layout()
        )
    );
  }

  @Override
  public String path() {
    return "/impressum";
  }

  @Override
  protected String title() {
    return "Uncle-T - Impressum";
  }

  @Override
  protected String description() {
    return "Uncle-T Impressum";
  }
}
