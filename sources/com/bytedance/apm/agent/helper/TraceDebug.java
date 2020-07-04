package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.tracing.Trace;

public class TraceDebug {
    private static OnLogListener mOnLogListener;

    public interface OnLogListener {
        void log(String str, long j);
    }

    public static OnLogListener getLogListener() {
        return mOnLogListener;
    }

    public static void setLogListener(OnLogListener onLogListener) {
        mOnLogListener = onLogListener;
    }

    public static void notifyLogListener(Trace trace, long j) {
        if (mOnLogListener != null) {
            mOnLogListener.log(trace.methodName, j);
        }
    }
}
