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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SettingsReadDto {

  private UUID settingsId;

  private List<ChannelReadDto> channels = new ArrayList<>();

  public SettingsReadDto() {
  }

  public SettingsReadDto(UUID settingsId) {
    this.settingsId = settingsId;
  }

  public SettingsReadDto(UUID settingsId, List<ChannelReadDto> channels) {
    this.settingsId = settingsId;
    this.channels = channels;
  }

  public UUID getSettingsId() {
    return settingsId;
  }

  public void setSettingsId(UUID settingsId) {
    this.settingsId = settingsId;
  }

  public List<ChannelReadDto> getChannels() {
    return channels;
  }

  public void setChannels(List<ChannelReadDto> channels) {
    this.channels = channels;
  }
}
