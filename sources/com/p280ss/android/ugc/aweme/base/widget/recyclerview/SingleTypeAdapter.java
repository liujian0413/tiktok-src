package com.p280ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.SingleTypeAdapter */
public class SingleTypeAdapter<B extends C23360e, V extends C23359d> extends C1262a<BaseViewHolder> {

    /* renamed from: a */
    private Constructor<V> f62091a;

    /* renamed from: b */
    private final List<B> f62092b;

    /* renamed from: c */
    private final Context f62093c;

    public long getItemId(int i) {
        return 0;
    }

    public int getItemCount() {
        if (this.f62092b != null) {
            return this.f62092b.size();
        }
        return 0;
    }

    /* renamed from: a */
    private V m77261a() {
        try {
            return (C23359d) this.f62091a.newInstance(new Object[]{this.f62093c});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23359d a = m77261a();
        a.create(this.f62093c, viewGroup);
        return new BaseViewHolder(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        baseViewHolder.f62080a.bind((C23360e) this.f62092b.get(i));
    }
}
