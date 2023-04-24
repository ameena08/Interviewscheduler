package com.UST.Interviewscheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="interview_table")
public class Scheduler {
    @Id
    @GeneratedValue

        private int Id;
        public String name;
        public String email;
        public String phno;
        public String skills;
        public int experience;
//        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
        public Date date;
        public String time;
        public String link;
        public String poc;


    }


