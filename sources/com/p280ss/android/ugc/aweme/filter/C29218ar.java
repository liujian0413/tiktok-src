package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0049m;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.os.Looper;
import com.bytedance.apm.util.C9653q;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29293a;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b.C29295a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.filter.ar */
public final class C29218ar implements C29294b {

    /* renamed from: a */
    public C29295a f77124a;

    /* renamed from: b */
    public final C0049m<Map<EffectCategoryResponse, List<C29296g>>> f77125b = new C0049m<Map<EffectCategoryResponse, List<C29296g>>>() {
        public final void observe(C0043i iVar, C0053p<Map<EffectCategoryResponse, List<C29296g>>> pVar) {
            super.observe(iVar, pVar);
            C29218ar.this.mo74820a(this, C29218ar.this.f77126c);
        }
    };

    /* renamed from: c */
    public C0052o<C17794bt<EffectCategoryResponse, C29296g>> f77126c = new C0052o<C17794bt<EffectCategoryResponse, C29296g>>() {
        public final void onActive() {
            super.onActive();
            if (((C17794bt) getValue()) == null) {
                C29263bs c = C29263bs.m95998c();
                c.putAll(new EffectCategoryResponse(), FilterManager.m95700a().mo74722e());
                setValue(c);
            }
        }

        /* renamed from: b */
        private static void m95870b(C17794bt<EffectCategoryResponse, C29296g> btVar) {
            C29327r.m96174a(btVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void setValue(C17794bt<EffectCategoryResponse, C29296g> btVar) {
            m95870b(btVar);
            super.setValue(btVar);
        }

        public final void observe(C0043i iVar, C0053p<C17794bt<EffectCategoryResponse, C29296g>> pVar) {
            super.observe(iVar, pVar);
            C29218ar.this.mo74820a(C29218ar.this.f77125b, this);
        }
    };

    /* renamed from: d */
    private List<? extends EffectCategoryResponse> f77127d;

    /* renamed from: e */
    private Map<String, Effect> f77128e = new ConcurrentHashMap();

    /* renamed from: f */
    private C0052o<List<C29296g>> f77129f;

    /* renamed from: g */
    private C0052o<List<C29296g>> f77130g = new C0052o<>();

    /* renamed from: h */
    private final C29222a f77131h = new C29222a();

    /* renamed from: com.ss.android.ugc.aweme.filter.ar$a */
    class C29222a implements C0053p<C17794bt<EffectCategoryResponse, C29296g>> {
        private C29222a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C17794bt<EffectCategoryResponse, C29296g> btVar) {
            if (btVar != null) {
                C29218ar.this.f77125b.setValue(btVar.asMap());
            }
        }
    }

    /* renamed from: b */
    public final LiveData<Map<EffectCategoryResponse, List<C29296g>>> mo74824b() {
        return this.f77125b;
    }

    /* renamed from: c */
    public final LiveData<C17794bt<EffectCategoryResponse, C29296g>> mo74827c() {
        return this.f77126c;
    }

    /* renamed from: f */
    public final C0052o<List<C29296g>> mo74833f() {
        return this.f77130g;
    }

    /* renamed from: a */
    public final C0052o<List<C29296g>> mo74818a() {
        m95852g();
        return this.f77129f;
    }

    /* renamed from: g */
    private void m95852g() {
        if (this.f77129f == null) {
            this.f77129f = new C0052o<List<C29296g>>() {

                /* renamed from: a */
                final List<C29296g> f77134a = Collections.emptyList();

                public final void onInactive() {
                    super.onInactive();
                }

                /* renamed from: a */
                private void m95871a() {
                    List<C29296g> list;
                    if (C29218ar.this.f77124a != null) {
                        list = C29218ar.this.f77124a.mo74721d();
                        C41530am.m132280a("[filter intensity] mPreparedFilterSources setInitialValue mFilterFactory.getDefaultFilters");
                    } else {
                        list = this.f77134a;
                        C41530am.m132280a("[filter intensity] mPreparedFilterSources setInitialValue emptyList");
                    }
                    setValue(list);
                }

                public final void onActive() {
                    super.onActive();
                    Object value = getValue();
                    if (value == null || m95873a(value)) {
                        m95871a();
                    }
                }

                /* renamed from: b */
                private static void m95874b(List<C29296g> list) {
                    C29327r.m96175a(list);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void setValue(List<C29296g> list) {
                    m95874b(list);
                    super.setValue(list);
                }

                /* renamed from: a */
                private static boolean m95873a(Object obj) {
                    if (obj instanceof List) {
                        return ((List) obj).isEmpty();
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: d */
    public final List<C29296g> mo74830d() {
        if (this.f77124a == null) {
            return null;
        }
        return this.f77124a.mo74721d();
    }

    /* renamed from: e */
    public final void mo74832e() {
        if (this.f77127d != null) {
            this.f77127d.clear();
        }
        this.f77128e.clear();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.f77129f != null) {
                this.f77129f.setValue(new ArrayList());
            }
            this.f77130g.setValue(new ArrayList());
            this.f77126c.setValue(null);
            return;
        }
        if (this.f77129f != null) {
            this.f77129f.postValue(new ArrayList());
        }
        this.f77130g.postValue(new ArrayList());
        this.f77126c.postValue(null);
    }

    /* renamed from: a */
    public final void mo74823a(List<? extends EffectCategoryResponse> list) {
        this.f77127d = list;
    }

    /* renamed from: a */
    public final void mo74821a(C29293a aVar) {
        C17794bt btVar = (C17794bt) this.f77126c.getValue();
        if (btVar == null) {
            btVar = new C29263bs();
        }
        C29327r.m96176a(this.f77128e, btVar, aVar);
        this.f77126c.setValue(btVar);
    }

    /* renamed from: c */
    public final String mo74828c(C29296g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar instanceof C29324o) {
            return ((C29324o) gVar).f77319n;
        }
        EffectCategoryResponse b = mo74825b(gVar);
        if (b != null) {
            return b.name;
        }
        return null;
    }

    /* renamed from: a */
    public final Effect mo74819a(C29296g gVar) {
        Effect effect = null;
        if (gVar == null) {
            return null;
        }
        if (gVar.f77267b != null) {
            effect = (Effect) this.f77128e.get(gVar.f77267b);
        }
        if (effect == null && gVar.f77268c != null) {
            effect = (Effect) this.f77128e.get(gVar.f77268c);
        }
        return effect;
    }

    /* renamed from: c */
    public final void mo74829c(List<? extends C29296g> list) {
        ArrayList arrayList = new ArrayList(list);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f77130g.setValue(arrayList);
        } else {
            this.f77130g.postValue(arrayList);
        }
        m95851e(list);
    }

    /* renamed from: d */
    public final void mo74831d(List<? extends C29296g> list) {
        m95852g();
        ArrayList arrayList = new ArrayList();
        for (C29296g e : list) {
            arrayList.add(C29341z.m96270e(e));
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f77129f.setValue(arrayList);
        } else {
            this.f77129f.postValue(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo74822a(C29295a aVar) {
        this.f77124a = aVar;
        C41530am.m132280a("[filter intensity] FilterSources setFilterLoader");
    }

    /* renamed from: b */
    public final EffectCategoryResponse mo74825b(C29296g gVar) {
        if (this.f77127d == null || this.f77127d.isEmpty() || gVar == null) {
            return null;
        }
        loop0:
        for (EffectCategoryResponse effectCategoryResponse : this.f77127d) {
            Iterator it = effectCategoryResponse.totalEffects.iterator();
            while (true) {
                if (it.hasNext()) {
                    Effect effect = (Effect) it.next();
                    if (!effect.getName().equals(gVar.f77267b)) {
                        if (effect.getName().equals(gVar.f77268c)) {
                            break loop0;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            return effectCategoryResponse;
        }
        return (EffectCategoryResponse) this.f77127d.get(0);
    }

    /* renamed from: b */
    public final void mo74826b(List<? extends EffectCategoryResponse> list) {
        C29263bs c = C29263bs.m95998c();
        List d = this.f77124a.mo74721d();
        for (C29296g gVar : this.f77124a.mo74722e()) {
            EffectCategoryResponse b = mo74825b(gVar);
            if (b != null && !d.contains(gVar)) {
                c.get(b).add(gVar);
            }
        }
        if (C9653q.m28546a()) {
            this.f77126c.setValue(c);
        } else {
            this.f77126c.postValue(c);
        }
        for (EffectCategoryResponse effectCategoryResponse : list) {
            for (Effect effect : effectCategoryResponse.totalEffects) {
                this.f77128e.put(effect.getName(), effect);
            }
        }
    }

    /* renamed from: e */
    private void m95851e(List<? extends C29296g> list) {
        C29263bs c = C29263bs.m95998c();
        for (C29296g gVar : list) {
            EffectCategoryResponse b = mo74825b(gVar);
            if (c.get(b) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("filtersInCategory is null\n");
                sb.append("current filter: \n");
                sb.append("name          = ");
                sb.append(gVar.f77267b);
                sb.append("\n");
                sb.append("en name       = ");
                sb.append(gVar.f77268c);
                sb.append("\n");
                sb.append("id            = ");
                sb.append(gVar.f77266a);
                sb.append("\n");
                sb.append("-------------------------\n");
                sb.append("filters info:\n");
                for (C29296g gVar2 : list) {
                    sb.append("name      = ");
                    sb.append(gVar2.f77267b);
                    sb.append("\n");
                    sb.append("en name   = ");
                    sb.append(gVar2.f77268c);
                    sb.append("\n");
                    sb.append("id        = ");
                    sb.append(gVar2.f77266a);
                    sb.append("\n");
                }
                sb.append("-------------------------\n");
                sb.append("category response list info:\n");
                if (this.f77127d != null) {
                    for (EffectCategoryResponse effectCategoryResponse : this.f77127d) {
                        sb.append("EffectCategoryResponse info = ");
                        sb.append(effectCategoryResponse.toString());
                        sb.append("\n");
                        sb.append("EffectCategoryResponse size = ");
                        sb.append(effectCategoryResponse.totalEffects);
                        sb.append("\n");
                    }
                } else {
                    sb.append("mCategoryResponseList : null\n");
                }
                throw new NullPointerException(sb.toString());
            }
            c.put(b, gVar);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f77126c.setValue(c);
        } else {
            this.f77126c.postValue(c);
        }
    }

    /* renamed from: a */
    public final void mo74820a(C0049m<Map<EffectCategoryResponse, List<C29296g>>> mVar, C0052o<C17794bt<EffectCategoryResponse, C29296g>> oVar) {
        mVar.mo120a(oVar, this.f77131h);
    }
}
