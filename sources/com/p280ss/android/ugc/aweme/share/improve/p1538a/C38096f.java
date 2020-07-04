package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.f */
public final class C38096f implements C38389f {

    /* renamed from: a */
    private final User f99165a;

    /* renamed from: b */
    private final Handler f99166b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.f$a */
    static final class C38097a<V> implements Callable<Object> {

        /* renamed from: a */
        public static final C38097a f99167a = new C38097a();

        C38097a() {
        }

        public final Object call() {
            return new Object();
        }
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "block_user";
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
        if (this.f99165a.isBlock) {
            return R.drawable.auc;
        }
        return R.drawable.asu;
    }

    /* renamed from: c */
    public final int mo95716c() {
        if (!this.f99165a.isBlock) {
            return R.string.tj;
        }
        return R.string.fip;
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

    public C38096f(User user, Handler handler) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(handler, "handler");
        this.f99165a = user;
        this.f99166b = handler;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        int i;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C6907h.m21524a("click_block", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f99165a.getUid()).f60753a);
        C23397p a = C23397p.m76735a();
        Handler handler = this.f99166b;
        Callable callable = C38097a.f99167a;
        if (this.f99165a.isBlock) {
            i = 55;
        } else {
            i = 54;
        }
        a.mo60807a(handler, callable, i);
    }
}
