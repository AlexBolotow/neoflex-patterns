package com.bolotov.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class LoggerTest {

    @Test
    @DisplayName("Test get instance logger functionality")
    public void givenLoggerObject_whenGetInstance_thenReturnSameInstance() {
        //given
        Logger loggerFirstInstance = Logger.getInstance();

        //when
        Logger loggerSecondInstance = Logger.getInstance();

        //then
        assertThat(loggerSecondInstance).isNotNull();
        assertThat(loggerSecondInstance).isEqualTo(loggerFirstInstance);
    }
}