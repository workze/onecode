package com.onecode.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class SimpleExceptionTest {

    @Test
    public void test() {
        try {
            throw new SimpleException("error");
        } catch (Exception e) {
            log.error("xxx", e);
        }
    }

    @Test
    public void test2() {
        try {
            throw new SimpleException("error, {}", "abc");
        } catch (Exception e) {
            log.error("xxx", e);
        }
    }

    @Test
    public void test3() {
        try {
            throw new SimpleException("error, {}");
        } catch (Exception e) {
            log.error("xxx", e);
        }
    }

    @Test
    public void test4() {
        try {
            throw new SimpleException("error", "abc");
        } catch (Exception e) {
            log.error("xxx", e);
        }
    }
}