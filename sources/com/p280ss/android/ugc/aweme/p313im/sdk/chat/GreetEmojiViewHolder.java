package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GreetEmojiViewHolder */
public final class GreetEmojiViewHolder extends C1293v {

    /* renamed from: a */
    public C7563m<? super View, ? super Integer, C7581n> f80377a;

    /* renamed from: b */
    private final RemoteImageView f80378b;

    public GreetEmojiViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wb, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.adx);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.emoji_iv)");
        this.f80378b = (RemoteImageView) findViewById;
        this.f80378b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ GreetEmojiViewHolder f80379a;

            {
                this.f80379a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C7563m<? super View, ? super Integer, C7581n> mVar = this.f80379a.f80377a;
                if (mVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    mVar.invoke(view, Integer.valueOf(this.f80379a.getAdapterPosition()));
                }
            }
        });
        ((C13438a) this.f80378b.getHierarchy()).mo32898b((int) R.drawable.bcy);
    }

    /* renamed from: a */
    public final void mo80413a(Emoji emoji, int i) {
        C7573i.m23587b(emoji, "emoji");
        C31892bd.m103615b(this.f80378b, emoji.getAnimateUrl());
    }
}
