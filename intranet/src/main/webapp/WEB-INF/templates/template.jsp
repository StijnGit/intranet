<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/mystyle.css" type="text/css">

<script type="text/JavaScript" src="javascript/jquery-1.9.1.min.js"></script>

<link rel="stylesheet" href="css/jquery-ui-1.10.1.custom.css" type="text/css">
<script type="text/javascript" src="javascript/jquery-ui-1.10.1.custom.min.js"></script>

<link href="css/bootstrap3/bootstrap-switch.css" rel="stylesheet">
<script src="javascript/bootstrap-switch-3.0.2/dist/js/bootstrap-switch.js"></script>

<link href="css/jquery.timepicker.css" rel="stylesheet">
<script src="javascript/jquery-timepicker/jquery.timepicker.js"></script>

<script type="text/javascript" src="javascript/handlebars-v2.0.0.js"></script>


<script>
	$(function() {
		$("#sortable").sortable();
		$("#sortable").disableSelection();
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".slider").bootstrapSwitch();
	});
</script>

<script type="text/javascript">
	$(document).ready(function(){
		$(".time").timepicker();
	});
</script>


<script>
$(document).ready(function(){
	$(".cursor").css('cursor', 'pointer');
});
</script>


<title>Intranet</title>
</head>
<body>

	<script type="text/javascript">
		$(function() {
			$(".temperatur").click(function() {
				window.location = "heating";
			});
			$(".lighting").click(function() {
				window.location = "lighting";
			});
			$(".energy").click(function() {
				window.location = "http://monitoring.solaredge.com/";
			});
			$(".metering").click(function() {
				window.location = "metering";
			});
			$(".remote").click(function() {
				window.location = "http://lamperstraat21.no-ip.org:9091/transmission/web/#confirm";
			});
			$(".monitoring").click(function() {
				window.location = "monitoring";
			});
			$(".AudioVideo").click(function() {
				window.location = "http://acacia.plethra.com/";
			});
			$(".security").click(function() {
				window.location = "security";
			});

			$(".button-menu-img").css('cursor', 'pointer');
		});
	</script>

	<div id="wrapper" class=rounded-corners>
		<div id="menu-wrapper">
			<div id="titel">Lamperstraat 21</div>

			<div id="buttons">
				<div class="icon temperatur button-menu-img"></div>
				<div class="icon lighting button-menu-img"></div>
				<div class="icon energy button-menu-img"></div>
				<div class="icon metering button-menu-img"></div>
				<div class="icon remote button-menu-img"></div>
				<div class="icon monitoring button-menu-img"></div>
				<div class="icon AudioVideo button-menu-img"></div>
				<div class="icon security button-menu-img"></div>
			</div>
		</div>
		<tiles:getAsString name="content" />
	</div>
	<tiles:getAsString name="footer" />
	<tiles:getAsString name="scripts" ignore="true"/>
</body>
</html>