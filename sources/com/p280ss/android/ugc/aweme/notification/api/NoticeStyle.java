package com.p280ss.android.ugc.aweme.notification.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeStyle */
public enum NoticeStyle {
    T_USE_T_OLD_STYLE(1),
    T_USE_M_OLD_STYLE(2),
    T_USE_T_NEW_STYLE(3),
    M_USE_M_OLD_STYLE(4),
    M_USE_T_NEW_STYLE(5);
    
    public static final C34403a Companion = null;
    private final int style;

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeStyle$a */
    public static final class C34403a {
        private C34403a() {
        }

        /* renamed from: a */
        public static int m111261a() {
            if (C6399b.m19947w() && C27688b.m90839c()) {
                return NoticeStyle.T_USE_T_OLD_STYLE.getStyle();
            }
            if (C6399b.m19947w() && C27688b.m90837a()) {
                return NoticeStyle.T_USE_M_OLD_STYLE.getStyle();
            }
            if (C6399b.m19947w() && C27688b.m90838b()) {
                return NoticeStyle.T_USE_T_NEW_STYLE.getStyle();
            }
            if (!C6399b.m19946v() || !C27688b.m90837a()) {
                return NoticeStyle.M_USE_T_NEW_STYLE.getStyle();
            }
            return NoticeStyle.M_USE_M_OLD_STYLE.getStyle();
        }

        public /* synthetic */ C34403a(C7571f fVar) {
            this();
        }
    }

    public static final int getNoticeStyle() {
        return C34403a.m111261a();
    }

    public final int getStyle() {
        return this.style;
    }

    static {
        Companion = new C34403a(null);
    }

    private NoticeStyle(int i) {
        this.style = i;
    }
}
