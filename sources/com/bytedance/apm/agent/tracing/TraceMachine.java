package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.util.C9653q;
import java.util.HashSet;
import java.util.Stack;
import org.json.JSONObject;

public class TraceMachine {
    private static AgentLog log = AgentLogManager.getAgentLog();
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static ThreadLocal<Stack<Trace>> traceStackThreadLocal = new ThreadLocal<>();

    public static void exitMethod() {
        exitMethod("");
    }

    public static void exitMethod(String str) {
        if (traceStackThreadLocal.get() != null) {
            Stack stack = (Stack) traceStackThreadLocal.get();
            if (!stack.isEmpty()) {
                Trace trace = (Trace) stack.pop();
                trace.setExitTime(System.currentTimeMillis());
                trace.setExtraData(str);
                handleCost(trace);
            }
        }
    }

    private static void handleCost(Trace trace) {
        try {
            long j = trace.entryTime;
            long j2 = trace.exitTime;
            long longValue = Long.valueOf(j2 - j).longValue();
            if (longValue > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", j);
                jSONObject.put("end_time", j2);
                JSONObject jSONObject2 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject2.put(trace.methodName, longValue);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(trace.className);
                    sb.append("#");
                    sb.append(trace.methodName);
                    jSONObject2.put(sb.toString(), longValue);
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject3.put("scene", trace.scene);
                    HashSet<String> hashSet = sMethodSet;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(trace.className);
                    sb2.append(trace.methodName);
                    jSONObject3.put("is_first", !hashSet.contains(sb2.toString()));
                    HashSet<String> hashSet2 = sMethodSet;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(trace.className);
                    sb3.append(trace.methodName);
                    hashSet2.add(sb3.toString());
                } else {
                    jSONObject3.put("is_main", C9653q.m28546a());
                }
                jSONObject.put("extra_data", trace.extraData);
                MonitorTool.monitorPerformance(trace.traceType, jSONObject2, jSONObject3, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static void enterMethod(String str, String str2, String str3) {
        enterMethod(str, str, str2, str3);
    }

    public static void enterMethod(String str, String str2, String str3, String str4) {
        Trace trace = new Trace(str, str2, str3, System.currentTimeMillis(), str4);
        if (traceStackThreadLocal.get() == null) {
            Stack stack = new Stack();
            stack.push(trace);
            traceStackThreadLocal.set(stack);
            return;
        }
        ((Stack) traceStackThreadLocal.get()).push(trace);
    }
}
