package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.C18857y;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.C47069c;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47078a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.m */
final class C47086m extends PagerAdapter {

    /* renamed from: a */
    final List<MediaEntity> f120833a = new ArrayList();

    /* renamed from: b */
    final Context f120834b;

    /* renamed from: c */
    final C47078a f120835c;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f120833a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118354a(List<MediaEntity> list) {
        this.f120833a.addAll(list);
        notifyDataSetChanged();
    }

    C47086m(Context context, C47078a aVar) {
        this.f120834b = context;
        this.f120835c = aVar;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C47069c cVar = new C47069c(this.f120834b);
        cVar.setSwipeToDismissCallback(this.f120835c);
        viewGroup.addView(cVar);
        Picasso.m61392a(this.f120834b).mo49979a(((MediaEntity) this.f120833a.get(i)).mediaUrlHttps).mo50095a((C18857y) cVar);
        return cVar;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
