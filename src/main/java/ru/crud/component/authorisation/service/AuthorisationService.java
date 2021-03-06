package ru.crud.component.authorisation.service;

import ru.crud.component.user.dto.UserDto;

public interface AuthorisationService {

  UserDto signIn(UserDto user);

  UserDto signUp(UserDto user);
}
