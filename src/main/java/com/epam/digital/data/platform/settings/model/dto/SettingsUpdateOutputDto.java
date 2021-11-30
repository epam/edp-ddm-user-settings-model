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

public class SettingsUpdateOutputDto {
  @JsonProperty("settings_id")
  private UUID settingsId;

  public SettingsUpdateOutputDto() {}

  public SettingsUpdateOutputDto(UUID settingsId) {
    this.settingsId = settingsId;
  }

  public UUID getSettingsId() {
    return settingsId;
  }

  public void setSettingsId(UUID settingsId) {
    this.settingsId = settingsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SettingsUpdateOutputDto that = (SettingsUpdateOutputDto) o;
    return Objects.equals(settingsId, that.settingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingsId);
  }
}
