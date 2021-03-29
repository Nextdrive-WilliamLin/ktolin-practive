package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.*
import java.util.*
import java.sql.ResultSet

import java.sql.PreparedStatement




@RestController
    @RequestMapping("/test")
    class TestController(){
        var driver = "com.mysql.cj.jdbc.Driver"
        var url = "jdbc:mysql://localhost:3306/account"
        internal var username = "root"
        internal var password = "root"
        internal var conn: Connection? = null
        var ps: PreparedStatement? = null
        var rs: ResultSet? = null

        var selectsql = "select*from member"
        @RequestMapping("getResult")
            fun main(): String {
                try{
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    ps=conn?.prepareStatement(selectsql);
                    rs=ps?.executeQuery();

                    //5.查询数据库中的单个对象数据
                    while(rs?.next() == true){
                        var obj = Member()
                        var id= rs!!.getString(1);
                        var name= rs!!.getString(2);
                        var mail= rs!!.getString(3);
                        obj.id = id
                        obj.name = name
                        obj.email = mail
                        System.out.println("编号="+id);
                        System.out.println("姓名="+name);
                        System.out.println("信箱="+mail);
                        System.out.println(obj)
                    }
                    System.out.println("/////////////////");
                } catch (e: ClassNotFoundException) {
                    System.out.println("没有找到该类，请导入相应jar包");
                    e.printStackTrace();
                } catch (e: SQLException) {
                    System.out.println("sql语句异常");
                    e.printStackTrace();
                } finally {
                    try {
                        conn?.close();
                        rs?.close();
                        ps?.close();
                    } catch (e: SQLException) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
//                return "Hello World"
                return "Hello"
            }

    }


class Member {
    var id: String = "";
    var name: String = "";
    var email: String = "";
}