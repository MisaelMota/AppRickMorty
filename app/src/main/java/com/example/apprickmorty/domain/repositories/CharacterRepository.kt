package com.example.apprickmorty.domain.repositories

import com.example.apprickmorty.data.Result
import com.example.apprickmorty.domain.model.Character
import com.example.apprickmorty.domain.model.Characters
import kotlinx.coroutines.flow.Flow


interface CharacterRepository {
    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id:Int):Result<Character>
}