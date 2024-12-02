package org.example.coffee.global.common.exception.test;

import org.example.coffee.global.common.code.BaseErrorCode;
import org.example.coffee.global.common.exception.GeneralException;

public class TestException extends GeneralException {
    private BaseErrorCode baseErrorCode;
    public TestException(BaseErrorCode baseErrorCode) {
        super(baseErrorCode);
    }
}
