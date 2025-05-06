<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giải phương trình bậc 2</title>
</head>
<body>
    <h2>Giải phương trình bậc 2: ax² + bx + c = 0</h2>
    <form method="post">
        a: <input type="text" name="a" required><br>
        b: <input type="text" name="b" required><br>
        c: <input type="text" name="c" required><br>
        <input type="submit" name="submit" value="Giải">
    </form>

<%
    if (request.getParameter("submit") != null) {
        try {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));

            out.println("<h3>Kết quả:</h3>");
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        out.println("Phương trình vô số nghiệm");
                    } else {
                        out.println("Phương trình vô nghiệm");
                    }
                } else {
                    double x = -c / b;
                    out.println("Phương trình bậc nhất, nghiệm x = " + x);
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    out.println("Phương trình có 2 nghiệm: x₁ = " + x1 + ", x₂ = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    out.println("Phương trình có nghiệm kép: x = " + x);
                } else {
                    out.println("Phương trình vô nghiệm thực");
                }
            }
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Vui lòng nhập đúng định dạng số!</p>");
        }
    }
%>

</body>
</html>
