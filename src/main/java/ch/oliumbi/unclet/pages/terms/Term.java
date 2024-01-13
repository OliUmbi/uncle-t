package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.HeightMin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class Term extends Component {

  private final String number;
  private final List<String> conditions;

  public Term(String number, String... conditions) {
    this.number = number;
    this.conditions = List.of(conditions);
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new Number(number),
        new Condition(conditions)
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new HeightMin("20rem"),
        new Padding("2rem 0"),
        new Grid("1fr 3fr", "auto", "center", "center", "1rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new HeightMin("0"),
        new Padding("4rem 0"),
        new Grid("auto", "auto 1fr", "center", "start", "1rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("4rem 0"),
        new Grid("auto", "auto 1fr", "start", "start", "1rem")
    );
  }
}
