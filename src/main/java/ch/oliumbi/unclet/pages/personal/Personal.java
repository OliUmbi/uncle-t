package ch.oliumbi.unclet.pages.personal;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

@Autoload
public class Personal extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Privatkoch")
        ),
        new Section(
          new P("Ein Candle-Light Dinner zu Zweit, eine familiäre Feier oder eine extravagante Veranstaltung – als Privatkoch-Anbieter möchte ich ihnen und ihren Gästen ein kulinarisches Erlebnis anbieten, dass sie so schnell nicht vergessen werden. \n")
        ),
        new Section(
            new P("Dabei steht für mich ein exklusiver und erstklassiger Service im Vordergrund. Mit Liebe zum Detail und viel Kreativität entwerfe ich ihnen ein Menu, das ihren individuellen Vorlieben und Bedürfnissen entspricht. Besonderen Wert wird dabei auf frische, saisonale und regionale Zutaten gelegt. Um höchste Qualität zu gewährleisten arbeite ich eng mit regionalen Lieferanten zusammen. \n")
        ),
        new Section(
            new P("Als Privatkoch übernehme ich die gesamte Planung, den Einkauf und die Zubereitung ihres Menus, damit sie sich entspannt zurücklehnen und eine schöne Zeit mit ihren Gästen verbringen können.\n")
        ),
        new Section(
            new P("Durch meine Erfahrungen als Privatkoch auf der ganzen Welt habe ich ein breites Portfolio an kulinarischen Köstlichkeiten, welche ich mit viel liebe zum Detail kreiere. \n")
        )
    );
  }

  @Override
  public String path() {
    return "/privatkoch";
  }

  @Override
  protected String title() {
    return "Uncle-T - Privatkoch";
  }

  @Override
  protected String description() {
    return "Uncle-T Privatkoch";
  }
}
