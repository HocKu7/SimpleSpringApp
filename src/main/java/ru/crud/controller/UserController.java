package ru.crud.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.crud.component.user.dto.UserDto;
import ru.crud.domain.User;
import ru.crud.component.user.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

  private final UserService userService;

  @DeleteMapping("/user/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteUser(@PathVariable Long id) {
    userService.deleteById(id);
  }

  @PutMapping("/user")
  @ResponseStatus(HttpStatus.OK)
  public void updateUser(@RequestBody UserDto userDto) {
    userService.update(userDto);
  }

  @GetMapping("/user/all")
  public List<UserDto> getAllUsers() {
    return userService.getAllUser();
  }

}
