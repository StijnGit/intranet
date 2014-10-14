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
									<c:out value="${output[16].name}"></c:out>
									
								</td>								
								<td>
									<form:checkbox id="16" path="plcOutputData[16].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[20].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="20" path="plcOutputData[20].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[21].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="21" path="plcOutputData[21].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[22].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="22" path="plcOutputData[22].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[23].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="23" path="plcOutputData[23].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[24].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="24" path="plcOutputData[24].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[25].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="25" path="plcOutputData[25].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[26].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="26" path="plcOutputData[26].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[27].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="27" path="plcOutputData[27].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[28].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="28" path="plcOutputData[28].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[29].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="29" path="plcOutputData[29].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[30].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="30" path="plcOutputData[16].value" cssClass="slider"/>
								</td>
							</tr>
							<tr>
								<td>
									<c:out value="${output[31].name}"></c:out>	
								</td>
								<td>
									<form:checkbox id="31" path="plcOutputData[31].value" cssClass="slider"/>
								</td>
							</tr>
						</table>
					</div>
					<br>
					<div class="rounded-corners group">
						<table>
							<tr>
								<th width="200">Zolder</th>
								<th width="60">Status</th>
							</tr>
							<tr>
							<td>
								<c:out value="${output[13].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="13" path="plcOutputData[13].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[14].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="14" path="plcOutputData[16].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[15].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="15" path="plcOutputData[15].value" cssClass="slider"/>
							</td>
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
						<tr>
							<td>
								<c:out value="${output[4].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="4" path="plcOutputData[4].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[5].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="5" path="plcOutputData[5].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[8].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="8" path="plcOutputData[8].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[9].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="9" path="plcOutputData[9].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[10].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="10" path="plcOutputData[10].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[11].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="11" path="plcOutputData[11].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[12].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="12" path="plcOutputData[12].value" cssClass="slider"/>
							</td>
						</tr>
						<tr>
							<td>
								<c:out value="${output[17].name}"></c:out>	
							</td>
							<td>
								<form:checkbox id="17" path="plcOutputData[17].value" cssClass="slider"/>
							</td>
						</tr>
					</table>
					</div>
				</div>
			</form:form>
		</div>
		
		<script type="text/javascript">
		$(".slider").change(function() {
		   var state = this.checked;
		   var nr = this.id;

		   
		});
		</script>
		
	</tiles:putAttribute>
	<tiles:putAttribute name="footer" cascade="true">
		<div id="footer">
			<p>Stijn Claessens 2012 �</p>
		</div>
	</tiles:putAttribute>
</tiles:insertTemplate>