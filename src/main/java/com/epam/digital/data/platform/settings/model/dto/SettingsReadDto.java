/*
 *  Copyright 2021 EPAM Systems.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.epam.digital.data.platform.settings.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

public class SettingsReadDto {
  @JsonProperty("settings_id")
  private UUID settingsId;

  @JsonProperty("e-mail")
  private String email;

  private String phone;

  @JsonProperty("communicationIsAllowed")
  private boolean communicationAllowed;

  public UUID getSettingsId() {
    return settingsId;
  }

  public void setSettingsId(UUID settingsId) {
    this.settingsId = settingsId;
  }

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
    SettingsReadDto that = (SettingsReadDto) o;
    return communicationAllowed == that.communicationAllowed && Objects.equals(settingsId, that.settingsId) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingsId, email, phone, communicationAllowed);
  }
}
