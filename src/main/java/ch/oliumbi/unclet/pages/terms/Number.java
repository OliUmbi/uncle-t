package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.style.State;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.H3;

public class Number extends H3 {

  public Number(String value) {
    super(value);
  }

  @Override
  protected State xl() {
    return new State()
        .normal(new Style()
            .fontColor(Global.blackLight())
            .fontFamily("geist")
            .fontWeight("600")
            .fontSize("3.5rem")
            .fontHeight("4.55rem"));
  }
}
