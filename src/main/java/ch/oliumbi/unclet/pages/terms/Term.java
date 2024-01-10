package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Theme;
import ch.oliumbi.unclet.components.typography.H3;
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
        new H3(number, Theme.blackLight()),
        new Condition(conditions)
    );
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .grid("1fr 3fr", "auto", "center", "center", "1rem")
            .heightMin("20rem")
            .padding("2rem 0"));
  }

  @Override
  protected State s() {
    return new State()
        .normal(new Style()
            .grid("auto", "auto 1fr", "center", "start", "1rem")
            .heightMin("0")
            .padding("4rem 0"));
  }

  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .grid("auto", "auto 1fr", "start", "start", "1rem")
            .heightMin("0")
            .padding("4rem 0"));
  }
}
