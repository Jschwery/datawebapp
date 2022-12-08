package com.schwery.datawebapp.repositories;

import com.schwery.datawebapp.entities.DailyMoodLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyMoodLogRepository extends JpaRepository<DailyMoodLog, Long> {

}
