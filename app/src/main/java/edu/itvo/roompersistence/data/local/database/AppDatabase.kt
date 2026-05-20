package edu.itvo.roompersistence.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.itvo.roompersistence.data.local.dao.PlayerDao
import edu.itvo.roompersistence.data.local.entity.PlayerEntity

@Database(
    entities = [PlayerEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun playerDao(): PlayerDao
}