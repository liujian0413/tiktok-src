package com.p280ss.android.ugc.aweme.interest;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.journey.C32246j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.interest.IntereSelectAdapter */
public final class IntereSelectAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83950a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntereSelectAdapter.class), "interestSet", "getInterestSet()Ljava/util/LinkedHashSet;"))};

    /* renamed from: e */
    public static int f83951e = -1;

    /* renamed from: f */
    public static final C32143a f83952f = new C32143a(null);

    /* renamed from: b */
    public List<C32246j> f83953b = new LinkedList();

    /* renamed from: c */
    public boolean f83954c = true;

    /* renamed from: d */
    public final C7562b<Integer, C7581n> f83955d;

    /* renamed from: g */
    private final C7541d f83956g = C7546e.m23569a(C32144b.f83958a);

    /* renamed from: h */
    private final C7563m<Boolean, Integer, C7581n> f83957h = new C32145c(this);

    /* renamed from: com.ss.android.ugc.aweme.interest.IntereSelectAdapter$a */
    public static final class C32143a {
        private C32143a() {
        }

        /* renamed from: a */
        public static int m104387a() {
            return IntereSelectAdapter.f83951e;
        }

        /* renamed from: b */
        public static int m104389b(int i) {
            return i == 0 ? 0 : 1;
        }

        public /* synthetic */ C32143a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m104388a(int i) {
            IntereSelectAdapter.f83951e = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.IntereSelectAdapter$b */
    static final class C32144b extends Lambda implements C7561a<LinkedHashSet<Integer>> {

        /* renamed from: a */
        public static final C32144b f83958a = new C32144b();

        C32144b() {
            super(0);
        }

        /* renamed from: a */
        private static LinkedHashSet<Integer> m104390a() {
            return new LinkedHashSet<>();
        }

        public final /* synthetic */ Object invoke() {
            return m104390a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.IntereSelectAdapter$c */
    static final class C32145c extends Lambda implements C7563m<Boolean, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ IntereSelectAdapter f83959a;

        C32145c(IntereSelectAdapter intereSelectAdapter) {
            this.f83959a = intereSelectAdapter;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m104391a(((Boolean) obj).booleanValue(), ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104391a(boolean z, int i) {
            if (this.f83959a.f83954c) {
                int i2 = i - 1;
                if (z) {
                    this.f83959a.mo83287a().remove(Integer.valueOf(i2));
                } else {
                    this.f83959a.mo83287a().add(Integer.valueOf(i2));
                }
                this.f83959a.notifyItemChanged(i);
                this.f83959a.f83955d.invoke(Integer.valueOf(this.f83959a.mo83287a().size()));
            }
        }
    }

    /* renamed from: a */
    public final LinkedHashSet<Integer> mo83287a() {
        return (LinkedHashSet) this.f83956g.getValue();
    }

    /* renamed from: b */
    public final List<Integer> mo83289b() {
        return C7525m.m23516h((Iterable<? extends T>) mo83287a());
    }

    public final int getItemCount() {
        return this.f83953b.size() + 1;
    }

    /* renamed from: a */
    public final void mo83288a(List<C32246j> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f83953b = list;
    }

    public final int getItemViewType(int i) {
        return C32143a.m104389b(i);
    }

    public IntereSelectAdapter(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "sizeListner");
        this.f83955d = bVar;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "vh");
        if (vVar instanceof InterestImageViewHolder) {
            int i2 = i - 1;
            ((InterestImageViewHolder) vVar).mo83293a((C32246j) this.f83953b.get(i2), mo83287a().contains(Integer.valueOf(i2)));
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ww, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…lect_text, parent, false)");
            return new InterestTextViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wv, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…ect_image, parent, false)");
        InterestImageViewHolder interestImageViewHolder = new InterestImageViewHolder(inflate2);
        interestImageViewHolder.mo83294a(this.f83957h);
        return interestImageViewHolder;
    }
}
