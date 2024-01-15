package ch.oliumbi.unclet.pages.catering;

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
public class Catering extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Catering")
        ),
        new Section(
            new Split(
                new CateringGroup(
                    new P(
                        "Als Catering-Anbieter habe ich eine grosse Leidenschaft für hochwertiges Essen und erstklassigen Service. Durch meine langjährige Erfahrung als Koch in einem Catering Unternehmen, habe ich ein breites Repertoire an kulinarischen Fähigkeiten und Kenntnissen entwickelt."),
                    new P(
                        "Eine genau Absprache und enge Zusammenarbeit im Vorfeld ihres Anlasses ermöglicht es mir auf ihre individuellen Wünsche und Bedürfnisse einzugehen. Dabei erstelle ich massgeschneiderte Menüs, die auf ihre Anforderungen zugeschnitten sind.")
                ),
                new PictureStyled("Cateringservice", 1600, 1600, new PictureSource("/static/jpg/qwfg", MimeType.JPEG))
            )
        ),
        new Section(
            new Split(
                new PictureStyled("Desert", 1600, 1600, new PictureSource("/static/jpg/fdar", MimeType.JPEG)),
                new CateringGroup(
                    new P(
                        "Erstklassigen Service und einen reibungslosen Ablauf ihrer Veranstaltung gehören für mich zur Selbstverständlichkeit. Ebenso lege ich grossen Wert auf die Qualität und Frische der Zutaten, die ich für ihre Gerichte verwende. Eine enge Zusammenarbeit mit meinen lokalen Lieferanten ist dabei Standard."),
                    new P(
                        "Individuell, professionell, regional, lokal  und hochwertig – dies zeichnet mein Catering-Service aus – überzeugen Sie sich selbst und buchen Sie ein unvergessliches kulinarisches Erlebnis.")
                )
            )
        ),
        new Article(
            new Contact()
        )
    );
  }

  @Override
  public String path() {
    return "/catering";
  }

  @Override
  protected String title() {
    return "Uncle-T - Catering";
  }

  @Override
  protected String description() {
    return "Uncle-T Catering";
  }
}
