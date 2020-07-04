package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppSearchAdapter */
public class MicroAppSearchAdapter extends ElementAdapter<MicroAppInfo, MicroAppSearchViewHolder> {

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppSearchAdapter$MicroAppSearchViewHolder */
    public static class MicroAppSearchViewHolder extends C1293v {

        /* renamed from: a */
        private RemoteImageView f87053a;

        /* renamed from: b */
        private DmtTextView f87054b;

        /* renamed from: c */
        private DmtTextView f87055c;

        MicroAppSearchViewHolder(View view) {
            super(view);
            this.f87053a = (RemoteImageView) view.findViewById(R.id.ad1);
            this.f87054b = (DmtTextView) view.findViewById(R.id.ad5);
            this.f87055c = (DmtTextView) view.findViewById(R.id.ad7);
        }

        /* renamed from: a */
        public final void mo85474a(MicroAppInfo microAppInfo) {
            String str;
            if (microAppInfo != null) {
                C23323e.m76514a(this.f87053a, microAppInfo.getIcon());
                this.f87054b.setText(microAppInfo.getName());
                this.f87055c.setText(microAppInfo.getSummary());
                String str2 = "mp_show";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "publish_anchor_point").mo59973a("mp_id", microAppInfo.getAppId());
                String str3 = "_param_for_special";
                if (microAppInfo.getType() == 1) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            }
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m107774a(viewGroup, i);
    }

    /* renamed from: a */
    private static MicroAppSearchViewHolder m107774a(ViewGroup viewGroup, int i) {
        return new MicroAppSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t1, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MicroAppSearchViewHolder microAppSearchViewHolder, int i) {
        super.onBindViewHolder(microAppSearchViewHolder, i);
        if (i >= 0 && i <= getItemCount() - 1) {
            microAppSearchViewHolder.mo85474a((MicroAppInfo) this.f86998a.get(i));
        }
    }
}
