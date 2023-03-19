package de.roompilot.roompilotbackend.service;

import de.roompilot.roompilotbackend.model.RoompilotSign;

import java.util.List;

public interface RoompilotSignCacheService {

    void updateSign(RoompilotSign sign);
    void deleteSign(RoompilotSign sign);
    List<RoompilotSign> getAllSigns();
    RoompilotSign getSign(String macAddress);

}
