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
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter */
public final class MediumElementAdapter extends ElementAdapter<MediumInfo, C1293v> {

    /* renamed from: d */
    public static final C33318a f87026d = new C33318a(null);

    /* renamed from: c */
    public C39995a f87027c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter$MediumInfoViewHolder */
    public static final class MediumInfoViewHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f87028a;

        /* renamed from: b */
        public final DmtTextView f87029b;

        /* renamed from: c */
        public final DmtTextView f87030c;

        /* renamed from: d */
        public final Button f87031d;

        public MediumInfoViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.ad1);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.element_icon)");
            this.f87028a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ad5);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.element_name)");
            this.f87029b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ad7);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.element_summary)");
            this.f87030c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.pp);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.btn_anchor_game_add)");
            this.f87031d = (Button) findViewById4;
        }

        /* renamed from: a */
        public final void mo85462a(MediumInfo mediumInfo) {
            int i;
            long j;
            if (mediumInfo != null) {
                C23323e.m76524b(this.f87028a, mediumInfo.getPoster());
                this.f87029b.setText(mediumInfo.getName());
                DmtTextView dmtTextView = this.f87030c;
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

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter$RecommendHeaderViewHolder */
    public static final class RecommendHeaderViewHolder extends C1293v {
        public RecommendHeaderViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter$a */
    public static final class C33318a {
        private C33318a() {
        }

        public /* synthetic */ C33318a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter$b */
    static final class C33319b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumElementAdapter f87032a;

        /* renamed from: b */
        final /* synthetic */ MediumInfo f87033b;

        C33319b(MediumElementAdapter mediumElementAdapter, MediumInfo mediumInfo) {
            this.f87032a = mediumElementAdapter;
            this.f87033b = mediumInfo;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39995a aVar = this.f87032a.f87027c;
            if (aVar != null) {
                MediumInfo mediumInfo = this.f87033b;
                C7573i.m23582a((Object) mediumInfo, "info");
                aVar.mo85490a(mediumInfo);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter$c */
    static final class C33320c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumElementAdapter f87034a;

        /* renamed from: b */
        final /* synthetic */ MediumInfo f87035b;

        C33320c(MediumElementAdapter mediumElementAdapter, MediumInfo mediumInfo) {
            this.f87034a = mediumElementAdapter;
            this.f87035b = mediumInfo;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f87034a.f86999b != null) {
                this.f87034a.f86999b.mo85483a(this.f87035b);
            }
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        if (this.f86998a == null) {
            return 1;
        }
        return this.f86998a.size() + 1;
    }

    /* renamed from: a */
    public final void mo85461a(C39995a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f87027c = aVar;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (i >= 0 && i <= getItemCount() - 1 && (vVar instanceof MediumInfoViewHolder)) {
            MediumInfo mediumInfo = (MediumInfo) this.f86998a.get(i - 1);
            MediumInfoViewHolder mediumInfoViewHolder = (MediumInfoViewHolder) vVar;
            mediumInfoViewHolder.f87031d.setOnClickListener(new C33319b(this, mediumInfo));
            mediumInfoViewHolder.mo85462a(mediumInfo);
            vVar.itemView.setOnClickListener(new C33320c(this, mediumInfo));
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1293v vVar;
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t2, viewGroup, false);
                C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…nd_header, parent, false)");
                vVar = new RecommendHeaderViewHolder(inflate);
                break;
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t0, viewGroup, false);
                C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…nt_medium, parent, false)");
                vVar = new MediumInfoViewHolder(inflate2);
                break;
            default:
                vVar = null;
                break;
        }
        if (vVar == null) {
            C7573i.m23580a();
        }
        return vVar;
    }
}
