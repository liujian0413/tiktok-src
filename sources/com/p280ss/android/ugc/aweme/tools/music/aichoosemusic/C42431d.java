package com.p280ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.d */
public final class C42431d {

    /* renamed from: a */
    public C15389d f110325a;

    /* renamed from: b */
    public C42433b f110326b;

    /* renamed from: c */
    public long f110327c = 100;

    /* renamed from: d */
    private C42432a f110328d = new C42432a(this);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.d$a */
    static final class C42432a extends Handler {

        /* renamed from: a */
        public WeakReference<C42431d> f110329a;

        public C42432a(C42431d dVar) {
            C7573i.m23587b(dVar, "aiMusicPositionPlayer");
            super(Looper.getMainLooper());
            this.f110329a = new WeakReference<>(dVar);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C42431d dVar = (C42431d) this.f110329a.get();
            if (dVar != null) {
                if (dVar == null) {
                    C7573i.m23580a();
                }
                if (!(dVar.f110325a == null || dVar.f110326b == null)) {
                    C42433b bVar = dVar.f110326b;
                    if (bVar == null) {
                        C7573i.m23580a();
                    }
                    C15389d dVar2 = dVar.f110325a;
                    if (dVar2 == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo103911a(dVar2.mo38862m());
                }
                postDelayed(null, dVar.f110327c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.d$b */
    public interface C42433b {
        /* renamed from: a */
        void mo103911a(int i);
    }

    /* renamed from: b */
    public final void mo103942b() {
        this.f110328d.removeCallbacksAndMessages(null);
    }

    /* renamed from: d */
    public final void mo103944d() {
        this.f110328d.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo103940a() {
        this.f110328d.removeCallbacksAndMessages(null);
        this.f110328d.postDelayed(null, this.f110327c);
    }

    /* renamed from: c */
    public final void mo103943c() {
        this.f110328d.removeCallbacksAndMessages(null);
        this.f110328d.postDelayed(null, this.f110327c);
    }

    /* renamed from: a */
    public final void mo103941a(C42433b bVar) {
        C7573i.m23587b(bVar, "positionListener");
        this.f110326b = bVar;
    }
}
