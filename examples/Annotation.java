// File: AuthorInfo.java
// A file defining a custom annotation - metadata used by other classes or tools.

public @interface AuthorInfo {
    String name();
    String date();
}

/*Used to mark methods, classes, or variables with metadata.
Example usage: */

@AuthorInfo(name="Anna Marice Boyose", date="2025-10-23")
public class Demo { }
/*Annotations provide additional information that can be processed at compile-time or runtime.
This can be useful for documentation, code analysis, or enforcing coding standards.*/