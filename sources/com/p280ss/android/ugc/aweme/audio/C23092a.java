package com.p280ss.android.ugc.aweme.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.audio.a */
public class C23092a {

    /* renamed from: b */
    private static final boolean f60971b = C7163a.m22363a();

    /* renamed from: c */
    private static volatile C23092a f60972c;

    /* renamed from: a */
    public int f60973a = -1;

    /* renamed from: d */
    private final List<C23094a> f60974d;

    /* renamed from: e */
    private BroadcastReceiver f60975e;

    /* renamed from: f */
    private boolean f60976f;

    /* renamed from: com.ss.android.ugc.aweme.audio.a$a */
    public interface C23094a {
        /* renamed from: a */
        void mo60170a(int i);
    }

    private C23092a() {
        if (f60972c == null) {
            this.f60974d = new CopyOnWriteArrayList();
            return;
        }
        throw new RuntimeException("Illegal access.");
    }

    /* renamed from: a */
    public static C23092a m75908a() {
        if (f60972c == null) {
            synchronized (C23092a.class) {
                if (f60972c == null) {
                    f60972c = new C23092a();
                }
            }
        }
        return f60972c;
    }

    /* renamed from: b */
    private void m75910b(Context context) {
        if (this.f60976f) {
            try {
                context.getApplicationContext().unregisterReceiver(this.f60975e);
                this.f60976f = false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m75909a(Context context) {
        if (!this.f60976f) {
            if (this.f60975e == null) {
                this.f60975e = new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        int d = AudioUtils.m75902d(context);
                        if (C23092a.this.f60973a != d) {
                            C23092a.this.f60973a = d;
                            C23092a.this.mo60166a(d);
                        }
                    }
                };
            }
            try {
                context.getApplicationContext().registerReceiver(this.f60975e, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                this.f60976f = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo60166a(int i) {
        synchronized (this.f60974d) {
            for (C23094a a : this.f60974d) {
                a.mo60170a(i);
            }
        }
    }

    /* renamed from: b */
    public final void mo60168b(Context context, C23094a aVar) {
        synchronized (this.f60974d) {
            this.f60974d.remove(aVar);
            if (this.f60974d.size() == 0) {
                m75910b(context);
            }
        }
    }

    /* renamed from: a */
    public final void mo60167a(Context context, C23094a aVar) {
        synchronized (this.f60974d) {
            if (!this.f60974d.contains(aVar)) {
                this.f60974d.add(aVar);
            }
            m75909a(context);
        }
    }
}
