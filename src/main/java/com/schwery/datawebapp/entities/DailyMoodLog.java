package com.schwery.datawebapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "DailyMoodLog")
public class DailyMoodLog {

    @Id
    @Column(name = "Mood_ID",
            unique = true)
    @SequenceGenerator(name = "daily_mood_sequence",
                        sequenceName = "daily_mood_sequence",
                        allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "daily_mood_sequence")
    private Long moodEntryId;

    @Column(name = "Mood")
    private String mood;

    @Column(name = "Time_Of_Entry")
    private Timestamp userLocalOfMoodEntry;

    @Column(name = "Country")
    private String country;

    @JoinColumn(referencedColumnName = "User_ID")
    @ManyToOne
    Users user;


}
