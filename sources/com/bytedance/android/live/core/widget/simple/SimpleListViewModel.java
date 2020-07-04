package com.bytedance.android.live.core.widget.simple;

import android.arch.paging.C0100h.C0106d.C0107a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.C2348h;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.p145a.C3149e;
import com.bytedance.android.live.core.p145a.C3159o;
import com.bytedance.android.live.core.paging.adapter.DelegatePagingAdapter;
import com.bytedance.android.live.core.paging.adapter.DelegatePagingAdapter.C3184a;
import com.bytedance.android.live.core.paging.adapter.InvalidItemViewHolder;
import com.bytedance.android.live.core.paging.p151a.C3182d;
import com.bytedance.android.live.core.paging.p152b.C3199b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;

public abstract class SimpleListViewModel<T> extends PagingViewModel<T> implements C3184a<T>, C3199b<T> {

    /* renamed from: a */
    public C3422a<T> f10240a = new C3422a<>(this);

    /* renamed from: j */
    private List<C3424b<T>> f10241j = new ArrayList();

    /* renamed from: k */
    private C3145b<String, T> f10242k = new C3159o();

    /* renamed from: com.bytedance.android.live.core.widget.simple.SimpleListViewModel$a */
    class C3422a<T> extends DelegatePagingAdapter<T> {
        /* renamed from: a */
        public final void mo10073a(C1293v vVar) {
            super.mo10073a(vVar);
        }

        /* renamed from: a */
        public final T mo153a(int i) {
            return super.mo153a(i);
        }

        public final void onViewRecycled(C1293v vVar) {
            if (!(vVar instanceof BaseViewHolder)) {
                super.onViewRecycled(vVar);
            }
        }

        C3422a(C3184a<T> aVar) {
            super(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo10070a(T t, T t2) {
        return t == t2;
    }

    public SimpleListViewModel() {
        this.f10240a.mo10076a((PagingViewModel<T>) this);
    }

    /* renamed from: d */
    public final void mo10334d() {
        mo10109a(new C3182d().mo10054a((C3199b<V>) this).mo10052a(new C0107a().mo228a(false).mo227a(10).mo230b(5).mo229a()).mo10055a(C3159o.m11940a()).mo10053a(this.f10242k, new C3149e()).mo10063n());
    }

    /* renamed from: a */
    public final SimpleListViewModel mo10331a(RecyclerView recyclerView) {
        recyclerView.setAdapter(this.f10240a);
        return this;
    }

    /* renamed from: b */
    public final C3424b<T> mo10333b(T t) {
        for (C3424b<T> bVar : this.f10241j) {
            if (bVar.mo10350a(t)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final SimpleListViewModel<T> mo10332a(C3424b<T> bVar) {
        this.f10241j.add(bVar);
        return this;
    }

    /* renamed from: b */
    public final boolean mo10071b(T t, T t2) {
        return t.equals(t2);
    }

    /* renamed from: a */
    public final int mo10068a(int i, T t) {
        return this.f10241j.indexOf(mo10333b(t));
    }

    /* renamed from: a */
    public final C1293v mo10069a(ViewGroup viewGroup, int i) {
        try {
            final C1293v a = ((C3424b) this.f10241j.get(i)).mo10347a(viewGroup);
            a.itemView.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                    if (a instanceof BaseViewHolder) {
                        ((BaseViewHolder) a).mo10317a();
                    }
                    if (a instanceof SimpleViewHolder) {
                        Object e = ((SimpleViewHolder) a).mo10345e();
                        C3424b b = SimpleListViewModel.this.mo10333b(e);
                        if (b instanceof C3423a) {
                            ((C3423a) b).mo10348a((SimpleViewHolder) a, e);
                        }
                    }
                }

                public final void onViewAttachedToWindow(View view) {
                    if (a instanceof BaseViewHolder) {
                        int adapterPosition = a.getAdapterPosition();
                        if (adapterPosition >= 0) {
                            Object a = SimpleListViewModel.this.f10240a.mo153a(adapterPosition);
                            C3424b b = SimpleListViewModel.this.mo10333b(a);
                            if ((b instanceof C3423a) && (a instanceof SimpleViewHolder)) {
                                ((SimpleViewHolder) a).mo10344b(a);
                                ((C3423a) b).mo10349a((SimpleViewHolder) a, a, adapterPosition);
                            }
                            if (a instanceof C2348h) {
                                ((BaseViewHolder) a).mo10072a(BaseViewHolder.m12678a(((C2348h) a).f7712a), adapterPosition);
                            } else {
                                ((BaseViewHolder) a).mo10072a(a, adapterPosition);
                            }
                            if (((BaseViewHolder) a).mo10319b()) {
                                SimpleListViewModel.this.f10240a.mo10073a(a);
                            }
                        }
                    }
                }
            });
            return a;
        } catch (Exception unused) {
            return new InvalidItemViewHolder(viewGroup);
        }
    }
}
