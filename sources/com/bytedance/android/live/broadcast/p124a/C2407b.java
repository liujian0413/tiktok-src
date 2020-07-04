package com.bytedance.android.live.broadcast.p124a;

import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.model.C2437b;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6319n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.a.b */
public final class C2407b implements C2406a {

    /* renamed from: a */
    public static final C2408a f7945a = new C2408a(null);

    /* renamed from: b */
    private C7321c f7946b;

    /* renamed from: c */
    private Boolean f7947c;

    /* renamed from: com.bytedance.android.live.broadcast.a.b$a */
    public static final class C2408a {
        private C2408a() {
        }

        public /* synthetic */ C2408a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$b */
    public static final class C2409b implements C2511b<C2406a> {
        /* renamed from: a */
        public final C2512a<C2406a> mo8847a(C2512a<C2406a> aVar) {
            C7573i.m23587b(aVar, "config");
            C2512a<C2406a> a = aVar.mo9081a(new C2407b()).mo9080a();
            C7573i.m23582a((Object) a, "config.provideWith(LiveC…tService()).asSingleton()");
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$c */
    static final class C2410c<T> implements C7326g<C3479d<Void>> {

        /* renamed from: a */
        public static final C2410c f7948a = new C2410c();

        C2410c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.a.b$d */
    static final class C2411d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C2411d f7949a = new C2411d();

        C2411d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m10133a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m10133a(Throwable th) {
            C7573i.m23582a((Object) th, "throwable");
            C3166a.m11955a(6, "LiveCommerceEffectService", th.getStackTrace());
        }
    }

    /* renamed from: c */
    private boolean m10128c() {
        if (this.f7947c != null) {
            return !C7573i.m23585a((Object) this.f7947c, (Object) Boolean.valueOf(mo8845a()));
        }
        this.f7947c = Boolean.valueOf(mo8845a());
        return true;
    }

    /* renamed from: b */
    public final void mo8846b() {
        C7321c cVar = this.f7946b;
        if (cVar != null && !cVar.isDisposed()) {
            C7321c cVar2 = this.f7946b;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        this.f7947c = null;
    }

    /* renamed from: a */
    public final boolean mo8845a() {
        C3338l<Boolean> lVar = LiveConfigSettingKeys.LIVE_ENABLE_SHOW_UNUSED_EFFECT_LABEL;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LI…_SHOW_UNUSED_EFFECT_LABEL");
        if (!((Boolean) lVar.mo10240a()).booleanValue()) {
            return false;
        }
        C2619g c = C2515f.m10417f().mo9075b().mo9215c();
        C7573i.m23582a((Object) c, "LiveInternalService.inst…vice().liveFilterHelper()");
        boolean z = !C6319n.m19593a(c.mo9243a());
        List a = C2515f.m10417f().mo9074a().mo8884a(C2418b.f7951b);
        C7573i.m23582a((Object) a, "LiveInternalService.inst…ker(StickerPanel.STICKER)");
        boolean z2 = !a.isEmpty();
        List<C9355c> a2 = C2515f.m10417f().mo9074a().mo8884a("beauty");
        C7573i.m23582a((Object) a2, "LiveInternalService.inst…cker(StickerPanel.BEAUTY)");
        boolean z3 = false;
        for (C9355c cVar : a2) {
            C7573i.m23582a((Object) cVar, "it");
            List<String> list = cVar.f25572k;
            C7573i.m23582a((Object) list, "it.updateKeys");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!C7573i.m23584a(C2515f.m10417f().mo9074a().mo8899c((String) it.next()), 0.0f)) {
                    z3 = true;
                    break;
                }
            }
        }
        List<C9355c> a3 = C2515f.m10417f().mo9074a().mo8884a(C2418b.f7953d);
        C7573i.m23582a((Object) a3, "LiveInternalService.inst…rPanel.SMALL_ITEM_BEAUTY)");
        boolean z4 = false;
        for (C9355c cVar2 : a3) {
            C7573i.m23582a((Object) cVar2, "it");
            List<String> list2 = cVar2.f25572k;
            C7573i.m23582a((Object) list2, "it.updateKeys");
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!C7573i.m23584a(C2515f.m10417f().mo9074a().mo8899c((String) it2.next()), 0.0f)) {
                    z4 = true;
                    break;
                }
            }
        }
        if (z || z2 || z3 || z4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo8844a(long j) {
        boolean z;
        boolean z2;
        if (m10128c()) {
            this.f7947c = Boolean.valueOf(mo8845a());
            BroadcastRoomApi d = C2515f.m10417f().mo9076c().mo9169d();
            C2619g c = C2515f.m10417f().mo9075b().mo9215c();
            C7573i.m23582a((Object) c, "LiveInternalService.inst…vice().liveFilterHelper()");
            String d2 = c.mo9253d();
            C8947c<Float> cVar = C8946b.f24362N;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.WHITENING_PARAM_V2");
            int floatValue = (int) (((Number) cVar.mo22117a()).floatValue() * 100.0f);
            C8947c<Float> cVar2 = C8946b.f24363O;
            C7573i.m23582a((Object) cVar2, "LivePluginProperties.BEAUTY_SKIN_PARAM_V2");
            int floatValue2 = (int) (((Number) cVar2.mo22117a()).floatValue() * 100.0f);
            C8947c<Float> cVar3 = C8946b.f24364P;
            C7573i.m23582a((Object) cVar3, "LivePluginProperties.BIG_EYES_PARAM");
            int floatValue3 = (int) (((Number) cVar3.mo22117a()).floatValue() * 100.0f);
            C8947c<Float> cVar4 = C8946b.f24365Q;
            C7573i.m23582a((Object) cVar4, "LivePluginProperties.FACE_LIFT_PARAM");
            int floatValue4 = (int) (((Number) cVar4.mo22117a()).floatValue() * 100.0f);
            Boolean bool = this.f7947c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            this.f7946b = d.uploadBeautyParams(j, d2, floatValue, floatValue2, floatValue3, floatValue4, z).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) C2410c.f7948a, (C7326g<? super Throwable>) C2411d.f7949a);
            C9097a a = C9097a.m27146a();
            Boolean bool2 = this.f7947c;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            a.mo22267a((Object) new C2437b(z2));
        }
    }
}
