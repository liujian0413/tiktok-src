package com.bytedance.android.livesdk.gift.effect.doodle;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class DoodleGiftViewHolder extends C1293v {

    /* renamed from: a */
    public C7996n f21630a;

    /* renamed from: b */
    private Context f21631b;

    /* renamed from: c */
    private View f21632c;

    /* renamed from: d */
    private View f21633d;

    /* renamed from: e */
    private HSImageView f21634e;

    /* renamed from: f */
    private TextView f21635f;

    /* renamed from: g */
    private TextView f21636g;

    /* renamed from: a */
    public final void mo20869a(boolean z) {
        int i;
        if (this.f21633d != null) {
            View view = this.f21633d;
            if (z) {
                i = R.drawable.bs0;
            } else {
                i = R.drawable.bs1;
            }
            view.setBackgroundResource(i);
        }
    }

    public DoodleGiftViewHolder(View view) {
        super(view);
        this.f21631b = view.getContext();
        this.f21632c = view;
        this.f21633d = view.findViewById(R.id.b3r);
        this.f21634e = (HSImageView) view.findViewById(R.id.a4g);
        this.f21635f = (TextView) view.findViewById(R.id.c33);
        this.f21636g = (TextView) view.findViewById(R.id.a8j);
        int a = C9051ar.m27033a(this.f21631b) / 4;
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo20867a(C8139f fVar) {
        if (fVar != null) {
            if (fVar.mo21277r().f22233d == -1) {
                this.itemView.setVisibility(8);
                return;
            }
            this.itemView.setVisibility(0);
            C5343e.m17038a(this.f21634e, fVar.mo21274o());
            if (fVar.mo21270k() != 0) {
                this.f21635f.setTextColor(fVar.mo21270k());
            }
            this.f21635f.setText(fVar.mo21269j());
            if (fVar.mo21272m() != 0) {
                this.f21636g.setTextColor(fVar.mo21272m());
            }
            this.f21636g.setText(this.f21631b.getString(R.string.eha, new Object[]{Integer.valueOf(fVar.mo21260a())}));
            this.f21632c.setOnClickListener(new C7995m(this, fVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20868a(C8139f fVar, View view) {
        if (this.f21630a != null) {
            this.f21630a.mo20877a(this, fVar);
        }
    }
}
