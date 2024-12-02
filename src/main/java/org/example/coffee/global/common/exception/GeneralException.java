package org.example.coffee.global.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.coffee.global.common.code.BaseErrorCode;
import org.example.coffee.global.common.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {
    private BaseErrorCode baseErrorCode;

    public ErrorReasonDTO getErrorReason() {
        return this.baseErrorCode.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.baseErrorCode.getReasonHttpStatus();
    }
}