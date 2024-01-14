package ch.oliumbi.unclet.pages.about;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.contact.Contact;
import ch.oliumbi.unclet.components.image.Image;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import ch.oliumbi.unclet.components.picture.PictureStyled;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

@Autoload
public class About extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Über Mich")
        ),
        new Section(
            new PictureStyled("Privatdinner", 1600, 1067, new PictureSource("/static/jpg/qegr", MimeType.JPEG)),
            new P("Mein Name ist Thomas Habegger und ich arbeite seit 13 Jahren leidenschaftlich gerne als Koch. Die Kunden und deren Gäste mit meinen Kochkünsten zu verzaubern bereitet mir grosse Freude."),
            new P("Sei es bei einem Apèro, einem Private Dining mit Gästen, einem Catering für eine Hochzeit oder einem Firmenanlass – ich lege immer höchsten Wert darauf ihren Wünschen und Erwartungen gerecht zu werden."),
            new P("Mein Ziel ist es, Ihnen kulinarische Momente voller Exklusivität und Genuss mit meinem Team zu bieten. Dabei können sie sich vollkommen auf mich verlassen und einen unvergesslichen Kulinarischen Event geniessen."),
            new P("Meine Liebe zum Kochen und die Begeisterung meiner Kunden sind die Antriebskräfte, die mich jeden Tag aufs Neue motivieren."),
            new P("Gerne lasse ich mich von verschiedenen Kochstilen inspirieren und lebe meine Kreativität in neuen Gerichten aus."),
            new P("Durch meine mehrjährige Erfahrung als Privatkoch auf der ganzen Welt werden sie bemerken, dass bei mir Diskretion und Perfektion mit an erster Stelle stehen.")
        ),
        new Section(
            new Contact()
        )
    );
  }

  @Override
  public String path() {
    return "/ueber-mich";
  }

  @Override
  protected String title() {
    return "Uncle-T - Über Mich";
  }

  @Override
  protected String description() {
    return "Uncle-T Über Mich";
  }
}
