
# pretty-icons

### Overview

The <strong>pretty-icons</strong> is a simple Material Icons / Material Symbols
icon set implementation for Clojure projects.

### deps.edn

```
{:deps {bithandshake/pretty-icons {:git/url "https://github.com/bithandshake/pretty-icons"
                                   :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/pretty-icons/tree/release).

### Documentation

The <strong>pretty-icons</strong> functional documentation is [available here](documentation/COVER.md).

### Changelog

You can track the changes of the <strong>pretty-icons</strong> library [here](CHANGES.md).

# Usage

> Some parameters of the following functions and some further functions are not discussed in this file.
  To learn more about the available functionality, check out the [functional documentation](documentation/COVER.md)!

### Index

- [First steps](#first-steps)

- [How to use Material Icons and Material Symbols?](#how-to-use-material-icons-and-material-symbols)

### First steps

- Place the `pretty-icons.min.css` file in your HTML header, you can find it in
  the `resources/public` folder of this repository:

> `resources/public/pretty-icons.min.css`

- Place the resource links of the icon font families in your HTML header:

```
; Material Icons Filled:
[:link {:ref  "stylesheet"
        :type "text/css"
        :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]

; Material Icons Outlined:        
[:link {:ref  "stylesheet"
        :type "text/css"
        :href "https://fonts.googleapis.com/icon?family=Material+Icons+Outlined"}]

; Material Symbols Filled and Outlined
[:link {:ref  "stylesheet"
        :type "text/css"
        :href "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"}]

```

### How to use Material Icons and Material Symbols?

You can display Material icons and symbols ...

... by using the `:data-icon-family` attribute and using the icon name as the content of the element.

... by using the `material-icon` and `material-symbol` functions of this library.

> Use dashes instead of using hyphens in icon names!

```
; Using the ':data-icon-family' data attribute:
[:i {:data-icon-family :material-icons-filled}     :nature_people]
[:i {:data-icon-family :material-icons-outlined}   :nature_people]
[:i {:data-icon-family :material-symbols-filled}   :nature_people]
[:i {:data-icon-family :material-symbols-outlined} :nature_people]
```

```
(ns my-namespace
    (:require [pretty-icons.api :refer [material-icon material-symbol]]))

; Using the 'material-icon' and 'material-symbol' functions:
(material-icon   :nature_people :filled)
(material-icon   :nature_people :outlined)
(material-symbol :nature_people :filled)
(material-symbol :nature_people :outlined)
```
