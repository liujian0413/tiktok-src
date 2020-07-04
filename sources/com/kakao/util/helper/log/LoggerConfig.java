package com.kakao.util.helper.log;

import com.C1642a;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LoggerConfig {
    public Tag defaultTag;
    public Set<String> ignoreStackSet;
    public int printLoggerLevel;
    public String stackPrefix;

    public static class Builder {
        private Tag defaultTag = Tag.DEFAULT;
        private Set<String> ignoreStackSet = new HashSet();
        private int printLoggerLevel;
        private String stackPrefix;

        public LoggerConfig build() {
            LoggerConfig loggerConfig = new LoggerConfig();
            loggerConfig.defaultTag = this.defaultTag;
            loggerConfig.printLoggerLevel = this.printLoggerLevel;
            loggerConfig.stackPrefix = this.stackPrefix;
            loggerConfig.ignoreStackSet = this.ignoreStackSet;
            return loggerConfig;
        }

        public Builder setDefaultTag(Tag tag) {
            this.defaultTag = tag;
            return this;
        }

        public Builder setPrintLoggerLevel(int i) {
            this.printLoggerLevel = i;
            return this;
        }

        public Builder setStackPrefix(String str) {
            this.stackPrefix = str;
            return this;
        }

        public Builder setIgnoreSet(Set<String> set) {
            if (set == null) {
                return this;
            }
            this.ignoreStackSet = set;
            return this;
        }
    }

    public static String toSimpleStringLogLevel(int i) {
        if (i == 0) {
            return "DEV";
        }
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "NONE";
        }
    }

    public Tag getDefaultTag() {
        return this.defaultTag;
    }

    private String getTraceInfo() {
        return getTraceInfo(Thread.currentThread().getStackTrace());
    }

    public boolean isPrintLoggable(int i) {
        if (i >= this.printLoggerLevel) {
            return true;
        }
        return false;
    }

    private String getMessageWithTrace(String str) {
        String traceInfo = getTraceInfo();
        String str2 = "%s %s";
        Object[] objArr = new Object[2];
        if (traceInfo == null) {
            traceInfo = "";
        }
        objArr[0] = traceInfo;
        objArr[1] = str;
        return C1642a.m8034a(str2, objArr);
    }

    private String getTraceInfo(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        String canonicalName = getClass().getCanonicalName();
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            if (!this.ignoreStackSet.contains(className) && !className.startsWith(canonicalName) && (this.stackPrefix == null || className.startsWith(this.stackPrefix))) {
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return null;
        }
        return C1642a.m8035a(Locale.getDefault(), "[%s:%s():%d]", new Object[]{stackTraceElement.getFileName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
    }

    public String getMessage(boolean z, String str) {
        if (z) {
            return getMessageWithTrace(str);
        }
        return str;
    }
}
