# kotlin-blueprintjs

Kotlin-react bindings for BlueprintJS components library

## Manual fixes for Dukat's output

| Problem | Manual fix |
|---------|------------|
| `import * as React` is not understood by Dukat, which keeps `React.Xyz` references as-is | Replace `React.` prefix by `react.` (fully qualifying the names) |
| Missing `override` modifier on `render()` in `PureComponent` subsclasses | Add missing modifier |
| `JSX` is implicitly declared in TS, and undefined in the generated Kotlin                | Replace `JSX.Xyz` by more general type. For instance `keyof JSX.IntrinsicElements` -> `String` |
| `JSX.Element` | Replace with `react.ReactElement` |
| `React.ReactNode` | Replace with `react.ReactElement` |
| `PureComponent<*>` | Replace with `PureComponent<*, react.RState>` |
| `React.HTMLAttributes<*>` | Remove when used as superinterface. There doesn't seem to be an equivalent in kotlin react wrappers at the moment (2020-05-22). |
| `React.HTMLProps` | Replace with more general `react.RProps` |
| `React.SyntheticEvent<*>` | Replace with `org.w3c.dom.events.Event` |
| `React.MouseEvent<*>` | Replace with `org.w3c.dom.events.MouseEvent` |
| `React.KeyboardEvent<*>` | Replace with `org.w3c.dom.events.KeyboardEvent` |
