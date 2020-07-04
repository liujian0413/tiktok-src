package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: androidx.work.impl.utils.a */
public class C1551a {

    /* renamed from: a */
    private final Context f5878a;

    /* renamed from: b */
    private SharedPreferences f5879b;

    /* renamed from: c */
    private boolean f5880c;

    /* renamed from: b */
    private void m7611b() {
        if (!this.f5880c) {
            this.f5879b = C7285c.m22838a(this.f5878a, "androidx.work.util.id", 0);
            this.f5880c = true;
        }
    }

    /* renamed from: a */
    public final int mo6816a() {
        int a;
        synchronized (C1551a.class) {
            m7611b();
            a = m7609a("next_alarm_manager_id");
        }
        return a;
    }

    public C1551a(Context context) {
        this.f5878a = context;
    }

    /* renamed from: a */
    private int m7609a(String str) {
        int i = 0;
        int i2 = this.f5879b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        m7610a(str, i);
        return i2;
    }

    /* renamed from: a */
    private void m7610a(String str, int i) {
        this.f5879b.edit().putInt(str, i).apply();
    }

    /* renamed from: a */
    public final int mo6817a(int i, int i2) {
        synchronized (C1551a.class) {
            m7611b();
            int a = m7609a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            m7610a("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
