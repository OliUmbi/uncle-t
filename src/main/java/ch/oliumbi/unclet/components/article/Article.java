package ch.oliumbi.unclet.components.article;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Margin;
import ch.oliumbi.compass.ui.style.Padding;
import ch.oliumbi.compass.ui.style.Style;
import ch.oliumbi.compass.ui.style.WidthMax;
import ch.oliumbi.unclet.Global;
import java.util.List;

public class Article extends Component {

  private final List<Component> components;

  public Article(Component... components) {
    this.components = List.of(components);
  }

  @Override
  protected String tag() {
    return "section";
  }

  @Override
  protected List<Component> components() {
    return components;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Margin("auto"),
        new Padding("6rem 5rem"),
        new WidthMax(Global.m())
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Padding("5rem 4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Padding("4rem 3rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Padding("3rem 2rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Padding("2rem 1rem")
    );
  }
}
