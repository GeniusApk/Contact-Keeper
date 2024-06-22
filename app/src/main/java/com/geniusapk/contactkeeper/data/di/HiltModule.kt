package com.geniusapk.contactkeeper.data.di

import android.app.Application
import androidx.room.Room
import com.geniusapk.contactkeeper.data.database.ContactDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Provides
    fun provideDatabase(application: Application): ContactDataBase {

        return Room.databaseBuilder(
            application.baseContext,
            ContactDataBase::class.java,
            "contact_db"
        ).fallbackToDestructiveMigration().build()


    }
}