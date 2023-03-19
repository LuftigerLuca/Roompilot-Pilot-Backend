package de.roompilot.roompilotbackend.service;

import de.roompilot.roompilotbackend.model.RoompilotSign;
import de.roompilot.roompilotbackend.repository.RoompilotSignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoompilotSignCacheServiceImpl implements RoompilotSignCacheService{

    @Autowired
    private RoompilotSignRepository roompilotSignRepository;

    @Override
    public void updateSign(RoompilotSign sign) {
        roompilotSignRepository.save(sign);
    }

    @Override
    public void deleteSign(RoompilotSign sign) {
        roompilotSignRepository.delete(sign);
    }

    @Override
    public List<RoompilotSign> getAllSigns() {
        return roompilotSignRepository.findAll();
    }

    @Override
    public RoompilotSign getSign(String macAddress) {
        return null;
    }
}
