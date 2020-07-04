package com.bytedance.android.livesdk.p393h;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.h.b */
public final class C8292b {

    /* renamed from: d */
    public static final C8293a f22771d = new C8293a(null);

    /* renamed from: a */
    public final int f22772a = 1;

    /* renamed from: b */
    public final String f22773b;

    /* renamed from: c */
    public final JSONObject f22774c;

    /* renamed from: com.bytedance.android.livesdk.h.b$a */
    public static final class C8293a {
        private C8293a() {
        }

        public /* synthetic */ C8293a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8292b) {
                C8292b bVar = (C8292b) obj;
                if (!(this.f22772a == bVar.f22772a) || !C7573i.m23585a((Object) this.f22773b, (Object) bVar.f22773b) || !C7573i.m23585a((Object) this.f22774c, (Object) bVar.f22774c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f22772a * 31;
        String str = this.f22773b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f22774c;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerH5RoomStatusChangeEvent(position=");
        sb.append(this.f22772a);
        sb.append(", type=");
        sb.append(this.f22773b);
        sb.append(", data=");
        sb.append(this.f22774c);
        sb.append(")");
        return sb.toString();
    }

    public C8292b(int i, String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(jSONObject, "data");
        this.f22773b = str;
        this.f22774c = jSONObject;
    }
}
