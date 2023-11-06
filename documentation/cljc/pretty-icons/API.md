
### pretty-icons.api

Functional documentation of the pretty-icons.api isomorphic namespace

---

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > pretty-icons.api

### Index

- [material-icon](#material-icon)

- [material-symbol](#material-symbol)

---

### material-icon

```
@param (keyword) icon-name
@param (keyword)(opt) style
:outlined, :filled
Default: :outlined
```

```
@usage
(material-icon :nature_people :outlined)
```

```
@usage
(material-icon :nature_people :filled)
```

```
@example
(material-icon :nature_people :outlined)
=>
[:i {:data-icon-family :material-icons-outlined} :nature_people]
```

```
@example
(material-icon :nature_people :filled)
=>
[:i {:data-icon-family :material-icons-filled} :nature_people]
```

```
@return (hiccup)
```

<details>
<summary>Source code</summary>

```
(defn material-icon
  [icon-name style]
  (case style :filled [:i {:data-icon-family :material-icons-filled}   icon-name]
                      [:i {:data-icon-family :material-icons-outlined} icon-name]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [pretty-icons.api :refer [material-icon]]))

(pretty-icons.api/material-icon ...)
(material-icon                  ...)
```

</details>

---

### material-symbol

```
@param (keyword) symbol-name
@param (keyword)(opt) style
:outlined, :filled
Default: :outlined
```

```
@usage
(material-symbol :nature_people :outlined)
```

```
@usage
(material-symbol :nature_people :filled)
```

```
@example
(material-symbol :nature_people :outlined)
=>
[:i {:data-icon-family :material-symbols-outlined} :nature_people]
```

```
@example
(material-symbol :nature_people :filled)
=>
[:i {:data-icon-family :material-symbols-filled} :nature_people]
```

```
@return (hiccup)
```

<details>
<summary>Source code</summary>

```
(defn material-symbol
  [symbol-name style]
  (case style :filled [:i {:data-icon-family :material-symbols-filled}   symbol-name]
                      [:i {:data-icon-family :material-symbols-outlined} symbol-name]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [pretty-icons.api :refer [material-symbol]]))

(pretty-icons.api/material-symbol ...)
(material-symbol                  ...)
```

</details>

---

<sub>This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.</sub>

