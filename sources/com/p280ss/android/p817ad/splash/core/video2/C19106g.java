package com.p280ss.android.p817ad.splash.core.video2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video2.g */
public final class C19106g {

    /* renamed from: a */
    public C19108b f51679a;

    /* renamed from: b */
    private C19107a f51680b;

    /* renamed from: c */
    private Context f51681c;

    /* renamed from: d */
    private AudioManager f51682d;

    /* renamed from: e */
    private boolean f51683e;

    /* renamed from: com.ss.android.ad.splash.core.video2.g$a */
    static class C19107a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C19106g> f51684a;

        public C19107a(C19106g gVar) {
            this.f51684a = new WeakReference<>(gVar);
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                C19106g gVar = (C19106g) this.f51684a.get();
                if (gVar != null) {
                    C19108b bVar = gVar.f51679a;
                    if (bVar != null) {
                        int a = gVar.mo50812a();
                        if (a >= 0) {
                            bVar.mo50810a(a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.g$b */
    public interface C19108b {
        /* renamed from: a */
        void mo50810a(int i);
    }

    /* renamed from: a */
    public final int mo50812a() {
        if (this.f51682d != null) {
            return this.f51682d.getStreamVolume(3);
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo50813b() {
        if (this.f51682d != null) {
            return this.f51682d.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* renamed from: c */
    public final void mo50814c() {
        this.f51680b = new C19107a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.f51681c.registerReceiver(this.f51680b, intentFilter);
        this.f51683e = true;
    }

    /* renamed from: d */
    public final void mo50815d() {
        if (this.f51683e) {
            try {
                this.f51681c.unregisterReceiver(this.f51680b);
                this.f51679a = null;
                this.f51683e = false;
            } catch (Exception unused) {
            }
        }
    }

    public C19106g(Context context) {
        this.f51681c = context;
        this.f51682d = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
