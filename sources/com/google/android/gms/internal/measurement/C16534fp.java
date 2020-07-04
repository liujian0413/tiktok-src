package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: com.google.android.gms.internal.measurement.fp */
final /* synthetic */ class C16534fp implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C16533fo f46322a;

    C16534fp(C16533fo foVar) {
        this.f46322a = foVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f46322a.mo42723a(sharedPreferences, str);
    }
}
