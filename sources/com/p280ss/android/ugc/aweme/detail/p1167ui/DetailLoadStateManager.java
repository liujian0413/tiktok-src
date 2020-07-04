package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager */
public final class DetailLoadStateManager extends C0063u {

    /* renamed from: b */
    public static final C26182a f69052b = new C26182a(null);

    /* renamed from: a */
    public final C0052o<Boolean> f69053a = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a */
    public static final class C26182a {

        /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a$a */
        public static final class C26183a implements C0067b {
            C26183a() {
            }

            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                C7573i.m23587b(cls, "modelClass");
                return (C0063u) new DetailLoadStateManager();
            }
        }

        private C26182a() {
        }

        public /* synthetic */ C26182a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static DetailLoadStateManager m86110a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m160a(fragmentActivity, (C0067b) new C26183a()).mo147a(DetailLoadStateManager.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…StateManager::class.java)");
            return (DetailLoadStateManager) a;
        }
    }

    /* renamed from: a */
    public static final DetailLoadStateManager m86109a(FragmentActivity fragmentActivity) {
        return C26182a.m86110a(fragmentActivity);
    }
}
