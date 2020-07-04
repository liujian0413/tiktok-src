package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.view.MotionEvent;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.FloatingBarItemDecoration;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$initViews$$inlined$apply$lambda$2 */
public final class BaseSelectFragment$initViews$$inlined$apply$lambda$2 implements C1280l {

    /* renamed from: a */
    final /* synthetic */ BaseSelectFragment f83176a;

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(motionEvent, "motionEvent");
    }

    BaseSelectFragment$initViews$$inlined$apply$lambda$2(BaseSelectFragment baseSelectFragment) {
        this.f83176a = baseSelectFragment;
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(motionEvent, "motionEvent");
        FloatingBarItemDecoration floatingBarItemDecoration = this.f83176a.f83158l;
        if (floatingBarItemDecoration == null || !floatingBarItemDecoration.f82726c) {
            return false;
        }
        if (motionEvent.getY() < C9738o.m28708b(recyclerView.getContext(), 32.0f)) {
            return true;
        }
        return false;
    }
}
