package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34360i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.c */
public final class C34513c {
    /* renamed from: a */
    public static final int m111621a(BaseNotice baseNotice) {
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice instanceof C34360i) {
            return 999;
        }
        return baseNotice.getType();
    }
}
