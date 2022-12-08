package com.schwery.datawebapp.services.implementations;

import com.schwery.datawebapp.entities.DailyMoodLog;
import com.schwery.datawebapp.repositories.DailyMoodLogRepository;
import com.schwery.datawebapp.services.DailyMoodLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;



@Qualifier("DailyMoodImpl")
@Service
public class DailyMoodLogServiceImpl implements DailyMoodLogService {
    @Autowired
    DailyMoodLogRepository dailyMoodLogRepository;

    @Override
    public List<DailyMoodLog> getDailyMoodLog(String id) {
        return dailyMoodLogRepository.findById(Long.parseLong(id));
    }
}
