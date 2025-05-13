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
      <h2 class="form-title">Đăng Ký</h2>
      <form>
        <div class="mb-1">
          <label for="email" class="form-label">Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Nhập email">
        </div>
        <div class="mb-1">
          <label for="password" class="form-label">Pass</label>
          <input type="password" class="form-control" id="password" placeholder="Nhập pass">
        </div>
        <div class="mb-1">
          <label for="address" class="form-label">Address: </label>
          <input type="text" class="form-control" id="address" placeholder="Nhập address">
        </div>
        <div class="mb-1">
          <label for="address2" class="form-label">Address2: </label>
          <input type="text" class="form-control" id="address2" placeholder="Nhập address2">
        </div>
        <div class="mb-1">
          <label for="city" class="form-label">City: </label>
          <input type="text" class="form-control" id="city" placeholder="Nhập city">
        </div>
        <div class="mb-1">
          <label for="state" class="form-label">State: </label>
          <input type="text" class="form-control" id="state" placeholder="Nhập state">
        </div>
        <div class="mb-1">
          <label for="zip" class="form-label">Zip: </label>
          <input type="number" class="form-control" id="zip]" placeholder="Nhập zip">
        <div class ="mb-3 form-check">
        	<input type="checkbox" class="form-check-input" id="exampleCheck1">
        	<label class ="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary w-100">Đăng ký</button>
      </form>
    </div>
  </div>
</body>
</html>