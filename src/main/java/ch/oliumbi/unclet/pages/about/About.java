package ch.oliumbi.unclet.pages.about;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.article.Article;
import ch.oliumbi.unclet.components.contact.Contact;
import ch.oliumbi.unclet.components.image.Image;
import ch.oliumbi.unclet.components.picture.Picture;
import ch.oliumbi.unclet.components.picture.PictureSource;
import ch.oliumbi.unclet.components.picture.PictureStyled;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.split.Split;
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
            new Split(
                new PictureStyled("Privatdinner", 1600, 1067, new PictureSource("/static/jpg/qegr", MimeType.JPEG)),
                new AboutGroup(
                    new P("Im Jahr 2013 wurde ich Gusto-Sieger, nationaler grösster Lehrlings-Kochwettbewerb. Ein Meilenstein, der nicht nur meine Leidenschaft für die Kochkunst bestätigte, sondern auch den Grundstein für meine berufliche Zukunft legte."),
                    new P("In diesem Moment wurde mir klar, dass meine kulinarischen Träume einen festen Platz in der Welt der Gastronomie finden würden."),
                    new P("Meine Liebe zum Kochen und die Begeisterung meiner Kunden sind die Antriebskräfte, die mich jeden Tag aufs Neue motivieren. Gerne lasse ich mich von verschiedenen Kochstilen inspirieren und lebe meine Kreativität in neuen Gerichten aus."),
                    new P("Durch meine mehrjährige Erfahrung als Privatkoch auf der ganzen Welt werden Sie bemerken, dass bei mir Diskretion und Perfektion an erster Stelle stehen. "),
                    new P("Heute bin ich stolz darauf, meine eigene Firma gegründet zu haben, in der ich meine Leidenschaft mit anderen teilen kann.")
                )
            )
        ),
        new Article(
            new AboutGroup(
                new P("Auf meiner Homepage finden Sie einen Einblick in meine Kochphilosophie, meine Dienstleistungen und vielleicht auch die Inspiration für Ihr nächstes kulinarisches Abenteuer."),
                new P("Ich lade Sie herzlich ein, mich auf dieser aufregenden Reise zu begleiten und freue mich darauf, Ihre Geschmackssinne zu verwöhnen.")
            )
         ),
        new Article(
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
