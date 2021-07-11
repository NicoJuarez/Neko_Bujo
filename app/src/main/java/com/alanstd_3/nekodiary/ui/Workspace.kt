package com.alanstd_3.nekodiary.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = Workspace.TABLE)
data class Workspace(
    @ColumnInfo(name = TITLE)
    var title: String = "",
    @ColumnInfo(name = DESCRIPTION)
    val description: String = "",
    @ColumnInfo(name = COLOR)
    var color: String = ""
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    var id: Long = 0L

    companion object {
        const val TABLE = "table_workspace"
        const val ID = "_id"
        const val TITLE = "title"
        const val DESCRIPTION = "desc"
        const val COLOR = "color"
    }

}