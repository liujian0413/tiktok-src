package com.p280ss.android.ugc.aweme.setting.serverpush.p1528ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.Divider;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.C30561h;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment */
public class PushSettingManagerFragment extends AmeBaseFragment implements C37708a, C37709b {
    ImageView backBtn;

    /* renamed from: e */
    C37716e f98291e;

    /* renamed from: f */
    private List<CommonItemView> f98292f = new ArrayList();
    Divider interactionDivider;
    Divider interactionDividerWithoutLine;
    CommonItemView itemInnerPushIm;
    CommonItemView itemInnerPushLive;
    CommonItemView itemOuterPushIm;
    CommonItemView itemPushComment;
    CommonItemView itemPushDig;
    CommonItemView itemPushFollow;
    CommonItemView itemPushFollowNewVideo;
    CommonItemView itemPushLive;
    CommonItemView itemPushMain;
    CommonItemView itemPushMention;
    CommonItemView itemPushRecommendVideo;
    Divider liveDivider;
    TextView mTitle;
    Divider messageDivider;
    Divider pushDivider;

    public final void bI_() {
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* renamed from: d */
    public static PushSettingManagerFragment m120599d() {
        PushSettingManagerFragment pushSettingManagerFragment = new PushSettingManagerFragment();
        pushSettingManagerFragment.setArguments(new Bundle());
        return pushSettingManagerFragment;
    }

    public final void bJ_() {
        C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f98291e.mo59134U_();
    }

    public void onResume() {
        super.onResume();
        m120601g();
        m120602i();
    }

    /* renamed from: e */
    public final boolean mo95070e() {
        if (C43033cw.m136550a(getContext())) {
            return true;
        }
        C43034cx.m136560a(getContext(), true, C6399b.m19944t());
        return false;
    }

    /* renamed from: i */
    private void m120602i() {
        float f;
        if (C43033cw.m136550a(getContext())) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        m120594a(this.itemPushDig, f);
        m120594a(this.itemPushComment, f);
        m120594a(this.itemPushFollow, f);
        m120594a(this.itemPushMention, f);
        m120594a(this.itemPushFollowNewVideo, f);
        m120594a(this.itemPushRecommendVideo, f);
        m120594a(this.itemPushLive, f);
        m120594a(this.itemOuterPushIm, f);
    }

    /* renamed from: g */
    private void m120601g() {
        String str;
        int i;
        boolean a = C43033cw.m136550a(getContext());
        if (C6399b.m19944t()) {
            if (a) {
                str = getString(R.string.drn);
            } else {
                str = getString(R.string.drm);
            }
            if (a) {
                this.itemPushMain.setVisibility(8);
                this.interactionDivider.setVisibility(8);
                this.interactionDividerWithoutLine.setVisibility(0);
            } else {
                m120598a(a);
                this.itemPushMain.setVisibility(0);
                this.interactionDivider.setVisibility(0);
                this.interactionDividerWithoutLine.setVisibility(8);
            }
        } else {
            m120598a(a);
            if (a) {
                i = R.string.d_b;
            } else {
                i = R.string.d_a;
            }
            str = getString(i);
        }
        this.itemPushMain.setRightText(str);
    }

    /* renamed from: f */
    private void m120600f() {
        if (C6399b.m19944t()) {
            this.mTitle.setText(R.string.drc);
            this.itemPushMain.setLeftText(getContext().getString(R.string.drc));
            this.interactionDivider.getTxtLeft().setText(R.string.drg);
            this.interactionDivider.setVisibility(8);
            this.interactionDividerWithoutLine.getTxtLeft().setText(R.string.drg);
            this.interactionDividerWithoutLine.setVisibility(0);
            this.itemPushDig.setLeftText(getContext().getString(R.string.drh));
            this.itemPushComment.setLeftText(getContext().getString(R.string.drd));
            this.itemPushFollow.setLeftText(getContext().getString(R.string.drf));
            this.itemPushMention.setLeftText(getContext().getString(R.string.drk));
            this.messageDivider.getTxtLeft().setText(R.string.drl);
            this.itemOuterPushIm.setLeftText(getContext().getString(R.string.dre));
            this.pushDivider.getTxtLeft().setText(R.string.drt);
            this.itemPushFollowNewVideo.setLeftText(getContext().getString(R.string.dru));
            this.itemPushRecommendVideo.setLeftText(getContext().getString(R.string.drv));
            this.liveDivider.getTxtLeft().setText(R.string.dri);
            this.itemPushLive.setLeftText(getContext().getString(R.string.drj));
        }
    }

    /* renamed from: j */
    private void m120603j() {
        this.mTitle.setText(R.string.dom);
        this.itemPushMain.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                try {
                    C43033cw.m136552b(PushSettingManagerFragment.this.getContext());
                } catch (Exception unused) {
                    PushSettingManagerFragment.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                }
                String str2 = "notifications_click";
                C22984d a = C22984d.m75611a();
                String str3 = "status";
                if (C43033cw.m136550a(PushSettingManagerFragment.this.getContext())) {
                    str = "on";
                } else {
                    str = "off";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            }
        });
        m120601g();
        m120596a(this.itemPushDig, "digg_push");
        m120596a(this.itemPushComment, "comment_push");
        m120596a(this.itemPushFollow, "follow_push");
        m120596a(this.itemPushMention, "mention_push");
        m120596a(this.itemPushFollowNewVideo, "follow_new_video_push");
        m120596a(this.itemPushRecommendVideo, "recommend_video_push");
        m120596a(this.itemPushLive, "live_push");
        m120596a(this.itemOuterPushIm, "im_push");
        m120596a(this.itemInnerPushLive, "live_inner_push");
        if (C7213d.m22500a().mo18758aU() == 0) {
            this.itemOuterPushIm.setLeftText(C6399b.m19921a().getResources().getString(R.string.d_c));
            this.itemPushLive.setLeftText(C6399b.m19921a().getResources().getString(R.string.d_k));
            this.itemInnerPushIm.setVisibility(8);
        } else {
            this.itemOuterPushIm.setLeftText(C6399b.m19921a().getResources().getString(R.string.a2d));
            this.itemPushLive.setLeftText(C6399b.m19921a().getResources().getString(R.string.a2f));
            m120596a(this.itemInnerPushIm, "im_inner_push");
            this.itemInnerPushIm.setVisibility(0);
        }
        if (C6399b.m19944t()) {
            this.itemInnerPushIm.setVisibility(8);
            this.itemInnerPushLive.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.jo && getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    private static void m120598a(boolean z) {
        String str;
        String str2 = "notifications_show";
        C22984d a = C22984d.m75611a();
        String str3 = "status";
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        m120595a(this.itemPushDig, bVar.f98265a);
        m120595a(this.itemPushComment, bVar.f98266b);
        m120595a(this.itemPushFollow, bVar.f98267c);
        m120595a(this.itemPushMention, bVar.f98268d);
        m120595a(this.itemPushFollowNewVideo, bVar.f98271g);
        m120595a(this.itemPushRecommendVideo, bVar.f98272h);
        m120595a(this.itemPushLive, bVar.f98273i);
        m120595a(this.itemOuterPushIm, bVar.f98275k);
        m120595a(this.itemInnerPushLive, bVar.f98274j);
        C30561h.m99828a().mo80305b(Integer.valueOf(bVar.f98274j));
        if (C7213d.m22500a().mo18758aU() != 0) {
            m120595a(this.itemInnerPushIm, bVar.f98276l);
            C30561h.m99828a().mo80303a(Integer.valueOf(bVar.f98276l));
        }
    }

    /* renamed from: a */
    private static void m120595a(CommonItemView commonItemView, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        commonItemView.setChecked(z);
    }

    /* renamed from: a */
    private static void m120594a(CommonItemView commonItemView, float f) {
        View findViewById = commonItemView.findViewById(R.id.ctk);
        if (findViewById != null) {
            findViewById.setAlpha(f);
        }
        if (commonItemView != null) {
            commonItemView.setAlpha(f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m120603j();
        this.f98291e = new C37716e();
        this.f98291e.mo66537a(this);
        this.f98291e.mo56976a(new Object[0]);
        m120600f();
    }

    /* renamed from: a */
    private void m120596a(final CommonItemView commonItemView, String str) {
        commonItemView.setTag(str);
        commonItemView.setOnClickListener(new OnClickListener() {

            /* renamed from: c */
            private C7486b f98296c;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo95073a(CommonItemView commonItemView) throws Exception {
                C37713d dVar = new C37713d();
                dVar.mo66537a(PushSettingManagerFragment.this);
                dVar.mo56976a(commonItemView.getTag(), Integer.valueOf(commonItemView.mo25778c() ? 1 : 0));
            }

            public final void onClick(View view) {
                String str;
                String str2;
                ClickInstrumentation.onClick(view);
                if (PushSettingManagerFragment.this.isViewValid() && PushSettingManagerFragment.this.getContext() != null) {
                    String str3 = (String) commonItemView.getTag();
                    if (TextUtils.equals(str3, "live_inner_push")) {
                        if (commonItemView.mo25778c()) {
                            str2 = "off";
                        } else {
                            str2 = "on";
                        }
                        C30560g.m99825d(str2);
                        C30561h.m99828a().mo80305b(Integer.valueOf(commonItemView.mo25778c() ^ true ? 1 : 0));
                    } else if (TextUtils.equals(str3, "im_inner_push")) {
                        if (commonItemView.mo25778c()) {
                            str = "off";
                        } else {
                            str = "on";
                        }
                        C30560g.m99823c(str);
                        C30561h.m99828a().mo80303a(Integer.valueOf(commonItemView.mo25778c() ^ true ? 1 : 0));
                    } else if (!PushSettingManagerFragment.this.mo95070e()) {
                        return;
                    }
                    if (this.f98296c == null) {
                        this.f98296c = C7486b.m23223a();
                        this.f98296c.mo19315d(400, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C37731a<Object>(this));
                    }
                    commonItemView.setChecked(!commonItemView.mo25778c());
                    this.f98296c.onNext(commonItemView);
                    PushSettingManagerFragment.m120597a(str3, commonItemView.mo25778c());
                }
            }
        });
        this.f98292f.add(commonItemView);
    }

    /* renamed from: a */
    public static void m120597a(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C6907h.m21524a("notification_switch", (Map) C22984d.m75611a().mo59973a("label", str).mo59973a("to_status", str2).f60753a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qc, viewGroup, false);
    }
}
