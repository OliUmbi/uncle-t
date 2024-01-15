package ch.oliumbi.unclet.pages.personal;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.article.Article;
import ch.oliumbi.unclet.components.contact.Contact;
import ch.oliumbi.unclet.components.picture.PictureSource;
import ch.oliumbi.unclet.components.picture.PictureStyled;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.split.Split;
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
            new Split(
                new PictureStyled("Desert", 1600, 1600, new PictureSource("/static/jpg/skdg", MimeType.JPEG)),
                new PersonalGroup(
                    new P("Ein Candle-Light Dinner zu Zweit, eine familiäre Feier oder eine extravagante Veranstaltung – als Privatkoch-Anbieter möchte ich ihnen und ihren Gästen ein kulinarisches Erlebnis anbieten, das Sie so schnell nicht vergessen werden. "),
                    new P("Dabei steht für mich ein exklusiver und erstklassiger Service im Vordergrund. Mit Liebe zum Detail und viel Kreativität entwerfe ich ihnen ein Menu, das ihren individuellen Vorlieben und Bedürfnissen entspricht. Besonderen Wert wird dabei auf frische, saisonale und regionale Zutaten gelegt. Um höchste Qualität zu gewährleisten arbeite ich eng mit regionalen Lieferanten zusammen. ")
                )
            )
        ),
        new Section(
            new Split(
                new PersonalGroup(
                    new P("Als Privatkoch übernehme ich die gesamte Planung, den Einkauf und die Zubereitung ihres Menus, damit Sie sich entspannt zurücklehnen und eine schöne Zeit mit ihren Gästen verbringen können."),
                    new P("Durch meine Erfahrungen als Privatkoch auf der ganzen Welt habe ich ein breites Portfolio an kulinarischen Köstlichkeiten, welche ich mit viel liebe zum Detail kreiere. ")
                ),
                new PictureStyled("Desert", 1600, 1600, new PictureSource("/static/jpg/ajlk", MimeType.JPEG))
            )
        ),
        new Article(
            new Contact()
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
