package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.sharer.C38352d;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLEncoder;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.a */
public final class C38291a extends C38352d {

    /* renamed from: a */
    public static final C38292a f99512a = new C38292a(null);

    /* renamed from: b */
    private final String f99513b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.a$a */
    public static final class C38292a {
        private C38292a() {
        }

        public /* synthetic */ C38292a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.ass;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "band";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Band";
    }

    /* renamed from: d */
    public final String mo95935d() {
        return "com.nhn.android.band";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.azs;
    }

    public C38291a(String str) {
        C7573i.m23587b(str, "domain");
        this.f99513b = str;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        if (!super.mo95737a(context, fVar) || !(fVar instanceof C38358i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        String encode = URLEncoder.encode(iVar.f99573d, "UTF-8");
        StringBuilder sb = new StringBuilder("bandapp://create/post?text=");
        sb.append(encode);
        sb.append("&route=");
        sb.append(this.f99513b);
        return mo95934a(context, new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }
}
