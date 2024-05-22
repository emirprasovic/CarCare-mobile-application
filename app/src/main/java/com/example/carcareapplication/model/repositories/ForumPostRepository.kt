package com.example.carcareapplication.model.repositories

import com.example.carcareapplication.model.daos.ForumDao
import com.example.carcareapplication.model.models.ForumPosts
import kotlinx.coroutines.flow.Flow

class ForumPostRepository(private val forumDao: ForumDao): BaseRepository<ForumPosts> {
    override suspend fun insert(t: ForumPosts) = forumDao.insert(t)

    override suspend fun update(t: ForumPosts) = forumDao.update(t)

    override suspend fun delete(t: ForumPosts) = forumDao.delete(t)

    override fun getOneStream(id: Int): Flow<ForumPosts?> = forumDao.getForumPostById(id)

    fun getForumPostByUserId(id: Int): Flow<List<ForumPosts>> = forumDao.getForumPostsByUserId(id)

    fun getAllForumPosts(): Flow<List<ForumPosts>> = forumDao.getAllForumPosts()
}