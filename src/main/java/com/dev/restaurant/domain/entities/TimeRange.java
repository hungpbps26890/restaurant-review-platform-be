package com.dev.restaurant.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimeRange {

    @Field(type = FieldType.Keyword)
    private String openTime;

    @Field(type = FieldType.Keyword)
    private String closeTime;
}
