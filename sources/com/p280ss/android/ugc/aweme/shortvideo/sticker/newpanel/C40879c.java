package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40378ah;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40864a;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.c */
public final class C40879c {

    /* renamed from: a */
    public List<? extends C40378ah> f106305a;

    /* renamed from: b */
    public List<? extends C40864a> f106306b;

    /* renamed from: c */
    public List<EffectCategoryModel> f106307c;

    /* renamed from: d */
    public LinkedHashMap<String, CategoryEffectModel> f106308d = new LinkedHashMap<>();

    /* renamed from: e */
    public Map<String, Effect> f106309e = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.c$a */
    static final class C40880a extends Lambda implements C7562b<Effect, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40879c f106310a;

        C40880a(C40879c cVar) {
            this.f106310a = cVar;
            super(1);
        }

        /* renamed from: a */
        private boolean m130622a(Effect effect) {
            C7573i.m23587b(effect, "it");
            return this.f106310a.mo101147a(effect);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m130622a((Effect) obj));
        }
    }

    /* renamed from: b */
    private List<C40378ah> m130617b() {
        if (this.f106305a == null) {
            this.f106305a = C7525m.m23461a();
        }
        return this.f106305a;
    }

    /* renamed from: c */
    private List<C40864a> m130618c() {
        if (this.f106306b == null) {
            this.f106306b = C7525m.m23461a();
        }
        return this.f106306b;
    }

    /* renamed from: a */
    public final List<EffectCategoryModel> mo101145a() {
        if (this.f106307c == null) {
            this.f106307c = new ArrayList();
        }
        return this.f106307c;
    }

    /* renamed from: a */
    private final void m130616a(List<Effect> list) {
        if (list != null) {
            List b = m130617b();
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            C7525m.m23480a(list, (C7562b<? super T, Boolean>) new C40880a<Object,Boolean>(this));
        }
    }

    /* renamed from: a */
    public final boolean mo101147a(Effect effect) {
        if (effect == null) {
            return true;
        }
        List<C40864a> c = m130618c();
        if (c != null) {
            for (C40864a a : c) {
                if (a.mo101137a(effect)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo101146a(String str, CategoryEffectModel categoryEffectModel) {
        if (str != null && categoryEffectModel != null) {
            m130616a(categoryEffectModel.effects);
            List<Effect> list = categoryEffectModel.collection;
            if (list != null) {
                for (Effect effect : list) {
                    if (effect != null) {
                        Map<String, Effect> map = this.f106309e;
                        String effectId = effect.getEffectId();
                        C7573i.m23582a((Object) effectId, "effectId");
                        map.put(effectId, effect);
                    }
                }
            }
            this.f106308d.put(str, categoryEffectModel);
        }
    }
}
