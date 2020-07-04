package com.bytedance.android.live.core.widget.simple;

import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

public class SimpleViewHolder extends BaseViewHolder {

    /* renamed from: b */
    private SparseArray<View> f10246b = new SparseArray<>();

    /* renamed from: c */
    private Map<String, Object> f10247c = new HashMap();

    /* renamed from: a */
    public final void mo10072a(Object obj, int i) {
    }

    /* renamed from: e */
    public final <T> T mo10345e() {
        return this.f10247c.get("__________");
    }

    /* renamed from: b */
    public final void mo10344b(Object obj) {
        this.f10247c.put("__________", obj);
    }

    /* renamed from: b */
    public final SimpleViewHolder mo10343b(int i) {
        View a = mo10338a((int) R.id.bwx);
        if (a != null) {
            a.setVisibility(8);
        }
        return this;
    }

    public SimpleViewHolder(View view) {
        super(view);
        this.itemView.setTag(this);
    }

    /* renamed from: a */
    public final long mo10337a(String str) {
        Object obj = this.f10247c.get(str);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return 0;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException unused2) {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public final <V extends View> V mo10338a(int i) {
        V v = (View) this.f10246b.get(i);
        if (v != null) {
            return v;
        }
        V findViewById = this.itemView.findViewById(i);
        this.f10246b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo10342a(String str, Object obj) {
        this.f10247c.put(str, obj);
    }

    /* renamed from: a */
    public final SimpleViewHolder mo10339a(int i, OnClickListener onClickListener) {
        mo10338a((int) R.id.a6z).setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: a */
    public final SimpleViewHolder mo10340a(int i, CharSequence charSequence) {
        ((TextView) mo10338a((int) R.id.a7m)).setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public final SimpleViewHolder mo10341a(int i, String str) {
        ((TextView) mo10338a(i)).setText(str);
        return this;
    }
}
