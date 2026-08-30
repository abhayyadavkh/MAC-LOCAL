<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb" %>

<spring:url var="storefrontContextRoot" value="${storefrontContextRoot}" />

<style>
    .hybrisTubeCustomInfoComponent {
        text-align: center; /* Center align text */
    }
    .hybrisTubeCustomInfoComponent_header_text {
        font-size: 36px; /* Increase font size */
        font-weight: bold;
        text-decoration: underline; /* Underline text */
    }
    .hybrisTubeContent_image {
        width: 65%; /* Reduce the size of the image by 35% */
        height: auto; /* Maintain aspect ratio */
        display: block;
        margin: 0 auto; /* Center the image */
    }
    .hybrisTubeContent_summary_text {
        font-size: 24px; /* Increase font size */
        margin-top: 20px;
    }
    .hybrisTubeContent_list_element a {
        font-size: 20px; /* Increase font size */
        font-weight: bold; /* Make text bold */
        color: blue; /* Change color to blue */
        text-decoration: none; /* Remove underline */
    }
    .hybrisTubeContent_list_element a:hover {
        text-decoration: underline; /* Add underline on hover */
    }
</style>

<div class="hybrisTubeCustomInfoComponent">
    <p class="hybrisTubeCustomInfoComponent_header_text">${hybrisTubeTitle}</p>
    <img alt="hybrisTubeContent Image" src="${hybrisTubeBannerImage.url}" class="hybrisTubeContent_image">
    <ul class="hybrisTubeContent_list">
        <c:forEach items="${hybrisTubeAvailablePackagesLinks}" var="hybrisTubeCustomInfoLink">
            <li class="hybrisTubeContent_list_element">
                <a href="${storefrontContextRoot}${hybrisTubeCustomInfoLink.url}"
                   data-target="${hybrisTubeCustomInfoLink.target}">
                   ${hybrisTubeCustomInfoLink.name}
                </a>
            </li>
        </c:forEach>
        <c:if test="${empty hybrisTubeAvailablePackagesLinks}">
            <li class="hybrisTubeContent_list_element">No HybrisTube Info available</li>
        </c:if>
    </ul>
    <p class="hybrisTubeContent_summary_text">${hybrisTubeInfoSummary}</p>
</div>

<script>
    document.addEventListener('DOMContentLoaded', function () {
        var links = document.querySelectorAll('.hybrisTubeContent_list a');
        links.forEach(function (link) {
            var target = link.getAttribute('data-target');
            if (target === 'NEWWINDOW') {
                link.setAttribute('target', '_blank');
            } else {
                link.setAttribute('target', '_self');
            }
        });
    });
</script>
