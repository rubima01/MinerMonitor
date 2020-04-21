package com.rubins.minermonitor.exceptions;

public class MinerMonitorException extends RuntimeException {
    public MinerMonitorException() {
    }

    public MinerMonitorException(String message) {
        super(message);
    }

    public MinerMonitorException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinerMonitorException(Throwable cause) {
        super(cause);
    }

    public MinerMonitorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
