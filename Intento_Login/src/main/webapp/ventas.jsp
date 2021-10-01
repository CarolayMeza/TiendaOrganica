<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Css/style.css" rel="stylesheet" type="text/css" />
        <%--Este es nuestra carpeta con solo link ahorrar lineas de codigo no generar sobrecarga--%>
        <jsp:include page="link/link.jsp" />
    </head>

    <%-- ESTE ES NUESTRO CABECERO --%>
    <jsp:include page="header.jsp" />
    <%-- fin de cabecero --%>
    <%--Aqui inicia nuestro codigo para los datos que necesitamos pedir --%>
    <section class="Form my-3 mx-7"
             style="background: url(Imagen/cafe1.jpg)">
        <div class="container ">
            <div class="row">
                <div class="col-lg-4">
                    <div class="input-group my-5">
                        <h2> cc. cliente</h2>
                        <input type="text" class="form-control" placeholder="cedula">
                        <span class="input-group-btn ">
                            <button class="btn btn-success col-sm" type="button">
                                Consultar</button>
                        </span>
                    </div>
                </div>
                <div class="col-lg-5">
                    <div class="input-group my-5">
                        <h2>nombre cliente</h2>
                        <input type="text" class="form-control" placeholder="nombre cliente">
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="input-group my-5">
                        <h2>consec.</h2>
                        <input type="text" class="form-control" placeholder="consec.">
                    </div>
                </div>
            </div>
        </div>
        <div class="container ">
            <div class="row">
                <div class="col-lg-4">
                    <div class="input-group ">
                        <h2>cc. empleado</h2>
                        <input type="text" class="form-control" placeholder="cedula">
                        <span class="input-group-btn ">
                            <button class="btn btn-success col-sm" type="button">
                                Consultar</button>
                        </span>
                    </div>
                </div>
                <div class="col-lg-5">
                    <div class="input-group">
                        <h2>nombre empleado</h2>
                        <input type="text" class="form-control" placeholder="nombre empleado">
                    </div>
                </div>
            </div>
        </div>
        <div class="container ">
            <div class="row">
                <div class="col-lg-4">
                    <div class="input-group my-5">
                        <p>Cod. Producto</p>
                    </div>
                    <div class="col-lg ">
                        <div class="input-group my-3">
                            <input type="text" class="form-control"
                                   placeholder="ingrese codigo..."> <span
                                   class="input-group-btn">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control"
                                   placeholder="ingrese codigo..."> <span
                                   class="input-group-btn">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control"
                                   placeholder="ingrese codigo..."> <span
                                   class="input-group-btn">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                </div>

                <div class="col-lg">
                    <div class="input-group my-5 ">
                        <p>producto</p>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>

                </div>
                <div class="col-lg-2">
                    <div class="input-group my-5">
                        <p>cant.</p>
                    </div>
                    <div class="col-lg ">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                            <span class="input-group-btn ">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                            <span class="input-group-btn ">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                            <span class="input-group-btn ">
                                <button class="btn btn-success col-sm" type="button">
                                    Consultar</button>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2">
                    <div class="input-group my-5">
                        <p>valor total</p>
                    </div>
                    <div class="col-lg ">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>
                    <div class="col-lg">
                        <div class="input-group my-3">
                            <input type="text" class="form-control" placeholder="-----">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container" ALIGN="right">
            <div class="col-lg-4">
                <div class="input-group my-3">
                    <p>Total venta</p>
                    <input type="text" class="form-control" placeholder="-----">
                </div>
            </div>
            <div class="col-lg-4" >
                <div class="input-group my-3">
                    <p>total IVA</p>
                    <input type="text" class="form-control" placeholder="-----">
                </div>
            </div>
            <div class="col-lg-4">
                <div class="input-group my-3">
                    <p>total con IVA</p>
                    <input type="text" class="form-control" placeholder="-----">
                </div>
                <div class="col-lg my-3 ">
                    <span class="input-group-btn ">
                        <button type="submit" class="btn btn-success btn-lg"> Calcular</button>
                    </span>
                    <div class="col-lg my-3 ">
                        <span class="input-group-btn my-5">
                           <button type="submit" class="btn btn-success btn-lg">Confirmar</button>
                        </span>
                        <br></br> 
                    </div>
                </div>
            </div>


        </div>

    </section>