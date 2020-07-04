package com.bytedance.android.livesdk.chatroom.p220ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C4868ac;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter */
public class LuckyBoxSendAdapter extends C1262a<C5149b> implements OnClickListener {

    /* renamed from: a */
    private List<C4868ac> f15098a;

    /* renamed from: b */
    private LayoutInflater f15099b;

    /* renamed from: c */
    private C5148a f15100c;

    /* renamed from: d */
    private int f15101d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter$a */
    interface C5148a {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter$b */
    static class C5149b extends C1293v {

        /* renamed from: a */
        public View f15102a;

        /* renamed from: b */
        public HSImageView f15103b;

        /* renamed from: c */
        public TextView f15104c;

        /* renamed from: d */
        public TextView f15105d;

        /* renamed from: e */
        public View f15106e;

        /* renamed from: f */
        public View f15107f;

        C5149b(View view) {
            super(view);
            this.f15102a = view;
            this.f15103b = (HSImageView) view.findViewById(R.id.ay4);
            this.f15104c = (TextView) view.findViewById(R.id.title);
            this.f15105d = (TextView) view.findViewById(R.id.a7m);
            this.f15106e = view.findViewById(R.id.m5);
            this.f15107f = view.findViewById(R.id.lq);
        }
    }

    public int getItemCount() {
        if (this.f15098a != null) {
            return this.f15098a.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13382a(List<C4868ac> list) {
        this.f15098a = list;
        this.f15101d = 0;
        notifyDataSetChanged();
        list.get(this.f15101d);
    }

    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != this.f15101d) {
            int i = this.f15101d;
            this.f15101d = intValue;
            notifyItemChanged(i);
            notifyItemChanged(this.f15101d);
            this.f15098a.get(this.f15101d);
        }
    }

    LuckyBoxSendAdapter(LayoutInflater layoutInflater, C5148a aVar) {
        this.f15099b = layoutInflater;
        this.f15100c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5149b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5149b(this.f15099b.inflate(R.layout.axt, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5149b bVar, int i) {
        int i2;
        C4868ac acVar = (C4868ac) this.f15098a.get(i);
        bVar.f15102a.setTag(Integer.valueOf(i));
        bVar.f15102a.setOnClickListener(this);
        C5343e.m17038a(bVar.f15103b, acVar.f13930d);
        bVar.f15104c.setText(C3358ac.m12517a((int) R.string.fb2, Integer.valueOf(acVar.f13929c)));
        bVar.f15105d.setText(acVar.f13928b);
        View view = bVar.f15106e;
        int i3 = 8;
        if (this.f15101d == i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = bVar.f15107f;
        if (this.f15101d == i) {
            i3 = 0;
        }
        view2.setVisibility(i3);
    }
}
