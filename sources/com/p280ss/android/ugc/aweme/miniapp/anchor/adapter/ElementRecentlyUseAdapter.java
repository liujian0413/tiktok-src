package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.ElementRecentlyUseAdapter */
public class ElementRecentlyUseAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    public MoreElementsActivity f87000a;

    /* renamed from: b */
    private List<MicroAppInfo> f87001b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.ElementRecentlyUseAdapter$ViewHolder */
    public class ViewHolder extends C1293v {

        /* renamed from: a */
        RemoteImageView f87002a;

        /* renamed from: b */
        DmtTextView f87003b;

        /* renamed from: a */
        public final void mo85450a(final MicroAppInfo microAppInfo) {
            String str;
            C23323e.m76514a(this.f87002a, microAppInfo.getIcon());
            this.f87003b.setText(microAppInfo.getName());
            String str2 = "mp_show";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "publish_anchor_point").mo59973a("mp_id", microAppInfo.getAppId());
            String str3 = "_param_for_special";
            if (microAppInfo.getType() == 1) {
                str = "micro_app";
            } else {
                str = "micro_game";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    IMiniAppService a = C7167b.m22380b().mo18647a();
                    C33471b a2 = new C33472a().mo85791b("publish_anchor_point").mo85792c("201014").mo85789a("recently").mo85790a();
                    a.openMiniApp((Context) ElementRecentlyUseAdapter.this.f87000a, a.addScene(a.setLaunchModeHostTask(microAppInfo.getSchema()), "201014"), a2);
                }
            });
        }

        private ViewHolder(View view) {
            super(view);
            this.f87002a = (RemoteImageView) view.findViewById(R.id.ad1);
            this.f87003b = (DmtTextView) view.findViewById(R.id.ad5);
        }
    }

    public int getItemCount() {
        if (this.f87001b == null) {
            return 0;
        }
        return this.f87001b.size();
    }

    public ElementRecentlyUseAdapter(MoreElementsActivity moreElementsActivity) {
        this.f87000a = moreElementsActivity;
    }

    /* renamed from: a */
    public final void mo85449a(List<MicroAppInfo> list) {
        this.f87001b.clear();
        this.f87001b.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t5, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (i >= 0 && i <= getItemCount() - 1) {
            viewHolder.mo85450a((MicroAppInfo) this.f87001b.get(i));
        }
    }
}
