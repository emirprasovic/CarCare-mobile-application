package com.example.carcareapplication.model.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(tableName = "forumPosts",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE // Optional: specify what happens on delete
    )]
)
data class ForumPosts(
    @PrimaryKey(autoGenerate = true)
    @NotNull
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "userId")
    val userId: Int? = null,

    @ColumnInfo(name = "model")
    val title: String? = null,

    @ColumnInfo(name = "productionYear")
    val description: Int? = null,

    @ColumnInfo(name = "mileage")
    val createdAt: String? = null

)