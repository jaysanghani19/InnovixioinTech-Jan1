package com.jay.newstask3.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ArticleTable::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {

    abstract fun getArticleDao(): ArticleTableDao

    companion object {
        @Volatile
        private var INSTANCE: com.jay.newstask3.roomdatabase.Database? = null

        fun getDatabaseInstance(context: Context): com.jay.newstask3.roomdatabase.Database {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    com.jay.newstask3.roomdatabase.Database::class.java,
                    "database"
                ).build()
            }
            return instance
        }
    }
}