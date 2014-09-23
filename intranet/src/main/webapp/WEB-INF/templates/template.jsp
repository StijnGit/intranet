<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/mystyle.css" type="text/css">
<script type="text/JavaScript" src="javascript/jquery-1.9.1.min.js"></script>
<link rel="stylesheet" href="css/jquery-ui-1.10.1.custom.css"
	type="text/css">
<script type="text/javascript"
	src="javascript/jquery-ui-1.10.1.custom.min.js"></script>
<script>
	$(function() {
		$("#sortable").sortable();
		$("#sortable").disableSelection();
	});
</script>

<script src="javascript/ios-checkboxes/iphone-style-checkboxes.js"></script>
<link rel="stylesheet" href="css/ios-checkboxes/style.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('.slider').iphoneStyle({
			checkedLabel : 'Aan',
			uncheckedLabel : 'Uit'
		});
	});
</script>

<script>
	$(document).ready(function(){
		$(".ThermLeefruimte").show();
		$(".ThermBadkamer").hide();
		$(".ThermZolder").hide();
		
		$(".btnLeefruimte").click(function(){
			if($(".ThermBadkamer").is(":visible")){
				$(".ThermBadkamer").fadeOut("slow", function(){
					$(".ThermLeefruimte").fadeIn("slow");
				});
			} else if ($(".ThermZolder").is(":visible")){
				$(".ThermZolder").fadeOut("slow", function(){
					$(".ThermLeefruimte").fadeIn("slow");
				});
			};
		});
	
		$(".btnBadkamer").click(function(){
			if($(".ThermLeefruimte").is(":visible")){
				$(".ThermLeefruimte").fadeOut("slow", function(){
					$(".ThermBadkamer").fadeIn("slow");
				});
				
			} else if ($(".ThermZolder").is(":visible")){
				$(".ThermZolder").fadeOut("slow", function(){
					$(".ThermBadkamer").fadeIn("slow");
				});
			};
		});
		
		$(".btnZolder").click(function(){
			if($(".ThermLeefruimte").is(":visible")){
				$(".ThermLeefruimte").fadeOut("slow", function(){
					$(".ThermZolder").fadeIn("slow");
				});
			} else if ($(".ThermBadkamer").is(":visible")){
				$(".ThermBadkamer").fadeOut("slow", function(){
					$(".ThermZolder").fadeIn("slow");
				});
			};
		});
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
				window.location = "energy";
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
</body>
</html>