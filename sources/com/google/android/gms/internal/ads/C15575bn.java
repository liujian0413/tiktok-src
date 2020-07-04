package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bn */
final class C15575bn extends C15573bl<Integer> {
    C15575bn(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40869a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42434b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Integer) this.f42435c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42434b);
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40871a(Editor editor, Object obj) {
        editor.putInt(this.f42434b, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40870a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f42434b, ((Integer) this.f42435c).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40868a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f42434b, ((Integer) this.f42435c).intValue()));
    }
}
