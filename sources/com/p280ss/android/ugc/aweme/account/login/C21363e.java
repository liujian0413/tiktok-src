package com.p280ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.e */
public final class C21363e {

    /* renamed from: a */
    public final Context f57369a;

    /* renamed from: b */
    public final int f57370b;

    /* renamed from: c */
    public final JSONObject f57371c;

    /* renamed from: d */
    public BaseLoginMethod f57372d;

    /* renamed from: e */
    public final C21559m f57373e;

    /* renamed from: f */
    public final Bundle f57374f;

    /* renamed from: g */
    public final Runnable f57375g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21363e) {
                C21363e eVar = (C21363e) obj;
                if (C7573i.m23585a((Object) this.f57369a, (Object) eVar.f57369a)) {
                    if (!(this.f57370b == eVar.f57370b) || !C7573i.m23585a((Object) this.f57371c, (Object) eVar.f57371c) || !C7573i.m23585a((Object) this.f57372d, (Object) eVar.f57372d) || !C7573i.m23585a((Object) this.f57373e, (Object) eVar.f57373e) || !C7573i.m23585a((Object) this.f57374f, (Object) eVar.f57374f) || !C7573i.m23585a((Object) this.f57375g, (Object) eVar.f57375g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Context context = this.f57369a;
        int i = 0;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + Integer.hashCode(this.f57370b)) * 31;
        JSONObject jSONObject = this.f57371c;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        BaseLoginMethod baseLoginMethod = this.f57372d;
        int hashCode3 = (hashCode2 + (baseLoginMethod != null ? baseLoginMethod.hashCode() : 0)) * 31;
        C21559m mVar = this.f57373e;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Bundle bundle = this.f57374f;
        int hashCode5 = (hashCode4 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        Runnable runnable = this.f57375g;
        if (runnable != null) {
            i = runnable.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorInfo(context=");
        sb.append(this.f57369a);
        sb.append(", errorCode=");
        sb.append(this.f57370b);
        sb.append(", json=");
        sb.append(this.f57371c);
        sb.append(", loginMethod=");
        sb.append(this.f57372d);
        sb.append(", loginFinishCallback=");
        sb.append(this.f57373e);
        sb.append(", loginBundle=");
        sb.append(this.f57374f);
        sb.append(", onActionCompleted=");
        sb.append(this.f57375g);
        sb.append(")");
        return sb.toString();
    }

    public C21363e(Context context, int i, JSONObject jSONObject, BaseLoginMethod baseLoginMethod, C21559m mVar, Bundle bundle) {
        C7573i.m23587b(bundle, "loginBundle");
        this(context, i, jSONObject, baseLoginMethod, mVar, bundle, null);
    }

    private C21363e(Context context, int i, JSONObject jSONObject, BaseLoginMethod baseLoginMethod, C21559m mVar, Bundle bundle, Runnable runnable) {
        C7573i.m23587b(bundle, "loginBundle");
        this.f57369a = context;
        this.f57370b = i;
        this.f57371c = jSONObject;
        this.f57372d = baseLoginMethod;
        this.f57373e = mVar;
        this.f57374f = bundle;
        this.f57375g = null;
    }
}
