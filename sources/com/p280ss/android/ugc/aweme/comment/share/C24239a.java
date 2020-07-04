package com.p280ss.android.ugc.aweme.comment.share;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.share.I18nCommentShareActivity.C24235a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38295c;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38350d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.share.a */
public final class C24239a {

    /* renamed from: a */
    public static final C24239a f63969a = new C24239a();

    /* renamed from: com.ss.android.ugc.aweme.comment.share.a$a */
    public static final class C24240a implements C38345a {

        /* renamed from: a */
        final /* synthetic */ Activity f63970a;

        /* renamed from: a */
        public final Activity mo63025a() {
            return this.f63970a;
        }

        C24240a(Activity activity) {
            this.f63970a = activity;
        }
    }

    private C24239a() {
    }

    /* renamed from: a */
    public static boolean m79614a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C24240a aVar = new C24240a(activity);
        C38382b a = new C38382b().mo95977b(false).mo95971a(true);
        C24220a.m79551a().injectConfig(a, false);
        a.mo95976b(C24220a.m79551a().getServerControlChannelOrder());
        Iterator it = a.f99643a.iterator();
        List a2 = C24235a.m79609a(aVar);
        if (a.f99647e) {
            while (it.hasNext()) {
                C38343b bVar = (C38343b) it.next();
                if (a2.contains(bVar.mo95739b())) {
                    Context context = activity;
                    if (bVar.mo95743a(context)) {
                        if ((bVar instanceof C38297d) && !C38350d.m122525a(context, "com.facebook.katana")) {
                            it.remove();
                        } else if (bVar instanceof C38295c) {
                            C38356g gVar = new C38356g("", null, null, 6, null);
                            if (bVar.mo95737a(context, (C38354f) gVar)) {
                                it.remove();
                            }
                        }
                    }
                }
                it.remove();
            }
        }
        if (a.f99643a.size() != 0) {
            return true;
        }
        return false;
    }
}
