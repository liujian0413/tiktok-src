package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.tracing.TraceMachine;
import org.json.JSONObject;

public class JSONObjectInstrumentation {
    public static JSONObject init(String str) throws Exception {
        TraceMachine.enterMethod("JSONObject", "init", "json_trace");
        JSONObject jSONObject = new JSONObject(str);
        TraceMachine.exitMethod();
        return jSONObject;
    }
}
