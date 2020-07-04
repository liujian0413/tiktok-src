package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import com.bytedance.common.utility.collection.C6307b;
import com.p1843tt.appbrandimpl.MicroAppApi;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a */
public final class C33365a extends C25673a<MicroAppInfo, C33368b> {

    /* renamed from: a */
    public static final C33366a f87177a = new C33366a(null);

    /* renamed from: b */
    private int f87178b;

    /* renamed from: c */
    private final ArrayList<MicroAppInfo> f87179c = new ArrayList<>();

    /* renamed from: d */
    private boolean f87180d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a$a */
    public static final class C33366a {
        private C33366a() {
        }

        public /* synthetic */ C33366a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a$b */
    static final class C33367b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f87181a;

        C33367b(int i) {
            this.f87181a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33368b call() {
            return MicroAppApi.m146349a(this.f87181a, 20);
        }
    }

    public final boolean isHasMore() {
        return this.f87180d;
    }

    public final List<MicroAppInfo> getItems() {
        return this.f87179c;
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m107930a(this.f87178b);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m107930a(0);
    }

    /* renamed from: a */
    private final void m107930a(int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new C33367b(i), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C33368b bVar) {
        boolean z;
        int i = 0;
        if (bVar == null || C6307b.m19566a((Collection<T>) bVar.f87184c)) {
            this.f87180d = false;
            return;
        }
        Boolean bool = bVar.f87183b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.f87180d = z;
        Integer num = bVar.f87182a;
        if (num != null) {
            i = num.intValue();
        }
        this.f87178b = i;
        if (this.mListQueryType == 1) {
            this.f87179c.clear();
        }
        ArrayList<MicroAppInfo> arrayList = this.f87179c;
        Collection collection = bVar.f87184c;
        if (collection == null) {
            collection = new ArrayList();
        }
        arrayList.addAll(collection);
    }
}
