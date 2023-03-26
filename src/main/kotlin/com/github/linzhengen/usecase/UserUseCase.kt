package com.github.linzhengen.usecase

import com.github.linzhengen.domain.user.UserRepository
import com.github.linzhengen.domain.user.User
import java.util.UUID

class UserUseCase(private val userRepository: UserRepository) {
    suspend fun createUser(name: String): UUID {
        return userRepository.create(name).id
    }

    suspend fun findUser(id: String): User? {
        var uuid = UUID.fromString(id);
        return userRepository.findById(uuid)
    }
}