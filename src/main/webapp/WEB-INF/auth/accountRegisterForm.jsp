<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include.jsp"%>

<div>
	<h3>新規登録フォーム</h3>
	<c:url var="loginUrl" value="/register" />
	<form:form action="${loginUrl}" modelAttribute="accountRegistrationForm">
		<table>
			<tr>
				<td><label for="username">ユーザー名</label></td>
				<td><form:input path="userName"></form:input></td>
			</tr>
			<tr>
				<td><label for="password">パスワード</label></td>
				<td><form:input path="password"></form:input></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><button type="submit">登録</button></td>
			</tr>
		</table>

	</form:form>


</div>