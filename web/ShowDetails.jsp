<jsp:useBean scope="session" id="info" class="mypkg.Student"/>

<html>
    <body>
        <h3>Student-Details</h3>
        <hr>
        <pre>
            Roll-No     :   <jsp:getProperty name="info" property="rollNo"/>
            Name        :   <jsp:getProperty name="info" property="name"/>
            Address     :   <jsp:getProperty name="info" property="address"/>
            Course      :   <jsp:getProperty name="info" property="course"/>
            Semester    :   <jsp:getProperty name="info" property="sem"/>
        </pre>
        <hr>
        <a href="search.jsp">Search-More</a><br>
        <a href="index.jsp">Home</a><br>
           
    </body>
</html>
