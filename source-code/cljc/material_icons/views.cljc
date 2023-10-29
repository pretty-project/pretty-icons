
(ns material-icons.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon
  ; @param (keyword) icon-name
  ; @param (keyword)(opt) style
  ; :outlined, :filled
  ; Default: :outlined
  ;
  ; @usage
  ; (icon :nature_people :outlined)
  ;
  ; @usage
  ; (icon :nature_people :filled)
  ;
  ; @example
  ; (icon :nature_people :outlined)
  ; =>
  ; [:i {:data-icon-family :material-icons-outlined} :nature_people]
  ;
  ; @example
  ; (icon :nature_people :filled)
  ; =>
  ; [:i {:data-icon-family :material-icons-filled} :nature_people]
  ;
  ; @return (hiccup)
  [icon-name style]
  (case style :filled [:i {:data-icon-family :material-icons-filled}   icon-name]
                      [:i {:data-icon-family :material-icons-outlined} icon-name]))
 
(defn symbol
  ; @param (keyword) symbol-name
  ; @param (keyword)(opt) style
  ; :outlined, :filled
  ; Default: :outlined
  ;
  ; @usage
  ; (symbol :nature_people :outlined)
  ;
  ; @usage
  ; (symbol :nature_people :filled)
  ;
  ; @example
  ; (symbol :nature_people :outlined)
  ; =>
  ; [:i {:data-icon-family :material-symbols-outlined} :nature_people]
  ;
  ; @example
  ; (symbol :nature_people :filled)
  ; =>
  ; [:i {:data-icon-family :material-symbols-filled} :nature_people]
  ;
  ; @return (hiccup)
  [symbol-name style]
  (case style :filled [:i {:data-icon-family :material-symbols-filled}   symbol-name]
                      [:i {:data-icon-family :material-symbols-outlined} symbol-name]))
