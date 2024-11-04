<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../../includes/adm-header.jsp" %>



	private String user_id;
	private String user_pwd;
	private String user_name;
	private String user_nickname;
	private String user_gender;
	private String user_mail;
	private String user_phone;
	private String user_zipcode;
	private String user_address;
	private int user_type;
	private int user_pms;
	private Date user_reg_date;
	private Date user_up_date;


<form>
	<ul>
		<li>
			<input type="text" name="user_id" placeholder="아이디입력" required autofocus>
			<button type="button" onclick="idCheck()">아이디중복확인</button>
		</li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		<li><input type="text" name="user_name" placeholder="이름입력" required></li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		<li><input type="password" name="user_pwd" placeholder="비밀번호입력" required></li>
		
	</ul>

</form>















<%@include file="../../includes/adm-footer.jsp" %>