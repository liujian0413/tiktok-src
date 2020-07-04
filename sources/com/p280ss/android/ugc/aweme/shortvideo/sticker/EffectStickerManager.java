package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.effectplatform.C27470a;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41363h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40879c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40864a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40865b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40866c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40867d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40868e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.p1614a.C40869f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.search.SearchStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurChildStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager */
public class EffectStickerManager implements C0042h {

    /* renamed from: a */
    public Effect f104783a;

    /* renamed from: b */
    public HashMap<String, HashSet<String>> f104784b;

    /* renamed from: c */
    public HashMap<String, Effect> f104785c;

    /* renamed from: d */
    public List<EffectCategoryModel> f104786d;

    /* renamed from: e */
    public EffectPlatform f104787e;

    /* renamed from: f */
    public boolean f104788f = true;

    /* renamed from: g */
    public int f104789g = 2;

    /* renamed from: h */
    public Effect f104790h;

    /* renamed from: i */
    public C40907r f104791i;

    /* renamed from: j */
    public boolean f104792j = true;

    /* renamed from: k */
    public C40378ah f104793k;

    /* renamed from: l */
    public boolean f104794l = true;

    /* renamed from: m */
    private String f104795m;

    /* renamed from: n */
    private AppCompatActivity f104796n;

    /* renamed from: o */
    private HashMap<String, CategoryEffectModel> f104797o;

    /* renamed from: p */
    private C41020a f104798p;

    /* renamed from: q */
    private int f104799q = -1;

    /* renamed from: r */
    private ShortVideoContext f104800r;

    /* renamed from: s */
    private C40370ac f104801s;

    /* renamed from: t */
    private C40495bg f104802t;

    /* renamed from: u */
    private C40361a f104803u;

    /* renamed from: v */
    private C40545e f104804v;

    /* renamed from: w */
    private C40879c f104805w;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager$a */
    class C40343a {

        /* renamed from: a */
        Boolean f104808a;

        /* renamed from: b */
        Boolean f104809b;

        /* renamed from: c */
        C40951b f104810c;

        /* renamed from: e */
        private StickerWrapper f104812e;

        /* renamed from: b */
        public final boolean mo100240b() {
            if (this.f104809b == null || !this.f104809b.booleanValue() || this.f104808a == null || !this.f104808a.booleanValue()) {
                return false;
            }
            this.f104810c.mo100188b(this.f104812e.f104908a);
            return true;
        }

        /* renamed from: a */
        public final void mo100239a() {
            if (!mo100240b()) {
                if (this.f104809b == null) {
                    EffectStickerManager.this.mo100223b(this.f104812e, (C40951b) new C40951b() {
                        /* renamed from: a */
                        public final void mo100195a() {
                        }

                        /* renamed from: a */
                        public final void mo100186a(Effect effect) {
                            C40343a.this.f104810c.mo100186a(effect);
                        }

                        /* renamed from: b */
                        public final void mo100188b(Effect effect) {
                            C40343a.this.f104809b = Boolean.valueOf(true);
                            C40343a.this.mo100240b();
                        }

                        /* renamed from: a */
                        public final void mo100196a(Effect effect, int i) {
                            C40343a.this.f104809b = Boolean.valueOf(false);
                            C40343a.this.f104810c.mo100196a(effect, i);
                        }

                        /* renamed from: a */
                        public final void mo100187a(Effect effect, C43726c cVar) {
                            C40343a.this.f104809b = Boolean.valueOf(false);
                            C40343a.this.f104810c.mo100187a(effect, cVar);
                        }
                    });
                }
                if (this.f104808a == null) {
                    C23323e.m76502a(C27470a.m90049a(this.f104812e.f104908a.getHintIcon()), (C23328a) new C23328a() {
                        /* renamed from: a */
                        public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                            C40343a.this.f104808a = Boolean.valueOf(true);
                            C40343a.this.mo100240b();
                        }

                        /* renamed from: a */
                        public final void mo60610a(Exception exc) {
                            C40343a.this.f104808a = Boolean.valueOf(true);
                            C40343a.this.mo100240b();
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        private boolean m128896a(StickerWrapper stickerWrapper) {
            boolean z = false;
            if (stickerWrapper == null || stickerWrapper.f104908a == null) {
                return false;
            }
            boolean a = StickerWrapper.m129074a(stickerWrapper.f104908a, (C27481e) EffectStickerManager.this.f104787e);
            if (!C40496bh.m129472q(stickerWrapper.f104908a) || (C41363h.m131937b(stickerWrapper.f104908a.getEffectId()) == null && stickerWrapper.f104911d)) {
                z = a;
            }
            return z;
        }

        C40343a(StickerWrapper stickerWrapper, C40951b bVar) {
            this.f104812e = stickerWrapper;
            if (m128896a(stickerWrapper)) {
                this.f104809b = Boolean.valueOf(true);
            }
            if (!EffectStickerManager.m128853a(stickerWrapper.f104908a)) {
                this.f104808a = Boolean.valueOf(true);
            }
            this.f104810c = bVar;
        }
    }

    /* renamed from: a */
    public final void mo100212a(LinearLayout linearLayout, Context context) {
        this.f104803u = new C40361a(linearLayout, context);
    }

    /* renamed from: a */
    public final void mo100219a(List<EffectCategoryModel> list) {
        m128856g().f106307c = list;
    }

    /* renamed from: a */
    public final void mo100218a(String str, CategoryEffectModel categoryEffectModel) {
        if (categoryEffectModel != null) {
            mo100229c(categoryEffectModel.effects);
            List<Effect> list = categoryEffectModel.collection;
            for (int i = 0; i < list.size(); i++) {
                this.f104785c.put(((Effect) list.get(i)).getEffectId(), list.get(i));
            }
        }
        this.f104797o.put(str, categoryEffectModel);
    }

    /* renamed from: a */
    public final void mo100213a(StickerWrapper stickerWrapper, C40951b bVar) {
        new C40343a(stickerWrapper, bVar).mo100239a();
    }

    /* renamed from: a */
    public final void mo100215a(Effect effect, int i) {
        if (this.f104800r != null && this.f104792j) {
            C42962b.f111525a.mo104671a("prop_click", C22984d.m75611a().mo59973a("prop_id", effect.getEffectId()).mo59973a("prop_index", effect.getGradeKey()).mo59973a("tab_name", FaceStickerBean.sCurPropSource).mo59970a(POIService.KEY_ORDER, i - 1).mo59973a("enter_method", "click_main_panel").mo59973a("enter_from", "video_shoot_page").mo59973a("creation_id", this.f104800r.f99787w).mo59973a("shoot_way", this.f104800r.f99788x).mo59970a("draft_id", this.f104800r.f99790z).f60753a);
        }
        ((CurParentStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurParentStickerViewModel.class)).mo101272a(new C0902i<>(this.f104783a, null));
        this.f104798p.mo100339c(C40376ag.m129117a(effect));
    }

    /* renamed from: a */
    public final void mo100216a(Effect effect, int i, StickerWrapper stickerWrapper) {
        mo100225b(effect, i, stickerWrapper);
    }

    /* renamed from: a */
    public final void mo100217a(Effect effect, final C40951b bVar) {
        if (this.f104791i == null || effect == null) {
            bVar.mo100195a();
        } else {
            this.f104791i.mo100519a(C40376ag.m129117a(effect), new C43764n() {
                /* renamed from: a */
                public final void mo100237a(C43726c cVar) {
                    if (bVar != null) {
                        bVar.mo100195a();
                    }
                }

                /* renamed from: a */
                public final void mo100238a(ResourceListModel resourceListModel) {
                    if (bVar != null) {
                        bVar.mo100195a();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100214a(C40951b bVar, StickerWrapper stickerWrapper, C40949u uVar) {
        if (uVar != null) {
            if (bVar != null) {
                uVar.mo100622a(stickerWrapper, bVar);
            } else if (this.f104794l) {
                uVar.mo100621a(stickerWrapper);
            }
        }
    }

    /* renamed from: j */
    private void m128861j() {
        this.f104783a = null;
        this.f104799q = -1;
    }

    /* renamed from: a */
    public final LinkedHashMap<String, CategoryEffectModel> mo100209a() {
        return m128856g().f106308d;
    }

    /* renamed from: e */
    public final Map<String, Effect> mo100233e() {
        return m128856g().f106309e;
    }

    /* renamed from: h */
    private List<C40378ah> m128858h() {
        ArrayList arrayList = new ArrayList();
        if (this.f104793k != null) {
            arrayList.add(this.f104793k);
        }
        return arrayList;
    }

    /* renamed from: i */
    private void m128860i() {
        if (this.f104801s != null) {
            this.f104801s.mo100368a(null, null);
        }
    }

    /* renamed from: b */
    public final String mo100221b() {
        if (this.f104795m == null) {
            return "";
        }
        return this.f104795m;
    }

    /* renamed from: c */
    public final List<EffectCategoryModel> mo100228c() {
        if (this.f104786d == null) {
            return new ArrayList();
        }
        return this.f104786d;
    }

    /* renamed from: d */
    public final List<EffectCategoryModel> mo100231d() {
        return m128856g().mo101145a();
    }

    /* renamed from: f */
    public final void mo100235f() {
        if (this.f104802t != null) {
            this.f104802t.mo100544a();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f104787e != null) {
            this.f104787e.mo70643e();
        }
    }

    /* renamed from: g */
    private C40879c m128856g() {
        if (this.f104805w == null) {
            this.f104805w = new C40879c();
            this.f104805w.f106305a = m128858h();
            this.f104805w.f106306b = m128863l();
        }
        return this.f104805w;
    }

    /* renamed from: k */
    private void m128862k() {
        ((CurParentStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurParentStickerViewModel.class)).mo101271a(this.f104795m).observe(this.f104796n, new C40584i(this));
    }

    /* renamed from: l */
    private List<C40864a> m128863l() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext d = ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d();
        if (d == null) {
            return arrayList;
        }
        C22200c e = C35574k.m114859a().mo70073G().mo57092e();
        if (e == null || !e.mo58567j()) {
            z = false;
        } else {
            z = true;
        }
        if (d.mo96142d()) {
            arrayList.add(new C40869f());
        }
        if (d.mo96144e()) {
            arrayList.add(new C40867d());
        }
        if (d.mo96142d() || d.mo96144e() || d.f99779o) {
            arrayList.add(new C40865b());
        }
        if (!z) {
            arrayList.add(new C40866c());
        }
        if (d.f99779o) {
            arrayList.add(new C40868e());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final EffectStickerManager mo100206a(C40495bg bgVar) {
        this.f104802t = bgVar;
        return this;
    }

    /* renamed from: g */
    private void m128857g(Effect effect) {
        if (this.f104801s != null) {
            this.f104801s.mo100368a(effect, null);
        }
    }

    /* renamed from: a */
    public final CategoryEffectModel mo100208a(String str) {
        return (CategoryEffectModel) this.f104797o.get(str);
    }

    /* renamed from: a */
    private static boolean m128852a(StickerWrapper stickerWrapper) {
        if (stickerWrapper.f104910c != 3 || !C40496bh.m129443b(stickerWrapper) || C40496bh.m129453d(stickerWrapper)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static String m128855f(Effect effect) {
        UrlModel hintIcon = effect.getHintIcon();
        if (hintIcon == null) {
            return null;
        }
        List urlList = hintIcon.getUrlList();
        if (C23477d.m77081a((Collection<T>) urlList)) {
            return null;
        }
        return (String) urlList.get(0);
    }

    /* renamed from: h */
    private boolean m128859h(Effect effect) {
        if (this.f104783a == null || effect == null || this.f104783a.getChildren() == null) {
            return false;
        }
        return this.f104783a.getChildren().contains(effect.getEffectId());
    }

    /* renamed from: c */
    public final boolean mo100230c(Effect effect) {
        if (this.f104783a == null || !this.f104783a.getEffectId().equals(effect.getEffectId())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo100232d(Effect effect) {
        this.f104783a = effect;
        this.f104790h = null;
        this.f104799q = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ boolean mo100234e(Effect effect) {
        if (this.f104800r == null) {
            return false;
        }
        if (this.f104800r.mo96142d() || this.f104800r.mo96144e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m128853a(Effect effect) {
        String f = m128855f(effect);
        if (TextUtils.isEmpty(f) || C23323e.m76518a(Uri.parse(f))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo100229c(List<Effect> list) {
        if (((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d() != null && list != null) {
            List<C40864a> l = m128863l();
            if (!l.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Effect effect = (Effect) it.next();
                    for (C40864a a : l) {
                        if (a.mo101137a(effect)) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo100224b(Effect effect) {
        if (this.f104801s != null) {
            this.f104801s.mo100368a(null, null);
        }
        if (this.f104803u != null) {
            this.f104803u.mo100359a((Effect) null, 0);
        }
        if (this.f104804v != null) {
            this.f104804v.mo100619a((Effect) null, "");
        }
        ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurUseStickerViewModel.class)).mo101276a(null, this.f104795m);
        if (!m128859h(effect)) {
            ((CurParentStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurParentStickerViewModel.class)).mo101273a(new C0902i(this.f104783a, null), this.f104795m);
            if (this.f104802t != null) {
                this.f104802t.mo100545a(false, effect);
            }
            this.f104798p.mo100337b(C40376ag.m129117a(effect));
            m128861j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100210a(C0902i iVar) {
        if (iVar != null) {
            if (iVar.f3155b == null) {
                m128861j();
            } else {
                mo100232d((Effect) iVar.f3155b);
            }
        }
    }

    /* renamed from: b */
    public final void mo100227b(List<Effect> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                this.f104785c.put(((Effect) list.get(i)).getEffectId(), list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo100211a(LinearLayout linearLayout) {
        this.f104801s = new C40370ac(linearLayout, linearLayout.getContext());
    }

    /* renamed from: b */
    public final void mo100222b(LinearLayout linearLayout, Context context) {
        this.f104804v = new C40545e(linearLayout, context);
    }

    /* renamed from: b */
    public final void mo100226b(String str, CategoryEffectModel categoryEffectModel) {
        m128856g().mo101146a(str, categoryEffectModel);
    }

    /* renamed from: b */
    public final StickerWrapper mo100220b(List<StickerWrapper> list, int i) {
        if (list == null || list.size() < i) {
            return null;
        }
        do {
            i++;
            if (i >= list.size()) {
                return null;
            }
        } while (!m128852a((StickerWrapper) list.get(i)));
        return (StickerWrapper) list.get(i);
    }

    /* renamed from: a */
    private Map<String, String> m128851a(String str, int i) {
        C22984d a = C22984d.m75611a().mo59973a("prop_id", str).mo59973a("tab_name", FaceStickerBean.sCurPropSource).mo59970a("impr_position", i).mo59973a("enter_method", "click_main_panel").mo59973a("enter_from", "video_shoot_page").mo59973a("creation_id", this.f104800r.f99787w).mo59973a("shoot_way", this.f104800r.f99788x).mo59970a("draft_id", this.f104800r.f99790z);
        C0052o<Boolean> oVar = ((SearchStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(SearchStickerViewModel.class)).f106397b;
        if (oVar.getValue() != null && ((Boolean) oVar.getValue()).booleanValue()) {
            a.mo59970a("after_search", 1);
        }
        return a.f60753a;
    }

    /* renamed from: b */
    public final void mo100223b(StickerWrapper stickerWrapper, C40951b bVar) {
        if (this.f104796n != null) {
            ((StickerFetchViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(StickerFetchViewModel.class)).mo101304a(this.f104787e, new C40574g(this)).observe(this.f104796n, new C40583h(this, bVar, stickerWrapper));
        }
    }

    /* renamed from: a */
    public static boolean m128854a(Effect effect, StickerWrapper stickerWrapper) {
        boolean z;
        if (effect == null || stickerWrapper == null) {
            return false;
        }
        if (effect.getTypes() == null || !effect.getTypes().contains("Adaptive")) {
            z = false;
        } else {
            z = true;
        }
        if (!C35574k.m114859a().mo70091f().mo93342a(Property.EnableUpdateMoji) || !z || stickerWrapper.f104913f || !C40517g.m129535b(effect.getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final StickerWrapper mo100207a(List<StickerWrapper> list, int i) {
        if (list == null || list.size() - 2 < i) {
            return null;
        }
        while (i < list.size()) {
            if (m128852a((StickerWrapper) list.get(i))) {
                return (StickerWrapper) list.get(i);
            }
            i++;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo100225b(Effect effect, int i, StickerWrapper stickerWrapper) {
        String str;
        if (!m128859h(effect)) {
            if (this.f104800r != null && this.f104792j) {
                C42962b.f111525a.mo104671a("prop_click", C38511bc.m123103a().mo96486a(m128851a(effect.getEffectId(), i)).mo96485a("prop_index", effect.getGradeKey()).f100112a);
            }
            ((CurParentStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurParentStickerViewModel.class)).mo101273a(new C0902i(this.f104783a, effect), this.f104795m);
        } else {
            if (!(this.f104799q == -1 || this.f104799q == i)) {
                ((CurChildStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurChildStickerViewModel.class)).mo101269a(new C0902i(Integer.valueOf(this.f104799q), Integer.valueOf(i)));
            }
            this.f104799q = i;
            this.f104790h = effect;
            if (this.f104800r != null && this.f104792j) {
                C42962b.f111525a.mo104671a("prop_click", C38511bc.m123103a().mo96486a(m128851a(effect.getEffectId(), i)).mo96485a("parent_pop_id", effect.getParentId()).mo96485a("prop_index", effect.getGradeKey()).f100112a);
            }
        }
        ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this.f104796n).mo147a(CurUseStickerViewModel.class)).mo101276a(effect, this.f104795m);
        this.f104798p.mo100333a(C40376ag.m129117a(effect));
        if (this.f104802t != null) {
            this.f104802t.mo100545a(true, this.f104783a);
        }
        C40545e eVar = this.f104804v;
        if (this.f104800r != null) {
            str = this.f104800r.f99788x;
        } else {
            str = "";
        }
        if (eVar.mo100619a(effect, str)) {
            m128860i();
        } else if (this.f104803u.mo100359a(effect, i)) {
            m128860i();
        } else {
            m128857g(effect);
        }
        if (stickerWrapper != null) {
            mo100223b(stickerWrapper, (C40951b) null);
        }
    }

    public EffectStickerManager(AppCompatActivity appCompatActivity, C0043i iVar, EffectPlatform effectPlatform, C41020a aVar, String str, ShortVideoContext shortVideoContext) {
        this.f104795m = str;
        this.f104796n = appCompatActivity;
        this.f104787e = effectPlatform;
        this.f104798p = aVar;
        this.f104784b = new HashMap<>();
        this.f104797o = new HashMap<>();
        this.f104785c = new HashMap<>();
        this.f104800r = shortVideoContext;
        iVar.getLifecycle().mo55a(this);
        m128862k();
    }
}
