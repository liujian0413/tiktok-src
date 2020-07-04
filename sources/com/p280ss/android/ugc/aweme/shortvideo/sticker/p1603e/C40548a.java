package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e;

import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.C27491l;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40950a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.a */
public abstract class C40548a implements C40949u {

    /* renamed from: a */
    public ConcurrentHashMap<String, C40950a> f105368a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public C27481e f105369b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.a$a */
    public static final class C40549a implements C43755e {

        /* renamed from: a */
        final /* synthetic */ C40548a f105370a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f105371b;

        /* renamed from: c */
        final /* synthetic */ C40951b f105372c;

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
            C7573i.m23587b(effect, "effect");
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            C7573i.m23587b(effect, "effect");
            if (!this.f105370a.mo100624a(effect)) {
                StringBuilder sb = new StringBuilder("Effect is not ready ");
                sb.append(effect.getName());
                C41530am.m132283b(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Effect is ready");
                sb2.append(effect.getName());
                C41530am.m132280a(sb2.toString());
            }
            this.f105371b.f104910c = 1;
            this.f105372c.mo100188b(effect);
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105370a.f105368a;
            Effect effect2 = this.f105371b.f104908a;
            C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
            concurrentHashMap.remove(effect2.getEffectId());
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            this.f105371b.f104910c = 3;
            this.f105372c.mo100187a(effect, cVar);
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105370a.f105368a;
            Effect effect2 = this.f105371b.f104908a;
            C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
            concurrentHashMap.remove(effect2.getEffectId());
        }

        C40549a(C40548a aVar, StickerWrapper stickerWrapper, C40951b bVar) {
            this.f105370a = aVar;
            this.f105371b = stickerWrapper;
            this.f105372c = bVar;
        }

        /* renamed from: a */
        public final void mo70696a(Effect effect, int i, long j) {
            C7573i.m23587b(effect, "effect");
            this.f105371b.f104910c = 5;
            this.f105372c.mo100196a(effect, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e.a$b */
    public static final class C40550b implements C43755e {

        /* renamed from: a */
        final /* synthetic */ C40548a f105373a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f105374b;

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
            C7573i.m23587b(effect, "effect");
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            C7573i.m23587b(effect, "effect");
            this.f105374b.f104910c = 1;
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105373a.f105368a;
            Effect effect2 = this.f105374b.f104908a;
            C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
            C40950a aVar = (C40950a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                aVar.mo101237a(effect);
            }
            ConcurrentHashMap<String, C40950a> concurrentHashMap2 = this.f105373a.f105368a;
            Effect effect3 = this.f105374b.f104908a;
            C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
            concurrentHashMap2.remove(effect3.getEffectId());
        }

        C40550b(C40548a aVar, StickerWrapper stickerWrapper) {
            this.f105373a = aVar;
            this.f105374b = stickerWrapper;
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            this.f105374b.f104910c = 3;
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105373a.f105368a;
            Effect effect2 = this.f105374b.f104908a;
            C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
            C40950a aVar = (C40950a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                if (effect == null) {
                    C7573i.m23580a();
                }
                aVar.mo101239a(effect, cVar);
            }
            ConcurrentHashMap<String, C40950a> concurrentHashMap2 = this.f105373a.f105368a;
            Effect effect3 = this.f105374b.f104908a;
            C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
            concurrentHashMap2.remove(effect3.getEffectId());
        }

        /* renamed from: a */
        public final void mo70696a(Effect effect, int i, long j) {
            C7573i.m23587b(effect, "effect");
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105373a.f105368a;
            Effect effect2 = this.f105374b.f104908a;
            C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
            C40950a aVar = (C40950a) concurrentHashMap.get(effect2.getEffectId());
            if (aVar != null) {
                aVar.mo101238a(effect, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo100624a(Effect effect) {
        return StickerWrapper.m129074a(effect, this.f105369b);
    }

    public C40548a(C27481e eVar) {
        C7573i.m23587b(eVar, "mEffectPlatform");
        this.f105369b = eVar;
    }

    /* renamed from: a */
    public final void mo100621a(StickerWrapper stickerWrapper) {
        if (stickerWrapper != null) {
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105368a;
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "stickerWrapper.effect");
            if (!concurrentHashMap.containsKey(effect.getEffectId())) {
                Map map = this.f105368a;
                Effect effect2 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
                String effectId = effect2.getEffectId();
                C7573i.m23582a((Object) effectId, "stickerWrapper.effect.effectId");
                map.put(effectId, new C40950a());
                if (mo100624a(stickerWrapper.f104908a)) {
                    stickerWrapper.f104910c = 1;
                    ConcurrentHashMap<String, C40950a> concurrentHashMap2 = this.f105368a;
                    Effect effect3 = stickerWrapper.f104908a;
                    C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
                    C40950a aVar = (C40950a) concurrentHashMap2.get(effect3.getEffectId());
                    if (aVar != null) {
                        aVar.mo101237a(stickerWrapper.f104908a);
                    }
                    ConcurrentHashMap<String, C40950a> concurrentHashMap3 = this.f105368a;
                    Effect effect4 = stickerWrapper.f104908a;
                    C7573i.m23582a((Object) effect4, "stickerWrapper.effect");
                    concurrentHashMap3.remove(effect4.getEffectId());
                    return;
                }
                C27491l a = C27491l.m90122a((C43760j) new C40550b(this, stickerWrapper));
                C7573i.m23582a((Object) a, "MonitoredFetchEffectList…\n            }\n        })");
                mo100623a(stickerWrapper, (C43755e) a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100623a(StickerWrapper stickerWrapper, C43755e eVar) {
        C7573i.m23587b(stickerWrapper, "stickerWrapper");
        C7573i.m23587b(eVar, "iFetchEffectListener");
        this.f105369b.mo70620a(stickerWrapper.f104908a, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100625b(StickerWrapper stickerWrapper, C43755e eVar) {
        C7573i.m23587b(stickerWrapper, "stickerWrapper");
        C7573i.m23587b(eVar, "iEffectDownloadProgressListener");
        this.f105369b.mo70620a(stickerWrapper.f104908a, eVar);
    }

    /* renamed from: a */
    public final void mo100622a(StickerWrapper stickerWrapper, C40951b bVar) {
        C7573i.m23587b(bVar, "onStickerDownloadListener");
        if (stickerWrapper != null) {
            ConcurrentHashMap<String, C40950a> concurrentHashMap = this.f105368a;
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "stickerWrapper.effect");
            if (concurrentHashMap.get(effect.getEffectId()) != null) {
                bVar.mo100186a(stickerWrapper.f104908a);
                ConcurrentHashMap<String, C40950a> concurrentHashMap2 = this.f105368a;
                Effect effect2 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
                C40950a aVar = (C40950a) concurrentHashMap2.get(effect2.getEffectId());
                if (aVar != null) {
                    aVar.f106462a = bVar;
                }
            } else {
                bVar.mo100186a(stickerWrapper.f104908a);
                Map map = this.f105368a;
                Effect effect3 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
                String effectId = effect3.getEffectId();
                C7573i.m23582a((Object) effectId, "stickerWrapper.effect.effectId");
                map.put(effectId, new C40950a());
                C27491l a = C27491l.m90122a((C43760j) new C40549a(this, stickerWrapper, bVar));
                C7573i.m23582a((Object) a, "MonitoredFetchEffectList…         }\n            })");
                mo100625b(stickerWrapper, a);
            }
        }
    }
}
