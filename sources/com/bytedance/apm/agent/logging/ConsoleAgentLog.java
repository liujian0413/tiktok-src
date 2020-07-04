package com.bytedance.apm.agent.logging;

import java.io.PrintStream;

public class ConsoleAgentLog implements AgentLog {
    private int mLevel = 3;

    public int getLevel() {
        return this.mLevel;
    }

    public void setLevel(int i) {
        this.mLevel = i;
    }

    public void audit(String str) {
        if (this.mLevel == 6) {
            print("AUDIT", str);
        }
    }

    public void debug(String str) {
        if (this.mLevel >= 5) {
            print("DEBUG", str);
        }
    }

    public void error(String str) {
        if (this.mLevel > 0) {
            print("ERROR", str);
        }
    }

    public void info(String str) {
        if (this.mLevel >= 3) {
            print("INFO", str);
        }
    }

    public void verbose(String str) {
        if (this.mLevel >= 4) {
            print("VERBOSE", str);
        }
    }

    public void warning(String str) {
        if (this.mLevel >= 2) {
            print("WARN", str);
        }
    }

    private static void print(String str, String str2) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        printStream.println(sb.toString());
    }

    public void error(String str, Throwable th) {
        if (this.mLevel > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(th.getMessage());
            print("ERROR", sb.toString());
        }
    }
}
