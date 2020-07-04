package com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.video.C43316v;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a.a.a */
public class C28688a implements C28689b {

    /* renamed from: a */
    private Context f75558a;

    /* renamed from: a */
    public void mo63020a(String str) {
    }

    /* renamed from: a */
    public final void mo63019a() {
        if (mo73750c()) {
            C43316v.m137450K().mo104948x();
        }
    }

    /* renamed from: b */
    public void mo63021b() {
        if (mo73750c()) {
            C43316v.m137450K().mo104946v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo73750c() {
        if (C6405d.m19987h() || this.f75558a == null) {
            return false;
        }
        if (this.f75558a instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) this.f75558a;
            if (!ScrollSwitchStateManager.m98918a((FragmentActivity) mainActivity).mo79723b("page_feed") || !mainActivity.isUnderMainTab() || !mainActivity.isViewValid()) {
                return false;
            }
            return true;
        } else if (!(this.f75558a instanceof DetailActivity)) {
            return false;
        } else {
            DetailActivity detailActivity = (DetailActivity) this.f75558a;
            if (!ScrollSwitchStateManager.m98918a((FragmentActivity) detailActivity).mo79723b("page_feed") || !detailActivity.isViewValid()) {
                return false;
            }
            return true;
        }
    }

    public C28688a(Context context) {
        this.f75558a = context;
    }
}
