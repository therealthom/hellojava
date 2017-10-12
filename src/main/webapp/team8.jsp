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
        <h1>TEAM 8</h1>
        <form name="team1frm" action="/Team1Controller" method="POST">
            <table>
                <tr>
                    <td>Entrada:</td>
                    <td>
                        <input name="entrada" type="text" value=""/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">                        
                        <input type="submit" value="Enviar"/>
                    </td>
                </tr>
            </table>
        </form>
</html>
