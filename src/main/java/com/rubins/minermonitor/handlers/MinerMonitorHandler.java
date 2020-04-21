package com.rubins.minermonitor.handlers;

import com.rubins.minermonitor.exceptions.MinerMonitorException;
import com.rubins.minermonitor.models.MinerMonitorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MinerMonitorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MinerMonitorResponse> exceptionHandler(Exception ex) {
        MinerMonitorResponse minerMonitorResponse = new MinerMonitorResponse();
        minerMonitorResponse.setMessage("An Exception has occurred");
        return new ResponseEntity<>(minerMonitorResponse, HttpStatus.BAD_REQUEST);

    }
}
