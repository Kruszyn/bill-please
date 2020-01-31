package org.myfuturecompany.invoicer.webapp.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@RequiredArgsConstructor
public class RestResponse {
    private final HttpStatus status;
    private final String message;
}