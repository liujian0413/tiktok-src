package com.p280ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.SingleTypeAdapter */
public class SingleTypeAdapter<B extends C23360e, V extends C23359d> extends C1262a<BaseViewHolder> {

    /* renamed from: a */
    private Constructor<V> f56803a;

    /* renamed from: b */
    private final List<B> f56804b;

    /* renamed from: c */
    private final Context f56805c;

    public long getItemId(int i) {
        return 0;
    }

    public int getItemCount() {
        if (this.f56804b != null) {
            return this.f56804b.size();
        }
        return 0;
    }

    /* renamed from: a */
    private V m71282a() {
        try {
            return (C23359d) this.f56803a.newInstance(new Object[]{this.f56805c});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23359d a = m71282a();
        a.create(this.f56805c, viewGroup);
        return new BaseViewHolder(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        baseViewHolder.f56796a.bind((C23360e) this.f56804b.get(i));
    }
}
