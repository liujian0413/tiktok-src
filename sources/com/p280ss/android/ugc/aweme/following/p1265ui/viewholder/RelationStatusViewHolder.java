package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.following.model.C29573h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder */
public final class RelationStatusViewHolder extends JediSimpleViewHolder<C29573h> {

    /* renamed from: g */
    public static final C29799a f78351g = new C29799a(null);

    /* renamed from: f */
    public final Context f78352f;

    /* renamed from: j */
    private final DmtStatusView f78353j = ((DmtStatusView) this.itemView.findViewById(R.id.dav));

    /* renamed from: k */
    private final C10803a f78354k;

    /* renamed from: l */
    private boolean f78355l;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$a */
    public static final class C29799a {
        private C29799a() {
        }

        public /* synthetic */ C29799a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$b */
    static final class C29800b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RelationStatusViewHolder f78356a;

        /* renamed from: b */
        final /* synthetic */ C29573h f78357b;

        C29800b(RelationStatusViewHolder relationStatusViewHolder, C29573h hVar) {
            this.f78356a = relationStatusViewHolder;
            this.f78357b = hVar;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f78357b.f77944a == 9) {
                i = 13;
            } else {
                i = 14;
            }
            if (this.f78357b.f77944a == 9) {
                str = "following";
            } else {
                str = "fans";
            }
            this.f78356a.f78352f.startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(this.f78356a.f78352f, 0, i, "", str));
        }
    }

    /* renamed from: p */
    private final int m97553p() {
        switch (((C29573h) mo29309o()).f77944a) {
            case 7:
                if (!((C29573h) mo29309o()).f77945b) {
                    return R.string.fil;
                }
                break;
            case 8:
                if (((C29573h) mo29309o()).f77945b) {
                    return R.string.fi7;
                }
                return R.string.fin;
        }
        return R.string.fi9;
    }

    /* renamed from: q */
    private final int m97554q() {
        switch (((C29573h) mo29309o()).f77944a) {
            case 7:
                if (!((C29573h) mo29309o()).f77945b) {
                    return R.string.fik;
                }
                break;
            case 8:
                if (((C29573h) mo29309o()).f77945b) {
                    return R.string.fi6;
                }
                return R.string.fim;
        }
        return R.string.fi8;
    }

    public RelationStatusViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a22, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…           parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        C7573i.m23582a((Object) context, "parent.context");
        this.f78352f = context;
        C10803a a = C10803a.m31631a(viewGroup.getContext());
        C7573i.m23582a((Object) a, "DmtStatusView.Builder.cr…ltBuilder(parent.context)");
        this.f78354k = a;
        this.f78355l = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C29573h hVar) {
        C7573i.m23587b(hVar, "item");
        switch (hVar.f77944a) {
            case 7:
            case 8:
                C10805b bVar = new C10806a(this.f78352f).mo25985a((int) R.drawable.b7d).mo25990b(m97554q()).mo25993c(m97553p()).f29135a;
                if (this.f78355l) {
                    this.f78354k.mo25961a(bVar);
                    this.f78355l = false;
                }
                DmtStatusView dmtStatusView = this.f78353j;
                C7573i.m23582a((Object) dmtStatusView, "mStatusView");
                LayoutParams layoutParams = dmtStatusView.getLayoutParams();
                layoutParams.height = (int) C9738o.m28708b(this.f78352f, 320.0f);
                DmtStatusView dmtStatusView2 = this.f78353j;
                C7573i.m23582a((Object) dmtStatusView2, "mStatusView");
                dmtStatusView2.setLayoutParams(layoutParams);
                break;
            case 9:
            case 10:
                View inflate = LayoutInflater.from(this.f78352f).inflate(R.layout.b48, null, false);
                this.f78354k.mo25963b(inflate);
                ((DmtTextView) inflate.findViewById(R.id.e8)).setOnClickListener(new C29800b(this, hVar));
                DmtStatusView dmtStatusView3 = this.f78353j;
                C7573i.m23582a((Object) dmtStatusView3, "mStatusView");
                LayoutParams layoutParams2 = dmtStatusView3.getLayoutParams();
                layoutParams2.height = (int) C9738o.m28708b(this.f78352f, 155.0f);
                DmtStatusView dmtStatusView4 = this.f78353j;
                C7573i.m23582a((Object) dmtStatusView4, "mStatusView");
                dmtStatusView4.setLayoutParams(layoutParams2);
                break;
        }
        this.f78353j.setBuilder(this.f78354k);
        this.f78353j.mo25939d();
        this.f78353j.mo25943g();
    }
}
