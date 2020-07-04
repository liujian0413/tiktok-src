package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.p996ah.p997a.C22474a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.b */
public final class C38088b implements C38389f {

    /* renamed from: a */
    private final Aweme f99148a;

    /* renamed from: b */
    private final String f99149b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.ai1;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "admin";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.fk;
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

    public C38088b(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99148a = aweme;
        this.f99149b = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        String str = "";
        if (C6399b.m19946v()) {
            str = "http://mvaali-admin.bytedance.net/aweme/op/mobile/";
        } else if (C6399b.m19947w()) {
            str = "http://sgali-admin.bytedance.net/aweme/op/mobile/";
        }
        C19290j jVar = new C19290j(str);
        jVar.mo51188a("type", this.f99149b);
        jVar.mo51188a("ids", new C6600e().mo15979b((Object) new C22474a(this.f99148a.getAid())));
        jVar.mo51188a("region", C32326h.m104885g());
        jVar.mo51186a("appId", 1233);
        Intent intent = new Intent(C38157b.m121903a(context), CrossPlatformActivity.class);
        intent.setData(Uri.parse(jVar.mo51184a()));
        context.startActivity(intent);
    }
}
