<%@ page import="java.lang.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.play.JavaclassExecuter" %>
<%
    InputStream is = new FileInputStream("c:/TestClass.class");
    byte[] b = new byte[is.available()];
    is.read(b);
    is.close();
    out.println("<textarea style='width:1000;height=800'>");
    out.println(JavaclassExecuter.execute(b));
    out.println("</textarea>");
%>