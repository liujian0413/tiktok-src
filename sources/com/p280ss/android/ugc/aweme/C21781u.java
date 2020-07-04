package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.u */
public final class C21781u {

    /* renamed from: a */
    public static final C21781u f58294a = new C21781u();

    /* renamed from: b */
    private static final LinkedList<WeakReference<Activity>> f58295b = new LinkedList<>();

    /* renamed from: com.ss.android.ugc.aweme.u$a */
    static final class C21782a extends Lambda implements C7562b<WeakReference<Activity>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Activity f58296a;

        C21782a(Activity activity) {
            this.f58296a = activity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m72814a((WeakReference) obj));
        }

        /* renamed from: a */
        private boolean m72814a(WeakReference<Activity> weakReference) {
            C7573i.m23587b(weakReference, "it");
            Activity activity = (Activity) weakReference.get();
            if (activity == null || C7573i.m23585a((Object) activity, (Object) this.f58296a)) {
                return true;
            }
            return false;
        }
    }

    private C21781u() {
    }

    /* renamed from: a */
    private static Activity m72810a() {
        WeakReference weakReference = (WeakReference) C7525m.m23513g((List<? extends T>) f58295b);
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public static final void m72812b(Activity activity) {
        if (activity != null) {
            m72813c(activity);
        }
    }

    /* renamed from: c */
    private static void m72813c(Activity activity) {
        C7525m.m23480a((List<T>) f58295b, (C7562b<? super T, Boolean>) new C21782a<Object,Boolean>(activity));
    }

    /* renamed from: a */
    public static final int m72809a(Context context) {
        if (!(context instanceof Activity)) {
            return 1;
        }
        if (!C7573i.m23585a((Object) m72810a(), (Object) context)) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public static final void m72811a(Activity activity) {
        if (activity != null) {
            m72813c(activity);
            f58295b.addFirst(new WeakReference(activity));
        }
    }
}
