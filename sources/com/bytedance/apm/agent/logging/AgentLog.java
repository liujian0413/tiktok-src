package com.bytedance.apm.agent.logging;

public interface AgentLog {
    void audit(String str);

    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    int getLevel();

    void info(String str);

    void setLevel(int i);

    void verbose(String str);

    void warning(String str);
}
