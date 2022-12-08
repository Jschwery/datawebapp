package com.schwery.datawebapp.services.implementations;

import com.schwery.datawebapp.entities.DailyMoodLog;
import com.schwery.datawebapp.entities.Users;
import com.schwery.datawebapp.repositories.DailyMoodLogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
class DailyMoodLogServiceImplTest {

    @MockBean
    DailyMoodLogRepository moodLogRepository;

    @BeforeEach
    public void setUp(){
        List<DailyMoodLog> dailyMoodSample = List.of(new DailyMoodLog(1L, "Good",
                Timestamp.valueOf(LocalDateTime.now()), "United States",
                new Users(1L, "John", "London")),
                new DailyMoodLog(2L, "Bad", Timestamp.valueOf(LocalDateTime.now()
                ), "Canada", new Users(2L, "Anthony", "Wilkins")));

        Mockito.when(moodLogRepository.findAll()).thenReturn(dailyMoodSample);

    }

    @Test
    void getAllDailyMoods() {

        assertEquals(2, moodLogRepository.findAll().size());
    }



}