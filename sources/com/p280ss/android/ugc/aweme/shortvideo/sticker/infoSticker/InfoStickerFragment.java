package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerFragment */
public class InfoStickerFragment extends Fragment {

    /* renamed from: a */
    private HashSet<String> f105658a = new HashSet<>();

    /* renamed from: b */
    private EffectChannelResponse f105659b;

    /* renamed from: c */
    protected InfoStickerAdapterV2 f105660c;

    /* renamed from: d */
    protected RecyclerView f105661d;

    /* renamed from: e */
    protected DmtStatusView f105662e;

    /* renamed from: f */
    protected String f105663f;

    /* renamed from: g */
    protected GridLayoutManager f105664g;

    /* renamed from: h */
    protected STATUS f105665h;

    /* renamed from: i */
    public boolean f105666i;

    /* renamed from: j */
    public boolean f105667j;

    /* renamed from: k */
    private boolean f105668k = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo100765c() {
        m129963a();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: g */
    public static InfoStickerFragment m129965g() {
        return new InfoStickerFragment();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo100772i() {
        mo100768f();
        mo100771h();
    }

    /* renamed from: a */
    private void m129963a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C40805n.m130407a(activity).mo100811a("infostickerv2").observe(activity, new C40804m(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo100767e() {
        if (this.f105659b == null) {
            this.f105662e.mo25943g();
            return;
        }
        this.f105662e.mo25939d();
        this.f105660c.f105644h = this.f105667j;
        this.f105660c.mo100759a(this.f105659b);
    }

    /* renamed from: f */
    private void mo100768f() {
        if (this.f105659b != null) {
            int min = Math.min(this.f105664g.mo5447l() - this.f105664g.mo5445j(), this.f105659b.allCategoryEffects.size());
            if (min > 0 && getActivity() != null) {
                C40805n.m130407a(getActivity()).mo100816a(this.f105659b.allCategoryEffects.subList(0, min), false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo100766d() {
        if (this.f105665h == STATUS.LOADING) {
            this.f105662e.mo25942f();
        } else if (this.f105665h == STATUS.ERROR) {
            this.f105662e.mo25944h();
        } else {
            if (this.f105665h == STATUS.SUCCESS) {
                mo100767e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100763b() {
        C40800j jVar;
        this.f105664g = new WrapGridLayoutManager(getContext(), 3, 1, false);
        this.f105661d.setItemViewCacheSize(3);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C40800j) {
            jVar = (C40800j) requireActivity;
        } else {
            jVar = C40800j.f106116a;
        }
        this.f105661d.setLayoutManager(this.f105664g);
        if (this.f105661d.getAdapter() == null) {
            this.f105660c = m129962a(this.f105663f);
            this.f105660c.f105645i = jVar;
            this.f105661d.setAdapter(this.f105660c);
        } else {
            this.f105660c = (InfoStickerAdapterV2) this.f105661d.getAdapter();
            this.f105660c.f105645i = jVar;
        }
        m129963a();
        this.f105660c.mo66516d(false);
        this.f105660c.f105635b = this.f105666i;
        this.f105661d.post(new C40803l(this));
        this.f105661d.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    InfoStickerFragment.this.mo100771h();
                }
            }
        });
    }

    /* renamed from: h */
    public final void mo100771h() {
        String str;
        if (this.f105664g != null && getActivity() != null) {
            int j = this.f105664g.mo5445j();
            int l = this.f105664g.mo5447l();
            VideoPublishEditModel videoPublishEditModel = C40805n.m130407a(getActivity()).f105747b;
            if (videoPublishEditModel != null) {
                while (true) {
                    j++;
                    if (j < l + 1) {
                        StickerWrapper e = this.f105660c.mo100760e(j);
                        if (e != null && !this.f105658a.contains(e.f104908a.getEffectId())) {
                            String effectId = e.f104908a.getEffectId();
                            C42962b bVar = C42962b.f111525a;
                            String str2 = "prop_show";
                            C22984d a = C22984d.m75611a().mo59970a("scene_id", 1002).mo59973a("prop_id", effectId).mo59973a("prop_index", e.f104908a.getGradeKey()).mo59973a("enter_method", "click_main_panel").mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId);
                            String str3 = "enter_from";
                            if (this.f105666i) {
                                str = "edit_post_page";
                            } else {
                                str = "video_edit_page";
                            }
                            bVar.mo104671a(str2, a.mo59973a(str3, str).f60753a);
                            this.f105658a.add(effectId);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100769a(View view) {
        mo100765c();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo100763b();
    }

    /* renamed from: a */
    private InfoStickerAdapterV2 m129962a(String str) {
        return new InfoStickerAdapterV2(getActivity(), str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo100770c(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null) {
            this.f105665h = liveDataWrapper.f88768b;
            this.f105659b = (EffectChannelResponse) liveDataWrapper.f88767a;
            mo100766d();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.x1, viewGroup, false);
        this.f105661d = (RecyclerView) inflate.findViewById(R.id.db3);
        this.f105662e = (DmtStatusView) inflate.findViewById(R.id.b13);
        this.f105662e.setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C40802k(this)).mo25955a((int) R.string.bzv, (int) R.string.fid).mo25965c(1));
        this.f105662e.setVisibility(0);
        return inflate;
    }
}
