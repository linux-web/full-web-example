
# 包含完整的web应用技术示例

> 包含以下技术:

* SpringMVC - Spring MVC will handles the user requests
* SpringData - Spring Data will handle all database actions
* SpringSecurity - Spring Security will protect our code against malicious users
* Tiles Framework - Tiles help us with pages template
* Angular.js - A Javascript library that will help us with object binding
* Twitter Bootstrap - A CSS library that will help us with a good looking style
* JQuery - Combined with Twitter Bootstrap to give some animation to our HTML components

## 数据表格式

> system_user
+----+----------------+---------+----------+----------+------------+
| id | email          | enabled | name     | password | user_role  |
+----+----------------+---------+----------+----------+------------+
|  1 | wgybzb@sina.cn | true    | wanggang | wanggang | ROLE_ADMIN |
|  2 | 123@qq.com     | true    | abc      | abc      | ROLE_USER  |
+----+----------------+---------+----------+----------+------------+

> Contact
+----+--------------+-------------+-------------+
| id | email        | name        | phoneNumber |
+----+--------------+-------------+-------------+
|  1 | test_email_1 | test_name_1 | 1111        |
|  2 | test_email_2 | test_name_2 | 2222        |
+----+--------------+-------------+-------------+


## 打包部署

> 运行测试命令

`mvn clean install tomcat7:run`

访问：http://localhost:8080/full-web-example

> 运行打包命令

`mvn clean package`

> 参考 [http://uaihebert.com/complete-web-application-angular-twitter-bootstrap-spring-mvc-data-and-security/]


