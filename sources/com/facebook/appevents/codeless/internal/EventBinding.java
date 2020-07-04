package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class EventBinding {

    /* renamed from: a */
    public final String f34816a;

    /* renamed from: b */
    public final MappingMethod f34817b;

    /* renamed from: c */
    public final ActionType f34818c;

    /* renamed from: d */
    public final String f34819d;

    /* renamed from: e */
    public final String f34820e;

    /* renamed from: f */
    public final String f34821f;

    /* renamed from: g */
    public final String f34822g;

    /* renamed from: h */
    private final List<PathComponent> f34823h;

    /* renamed from: i */
    private final List<C13145a> f34824i;

    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    /* renamed from: a */
    public final List<PathComponent> mo32320a() {
        return Collections.unmodifiableList(this.f34823h);
    }

    /* renamed from: b */
    public final List<C13145a> mo32321b() {
        return Collections.unmodifiableList(this.f34824i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.appevents.codeless.internal.EventBinding> m38415a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.appevents.codeless.internal.EventBinding r3 = m38414a(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.EventBinding.m38415a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    private static EventBinding m38414a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        MappingMethod valueOf = MappingMethod.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        ActionType valueOf2 = ActionType.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new PathComponent(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C13145a(optJSONArray.getJSONObject(i2)));
            }
        }
        EventBinding eventBinding = new EventBinding(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return eventBinding;
    }

    private EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<C13145a> list2, String str3, String str4, String str5) {
        this.f34816a = str;
        this.f34817b = mappingMethod;
        this.f34818c = actionType;
        this.f34819d = str2;
        this.f34823h = list;
        this.f34824i = list2;
        this.f34820e = str3;
        this.f34821f = str4;
        this.f34822g = str5;
    }
}
