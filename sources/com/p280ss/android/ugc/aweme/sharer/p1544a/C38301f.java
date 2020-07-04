package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.C38290a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.f */
public final class C38301f extends C38290a {

    /* renamed from: a */
    public static final C38302a f99519a = new C38302a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.f$a */
    public static final class C38302a {
        private C38302a() {
        }

        public /* synthetic */ C38302a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.at4;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "facebook";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.azw;
    }

    /* renamed from: a */
    public final boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return m122356a(hVar, context, hVar.f99567b);
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return m122356a(jVar, context, jVar.f99575b);
    }

    /* renamed from: a */
    private boolean m122356a(C38354f fVar, Context context, Uri uri) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        C7573i.m23587b(uri, "uri");
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        String b = fVar.mo95939b("media_type", "");
        String b2 = fVar.mo95939b("content_url", "video/*");
        String b3 = fVar.mo95939b("fb_app_id", "");
        if (!TextUtils.isEmpty(b)) {
            intent.setType(b);
        }
        if (!TextUtils.isEmpty(b3)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", b3);
        }
        if (!TextUtils.isEmpty(b2)) {
            intent.putExtra("content_url", b2);
        }
        intent.setDataAndType(uri, b);
        intent.setFlags(1);
        return mo95934a(context, intent);
    }
}
