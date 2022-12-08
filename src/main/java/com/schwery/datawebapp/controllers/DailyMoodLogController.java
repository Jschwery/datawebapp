package com.schwery.datawebapp.controllers;

import com.schwery.datawebapp.entities.DailyMoodLog;
import com.schwery.datawebapp.services.DailyMoodLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DailyMoodLogController {

    @Autowired
    @Qualifier("DailyMoodImpl")
    DailyMoodLogService dailyMoodLogService;

//    @GetMapping("/dailyMood/{id}")
//    public ResponseEntity<List<DailyMoodLog>> getAllDailyMoodLogs(@RequestParam(required = false) String length, @PathVariable String id) {
//        if (length == null) {
//            return ResponseEntity.ok(dailyMoodLogService.getDailyMoodLog(id));
//        }
//        switch (length.toUpperCase()) {
////            case "WEEK" -> dailyMoodLogService.
//        }
//
//    }
}