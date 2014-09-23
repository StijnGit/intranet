<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertTemplate template="../templates/template.jsp">
	<tiles:putAttribute name="content" cascade="true">
		<div class="content">
			<form:form action="heating">
				<div class="tableLeft">
					<div class="rounded-corners group">

						<table>
							<tr>
								<th width="200">Thermostaat:</th>
								<th width="60">Status:</th>
							</tr>
							<tr>
								<td class="btnLeefruimte cursor">Leefruimte:</td>
							</tr>
							<tr>
								<td class="btnBadkamer cursor">Badkamer:</td>
							</tr>
							<tr>
								<td class="btnZolder cursor">Zolder:</td>
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
								<td>Ketel:</td>
							</tr>
							<tr>
								<td>Zoneventiel leefruimte:</td>
							</tr>
							<tr>
								<td>Zoneventiel badkamer:</td>
							</tr>
							<tr>
								<td>Zoneventiel zolder</td>
							</tr>
						</table>
					</div>
					<br>
					<input type="submit" value="aanpassen">
				</div>
				<div class="tableRight">
					<div class="rounded-corners group ThermLeefruimte">
						<table>
							<tr>
								<th width="200">Instellingen 1:</th>
								<th width="40">Waarde:</th>
							</tr>
							<tr>
								<td>Start 1 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 1 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Start 2 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 2 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="checkbox" name="maandag" id="1" value="true">Ma 
									<input type="checkbox" name="dinsdag" id="2" value="true">Di 
									<input type="checkbox" name="woensdag" id="3" value="true">Wo 
									<input type="checkbox" name="donderdag" id="4" value="true">Do 
									<input type="checkbox" name="vrijdag" id="5" value="true">Vr 
									<input type="checkbox" name="zaterdag" id="6" value="true">Za 
									<input type="checkbox" name="zondag" id="7" value="true">Zo
								</td>
							</tr>
						</table>
					</div>
					<div>
						<br class="ThermLeefruimte">
					</div>
					<div class="rounded-corners group ThermLeefruimte">
						<table>
							<tr>
								<th width="200">Instellingen 2:</th>
								<th width="40">Waarde:</th>
							</tr>
							<tr>
								<td>Start 1 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 1 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Start 2 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 2 regeling leefruimte:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td colspan="2"><input type="checkbox" name="maandag"
									value="true">Ma <input type="checkbox" name="dinsdag"
									value="true">Di <input type="checkbox" name="woensdag"
									value="true">Wo <input type="checkbox" name="donderdag"
									value="true">Do <input type="checkbox" name="vrijdag"
									value="true">Vr <input type="checkbox" name="zaterdag"
									value="true">Za <input type="checkbox" name="zondag"
									value="true">Zo</td>
							</tr>
						</table>
					</div>
					<div class="rounded-corners group ThermBadkamer">
						<table>
							<tr>
								<th width="200">Instellingen:</th>
								<th width="40">Waarde:</th>
							</tr>
							<tr>
								<td>Start 1 regeling badkamer:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 1 regeling badkamer:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Start 2 regeling badkamer:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 2 regeling badkamer:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td colspan="2"><input type="checkbox" name="maandag"
									value="true">Ma <input type="checkbox" name="dinsdag"
									value="true">Di <input type="checkbox" name="woensdag"
									value="true">Wo <input type="checkbox" name="donderdag"
									value="true">Do <input type="checkbox" name="vrijdag"
									value="true">Vr <input type="checkbox" name="zaterdag"
									value="true">Za <input type="checkbox" name="zondag"
									value="true">Zo</td>
							</tr>
						</table>
					</div>
					<div class="rounded-corners group ThermZolder">
						<table>
							<tr>
								<th width="200">Instellingen:</th>
								<th width="40">Waarde:</th>
							</tr>
							<tr>
								<td>Start 1 regeling zolder:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 1 regeling zolder:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Start 2 regeling zolder:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Stop 2 regeling zolder:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td colspan="2"><input type="checkbox" name="maandag"
									value="true">Ma <input type="checkbox" name="dinsdag"
									value="true">Di <input type="checkbox" name="woensdag"
									value="true">Wo <input type="checkbox" name="donderdag"
									value="true">Do <input type="checkbox" name="vrijdag"
									value="true">Vr <input type="checkbox" name="zaterdag"
									value="true">Za <input type="checkbox" name="zondag"
									value="true">Zo</td>
							</tr>
						</table>
					</div>
				</div>
			</form:form>
		</div>
	</tiles:putAttribute>
	<tiles:putAttribute name="footer" cascade="true">
		<div id="footer">
			<p>Stijn Claessens 2012 �</p>
		</div>
	</tiles:putAttribute>
</tiles:insertTemplate>