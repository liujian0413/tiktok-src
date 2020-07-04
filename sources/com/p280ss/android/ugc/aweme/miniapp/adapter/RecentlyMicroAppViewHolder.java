package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppViewHolder */
public class RecentlyMicroAppViewHolder extends C1293v {

    /* renamed from: a */
    private TextView f86959a;

    /* renamed from: b */
    private TextView f86960b;

    /* renamed from: c */
    private RemoteImageView f86961c;

    RecentlyMicroAppViewHolder(View view) {
        super(view);
        m107696a(view);
    }

    /* renamed from: a */
    private void m107696a(View view) {
        this.f86959a = (TextView) view.findViewById(R.id.byp);
        this.f86961c = (RemoteImageView) view.findViewById(R.id.byh);
        this.f86960b = (TextView) view.findViewById(R.id.byj);
    }

    /* renamed from: a */
    static final /* synthetic */ void m107697a(MicroAppInfo microAppInfo, C33292a aVar, View view) {
        String str;
        C7167b.m22380b().mo18647a().openMiniApp(view.getContext(), microAppInfo, new C33472a().mo85791b("setting_page").mo85789a("recently").mo85792c("021001").mo85790a());
        aVar.mo85415a(microAppInfo.getAppId());
        String str2 = "mp_click";
        C22984d a = C22984d.m75611a().mo59973a("mp_id", microAppInfo.getAppId()).mo59973a("author_id", C21115b.m71197a().getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_inner");
        String str3 = "_param_for_special";
        if (microAppInfo.getType() == 1) {
            str = "micro_app";
        } else {
            str = "micro_game";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: a */
    public final void mo85416a(MicroAppInfo microAppInfo, int i, C33292a aVar) {
        int i2 = 8;
        if (microAppInfo == null) {
            this.f86959a.setVisibility(8);
            return;
        }
        TextView textView = this.f86959a;
        if (i == 0) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        this.f86960b.setText(microAppInfo.getName());
        C23323e.m76514a(this.f86961c, microAppInfo.getIcon());
        this.itemView.setOnClickListener(new C33296d(microAppInfo, aVar));
    }
}
