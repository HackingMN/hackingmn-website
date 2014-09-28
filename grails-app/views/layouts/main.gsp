<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
	<!-- start: Meta -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title><g:layoutTitle default="Groovy Users of MN" /></title>

	<meta name="description" content="Hacking MN" />
	<meta name="keywords" content="Hacking, Making, Usergroup" />
	<!-- end: Meta -->

	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- end: Mobile Specific -->

	<!-- start: Facebook Open Graph -->
	<meta property="og:title" content="Hacking MN" />
	<meta property="og:description" content="A group who is primarily focused towards makers, hackers, and builders, meeting once a month to bring cool ideas to life." />
	<meta property="og:type" content="website" />
	<meta property="og:url" content="http://hacking.mn" />
	<meta property="og:image" content="" />
	<!-- end: Facebook Open Graph -->

	<!-- start: CSS -->
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Droid+Sans:400,700">
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Droid+Serif">
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Boogaloo">
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Economica:700,400italic">
	<!-- end: CSS -->

	%{--<g:external file="/favicon.ico" />--}%

	<g:layoutHead />

	<r:require module="bootstrap" />
	<r:require module="fancybox" />
	<r:require module="common" />
	<r:require module="modernizr" />
	<r:require module="portfolio" />
	<r:require module="social" />
	<r:require module="prettify" />

	<r:layoutResources />

	<g:render template="/analyticsJS" />
</head>

<body>
	<g:render template="/nav/top" />
	<g:layoutBody />
	<g:render template="/footer/index" />

	<r:layoutResources />

	<g:render template="/barometerJS" />
</body>
</html>
