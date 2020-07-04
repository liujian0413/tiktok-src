package com.p280ss.android.ugc.aweme.discover.adapter;

import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.music.model.MusicTag;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicTagViewHolder */
public final class SearchMusicTagViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f69730a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchMusicTagViewHolder.class), "params", "getParams()Landroid/support/v7/widget/RecyclerView$LayoutParams;"))};

    /* renamed from: b */
    public TextView f69731b;

    /* renamed from: c */
    private final C7541d f69732c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicTagViewHolder$a */
    static final class C26451a extends Lambda implements C7561a<LayoutParams> {

        /* renamed from: a */
        final /* synthetic */ View f69733a;

        C26451a(View view) {
            this.f69733a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LayoutParams invoke() {
            int b = (int) C9738o.m28708b(this.f69733a.getContext(), 4.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, b, 0);
            return layoutParams;
        }
    }

    /* renamed from: a */
    private LayoutParams m87027a() {
        return (LayoutParams) this.f69732c.getValue();
    }

    /* renamed from: a */
    private static void m87028a(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C43070ds(view.getResources().getDimensionPixelOffset(R.dimen.kb)));
            view.setClipToOutline(true);
        }
    }

    public SearchMusicTagViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69732c = C7546e.m23569a(new C26451a(view));
        this.f69731b = (TextView) view.findViewById(R.id.c21);
    }

    /* renamed from: a */
    public final void mo68051a(MusicTag musicTag) {
        C7573i.m23587b(musicTag, "tag");
        if (!TextUtils.isEmpty(musicTag.getTagColor()) && !TextUtils.isEmpty(musicTag.getTagTitle())) {
            TextView textView = this.f69731b;
            if (textView != null) {
                textView.setText(musicTag.getTagTitle());
            }
            try {
                TextView textView2 = this.f69731b;
                if (textView2 != null) {
                    textView2.setBackgroundColor(Color.parseColor(musicTag.getTagColor()));
                }
                TextView textView3 = this.f69731b;
                if (textView3 != null) {
                    textView3.setTextColor(Color.parseColor(musicTag.getTagTitleColor()));
                }
            } catch (Exception unused) {
            }
            TextView textView4 = this.f69731b;
            if (textView4 != null) {
                textView4.setLayoutParams(m87027a());
            }
            if (this.f69731b != null) {
                TextView textView5 = this.f69731b;
                if (textView5 != null) {
                    m87028a((View) textView5);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
        }
    }
}
