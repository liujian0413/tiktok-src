package com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1442a;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.a.a */
public final class C34543a extends C25640a<FollowRequestResponse> {

    /* renamed from: c */
    public static final C34544a f90119c = new C34544a(null);

    /* renamed from: a */
    public boolean f90120a;

    /* renamed from: b */
    public boolean f90121b;

    /* renamed from: d */
    private long f90122d;

    /* renamed from: e */
    private long f90123e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.a.a$a */
    public static final class C34544a {
        private C34544a() {
        }

        public /* synthetic */ C34544a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.a.a$b */
    static final class C34545b<V> implements Callable<FollowRequestResponse> {

        /* renamed from: a */
        final /* synthetic */ long f90124a;

        /* renamed from: b */
        final /* synthetic */ long f90125b;

        /* renamed from: c */
        final /* synthetic */ int f90126c;

        C34545b(long j, long j2, int i) {
            this.f90124a = j;
            this.f90125b = j2;
            this.f90126c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.m111411a(this.f90124a, this.f90125b, this.f90126c);
            } catch (ExecutionException e) {
                RuntimeException a = C22838j.m75277a(e);
                C7573i.m23582a((Object) a, "RetrofitFactory.getCompatibleException(e)");
                throw a;
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    /* renamed from: b */
    public final void mo87846b() {
        this.f90122d = System.currentTimeMillis() / 1000;
        this.f90123e = 1;
        this.f90121b = false;
        this.f90120a = false;
        m111700a(this.f90122d, this.f90123e, 20);
    }

    /* renamed from: a */
    public final void mo87845a() {
        this.f90121b = true;
        this.f90120a = false;
        m111700a(System.currentTimeMillis() / 1000, 1, 0);
    }

    /* renamed from: c */
    public final void mo87847c() {
        long j;
        FollowRequestResponse followRequestResponse = (FollowRequestResponse) getData();
        if (followRequestResponse != null) {
            j = followRequestResponse.minTime;
        } else {
            j = System.currentTimeMillis() / 1000;
        }
        this.f90122d = j;
        this.f90123e = 1;
        this.f90121b = false;
        this.f90120a = true;
        m111700a(this.f90122d, this.f90123e, 20);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(FollowRequestResponse followRequestResponse) {
        boolean z;
        if (followRequestResponse == null) {
            this.mData = null;
            return;
        }
        Collection collection = followRequestResponse.userRequestList;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            followRequestResponse.hasMore = false;
        }
        if (!this.f90120a || this.mData == null) {
            this.mData = followRequestResponse;
            return;
        }
        ((FollowRequestResponse) this.mData).maxTime = followRequestResponse.maxTime;
        ((FollowRequestResponse) this.mData).minTime = followRequestResponse.minTime;
        ((FollowRequestResponse) this.mData).hasMore = followRequestResponse.hasMore;
        List<User> list = ((FollowRequestResponse) this.mData).userRequestList;
        List<User> list2 = followRequestResponse.userRequestList;
        C7573i.m23582a((Object) list2, "data.userRequestList");
        list.addAll(list2);
    }

    /* renamed from: a */
    private final void m111700a(long j, long j2, int i) {
        C23397p a = C23397p.m76735a();
        Handler handler = this.mHandler;
        C34545b bVar = new C34545b(j, j2, i);
        a.mo60807a(handler, bVar, 0);
    }
}
