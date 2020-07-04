package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class PKExpandCollapseViewHolder extends C1293v {

    /* renamed from: a */
    public int f13789a;

    /* renamed from: b */
    public C4840a f13790b;

    /* renamed from: c */
    private final TextView f13791c;

    /* renamed from: d */
    private final ImageView f13792d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.viewholder.PKExpandCollapseViewHolder$a */
    public interface C4840a {
        /* renamed from: a */
        void mo12246a(int i);
    }

    /* renamed from: a */
    public final void mo12811a(String str, int i) {
        this.f13791c.setText(str);
        this.f13792d.setImageResource(i);
    }

    public PKExpandCollapseViewHolder(View view, C4840a aVar, int i) {
        super(view);
        this.f13791c = (TextView) view.findViewById(R.id.ah4);
        this.f13792d = (ImageView) view.findViewById(R.id.ah3);
        this.f13790b = aVar;
        this.f13789a = i;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PKExpandCollapseViewHolder.this.f13790b.mo12246a(PKExpandCollapseViewHolder.this.f13789a);
            }
        });
    }
}
