package com.google.android.gms.measurement.internal;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C16954s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f47499a;

    /* renamed from: b */
    private final /* synthetic */ String f47500b;

    /* renamed from: c */
    private final /* synthetic */ Object f47501c;

    /* renamed from: d */
    private final /* synthetic */ Object f47502d;

    /* renamed from: e */
    private final /* synthetic */ Object f47503e;

    /* renamed from: f */
    private final /* synthetic */ C16953r f47504f;

    C16954s(C16953r rVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f47504f = rVar;
        this.f47499a = i;
        this.f47500b = str;
        this.f47501c = obj;
        this.f47502d = obj2;
        this.f47503e = obj3;
    }

    public final void run() {
        C16806af b = this.f47504f.f47095q.mo43658b();
        if (b.mo43717w()) {
            if (this.f47504f.f47496j == 0) {
                if (this.f47504f.mo43587s().mo44055e()) {
                    this.f47504f.f47496j = 'C';
                } else {
                    this.f47504f.f47496j = 'c';
                }
            }
            if (this.f47504f.f47497k < 0) {
                this.f47504f.f47497k = 14710;
            }
            char charAt = "01VDIWEA?".charAt(this.f47499a);
            char a = this.f47504f.f47496j;
            long b2 = this.f47504f.f47497k;
            String a2 = C16953r.m56342a(true, this.f47500b, this.f47501c, this.f47502d, this.f47503e);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a);
            sb.append(b2);
            sb.append(":");
            sb.append(a2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f47500b.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            b.f46916b.mo43617a(sb2, 1);
        }
    }
}
