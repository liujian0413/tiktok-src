package com.p280ss.android.ugc.aweme.emoji.utils;

import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27598m;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27553p;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.e */
public final class C27634e {

    /* renamed from: a */
    public static final C27634e f72817a = new C27634e();

    private C27634e() {
    }

    /* renamed from: a */
    public static final int m90603a(C27598m mVar, int i) {
        C7573i.m23587b(mVar, "emojiPanelModel");
        C27522f c = mVar.mo70850c(i);
        if (c instanceof C27553p) {
            return 2;
        }
        if (!(c instanceof C27515h)) {
            return 1;
        }
        if (C27515h.m90173c(mVar.mo70855e(i))) {
            return 3;
        }
        return 4;
    }
}
