package ch.oliumbi.unclet.components.image;

import ch.oliumbi.compass.core.enums.MimeType;
import ch.oliumbi.compass.ui.attribute.Attribute;
import ch.oliumbi.compass.ui.component.Component;
import ch.oliumbi.unclet.Global;
import java.util.List;

public class Source extends Component {

  private final String path;
  private final MimeType type;

  public Source(String path, MimeType type) {
    this.path = path;
    this.type = type;
  }

  @Override
  protected String tag() {
    return "source";
  }

  @Override
  protected List<Attribute> attributes() {

    return List.of(
        new Attribute("sizes", STR."""
            (max-width: \{Global.xs()}) 1px,
            (max-width: \{Global.s()}) 2px,
            (max-width: \{Global.m()}) 3px,
            (max-width: \{Global.l()}) 4px,
            5px
            """),
        new Attribute("srcset", STR."""
            \{path}-xl\{type.extension()} 5w,
            \{path}-l\{type.extension()} 4w,
            \{path}-m\{type.extension()} 3w,
            \{path}-s\{type.extension()} 2w,
            \{path}-xs\{type.extension()} 1w
            """),
        new Attribute("type", type.translate())
    );
  }
}
