package gum

class NavLinkTagLib {
	static namespace = "nav"

	def link = { attrs ->
		log.debug "attrs: $attrs"

		def action = attrs.remove('action')
		if (!action) {
			throwTagError("Tag [${attrs.tagName}] is missing required attribute [action]")
		}

		def href = attrs.remove('href')
		if (!href) {
			throwTagError("Tag [${attrs.tagName}] is missing required attribute [href]")
		}

		def value = attrs.remove('value')
		if (!value) {
			throwTagError("Tag [${attrs.tagName}] is missing required attribute [value]")
		}

		out << """<li class="${action == href ? 'active' : ''}"><a href="${href}">${value}</a></li>"""
	}
}
