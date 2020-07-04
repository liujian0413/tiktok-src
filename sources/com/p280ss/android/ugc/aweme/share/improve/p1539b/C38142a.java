package com.p280ss.android.ugc.aweme.share.improve.p1539b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.a */
public final class C38142a extends C38146c {

    /* renamed from: a */
    public static final C38143a f99249a = new C38143a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.a$a */
    public static final class C38143a {
        private C38143a() {
        }

        public /* synthetic */ C38143a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.asy;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        return true;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "copy";
    }

    /* renamed from: c */
    public final String mo95740c() {
        String b = C23481i.m77091b(R.string.dsf);
        C7573i.m23582a((Object) b, "ResUtils.getString(R.string.share_copy_link)");
        return b;
    }

    /* renamed from: a */
    public final boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (fVar instanceof C38356g) {
            return mo95738a((C38356g) fVar, context);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95738a(C38356g gVar, Context context) {
        C7573i.m23587b(gVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        C38090d dVar = new C38090d(null, false, false, 7, null);
        dVar.mo95724a(gVar.f99565b, context);
        return true;
    }
}
