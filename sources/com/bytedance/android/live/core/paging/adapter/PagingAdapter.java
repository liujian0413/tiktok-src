package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.C0053p;
import android.arch.paging.C0100h;
import android.arch.paging.PagedListAdapter;
import android.database.Observable;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2348h;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.network.NetworkStat.Status;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class PagingAdapter<T> extends PagedListAdapter<T, C1293v> {

    /* renamed from: a */
    public PagingViewModel<T> f9799a;

    /* renamed from: b */
    public Status f9800b = null;

    /* renamed from: c */
    public Status f9801c = null;

    /* renamed from: d */
    public boolean f9802d;

    /* renamed from: e */
    public boolean f9803e;

    /* renamed from: f */
    public boolean f9804f = true;

    /* renamed from: g */
    public boolean f9805g = true;

    /* renamed from: h */
    public boolean f9806h = true;

    /* renamed from: i */
    public final C3187a f9807i = new C3187a<>();

    /* renamed from: j */
    private final C0053p<C0100h<T>> f9808j = new C3191a(this);

    /* renamed from: k */
    private final C0053p<NetworkStat> f9809k = new C3192b(this);

    /* renamed from: l */
    private final C0053p<NetworkStat> f9810l = new C0053p<NetworkStat>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(NetworkStat networkStat) {
            if (networkStat != null) {
                PagingAdapter.this.f9801c = networkStat.f9754a;
                PagingAdapter.this.mo10074a(PagingAdapter.this.f9800b);
            }
        }
    };

    /* renamed from: m */
    private final C0053p<Boolean> f9811m = new C3193c(this);

    /* renamed from: n */
    private final C0053p<Boolean> f9812n = new C3194d(this);

    /* renamed from: o */
    private final C0053p<Integer> f9813o = new C3195e(this);

    /* renamed from: p */
    private boolean f9814p = false;

    /* renamed from: q */
    private boolean f9815q;

    /* renamed from: r */
    private final C3188b f9816r = new C3188b<>();

    public static class EndViewHolder extends C1293v {
        public EndViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.adapter.PagingAdapter$a */
    class C3187a extends Observable<C1264c> {
        /* renamed from: a */
        public final void mo10083a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5721a();
            }
        }

        C3187a() {
        }

        /* renamed from: a */
        private int m12116a(int i) {
            if (PagingAdapter.this.f9802d) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: a */
        public final void mo10084a(int i, int i2) {
            m12117a(i, i2, null);
        }

        /* renamed from: b */
        public final void mo10085b(int i, int i2) {
            int a = m12116a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5725b(a, i2);
            }
        }

        /* renamed from: c */
        public final void mo10086c(int i, int i2) {
            int a = m12116a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5726c(a, i2);
            }
        }

        /* renamed from: d */
        public final void mo10087d(int i, int i2) {
            int a = m12116a(i);
            int a2 = m12116a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5723a(a, a2, 1);
            }
        }

        /* renamed from: a */
        private void m12117a(int i, int i2, Object obj) {
            int a = m12116a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5724a(a, i2, (Object) null);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.adapter.PagingAdapter$b */
    class C3188b extends C1264c {
        /* renamed from: a */
        public final void mo5721a() {
            PagingAdapter.this.f9807i.mo10083a();
        }

        C3188b() {
        }

        /* renamed from: b */
        public final void mo5725b(int i, int i2) {
            PagingAdapter.this.f9807i.mo10085b(i, i2);
        }

        /* renamed from: c */
        public final void mo5726c(int i, int i2) {
            PagingAdapter.this.f9807i.mo10086c(i, i2);
        }

        /* renamed from: a */
        public final void mo5722a(int i, int i2) {
            PagingAdapter.this.f9807i.mo10084a(i, i2);
        }

        /* renamed from: a */
        public final void mo5723a(int i, int i2, int i3) {
            PagingAdapter.this.f9807i.mo10087d(i, i2);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.adapter.PagingAdapter$c */
    static class C3189c extends C1293v {

        /* renamed from: a */
        private PagingViewModel f9820a;

        /* renamed from: b */
        private View f9821b;

        /* renamed from: c */
        private TextView f9822c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo10088a(View view) {
            this.f9820a.mo10116c();
        }

        /* renamed from: a */
        public final void mo10089a(boolean z) {
            NetworkStat networkStat = (NetworkStat) this.f9820a.f9871c.getValue();
            View findViewById = this.itemView.findViewById(R.id.dap);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (networkStat == null || !networkStat.mo10026b() || !z) {
                layoutParams.height = -2;
                this.f9821b.setVisibility(8);
                this.f9822c.setTextColor(this.f9822c.getResources().getColor(R.color.agq));
                this.f9822c.setText(R.string.ef0);
            } else {
                layoutParams.height = -1;
                this.f9821b.setVisibility(0);
                this.f9822c.setTextColor(this.f9822c.getResources().getColor(R.color.agt));
                this.f9822c.setText(R.string.ef6);
            }
            findViewById.setLayoutParams(layoutParams);
            this.itemView.setOnClickListener(new C3196f(this));
        }

        C3189c(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f9820a = pagingViewModel;
            this.f9821b = view.findViewById(R.id.afl);
            this.f9822c = (TextView) view.findViewById(R.id.afo);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.adapter.PagingAdapter$d */
    static class C3190d extends C1293v {
        C3190d(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10064a() {
        return R.layout.am5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10065a(int i, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1293v mo10066a(ViewGroup viewGroup, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10077a(Boolean bool) {
        if (bool != null) {
            m12087b(bool.booleanValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10078a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() < getItemCount()) {
            notifyItemChanged(num.intValue());
        }
    }

    /* renamed from: c */
    private int mo14521c() {
        return super.getItemCount();
    }

    /* renamed from: d */
    private boolean mo14523d() {
        if (this.f9803e || !this.f9815q || !this.f9806h) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean mo14524e() {
        if (this.f9800b == Status.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean mo14525f() {
        if (this.f9800b == Status.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean mo14519b() {
        if (!this.f9803e || !this.f9804f || this.f9802d) {
            return false;
        }
        return true;
    }

    public final int getItemCount() {
        boolean z = this.f9802d;
        boolean d = mo14523d();
        boolean b = mo14519b();
        boolean g = mo14526g();
        return (z ? 1 : 0) + mo14521c() + (d ? 1 : 0) + (g ? 1 : 0) + (b ? 1 : 0);
    }

    /* renamed from: g */
    private boolean mo14526g() {
        if (mo14523d() || !this.f9805g || this.f9801c == null) {
            return false;
        }
        if (this.f9801c == Status.SUCCESS) {
            if (mo14524e() || mo14525f()) {
                return true;
            }
            return false;
        } else if (this.f9801c == Status.FAILED) {
            return mo14525f();
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo10079b(int i) {
        return i - (this.f9802d ? 1 : 0);
    }

    public void registerAdapterDataObserver(C1264c cVar) {
        this.f9807i.registerObserver(cVar);
    }

    public void unregisterAdapterDataObserver(C1264c cVar) {
        this.f9807i.unregisterObserver(cVar);
    }

    /* renamed from: b */
    private void m12087b(boolean z) {
        if (this.f9803e != z) {
            this.f9803e = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    private T mo14520c(int i) {
        if (i < 0 || i >= mo14521c()) {
            return null;
        }
        return super.mo153a(i);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof BaseViewHolder) {
            ((BaseViewHolder) vVar).mo10320c();
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof BaseViewHolder) {
            ((BaseViewHolder) vVar).mo10321d();
        }
    }

    public void onViewRecycled(C1293v vVar) {
        if (vVar instanceof BaseViewHolder) {
            ((BaseViewHolder) vVar).mo10317a();
        }
    }

    /* renamed from: a */
    private void mo14518a(boolean z) {
        if (this.f9815q == z || this.f9803e) {
            this.f9815q = z;
            return;
        }
        this.f9815q = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public T mo153a(int i) {
        int c = mo14521c() + (this.f9802d ? 1 : 0);
        if (this.f9802d && i == 0) {
            return null;
        }
        if (mo14526g() && i == c) {
            return null;
        }
        if (mo14523d() && i == c) {
            return null;
        }
        if (!mo14519b() || i != c) {
            return mo14520c(mo10079b(i));
        }
        return null;
    }

    protected PagingAdapter(C1147c<T> cVar) {
        super(cVar);
        super.registerAdapterDataObserver(this.f9816r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10073a(C1293v vVar) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) vVar.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo10081b(Boolean bool) {
        boolean z;
        if (bool == null || bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        mo14518a(z);
    }

    public final int getItemViewType(int i) {
        int itemCount = getItemCount() - 1;
        if (mo14519b() && i == 0) {
            return -1091641683;
        }
        if (this.f9802d && i == 0) {
            return -559038738;
        }
        if (!mo14526g() || i != itemCount) {
            if (mo14523d() && i == itemCount) {
                return -559038737;
            }
            int b = mo10079b(i);
            if (b >= mo14521c()) {
                return -8888;
            }
            return mo10065a(b, (T) mo14520c(b));
        } else if (mo14525f()) {
            return -1091576149;
        } else {
            return -1091576148;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10074a(Status status) {
        boolean z = this.f9814p;
        this.f9800b = status;
        boolean g = mo14526g();
        int c = mo14521c();
        if (!z && g) {
            notifyItemInserted(c);
        } else if (z && !g) {
            notifyItemRemoved(getItemCount());
        } else if (z && g) {
            notifyItemRemoved(c);
            notifyItemInserted(c);
        }
        this.f9814p = g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10075a(NetworkStat networkStat) {
        if (networkStat != null) {
            mo10074a(networkStat.f9754a);
        }
    }

    /* renamed from: a */
    public final void mo10076a(PagingViewModel<T> pagingViewModel) {
        if (this.f9799a != null) {
            this.f9799a.f9875g.removeObserver(this.f9808j);
            this.f9799a.f9870b.removeObserver(this.f9809k);
            this.f9799a.f9871c.removeObserver(this.f9810l);
            this.f9799a.f9873e.removeObserver(this.f9811m);
            this.f9799a.f9872d.removeObserver(this.f9812n);
            this.f9799a.f9874f.removeObserver(this.f9813o);
        }
        this.f9799a = pagingViewModel;
        if (pagingViewModel != null) {
            pagingViewModel.f9875g.observeForever(this.f9808j);
            pagingViewModel.f9870b.observeForever(this.f9809k);
            pagingViewModel.f9871c.observeForever(this.f9810l);
            pagingViewModel.f9873e.observeForever(this.f9811m);
            pagingViewModel.f9872d.observeForever(this.f9812n);
            pagingViewModel.f9874f.observeForever(this.f9813o);
        }
    }

    /* renamed from: b */
    private void m12086b(C1293v vVar, int i) {
        mo10073a(vVar);
    }

    /* renamed from: c */
    private void m12091c(C1293v vVar, int i) {
        mo10073a(vVar);
    }

    /* renamed from: d */
    private void m12093d(C1293v vVar, int i) {
        mo10073a(vVar);
    }

    /* renamed from: d */
    private static C1293v m12092d(ViewGroup viewGroup, int i) {
        throw new RuntimeException("create your header view holder");
    }

    /* renamed from: e */
    private C1293v m12095e(ViewGroup viewGroup, int i) {
        return new EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(mo10064a(), viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1293v mo10082c(ViewGroup viewGroup, int i) {
        return new EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.am6, viewGroup, false));
    }

    /* renamed from: e */
    private void m12096e(C1293v vVar, int i) {
        boolean z;
        mo10073a(vVar);
        if (!(vVar instanceof C3190d) && (vVar instanceof C3189c)) {
            C3189c cVar = (C3189c) vVar;
            if (this.f9803e || mo14521c() == 0) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo10089a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1293v mo10080b(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C3190d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.am8, viewGroup, false));
        }
        if (i == -1091576149) {
            return new C3189c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.am7, viewGroup, false), this.f9799a);
        }
        throw new RuntimeException("unknown footer type");
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == -559038738) {
            m12091c(vVar, i);
        } else if (itemViewType == -559038737) {
            m12093d(vVar, i);
        } else if (itemViewType == -1091576148 || itemViewType == -1091576149) {
            m12096e(vVar, i);
        } else if (itemViewType == -1091641683) {
            m12086b(vVar, i);
        } else {
            mo10067a(vVar, i);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -559038738) {
            return m12092d(viewGroup, i);
        }
        if (i == -559038737) {
            return mo10082c(viewGroup, i);
        }
        if (i == -1091576148 || i == -1091576149) {
            return mo10080b(viewGroup, i);
        }
        if (i == -1091641683) {
            return m12095e(viewGroup, i);
        }
        return mo10066a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10067a(C1293v vVar, int i) {
        if (vVar instanceof BaseViewHolder) {
            Object a = mo153a(i);
            if (a instanceof C2348h) {
                ((BaseViewHolder) vVar).mo10072a(BaseViewHolder.m12678a(((C2348h) a).f7712a), i);
            } else {
                ((BaseViewHolder) vVar).mo10072a(a, i);
            }
            if (((BaseViewHolder) vVar).mo10319b()) {
                mo10073a(vVar);
            }
        }
    }
}
