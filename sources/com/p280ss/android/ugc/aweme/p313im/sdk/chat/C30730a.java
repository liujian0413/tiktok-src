package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31001v.C31002a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.BaseViewHolder;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a */
abstract class C30730a extends C1262a<BaseViewHolder> implements C31002a {

    /* renamed from: a */
    protected RecyclerView f80472a;

    /* renamed from: b */
    public List<Message> f80473b;

    /* renamed from: c */
    private Set<C30915j> f80474c = new HashSet();

    C30730a() {
    }

    /* renamed from: a */
    public void mo18063a() {
        for (C30915j a : this.f80474c) {
            a.mo80475a(this.f80473b);
        }
    }

    /* renamed from: a */
    public void mo80426a(C30915j jVar) {
        this.f80474c.add(jVar);
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(BaseViewHolder baseViewHolder) {
        super.onViewDetachedFromWindow(baseViewHolder);
        baseViewHolder.mo81436e();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f80472a = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f80472a = null;
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
        baseViewHolder.mo81435d();
        m100106c(baseViewHolder);
    }

    /* renamed from: c */
    private void m100106c(BaseViewHolder baseViewHolder) {
        Message message = baseViewHolder.f81201i;
        if (message != null && !C6307b.m19566a((Collection<T>) this.f80473b) && message.equals(this.f80473b.get(0))) {
            for (C30915j a : this.f80474c) {
                a.mo80470a();
            }
        }
    }

    /* renamed from: a */
    public void mo18064a(Object obj, int i) {
        for (C30915j a : this.f80474c) {
            a.mo80475a(this.f80473b);
        }
    }
}
