package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C16434c extends C14931j<C16434c> {

    /* renamed from: a */
    public String f46005a;

    /* renamed from: b */
    public int f46006b;

    /* renamed from: c */
    public int f46007c;

    /* renamed from: d */
    public int f46008d;

    /* renamed from: e */
    public int f46009e;

    /* renamed from: f */
    public int f46010f;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f46005a);
        hashMap.put("screenColors", Integer.valueOf(this.f46006b));
        hashMap.put("screenWidth", Integer.valueOf(this.f46007c));
        hashMap.put("screenHeight", Integer.valueOf(this.f46008d));
        hashMap.put("viewportWidth", Integer.valueOf(this.f46009e));
        hashMap.put("viewportHeight", Integer.valueOf(this.f46010f));
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16434c cVar = (C16434c) jVar;
        if (this.f46006b != 0) {
            cVar.f46006b = this.f46006b;
        }
        if (this.f46007c != 0) {
            cVar.f46007c = this.f46007c;
        }
        if (this.f46008d != 0) {
            cVar.f46008d = this.f46008d;
        }
        if (this.f46009e != 0) {
            cVar.f46009e = this.f46009e;
        }
        if (this.f46010f != 0) {
            cVar.f46010f = this.f46010f;
        }
        if (!TextUtils.isEmpty(this.f46005a)) {
            cVar.f46005a = this.f46005a;
        }
    }
}
