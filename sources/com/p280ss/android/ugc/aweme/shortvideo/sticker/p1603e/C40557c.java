package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35526aa;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42599i;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c */
public final class C40557c extends C40548a {

    /* renamed from: c */
    public C40565d f105391c = new C40563d();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$a */
    public static final class C40558a implements C35526aa {

        /* renamed from: a */
        final /* synthetic */ C40566e f105392a;

        /* renamed from: b */
        final /* synthetic */ String f105393b;

        /* renamed from: c */
        final /* synthetic */ boolean f105394c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$a$a */
        public static final class C40559a implements C42599i {

            /* renamed from: a */
            final /* synthetic */ C40558a f105395a;

            /* renamed from: b */
            final /* synthetic */ AVMusic f105396b;

            C40559a(C40558a aVar, AVMusic aVMusic) {
                this.f105395a = aVar;
                this.f105396b = aVMusic;
            }

            /* renamed from: a */
            public final void mo100634a(String str, int i, String str2, int i2) {
                C7573i.m23587b(str, "musicUrl");
                this.f105395a.f105392a.mo100627a(i2);
            }

            /* renamed from: a */
            public final void mo100635a(String str, int i, String str2, Exception exc) {
                C7573i.m23587b(str, "musicUrl");
                this.f105395a.f105392a.mo100626a();
            }

            /* renamed from: a */
            public final void mo100636a(String str, int i, String str2, float[] fArr) {
                C7573i.m23587b(str, "musicFile");
                this.f105395a.f105392a.mo100628a(this.f105396b, str);
            }
        }

        /* renamed from: a */
        public final void mo90340a(Exception exc) {
            this.f105392a.mo100626a();
        }

        /* renamed from: a */
        public final void mo90339a(AVMusic aVMusic) {
            if (aVMusic == null) {
                this.f105392a.mo100626a();
                return;
            }
            String a = C40374af.m129112a(this.f105393b);
            IAVMusicService a2 = C35574k.m114859a().mo70086a();
            Application a3 = C29960a.m98230a();
            C7573i.m23582a((Object) a3, "AppProvider.getApp()");
            Context applicationContext = a3.getApplicationContext();
            C7573i.m23582a((Object) applicationContext, "AppProvider.getApp().applicationContext");
            boolean z = false;
            if (!a2.mo103861a(aVMusic, applicationContext, false)) {
                this.f105392a.mo100626a();
                return;
            }
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                this.f105392a.mo100627a(100);
                this.f105392a.mo100628a(aVMusic, a);
            } else if (!this.f105394c) {
                this.f105392a.mo100627a(100);
                this.f105392a.mo100628a(aVMusic, null);
            } else {
                C35574k.m114859a().mo70086a().mo103856a(aVMusic, (C42599i) new C40559a(this, aVMusic));
            }
        }

        C40558a(C40566e eVar, String str, boolean z) {
            this.f105392a = eVar;
            this.f105393b = str;
            this.f105394c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$b */
    static final class C40560b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40557c f105397a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f105398b;

        /* renamed from: c */
        final /* synthetic */ C40551b f105399c;

        C40560b(C40557c cVar, StickerWrapper stickerWrapper, C40551b bVar) {
            this.f105397a = cVar;
            this.f105398b = stickerWrapper;
            this.f105399c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129674a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129674a() {
            C40557c.super.mo100625b(this.f105398b, this.f105399c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$c */
    public static final class C40561c implements C43759i {

        /* renamed from: a */
        final /* synthetic */ C40557c f105400a;

        /* renamed from: b */
        final /* synthetic */ C43760j f105401b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$c$a */
        public static final class C40562a implements C43755e {

            /* renamed from: a */
            final /* synthetic */ C40561c f105402a;

            /* renamed from: b */
            final /* synthetic */ List f105403b;

            /* renamed from: a */
            public final void mo70696a(Effect effect, int i, long j) {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                this.f105402a.f105401b.mo9280a(effect);
            }

            /* renamed from: b */
            public final void mo9282b(Effect effect) {
                this.f105402a.f105401b.mo9282b(effect);
            }

            C40562a(C40561c cVar, List list) {
                this.f105402a = cVar;
                this.f105403b = list;
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                C7573i.m23587b(cVar, "e");
                this.f105402a.f105401b.mo9281a(effect, cVar);
            }
        }

        /* renamed from: a */
        public final void mo95925a(C43726c cVar) {
            C43760j jVar = this.f105401b;
            if (cVar == null) {
                cVar = new C43726c(-1, new IllegalStateException("get effect info error"));
            }
            jVar.mo9281a(null, cVar);
        }

        /* renamed from: a */
        public final void mo95926a(List<Effect> list) {
            List<Effect> list2;
            if (list != null) {
                if (!list.isEmpty()) {
                    list2 = list;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    Effect effect = (Effect) list.get(0);
                    if (this.f105400a.mo100633b(effect)) {
                        C40551b bVar = new C40551b(effect, new C40562a(this, list));
                        C40557c cVar = this.f105400a;
                        Object obj = effect.getMusic().get(0);
                        C7573i.m23582a(obj, "targetEffect.music[0]");
                        C40557c.m129660a((String) obj, (C40566e) bVar, true);
                        this.f105400a.f105369b.mo70620a(effect, bVar);
                    }
                    this.f105400a.f105369b.mo70620a(effect, this.f105401b);
                    return;
                }
            }
            mo95925a(new C43726c(-1, new IllegalStateException("get effect info error")));
        }

        C40561c(C40557c cVar, C43760j jVar) {
            this.f105400a = cVar;
            this.f105401b = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$d */
    public static final class C40563d implements C40565d {
        C40563d() {
        }

        /* renamed from: a */
        public final boolean mo100378a(Effect effect) {
            C7573i.m23587b(effect, "effect");
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.c$e */
    static final class C40564e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40557c f105404a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f105405b;

        /* renamed from: c */
        final /* synthetic */ C40551b f105406c;

        C40564e(C40557c cVar, StickerWrapper stickerWrapper, C40551b bVar) {
            this.f105404a = cVar;
            this.f105405b = stickerWrapper;
            this.f105406c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129682a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129682a() {
            C40557c.super.mo100623a(this.f105405b, (C43755e) this.f105406c);
        }
    }

    /* renamed from: a */
    public final void mo100630a(C40565d dVar) {
        C7573i.m23587b(dVar, "<set-?>");
        this.f105391c = dVar;
    }

    public C40557c(C27481e eVar) {
        C7573i.m23587b(eVar, "effectPlatform");
        super(eVar);
    }

    /* renamed from: b */
    public final boolean mo100633b(Effect effect) {
        boolean z;
        boolean z2 = true;
        if (effect != null) {
            if (C40496bh.m129472q(effect)) {
                Collection music = effect.getMusic();
                if (music == null || music.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || this.f105391c.mo100378a(effect)) {
                    return false;
                }
            }
            return false;
        }
        z2 = false;
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo100624a(Effect effect) {
        if (effect == null || !C40496bh.m129472q(effect)) {
            return super.mo100624a(effect);
        }
        if (!super.mo100624a(effect) || !StickerWrapper.m129073a(effect)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo100625b(StickerWrapper stickerWrapper, C43755e eVar) {
        C7573i.m23587b(stickerWrapper, "stickerWrapper");
        C7573i.m23587b(eVar, "iEffectDownloadProgressListener");
        if (!mo100633b(stickerWrapper.f104908a)) {
            super.mo100625b(stickerWrapper, eVar);
            return;
        }
        Effect effect = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect, "stickerWrapper.effect");
        C40551b bVar = new C40551b(effect, eVar);
        m129657a(stickerWrapper, bVar, (C7561a<C7581n>) new C40560b<C7581n>(this, stickerWrapper, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100623a(StickerWrapper stickerWrapper, C43755e eVar) {
        C7573i.m23587b(stickerWrapper, "stickerWrapper");
        C7573i.m23587b(eVar, "iFetchEffectListener");
        if (!mo100633b(stickerWrapper.f104908a)) {
            super.mo100623a(stickerWrapper, eVar);
            return;
        }
        Effect effect = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect, "stickerWrapper.effect");
        C40551b bVar = new C40551b(effect, eVar);
        m129657a(stickerWrapper, bVar, (C7561a<C7581n>) new C40564e<C7581n>(this, stickerWrapper, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m129660a(String str, C40566e eVar, boolean z) {
        C35574k.m114859a().mo70086a().mo103858a(str, (C35526aa) new C40558a(eVar, str, z));
    }

    /* renamed from: a */
    private final void m129657a(StickerWrapper stickerWrapper, C40551b bVar, C7561a<C7581n> aVar) {
        if (!StickerWrapper.m129074a(stickerWrapper.f104908a, this.f105369b)) {
            aVar.invoke();
        } else {
            bVar.mo9280a(stickerWrapper.f104908a);
        }
        Effect effect = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect, "stickerWrapper.effect");
        Object obj = effect.getMusic().get(0);
        C7573i.m23582a(obj, "stickerWrapper.effect.music[0]");
        m129660a((String) obj, (C40566e) bVar, !stickerWrapper.f104911d);
    }

    /* renamed from: a */
    public final void mo100631a(String str, String str2, C43760j jVar) {
        C7573i.m23587b(str, "effectId");
        C7573i.m23587b(jVar, "listener");
        Map hashMap = new HashMap();
        hashMap.put("scene", str2);
        mo100632a(str, hashMap, jVar);
    }

    /* renamed from: a */
    public final void mo100632a(String str, Map<String, String> map, C43760j jVar) {
        C7573i.m23587b(str, "effectId");
        C7573i.m23587b(jVar, "listener");
        this.f105369b.mo70639a(C7525m.m23457a(str), map, false, (C43759i) new C40561c(this, jVar));
    }
}
