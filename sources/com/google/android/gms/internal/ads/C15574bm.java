package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bm */
final class C15574bm extends C15573bl<Boolean> {
    C15574bm(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40869a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42434b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Boolean) this.f42435c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42434b);
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40871a(Editor editor, Object obj) {
        editor.putBoolean(this.f42434b, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40870a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f42434b, ((Boolean) this.f42435c).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40868a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f42434b, ((Boolean) this.f42435c).booleanValue()));
    }
}
