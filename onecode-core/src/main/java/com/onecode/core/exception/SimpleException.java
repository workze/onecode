package com.onecode.core.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.helpers.MessageFormatter;

/**
 * @author guize
 * @date 2021/8/12
 */
@Slf4j
public class SimpleException extends RuntimeException {

    public static boolean LOG_MESSAGE = false;

    public SimpleException(String message) {
        super(message);

        if (LOG_MESSAGE) {
            log.info("SimpleException: {}", message);
        }
    }

    /**
     * @param message 报错详情,支持{}占位符
     * @param args    占位符参数
     */
    public SimpleException(String message, Object... args) {
        this(MessageFormatter.arrayFormat(message, args).getMessage());
    }

}
