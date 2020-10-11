# kotlin-blueprintjs

Kotlin-react bindings for BlueprintJS components library

## Manual fixes for Dukat's output

| Problem | Manual fix |
|---------|------------|
| Type argument is not within its bounds: should be subtype of `HTMLAttributes<HTMLElement>` | Hack react declaration? |
| Class X must override *some property* because it inherits multiple interface methods of it | Add override manually in `IControlProps`, `IFileInputProps`, `ITextAreaProps` |
| Only nullable properties of external interfaces are allowed to be non-abstract | Make it nullable in `popover` and `popoverSharedProps` |
| X hides member of supertype Y and needs 'override' modifier | Add 3 override modifiers in `IPopoverSharedProps` |
