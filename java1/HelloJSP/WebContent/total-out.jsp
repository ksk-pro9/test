<%@ page errorPage="total-error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>total-out</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
int price=Integer.parseInt(request.getParameter("price"));
int count=Integer.parseInt(request.getParameter("count"));
int delivery=Integer.parseInt(request.getParameter("delivery"));
%>

<%=price %><%=count %>個＋送料<%=delivery %>円=<a></a>
<%=price*count+delivery %>円

</body>
</html>