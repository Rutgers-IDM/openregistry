<%@ page session="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
    <head>
        <c:choose>
            <c:when test="${not empty taskTitleCode}">
                <title>OpenRegistry <spring:message code="${taskTitleCode}" /> </title>
            </c:when>
            <c:otherwise>
                <tiles:useAttribute id="key" name="titleCode"/>
                <title>OpenRegistry <spring:message code="${key}" /> </title>
            </c:otherwise>
        </c:choose>
        <tiles:insertAttribute name="head" />
    </head>
    <body class="nihilo">
        <c:choose>
            <c:when test="${not empty taskTitleCode}">
                <div id="header"><h1>OpenRegistry</h1><h2><spring:message code="${taskTitleCode}" /></h2></div>
            </c:when>
            <c:otherwise>
                <tiles:useAttribute id="key" name="titleCode"/>
                <div id="header"><h1>OpenRegistry</h1><h2><spring:message code="${key}" /></h2></div>
            </c:otherwise>
        </c:choose>
            <tiles:insertAttribute name="content" />
        </div>
        <div class="footer">
            <p><spring:message code="footer.copyright.text" /></p>
        </div>
    </body>
</html>