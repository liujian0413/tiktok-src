package com.bytedance.android.live.broadcast.effect.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p136b.C2590b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveFilterAdapter extends C1262a<C2586b> {

    /* renamed from: a */
    private final int f8305a;

    /* renamed from: b */
    private List<FilterModel> f8306b;

    /* renamed from: c */
    private Context f8307c;

    /* renamed from: d */
    private int f8308d;

    /* renamed from: e */
    private C2585a f8309e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter$a */
    public interface C2585a {
        /* renamed from: a */
        void mo8810a(int i);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter$b */
    static class C2586b extends C1293v {

        /* renamed from: a */
        public final View f8310a;

        /* renamed from: b */
        public View f8311b;

        /* renamed from: c */
        public HSImageView f8312c;

        /* renamed from: d */
        public TextView f8313d;

        /* renamed from: e */
        private View f8314e;

        /* renamed from: a */
        public final void mo9208a() {
            this.f8314e.setVisibility(4);
        }

        /* renamed from: a */
        public final void mo9209a(FilterModel filterModel) {
            if (filterModel.getEffect() == null) {
                this.f8314e.setVisibility(4);
            } else if (filterModel.isNew()) {
                this.f8314e.setVisibility(0);
            } else {
                this.f8314e.setVisibility(4);
            }
        }

        C2586b(View view) {
            super(view);
            this.f8311b = view.findViewById(R.id.nh);
            this.f8312c = (HSImageView) view.findViewById(R.id.b6k);
            this.f8313d = (TextView) view.findViewById(R.id.dyg);
            this.f8310a = view.findViewById(R.id.b_w);
            this.f8314e = view.findViewById(R.id.b3h);
        }
    }

    public int getItemCount() {
        return this.f8306b.size();
    }

    /* renamed from: a */
    private static ImageModel m10639a(UrlModel urlModel) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUri(urlModel.getUri());
        imageModel.setUrls(urlModel.getUrlList());
        return imageModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2586b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2586b(LayoutInflater.from(this.f8307c).inflate(this.f8305a, viewGroup, false));
    }

    /* renamed from: b */
    private void m10642b(C2586b bVar, int i) {
        if (this.f8306b != null && this.f8306b.size() > i && ((FilterModel) this.f8306b.get(i)).getEffect() != null) {
            if (bVar != null) {
                bVar.mo9208a();
            }
            ((FilterModel) this.f8306b.get(i)).setNew(false);
            C2624k.m10736a().mo9264a(((FilterModel) this.f8306b.get(i)).getEffect().getId(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2586b r7, int r8) {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.live.broadcast.effect.model.FilterModel> r0 = r6.f8306b
            java.lang.Object r0 = r0.get(r8)
            com.bytedance.android.live.broadcast.effect.model.FilterModel r0 = (com.bytedance.android.live.broadcast.effect.model.FilterModel) r0
            int r1 = r6.f8308d
            r2 = 1
            r3 = 0
            if (r8 != r1) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            android.view.View r4 = r7.f8311b
            if (r1 == 0) goto L_0x0017
            r5 = 0
            goto L_0x0018
        L_0x0017:
            r5 = 4
        L_0x0018:
            r4.setVisibility(r5)
            if (r1 == 0) goto L_0x0030
            android.widget.TextView r1 = r7.f8313d
            android.content.Context r4 = r6.f8307c
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101160(0x7f0605e8, float:1.7814722E38)
            int r4 = r4.getColor(r5)
            r1.setTextColor(r4)
            goto L_0x0042
        L_0x0030:
            android.widget.TextView r1 = r7.f8313d
            android.content.Context r4 = r6.f8307c
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101161(0x7f0605e9, float:1.7814724E38)
            int r4 = r4.getColor(r5)
            r1.setTextColor(r4)
        L_0x0042:
            int r1 = r0.getFilterType()
            r4 = 8
            switch(r1) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x008a;
                case 2: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x00eb
        L_0x004d:
            com.bytedance.android.live.core.widget.HSImageView r1 = r7.f8312c
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.getEffect()
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.getIconUrl()
            com.bytedance.android.live.base.model.ImageModel r2 = m10639a(r2)
            com.bytedance.android.live.core.utils.C3393m.m12633b(r1, r2)
            android.widget.TextView r1 = r7.f8313d
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.getEffect()
            java.lang.String r2 = r2.getName()
            r1.setText(r2)
            com.bytedance.android.live.broadcast.effect.k r1 = com.bytedance.android.live.broadcast.effect.C2624k.m10736a()
            boolean r1 = r1.mo9271c(r0)
            if (r1 == 0) goto L_0x007b
            android.view.View r1 = r7.f8310a
            r1.setVisibility(r3)
            goto L_0x0080
        L_0x007b:
            android.view.View r1 = r7.f8310a
            r1.setVisibility(r4)
        L_0x0080:
            boolean r1 = r0.isNew()
            if (r1 == 0) goto L_0x00e8
            r7.mo9209a(r0)
            goto L_0x00eb
        L_0x008a:
            com.bytedance.android.live.core.widget.HSImageView r1 = r7.f8312c
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r2 = r0.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.utils.C3358ac.m12524c(r2)
            r1.setImageDrawable(r2)
            android.widget.TextView r1 = r7.f8313d
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r0 = r0.getLocalFilter()
            java.lang.String r0 = r0.getName()
            r1.setText(r0)
            android.view.View r0 = r7.f8310a
            r0.setVisibility(r4)
            goto L_0x00e8
        L_0x00ae:
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.START_LIVE_STYLE
            java.lang.Object r1 = r1.mo10240a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x00c5
            com.bytedance.android.live.core.widget.HSImageView r1 = r7.f8312c
            r2 = 2131234887(0x7f081047, float:1.8085952E38)
            r1.setImageResource(r2)
            goto L_0x00d6
        L_0x00c5:
            com.bytedance.android.live.core.widget.HSImageView r1 = r7.f8312c
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r2 = r0.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.utils.C3358ac.m12524c(r2)
            r1.setImageDrawable(r2)
        L_0x00d6:
            android.widget.TextView r1 = r7.f8313d
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r0 = r0.getLocalFilter()
            java.lang.String r0 = r0.getName()
            r1.setText(r0)
            android.view.View r0 = r7.f8310a
            r0.setVisibility(r4)
        L_0x00e8:
            r7.mo9208a()
        L_0x00eb:
            android.view.View r0 = r7.itemView
            com.bytedance.android.live.broadcast.effect.adapter.a r1 = new com.bytedance.android.live.broadcast.effect.adapter.a
            r1.<init>(r6, r8, r7)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.onBindViewHolder(com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter$b, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9207a(int i, C2586b bVar, View view) {
        if (this.f8309e != null) {
            this.f8308d = i;
            m10642b(bVar, i);
            this.f8309e.mo8810a(i);
            notifyDataSetChanged();
        }
    }

    public LiveFilterAdapter(Context context, List<FilterModel> list, C2585a aVar, C2590b bVar) {
        this.f8307c = context;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f8306b = list;
        this.f8308d = ((Integer) C8946b.f24361M.mo22117a()).intValue();
        this.f8309e = aVar;
        if (bVar == null || bVar.f8322a == -1) {
            this.f8305a = R.layout.asd;
        } else {
            this.f8305a = bVar.f8322a;
        }
    }
}
