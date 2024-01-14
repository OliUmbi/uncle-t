package ch.oliumbi.unclet.components.split;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;
import java.util.stream.Collectors;

public class Split extends Component {

  private final List<Component> components;

  public Split(Component... components) {
    this.components = List.of(components);
  }

  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return components;
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Grid(components.stream().map(component -> "1fr").collect(Collectors.joining(" ")), "auto", "start", "start", "5rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Grid(components.stream().map(component -> "1fr").collect(Collectors.joining(" ")), "auto", "start", "start", "4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Grid("1fr", "auto", "start", "start", "3rem")
    );
  }

  @Override
  protected List<Style> s() {
    return List.of(
        new Grid("1fr", "auto", "start", "start", "2rem")
    );
  }

  @Override
  protected List<Style> xs() {
    return List.of(
        new Grid("1fr", "auto", "start", "start", "1rem")
    );
  }
}
