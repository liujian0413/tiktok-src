package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.EmojiPageAdapter */
public class EmojiPageAdapter extends PagerAdapter {

    /* renamed from: a */
    public C27524h f72660a;

    /* renamed from: b */
    public C27523g f72661b;

    /* renamed from: c */
    private C27592i f72662c = new C27592i(1);

    /* renamed from: d */
    private SwipeControlledViewPager f72663d;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getCount() {
        return this.f72661b.mo70743f().mo70854e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View instantiateItem(final ViewGroup viewGroup, int i) {
        return this.f72662c.mo70834a(viewGroup, this.f72663d, i, this.f72661b, (C27601o) new C27601o() {
            /* renamed from: c */
            public final void mo70811c() {
                EmojiPageAdapter.this.f72660a.mo63239a();
            }

            /* renamed from: a */
            public final void mo70807a() {
                EmojiPageAdapter.this.f72660a.mo63240a(67);
            }

            /* renamed from: b */
            public final void mo70810b() {
                Context context = viewGroup.getContext();
                if (context != null) {
                    SmartRouter.buildRoute(context, "//emoji_manager").open();
                }
            }

            /* renamed from: a */
            public final void mo70809a(String str) {
                EmojiPageAdapter.this.f72660a.mo63243a(str, 1);
            }

            /* renamed from: a */
            public final void mo70808a(View view, C27517a aVar, int i) {
                if (i == 4) {
                    EmojiPageAdapter.this.f72660a.mo63241a(view, aVar, i, ((C27515h) EmojiPageAdapter.this.f72661b.mo70743f().f72741a).f72555b.indexOf(aVar.f72559d));
                    return;
                }
                EmojiPageAdapter.this.f72660a.mo63241a(view, aVar, i, -1);
            }
        });
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public EmojiPageAdapter(C27524h hVar, C27523g gVar, SwipeControlledViewPager swipeControlledViewPager) {
        this.f72660a = hVar;
        this.f72661b = gVar;
        this.f72663d = swipeControlledViewPager;
    }
}
