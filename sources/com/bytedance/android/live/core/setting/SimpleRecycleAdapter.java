package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public abstract class SimpleRecycleAdapter<T> extends C1262a {

    /* renamed from: a */
    private List<T> f10070a;

    /* renamed from: b */
    protected Context f10071b;

    /* renamed from: c */
    private LayoutInflater f10072c;

    /* renamed from: d */
    private OnClickListener f10073d = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof SimpleViewHolder)) {
                SimpleViewHolder simpleViewHolder = (SimpleViewHolder) view.getTag();
                SimpleRecycleAdapter.this.mo10227a(simpleViewHolder, SimpleRecycleAdapter.this.mo10230a(simpleViewHolder.getPosition()), simpleViewHolder.getPosition());
            }
        }
    };

    /* renamed from: e */
    private OnLongClickListener f10074e = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof SimpleViewHolder)) {
                SimpleViewHolder simpleViewHolder = (SimpleViewHolder) view.getTag();
                SimpleRecycleAdapter.this.mo10230a(simpleViewHolder.getPosition());
                simpleViewHolder.getPosition();
            }
            return false;
        }
    };

    /* renamed from: a */
    public void mo10227a(SimpleViewHolder simpleViewHolder, T t, int i) {
    }

    /* renamed from: b */
    public abstract void mo10229b(SimpleViewHolder simpleViewHolder, T t, int i);

    public void onBindViewHolder(C1293v vVar, int i) {
    }

    public int getItemCount() {
        if (this.f10070a == null) {
            return 0;
        }
        return this.f10070a.size();
    }

    /* renamed from: a */
    public final T mo10230a(int i) {
        if (i < 0 || i >= this.f10070a.size()) {
            return null;
        }
        return this.f10070a.get(i);
    }

    public SimpleRecycleAdapter(Context context, List<T> list) {
        this.f10070a = list;
        this.f10072c = LayoutInflater.from(context);
        this.f10071b = context;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.f10072c.inflate(R.layout.arb, viewGroup, false);
        inflate.setOnClickListener(this.f10073d);
        inflate.setOnLongClickListener(this.f10074e);
        final SimpleViewHolder simpleViewHolder = new SimpleViewHolder(inflate);
        inflate.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewDetachedFromWindow(View view) {
                simpleViewHolder.mo10321d();
                simpleViewHolder.mo10317a();
            }

            public final void onViewAttachedToWindow(View view) {
                int adapterPosition = simpleViewHolder.getAdapterPosition();
                if (adapterPosition >= 0) {
                    Object a = SimpleRecycleAdapter.this.mo10230a(adapterPosition);
                    simpleViewHolder.mo10344b(a);
                    simpleViewHolder.mo10320c();
                    SimpleRecycleAdapter.this.mo10229b(simpleViewHolder, a, adapterPosition);
                }
            }
        });
        return simpleViewHolder;
    }
}
