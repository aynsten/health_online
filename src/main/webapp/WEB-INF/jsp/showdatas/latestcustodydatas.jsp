<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="sf"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!-- 日期格式标签库 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>所有用户最新监护数据列表</title>
	
  </head>
  
  <body>
  	<table class="table"  style="font-size:10px;margin-top:10px;">
  		<tr>
  			<td>序号</td>
  			<td>用户账号</td>
  			<td>记录时间</td>
  			<td>心率(PR/m)</td>  			
  			<td>收缩压(mmHg)</td>
  			<td>舒张压(mmHg)</td>
  			<td>体温(°C)</td>
  			<!-- <td>血氧含量(%)</td> -->
  			<td>紫外线指数(级)</td>
  			<td>操作</td>
  		</tr>
  		<c:if test="${pager.total le 0 }">
  			<tr>
  				<td colspan="10">目前没有用户数据</td>
  			</tr>
  		</c:if>
  		<c:if test="${pager.total gt 0}" >
  			<c:forEach items="${pager.datas}" var="latestCustodyData" varStatus="status">			
  				<tr>
  					<td>${status.index+1 }</td>
  					<td>${latestCustodyData.userAccount }</td>
  					<td><fmt:formatDate value="${latestCustodyData.collectionTime }" pattern="yyyy-MM-dd hh:mm:ss"/></td><!--输出在当页的序号  -->
  					<td>${latestCustodyData.heartRate}</td>
  					<td>${latestCustodyData.systolicPressure }</td>
  					<td>${latestCustodyData.diastolicPressur }</td>
  					<td>${latestCustodyData.temperature}</td>
  					<!--  <td>${latestCustodyData.bloodOxygen}</td>-->
  					<td>${latestCustodyData.uvIndex}</td>
  					<td><a href="<%=request.getContextPath()%>/showdatas/${latestCustodyData.userAccount}/usercustodydatas">查看该用户全部监护数据</a></td>
  				</tr>
  			</c:forEach>
 			<tr>
				<td colspan="10" align="right">
					<jsp:include page="/inc/pager.jsp">
						<jsp:param value="latestcustodydatas" name="url"/>
						<jsp:param value="${pager.total}" name="items"/>
					</jsp:include>
				</td>
			</tr>	
  		</c:if>
  	</table>
  </body>
  
</html>
