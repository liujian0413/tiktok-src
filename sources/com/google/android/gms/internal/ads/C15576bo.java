package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bo */
final class C15576bo extends C15573bl<Long> {
    C15576bo(int i, String str, Long l) {
        super(i, str, l, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40869a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42434b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Long) this.f42435c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42434b);
        return Long.valueOf(bundle.getLong(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40871a(Editor editor, Object obj) {
        editor.putLong(this.f42434b, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40870a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f42434b, ((Long) this.f42435c).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40868a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f42434b, ((Long) this.f42435c).longValue()));
    }
}
