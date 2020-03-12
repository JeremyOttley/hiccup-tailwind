(defn simple-input []
  [:input {:class "bg-white focus:outline-none focus:shadow-outline border border-gray-300 rounded-lg py-2 px-4 block w-full appearance-none leading-normal", :type "email", :placeholder "jane@example.com"}])

;;ALERTS;;

(defn traditional-alert []
  [:div {:class "bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded relative", :role "alert"}
 [:strong {:class "font-bold"} "Holy smokes!"]
 [:span {:class "block sm:inline"} "Something seriously bad happened."]
 [:span {:class "absolute top-0 bottom-0 right-0 px-4 py-3"}
  [:svg {:class "fill-current h-6 w-6 text-red-500", :role "button", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
   [:title "Close"]
   [:path {:d "M14.348 14.849a1.2 1.2 0 0 1-1.697 0L10 11.819l-2.651 3.029a1.2 1.2 0 1 1-1.697-1.697l2.758-3.15-2.759-3.152a1.2 1.2 0 1 1 1.697-1.697L10 8.183l2.651-3.031a1.2 1.2 0 1 1 1.697 1.697l-2.758 3.152 2.758 3.15a1.2 1.2 0 0 1 0 1.698z"}]]]])

(defn modern-badge-alert []
  [:div {:class "bg-indigo-900 text-center py-4 lg:px-4"}
 [:div {:class "p-2 bg-indigo-800 items-center text-indigo-100 leading-none lg:rounded-full flex lg:inline-flex", :role "alert"}
  [:span {:class "flex rounded-full bg-indigo-500 uppercase px-2 py-1 text-xs font-bold mr-3"} "New"]
  [:span {:class "font-semibold mr-2 text-left flex-auto"} "Get the coolest t-shirts from our brand new store"]
  [:svg {:class "fill-current opacity-75 h-4 w-4", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
   [:path {:d "M12.95 10.707l.707-.707L8 4.343 6.586 5.757 10.828 10l-4.242 4.243L8 15.657l4.95-4.95z"}]]]])

(defn left-border-alert []
  [:div {:class "bg-orange-100 border-l-4 border-orange-500 text-orange-700 p-4", :role "alert"}
 [:p {:class "font-bold"} "Be Warned"]
 [:p "Something not ideal might be happening."]])

(defn titled-alert []
  [:div {:role "alert"}
 [:div {:class "bg-red-500 text-white font-bold rounded-t px-4 py-2"} ]
 [:div {:class "border border-t-0 border-red-400 rounded-b bg-red-100 px-4 py-3 text-red-700"}
  [:p "Something not ideal might be happening."]]])

(defn solid-alert []
  [:div {:class "flex items-center bg-blue-500 text-white text-sm font-bold px-4 py-3", :role "alert"}
 [:svg {:class "fill-current w-4 h-4 mr-2", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
  [:path {:d "M12.432 0c1.34 0 2.01.912 2.01 1.957 0 1.305-1.164 2.512-2.679 2.512-1.269 0-2.009-.75-1.974-1.99C9.789 1.436 10.67 0 12.432 0zM8.309 20c-1.058 0-1.833-.652-1.093-3.524l1.214-5.092c.211-.814.246-1.141 0-1.141-.317 0-1.689.562-2.502 1.117l-.528-.88c2.572-2.186 5.531-3.467 6.801-3.467 1.057 0 1.233 1.273.705 3.23l-1.391 5.352c-.246.945-.141 1.271.106 1.271.317 0 1.357-.392 2.379-1.207l.6.814C12.098 19.02 9.365 20 8.309 20z"}]]
 [:p "Something happened that you should know about."]])

(defn top-border-alert []
  [:div {:class "bg-teal-100 border-t-4 border-teal-500 rounded-b text-teal-900 px-4 py-3 shadow-md", :role "alert"}
 [:div {:class "flex"}
  [:div {:class "py-1"}
   [:svg {:class "fill-current h-6 w-6 text-teal-500 mr-4", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
    [:path {:d "M2.93 17.07A10 10 0 1 1 17.07 2.93 10 10 0 0 1 2.93 17.07zm12.73-1.41A8 8 0 1 0 4.34 4.34a8 8 0 0 0 11.32 11.32zM9 11V9h2v6H9v-4zm0-6h2v2H9V5z"}]]]
  [:div  
   [:p {:class "font-bold"} "Our privacy policy has changed"]
   [:p {:class "text-sm"} "Make sure you know how these changes affect you."]]]])

(defn banner-alert []
  [:div {:class "bg-blue-100 border-t border-b border-blue-500 text-blue-700 px-4 py-3", :role "alert"}
 [:p {:class "font-bold"} "Informational message"]
 [:p {:class "text-sm"} "Some additional text to explain said message."]])


;;BUTTONS;;

(defn simple-button []
  [:button {:class "bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"} ])

(defn pill-button []
  [:button {:class "bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-full"} ])

(defn outline-button []
  [:button {:class "bg-transparent hover:bg-blue-500 text-blue-700 font-semibold hover:text-white py-2 px-4 border border-blue-500 hover:border-transparent rounded"} ])

(defn bordered-button []
  [:button {:class "bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 border border-blue-700 rounded"} ])

(defn disabled-button []
  [:button {:class "bg-blue-500 text-white font-bold py-2 px-4 rounded opacity-50 cursor-not-allowed"} ])

(defn threed-button []
  [:button {:class "bg-blue-500 hover:bg-blue-400 text-white font-bold py-2 px-4 border-b-4 border-blue-700 hover:border-blue-500 rounded"} ])

(defn elevated-button []
  [:button {:class "bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow"} ])

(defn prev-next-button []
  [:div {:class "inline-flex"}
 [:button {:class "bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-2 px-4 rounded-l"} ]
 [:button {:class "bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-2 px-4 rounded-r"} ]])

(defn download-button []
  [:button {:class "bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-2 px-4 rounded inline-flex items-center"}
 [:svg {:class "fill-current w-4 h-4 mr-2", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
  [:path {:d "M13 8V2H7v6H2l8 8 8-8h-5zM0 18h20v2H0v-2z"}]]
 [:span "Download"]])

;;FORMS;;

(defn login-form []
  [:div {:class "w-full max-w-xs"}
 [:form {:class "bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4"}
  [:div {:class "mb-4"}
   [:label {:class "block text-gray-700 text-sm font-bold mb-2", :for "username"} ]
   [:input {:class "shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline", :id "username", :type "text", :placeholder "Username"}]]
  [:div {:class "mb-6"}
   [:label {:class "block text-gray-700 text-sm font-bold mb-2", :for "password"} ]
   [:input {:class "shadow appearance-none border border-red-500 rounded w-full py-2 px-3 text-gray-700 mb-3 leading-tight focus:outline-none focus:shadow-outline", :id "password", :type "password", :placeholder "******************"}]
   [:p {:class "text-red-500 text-xs italic"} "Please choose a password."]]
  [:div {:class "flex items-center justify-between"}
   [:button {:class "bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline", :type "button"} "Sign In"]
   [:a {:class "inline-block align-baseline font-bold text-sm text-blue-500 hover:text-blue-800", :href "#"} "Forgot Password?"]]]
 [:p {:class "text-center text-gray-500 text-xs"} "©2020 Acme Corp. All rights reserved."]])

(defn inline-form []
  [:form {:class "w-full max-w-sm"}
 [:div {:class "md:flex md:items-center mb-6"}
  [:div {:class "md:w-1/3"}
   [:label {:class "block text-gray-500 font-bold md:text-right mb-1 md:mb-0 pr-4", :for "inline-full-name"} "Full Name"]]
  [:div {:class "md:w-2/3"}
   [:input {:class "bg-gray-200 appearance-none border-2 border-gray-200 rounded w-full py-2 px-4 text-gray-700 leading-tight focus:outline-none focus:bg-white focus:border-purple-500", :id "inline-full-name", :type "text", :value "Jane Doe"}]]]
 [:div {:class "md:flex md:items-center mb-6"}
  [:div {:class "md:w-1/3"}
   [:label {:class "block text-gray-500 font-bold md:text-right mb-1 md:mb-0 pr-4", :for "inline-username"} ]]
  [:div {:class "md:w-2/3"}
   [:input {:class "bg-gray-200 appearance-none border-2 border-gray-200 rounded w-full py-2 px-4 text-gray-700 leading-tight focus:outline-none focus:bg-white focus:border-purple-500", :id "inline-username", :type "password", :placeholder "******************"}]]]
 [:div {:class "md:flex md:items-center mb-6"}
  [:div {:class "md:w-1/3"}]
  [:label {:class "md:w-2/3 block text-gray-500 font-bold"}
   [:input {:class "mr-2 leading-tight", :type "checkbox"}]
   [:span {:class "text-sm"} "Send me your newsletter!"]]]
 [:div {:class "md:flex md:items-center"}
  [:div {:class "md:w-1/3"}]
  [:div {:class "md:w-2/3"}
   [:button {:class "shadow bg-purple-500 hover:bg-purple-400 focus:shadow-outline focus:outline-none text-white font-bold py-2 px-4 rounded", :type "button"} "Sign Up"]]]])

(defn form-grid []
  [:form {:class "w-full max-w-lg"}
 [:div {:class "flex flex-wrap -mx-3 mb-6"}
  [:div {:class "w-full md:w-1/2 px-3 mb-6 md:mb-0"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-first-name"} "First Name"]
   [:input {:class "appearance-none block w-full bg-gray-200 text-gray-700 border border-red-500 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white", :id "grid-first-name", :type "text", :placeholder "Jane"}]
   [:p {:class "text-red-500 text-xs italic"} "Please fill out this field."]]
  [:div {:class "w-full md:w-1/2 px-3"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-last-name"} "Last Name"]
   [:input {:class "appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500", :id "grid-last-name", :type "text", :placeholder "Doe"}]]]
 [:div {:class "flex flex-wrap -mx-3 mb-6"}
  [:div {:class "w-full px-3"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-password"} ]
   [:input {:class "appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white focus:border-gray-500", :id "grid-password", :type "password", :placeholder "******************"}]
   [:p {:class "text-gray-600 text-xs italic"} "Make it as long and as crazy as you&#39;d like"]]]
 [:div {:class "flex flex-wrap -mx-3 mb-2"}
  [:div {:class "w-full md:w-1/3 px-3 mb-6 md:mb-0"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-city"} ]
   [:input {:class "appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500", :id "grid-city", :type "text", :placeholder "Albuquerque"}]]
  [:div {:class "w-full md:w-1/3 px-3 mb-6 md:mb-0"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-state"} ]
   [:div {:class "relative"}
    [:select {:class "block appearance-none w-full bg-gray-200 border border-gray-200 text-gray-700 py-3 px-4 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-gray-500", :id "grid-state"}
     [:option "New Mexico"]
     [:option "Missouri"]
     [:option "Texas"]]
    [:div {:class "pointer-events-none absolute inset-y-0 right-0 flex items-center px-2 text-gray-700"}
     [:svg {:class "fill-current h-4 w-4", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
      [:path {:d "M9.293 12.95l.707.707L15.657 8l-1.414-1.414L10 10.828 5.757 6.586 4.343 8z"}]]]]]
  [:div {:class "w-full md:w-1/3 px-3 mb-6 md:mb-0"}
   [:label {:class "block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2", :for "grid-zip"} ]
   [:input {:class "appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500", :id "grid-zip", :type "text", :placeholder "90210"}]]]])

(defn underline-form []
  [:form {:class "w-full max-w-sm"}
 [:div {:class "flex items-center border-b border-b-2 border-teal-500 py-2"}
  [:input {:class "appearance-none bg-transparent border-none w-full text-gray-700 mr-3 py-1 px-2 leading-tight focus:outline-none", :type "text", :placeholder "Jane Doe", :aria-label "Full name"}]
  [:button {:class "flex-shrink-0 bg-teal-500 hover:bg-teal-700 border-teal-500 hover:border-teal-700 text-sm border-4 text-white py-1 px-2 rounded", :type "button"} "Sign Up"]
  [:button {:class "flex-shrink-0 border-transparent border-4 text-teal-500 hover:text-teal-800 text-sm py-1 px-2 rounded", :type "button"} ]]])

(defn custom-select []
  [:div {:class "inline-block relative w-64"}
 [:select {:class "block appearance-none w-full bg-white border border-gray-400 hover:border-gray-500 px-4 py-2 pr-8 rounded shadow leading-tight focus:outline-none focus:shadow-outline"}
  [:option "Really long option that will likely overlap the chevron"]
  [:option "Option 2"]
  [:option "Option 3"]]
 [:div {:class "pointer-events-none absolute inset-y-0 right-0 flex items-center px-2 text-gray-700"}
  [:svg {:class "fill-current h-4 w-4", :xmlns "http://www.w3.org/2000/svg", :viewbox "0 0 20 20"}
   [:path {:d "M9.293 12.95l.707.707L15.657 8l-1.414-1.414L10 10.828 5.757 6.586 4.343 8z"}]]]])



;;NAVIGATION;;

(defn simple-nav []
  [:ul {:class "flex"}
 [:li {:class "mr-6"}
  [:a {:class "text-blue-500 hover:text-blue-800", :href "#"} "Active"]]
 [:li {:class "mr-6"}
  [:a {:class "text-blue-500 hover:text-blue-800", :href "#"} "Link"]]
 [:li {:class "mr-6"}
  [:a {:class "text-blue-500 hover:text-blue-800", :href "#"} "Link"]]
 [:li {:class "mr-6"}
  [:a {:class "text-gray-400 cursor-not-allowed", :href "#"} "Disabled"]]])

  (defn responsive-nav []
    [:nav {:class "flex items-center justify-between flex-wrap bg-teal-500 p-6"}
 [:div {:class "flex items-center flex-shrink-0 text-white mr-6"}
  [:svg {:class "fill-current h-8 w-8 mr-2", :width "54", :height "54", :viewbox "0 0 54 54", :xmlns "http://www.w3.org/2000/svg"}
   [:path {:d "M13.5 22.1c1.8-7.2 6.3-10.8 13.5-10.8 10.8 0 12.15 8.1 17.55 9.45 3.6.9 6.75-.45 9.45-4.05-1.8 7.2-6.3 10.8-13.5 10.8-10.8 0-12.15-8.1-17.55-9.45-3.6-.9-6.75.45-9.45 4.05zM0 38.3c1.8-7.2 6.3-10.8 13.5-10.8 10.8 0 12.15 8.1 17.55 9.45 3.6.9 6.75-.45 9.45-4.05-1.8 7.2-6.3 10.8-13.5 10.8-10.8 0-12.15-8.1-17.55-9.45-3.6-.9-6.75.45-9.45 4.05z"}]]
  [:span {:class "font-semibold text-xl tracking-tight"} "Tailwind CSS"]]
 [:div {:class "block lg:hidden"}
  [:button {:class "flex items-center px-3 py-2 border rounded text-teal-200 border-teal-400 hover:text-white hover:border-white"}
   [:svg {:class "fill-current h-3 w-3", :viewbox "0 0 20 20", :xmlns "http://www.w3.org/2000/svg"}
    [:title "Menu"]
    [:path {:d "M0 3h20v2H0V3zm0 6h20v2H0V9zm0 6h20v2H0v-2z"}]]]]
 [:div {:class "w-full block flex-grow lg:flex lg:items-center lg:w-auto"}
  [:div {:class "text-sm lg:flex-grow"}
   [:a {:href "#responsive-header", :class "block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white mr-4"} ]
   [:a {:href "#responsive-header", :class "block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white mr-4"} ]
   [:a {:href "#responsive-header", :class "block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white"} ]]
  [:div  
   [:a {:href "#", :class "inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"} "Download"]]]])

(defn tab-nav []
  [:ul {:class "flex border-b"}
 [:li {:class "-mb-px mr-1"}
  [:a {:class "bg-white inline-block border-l border-t border-r rounded-t py-2 px-4 text-blue-700 font-semibold", :href "#"} "Active"]]
 [:li {:class "mr-1"}
  [:a {:class "bg-white inline-block py-2 px-4 text-blue-500 hover:text-blue-800 font-semibold", :href "#"} "Tab"]]
 [:li {:class "mr-1"}
  [:a {:class "bg-white inline-block py-2 px-4 text-blue-500 hover:text-blue-800 font-semibold", :href "#"} "Tab"]]
 [:li {:class "mr-1"}
  [:a {:class "bg-white inline-block py-2 px-4 text-gray-400 font-semibold", :href "#"} "Tab"]]])

(defn pill-nav []
  [:ul {:class "flex"}
 [:li {:class "mr-3"}
  [:a {:class "inline-block border border-blue-500 rounded py-1 px-3 bg-blue-500 text-white", :href "#"} "Active Pill"]]
 [:li {:class "mr-3"}
  [:a {:class "inline-block border border-white rounded hover:border-gray-200 text-blue-500 hover:bg-gray-200 py-1 px-3", :href "#"} "Pill"]]
 [:li {:class "mr-3"}
  [:a {:class "inline-block py-1 px-3 text-gray-400 cursor-not-allowed", :href "#"} "Disabled Pill"]]])

(defn stretch-nav []
  [:ul {:class "flex"}
 [:li {:class "flex-1 mr-2"}
  [:a {:class "text-center block border border-blue-500 rounded py-2 px-4 bg-blue-500 hover:bg-blue-700 text-white", :href "#"} "Active Item"]]
 [:li {:class "flex-1 mr-2"}
  [:a {:class "text-center block border border-white rounded hover:border-gray-200 text-blue-500 hover:bg-gray-200 py-2 px-4", :href "#"} "Nav Item"]]
 [:li {:class "text-center flex-1"}
  [:a {:class "block py-2 px-4 text-gray-400 cursor-not-allowed", :href "#"} "Disabled Item"]]])

(defn justified-nav []
  [:ul {:class "flex justify-between"}
 [:li {:class "mr-3"}
  [:a {:class "inline-block border border-blue-500 rounded py-2 px-4 bg-blue-500 hover:bg-blue-700 text-white", :href "#"} "Active Pill"]]
 [:li {:class "mr-3"}
  [:a {:class "inline-block border border-white rounded hover:border-gray-200 text-blue-500 hover:bg-gray-200 py-2 px-4", :href "#"} "Pill"]]
 [:li {:class "mr-3"}
  [:a {:class "inline-block py-2 px-4 text-gray-400 cursor-not-allowed", :href "#"} "Disabled Pill"]]])

