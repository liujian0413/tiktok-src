package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f;

import com.bytedance.common.utility.C6311g;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27417c;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40504a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40505b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40506c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40507d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40508e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40900a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.b */
public final class C40569b {

    /* renamed from: a */
    public static final C40569b f105409a = new C40569b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f105410b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<Integer> f105411c = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.b$a */
    public static final class C40570a implements C43764n {

        /* renamed from: a */
        final /* synthetic */ int f105412a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f105413b;

        /* renamed from: c */
        final /* synthetic */ C40900a f105414c;

        /* renamed from: d */
        final /* synthetic */ String f105415d;

        /* renamed from: e */
        final /* synthetic */ List f105416e;

        /* renamed from: f */
        final /* synthetic */ String f105417f;

        /* renamed from: a */
        public final void mo100237a(C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            if (this.f105412a == 0) {
                C40569b.f105410b = true;
            }
            C40569b.f105411c.add(Integer.valueOf(this.f105412a));
            if (C40569b.f105410b && C40569b.m129697a(this.f105416e)) {
                C40900a aVar = this.f105414c;
                if (aVar != null) {
                    aVar.mo100340a(cVar);
                }
                C40569b.m129693a();
            }
        }

        /* renamed from: a */
        public final void mo100238a(ResourceListModel resourceListModel) {
            C7573i.m23587b(resourceListModel, "response");
            C40569b.f105411c.add(Integer.valueOf(this.f105412a));
            C6600e S = C35574k.m114859a().mo70085S();
            if (!C40517g.m129531a(this.f105413b.f104908a, resourceListModel)) {
                if (this.f105412a == 0) {
                    C40569b.f105410b = true;
                }
                this.f105413b.f104910c = 1;
                Effect effect = this.f105413b.f104908a;
                C7573i.m23582a((Object) effect, "stickerWrapper.effect");
                effect.setResourceId(S.mo15979b((Object) resourceListModel));
                C40517g.m129530a(this.f105415d, this.f105417f, this.f105416e, this.f105413b);
            } else if (this.f105412a == 0) {
                C40900a aVar = this.f105414c;
                if (aVar != null) {
                    String str = this.f105415d;
                    Effect effect2 = this.f105413b.f104908a;
                    C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
                    aVar.mo100341a(str, effect2, resourceListModel);
                }
            } else {
                this.f105413b.f104910c = 3;
                Effect effect3 = this.f105413b.f104908a;
                C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
                effect3.setResourceId(S.mo15979b((Object) resourceListModel));
                if (this.f105412a >= 0) {
                    C40517g.m129526a(this.f105412a, this.f105413b, this.f105416e, this.f105417f);
                }
                C40517g.m129530a(this.f105415d, this.f105417f, this.f105416e, this.f105413b);
            }
            if (C40569b.f105410b && C40569b.m129697a(this.f105416e)) {
                C40900a aVar2 = this.f105414c;
                if (aVar2 != null) {
                    aVar2.mo100343a(this.f105416e, resourceListModel);
                }
                C40569b.m129693a();
            }
        }

        C40570a(int i, StickerWrapper stickerWrapper, C40900a aVar, String str, List list, String str2) {
            this.f105412a = i;
            this.f105413b = stickerWrapper;
            this.f105414c = aVar;
            this.f105415d = str;
            this.f105416e = list;
            this.f105417f = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.b$b */
    public static final class C40571b implements C40505b<C40506c, Void> {

        /* renamed from: a */
        public long f105418a;

        /* renamed from: b */
        final /* synthetic */ Effect f105419b;

        /* renamed from: c */
        final /* synthetic */ ResourceListModel f105420c;

        /* renamed from: d */
        final /* synthetic */ List f105421d;

        /* renamed from: e */
        final /* synthetic */ int f105422e;

        /* renamed from: f */
        final /* synthetic */ List f105423f;

        /* renamed from: g */
        final /* synthetic */ String f105424g;

        /* renamed from: h */
        final /* synthetic */ String f105425h;

        /* renamed from: i */
        final /* synthetic */ C40900a f105426i;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo100349a(Object obj) {
            m129703a((Void) null);
        }

        /* renamed from: a */
        private void m129703a(Void voidR) {
            Effect effect = this.f105419b;
            ResourceListModel resourceListModel = this.f105420c;
            List list = this.f105421d;
            C7573i.m23582a((Object) list, "resourceBeans");
            Effect a = C40517g.m129520a(effect, resourceListModel, list);
            StickerWrapper a2 = StickerWrapper.m129065a(a, true);
            if (this.f105422e >= 0) {
                C40517g.m129526a(this.f105422e, a2, this.f105423f, this.f105424g);
            }
            C40517g.m129530a(this.f105425h, this.f105424g, this.f105423f, a2);
            C40569b.m129698b();
            if (C40569b.m129697a(this.f105423f) || this.f105422e > 0) {
                C40900a aVar = this.f105426i;
                if (aVar != null) {
                    aVar.mo100342a(this.f105425h, this.f105423f, a2, null);
                }
                C40569b.m129693a();
            }
            C40568a.m129690a(this.f105425h, a, "update", Integer.valueOf(this.f105422e), this.f105418a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo100350a(C40506c cVar, Integer num, String str, Exception exc) {
            C7573i.m23587b(cVar, "param");
            C40568a.m129691a(this.f105425h, this.f105419b, "update", Integer.valueOf(this.f105422e), num, str);
            C40568a.m129689a(cVar, num, str);
            C40569b.m129698b();
            if (C40569b.m129697a(this.f105423f) || this.f105422e > 0) {
                C40900a aVar = this.f105426i;
                if (aVar != null) {
                    aVar.mo100342a(this.f105425h, this.f105423f, null, exc);
                }
                C40569b.m129693a();
            }
        }

        C40571b(Effect effect, ResourceListModel resourceListModel, List list, int i, List list2, String str, String str2, C40900a aVar) {
            this.f105419b = effect;
            this.f105420c = resourceListModel;
            this.f105421d = list;
            this.f105422e = i;
            this.f105423f = list2;
            this.f105424g = str;
            this.f105425h = str2;
            this.f105426i = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.b$c */
    public static final class C40572c extends C40504a<C40506c, Void> {
        C40572c() {
        }

        /* renamed from: b */
        public final void mo70508b(C27416b<C40506c, Void> bVar) {
            C7573i.m23587b(bVar, "task");
            C40568a.m129688a((C40506c) bVar.f72333e);
            if (!C40517g.m129538c((C40506c) bVar.f72333e)) {
                C40517g.m129528a((C40506c) bVar.f72333e);
            }
        }
    }

    private C40569b() {
    }

    /* renamed from: b */
    public static void m129698b() {
        f105410b = true;
    }

    /* renamed from: a */
    public static final void m129693a() {
        f105410b = false;
        f105411c.clear();
    }

    /* renamed from: a */
    public static boolean m129697a(List<? extends StickerWrapper> list) {
        if (f105411c.size() == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m129694a(EffectPlatform effectPlatform, String str, StickerWrapper stickerWrapper, int i, List<StickerWrapper> list, C40900a aVar) {
        C7573i.m23587b(str, "id");
        C7573i.m23587b(list, "wrapperList");
        if (stickerWrapper == null || effectPlatform == null || stickerWrapper.f104908a == null) {
            aVar.mo100340a(new C43726c(-1));
            return;
        }
        String a = C40517g.m129524a(str);
        C40517g.m129537c(a);
        Effect effect = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect, "stickerWrapper.effect");
        String extra = effect.getExtra();
        C40570a aVar2 = new C40570a(i, stickerWrapper, aVar, str, list, a);
        effectPlatform.mo70625a(extra, (C43764n) aVar2);
    }

    /* renamed from: a */
    public static final void m129696a(String str, Effect effect, List<StickerWrapper> list, int i, ResourceListModel resourceListModel, C40900a aVar) {
        String str2 = str;
        List<StickerWrapper> list2 = list;
        C7573i.m23587b(str, "id");
        C7573i.m23587b(list, "wrapperList");
        if (C6311g.m19573a(list)) {
            m129698b();
            aVar.mo100342a(str, list, null, null);
            return;
        }
        C40900a aVar2 = aVar;
        String a = C40517g.m129524a(str);
        C40517g.m129537c(a);
        ResourceListModel resourceListModel2 = resourceListModel;
        List a2 = C40496bh.m129430a(a, resourceListModel2);
        C27417c dVar = new C40507d();
        C40571b bVar = new C40571b(effect, resourceListModel2, a2, i, list, a, str, aVar2);
        C40508e eVar = new C40508e(dVar, bVar, new C40572c());
        C7573i.m23582a((Object) a2, "resourceBeans");
        eVar.mo100559a(a2);
        eVar.mo100558a();
    }
}
