package com.ttnet.org.chromium.base1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class EventLog {
    public static void writeEvent(int i, int i2) {
        android.util.EventLog.writeEvent(i, i2);
    }
}
