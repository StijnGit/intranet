<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertTemplate template="../templates/template.jsp">
	<tiles:putAttribute name="content" cascade="true">
		<div class="content">
			<div class="tableLeft">
				<form:form action="heating">
					<div class="rounded-corners group">
						<table class="zoneSelect cursor" data-zone="living">
							<tr>
								<th width="200">Leefruimte:</th>
								<th width="60">Status:</th>
							</tr>
							<tr>
								<td><c:out
										value="Thermostaat"></c:out></td>
								<td><form:checkbox path="plcInputData[0].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td><c:out
										value="Tijdsturing"></c:out></td>
								<td><form:checkbox id="48" path="plcMerkerData[32].value"
										cssClass="slider" /></td>
							</tr>
						</table>
					</div>
					<br>
					<div class="rounded-corners group">		
						<table class="zoneSelect cursor" data-zone="badkamer">
							<tr>
								<th width="200">Badkamer:</th>
								<th width="60">Status:</th>
							</tr>
							<tr>
								<td><c:out
										value="Thermostaat"></c:out></td>
								<td><form:checkbox path="plcInputData[1].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td><c:out
										value="Tijdsturing"></c:out></td>
								<td><form:checkbox id="49" path="plcMerkerData[33].value"
										cssClass="slider" /></td>
							</tr>
						</table>
					</div>
					<br>
					<div class="rounded-corners group">
						<table class="zoneSelect cursor" data-zone="zolder">
							<tr>
								<th width="200">Zolder:</th>
								<th width="60">Status:</th>
							</tr>
							<tr>
								<td><c:out
										value="Thermostaat"></c:out></td>
								<td><form:checkbox path="plcInputData[2].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td ><c:out
										value="Tijdsturing"></c:out></td>
								<td><form:checkbox id="50" path="plcMerkerData[34].value"
										cssClass="slider" /></td>
							</tr>
						</table>
					</div>
					<br>
					<div class="rounded-corners group">
						<table>
							<tr>
								<th width="200">Toestel:</th>
								<th width="60">Status:</th>
							</tr>
							<tr>
								<td><c:out value="${output[3].name}"></c:out></td>
								<td><form:checkbox path="plcOutputData[3].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td><c:out value="${output[2].name}"></c:out></td>
								<td><form:checkbox path="plcOutputData[2].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td><c:out value="${output[1].name}"></c:out></td>
								<td><form:checkbox path="plcOutputData[1].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
							<tr>
								<td><c:out value="${output[0].name}"></c:out></td>
								<td><form:checkbox path="plcOutputData[0].value"
										cssClass="slider" readonly="true"/></td>
							</tr>
						</table>
					</div>
				</form:form>
			</div>
			<div class="tableRight">
				<form:form id="newHeatingForm" method="post">
					<div class="rounded-corners group">
						<table>
							<tr>
								<th width="200">Instellingen:</th>
								<th width="40">Waarde:</th>
							</tr>
							<tr>
								<td>Start regeling:</td>
								<td><input type="text" id="starttime" name="starttime" class="time"/></td>
							</tr>
							<tr>
								<td>Stop regeling:</td>
								<td><input type="text" id="stoptime" name="stoptime" class="time"/></td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="checkbox" name="ma" id="ma" value="true"/><label for="ma">Ma</label> 
									<input type="checkbox" name="di" id="di" value="true"/><label for="di">Di</label> 
									<input type="checkbox" name="woe" id="woe" value="true"/><label for="woe">Wo</label>
									<input type="checkbox" name="don" id="don" value="true"/><label for="don">Do</label>
									<input type="checkbox" name="vrij" id="vrij" value="true"/><label for="vrij">Vr</label>
									<input type="checkbox" name="za" id="za" value="true"/><label for="za">Za</label>
									<input type="checkbox" name="zo" id="zo" value="true"/><label for="zo">Zo</label>
								</td>
							</tr>
							<tr>
								<td><input id="submitHeatingData" type="button" value="Toevoegen"></td>
							</tr>
						</table>
					</div>
				</form:form>
					<br>
					<div id="HeatingResults">
					</div>
			</div>
		</div>
	</tiles:putAttribute>
	<tiles:putAttribute name="footer" cascade="true">
		<div id="footer">
			<p>Stijn Claessens 2014 ©</p>
		</div>
	</tiles:putAttribute>
	<tiles:putAttribute name="scripts" cascade="true">
		<script type="text/javascript" src="javascript/heating/heatingAjax.js"></script>
	
		<script id="heatingObj" type="text/x-handlebars-template">
					{{#each this}}
					<form:form id="editHeatingForm" method="post">
  						<div class="rounded-corners group">
							<table>
								<input type="hidden" id="id{{id}}" value="{{id}}"/>
								<tr>
									<th width='200'>
										Instellingen:
									</th>
									<th width='40'>
										Waarde:
									</th>
								</tr>
								<tr>
									<td>
										Start regeling:
									</td>
									<td>
										<input type="text" id="starttime{{id}}"Class="time" value="{{starttime}}"/>
									</td>
								</tr>
								<tr>
									<td>
										Stop regeling:
									</td>
									<td>
										<input type='text' id="stoptime{{id}}" class='time' value="{{stoptime}}">
									</td>
								</tr>
								<tr>
									<td colspan='2'>
										<input type='checkbox' id="ma{{id}}" {{#if ma}}checked{{/if}} name='maandag' id='1'/><label for="ma">Ma</label>
										<input type='checkbox' id="di{{id}}" {{#if di}}checked{{/if}} name='dinsdag' id='2'/><label for="di">Di</label> 
										<input type='checkbox' id="woe{{id}}" {{#if woe}}checked{{/if}} name='woensdag' id='3'/><label for="woe">Wo</label> 
										<input type='checkbox' id="don{{id}}" {{#if don}}checked{{/if}} name='donderdag' id='4'/><label for="don">Do</label> 
										<input type='checkbox' id="vrij{{id}}" {{#if vrij}}checked{{/if}} name='vrijdag' id='5'/><label for="vrij">Vr</label> 
										<input type='checkbox' id="za{{id}}" {{#if za}}checked{{/if}} name='zaterdag' id='6'><label for="za">Za</label> 
										<input type='checkbox' id="zo{{id}}" {{#if zo}}checked{{/if}} name='zondag' id='7'/><label for="zo">Zo</label>
									</td>
								</tr>
								<tr>
									<td>
										<input type="button" id="submitHeatingEdit{{id}}" data-id="{{id}}" class="editButton" value="Wijzigen">
									</td>
									<td>
										<input type="button" id="submitHeatingDelete{{id}}" data-id="{{id}}" class="removeButton" value="Verwijderen">
									</td> 
								</tr>
							</table>
						</div>
						</form:form>
						<br>
					{{/each}}
		</script>
	</tiles:putAttribute>
</tiles:insertTemplate>