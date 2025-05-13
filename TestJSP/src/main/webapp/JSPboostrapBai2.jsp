<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
    <h2 class="text-center text-uppercase text-danger">Danh sách sinh viên</h2>
    
    <table class="table table-bordered table-striped mt-3">
      <thead class="table-danger border-info text-warning">
        <tr>
          <th>STT</th>
          <th>Mã SV</th>
          <th>Họ và tên</th>
          <th>Quê quán</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>SV001</td>
          <td>Nguyễn Văn A</td>
          <td>Hà Nội</td>
        </tr>
        <tr>
          <td>2</td>
          <td>SV002</td>
          <td>Trần Thị B</td>
          <td>Đà Nẵng</td>
        </tr>
        <tr>
          <td>3</td>
          <td>SV003</td>
          <td>Lê Văn C</td>
          <td>TP. Hồ Chí Minh</td>
        </tr>
        <!-- Thêm dòng mới nếu cần -->
      </tbody>
    </table>
  </div>
</body>
</html>