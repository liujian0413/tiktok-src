package com.bytedance.ies.ugc.statisticlogger;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.b */
public final class C10984b {

    /* renamed from: a */
    public final SessionChangeType f29708a;

    /* renamed from: b */
    public final long f29709b;

    /* renamed from: c */
    public final String f29710c;

    /* renamed from: d */
    public final JSONObject f29711d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10984b) {
                C10984b bVar = (C10984b) obj;
                if (C7573i.m23585a((Object) this.f29708a, (Object) bVar.f29708a)) {
                    if (!(this.f29709b == bVar.f29709b) || !C7573i.m23585a((Object) this.f29710c, (Object) bVar.f29710c) || !C7573i.m23585a((Object) this.f29711d, (Object) bVar.f29711d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        SessionChangeType sessionChangeType = this.f29708a;
        int i = 0;
        int hashCode = (sessionChangeType != null ? sessionChangeType.hashCode() : 0) * 31;
        long j = this.f29709b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f29710c;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f29711d;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionChangeEvent(type=");
        sb.append(this.f29708a);
        sb.append(", sessionId=");
        sb.append(this.f29709b);
        sb.append(", session=");
        sb.append(this.f29710c);
        sb.append(", app_log=");
        sb.append(this.f29711d);
        sb.append(")");
        return sb.toString();
    }

    public C10984b(SessionChangeType sessionChangeType, long j, String str, JSONObject jSONObject) {
        C7573i.m23587b(sessionChangeType, "type");
        this.f29708a = sessionChangeType;
        this.f29709b = j;
        this.f29710c = str;
        this.f29711d = jSONObject;
    }

    public /* synthetic */ C10984b(SessionChangeType sessionChangeType, long j, String str, JSONObject jSONObject, int i, C7571f fVar) {
        this(sessionChangeType, j, "", null);
    }
}
