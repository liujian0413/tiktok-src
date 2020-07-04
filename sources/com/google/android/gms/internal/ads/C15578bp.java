package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bp */
final class C15578bp extends C15573bl<Float> {
    C15578bp(int i, String str, Float f) {
        super(i, str, f, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40869a(Bundle bundle) {
        String str = "com.google.android.gms.ads.flag.";
        String valueOf = String.valueOf(this.f42434b);
        if (!bundle.containsKey(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))) {
            return (Float) this.f42435c;
        }
        String str2 = "com.google.android.gms.ads.flag.";
        String valueOf2 = String.valueOf(this.f42434b);
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40871a(Editor editor, Object obj) {
        editor.putFloat(this.f42434b, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40870a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f42434b, (double) ((Float) this.f42435c).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo40868a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f42434b, ((Float) this.f42435c).floatValue()));
    }
}
