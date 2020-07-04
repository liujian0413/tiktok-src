package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import com.bytedance.widget.C13031a;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.story.api.userstory.C41981a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.StoryHeaderViewHolder */
public class StoryHeaderViewHolder extends C1293v {

    /* renamed from: a */
    private C41981a f89370a;

    /* renamed from: b */
    private View f89371b;

    /* renamed from: c */
    private View f89372c;

    /* renamed from: a */
    public final void mo87021a() {
        int i;
        View view = this.f89372c;
        if (this.f89370a == null || !this.f89370a.mo103104b()) {
            i = 8;
        } else {
            i = 0;
        }
        C23487o.m77140a(view, i);
    }

    public StoryHeaderViewHolder(LinearLayout linearLayout, C41981a aVar, Fragment fragment) {
        super(linearLayout);
        this.f89371b = new Space(linearLayout.getContext());
        this.f89371b.setLayoutParams(new LayoutParams(-1, C23486n.m77122a(52.0d)));
        linearLayout.addView(this.f89371b);
        this.f89372c = aVar.mo103103a();
        linearLayout.addView(this.f89372c);
        this.f89370a = aVar;
        C13031a.f34476e.mo31608a(fragment, linearLayout).mo31605a((Widget) this.f89370a);
    }
}
