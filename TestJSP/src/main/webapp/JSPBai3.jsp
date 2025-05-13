<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
    body {
      background-color: #f0f8ff;
    }
    .login-form {
      max-width: 400px;
      margin: 80px auto;
      padding: 30px;
      border: 1px solid #ced4da;
      border-radius: 10px;
      background-color: #ffffff;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .form-title {
      text-align: center;
      text-transform: uppercase;
      margin-bottom: 20px;
      color: #007bff;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="login-form">
      <h2 class="form-title">Đăng nhập</h2>
      <form>
        <div class="mb-3">
          <label for="username" class="form-label">Tên đăng nhập</label>
          <input type="text" class="form-control" id="username" placeholder="Nhập tên đăng nhập">
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Mật khẩu</label>
          <input type="password" class="form-control" id="password" placeholder="Nhập mật khẩu">
        </div>
        <button type="submit" class="btn btn-primary w-100">Đăng nhập</button>
      </form>
    </div>
  </div>
</body>
</html>