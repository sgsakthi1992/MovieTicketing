<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div>
    <form:form method="post" modelAttribute="user">
        First Name : <input type="text" name="firstName" path="firstName"/>
        Last Name : <input type="text" name="lastName" path="lastName"/>
        Email : <input type="text" name="email" path="email"/>
        <button type="submit">Submit</button>
    </form:form>
</div>