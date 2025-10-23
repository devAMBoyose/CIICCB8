// File: Person.java
// A record is a concise way to create immutable data classes (no need to write getters, constructors, or toString()).

public record Person(String name, int age) { }

/**
 * Automatically generates:
 * <ul>
 *   <li>Constructor</li>
 *   <li><code>equals()</code>, <code>hashCode()</code></li>
 *   <li><code>toString()</code></li>
 * </ul>
 *
 * Used for simple data carriers or DTOs (Data Transfer Objects).
 */
