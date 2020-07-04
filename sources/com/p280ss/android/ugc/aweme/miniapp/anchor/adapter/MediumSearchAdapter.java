package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import com.p280ss.android.ugc.aweme.shortvideo.p1577h.C39995a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter */
public final class MediumSearchAdapter extends ElementAdapter<MediumInfo, MediumSearchViewHolder> {

    /* renamed from: c */
    public C39995a f87036c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter$MediumSearchViewHolder */
    public static final class MediumSearchViewHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f87037a;

        /* renamed from: b */
        public final DmtTextView f87038b;

        /* renamed from: c */
        public final Button f87039c;

        /* renamed from: d */
        private final DmtTextView f87040d;

        public MediumSearchViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.ad1);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.element_icon)");
            this.f87037a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ad5);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.element_name)");
            this.f87038b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ad7);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.element_summary)");
            this.f87040d = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.pp);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.btn_anchor_game_add)");
            this.f87039c = (Button) findViewById4;
        }

        /* renamed from: a */
        public final void mo85466a(MediumInfo mediumInfo) {
            int i;
            long j;
            if (mediumInfo != null) {
                C23323e.m76524b(this.f87037a, mediumInfo.getPoster());
                this.f87038b.setText(mediumInfo.getName());
                DmtTextView dmtTextView = this.f87040d;
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                Context context = view.getContext();
                Object[] objArr = new Object[2];
                Integer type = mediumInfo.getType();
                if (type != null) {
                    i = type.intValue();
                } else {
                    i = -1;
                }
                objArr[0] = C41513aa.m132238a(i);
                Long playCnt = mediumInfo.getPlayCnt();
                if (playCnt != null) {
                    j = playCnt.longValue();
                } else {
                    j = 0;
                }
                objArr[1] = C30537o.m99738a(j);
                dmtTextView.setText(context.getString(R.string.c9_, objArr));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter$a */
    static final class C33321a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumSearchAdapter f87041a;

        /* renamed from: b */
        final /* synthetic */ MediumInfo f87042b;

        C33321a(MediumSearchAdapter mediumSearchAdapter, MediumInfo mediumInfo) {
            this.f87041a = mediumSearchAdapter;
            this.f87042b = mediumInfo;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39995a aVar = this.f87041a.f87036c;
            if (aVar != null) {
                MediumInfo mediumInfo = this.f87042b;
                C7573i.m23582a((Object) mediumInfo, "info");
                aVar.mo85490a(mediumInfo);
            }
        }
    }

    /* renamed from: a */
    public final void mo85465a(C39995a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f87036c = aVar;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m107761a(viewGroup, i);
    }

    /* renamed from: a */
    private static MediumSearchViewHolder m107761a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t0, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new MediumSearchViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MediumSearchViewHolder mediumSearchViewHolder, int i) {
        C7573i.m23587b(mediumSearchViewHolder, "holder");
        super.onBindViewHolder(mediumSearchViewHolder, i);
        MediumInfo mediumInfo = (MediumInfo) this.f86998a.get(i);
        mediumSearchViewHolder.f87039c.setOnClickListener(new C33321a(this, mediumInfo));
        mediumSearchViewHolder.mo85466a(mediumInfo);
    }
}
