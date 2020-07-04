package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27636g;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.SelfEmojiViewHolder */
public class SelfEmojiViewHolder extends C1293v {

    /* renamed from: a */
    public OnClickListener f80748a;

    /* renamed from: b */
    private RemoteImageView f80749b = ((RemoteImageView) this.itemView.findViewById(R.id.b_c));

    /* renamed from: c */
    private ImageView f80750c = ((ImageView) this.itemView.findViewById(R.id.vi));

    /* renamed from: a */
    private void m100478a(Emoji emoji) {
        if (C27507a.m90163c(emoji)) {
            C27636g.m90607a(this.f80749b, emoji.getAnimateUrl());
        } else {
            C23323e.m76524b(this.f80749b, emoji.getAnimateUrl());
        }
    }

    public SelfEmojiViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2y, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo80710a(Emoji emoji, int i, int i2) {
        if (i2 == 0) {
            this.f80750c.setVisibility(8);
        } else if (2 == i2) {
            this.f80750c.setVisibility(0);
            this.f80750c.setSelected(false);
        } else if (1 == i2) {
            this.f80750c.setVisibility(0);
            this.f80750c.setSelected(true);
        }
        this.f80750c.setOnClickListener(this.f80748a);
        this.f80749b.setOnClickListener(this.f80748a);
        this.f80750c.setTag(Integer.valueOf(i));
        this.f80749b.setTag(Integer.valueOf(i));
        m100478a(emoji);
    }
}
