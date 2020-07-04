package com.bytedance.android.livesdk.admin;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.admin.p183a.C3887b;
import com.bytedance.android.livesdk.admin.p184b.C3891d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class MenuAdapter extends C1262a<C3884a> {

    /* renamed from: a */
    private Context f11605a;

    /* renamed from: b */
    private List<C3891d> f11606b;

    /* renamed from: com.bytedance.android.livesdk.admin.MenuAdapter$a */
    class C3884a extends C1293v {

        /* renamed from: a */
        TextView f11607a;

        /* renamed from: b */
        public C3891d f11608b;

        /* renamed from: a */
        public final void mo11423a(C3891d dVar) {
            this.f11608b = dVar;
            this.f11607a.setText(dVar.f11623c);
        }

        C3884a(View view) {
            super(view);
            this.f11607a = (TextView) view.findViewById(R.id.by0);
            this.f11607a.setOnClickListener(new OnClickListener(MenuAdapter.this) {
                public final void onClick(View view) {
                    C9097a.m27146a().mo22267a((Object) new C3887b(C3884a.this.f11608b.f11622b));
                }
            });
        }
    }

    public int getItemCount() {
        return this.f11606b.size();
    }

    public int getItemViewType(int i) {
        return ((C3891d) this.f11606b.get(i)).f11621a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C3884a aVar, int i) {
        aVar.mo11423a((C3891d) this.f11606b.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C3884a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f11605a).inflate(R.layout.aso, viewGroup, false);
        switch (i) {
            case 0:
                inflate.setBackgroundResource(R.drawable.buf);
                break;
            case 1:
                inflate.setBackgroundResource(R.drawable.buh);
                break;
            case 2:
                inflate.setBackgroundResource(R.drawable.bug);
                break;
            case 3:
                inflate.setBackgroundResource(R.drawable.bue);
                break;
            default:
                inflate.setBackgroundResource(R.drawable.buf);
                break;
        }
        return new C3884a(inflate);
    }
}
