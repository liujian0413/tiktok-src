package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C13892b;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13967z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppEventsLoggerUtility {

    /* renamed from: a */
    private static final Map<GraphAPIActivityType, String> f34878a = new HashMap<GraphAPIActivityType, String>() {
        {
            put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m38480a(GraphAPIActivityType graphAPIActivityType, C13892b bVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f34878a.get(graphAPIActivityType));
        String d = AppEventsLogger.m38362d();
        if (d != null) {
            jSONObject.put("app_user_id", d);
        }
        String e = AppEventsLogger.m38363e();
        if (!e.isEmpty()) {
            jSONObject.put("ud", e);
        }
        C13967z.m41245a(jSONObject, bVar, str, z);
        try {
            C13967z.m41244a(jSONObject, context);
        } catch (Exception e2) {
            C13949t.m41131a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
