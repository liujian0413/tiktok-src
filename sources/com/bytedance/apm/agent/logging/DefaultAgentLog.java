package com.bytedance.apm.agent.logging;

public class DefaultAgentLog implements AgentLog {
    private AgentLog impl = new NullAgentLog();

    public int getLevel() {
        int level;
        synchronized (this) {
            level = this.impl.getLevel();
        }
        return level;
    }

    public void setImpl(AgentLog agentLog) {
        synchronized (this) {
            this.impl = agentLog;
        }
    }

    public void audit(String str) {
        synchronized (this) {
            this.impl.audit(str);
        }
    }

    public void debug(String str) {
        synchronized (this) {
            this.impl.debug(str);
        }
    }

    public void error(String str) {
        synchronized (this) {
            this.impl.error(str);
        }
    }

    public void info(String str) {
        synchronized (this) {
            this.impl.info(str);
        }
    }

    public void setLevel(int i) {
        synchronized (this) {
            this.impl.setLevel(i);
        }
    }

    public void verbose(String str) {
        synchronized (this) {
            this.impl.verbose(str);
        }
    }

    public void warning(String str) {
        synchronized (this) {
            this.impl.warning(str);
        }
    }

    public void error(String str, Throwable th) {
        synchronized (this) {
            this.impl.error(str, th);
        }
    }
}
