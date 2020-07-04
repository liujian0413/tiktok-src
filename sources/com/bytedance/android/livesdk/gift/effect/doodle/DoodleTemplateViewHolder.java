package com.bytedance.android.livesdk.gift.effect.doodle;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class DoodleTemplateViewHolder extends C1293v {

    /* renamed from: a */
    public C7996n f21637a;

    /* renamed from: b */
    private Context f21638b;

    /* renamed from: c */
    private View f21639c;

    /* renamed from: d */
    private HSImageView f21640d;

    public DoodleTemplateViewHolder(View view) {
        super(view);
        this.f21639c = view;
        this.f21638b = view.getContext();
        this.f21640d = (HSImageView) view.findViewById(R.id.dh1);
    }

    /* renamed from: a */
    public final void mo20870a(final DoodleTemplate doodleTemplate) {
        C5343e.m17038a(this.f21640d, doodleTemplate.image);
        this.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (DoodleTemplateViewHolder.this.f21637a != null) {
                    DoodleTemplateViewHolder.this.f21637a.mo20877a(DoodleTemplateViewHolder.this, doodleTemplate);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo20871a(boolean z) {
        float f;
        int i;
        if (this.f21639c != null && this.f21640d != null) {
            HSImageView hSImageView = this.f21640d;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.75f;
            }
            hSImageView.setAlpha(f);
            View view = this.f21639c;
            if (z) {
                i = R.drawable.bp8;
            } else {
                i = R.drawable.bp9;
            }
            view.setBackgroundResource(i);
        }
    }
}
