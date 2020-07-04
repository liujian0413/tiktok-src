package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.C40908a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.C40909a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.C40912c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.PinStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.search.SearchStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40953a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40954b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.p280ss.android.ugc.aweme.utils.BusiStickerShowLogger;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment */
public class CategoryStickerFragment extends StickerFragment implements C40953a {

    /* renamed from: a */
    public CategoryStickerAdapter f105452a;

    /* renamed from: b */
    public C40954b f105453b;

    /* renamed from: c */
    public C1278j f105454c;

    /* renamed from: d */
    public int f105455d;

    /* renamed from: m */
    private String f105456m;

    /* renamed from: n */
    private String f105457n;

    /* renamed from: o */
    private CategoryEffectModel f105458o;

    /* renamed from: p */
    private BusiStickerShowLogger f105459p;

    /* renamed from: q */
    private List<StickerWrapper> f105460q = new ArrayList();

    /* renamed from: r */
    private Effect f105461r;

    /* renamed from: s */
    private boolean f105462s = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100657a(Boolean bool) {
        if (bool != null && this.f105460q != null) {
            List a = StickerWrapper.m129068a(this.f105460q);
            this.f105596g.mo100229c(a);
            this.f105452a.mo58045a(StickerWrapper.m129069a(a, this.f105456m));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f105459p != null) {
            this.f105459p.mo104603b();
        }
    }

    /* renamed from: e */
    private C0052o<List<String>> m129736e() {
        return ((EffectStickerViewModel) C0069x.m157a((Fragment) this).mo147a(EffectStickerViewModel.class)).mo101289b();
    }

    /* renamed from: b */
    public final void mo100659b() {
        if (this.f105596g != null) {
            HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105456m);
            if (hashSet != null) {
                hashSet.clear();
            }
        }
    }

    /* renamed from: f */
    private void m129737f() {
        ((EffectStickerViewModel) C0069x.m157a((Fragment) this).mo147a(EffectStickerViewModel.class)).mo101284a(this.f105596g.f104787e, this.f105597h, this.f105457n, 0, 0, 0, "").observe(this, new C40627g(this));
    }

    /* renamed from: g */
    private void m129738g() {
        if (this.f105600k == STATUS.LOADING) {
            this.f105601l.mo25942f();
        } else if (this.f105600k == STATUS.ERROR) {
            this.f105601l.mo25944h();
        } else {
            if (this.f105600k == STATUS.SUCCESS) {
                m129739h();
            }
        }
    }

    /* renamed from: h */
    private void m129739h() {
        if (this.f105458o == null || C6311g.m19573a(this.f105458o.effects)) {
            this.f105601l.mo25943g();
            return;
        }
        this.f105601l.mo25939d();
        this.f105596g.mo100218a(this.f105457n, this.f105458o);
        m129735c(this.f105458o.effects);
    }

    /* renamed from: i */
    private void m129740i() {
        if (!this.f105462s) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                TabSelectViewModel tabSelectViewModel = (TabSelectViewModel) C0069x.m159a(activity).mo147a(TabSelectViewModel.class);
                int a = tabSelectViewModel.mo101305a();
                if (this.f105594e == a) {
                    tabSelectViewModel.mo101306a((EffectCategoryModel) tabSelectViewModel.f106556a.getValue(), a);
                    this.f105462s = true;
                }
            }
        }
    }

    /* renamed from: j */
    private boolean m129741j() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        if (((EffectStickerViewModel) C0069x.m159a(activity).mo147a(EffectStickerViewModel.class)).mo101285a().mo101196e() || !C40908a.m130714a(activity, this.f105594e, this.f105597h)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo100650a() {
        String str;
        if (this.f105599j != null && this.f105452a != null && this.f105596g != null) {
            int j = this.f105599j.mo5445j();
            int l = this.f105599j.mo5447l();
            HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105456m);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f105596g.f104784b.put(this.f105456m, hashSet);
            }
            while (true) {
                j++;
                if (j < l + 1) {
                    StickerWrapper stickerWrapper = (StickerWrapper) this.f105452a.mo100733c(j);
                    if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f104908a.getEffectId())) {
                        String effectId = stickerWrapper.f104908a.getEffectId();
                        C6907h.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(effectId).setJsonObject(mo100735c()));
                        C22984d d = mo100736d();
                        if (d != null) {
                            C42962b bVar = C42962b.f111525a;
                            String str2 = "prop_show";
                            C22984d a = d.mo59973a("enter_from", "video_shoot_page");
                            String str3 = "tab_name";
                            if (this.f105456m == null) {
                                str = "";
                            } else {
                                str = this.f105456m;
                            }
                            bVar.mo104671a(str2, a.mo59973a(str3, str).mo59973a("prop_id", effectId).mo59973a("prop_index", stickerWrapper.f104908a.getGradeKey()).mo59973a("parent_pop_id", stickerWrapper.f104908a.getParentId()).f60753a);
                        }
                        hashSet.add(effectId);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100654a(View view) {
        m129737f();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo100650a();
            m129740i();
            return;
        }
        mo100659b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo100648a(C1592h hVar) throws Exception {
        List<StickerWrapper> list = (List) hVar.mo6890e();
        if (!C6311g.m19573a(list)) {
            this.f105460q = list;
            this.f105452a.mo58045a(this.f105460q);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo100656a(Effect effect) {
        System.nanoTime();
        if (effect != null) {
            if (C6311g.m19573a(this.f105460q) || !effect.equals(((StickerWrapper) this.f105460q.get(0)).f104908a)) {
                int a = this.f105452a.mo100643a(effect);
                if (a != -1) {
                    this.f105460q.remove(a);
                    this.f105452a.notifyItemRemoved(a + 1);
                }
                if (this.f105461r != null) {
                    this.f105460q.set(0, StickerWrapper.m129064a(effect, this.f105457n, (C27481e) this.f105596g.f104787e));
                    this.f105452a.notifyItemChanged(1);
                } else {
                    this.f105460q.add(0, StickerWrapper.m129064a(effect, this.f105457n, (C27481e) this.f105596g.f104787e));
                    this.f105452a.notifyItemInserted(1);
                }
                this.f105452a.mo100647f();
                this.f105598i.mo5561d(0);
                this.f105461r = effect;
                System.nanoTime();
            }
        }
    }

    /* renamed from: c */
    private void m129735c(List<Effect> list) {
        FragmentActivity activity = getActivity();
        if (!C6311g.m19573a(list) && activity != null) {
            C1592h.m7855a((Callable<TResult>) new C40628h<TResult>(this, activity, list, C40909a.m130720a((List) ((PinStickerViewModel) C0069x.m159a(activity).mo147a(PinStickerViewModel.class)).mo101189a(this.f105597h).getValue(), this.f105594e)), C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C40629i<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100653a(C0902i iVar) {
        if (iVar != null) {
            Effect effect = (Effect) iVar.f3154a;
            Effect effect2 = (Effect) iVar.f3155b;
            int a = this.f105452a.mo100643a(effect);
            int a2 = this.f105452a.mo100643a(effect2);
            if (a >= 0) {
                this.f105452a.notifyItemChanged(a + 1, StickerWrapper.m129064a(effect, this.f105456m, (C27481e) this.f105596g.f104787e));
            }
            if (a2 >= 0) {
                this.f105452a.notifyItemChanged(a2 + 1, StickerWrapper.m129064a(effect2, this.f105456m, (C27481e) this.f105596g.f104787e));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo100658a(List<C40912c> list) {
        if (!C6311g.m19573a(list) && this.f105600k == STATUS.SUCCESS) {
            Collection a = C40909a.m130720a(list, this.f105594e);
            if (!C6307b.m19566a(a)) {
                ArrayList arrayList = new ArrayList(a);
                int i = 0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Effect effect = (Effect) arrayList.get(size);
                    if (this.f105452a.mo100643a(effect) == -1) {
                        this.f105460q.add(0, StickerWrapper.m129064a(effect, this.f105457n, (C27481e) this.f105596g.f104787e));
                        i++;
                    }
                }
                if (i > 0) {
                    this.f105452a.notifyItemRangeInserted(1, i);
                    this.f105452a.mo100647f();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100651a(int i) {
        String str;
        HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105456m);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f105596g.f104784b.put(this.f105456m, hashSet);
        }
        StickerWrapper stickerWrapper = (StickerWrapper) this.f105452a.mo100733c(i + 1);
        if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f104908a.getEffectId())) {
            String effectId = stickerWrapper.f104908a.getEffectId();
            C6907h.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(effectId).setJsonObject(mo100735c()));
            C22984d d = mo100736d();
            if (d != null) {
                C42962b bVar = C42962b.f111525a;
                String str2 = "prop_show";
                C22984d a = d.mo59973a("enter_from", "video_shoot_page");
                String str3 = "tab_name";
                if (this.f105456m == null) {
                    str = "";
                } else {
                    str = this.f105456m;
                }
                bVar.mo104671a(str2, a.mo59973a(str3, str).mo59973a("prop_id", effectId).mo59973a("parent_pop_id", stickerWrapper.f104908a.getParentId()).mo59973a("prop_index", stickerWrapper.f104908a.getGradeKey()).f60753a);
            }
            hashSet.add(effectId);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f105596g != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f105596g.mo100228c().get(this.f105594e);
                this.f105456m = effectCategoryModel.name;
                this.f105457n = effectCategoryModel.key;
                if (!this.f105596g.f104784b.containsKey(this.f105456m)) {
                    this.f105596g.f104784b.put(this.f105456m, new HashSet());
                }
                if (this.f105598i.getAdapter() == null) {
                    this.f105452a = new CategoryStickerAdapter(this.f105596g);
                    this.f105452a.f105447a = m129741j();
                    this.f105598i.setAdapter(this.f105452a);
                    this.f105598i.mo5528a((C1281m) new C1281m() {
                        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                            super.onScrollStateChanged(recyclerView, i);
                            switch (i) {
                                case 0:
                                    if (C13380c.m39172c().mo33189e()) {
                                        C13380c.m39172c().mo33186d();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (CategoryStickerFragment.this.f105455d != 2) {
                                        if (C13380c.m39172c().mo33189e()) {
                                            C13380c.m39172c().mo33186d();
                                            break;
                                        }
                                    } else {
                                        C13380c.m39172c().mo33183c();
                                        break;
                                    }
                                    break;
                                case 2:
                                    C13380c.m39172c().mo33183c();
                                    break;
                            }
                            CategoryStickerFragment.this.f105455d = i;
                        }
                    });
                    this.f105452a.mo66516d(false);
                } else {
                    this.f105452a = (CategoryStickerAdapter) this.f105598i.getAdapter();
                }
                this.f105452a.f105448b = this;
                CategoryEffectModel a = this.f105596g.mo100208a(this.f105457n);
                if (a != null) {
                    m129735c(a.effects);
                } else if (this.f105457n == null) {
                    this.f105601l.mo25942f();
                } else {
                    m129737f();
                }
                ((CurParentStickerViewModel) C0069x.m159a(activity).mo147a(CurParentStickerViewModel.class)).mo101271a(this.f105597h).observe(this, new C40622b(this));
                ((RetakeViewModel) C0069x.m159a(getActivity()).mo147a(RetakeViewModel.class)).f99693a.observe(getActivity(), new C40623c(this));
                if (this.f105594e == 1) {
                    ((SearchStickerViewModel) C0069x.m159a(activity).mo147a(SearchStickerViewModel.class)).f106396a.observe(this, new C40624d(this));
                }
                this.f105598i.mo5528a((C1281m) new C1281m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        CategoryStickerFragment.this.f105598i.mo5543b(CategoryStickerFragment.this.f105454c);
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 0) {
                            CategoryStickerFragment.this.mo100650a();
                        }
                    }
                });
                this.f105598i.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                    public final void onViewDetachedFromWindow(View view) {
                        CategoryStickerFragment.this.mo100659b();
                    }

                    public final void onViewAttachedToWindow(View view) {
                        if (CategoryStickerFragment.this.mUserVisibleHint && CategoryStickerFragment.this.f105596g != null) {
                            CategoryStickerFragment.this.mo100650a();
                        }
                    }
                });
                this.f105454c = new C1278j() {
                    /* renamed from: b */
                    public final void mo5815b(View view) {
                    }

                    /* renamed from: a */
                    public final void mo5814a(View view) {
                        if (CategoryStickerFragment.this.mUserVisibleHint) {
                            CategoryStickerFragment.this.mo100651a(RecyclerView.m5892f(view));
                        }
                    }
                };
                this.f105598i.mo5526a(this.f105454c);
                m129736e().observe(this, new C40625e(activity));
                ((PinStickerViewModel) C0069x.m159a(activity).mo147a(PinStickerViewModel.class)).mo101189a(this.f105597h).observe(this, new C40626f(this));
                BusiStickerShowLogger busiStickerShowLogger = new BusiStickerShowLogger(this.f105457n, this, this.f105598i, this.f105599j, this.f105452a);
                this.f105459p = busiStickerShowLogger;
                this.f105459p.mo104602a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100655a(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null) {
            this.f105600k = liveDataWrapper.f88768b;
            this.f105458o = (CategoryEffectModel) liveDataWrapper.f88767a;
            m129738g();
        }
    }

    /* renamed from: a */
    public final void mo100652a(int i, Effect effect) {
        if (this.f105453b != null) {
            this.f105453b.mo100688a(effect, this.f105594e, i);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m129732a(FragmentActivity fragmentActivity, List list) {
        ((EffectStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(EffectStickerViewModel.class)).mo101285a().mo101192a(list);
        if (!C23477d.m77081a((Collection<T>) list)) {
            C40426a.m129277a(list);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ List mo100649a(FragmentActivity fragmentActivity, List list, Collection collection) throws Exception {
        return StickerWrapper.m129066a(fragmentActivity, list, collection, this.f105456m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.x1, viewGroup, false);
        this.f105598i = (RecyclerView) inflate.findViewById(R.id.db3);
        this.f105601l = (DmtStatusView) inflate.findViewById(R.id.b13);
        this.f105601l.setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C40621a(this)).mo25955a((int) R.string.bzv, (int) R.string.fid).mo25965c(1));
        this.f105601l.setVisibility(0);
        return inflate;
    }
}
