modules = {
	jquery {
		resource url: 'js/jquery-1.9.1.min.js'
	}
	bootstrap {
		dependsOn 'jquery'

		resource url: "css/bootstrap.css"
		resource url: "css/bootstrap-responsive.css"
		resource url: "js/bootstrap.min.js"
	}
	common {
		resource url: "css/style.css"
		resource url: "css/style-overrides.css"
		resource url: "css/skins/default.css"
		resource url: "css/bodybg/bg10.css"
		resource url: "css/custom-fonts.css"
		resource url: "css/font-awesome.css"
	}
	fancybox {
		dependsOn 'jquery'

		resource url: "css/fancybox/jquery.fancybox.css"
		resource url: "js/jquery.fancybox.pack.js"
		resource url: "js/jquery.fancybox-media.js"
	}

	slider {
		dependsOn 'jquery'
		dependsOn 'bootstrap'
		dependsOn 'common'
		dependsOn 'fancybox'

		resource url: "css/jcarousel.css"
		resource url: "css/flexslider.css"
		resource url: "css/slitslider.css"

		resource url: "js/jquery.easing.1.3.js"
		resource url: "js/jcarousel/jquery.jcarousel.min.js"
		resource url: "js/jquery.flexslider.js"
		resource url: "js/jquery.nivo.slider.js"
		resource url: "js/jquery.ba-cond.min.js"
		resource url: "js/jquery.slitslider.js"
		resource url: "js/animate.js"
		resource url: "js/custom.js"
	}
	modernizr {
		resource url: "js/modernizr.custom.79639.js"
	}
	portfolio {
		dependsOn 'jquery'

		resource url: "js/portfolio/jquery.quicksand.js"
		resource url: "js/portfolio/setting.js"
	}
	social {
		resource url: "js/tweet/jquery.tweet.js"
	}
	prettify {
		dependsOn 'jquery'

		resource url: "js/google-code-prettify/prettify.js"
	}
	timeago {
		dependsOn 'jquery'

		resource url: "js/jquery.timeago.js"
	}
	map {
		dependsOn 'jquery'

		resource url: "js/jquery.gmap.min.js"
	}
}