package com.p280ss.android.ugc.aweme.comment.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout */
public abstract class ICommerceComtEggLayout extends FrameLayout {
    /* renamed from: a */
    public abstract void mo62617a();

    /* renamed from: a */
    public abstract void mo62618a(String str, Aweme aweme, String str2);

    public ICommerceComtEggLayout(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public ICommerceComtEggLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
    }

    public ICommerceComtEggLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }
}
