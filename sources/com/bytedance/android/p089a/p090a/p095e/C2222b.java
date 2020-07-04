package com.bytedance.android.p089a.p090a.p095e;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.p094d.C2220a;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.e.b */
public final class C2222b extends C2221a {

    /* renamed from: j */
    public int f7472j;

    /* renamed from: k */
    public int f7473k;

    /* renamed from: l */
    private String f7474l;

    /* renamed from: a */
    public final String mo7960a() {
        if (TextUtils.isEmpty(this.f7474l)) {
            this.f7474l = C2220a.m9572a(this.f7472j);
        }
        return this.f7474l;
    }

    public final String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("C2STrackEvent{uuid:");
        sb.append(this.f7463a);
        sb.append(",adid:");
        sb.append(this.f7465c);
        sb.append(",non_std_adid:");
        sb.append(this.f7467e);
        sb.append(",usize:");
        if (this.f7468f == null) {
            i = 0;
        } else {
            i = this.f7468f.size();
        }
        sb.append(i);
        sb.append(",key:");
        if (TextUtils.isEmpty(this.f7464b)) {
            str = "empty";
        } else {
            str = this.f7464b;
        }
        sb.append(str);
        sb.append(",type:");
        sb.append(this.f7472j);
        sb.append("}");
        return sb.toString();
    }

    public C2222b(long j, List<String> list, int i, boolean z, long j2, String str, JSONObject jSONObject) {
        this(UUID.randomUUID().toString(), "c2s", j, list, i, z, j2, str, jSONObject, 0);
    }

    public C2222b(String str, String str2, long j, List<String> list, int i, boolean z, long j2, String str3, JSONObject jSONObject, int i2) {
        super(str, str2, j, list, z, j2, str3, jSONObject);
        this.f7472j = i;
        this.f7473k = i2;
    }
}
