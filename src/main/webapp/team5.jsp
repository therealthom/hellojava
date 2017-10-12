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
        <h1>TEAM 5</h1>
        <form name="team1frm" action="/Team1Controller" method="POST">
            <table>
                <tr>
                    <td>Reto 1 - Entrada:</td>
                    <td>
                        <input name="entrada1" type="text" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>Reto 2 - Entrada:</td>
                    <td>
                        <input name="entrada2" type="text" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>Reto 3 - Entrada:</td>
                    <td>
                        <input name="entrada3" type="text" value=""/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">                        
                        <input type="submit" value="Enviar"/>
                    </td>
                </tr>
            </table>
        </form>
        <br/>
        <br/>
        <a href="index.jsp">Inicio</a>
</html>
