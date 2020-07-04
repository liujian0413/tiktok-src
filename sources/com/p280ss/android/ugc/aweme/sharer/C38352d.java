package com.p280ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38350d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.d */
public abstract class C38352d extends C38290a {
    /* renamed from: d */
    public abstract String mo95935d();

    /* renamed from: a */
    public boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        String d = mo95935d();
        if (TextUtils.isEmpty(d)) {
            return true;
        }
        if (d == null) {
            C7573i.m23580a();
        }
        return C38350d.m122525a(context, d);
    }

    /* renamed from: a */
    public boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        String d = mo95935d();
        if (TextUtils.isEmpty(d)) {
            return true;
        }
        if (d == null) {
            C7573i.m23580a();
        }
        return C38350d.m122525a(context, d);
    }

    /* renamed from: a */
    public boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.setPackage(mo95935d());
        intent.putExtra("android.intent.extra.STREAM", hVar.f99567b);
        intent.putExtra("android.intent.extra.TEXT", hVar.f99569d);
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(mo95935d());
        intent.putExtra("android.intent.extra.TEXT", iVar.f99573d);
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("video/*");
        intent.setPackage(mo95935d());
        intent.putExtra("android.intent.extra.STREAM", jVar.f99575b);
        intent.putExtra("android.intent.extra.TEXT", jVar.f99577d);
        return mo95934a(context, intent);
    }
}
