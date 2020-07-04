package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.a */
public final class C38234a implements C38389f {

    /* renamed from: a */
    private final Activity f99390a;

    /* renamed from: b */
    private final C9389b f99391b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.b_h;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "live_feed_back";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.bxs;
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

    public C38234a(Activity activity, C9389b bVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(bVar, "params");
        this.f99390a = activity;
        this.f99391b = bVar;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        Intent intent = new Intent(this.f99390a, ((IBridgeService) service).getSubmitFeedbackActivity());
        intent.putExtra("roomId", this.f99391b.f25820c);
        intent.putExtra("feedback_id", "6955");
        intent.putExtra("enter_from", "live_share_feedback");
        this.f99390a.startActivity(intent);
        String str = "livesdk_share_feedback_click";
        C22984d a = C22984d.m75611a().mo59973a("action_type", this.f99391b.f25838u);
        Map<String, String> map = this.f99391b.f25842y;
        if (map == null) {
            map = C7507ae.m23387a();
        }
        IAccountUserService a2 = C21115b.m71197a();
        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
        C6907h.m21524a(str, (Map) a.mo59974a(new HashMap(map)).mo59973a("uid", a2.getCurUserId()).f60753a);
    }
}
