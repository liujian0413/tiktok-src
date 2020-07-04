package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.WatchStatus;
import com.p280ss.android.ugc.aweme.profile.presenter.C36015al;
import com.p280ss.android.ugc.aweme.profile.presenter.C36047u;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.x */
public final class C38136x implements C36047u, C38389f {

    /* renamed from: a */
    private final C36015al f99238a;

    /* renamed from: b */
    private final User f99239b;

    /* renamed from: c */
    private final boolean f99240c;

    /* renamed from: b */
    public final String mo95715b() {
        return "post_push";
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final int mo95710a() {
        if (this.f99240c) {
            return R.drawable.au_;
        }
        return R.drawable.aua;
    }

    /* renamed from: c */
    public final int mo95716c() {
        if (this.f99240c) {
            return R.string.cg3;
        }
        return R.string.cg6;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    public final void mo91736a(WatchStatus watchStatus) {
        if (watchStatus == null || watchStatus.watchStatus != 0) {
            C9738o.m28693a(C6399b.m19921a(), (int) R.string.cg7);
        } else {
            C9738o.m28693a(C6399b.m19921a(), (int) R.string.cg4);
        }
    }

    public C38136x(User user, boolean z) {
        C7573i.m23587b(user, "user");
        this.f99239b = user;
        this.f99240c = z;
        C36015al alVar = new C36015al();
        alVar.mo66537a(this);
        this.f99238a = alVar;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C32656f.m105742a(C38157b.m121903a(context), "others_homepage", "report");
            return;
        }
        C6907h.m21524a("click_post_notification", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f99239b.getUid()).f60753a);
        this.f99238a.mo56976a(this.f99239b.getUid(), Integer.valueOf(this.f99239b.getWatchwStatus()));
    }
}
