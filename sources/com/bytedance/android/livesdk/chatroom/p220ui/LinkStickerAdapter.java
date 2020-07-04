package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkStickerAdapter */
public class LinkStickerAdapter extends C1262a<C5095b> {

    /* renamed from: a */
    public C5094a f14637a;

    /* renamed from: b */
    public String f14638b = "";

    /* renamed from: c */
    private List<C9355c> f14639c;

    /* renamed from: d */
    private int f14640d;

    /* renamed from: e */
    private int f14641e;

    /* renamed from: f */
    private OnClickListener f14642f = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag(R.id.ay4) instanceof C9355c) {
                C9355c cVar = (C9355c) view.getTag(R.id.ay4);
                if (!TextUtils.equals(LinkStickerAdapter.this.f14638b, cVar.f25577p)) {
                    LinkStickerAdapter.this.f14638b = cVar.f25577p;
                    LinkStickerAdapter.this.notifyDataSetChanged();
                    if (TextUtils.equals(LinkStickerAdapter.this.f14638b, "")) {
                        LinkStickerAdapter.this.f14637a.mo13236b(cVar);
                    } else if (cVar.f25582u) {
                        LinkStickerAdapter.this.f14637a.mo13236b(cVar);
                    } else {
                        if (!cVar.f25583v) {
                            LinkStickerAdapter.this.f14637a.mo13235a(cVar);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkStickerAdapter$a */
    interface C5094a {
        /* renamed from: a */
        void mo13235a(C9355c cVar);

        /* renamed from: b */
        void mo13236b(C9355c cVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkStickerAdapter$b */
    class C5095b extends C1293v {

        /* renamed from: a */
        View f14644a;

        /* renamed from: b */
        View f14645b;

        /* renamed from: c */
        View f14646c;

        /* renamed from: d */
        HSImageView f14647d;

        /* renamed from: e */
        View f14648e;

        C5095b(View view) {
            super(view);
            this.f14644a = view.findViewById(R.id.blb);
            this.f14645b = view.findViewById(R.id.ctg);
            this.f14646c = view.findViewById(R.id.k5);
            this.f14647d = (HSImageView) view.findViewById(R.id.ay4);
            this.f14648e = view.findViewById(R.id.btc);
        }
    }

    public int getItemCount() {
        if (this.f14639c == null) {
            return 0;
        }
        return this.f14639c.size();
    }

    /* renamed from: a */
    private C9355c m16435a(String str) {
        for (C9355c cVar : this.f14639c) {
            if (TextUtils.equals(str, cVar.f25577p)) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5095b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5095b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ax1, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5095b bVar, int i) {
        boolean z;
        C9355c cVar = (C9355c) this.f14639c.get(i);
        if (TextUtils.equals(cVar.f25577p, "")) {
            bVar.f14647d.setImageResource(R.drawable.c6g);
        } else {
            C5343e.m17038a(bVar.f14647d, cVar.f25562a.mo8251a());
        }
        if (TextUtils.equals(this.f14638b, cVar.f25577p)) {
            bVar.f14646c.setVisibility(0);
        } else {
            bVar.f14646c.setVisibility(8);
        }
        bVar.f14647d.setTag(R.id.ay4, cVar);
        bVar.f14647d.setOnClickListener(this.f14642f);
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        LayoutParams layoutParams = (LayoutParams) bVar.f14644a.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -1);
        }
        LayoutParams layoutParams2 = (LayoutParams) bVar.f14645b.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LayoutParams(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams3 = bVar.itemView.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            layoutParams.width = this.f14640d;
            layoutParams2.width = this.f14640d / 2;
        } else if (z2) {
            layoutParams.width = this.f14640d / 2;
            layoutParams2.width = this.f14640d;
        } else {
            layoutParams.width = this.f14640d / 2;
            layoutParams2.width = this.f14640d / 2;
        }
        layoutParams3.width = layoutParams.width + layoutParams2.width + this.f14641e;
        bVar.itemView.setLayoutParams(layoutParams3);
        bVar.f14644a.setLayoutParams(layoutParams);
        bVar.f14645b.setLayoutParams(layoutParams2);
        if (cVar.f25583v) {
            bVar.f14648e.setVisibility(0);
        } else {
            bVar.f14648e.setVisibility(8);
        }
    }

    LinkStickerAdapter(Context context, List<C9355c> list, C5094a aVar) {
        this.f14639c = list;
        this.f14637a = aVar;
        int a = C9738o.m28691a(context);
        this.f14641e = (int) C9738o.m28708b(context, 56.0f);
        this.f14640d = (a - (this.f14641e * 5)) / 6;
    }

    /* renamed from: a */
    public final void mo13233a(String str, C9355c cVar, int i) {
        if (C2418b.f7952c.equals(str)) {
            C9355c a = m16435a(cVar.f25577p);
            if (a != null) {
                if (i == 2) {
                    a.f25583v = false;
                    a.f25582u = true;
                    if (TextUtils.equals(a.f25577p, this.f14638b)) {
                        this.f14637a.mo13236b(a);
                    }
                } else if (i == 3) {
                    a.f25583v = false;
                } else if (i == 1) {
                    a.f25583v = true;
                }
                notifyDataSetChanged();
            }
        }
    }
}
