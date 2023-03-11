For DTOs:

- `@Data`: Generates getters, setters, equals(), hashCode(), and toString() methods.
- `@NoArgsConstructor`: Generates a no-arguments constructor.
- `@AllArgsConstructor`: Generates a constructor with all arguments.
- `@Builder`: Provides a builder pattern for creating instances of the DTO.
- `@AllArgsConstructor(access = AccessLevel.PUBLIC)` and `@NoArgsConstructor(access = AccessLevel.PROTECTED)`: Provides
  the ability to define constructors with specific access levels. In this case, the all-arguments constructor is public,
  and the no-arguments constructor is protected.