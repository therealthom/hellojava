<%-- 
    Document   : team1
    Created on : 12-oct-2017, 0:20:28
    Author     : thom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Workshop-CUI</title>
    </head>
    <body>
        <h1>TEAM 3 Result</h1>
        <br/>
        <table>
            <tr>
                <td>Resultado: </td>
                <td><%=request.getAttribute("result")%></td>
            </tr>
        </table>
        <br/>
        <br/>
        <a href="team1.jsp">Regresar</a>
</html>
