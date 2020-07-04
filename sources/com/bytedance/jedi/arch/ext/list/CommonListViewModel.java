package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.IListState;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;

public abstract class CommonListViewModel<T, S extends IListState<T, C11583n>> extends ListViewModel<T, C11583n, S> {

    /* renamed from: d */
    private final C7562b<S, C7492s<Pair<List<T>, C11583n>>> f31132d;

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$a */
    static final class C11509a extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31133a;

        C11509a(C7562b bVar) {
            this.f31133a = bVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<T>, C11583n>> invoke(S s) {
            C7573i.m23587b(s, "state");
            return (C7492s) this.f31133a.invoke(s);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$b */
    static final class C11510b extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ CommonListViewModel f31134a;

        C11510b(CommonListViewModel commonListViewModel) {
            this.f31134a = commonListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<T>, C11583n>> invoke(S s) {
            C7573i.m23587b(s, "state");
            return (C7492s) this.f31134a.mo29069f().invoke(s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C7562b<S, C7492s<Pair<List<T>, C11583n>>> mo29069f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C7562b<S, C7492s<Pair<List<T>, C11583n>>> mo29070g() {
        return this.f31132d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C7562b<S, C7492s<Pair<List<T>, C11583n>>> mo29071h() {
        return new C11510b<>(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C7562b<S, C7492s<Pair<List<T>, C11583n>>> mo29072i() {
        C7562b g = mo29070g();
        if (g != null) {
            return new C11509a<>(g);
        }
        return null;
    }
}
