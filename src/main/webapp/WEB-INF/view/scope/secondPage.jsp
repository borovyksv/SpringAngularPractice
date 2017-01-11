<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
    <jsp:body>
        <!-- Page Content -->
        <div class="container">

            <!-- Page Heading/Breadcrumbs -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Сохранение объекта
                        <small>в session, request, view scope</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a>
                        </li>
                        <li class="active">Пример работы с scope</li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <c:url value="/delete_session" var="invalidateSession" />

            <!-- Content Row -->
            <div class="row">

                <div class="col-lg-12">
                    Введенное имя: ${userJSP.name};
                    <br/>
                    Введенный пароль: ${userJSP.password};
                </div>
                <p> <a href="${invalidateSession}">Invalidate Session</a> </p>

            </div>
            <!-- /.row -->

            <hr>

        </div>
        <!-- /.container -->
    </jsp:body>
</page:template>
