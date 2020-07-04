package com.bytedance.jirafast.utils;

import android.content.Context;
import com.bytedance.jirafast.base.C12004a;

/* renamed from: com.bytedance.jirafast.utils.d */
public class C12073d {

    /* renamed from: b */
    private static C12073d f32160b;

    /* renamed from: a */
    public C12004a f32161a;

    private C12073d() {
    }

    /* renamed from: a */
    public static C12073d m35220a() {
        if (f32160b == null) {
            synchronized (C12073d.class) {
                if (f32160b == null) {
                    f32160b = new C12073d();
                }
            }
        }
        return f32160b;
    }

    /* renamed from: a */
    public final void mo29754a(Context context, String str) {
        if (this.f32161a != null) {
            this.f32161a.mo29623a(context, str);
        }
    }
}
