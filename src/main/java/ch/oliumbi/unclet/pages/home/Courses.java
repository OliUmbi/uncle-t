package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.Flex;
import ch.oliumbi.compass.ui.style.Grid;
import ch.oliumbi.compass.ui.style.Style;
import java.util.List;

public class Courses extends Component {


  @Override
  protected String tag() {
    return "div";
  }

  @Override
  protected List<Component> components() {
    return List.of(
        new CoursesBody(),
    new CoursesPicture()
    );
  }

  @Override
  protected List<Style> xl() {
    return List.of(
        new Grid("2fr 3fr", "auto", "start", "center", "6rem")
    );
  }

  @Override
  protected List<Style> l() {
    return List.of(
        new Grid("1fr 1fr", "auto", "start", "center", "4rem")
    );
  }

  @Override
  protected List<Style> m() {
    return List.of(
        new Grid("1fr", "auto", "start", "start", "2rem")
    );
  }
}
