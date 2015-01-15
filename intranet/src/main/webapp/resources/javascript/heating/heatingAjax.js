$(document).ready(
		function() {
			$("#newHeatingForm").hide();
			$(".zoneSelect").click(function() {
				$("#newHeatingForm").show();
				zone = $(this).data("zone");
				loadData();
			})

			$("#submitHeatingData").click(
					function() {
						var starttime = $("#starttime").timepicker(
								'getSecondsFromMidnight') * 1000 - 3600000;
						var stoptime = $("#stoptime").timepicker(
								'getSecondsFromMidnight') * 1000 - 3600000;
						var monday = $("#ma").is(":checked");
						var tuesday = $("#di").is(":checked");
						var wednesday = $("#woe").is(":checked");
						var thursday = $("#don").is(":checked");
						var friday = $("#vrij").is(":checked");
						var saturday = $("#za").is(":checked");
						var sunday = $("#zo").is(":checked");
						$.ajax({
							type : "POST",
							url : "heating/" + zone,
							data : JSON.stringify({
								ma : monday,
								di : tuesday,
								woe : wednesday,
								don : thursday,
								vrij : friday,
								za : saturday,
								zo : sunday,
								starttime : starttime,
								stoptime : stoptime,
								zone : zone
							}),
							success : function() {
								alert("aaa");
							},
							dataType : "json",
							headers : {
								'Accept' : 'application/json',
								'Content-Type' : 'application/json'
							}
						});
						$('#newHeatingForm').each(function() {
							this.reset();
						});
						setTimeout(function() {
							loadData();

						}, 100);
					});

			$(".tableRight").on(
					"click",
					".editButton",
					function() {
						var id = $(this).data("id");
						var starttime = $("#starttime" + id).timepicker(
								'getSecondsFromMidnight') * 1000 - 3600000;
						var stoptime = $("#stoptime" + id).timepicker(
								'getSecondsFromMidnight') * 1000 - 3600000;
						var monday = $("#ma" + id).is(":checked");
						var tuesday = $("#di" + id).is(":checked");
						var wednesday = $("#woe" + id).is(":checked");
						var thursday = $("#don" + id).is(":checked");
						var friday = $("#vrij" + id).is(":checked");
						var saturday = $("#za" + id).is(":checked");
						var sunday = $("#zo" + id).is(":checked");
						$.ajax({
							type : "POST",
							url : "heatingedit",
							data : JSON.stringify({
								id : id,
								ma : monday,
								di : tuesday,
								woe : wednesday,
								don : thursday,
								vrij : friday,
								za : saturday,
								zo : sunday,
								starttime : starttime,
								stoptime : stoptime,
								zone : zone
							}),
							success : function() {
								alert("aaa");
							},
							dataType : "json",
							headers : {
								'Accept' : 'application/json',
								'Content-Type' : 'application/json'
							}
						});

					});

			$(".tableRight").on(
					"click",
					".removeButton",
					function() {
						var id = $(this).data("id");
						var starttime = $("#starttime" + id).timepicker(
								'getSecondsFromMidnight') * 1000;
						var stoptime = $("#stoptime" + id).timepicker(
								'getSecondsFromMidnight') * 1000;
						var monday = $("#ma" + id).is(":checked");
						var tuesday = $("#di" + id).is(":checked");
						var wednesday = $("#woe" + id).is(":checked");
						var thursday = $("#don" + id).is(":checked");
						var friday = $("#vrij" + id).is(":checked");
						var saturday = $("#za" + id).is(":checked");
						var sunday = $("#zo" + id).is(":checked");
						$.ajax({
							type : "POST",
							url : "heatingdelete",
							data : JSON.stringify({
								id : id,
								ma : monday,
								di : tuesday,
								woe : wednesday,
								don : thursday,
								vrij : friday,
								za : saturday,
								zo : sunday,
								starttime : starttime,
								stoptime : stoptime,
								zone : zone
							}),
							success : function() {
								alert("aaa");
							},
							dataType : "json",
							headers : {
								'Accept' : 'application/json',
								'Content-Type' : 'application/json'
							}
						});
						setTimeout(function() {
							loadData();

						}, 100);
					});

			function loadData() {
				$.get("heating/" + zone, function(data) {
					var source = $("#heatingObj").html();
					var template = Handlebars.compile(source);
					var html = template(data);
					$('#HeatingResults').html(html);
					$(".time").each(
							function() {
								$(this).timepicker();
								if ($(this).val() != "") {
									$(this).timepicker("setTime",
											new Date(parseInt($(this).val())));
								}
							});
				});
			}
			
			$(".slider").on('switchChange.bootstrapSwitch', function (e, data){
				var nr = $(this).attr("id");
				var val = $(this).prop("checked");
				console.log(nr);
				console.log(val);
				$.ajax({
					type: "POST",
					url: "heating",
					data: JSON.stringify({nr: nr, value: val}),
					dataType: "json",
					contentType: 'application/json',
					succes: function(){
						alert("yes, it works");
					},
					error: function() {}
				});
			});
		});
