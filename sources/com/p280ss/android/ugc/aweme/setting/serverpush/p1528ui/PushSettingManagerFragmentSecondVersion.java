package com.p280ss.android.ugc.aweme.setting.serverpush.p1528ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
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
import com.bytedance.keva.Keva;
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
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion */
public class PushSettingManagerFragmentSecondVersion extends AmeBaseFragment implements C37708a, C37709b {
    ImageView backBtn;

    /* renamed from: e */
    C37716e f98297e;

    /* renamed from: f */
    private List<CommonItemView> f98298f = new ArrayList();

    /* renamed from: g */
    private C7486b f98299g;

    /* renamed from: h */
    private PackageManager f98300h;

    /* renamed from: i */
    private NotificationManager f98301i;
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

    /* renamed from: j */
    private Keva f98302j = null;

    /* renamed from: k */
    private JSONObject f98303k;
    Divider liveDivider;
    TextView mTitle;
    Divider messageDivider;
    Divider pushDivider;

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion$a */
    public static class C37728a {

        /* renamed from: a */
        public String f98307a;

        /* renamed from: b */
        public boolean f98308b;

        /* renamed from: c */
        public boolean f98309c;

        /* renamed from: a */
        public final boolean mo95084a() {
            if (!this.f98308b || !this.f98309c) {
                return false;
            }
            return true;
        }

        public C37728a(String str) {
            this.f98307a = str;
        }
    }

    public final void bI_() {
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* renamed from: a */
    public final boolean mo95076a(String str) {
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.f98301i.getNotificationChannel(str);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static PushSettingManagerFragmentSecondVersion m120614d() {
        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = new PushSettingManagerFragmentSecondVersion();
        pushSettingManagerFragmentSecondVersion.setArguments(new Bundle());
        return pushSettingManagerFragmentSecondVersion;
    }

    public final void bJ_() {
        C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
    }

    /* renamed from: e */
    public final Keva mo95078e() {
        if (this.f98302j == null) {
            this.f98302j = Keva.getRepo("need_sync");
        }
        return this.f98302j;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f98297e.mo59134U_();
    }

    public void onResume() {
        super.onResume();
        m120619m();
        m120620n();
        m120616j();
        m120617k();
    }

    /* renamed from: i */
    private PackageManager m120615i() {
        if (this.f98300h == null) {
            this.f98300h = C6399b.m19921a().getPackageManager();
        }
        return this.f98300h;
    }

    /* renamed from: g */
    public final boolean mo95080g() {
        if (C43033cw.m136550a(getContext())) {
            return true;
        }
        C43034cx.m136560a(getContext(), true, C6399b.m19944t());
        return false;
    }

    /* renamed from: j */
    private void m120616j() {
        if (this.f98303k != null) {
            for (CommonItemView commonItemView : this.f98298f) {
                try {
                    m120609a(commonItemView, this.f98303k.getInt(((C37728a) commonItemView.getTag()).f98307a));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: n */
    private void m120620n() {
        float f;
        if (C43033cw.m136550a(getContext())) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        m120608a(this.itemPushDig, f);
        m120608a(this.itemPushComment, f);
        m120608a(this.itemPushFollow, f);
        m120608a(this.itemPushMention, f);
        m120608a(this.itemPushFollowNewVideo, f);
        m120608a(this.itemPushRecommendVideo, f);
        m120608a(this.itemPushLive, f);
        m120608a(this.itemOuterPushIm, f);
    }

    /* renamed from: f */
    public final C7486b mo95079f() {
        if (this.f98299g == null) {
            this.f98299g = C7486b.m23223a();
            this.f98299g.mo19315d(400, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C37732b<Object>(this));
        }
        return this.f98299g;
    }

    /* renamed from: k */
    private void m120617k() {
        boolean z;
        String string = mo95078e().getString("need_sync_channel_name", "");
        StringBuilder sb = new StringBuilder("1: ");
        sb.append(string);
        sb.append(" v ");
        if (this.f98303k != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f98303k != null && !TextUtils.isEmpty(string) && mo95076a(string)) {
            CommonItemView c = m120613c(string);
            if (c != null) {
                C37728a aVar = (C37728a) c.getTag();
                if (aVar != null && !aVar.f98308b) {
                    c.setChecked(true);
                    aVar.f98308b = true;
                    try {
                        this.f98303k.put(aVar.f98307a, aVar.f98308b ? 1 : 0);
                    } catch (JSONException unused) {
                    }
                    mo95079f().onNext(c);
                }
            }
            mo95078e().storeString("need_sync_channel_name", "");
        }
    }

    /* renamed from: m */
    private void m120619m() {
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
                m120612a(a);
                this.itemPushMain.setVisibility(0);
                this.interactionDivider.setVisibility(0);
                this.interactionDividerWithoutLine.setVisibility(8);
            }
        } else {
            m120612a(a);
            if (a) {
                i = R.string.d_b;
            } else {
                i = R.string.d_a;
            }
            str = getString(i);
        }
        this.itemPushMain.setRightText(str);
    }

    /* renamed from: l */
    private void m120618l() {
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

    /* renamed from: o */
    private void m120621o() {
        this.mTitle.setText(R.string.dom);
        this.itemPushMain.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                try {
                    C43033cw.m136552b(PushSettingManagerFragmentSecondVersion.this.getContext());
                } catch (Exception unused) {
                    PushSettingManagerFragmentSecondVersion.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                }
                String str2 = "notifications_click";
                C22984d a = C22984d.m75611a();
                String str3 = "status";
                if (C43033cw.m136550a(PushSettingManagerFragmentSecondVersion.this.getContext())) {
                    str = "on";
                } else {
                    str = "off";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            }
        });
        m120619m();
        m120610a(this.itemPushDig, "digg_push");
        m120610a(this.itemPushComment, "comment_push");
        m120610a(this.itemPushFollow, "follow_push");
        m120610a(this.itemPushMention, "mention_push");
        m120610a(this.itemPushFollowNewVideo, "follow_new_video_push");
        m120610a(this.itemPushRecommendVideo, "recommend_video_push");
        m120610a(this.itemPushLive, "live_push");
        m120610a(this.itemOuterPushIm, "im_push");
        m120610a(this.itemInnerPushLive, "live_inner_push");
        if (C7213d.m22500a().mo18758aU() == 0) {
            this.itemOuterPushIm.setLeftText(C6399b.m19921a().getResources().getString(R.string.d_c));
            this.itemPushLive.setLeftText(C6399b.m19921a().getResources().getString(R.string.d_k));
            this.itemInnerPushIm.setVisibility(8);
        } else {
            this.itemOuterPushIm.setLeftText(C6399b.m19921a().getResources().getString(R.string.a2d));
            this.itemPushLive.setLeftText(C6399b.m19921a().getResources().getString(R.string.a2f));
            m120610a(this.itemInnerPushIm, "im_inner_push");
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

    /* renamed from: c */
    private CommonItemView m120613c(String str) {
        for (CommonItemView commonItemView : this.f98298f) {
            C37728a aVar = (C37728a) commonItemView.getTag();
            if (aVar != null && TextUtils.equals(str, aVar.f98307a)) {
                return commonItemView;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo95077b(String str) {
        if (VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            intent.putExtra("android.provider.extra.APP_PACKAGE", C6399b.m19921a().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            if (m120615i().resolveActivity(intent, 65536) != null) {
                startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    private static void m120612a(boolean z) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95075a(CommonItemView commonItemView) throws Exception {
        C37713d dVar = new C37713d();
        dVar.mo66537a(this);
        C37728a aVar = (C37728a) commonItemView.getTag();
        dVar.mo56976a(aVar.f98307a, Integer.valueOf(aVar.f98308b ? 1 : 0));
        this.f98303k.put(aVar.f98307a, aVar.f98308b ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        try {
            this.f98303k = new JSONObject(C42996by.m136485a(bVar));
        } catch (JSONException unused) {
        }
        m120609a(this.itemPushDig, bVar.f98265a);
        m120609a(this.itemPushComment, bVar.f98266b);
        m120609a(this.itemPushFollow, bVar.f98267c);
        m120609a(this.itemPushMention, bVar.f98268d);
        m120609a(this.itemPushFollowNewVideo, bVar.f98271g);
        m120609a(this.itemPushRecommendVideo, bVar.f98272h);
        m120609a(this.itemPushLive, bVar.f98273i);
        m120609a(this.itemOuterPushIm, bVar.f98275k);
        m120609a(this.itemInnerPushLive, bVar.f98274j);
        C30561h.m99828a().mo80305b(Integer.valueOf(bVar.f98274j));
        if (C7213d.m22500a().mo18758aU() != 0) {
            m120609a(this.itemInnerPushIm, bVar.f98276l);
            C30561h.m99828a().mo80303a(Integer.valueOf(bVar.f98276l));
        }
        m120617k();
    }

    /* renamed from: a */
    private static void m120608a(CommonItemView commonItemView, float f) {
        View findViewById = commonItemView.findViewById(R.id.ctk);
        if (findViewById != null) {
            findViewById.setAlpha(f);
        }
        if (commonItemView != null) {
            commonItemView.setAlpha(f);
        }
    }

    /* renamed from: a */
    private void m120609a(CommonItemView commonItemView, int i) {
        C37728a aVar = (C37728a) commonItemView.getTag();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aVar.f98308b = z;
        aVar.f98309c = mo95076a(aVar.f98307a);
        commonItemView.setChecked(aVar.mo95084a());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f98301i = (NotificationManager) C6399b.m19921a().getSystemService("notification");
        m120621o();
        this.f98297e = new C37716e();
        this.f98297e.mo66537a(this);
        this.f98297e.mo56976a(new Object[0]);
        m120618l();
    }

    /* renamed from: a */
    private void m120610a(final CommonItemView commonItemView, String str) {
        commonItemView.setTag(new C37728a(str));
        commonItemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                String str2;
                ClickInstrumentation.onClick(view);
                if (PushSettingManagerFragmentSecondVersion.this.isViewValid() && PushSettingManagerFragmentSecondVersion.this.getContext() != null) {
                    C37728a aVar = (C37728a) commonItemView.getTag();
                    String str3 = aVar.f98307a;
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
                    } else if (!PushSettingManagerFragmentSecondVersion.this.mo95080g()) {
                        return;
                    }
                    if (VERSION.SDK_INT < 26 || PushSettingManagerFragmentSecondVersion.this.mo95076a(str3)) {
                        boolean z = !commonItemView.mo25778c();
                        commonItemView.setChecked(z);
                        aVar.f98308b = z;
                        PushSettingManagerFragmentSecondVersion.this.mo95079f().onNext(commonItemView);
                        PushSettingManagerFragmentSecondVersion.m120611a(str3, z);
                        return;
                    }
                    if (!aVar.f98308b && !aVar.f98309c) {
                        PushSettingManagerFragmentSecondVersion.this.mo95078e().storeString("need_sync_channel_name", str3);
                    }
                    PushSettingManagerFragmentSecondVersion.this.mo95077b(str3);
                }
            }
        });
        this.f98298f.add(commonItemView);
    }

    /* renamed from: a */
    public static void m120611a(String str, boolean z) {
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
