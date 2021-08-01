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
