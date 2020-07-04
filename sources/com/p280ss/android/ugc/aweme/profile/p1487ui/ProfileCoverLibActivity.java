package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter;
import com.p280ss.android.ugc.aweme.profile.adapter.VerticalPaddingItemDecoration;
import com.p280ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity */
public class ProfileCoverLibActivity extends AmeSSActivity implements C6310a, C36046t {

    /* renamed from: a */
    private C36011ai f94995a;

    /* renamed from: b */
    private int f94996b;

    /* renamed from: c */
    private int f94997c;

    /* renamed from: d */
    private int f94998d;

    /* renamed from: e */
    private int f94999e;

    /* renamed from: f */
    private int f95000f;
    RecyclerView mCoverRecycleView;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ac4);
    }

    /* renamed from: a */
    private void m117063a() {
        this.f94996b = (int) C9738o.m28708b((Context) this, 16.0f);
        this.f94997c = (int) C9738o.m28708b((Context) this, 16.0f);
        this.f94998d = (int) C9738o.m28708b((Context) this, 16.0f);
        this.f94999e = (int) C9738o.m28708b((Context) this, 8.0f);
        this.f95000f = (int) C9738o.m28708b((Context) this, 8.0f);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ProfileCoverLibActivity.this.onBackPressed();
            }
        });
        ProfileCoverAdapter profileCoverAdapter = new ProfileCoverAdapter();
        profileCoverAdapter.mo58045a(m117065b());
        profileCoverAdapter.f93646a = new C36408cv(this);
        this.mCoverRecycleView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        RecyclerView recyclerView = this.mCoverRecycleView;
        VerticalPaddingItemDecoration verticalPaddingItemDecoration = new VerticalPaddingItemDecoration(this.f94996b, this.f94997c, this.f94998d, this.f94999e, this.f95000f);
        recyclerView.mo5525a((C1272h) verticalPaddingItemDecoration);
        this.mCoverRecycleView.setAdapter(profileCoverAdapter);
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this));
    }

    /* renamed from: b */
    private List<UrlModel> m117065b() {
        Set<String> a = C23338f.m76564b().mo60624a("default_profile_cover_url", (Set<String>) new HashSet<String>());
        ArrayList<UrlModelWrap> arrayList = new ArrayList<>();
        for (String fromJson : a) {
            arrayList.add(UrlModelWrap.fromJson(fromJson));
        }
        m117064a((List<UrlModelWrap>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (UrlModelWrap urlModel : arrayList) {
            arrayList2.add(urlModel.getUrlModel());
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m117064a(List<UrlModelWrap> list) {
        Collections.sort(list, C36409cw.f95565a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92199a(UrlModel urlModel) {
        if (!TextUtils.isEmpty(urlModel.getUri())) {
            this.mStatusView.mo25942f();
            this.f94995a.mo91642a(urlModel.getUri(), 3);
        }
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            C22814a.m75245a(this, (Exception) message.obj, R.string.d80);
            return;
        }
        if (message.obj instanceof User) {
            C21115b.m71197a().setCurUser((User) message.obj);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c7);
        ButterKnife.bind((Activity) this);
        m117063a();
        this.f94995a = new C36011ai();
        this.f94995a.f94200a = this;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", false);
    }

    /* renamed from: a */
    static final /* synthetic */ int m117062a(UrlModelWrap urlModelWrap, UrlModelWrap urlModelWrap2) {
        return urlModelWrap.getPosition() - urlModelWrap2.getPosition();
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (isViewValid() && this.f94995a != null) {
            this.mStatusView.setVisibility(8);
            C22814a.m75245a(this, exc, R.string.d80);
            C6907h.m21524a("replace_profile_cover_finish", (Map) new C22984d().mo59973a("enter_method", "app_album").f60753a);
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (isViewValid()) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.d7m).mo25750a();
            this.mStatusView.setVisibility(8);
            C21115b.m71197a().queryUser(new C6309f(Looper.getMainLooper(), this));
            C6907h.m21524a("replace_profile_cover_finish", (Map) new C22984d().mo59973a("enter_method", "app_album").f60753a);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.mo25939d();
            }
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
                if (z) {
                    finish();
                }
            }
        }
    }
}
