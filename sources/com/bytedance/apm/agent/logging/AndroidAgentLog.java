package com.bytedance.apm.agent.logging;

public class AndroidAgentLog implements AgentLog {
    private int level = 3;

    public void audit(String str) {
    }

    public void debug(String str) {
    }

    public void error(String str) {
    }

    public void error(String str, Throwable th) {
    }

    public int getLevel() {
        return this.level;
    }

    public void info(String str) {
    }

    public void verbose(String str) {
    }

    public void warning(String str) {
    }

    public void setLevel(int i) {
        if (i > 6 || i <= 0) {
            throw new IllegalArgumentException("Log level is not between ERROR and AUDIT");
        }
        this.level = i;
    }
}
