package com.p280ss.android.ugc.aweme.share.p1529a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.C28690b;
import com.p280ss.android.ugc.aweme.share.C38024d;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.p1541d.C38165a.C38166a;
import com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C38177b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.a.b */
public final class C37958b {

    /* renamed from: a */
    public static final C37958b f98849a = new C37958b();

    private C37958b() {
    }

    /* renamed from: a */
    public static SkeletonShareDialog m121263a(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(zVar, "eventListener");
        C7573i.m23587b(bundle, "extras");
        String string = bundle.getString("event_type", "");
        int i = bundle.getInt("page_type");
        C38177b bVar = AwemeSharePackage.f99301b;
        Context context = activity;
        C7573i.m23582a((Object) string, "eventType");
        AwemeSharePackage a = C38177b.m121950a(aweme, context, i, string, "");
        C38382b a2 = new C38382b().mo95964a((SharePackage) a);
        C38166a.m121923a(a2, false, C6405d.m19984g());
        a2.mo95974b().mo95977b(false);
        if (C43168s.m136911c(aweme)) {
            a2.mo95977b(true);
            a.f20186l.putString("is_friend_private", "true");
        }
        C28690b bVar2 = new C28690b(aweme, true, context, a2, zVar, string, i);
        bVar2.mo73751a();
        C38024d.m121363a(a2, string, aweme);
        SkeletonShareDialog scoopShareDialogWithImModule = C37950a.m121238a().scoopShareDialogWithImModule(activity, a2.mo95972a(), R.style.t2);
        scoopShareDialogWithImModule.show();
        return scoopShareDialogWithImModule;
    }
}
