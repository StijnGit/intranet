<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertTemplate template="../templates/template.jsp">
	<tiles:putAttribute name="content" cascade="true">
		<div class="content">
			<form:form action="lighting" method="post">
				<div class="tableLeft">
					<div class="rounded-corners group">
						<table>
							<tr>
								<th width="200">Gelijkvloers</th>
								<th width="60">Status</th>
							</tr>
							<tr>
								<td>
									<c:out value="${outputs[20].name}"></c:out>
								</td>								
								<td>
									
								</td>
						</table>
					</div>
					<br>
					<div class="rounded-corners group">
						<table>
							<tr>
								<th width="200">Zolder</th>
								<th width="60">Status</th>
							</tr>
							
						</table>
					</div>
				</div>
				<div class="tableRight">
				<div class="rounded-corners group">
				<table>
						<tr>
							<th width="200">Eerste verdieping</th>
							<th width="60">Status</th>
						</tr>
					</table>
					</div>

					<br>
					<input type="submit" value="aanpassen">
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