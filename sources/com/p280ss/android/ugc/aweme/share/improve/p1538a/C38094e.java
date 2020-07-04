package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.model.RestrictUserModel;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37639e;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37642h;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38162d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.e */
public final class C38094e implements C37639e, C38389f {

    /* renamed from: a */
    public final C37642h f99161a = new C37642h(new RestrictUserModel(), this);

    /* renamed from: b */
    public final Aweme f99162b;

    /* renamed from: c */
    private final String f99163c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.e$a */
    static final class C38095a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38094e f99164a;

        C38095a(C38094e eVar) {
            this.f99164a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f99164a.f99161a.mo94937a(this.f99164a.f99162b.getAuthorUid());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.a40;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "blacklist";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.tf;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: i */
    public final void mo71988i() {
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: b */
    public final void mo71986b(Exception exc) {
        C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
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

    public C38094e(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99162b = aweme;
        this.f99163c = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C38156a.m121902a(this, context, this.f99162b, this.f99163c)) {
            String string = context.getResources().getString(R.string.tf);
            C7573i.m23582a((Object) string, "context.resources.getString(R.string.blacklist)");
            String string2 = context.getResources().getString(R.string.th);
            C7573i.m23582a((Object) string2, "context.resources.getStr…tring.blacklist_user_msg)");
            String string3 = context.getResources().getString(R.string.tf);
            C7573i.m23582a((Object) string3, "context.resources.getString(R.string.blacklist)");
            C38162d.m121917a(this, context, string, string2, string3, true, new C38095a(this));
        }
    }
}
