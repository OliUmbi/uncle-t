package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.core.annotations.Autoload;
import ch.oliumbi.compass.server.request.Request;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.UncleT;
import ch.oliumbi.unclet.components.section.Section;
import ch.oliumbi.unclet.components.typography.H1;
import ch.oliumbi.unclet.components.typography.P;
import java.util.List;

@Autoload
public class Terms extends UncleT {

  @Override
  protected List<Component> load(Request request) {
    return List.of(
        new Section(
            new H1("Allgemeine Geschäftsbedingung")
        ),
        new Section(
            new P("Der Kunde überträgt das Catering gemäss Detail-Offerten an die Uncle-T GmbH."),
            new Term("1",
                "Die oben genannten Preise verstehen sich als absolute Richtwerte. Verrechnet wird nach effektivem Aufwand."),
            new Term("2",
                "Der Kunde muss dem Caterer eine Änderung der Personenzahl spätestens 4 Tage vor Anlassbeginn in schriftlicher Form mitteilen. Spätere Änderungen können nicht mehr garantiert werden. Die vom Kunden bekannt gegebene Teilnehmerzahl ist verbindlich. Zusätzliche Personen stellt der Caterer dem Kunden nachträglich in Rechnung. Leistungen für nachträglich noch wegfallende Teilnehmer werden dem Kunden in Rechnung gestellt."),
            new Term("3",
                "Bei Annullierung eines Auftrags durch den Kunden stellt der Caterer folgende Kosten in Rechnung:",
                "6 – 4 Arbeitstage vor dem Anlass: 50% der vereinbarten Leistung",
                "3 – 1 Arbeitstage vor dem Anlass: 75% der vereinbarten Leistung",
                "0 Arbeitstage vor dem Anlass: 100% der vereinbarten Leistung"
            ),
            new Term("4",
                "Ohne anders lautende Vereinbarung stellt der Kunde dem Caterer unentgeltlich folgende Infrastruktur zur Verfügung und verpflichtet sich, diese in einem zum vorausgesetzten Gebrauch geeigneten Zustand zu übergeben und in demselben zu erhalten:",
                "Die erforderlichen Räume", // todo list
                "Heizung, Wasser und Strom",
                "Insbesondere muss der Kunde dem Caterer rechtzeitig darauf aufmerksam machen, wenn die Zufahrt erschwert ist oder das Gebäude über keinen Lift verfügt."
            ),
            new Term("5",
                "Der Caterer übernimmt die Reinigung des Gastroinventars und des Materials. Ohne anders lautende Vereinbarung ist im Übrigen der Kunde verantwortlich für Reinigung und Entsorgung."
            ),
            new Term("6",
                "Wird seitens des Caterers Material zur Verfügung gestellt, welches nach Beendigung des Anlasses an ihn zu retournieren ist (zum Beispiel Gläser, Geschirr, Bestecke, Wäsche, etc.), so ist der Kunde verpflichtet, das Material vollständig und unversehrt an den Caterer zurückzugeben. Verluste und Beschädigungen durch Angestellte oder Gäste des Kunden gehen zu Lasten des Kunden."
            ),
            new Term("7",
                "Ohne anders lautende Vereinbarung ist der Kunde für den notwendigen Versicherungsschutz in Bezug auf Sach- und Personenschäden verantwortlich sowie für sämtliche gesetzlich vorgeschriebene Bewilligungen, welche im Zusammenhang eines Events benötigt werden."
            ),
            new Term("8",
                "Nach Durchführung des Anlasses erhält der Kunde vom Caterer eine Rechnung, die innerhalb 14 Tagen ab Rechnungsdatum zu begleichen ist."
            ),
            new Term("9",
                "Die Vereinbarung untersteht schweizerischem Recht. Gerichtsstand für sämtliche Streitigkeiten, welche sich im Zusammenhang mit der Vereinbarung und der Tätigkeit des Caterers ergeben, ist Aargau (Handelsgericht)"
            )
        )
    );
  }

  @Override
  public String path() {
    return "/geschaeftsbedingung";
  }

  @Override
  protected String title() {
    return "Uncle-T - Allgemeine Geschäftsbedingung";
  }

  @Override
  protected String description() {
    return "Uncle-T Allgemeine Geschäftsbedingung";
  }
}
