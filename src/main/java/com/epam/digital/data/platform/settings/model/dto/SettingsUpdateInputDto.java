package com.epam.digital.data.platform.settings.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class SettingsUpdateInputDto {
  @NotNull
  @JsonProperty("e-mail")
  private String email;

  private String phone;

  @JsonProperty("communicationIsAllowed")
  private boolean communicationAllowed;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public boolean isCommunicationAllowed() {
    return communicationAllowed;
  }

  public void setCommunicationAllowed(boolean communicationAllowed) {
    this.communicationAllowed = communicationAllowed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SettingsUpdateInputDto that = (SettingsUpdateInputDto) o;
    return communicationAllowed == that.communicationAllowed && Objects.equals(email, that.email) && Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, communicationAllowed);
  }
}
