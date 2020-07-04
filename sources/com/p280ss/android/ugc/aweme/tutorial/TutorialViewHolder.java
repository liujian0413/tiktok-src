package com.p280ss.android.ugc.aweme.tutorial;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialViewHolder */
public final class TutorialViewHolder extends C1293v {

    /* renamed from: a */
    public final C7562b<C42665a, C7581n> f110894a;

    /* renamed from: b */
    private final RemoteImageView f110895b;

    /* renamed from: c */
    private final TextView f110896c;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialViewHolder$a */
    public static final class C42659a extends C42939as {

        /* renamed from: a */
        final /* synthetic */ TutorialViewHolder f110897a;

        /* renamed from: b */
        final /* synthetic */ C42665a f110898b;

        /* renamed from: a */
        public final void mo70606a(View view) {
            this.f110897a.f110894a.invoke(this.f110898b);
        }

        C42659a(TutorialViewHolder tutorialViewHolder, C42665a aVar) {
            this.f110897a = tutorialViewHolder;
            this.f110898b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo104269a(C42665a aVar) {
        C7573i.m23587b(aVar, "tutorial");
        C23323e.m76524b(this.f110895b, aVar.f110914b);
        this.f110896c.setText(aVar.f110915c);
        this.f110895b.setOnClickListener(new C42659a(this, aVar));
    }

    public TutorialViewHolder(View view, C7562b<? super C42665a, C7581n> bVar) {
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(bVar, "onClickListener");
        super(view);
        this.f110894a = bVar;
        View findViewById = view.findViewById(R.id.a51);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.….creation_tutorial_cover)");
        this.f110895b = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.a54);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.….creation_tutorial_title)");
        this.f110896c = (TextView) findViewById2;
    }
}
