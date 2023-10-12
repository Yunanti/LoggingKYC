package com.multipolar.bootcamp.logging.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "access_log")
@ToString
@EqualsAndHashCode
public class AccessLog {

    @Id
    private String id;
    private String method;
    private String status;
    private String message;
}

