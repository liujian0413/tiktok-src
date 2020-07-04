package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater.C30581b.C30582a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.BaseDiffableAdapter */
public abstract class BaseDiffableAdapter<VH extends C1293v, T> extends BaseAdapter<T> implements C30581b<T> {

    /* renamed from: a */
    private final C30577a<T> f80288a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.BaseDiffableAdapter$a */
    static final class C30576a extends Lambda implements C7562b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseDiffableAdapter f80289a;

        C30576a(BaseDiffableAdapter baseDiffableAdapter) {
            this.f80289a = baseDiffableAdapter;
            super(1);
        }

        /* renamed from: a */
        private int m99876a(int i) {
            return i + this.f80289a.mo80347j();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m99876a(((Number) obj).intValue()));
        }
    }

    /* renamed from: f */
    public final C30577a<T> mo80346f() {
        return this.f80288a;
    }

    /* renamed from: j */
    public int mo80347j() {
        return 0;
    }

    public int getItemCount() {
        return mo80346f().mo80349a() + mo80347j();
    }

    /* renamed from: e */
    public final void mo80345e(List<? extends T> list) {
        C30582a.m99892a(this, list);
    }

    private BaseDiffableAdapter(C1147c<T> cVar) {
        C7573i.m23587b(cVar, "diffCallback");
        this(C30587e.m99899a(cVar, null, null));
    }

    /* renamed from: b */
    public T mo80344b(int i) {
        if (i < mo80347j() || i >= getItemCount()) {
            return null;
        }
        return mo80346f().mo80350a(i - mo80347j());
    }

    private BaseDiffableAdapter(C30583c<T> cVar) {
        C7573i.m23587b(cVar, "config");
        this.f80288a = new C30577a<>(new DifferListUpdateCallback(this, new C30576a(this)), cVar);
        this.f67566v = false;
    }

    /* renamed from: a */
    public final void mo80343a(List<? extends T> list, C7561a<C7581n> aVar) {
        C30582a.m99893a(this, list, aVar);
    }

    public /* synthetic */ BaseDiffableAdapter(C1147c cVar, int i, C7571f fVar) {
        this((C1147c<T>) new EqualsItemCallback<T>());
    }
}
