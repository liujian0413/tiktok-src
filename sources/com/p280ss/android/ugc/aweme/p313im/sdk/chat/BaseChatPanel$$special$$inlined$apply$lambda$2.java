package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.C31024d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$$special$$inlined$apply$lambda$2 */
public final class BaseChatPanel$$special$$inlined$apply$lambda$2 extends FrescoRecycleViewScrollListener {

    /* renamed from: a */
    final /* synthetic */ BaseChatPanel f80366a;

    BaseChatPanel$$special$$inlined$apply$lambda$2(Context context, BaseChatPanel baseChatPanel) {
        this.f80366a = baseChatPanel;
        super(context);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.f80366a.f80340g.mo80335d();
        }
        C31024d.m101254a(recyclerView, i);
    }
}
