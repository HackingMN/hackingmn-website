package gum

class PagesController {
	static int DEFAULT = 5
	static int MAX = DEFAULT * DEFAULT

	def home() {
		log.debug "params: $params"
	}

	def projects() {
		log.debug "params: $params"
	}

	def location() {
		log.debug "params: $params"
	}

	def calendar() {
		log.debug "params: $params"

		def max = params.remove('max') ?: DEFAULT
		if (max > MAX) {
			max = MAX
		}

		return [max: max]
	}
}
