
(ns pretty-icons.api
    (:require [pretty-icons.views :as views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial First steps
;
; Place the 'pretty-icons.min.css' file in the HTML header.
; You can find it in the [resources/public](https://github.com/pretty-project/pretty-icons/tree/release/resources/public) folder of this repository.
;
; Place the external resource links of the icon font families in the HTML header:
;
; @code
; ; Material Icons Filled:
; [:link {:ref  "stylesheet"
;         :type "text/css"
;         :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
;
; ; Material Icons Outlined:
; [:link {:ref  "stylesheet"
;         :type "text/css"
;         :href "https://fonts.googleapis.com/icon?family=Material+Icons+Outlined"}]
;
; ; Material Symbols Filled and Outlined
; [:link {:ref  "stylesheet"
;         :type "text/css"
;         :href "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"}]
; @---



; @tutorial How to use Material Icons and Material Symbols?
;
; You can display Material icons and symbols ...
;
; ... by using the ':data-icon-family' attribute and the icon name as the content of the element.
;
; ... by using the 'material-icon' and 'material-symbol' functions of this library.
;
; @note
; Use dashes instead of hyphens in icon names!
;
; @usage
; [:i {:data-icon-family :material-icons-filled}     :nature_people]
; [:i {:data-icon-family :material-icons-outlined}   :nature_people]
; [:i {:data-icon-family :material-symbols-filled}   :nature_people]
; [:i {:data-icon-family :material-symbols-outlined} :nature_people]
;
; @usage
; (ns my-namespace
;   (:require [pretty-icons.api :refer [material-icon material-symbol]]))
;
; (material-icon   :nature_people :filled)
; (material-icon   :nature_people :outlined)
; (material-symbol :nature_people :filled)
; (material-symbol :nature_people :outlined)
; @---

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-icons.views/*)
(def material-icon   views/material-icon)
(def material-symbol views/material-symbol)
