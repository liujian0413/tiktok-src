package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bq */
final class C15579bq extends C15573bl<String> {
    C15579bq(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40869a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42434b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (String) this.f42435c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42434b);
        return bundle.getString(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40871a(Editor editor, Object obj) {
        editor.putString(this.f42434b, (String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40870a(JSONObject jSONObject) {
        return jSONObject.optString(this.f42434b, (String) this.f42435c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40868a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f42434b, (String) this.f42435c);
    }
}
