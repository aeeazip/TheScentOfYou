<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.scentofyou.scentofyou.domain.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link type="text/css" rel="stylesheet"
	th:href="@{/css/mypages/logStyle.css}">
<!--  부트스트랩 웹폰트  -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">

<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">   
  $(document).ready( function() {
    $("#headers").load("/scentofyou/default.do");  // 원하는 파일 경로를 삽입하면 된다
  });
</script>
</head>
<body>
	<div class="container">
		<div id="headers"></div>
		<div id="mask"></div>

		<br><br><br>
		<table id="boardtable">
			<tbody>
			</tbody>
			<tr></tr>
				<%
			String name = request.getParameter("perfumeName");
			String category = request.getParameter("categoryType");
			String gender = request.getParameter("genderType");

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			String jdbc_driver = "com.mysql.cj.jdbc.Driver";
			String jdbc_url = "jdbc:mysql://mydatabase.cl88hjaqluom.ap-northeast-2.rds.amazonaws.com:3306/mydb";

			String id = "root";
			String pw = "dalcteam2";

			try {
				Class.forName(jdbc_driver);
				conn = DriverManager.getConnection(jdbc_url, id, pw);
				stmt = conn.createStatement();

				String searchValue = name;
				searchValue = "'%" + searchValue + "%'";

				String sql = "select perfume_name, perfume_img from mydb.Perfume where perfume_name LIKE " + searchValue
				+ " and perfume_category='" + category + "' and perfume_gender='" + gender + "' limit 30";
				rs = stmt.executeQuery(sql);

				List<Perfume> list = new ArrayList<Perfume>();
				while (rs.next()) {
					Perfume p = new Perfume();

					p.setName(rs.getString(1));
					p.setPerfumeImg(rs.getString(2));
					list.add(p);
				}
				if (list.isEmpty())
					out.println("해당하는 향수를 찾지 못했습니다.");
				else {
					for (Perfume p : list) {
						out.println("<td><img style='width:300px; height:500px;'src='" + p.getPerfumeImg() + "' /></td><tr>");
						out.println("<td>" + p.getName() + "</td></tr>");
						
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			%>
		</table>
		<br><br><br>
		<button onclick="history.back()">검색 페이지로</button>
	</div>
</body>
</html>