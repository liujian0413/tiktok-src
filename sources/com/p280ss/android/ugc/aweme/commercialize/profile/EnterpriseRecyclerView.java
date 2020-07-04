package com.p280ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25767b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView */
public final class EnterpriseRecyclerView extends RecyclerView implements C25767b {

    /* renamed from: M */
    private C25036a f66055M;

    public EnterpriseRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C25036a getEnterTabManager() {
        return this.f66055M;
    }

    /* renamed from: n */
    public final boolean mo61102n() {
        return this.f66055M.f66069a;
    }

    public final void setEnterTabManager(C25036a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f66055M = aVar;
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f66055M = new C25036a();
    }

    public /* synthetic */ EnterpriseRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
