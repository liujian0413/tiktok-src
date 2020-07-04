package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.sharer.C38290a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.c */
public final class C38295c extends C38290a {

    /* renamed from: a */
    public static final C38296a f99515a = new C38296a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.c$a */
    public static final class C38296a {
        private C38296a() {
        }

        public /* synthetic */ C38296a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.at3;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "email";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Email";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.azv;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", hVar.f99569d);
        intent.putExtra("android.intent.extra.SUBJECT", hVar.f99571f);
        intent.putExtra("android.intent.extra.STREAM", hVar.f99567b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", iVar.f99573d);
        intent.putExtra("android.intent.extra.SUBJECT", iVar.f99574e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", jVar.f99577d);
        intent.putExtra("android.intent.extra.SUBJECT", jVar.f99579f);
        intent.putExtra("android.intent.extra.STREAM", jVar.f99575b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo95934a(context, intent);
    }
}
