package com.example.qinhe.gesture.Gesture;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by QinHe on 2017/2/21.
 */

@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface TurnRightSideslip {
}
