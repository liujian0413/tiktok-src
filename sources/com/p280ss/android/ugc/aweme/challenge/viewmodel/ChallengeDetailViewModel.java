package com.p280ss.android.ugc.aweme.challenge.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel */
public final class ChallengeDetailViewModel extends C0063u {

    /* renamed from: c */
    public static final C23812a f62855c = new C23812a(null);

    /* renamed from: a */
    public final C23084b<Integer> f62856a = new C23084b<>();

    /* renamed from: b */
    public final C23084b<Pair<Integer, C23671a>> f62857b = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel$a */
    public static final class C23812a {
        private C23812a() {
        }

        public /* synthetic */ C23812a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ChallengeDetailViewModel m78027a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(ChallengeDetailViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (ChallengeDetailViewModel) a;
        }
    }

    /* renamed from: a */
    public final C23671a mo61860a(int i) {
        if (this.f62857b.getValue() != null) {
            Object value = this.f62857b.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Number) ((Pair) value).getFirst()).intValue() == i) {
                Object value2 = this.f62857b.getValue();
                if (value2 == null) {
                    C7573i.m23580a();
                }
                return (C23671a) ((Pair) value2).getSecond();
            }
        }
        C23671a aVar = new C23671a();
        this.f62857b.setValue(new Pair(Integer.valueOf(i), aVar));
        return aVar;
    }
}
