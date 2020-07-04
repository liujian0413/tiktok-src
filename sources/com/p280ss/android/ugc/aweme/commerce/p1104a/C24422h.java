package com.p280ss.android.ugc.aweme.commerce.p1104a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.h */
public class C24422h {

    /* renamed from: b */
    private static final String f64476b = "h";

    /* renamed from: a */
    public C24424b f64477a;

    /* renamed from: c */
    private Context f64478c;

    /* renamed from: d */
    private AudioManager f64479d;

    /* renamed from: e */
    private boolean f64480e;

    /* renamed from: f */
    private C24423a f64481f;

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.h$a */
    static class C24423a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C24422h> f64482a;

        /* renamed from: b */
        private int f64483b;

        public C24423a(C24422h hVar) {
            this.f64482a = new WeakReference<>(hVar);
            this.f64483b = hVar.mo63404a();
        }

        public final void onReceive(Context context, Intent intent) {
            if (("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) {
                C24422h hVar = (C24422h) this.f64482a.get();
                if (hVar != null) {
                    C24424b bVar = hVar.f64477a;
                    int i = this.f64483b;
                    this.f64483b = hVar.mo63404a();
                    if (bVar != null) {
                        if (this.f64483b == 0 && i > 0) {
                            bVar.mo63400b(this.f64483b);
                        } else if (this.f64483b > 0 && i == 0) {
                            bVar.mo63399a(this.f64483b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.h$b */
    public interface C24424b {
        /* renamed from: a */
        void mo63399a(int i);

        /* renamed from: b */
        void mo63400b(int i);
    }

    /* renamed from: a */
    public final int mo63404a() {
        if (this.f64479d != null) {
            return this.f64479d.getStreamVolume(3);
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo63405b() {
        if (this.f64479d != null) {
            return this.f64479d.getStreamMaxVolume(3);
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo63407d() {
        if (this.f64480e) {
            try {
                this.f64478c.unregisterReceiver(this.f64481f);
                this.f64481f = null;
                this.f64477a = null;
                this.f64480e = false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo63406c() {
        this.f64481f = new C24423a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        this.f64478c.registerReceiver(this.f64481f, intentFilter);
        this.f64480e = true;
    }

    public C24422h(Context context) {
        this.f64478c = context;
        this.f64479d = (AudioManager) context.getSystemService("audio");
    }
}
