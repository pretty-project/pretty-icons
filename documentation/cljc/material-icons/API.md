
# material-icons.api isomorphic namespace

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > material-icons.api

### Index

- [icon](#icon)

### icon

```
@param (keyword) icon-name
@param (keyword)(opt) style
:outlined, :filled
Default: :outlined
```

```
@usage
(icon :nature_people :outlined)
```

```
@usage
(icon :nature_people :filled)
```

```
@example
(icon :nature_people :outlined)
=>
[:i {:data-icon-family :material-icons-outlined} :nature_people]
```

```
@example
(icon :nature_people :filled)
=>
[:i {:data-icon-family :material-icons-filled} :nature_people]
```

<details>
<summary>Source code</summary>

```
(defn icon
  [icon-name style]
  (case style :filled [:i {:data-icon-family :material-icons-filled}   icon-name]
                      [:i {:data-icon-family :material-icons-outlined} icon-name]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [material-icons.api :refer [icon]]))

(material-icons.api/icon ...)
(icon                    ...)
```

</details>

---

This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.

