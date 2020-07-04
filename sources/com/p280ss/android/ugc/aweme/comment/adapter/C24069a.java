package com.p280ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.p022v4.content.C0683b;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c.C35486a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.a */
public final class C24069a {

    /* renamed from: a */
    public static final C24069a f63674a = new C24069a();

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.a$a */
    static final class C24070a implements C35486a {

        /* renamed from: a */
        final /* synthetic */ View f63675a;

        /* renamed from: b */
        final /* synthetic */ Activity f63676b;

        /* renamed from: c */
        final /* synthetic */ C35481c f63677c;

        /* renamed from: d */
        final /* synthetic */ C24090a f63678d;

        /* renamed from: e */
        final /* synthetic */ Emoji f63679e;

        C24070a(View view, Activity activity, C35481c cVar, C24090a aVar, Emoji emoji) {
            this.f63675a = view;
            this.f63676b = activity;
            this.f63677c = cVar;
            this.f63678d = aVar;
            this.f63679e = emoji;
        }

        /* renamed from: a */
        public final void mo62392a() {
            this.f63677c.dismiss();
            C24090a aVar = this.f63678d;
            if (aVar != null) {
                aVar.mo62447a(this.f63679e);
            }
        }
    }

    private C24069a() {
    }

    /* renamed from: a */
    public static final void m78997a(View view, Emoji emoji, C24090a aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(emoji, "emoji");
        Context context = view.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            C35481c cVar = new C35481c(activity);
            cVar.f93102j = 0;
            cVar.f93104l = 200;
            cVar.f93105m = 200;
            cVar.setOutsideTouchable(true);
            cVar.mo90274e(C0683b.m2912c(view.getContext(), R.color.j_));
            cVar.setFocusable(true);
            int b = (int) C9738o.m28708b((Context) activity, 4.0f);
            cVar.f93100h = -b;
            cVar.f93095c = b;
            cVar.mo90263b(2, 13);
            cVar.f93094b = false;
            cVar.setBackgroundDrawable(new BitmapDrawable());
            cVar.mo90267c((int) R.string.b00);
            C24070a aVar2 = new C24070a(view, activity, cVar, aVar, emoji);
            cVar.f93107o = aVar2;
            cVar.mo90255a(view, 48);
        }
    }
}
