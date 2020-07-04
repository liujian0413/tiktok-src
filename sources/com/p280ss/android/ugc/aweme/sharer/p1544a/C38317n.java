package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import com.facebook.messenger.C14118a;
import com.facebook.messenger.C14119b;
import com.p280ss.android.ugc.aweme.sharer.C38352d;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.n */
public final class C38317n extends C38352d {

    /* renamed from: a */
    public static final C38318a f99527a = new C38318a(null);

    /* renamed from: b */
    private final C38345a f99528b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.n$a */
    public static final class C38318a {
        private C38318a() {
        }

        public /* synthetic */ C38318a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.atl;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "messenger";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Messenger";
    }

    /* renamed from: d */
    public final String mo95935d() {
        return "com.facebook.orca";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.b07;
    }

    public C38317n(C38345a aVar) {
        C7573i.m23587b(aVar, "activityProvider");
        this.f99528b = aVar;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (C14118a.m41689a(context)) {
            return super.mo95745a(iVar, context);
        }
        C14118a.m41691b(context);
        return true;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        C14118a.m41687a(this.f99528b.mo63025a(), 12306, C14119b.m41693a(hVar.f99567b, "image/*").mo33878a());
        return true;
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        C14118a.m41687a(this.f99528b.mo63025a(), 12306, C14119b.m41693a(jVar.f99575b, "video/*").mo33878a());
        return true;
    }
}
