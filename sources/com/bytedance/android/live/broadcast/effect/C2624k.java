package com.bytedance.android.live.broadcast.effect;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.model.LocalFilterModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43837h;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.live.broadcast.effect.k */
public final class C2624k {

    /* renamed from: a */
    public static String f8415a = C3358ac.m12515a((int) R.string.eqh);

    /* renamed from: f */
    private static final String[] f8416f = C3358ac.m12530f(R.array.ak);

    /* renamed from: g */
    private static final String[] f8417g = C3358ac.m12530f(R.array.aj);

    /* renamed from: h */
    private static final int[] f8418h = new int[f8416f.length];

    /* renamed from: b */
    public final List<FilterModel> f8419b;

    /* renamed from: c */
    public C43837h f8420c;

    /* renamed from: d */
    public String f8421d;

    /* renamed from: e */
    public String f8422e;

    /* renamed from: i */
    private final List<Object> f8423i;

    /* renamed from: j */
    private final List<C2629a> f8424j;

    /* renamed from: k */
    private String[] f8425k;

    /* renamed from: com.bytedance.android.live.broadcast.effect.k$a */
    public interface C2629a {
        /* renamed from: a */
        void mo9249a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.k$b */
    static final class C2630b {

        /* renamed from: a */
        public static final C2624k f8434a = new C2624k();
    }

    /* renamed from: a */
    public static final C2624k m10736a() {
        return C2630b.f8434a;
    }

    /* renamed from: a */
    public final void mo9266a(boolean z) {
        if (!C6311g.m19573a(this.f8424j)) {
            for (C2629a a : this.f8424j) {
                a.mo9249a(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9273d() throws Exception {
        mo9266a(true);
    }

    /* renamed from: c */
    public final boolean mo9270c() {
        if (this.f8419b != null) {
            for (FilterModel isNew : this.f8419b) {
                if (isNew.isNew()) {
                    return true;
                }
            }
        }
        return false;
    }

    private C2624k() {
        this.f8420c = ((IHostContext) C3596c.m13172a(IHostContext.class)).getEffectManager();
        this.f8423i = new ArrayList();
        this.f8424j = new ArrayList();
        this.f8419b = new ArrayList();
        m10743f();
    }

    /* renamed from: e */
    private void m10741e() {
        if (C9290a.f25466a) {
            this.f8425k = C3358ac.m12528e().getResources().getStringArray(R.array.au);
        } else {
            this.f8425k = C3358ac.m12528e().getResources().getStringArray(R.array.av);
        }
    }

    /* renamed from: b */
    public final void mo9267b() {
        if (this.f8420c != null) {
            final C26251 r0 = new C43757g() {
                /* renamed from: a */
                public final void mo9274a(C43726c cVar) {
                    C2624k.this.mo9266a(false);
                }

                /* renamed from: a */
                public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null && !C6311g.m19573a(effectChannelResponse.allCategoryEffects)) {
                        if (effectChannelResponse.getPanelModel().tags.contains("new")) {
                            C2624k.this.f8421d = effectChannelResponse.getPanelModel().f113501id;
                            C2624k.this.f8422e = effectChannelResponse.getPanelModel().tags_updated_at;
                        }
                        C2624k.this.mo9265a(effectChannelResponse.allCategoryEffects);
                    }
                }
            };
            if (!C2635p.m10770a(C3358ac.m12528e())) {
                this.f8420c.mo106004a(f8415a, (C43757g) r0);
            } else if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USED_EFFECT_CHECK_CACHE.mo10240a()).booleanValue()) {
                this.f8420c.mo106003a(f8415a, (C43751a) new C43751a() {
                    /* renamed from: a */
                    public final void mo9276a(C43726c cVar) {
                        C2624k.this.f8420c.mo106015a(C2624k.f8415a, false, r0);
                    }

                    /* renamed from: a */
                    public final void mo9277a(boolean z) {
                        if (z) {
                            C2624k.this.f8420c.mo106015a(C2624k.f8415a, false, r0);
                        } else {
                            C2624k.this.f8420c.mo106004a(C2624k.f8415a, r0);
                        }
                    }
                });
            } else {
                this.f8420c.mo106015a(f8415a, false, (C43757g) r0);
            }
        }
    }

    static {
        TypedArray typedArray;
        Resources a = C3358ac.m12513a();
        if (a != null) {
            if (C9290a.f25466a) {
                typedArray = a.obtainTypedArray(R.array.as);
            } else {
                typedArray = a.obtainTypedArray(R.array.at);
            }
            for (int i = 0; i < f8416f.length; i++) {
                f8418h[i] = typedArray.getResourceId(i, 0);
            }
            typedArray.recycle();
        }
        if (((Integer) C8946b.f24361M.mo22117a()).intValue() < 0) {
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_NO_FILTER.mo10240a()).booleanValue()) {
                C8946b.f24361M.mo22118a(Integer.valueOf(1));
                return;
            }
            C8946b.f24361M.mo22118a(Integer.valueOf(0));
        }
    }

    /* renamed from: f */
    private void m10743f() {
        this.f8419b.clear();
        m10741e();
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_NO_FILTER.mo10240a()).booleanValue()) {
            LocalFilterModel localFilterModel = new LocalFilterModel();
            localFilterModel.setId("0");
            localFilterModel.setName(C3358ac.m12515a((int) R.string.es3));
            localFilterModel.setCoverResId(R.drawable.cdo);
            localFilterModel.setFilterFilePath("");
            FilterModel filterModel = new FilterModel();
            filterModel.setFilterType(0);
            filterModel.setLocalFilter(localFilterModel);
            this.f8419b.add(filterModel);
        }
        for (int i = 0; i < f8416f.length; i++) {
            LocalFilterModel localFilterModel2 = new LocalFilterModel();
            localFilterModel2.setId(String.valueOf(i));
            localFilterModel2.setName(this.f8425k[i]);
            localFilterModel2.setCoverResId(f8418h[i]);
            StringBuilder sb = new StringBuilder();
            sb.append(LiveCameraResManager.INST.getFilterFilePath());
            sb.append(File.separator);
            sb.append(f8416f[i]);
            localFilterModel2.setFilterFilePath(sb.toString());
            FilterModel filterModel2 = new FilterModel();
            if (i == 0) {
                filterModel2.setFilterType(0);
            } else {
                filterModel2.setFilterType(1);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(f8417g[i]);
            arrayList.add("beautyTag:whitenIntensity");
            filterModel2.setTags(arrayList);
            filterModel2.setLocalFilter(localFilterModel2);
            this.f8419b.add(filterModel2);
        }
    }

    /* renamed from: a */
    public final void mo9261a(C2629a aVar) {
        this.f8424j.add(aVar);
    }

    /* renamed from: b */
    public final void mo9268b(C2629a aVar) {
        this.f8424j.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ C7496w mo9272d(FilterModel filterModel) throws Exception {
        return C7492s.m23282a((C7495v<T>) new C2634o<T>(this, filterModel));
    }

    /* renamed from: b */
    private void m10740b(List<FilterModel> list) {
        C7492s.m23300b((Iterable<? extends T>) list).mo19291a(C2631l.f8435a).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C2632m<Object,Object>(this)).mo19294a(C47549a.m148327a()).mo19281a(C7342a.m23058b(), C7342a.m23058b(), (C7323a) new C2633n(this));
    }

    /* renamed from: c */
    public final boolean mo9271c(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2 && this.f8420c != null && this.f8420c.mo106027b(filterModel.getEffect())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9262a(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2) {
            m10737a(filterModel.getEffect(), this.f8419b.indexOf(filterModel));
        }
    }

    /* renamed from: b */
    public final boolean mo9269b(FilterModel filterModel) {
        if (filterModel == null) {
            return false;
        }
        if (filterModel.getFilterType() != 2) {
            return true;
        }
        if (!C43681b.m138406a() || filterModel.getEffect() == null) {
            if (this.f8420c == null || !this.f8420c.mo106021a(filterModel.getEffect())) {
                return false;
            }
            return true;
        } else if (this.f8420c == null || !C43681b.m138407b().mo105678a(this.f8420c, filterModel.getEffect())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo9265a(List<Effect> list) {
        m10743f();
        if (C6311g.m19573a(list)) {
            mo9266a(true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Effect effect = (Effect) list.get(i);
            FilterModel filterModel = new FilterModel();
            filterModel.setFilterType(2);
            filterModel.setEffect(effect);
            filterModel.setTags(effect.getTags());
            if (C43681b.m138406a()) {
                if (this.f8420c != null && !C43681b.m138407b().mo105678a(this.f8420c, effect)) {
                    m10737a(effect, i);
                }
            } else if (this.f8420c != null && !this.f8420c.mo106021a(effect) && !this.f8420c.mo106027b(effect)) {
                m10737a(effect, i);
            }
            this.f8419b.add(filterModel);
            arrayList.add(filterModel);
        }
        m10740b((List<FilterModel>) arrayList);
    }

    /* renamed from: a */
    private void m10737a(Effect effect, final int i) {
        if (effect != null && C2635p.m10770a(C3358ac.m12528e())) {
            this.f8420c.mo106000a(effect, (C43760j) new C43760j() {
                /* renamed from: b */
                public final void mo9282b(Effect effect) {
                }

                /* renamed from: a */
                public final void mo9280a(Effect effect) {
                    C2624k.this.mo9260a(i, true);
                }

                /* renamed from: a */
                public final void mo9281a(Effect effect, C43726c cVar) {
                    C2624k.this.mo9260a(i, false);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo9260a(int i, boolean z) {
        if (!C6311g.m19573a(this.f8423i)) {
            for (int i2 = 0; i2 < this.f8423i.size(); i2++) {
                this.f8423i.get(i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9263a(final FilterModel filterModel, final C47870u uVar) throws Exception {
        m10736a().m10738a(filterModel.getEffect().getId(), filterModel.getEffect().getTagsUpdatedAt(), (C43765o) new C43765o() {
            /* renamed from: a */
            public final void mo9278a() {
                filterModel.setNew(true);
                uVar.mo19238a();
            }

            /* renamed from: b */
            public final void mo9279b() {
                filterModel.setNew(false);
                uVar.mo19238a();
            }
        });
    }

    /* renamed from: a */
    public final void mo9264a(String str, boolean z) {
        if (this.f8419b != null && !TextUtils.isEmpty(str)) {
            for (FilterModel filterModel : this.f8419b) {
                if (filterModel.getEffect() != null && str.equals(filterModel.getEffect().getId())) {
                    filterModel.setNew(false);
                    m10739a(str, filterModel.getEffect().getTagsUpdatedAt(), (C43770t) null);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10739a(String str, String str2, C43770t tVar) {
        if (this.f8420c != null) {
            this.f8420c.mo106011a(str, str2, (C43770t) null);
        }
    }

    /* renamed from: a */
    private void m10738a(String str, String str2, C43765o oVar) {
        if (this.f8420c == null || str == null || str2 == null || TextUtils.equals(POIService.INVALID_ID, str2.toUpperCase())) {
            oVar.mo9279b();
        } else {
            this.f8420c.mo106010a(str, str2, oVar);
        }
    }
}
