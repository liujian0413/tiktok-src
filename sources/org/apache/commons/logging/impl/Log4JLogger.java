package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class Log4JLogger implements Serializable, Log {
    private static final String FQCN;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$Log4JLogger;
    static /* synthetic */ Class class$org$apache$log4j$Level;
    static /* synthetic */ Class class$org$apache$log4j$Priority;
    private static Priority traceLevel;
    private transient Logger logger;
    private String name;

    public Log4JLogger() {
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    public boolean isErrorEnabled() {
        return getLogger().isEnabledFor(Priority.ERROR);
    }

    public boolean isFatalEnabled() {
        return getLogger().isEnabledFor(Priority.FATAL);
    }

    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    public boolean isTraceEnabled() {
        return getLogger().isEnabledFor(traceLevel);
    }

    public boolean isWarnEnabled() {
        return getLogger().isEnabledFor(Priority.WARN);
    }

    static {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        if (class$org$apache$commons$logging$impl$Log4JLogger == null) {
            cls = class$("org.apache.commons.logging.impl.Log4JLogger");
            class$org$apache$commons$logging$impl$Log4JLogger = cls;
        } else {
            cls = class$org$apache$commons$logging$impl$Log4JLogger;
        }
        FQCN = cls.getName();
        if (class$org$apache$log4j$Priority == null) {
            cls2 = class$("org.apache.log4j.Priority");
            class$org$apache$log4j$Priority = cls2;
        } else {
            cls2 = class$org$apache$log4j$Priority;
        }
        if (class$org$apache$log4j$Level == null) {
            cls3 = class$("org.apache.log4j.Level");
            class$org$apache$log4j$Level = cls3;
        } else {
            cls3 = class$org$apache$log4j$Level;
        }
        if (cls2.isAssignableFrom(cls3)) {
            try {
                if (class$org$apache$log4j$Level == null) {
                    cls4 = class$("org.apache.log4j.Level");
                    class$org$apache$log4j$Level = cls4;
                } else {
                    cls4 = class$org$apache$log4j$Level;
                }
                traceLevel = (Priority) cls4.getDeclaredField("TRACE").get(null);
            } catch (Exception unused) {
                traceLevel = Priority.DEBUG;
            }
        } else {
            throw new InstantiationError("Log4J 1.2 not available");
        }
    }

    public Log4JLogger(String str) {
        this.name = str;
        this.logger = getLogger();
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void debug(Object obj) {
        getLogger().log(FQCN, Priority.DEBUG, obj, null);
    }

    public void error(Object obj) {
        getLogger().log(FQCN, Priority.ERROR, obj, null);
    }

    public void fatal(Object obj) {
        getLogger().log(FQCN, Priority.FATAL, obj, null);
    }

    public void info(Object obj) {
        getLogger().log(FQCN, Priority.INFO, obj, null);
    }

    public void trace(Object obj) {
        getLogger().log(FQCN, traceLevel, obj, null);
    }

    public void warn(Object obj) {
        getLogger().log(FQCN, Priority.WARN, obj, null);
    }

    public Log4JLogger(Logger logger2) {
        if (logger2 != null) {
            this.name = logger2.getName();
            this.logger = logger2;
            return;
        }
        throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
    }

    public void debug(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.DEBUG, obj, th);
    }

    public void error(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.ERROR, obj, th);
    }

    public void fatal(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.FATAL, obj, th);
    }

    public void info(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.INFO, obj, th);
    }

    public void trace(Object obj, Throwable th) {
        getLogger().log(FQCN, traceLevel, obj, th);
    }

    public void warn(Object obj, Throwable th) {
        getLogger().log(FQCN, Priority.WARN, obj, th);
    }
}
