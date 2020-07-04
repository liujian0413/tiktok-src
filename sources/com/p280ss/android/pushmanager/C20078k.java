package com.p280ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.message.C19834d;
import com.p280ss.android.message.C19834d.C19835a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.k */
public class C20078k implements C19834d {

    /* renamed from: a */
    private static volatile C20078k f54298a;

    /* renamed from: b */
    private List<C19834d> f54299b = new ArrayList();

    /* renamed from: c */
    private C19835a f54300c;

    private C20078k() {
    }

    /* renamed from: b */
    public static C20078k m66122b() {
        if (f54298a == null) {
            synchronized (C20078k.class) {
                if (f54298a == null) {
                    f54298a = new C20078k();
                }
            }
        }
        return f54298a;
    }

    /* renamed from: a */
    public final void mo53187a() {
        for (C19834d a : this.f54299b) {
            try {
                a.mo53187a();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53188a(Context context) {
        for (C19834d a : this.f54299b) {
            try {
                a.mo53188a(context);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53189a(Intent intent) {
        for (C19834d a : this.f54299b) {
            try {
                a.mo53189a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53185a(Context context, C20071d dVar) {
        this.f54300c = new C19835a() {
        };
        for (C19834d a : this.f54299b) {
            try {
                a.mo53185a(context, dVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53186a(Context context, Map<String, String> map) {
        for (C19834d a : this.f54299b) {
            try {
                a.mo53186a(context, map);
            } catch (Throwable unused) {
            }
        }
    }
}
