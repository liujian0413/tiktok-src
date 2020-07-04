package com.p280ss.android.ugc.aweme.p313im.sdk.common;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel */
public class ListViewModel<T> extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81546a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ListViewModel.class), "data", "getData()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ListViewModel.class), "refreshStatus", "getRefreshStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ListViewModel.class), "loadLatestStatus", "getLoadLatestStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ListViewModel.class), "loadMoreStatus", "getLoadMoreStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;"))};

    /* renamed from: b */
    private final C7541d f81547b = C7546e.m23569a(C31066a.f81551a);

    /* renamed from: c */
    private final C7541d f81548c = C7546e.m23569a(new C31069d(this));

    /* renamed from: d */
    private final C7541d f81549d = C7546e.m23569a(new C31067b(this));

    /* renamed from: e */
    private final C7541d f81550e = C7546e.m23569a(new C31068c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$a */
    static final class C31066a extends Lambda implements C7561a<C23084b<List<T>>> {

        /* renamed from: a */
        public static final C31066a f81551a = new C31066a();

        C31066a() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<List<T>> m101352a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m101352a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$b */
    static final class C31067b extends Lambda implements C7561a<C31077d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f81552a;

        C31067b(ListViewModel listViewModel) {
            this.f81552a = listViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31077d<T> invoke() {
            return new C31077d<>(this.f81552a.mo81552e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$c */
    static final class C31068c extends Lambda implements C7561a<C31077d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f81553a;

        C31068c(ListViewModel listViewModel) {
            this.f81553a = listViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31077d<T> invoke() {
            return new C31077d<>(this.f81553a.mo81552e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$d */
    static final class C31069d extends Lambda implements C7561a<C31077d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f81554a;

        C31069d(ListViewModel listViewModel) {
            this.f81554a = listViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31077d<T> invoke() {
            return new C31077d<>(this.f81554a.mo81552e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C23084b<List<T>> mo81552e() {
        return (C23084b) this.f81547b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C31077d<T> mo81554f() {
        return (C31077d) this.f81548c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C31077d<T> mo81555g() {
        return (C31077d) this.f81549d.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C31077d<T> mo81556h() {
        return (C31077d) this.f81550e.getValue();
    }

    /* renamed from: j */
    public final void mo81558j() {
        mo81554f().mo81565a(true);
    }

    /* renamed from: k */
    public final void mo81559k() {
        mo81556h().mo81565a(true);
    }

    /* renamed from: i */
    public final boolean mo81557i() {
        if (mo81554f().f81563c || mo81555g().f81563c || mo81556h().f81563c) {
            return true;
        }
        return false;
    }

    /* renamed from: a_ */
    public final void mo81549a_(Throwable th) {
        mo81552e().setValue(new ArrayList());
        mo81554f().mo81564a(th);
    }

    /* renamed from: b_ */
    public final void mo81550b_(Throwable th) {
        mo81552e().setValue(new ArrayList());
        mo81556h().mo81564a(th);
    }

    /* renamed from: d */
    public final void mo81551d(List<T> list, boolean z) {
        List list2;
        C23084b e = mo81552e();
        if (list != null) {
            list2 = C7525m.m23509d((Collection<? extends T>) list);
        } else {
            list2 = null;
        }
        e.setValue(list2);
        mo81554f().f81562b = z;
        mo81554f().mo81566b(true);
    }

    /* renamed from: e */
    public final void mo81553e(List<T> list, boolean z) {
        List list2;
        C23084b e = mo81552e();
        if (list != null) {
            list2 = C7525m.m23509d((Collection<? extends T>) list);
        } else {
            list2 = null;
        }
        e.setValue(list2);
        mo81556h().f81562b = z;
        mo81556h().mo81566b(true);
    }

    /* renamed from: a */
    private void m101339a(C0043i iVar, C31071b<T> bVar, C31071b<T> bVar2, C31071b<T> bVar3) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        if (bVar != null) {
            mo81554f().mo81563a(iVar, bVar);
        }
        if (bVar2 != null) {
            mo81556h().mo81563a(iVar, bVar2);
        }
        if (bVar3 != null) {
            mo81555g().mo81563a(iVar, bVar3);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m101340a(ListViewModel listViewModel, C0043i iVar, C31071b bVar, C31071b bVar2, C31071b bVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            bVar2 = null;
        }
        if ((i & 8) != 0) {
            bVar3 = null;
        }
        listViewModel.m101339a(iVar, bVar, bVar2, bVar3);
    }
}
