package com.espy.broadway_sales.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.espy.broadway_sales.db.dao.OrderDao
import com.espy.broadway_sales.db.dao.ProductsDao
import com.espy.broadway_sales.db.dao.ShopsDao
import com.espy.broadway_sales.db.entities.OrderEntity
import com.espy.broadway_sales.db.entities.ProductsEntity
import com.espy.broadway_sales.db.entities.ShopsEntity

@Database(
    version = 2,
    exportSchema = false,
    entities = [
        OrderEntity::class,
        ProductsEntity::class,
        ShopsEntity::class,
    ]
)

abstract class CapDatabase : RoomDatabase()  {
    abstract val orderDao: OrderDao
    abstract val productsDao: ProductsDao
    abstract val shopsDao: ShopsDao
}