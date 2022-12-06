# Dependency Injection

### What is Dependency Injection?

- **Dependency Injection**, a fundamental aspect of the Spring framework, through which the Spring IOC (_Inversion of Control_) container “injects” objects into other objects or “dependencies”. Simply put, this allows for loose coupling of components and moves the responsibility of managing components onto the container.

**Loose Coupling:** when a component has, or makes use of, little or no knowledge of the definitions of other separate components.

- Because an application's components are not dependent on one another, a domino effect won't occur if one of them experiences problems. Instead, when one component is changed, experiences issues, or fails, then the other components will continue to work at close to full capacity, preventing the application from becoming useless.

## Component Scopes

1. **Singleton:** Only one instance will be created for a single bean definition per Spring IoC container and the same object will be shared for each request made for that bean.
2. **Prototype:** A new instance will be created for a single bean definition every time a request is made for that bean.

- Generally, we use the **_prototype scope for all beans that are stateful_**, while the **_singleton scope is used for the stateless beans_**.
