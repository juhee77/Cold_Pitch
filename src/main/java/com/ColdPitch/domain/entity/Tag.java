package com.ColdPitch.domain.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder(toBuilder = true)
public class Tag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tag_name", nullable = false)
    private String tagName;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;

    @Column()
    private String iconPath;

    @Column(nullable = false)
    private String description;

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", iconPath='" + iconPath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
