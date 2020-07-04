package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerFragment */
public class FavoriteStickerFragment extends StickerFragment {

    /* renamed from: a */
    public FavoriteStickerAdapter f105565a;

    /* renamed from: b */
    public String f105566b;

    /* renamed from: c */
    public C1278j f105567c;

    /* renamed from: d */
    private List<Effect> f105568d = new ArrayList();

    /* renamed from: a */
    public final void mo100650a() {
        if (this.f105596g != null) {
            HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105566b);
            if (hashSet != null) {
                hashSet.clear();
            }
        }
    }

    /* renamed from: e */
    private void m129871e() {
        m129868b(this.f105568d);
        m129867a(this.f105568d);
        m129869c(this.f105568d);
        m129870d(this.f105568d);
        List a = this.f105565a.mo62312a();
        List a2 = StickerWrapper.m129069a(this.f105568d, this.f105566b);
        if (C6311g.m19573a(a)) {
            this.f105565a.f105585c = false;
        }
        if (a2.size() == 0) {
            this.f105565a.f105585c = true;
        }
        if (a != null) {
            C1143a.m5067a(new FavoriteStickerDiff(this.f105596g.f104783a, a, a2), true).mo4548a((C1262a) this.f105565a);
        }
        this.f105565a.mo58045a(a2);
    }

    /* renamed from: b */
    public final void mo100727b() {
        String str;
        if (this.f105599j != null && this.f105565a != null && this.f105596g != null) {
            int j = this.f105599j.mo5445j();
            int l = this.f105599j.mo5447l();
            HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105566b);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f105596g.f104784b.put(this.f105566b, hashSet);
            }
            while (true) {
                j++;
                if (j < l + 1) {
                    StickerWrapper stickerWrapper = (StickerWrapper) this.f105565a.mo100733c(j);
                    if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f104908a.getEffectId())) {
                        String effectId = stickerWrapper.f104908a.getEffectId();
                        C6907h.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(effectId).setJsonObject(mo100735c()));
                        C22984d d = mo100736d();
                        if (d != null) {
                            C42962b bVar = C42962b.f111525a;
                            String str2 = "prop_show";
                            C22984d a = d.mo59973a("enter_from", "video_shoot_page");
                            String str3 = "tab_name";
                            if (this.f105566b == null) {
                                str = "";
                            } else {
                                str = this.f105566b;
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
    public final /* synthetic */ void mo100726a(Boolean bool) {
        if (bool != null && this.f105568d != null) {
            m129871e();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo100727b();
        } else {
            mo100650a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100725a(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null && liveDataWrapper.f88767a != null) {
            this.f105596g.mo100227b(((FetchFavoriteListResponse) liveDataWrapper.f88767a).getCollectEffects());
            this.f105568d = ((FetchFavoriteListResponse) liveDataWrapper.f88767a).getEffects();
            m129871e();
        }
    }

    /* renamed from: a */
    private void m129867a(List<Effect> list) {
        if (getActivity() != null && list != null && !list.isEmpty()) {
            C22200c e = C35574k.m114859a().mo70073G().mo57092e();
            if (e != null && !e.mo58567j()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Effect) it.next()).getTags().contains("douyin_card")) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m129868b(List<Effect> list) {
        if (getActivity() != null && list != null && !list.isEmpty()) {
            ShortVideoContext d = ((EffectStickerViewModel) C0069x.m159a(getActivity()).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d();
            if (d != null) {
                if (d.mo96142d() || d.mo96144e()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C40496bh.m129455d((Effect) it.next())) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m129869c(List<Effect> list) {
        if (getActivity() != null && list != null && !list.isEmpty()) {
            ShortVideoContext d = ((EffectStickerViewModel) C0069x.m159a(getActivity()).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d();
            if (d != null) {
                if (d.mo96142d() || d.mo96144e() || d.f99779o) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C40496bh.m129457e((Effect) it.next())) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m129870d(List<Effect> list) {
        if (getActivity() != null && list != null && !list.isEmpty()) {
            ShortVideoContext d = ((EffectStickerViewModel) C0069x.m159a(getActivity()).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d();
            if (d != null && d.f99779o) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!C40496bh.m129473r((Effect) it.next())) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100724a(int i) {
        String str;
        HashSet hashSet = (HashSet) this.f105596g.f104784b.get(this.f105566b);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f105596g.f104784b.put(this.f105566b, hashSet);
        }
        StickerWrapper stickerWrapper = (StickerWrapper) this.f105565a.mo100733c(i + 1);
        if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f104908a.getEffectId())) {
            String effectId = stickerWrapper.f104908a.getEffectId();
            C6907h.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(effectId).setJsonObject(mo100735c()));
            C22984d d = mo100736d();
            if (d != null) {
                C42962b bVar = C42962b.f111525a;
                String str2 = "prop_show";
                C22984d a = d.mo59973a("enter_from", "video_shoot_page");
                String str3 = "tab_name";
                if (this.f105566b == null) {
                    str = "";
                } else {
                    str = this.f105566b;
                }
                bVar.mo104671a(str2, a.mo59973a(str3, str).mo59973a("prop_id", effectId).mo59973a("prop_index", stickerWrapper.f104908a.getGradeKey()).mo59973a("parent_pop_id", stickerWrapper.f104908a.getParentId()).f60753a);
            }
            hashSet.add(effectId);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f105596g != null) {
            this.f105566b = ((EffectCategoryModel) this.f105596g.mo100228c().get(this.f105594e)).name;
            if (!this.f105596g.f104784b.containsKey(this.f105566b)) {
                this.f105596g.f104784b.put(this.f105566b, new HashSet());
            }
            this.f105565a = new FavoriteStickerAdapter(this.f105596g);
            this.f105598i.setAdapter(this.f105565a);
            this.f105565a.mo66516d(false);
            ((FavoriteStickerViewModel) C0069x.m159a(getActivity()).mo147a(FavoriteStickerViewModel.class)).f106551d.observe(this, new C40637q(this));
            ((CurParentStickerViewModel) C0069x.m159a(getActivity()).mo147a(CurParentStickerViewModel.class)).mo101271a(this.f105597h).observe(this, new C0053p<C0902i<Effect, Effect>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(C0902i<Effect, Effect> iVar) {
                    if (iVar != null) {
                        Effect effect = (Effect) iVar.f3154a;
                        Effect effect2 = (Effect) iVar.f3155b;
                        int a = FavoriteStickerFragment.this.f105565a.mo100723a(effect);
                        int a2 = FavoriteStickerFragment.this.f105565a.mo100723a(effect2);
                        if (a >= 0) {
                            FavoriteStickerFragment.this.f105565a.notifyItemChanged(a + 1, StickerWrapper.m129064a(effect, FavoriteStickerFragment.this.f105566b, (C27481e) FavoriteStickerFragment.this.f105596g.f104787e));
                        }
                        if (a2 >= 0) {
                            FavoriteStickerFragment.this.f105565a.notifyItemChanged(a2 + 1, StickerWrapper.m129064a(effect2, FavoriteStickerFragment.this.f105566b, (C27481e) FavoriteStickerFragment.this.f105596g.f104787e));
                        }
                    }
                }
            });
            ((RetakeViewModel) C0069x.m159a(getActivity()).mo147a(RetakeViewModel.class)).f99693a.observe(getActivity(), new C40638r(this));
            this.f105598i.mo5528a((C1281m) new C1281m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    FavoriteStickerFragment.this.f105598i.mo5543b(FavoriteStickerFragment.this.f105567c);
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        FavoriteStickerFragment.this.mo100727b();
                    }
                }
            });
            this.f105598i.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                    FavoriteStickerFragment.this.mo100650a();
                }

                public final void onViewAttachedToWindow(View view) {
                    if (FavoriteStickerFragment.this.mUserVisibleHint && FavoriteStickerFragment.this.f105596g != null) {
                        FavoriteStickerFragment.this.mo100727b();
                    }
                }
            });
            this.f105567c = new C1278j() {
                /* renamed from: b */
                public final void mo5815b(View view) {
                }

                /* renamed from: a */
                public final void mo5814a(View view) {
                    if (FavoriteStickerFragment.this.mUserVisibleHint) {
                        FavoriteStickerFragment.this.mo100724a(RecyclerView.m5892f(view));
                    }
                }
            };
            this.f105598i.mo5526a(this.f105567c);
        }
    }
}
