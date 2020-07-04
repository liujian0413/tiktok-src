package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e;

import android.os.Looper;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41363h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b */
public final class C40551b implements C40566e, C43755e {

    /* renamed from: a */
    public long f105375a;

    /* renamed from: b */
    public final Effect f105376b;

    /* renamed from: c */
    public final C43755e f105377c;

    /* renamed from: d */
    private volatile boolean f105378d;

    /* renamed from: e */
    private volatile boolean f105379e;

    /* renamed from: f */
    private volatile int f105380f;

    /* renamed from: g */
    private volatile int f105381g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b$a */
    static final class C40552a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f105382a;

        C40552a(C7561a aVar) {
            this.f105382a = aVar;
        }

        /* renamed from: a */
        private void m129652a() {
            this.f105382a.invoke();
        }

        public final /* synthetic */ Object call() {
            m129652a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b$b */
    static final class C40553b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40551b f105383a;

        C40553b(C40551b bVar) {
            this.f105383a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129653a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129653a() {
            this.f105383a.f105377c.mo9280a(this.f105383a.f105376b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b$c */
    static final class C40554c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40551b f105384a;

        /* renamed from: b */
        final /* synthetic */ Effect f105385b;

        /* renamed from: c */
        final /* synthetic */ C43726c f105386c;

        C40554c(C40551b bVar, Effect effect, C43726c cVar) {
            this.f105384a = bVar;
            this.f105385b = effect;
            this.f105386c = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129654a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129654a() {
            this.f105384a.f105377c.mo9281a(this.f105385b, this.f105386c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b$d */
    static final class C40555d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40551b f105387a;

        /* renamed from: b */
        final /* synthetic */ Effect f105388b;

        C40555d(C40551b bVar, Effect effect) {
            this.f105387a = bVar;
            this.f105388b = effect;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129655a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129655a() {
            this.f105387a.f105377c.mo9282b(this.f105388b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.b$e */
    static final class C40556e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40551b f105389a;

        /* renamed from: b */
        final /* synthetic */ int f105390b;

        C40556e(C40551b bVar, int i) {
            this.f105389a = bVar;
            this.f105390b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129656a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129656a() {
            this.f105389a.f105377c.mo70696a(this.f105389a.f105376b, this.f105390b, this.f105389a.f105375a);
        }
    }

    /* renamed from: b */
    private final void m129643b() {
        if (this.f105378d && this.f105379e) {
            m129642a((C7561a<C7581n>) new C40553b<C7581n>(this));
        }
    }

    /* renamed from: c */
    private final void m129644c() {
        int i = 100;
        if (!this.f105378d && !this.f105379e) {
            i = (this.f105381g + this.f105380f) / 2;
        } else if (!this.f105379e) {
            i = (this.f105381g + 100) / 2;
        } else if (!this.f105378d) {
            i = (this.f105380f + 100) / 2;
        }
        m129642a((C7561a<C7581n>) new C40556e<C7581n>(this, i));
    }

    /* renamed from: a */
    public final void mo100626a() {
        this.f105379e = true;
        String effectId = this.f105376b.getEffectId();
        C7573i.m23582a((Object) effectId, "effect.effectId");
        C41363h.m131935a(effectId);
        m129643b();
    }

    /* renamed from: a */
    public final void mo100627a(int i) {
        this.f105381g = i;
        m129644c();
    }

    /* renamed from: a */
    public final void mo9280a(Effect effect) {
        this.f105378d = true;
        m129643b();
    }

    /* renamed from: b */
    public final void mo9282b(Effect effect) {
        m129642a((C7561a<C7581n>) new C40555d<C7581n>(this, effect));
    }

    /* renamed from: a */
    private static void m129642a(C7561a<C7581n> aVar) {
        if (C7573i.m23585a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            C1592h.m7855a((Callable<TResult>) new C40552a<TResult>(aVar), C1592h.f5958b);
        }
    }

    public C40551b(Effect effect, C43755e eVar) {
        C7573i.m23587b(effect, "effect");
        C7573i.m23587b(eVar, "iEffectDownloadProgressListener");
        this.f105376b = effect;
        this.f105377c = eVar;
    }

    /* renamed from: a */
    public final void mo100628a(AVMusic aVMusic, String str) {
        C7573i.m23587b(aVMusic, "avMusic");
        this.f105379e = true;
        String effectId = this.f105376b.getEffectId();
        C7573i.m23582a((Object) effectId, "effect.effectId");
        C41363h.m131936a(effectId, aVMusic, str);
        if (str != null) {
            String musicId = aVMusic.getMusicId();
            C7573i.m23582a((Object) musicId, "avMusic.musicId");
            C40374af.m129114a(musicId, str);
        }
        m129643b();
    }

    /* renamed from: a */
    public final void mo9281a(Effect effect, C43726c cVar) {
        C7573i.m23587b(cVar, "e");
        m129642a((C7561a<C7581n>) new C40554c<C7581n>(this, effect, cVar));
    }

    /* renamed from: a */
    public final void mo70696a(Effect effect, int i, long j) {
        this.f105375a = j;
        this.f105380f = i;
        m129644c();
    }
}
