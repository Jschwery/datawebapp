package com.schwery.datawebapp.repositories;

import com.schwery.datawebapp.entities.DailyMoodLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DailyMoodLogRepository extends JpaRepository<DailyMoodLog, Long> {


}
