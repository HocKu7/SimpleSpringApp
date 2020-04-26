package ru.crud.component.authorisation.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.crud.domain.User;
import ru.crud.component.user.dto.UserDto;
import ru.crud.component.user.repo.UserRepo;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorisationServiceImpl implements AuthorisationService {

  private UserRepo userRepo;
  private ModelMapper modelMapper = new ModelMapper();

  public AuthorisationServiceImpl(UserRepo userRepo) {
    this.userRepo = userRepo;
  }

  @Override
  public UserDto signIn(UserDto userDto) {

//    User actualUser = User.builder()
//        .build();
//    modelMapper.map(userDto, actualUser);
//    User expectedUser = userRepo.getUserByName(userDto.getName());
//    if (expectedUser.getName()
//        .equals(actualUser.getName()) && expectedUser.getPassword()
//        .equals(actualUser.getPassword())) {
//      return userDto;
//    }
    return null;
  }

  @Override
  public UserDto signUp(UserDto userDto) {

    User user = User.builder()
        .build();
    modelMapper.map(userDto, user);
    userRepo.save(user);
    return userDto;
  }

  @Override
  public List<UserDto> getAllUser() {
    List<UserDto> usersDto = new ArrayList<>();
    List<User> users = userRepo.getAllUsers();

    for(User user:users){
      usersDto.add(modelMapper.map(user,UserDto.class));
    }
    return usersDto;
  }
}
