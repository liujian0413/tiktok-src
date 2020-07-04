package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.C38352d;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.twitter.sdk.android.tweetcomposer.C46996l.C46997a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.u */
public final class C38331u extends C38352d {

    /* renamed from: a */
    public static final C38332a f99536a = new C38332a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.u$a */
    public static final class C38332a {
        private C38332a() {
        }

        public /* synthetic */ C38332a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.aub;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "twitter";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Twitter";
    }

    /* renamed from: d */
    public final String mo95935d() {
        return "com.twitter.android";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.b0d;
    }

    /* renamed from: a */
    public final boolean mo95738a(C38356g gVar, Context context) {
        C7573i.m23587b(gVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return mo95745a(new C38358i(gVar.f99565b, gVar.f99566c), context);
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        new C46997a(context).mo118165a(hVar.f99567b).mo118167a();
        return true;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        String str;
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (TextUtils.isEmpty(iVar.f99574e)) {
            str = iVar.f99573d;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(iVar.f99574e);
            sb.append(" ");
            sb.append(iVar.f99573d);
            str = sb.toString();
        }
        new C46997a(context).mo118166a(str).mo118167a();
        return true;
    }
}
