<%-- 
    Document   : login
    Created on : Nov 29, 2023, 4:08:03 PM
    Author     : VKDUY
--%>

<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="dang-nhap" method="post">
        Email: <input type="text" name="email"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
        <input type="reset" value="Reset">
    </form>
</body>
</html> --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Đăng nhập</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <form method="post" action="dang-nhap">
            <section class="vh-100" style="background-color: #508bfc;">
                <div class="container py-5 h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                            <div class="card shadow-2-strong" style="border-radius: 1rem;">
                                <div class="card-body p-5 text-center">

                                    <h3 class="mb-5">Sign in</h3>

                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="typeEmailX-2">Email</label>
                                        <input type="email" id="typeEmailX-2" class="form-control form-control-lg" name="email" />
                                    </div>

                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="typePasswordX-2">Password</label>
                                        <input type="password" id="typePasswordX-2" class="form-control form-control-lg"  name="password" />
                                    </div>

                                    <!-- Checkbox -->
                                    <div class="form-check d-flex justify-content-start mb-4">
                                        <input class="form-check-input" type="checkbox" value="" id="form1Example3" />
                                        <label class="form-check-label" for="form1Example3"> Remember password </label>
                                    </div>

                                    <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
                                    <button class="btn btn-primary btn-lg btn-block" type="reset">Reset</button>

                                    <hr class="my-4">

                                    <button class="btn btn-lg btn-block btn-primary" style="background-color: #dd4b39;"
                                            type="submit"><i class="fab fa-google me-2"></i> Sign in with google</button>
                                    <button class="btn btn-lg btn-block btn-primary mb-2" style="background-color: #3b5998;"
                                            type="submit"><i class="fab fa-facebook-f me-2"></i>Sign in with facebook</button>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>
    </body>
</html>
