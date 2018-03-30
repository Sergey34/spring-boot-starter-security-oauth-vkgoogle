package com.seko0716.springbootstartersecurityoauthvkgoogle.jparepository

import com.seko0716.springbootstartersecurityoauthvkgoogle.configurations.conditionals.MissingOtherImplementationCondition
import com.seko0716.springbootstartersecurityoauthvkgoogle.domains.User
import com.seko0716.springbootstartersecurityoauthvkgoogle.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.context.annotation.Conditional
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
@Conditional(MissingOtherImplementationCondition::class)
interface UserRepositoryCrud : CrudRepository<User, ObjectId>, UserRepository