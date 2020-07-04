package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27592i;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27601o;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27508b;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C30570e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiPageAdapter */
public final class EmojiPageAdapter extends PagerAdapter {

    /* renamed from: a */
    public C30803b f80731a;

    /* renamed from: b */
    public C30570e f80732b;

    /* renamed from: c */
    private C27523g f80733c;

    /* renamed from: d */
    private SwipeControlledViewPager f80734d;

    /* renamed from: e */
    private C27592i f80735e = new C27592i();

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f80733c.mo70743f().mo70854e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View instantiateItem(final ViewGroup viewGroup, int i) {
        return this.f80735e.mo70834a(viewGroup, this.f80734d, i, this.f80733c, (C27601o) new C27601o() {
            /* renamed from: c */
            public final void mo70811c() {
            }

            /* renamed from: a */
            public final void mo70807a() {
                EmojiPageAdapter.this.f80731a.mo80323a(67);
            }

            /* renamed from: b */
            public final void mo70810b() {
                EmojiManagerActivity.m100455a(viewGroup.getContext());
            }

            /* renamed from: a */
            public final void mo70809a(String str) {
                EmojiPageAdapter.this.f80731a.mo80328a(str);
            }

            /* renamed from: a */
            public final void mo70808a(View view, C27517a aVar, int i) {
                C27508b.m90167a(aVar.f72559d);
                EmojiPageAdapter.this.f80732b.mo80324a(aVar);
            }
        });
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public EmojiPageAdapter(C30803b bVar, SwipeControlledViewPager swipeControlledViewPager, C27523g gVar) {
        this.f80734d = swipeControlledViewPager;
        this.f80731a = bVar;
        this.f80733c = gVar;
        this.f80732b = new C30570e(bVar, this.f80734d.getContext());
    }
}
