package com.iab.omid.library.bytedance.p788a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

/* renamed from: com.iab.omid.library.bytedance.a.d */
public final class C18395d extends ContentObserver {

    /* renamed from: a */
    private final Context f49903a;

    /* renamed from: b */
    private final AudioManager f49904b;

    /* renamed from: c */
    private final C18392a f49905c;

    /* renamed from: d */
    private final C18394c f49906d;

    /* renamed from: e */
    private float f49907e;

    public C18395d(Handler handler, Context context, C18392a aVar, C18394c cVar) {
        super(handler);
        this.f49903a = context;
        this.f49904b = (AudioManager) context.getSystemService("audio");
        this.f49905c = aVar;
        this.f49906d = cVar;
    }

    /* renamed from: a */
    private boolean m60538a(float f) {
        return f != this.f49907e;
    }

    /* renamed from: c */
    private float m60539c() {
        return C18392a.m60535a(this.f49904b.getStreamVolume(3), this.f49904b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m60540d() {
        this.f49906d.mo47794a(this.f49907e);
    }

    /* renamed from: a */
    public final void mo47795a() {
        this.f49907e = m60539c();
        m60540d();
        this.f49903a.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo47796b() {
        this.f49903a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m60539c();
        if (m60538a(c)) {
            this.f49907e = c;
            m60540d();
        }
    }
}
