package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.sharer.C38352d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.t */
public final class C38329t extends C38352d {

    /* renamed from: b */
    public static final C38330a f99534b = new C38330a(null);

    /* renamed from: a */
    public final String f99535a;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.t$a */
    public static final class C38330a {
        private C38330a() {
        }

        public /* synthetic */ C38330a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.au6;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "more";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return this.f99535a;
    }

    /* renamed from: d */
    public final String mo95935d() {
        return null;
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.b0c;
    }

    public C38329t(String str) {
        C7573i.m23587b(str, "label");
        this.f99535a = str;
    }

    /* renamed from: a */
    public final boolean mo95934a(Context context, Intent intent) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(intent, "intent");
        Intent createChooser = Intent.createChooser(intent, "");
        C7573i.m23582a((Object) createChooser, "Intent.createChooser(intent, \"\")");
        return super.mo95934a(context, createChooser);
    }
}
