package com.sunless.JobPort.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class JobPost {
    @Id
    public int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;

    private List<String> postTechStack = new ArrayList<>(); // Matches JSP: ${jobPost.postTechStack}
}
