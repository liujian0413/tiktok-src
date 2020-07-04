package com.bytedance.apm.agent.p464v2.instrumentation;

import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.AppAgent */
public class AppAgent {
    private static long attachBaseContextEndTime;
    private static long attachBaseContextStartTime;
    private static long constructorEndTime;
    private static long constructorStartTime;
    private static long onCreateEndTime;
    private static long onCreateStartTime;

    public static void onTrace(String str, boolean z) {
        if (TextUtils.equals(str, "<init>")) {
            if (z) {
                constructorStartTime = System.currentTimeMillis();
            } else {
                constructorEndTime = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals(str, "attachBaseContext")) {
            if (TextUtils.equals(str, "onCreate")) {
                if (z) {
                    onCreateStartTime = System.currentTimeMillis();
                } else {
                    onCreateEndTime = System.currentTimeMillis();
                    AutoLaunchTraceHelper.assignAppTime(constructorStartTime, constructorEndTime, attachBaseContextStartTime, attachBaseContextEndTime, onCreateStartTime, onCreateEndTime);
                }
            }
        } else if (z) {
            attachBaseContextStartTime = System.currentTimeMillis();
        } else {
            attachBaseContextEndTime = System.currentTimeMillis();
        }
    }
}
