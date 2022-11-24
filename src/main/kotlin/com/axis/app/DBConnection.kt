package com.axis.app

import java.sql.Connection
import java.sql.DriverManager

class DBConnection {
    fun connect(): Connection {
        val dburl ="jdbc:mysql://localhost:3306/productdb"
        val connection= DriverManager.getConnection(dburl,"root","Sruthi@19")
        return connection
    }
}