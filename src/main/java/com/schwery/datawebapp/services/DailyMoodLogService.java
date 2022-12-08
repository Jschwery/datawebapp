package com.schwery.datawebapp.services;

import com.schwery.datawebapp.entities.DailyMoodLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DailyMoodLogService {



    List<DailyMoodLog> getAllDailyMoods();
}
