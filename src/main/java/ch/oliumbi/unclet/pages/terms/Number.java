package ch.oliumbi.unclet.pages.terms;

import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.TextColor;
import ch.oliumbi.compass.ui.style.TextFamily;
import ch.oliumbi.unclet.Global;
import ch.oliumbi.unclet.components.typography.H3;
import java.util.ArrayList;
import java.util.List;

public class Number extends H3 {

  public Number(String value) {
    super(value);
  }

  @Override
  protected List<Style> xl() {
    List<Style> styles = new ArrayList<>(super.xl());

    styles.add(new TextColor(Global.blackLight()));

    return styles;
  }
}
