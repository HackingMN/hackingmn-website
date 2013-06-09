class UrlMappings {
	static mappings = {
		"/$controller/$action?/$id?" {
			constraints {
				// Apply constraints here
			}
		}

		"/"(controller: "pages", action: "index")
		"/calendar"(controller: "pages", action: "calendar")
		"/location"(controller: "pages", action: "location")
		"/home"(controller: "pages", action: "home")
		"/index"(controller: "pages", action: "home")

		"500"(view: '/error')
	}
}
