<%--

    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License.  You may obtain a
    copy of the License at the following location:

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

--%>
<!DOCTYPE html>

<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<style type="text/css">
		   * {
		   	padding: 0px;
		   	margin: 0px;
		   }

		   body {
		   	background-color: #e7edf3;
		   }

		   #container {
		   	margin: 200px auto;
		   	width: 430px;
		   	height: 326px;
		   	border-radius: 5px;
		   	
		   	background-color: white;
		   }

		   .login-title {
		   	height: 68px;

		   	color: #5563cd;
		   	font-size: 22px;
		   	line-height: 70px;
		   	padding-left: 25px;
		   	position:relative;
			border-top: 1px #b5bef4 solid;
			border-left: 1px #b5bef4 solid;
			border-right: 1px #b5bef4 solid;
			border-top-right-radius: 4px; border-top-left-radius: 4px;
		   }

		   .logo {
		   	float: right;
		   	height: 63px;
		   	position:absolute;
		   	right:0px;
			padding-right: 6px;
		   }
		   .inputDiv{
		   	position: relative;
		   }
		   .text-icon{
		   		position: relative;
				top: -38px;
				right: -357px;
		   }
		   .login-body .inputText {
		   	margin: 25px 25px;
		   	width: 360px;
		   	height: 50px;
		   }

		   .loginBtn {
		   	width: 90px;
		   	height: 35px;
		   	background-color: #7888ff;
		   	color: #fff;
		   	border-color: #7888ff;
		   }

		   .login-footer {
		   	margin: 25px 25px;
		   }

		   .floatD {
		   	float: left;
		   	height: 35px;
		   }
		 </style>
<html lang="en">
<head>
  <meta charset="UTF-8" />

  <title>CAS &#8211; Central Authentication Service</title>

  <spring:theme code="standard.custom.css.file" var="customCssFile" />
  <link rel="stylesheet" href="<c:url value="${customCssFile}" />" />
  <link rel="icon" href="<c:url value="/favicon.ico" />" type="image/x-icon" />

  <!--[if lt IE 9]>
    <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js" type="text/javascript"></script>
  <![endif]-->
</head>
<body id="cas">
  <div id="container">
  <div class="login-title">易鑫智能后台管理系统<img class="logo" src="images/logo.png"/></div>
  <!--
      <header>
        <a id="logo" href="http://cas.daikuan.com" title="<spring:message code="logo.title" />">yixin</a>
        <h1>易鑫智能后台管理系统222</h1>
      </header>
       -->
      <div id="content">
