package ch.oliumbi.unclet.pages.home;

import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.compass.ui.style.State;
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
  protected State xl() {
    return new State()
        .normal(new Style()
            .grid("2fr 3fr", "auto", "start", "center", "6rem"));
  }

  @Override
  protected State l() {
    return new State()
        .normal(new Style()
            .grid("1fr 1fr", "auto", "start", "center", "4rem"));
  }

  @Override
  protected State m() {
    return new State()
        .normal(new Style()
            .grid("1fr", "auto", "start", "start", "2rem"));
  }
}
