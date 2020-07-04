package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.C38352d;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.x */
public class C38337x extends C38352d {

    /* renamed from: a */
    public static final C38338a f99540a = new C38338a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.x$a */
    public static final class C38338a {
        private C38338a() {
        }

        public /* synthetic */ C38338a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public int mo95736a() {
        return R.drawable.auk;
    }

    /* renamed from: b */
    public String mo95739b() {
        return "whatsapp";
    }

    /* renamed from: c */
    public String mo95740c() {
        return "WhatsApp";
    }

    /* renamed from: d */
    public final String mo95935d() {
        return "com.whatsapp";
    }

    /* renamed from: e */
    public int mo95742e() {
        return R.drawable.b0g;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        String b = iVar.mo95939b("whatsapp_target_phone_number", "");
        if (!TextUtils.isEmpty(b)) {
            return m122473a(iVar, b, context);
        }
        return super.mo95745a(iVar, context);
    }

    /* renamed from: a */
    private final boolean m122473a(C38358i iVar, String str, Context context) {
        if (!mo95737a(context, (C38354f) iVar)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(mo95935d());
        StringBuilder sb = new StringBuilder("https://wa.me/");
        sb.append(str);
        sb.append("?text=");
        sb.append(iVar.f99573d);
        intent.setData(Uri.parse(sb.toString()));
        context.startActivity(intent);
        return true;
    }
}
