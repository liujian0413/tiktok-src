package com.p280ss.android.ugc.aweme.discover.hotspot.feed;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack */
public final class SpotCurSpotChangeCallBack extends C0063u {

    /* renamed from: c */
    public static final C26697a f70380c = new C26697a(null);

    /* renamed from: a */
    public final C23084b<Pair<Aweme, Boolean>> f70381a = new C23084b<>();

    /* renamed from: b */
    public final C23084b<Pair<Aweme, Boolean>> f70382b = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a */
    public static final class C26697a {

        /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a$a */
        static final class C26698a<T> implements C0053p<Pair<? extends Aweme, ? extends Boolean>> {

            /* renamed from: a */
            final /* synthetic */ C7563m f70383a;

            C26698a(C7563m mVar) {
                this.f70383a = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Pair<? extends Aweme, Boolean> pair) {
                if (pair != null) {
                    this.f70383a.invoke(pair.getFirst(), pair.getSecond());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a$b */
        static final class C26699b<T> implements C0053p<Pair<? extends Aweme, ? extends Boolean>> {

            /* renamed from: a */
            final /* synthetic */ C7563m f70384a;

            C26699b(C7563m mVar) {
                this.f70384a = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Pair<? extends Aweme, Boolean> pair) {
                if (pair != null) {
                    this.f70384a.invoke(pair.getFirst(), pair.getSecond());
                }
            }
        }

        private C26697a() {
        }

        public /* synthetic */ C26697a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static C23084b<Pair<Aweme, Boolean>> m87685a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "context");
            return ((SpotCurSpotChangeCallBack) C0069x.m159a(fragmentActivity).mo147a(SpotCurSpotChangeCallBack.class)).f70381a;
        }

        /* renamed from: b */
        private static C23084b<Pair<Aweme, Boolean>> m87686b(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "context");
            return ((SpotCurSpotChangeCallBack) C0069x.m159a(fragmentActivity).mo147a(SpotCurSpotChangeCallBack.class)).f70382b;
        }

        /* renamed from: a */
        public final void mo68428a(FragmentActivity fragmentActivity, C0043i iVar, C7563m<? super Aweme, ? super Boolean, C7581n> mVar) {
            C7573i.m23587b(fragmentActivity, "context");
            C7573i.m23587b(iVar, "owner");
            C7573i.m23587b(mVar, "listener");
            m87685a(fragmentActivity).mo60162a(iVar, new C26698a(mVar), true);
            m87686b(fragmentActivity).mo60162a(iVar, new C26699b(mVar), true);
        }
    }

    /* renamed from: a */
    public final int mo68427a(Aweme aweme) {
        Object obj;
        C7573i.m23587b(aweme, "aweme");
        Pair pair = (Pair) this.f70381a.getValue();
        Aweme aweme2 = null;
        if (pair != null) {
            obj = (Aweme) pair.getFirst();
        } else {
            obj = null;
        }
        if (C7573i.m23585a(obj, (Object) aweme)) {
            return 1;
        }
        Pair pair2 = (Pair) this.f70382b.getValue();
        if (pair2 != null) {
            aweme2 = (Aweme) pair2.getFirst();
        }
        if (C7573i.m23585a((Object) aweme2, (Object) aweme)) {
            return -1;
        }
        return 0;
    }
}
