package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.i */
public final class C34360i extends MusNotice {

    /* renamed from: a */
    public static final C34361a f89550a = new C34361a(null);

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.i$a */
    public static final class C34361a {
        private C34361a() {
        }

        public /* synthetic */ C34361a(C7571f fVar) {
            this();
        }
    }

    public final int hashCode() {
        return Integer.valueOf(this.timeLineType).hashCode();
    }

    public C34360i(int i) {
        super(null, null, null, null, null, null, null, 127, null);
        this.timeLineType = i;
        this.nid = String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C34360i) && this.timeLineType == ((C34360i) obj).timeLineType) {
            return true;
        }
        return false;
    }
}
