class UrlMappings {
	static mappings = {
		"/$controller/$action?/$id?" {
			constraints {
				// Apply constraints here
			}
		}

		"/"(controller: "pages", action: "home")
		"/index"(controller: "pages", action: "home")
		"/home"(controller: "pages", action: "home")
		"/projects"(controller: "pages", action: "projects")
		"/location"(controller: "pages", action: "location")
		"/calendar"(controller: "pages", action: "calendar")

		"500"(view: '/error')
	}
}
