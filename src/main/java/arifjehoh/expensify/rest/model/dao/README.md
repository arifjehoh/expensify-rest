For DAOs:

- `@Entity`: Indicates that the class represents a database entity.
- `@Table`: Specifies the name of the database table that the entity maps to.
- `@Id`: Specifies the primary key field of the entity.
- `@GeneratedValue`: Specifies the strategy for generating primary key values.
- `@Column`: Specifies the mapping between entity fields and database columns.
- `@Data`: Generates getters, setters, equals(), hashCode(), and toString() methods.
- `@NoArgsConstructor`: Generates a no-arguments constructor.
- `@AllArgsConstructor`: Generates a constructor with all arguments.
- `@AllArgsConstructor(access = AccessLevel.PUBLIC)` and `@NoArgsConstructor(access = AccessLevel.PROTECTED)`: Provides
  the ability to define constructors with specific access levels. In this case, the all-arguments constructor is public,
  and the no-arguments constructor is protected.