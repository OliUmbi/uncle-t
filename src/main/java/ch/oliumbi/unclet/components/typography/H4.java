package ch.oliumbi.unclet.components.typography;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Theme;

public class H4 extends Component {

  private final String value;
  private final String color;

  public H4(String value) {
    this.value = value;
    this.color = Theme.blackDark();
  }

  public H4(String value, String color) {
    this.value = value;
    this.color = color;
  }

  @Override
  protected String tag() {
    return "h4";
  }

  @Override
  protected String value() {
    return value;
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .fontFamily("geist")
            .fontColor(color)
            .fontWeight("500")
            .fontSize("3rem")
            .fontHeight("4.2rem"));
  }

  @Override
  protected State l() {
    return new State()
        .normal(new Style()
            .fontSize("2.5rem")
            .fontHeight("3.5rem"));
  }

  @Override
  protected State m() {
    return new State()
        .normal(new Style()
            .fontSize("2rem")
            .fontHeight("2.8rem"));
  }

  @Override
  protected State s() {
    return new State()
        .normal(new Style()
            .fontSize("1.5rem")
            .fontHeight("2.1rem"));
  }

  @Override
  protected State xs() {
    return new State()
        .normal(new Style()
            .fontSize("1rem")
            .fontHeight("1.4rem"));
  }
}