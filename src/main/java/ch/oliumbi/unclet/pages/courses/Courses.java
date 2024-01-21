package ch.oliumbi.unclet.pages.courses;

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
import ch.oliumbi.unclet.components.typography.H4;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

@Autoload
public class Courses extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Kurse")
        ),
        new Section(
            new Split(
                new CoursesGroup(
                    new P(
                        "Ich freue mich, Sie in die faszinierende Welt der kulinarischen Künste einzuführen und Ihre Leidenschaft fürs Kochen und Grillen zu entfachen."),
                    new P(
                        "Meine Kurse bieten eine einmalige Gelegenheit, Ihr gastronomisches Wissen zu erweitern und Ihre Fertigkeiten auf ein neues Level zu bringen.")
                ),
                new CoursesGroup(
                    new P(
                        "Ganz gleich, ob Sie ein Neuling in der Küche sind oder bereits über Erfahrung verfügen, meine Kurse sind auf jeden Teilnehmer individuell zugeschnitten.")
                )
            )
        ),
        new Section(
            new Split(
                new PictureStyled("Kochkurs", 1600, 1600, new PictureSource("/static/jpg/lwhf", MimeType.JPEG)),
                new CoursesGroup(
                    new P(
                        "In meinen Kochkursen tauchen Sie ein in die Welt der internationalen und nationalen Küche. Von exquisiten Vorspeisen über raffinierte Hauptgerichte hin zu verlockenden Desserts – hier lernen Sie, wie Sie Ihre Lieblingsgerichte mit Leichtigkeit zubereiten können. Wir setzen auf frische, saisonale Zutaten und geben Ihnen wertvolle Tipps, wie Sie das Beste aus jedem Gericht herausholen können."),
                    new P(
                        "Egal, ob Sie meine Kurse als Einzelperson besuchen, einen privaten Kurs für sich und ihre Freunde planen, einen Firmenevent oder einen besonderen Anlass feiern möchten, ich gestalte meine Kurse nach ihren Wünschen und Anforderungen.")
                )
            )
        ),
        new Article(
            new CoursesGroup(
                new H4("Grillkurs"),
                new P(
                    "Wenn Sie sich für meinen Grillkurs entscheiden, erwartet Sie ein Grillabenteuer der besonderen Art. Lernen Sie, wie Sie saftige Steaks, zartes Grillgemüse und unwiderstehliche Grilldelikatessen zaubern."),
                new P(
                    "Ich teile mit Ihnen meine Expertise und zeige Ihnen, wie Sie die Kunst des Grillens meistern und Ihre Grillabende zu unvergesslichen Events machen."),
                new P(
                    "Meine Koch- und Grillkurse sind nicht nur lehrreich, sondern auch unterhaltsam. Sie haben die Möglichkeit, sich mit Gleichgesinnten auszutauschen, neue Freundschaften zu knüpfen und gemeinsam kulinarische Höhepunkte zu erleben.")
            )
        ),
        new Article(
            new Contact()
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
