package com.example.Kotlin_RESTfull.demo

import org.springframework.data.repository.*

interface ProductRepository : CrudRepository<Product, Long> // Дает нашему слою работы с данными весь набор CRUD операций