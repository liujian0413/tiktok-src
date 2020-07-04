package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: androidx.work.impl.utils.c */
public class C1571c {

    /* renamed from: a */
    private Context f5917a;

    /* renamed from: b */
    private SharedPreferences f5918b;

    /* renamed from: a */
    public final boolean mo6847a() {
        return m7663b().getBoolean("reschedule_needed", false);
    }

    /* renamed from: b */
    private SharedPreferences m7663b() {
        SharedPreferences sharedPreferences;
        synchronized (C1571c.class) {
            if (this.f5918b == null) {
                this.f5918b = C7285c.m22838a(this.f5917a, "androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f5918b;
        }
        return sharedPreferences;
    }

    public C1571c(Context context) {
        this.f5917a = context;
    }

    /* renamed from: a */
    public final void mo6846a(boolean z) {
        m7663b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
