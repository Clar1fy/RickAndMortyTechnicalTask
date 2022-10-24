package com.timplifier.domain.repository

import androidx.paging.PagingData
import com.timplifier.domain.models.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {
    fun fetchCharacters(): Flow<PagingData<CharacterModel>>
}