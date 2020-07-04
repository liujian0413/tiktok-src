package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;

public class NoOpLog implements Serializable, Log {
    public NoOpLog() {
    }

    public void debug(Object obj) {
    }

    public void debug(Object obj, Throwable th) {
    }

    public void error(Object obj) {
    }

    public void error(Object obj, Throwable th) {
    }

    public void fatal(Object obj) {
    }

    public void fatal(Object obj, Throwable th) {
    }

    public void info(Object obj) {
    }

    public void info(Object obj, Throwable th) {
    }

    public final boolean isDebugEnabled() {
        return false;
    }

    public final boolean isErrorEnabled() {
        return false;
    }

    public final boolean isFatalEnabled() {
        return false;
    }

    public final boolean isInfoEnabled() {
        return false;
    }

    public final boolean isTraceEnabled() {
        return false;
    }

    public final boolean isWarnEnabled() {
        return false;
    }

    public void trace(Object obj) {
    }

    public void trace(Object obj, Throwable th) {
    }

    public void warn(Object obj) {
    }

    public void warn(Object obj, Throwable th) {
    }

    public NoOpLog(String str) {
    }
}
