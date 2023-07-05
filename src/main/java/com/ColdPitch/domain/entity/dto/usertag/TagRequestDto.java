package com.ColdPitch.domain.entity.dto.usertag;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TagRequestDto {
    @NotEmpty
    List<String> userTag;
}
