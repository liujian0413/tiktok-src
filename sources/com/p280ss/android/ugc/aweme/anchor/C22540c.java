package com.p280ss.android.ugc.aweme.anchor;

import com.p280ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.api.p1009b.C22530b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.c */
public final class C22540c extends C25673a<Object, C22530b> {

    /* renamed from: c */
    public static final C22541a f60051c = new C22541a(null);

    /* renamed from: a */
    public List<Object> f60052a = new ArrayList();

    /* renamed from: b */
    public final int f60053b;

    /* renamed from: d */
    private int f60054d = 1;

    /* renamed from: e */
    private List<? extends Object> f60055e = C7525m.m23461a();

    /* renamed from: f */
    private List<C22528c> f60056f = new ArrayList();

    /* renamed from: g */
    private boolean f60057g;

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$a */
    public static final class C22541a {
        private C22541a() {
        }

        public /* synthetic */ C22541a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$b */
    static final class C22542b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C22540c f60058a;

        /* renamed from: b */
        final /* synthetic */ int f60059b;

        C22542b(C22540c cVar, int i) {
            this.f60058a = cVar;
            this.f60059b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22530b call() {
            return AnchorApi.m74494a(this.f60058a.f60053b, 0, this.f60059b, 20);
        }
    }

    public final List<Object> getItems() {
        return this.f60055e;
    }

    public final boolean isHasMore() {
        return this.f60057g;
    }

    /* renamed from: a */
    public final boolean mo59149a() {
        Collection collection = this.f60056f;
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
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
        m74532a(this.f60054d);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m74532a(0);
    }

    /* renamed from: a */
    private final void m74532a(int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new C22542b(this, i), 0);
    }

    public C22540c(int i) {
        this.f60053b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C22530b bVar) {
        boolean z;
        List list;
        boolean z2;
        boolean z3;
        if (bVar != null) {
            Collection a = bVar.mo59142a();
            boolean z4 = false;
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f60057g = false;
                this.f60054d = 1;
                this.f60056f.clear();
                this.f60055e = C7525m.m23461a();
                return;
            }
            if (this.mListQueryType == 1) {
                this.f60056f.clear();
                List a2 = bVar.mo59142a();
                if (a2 != null) {
                    this.f60056f.addAll(a2);
                    if (bVar.f60015b) {
                        C22528c cVar = (C22528c) C7525m.m23517i(a2);
                        if (cVar != null && cVar.f60009b) {
                            z3 = true;
                            this.f60057g = z3;
                        }
                    }
                    z3 = false;
                    this.f60057g = z3;
                } else {
                    this.f60057g = false;
                }
            } else if (this.mListQueryType == 4) {
                if (bVar.status_code == 0) {
                    this.f60054d++;
                }
                List a3 = bVar.mo59142a();
                if (a3 != null) {
                    C22528c cVar2 = (C22528c) C7525m.m23517i(a3);
                    if (cVar2 != null) {
                        List<C22526a> list2 = cVar2.f60012e;
                        if (list2 != null) {
                            C22528c cVar3 = (C22528c) C7525m.m23517i(this.f60056f);
                            if (cVar3 != null) {
                                List<C22526a> list3 = cVar3.f60012e;
                                if (list3 != null) {
                                    list3.addAll(list2);
                                }
                            }
                            if (bVar.f60015b) {
                                List a4 = bVar.mo59142a();
                                if (a4 != null) {
                                    C22528c cVar4 = (C22528c) C7525m.m23517i(a4);
                                    if (cVar4 != null && cVar4.f60009b) {
                                        z2 = true;
                                        this.f60057g = z2;
                                    }
                                }
                            }
                            z2 = false;
                            this.f60057g = z2;
                        }
                    }
                }
                this.f60057g = false;
            }
            Collection collection = bVar.f60016c;
            if (collection == null || collection.isEmpty()) {
                z4 = true;
            }
            if (!z4) {
                this.f60052a.clear();
                List<Object> list4 = this.f60052a;
                List<Object> list5 = bVar.f60016c;
                if (list5 == null) {
                    C7573i.m23580a();
                }
                list4.addAll(list5);
            }
            Iterable<C22528c> iterable = this.f60056f;
            Collection arrayList = new ArrayList();
            for (C22528c cVar5 : iterable) {
                Collection a5 = C7525m.m23457a(cVar5);
                List<C22526a> list6 = cVar5.f60012e;
                if (list6 != null) {
                    Iterable<C22526a> iterable2 = list6;
                    Collection arrayList2 = new ArrayList();
                    for (C22526a a6 : iterable2) {
                        C7525m.m23478a(arrayList2, (Iterable<? extends T>) C7525m.m23457a(a6));
                    }
                    list = (List) arrayList2;
                } else {
                    list = C7525m.m23461a();
                }
                C7525m.m23478a(arrayList, (Iterable<? extends T>) C7525m.m23506c(a5, (Iterable<? extends T>) list));
            }
            this.f60055e = (List) arrayList;
        }
    }
}
