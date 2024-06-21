package net.refactoreverything.headfirstspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Job {
    private int jobId;
    private String jobName;
    private String jobDescription;
    private int reqExperience;
    private String date;
    private List<String> techStacks;
}
