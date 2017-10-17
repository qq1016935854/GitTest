<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/css/left.css" rel="stylesheet" type="text/css"/>
<link rel="StyleSheet" href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/dtree.js"></script>
	<script type="text/javascript">
	
		d = new dTree('d');
		d.add('01',-1,'系统菜单树');
		d.add('0101','01','用户管理','','','mainFrame');
		d.add('010101','0101','展示用户','${pageContext.request.contextPath}/servlet/AdminUserServlet?method=findAll&currentPage=1','','mainFrame');
		d.add('0102','01','商品管理','','','mainFrame');
		d.add('010201','0102','展示商品','${pageContext.request.contextPath}/servlet/AdminCategoryServlet?method=findAll','','mainFrame');
		d.add('0104','01','食品管理');
		d.add('010401','0104','展示食品','${pageContext.request.contextPath}/servlet/AdminProductServlet?method=findAll','','mainFrame');
		d.add('0105','01','订单管理');
		d.add('010501','0105','展示订单','${pageContext.request.contextPath}/servlet/AdminOrderServlet?method=findAll&currentPage=1','','mainFrame');
		d.add('0106','01','食谱管理');
		d.add('010601','0106','展示食谱','${pageContext.request.contextPath}/servlet/AdminOrderServlet?method=findAll&currentPage=1','','mainFrame');
		d.add('0107','01','反馈管理');
		d.add('010701','0107','查看反馈信息','${pageContext.request.contextPath}/servlet/AdminOrderServlet?method=findAll&currentPage=1','','mainFrame');
		
		document.write(d);
		
	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
