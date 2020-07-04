package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.MostUseMicroAppViewHolder */
public class MostUseMicroAppViewHolder extends C1293v {

    /* renamed from: a */
    private TextView f86952a;

    /* renamed from: b */
    private RemoteImageView f86953b;

    /* renamed from: c */
    private Context f86954c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85407a() {
        this.f86952a.setText(this.f86954c.getString(R.string.ca2));
        this.itemView.setTag(null);
        C23323e.m76503a(this.f86953b, (int) R.drawable.add);
        this.itemView.setOnClickListener(new C33294b(this));
    }

    /* renamed from: b */
    private static void m107681b() {
        Activity b = AwemeApplication.m21343b();
        if (b != null) {
            C6907h.m21524a("click_more_microapp", (Map) C22984d.m75611a().mo59973a("author_id", C21115b.m71197a().getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_outer").f60753a);
            C6907h.m21524a("click_mp_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").mo59973a("scene_id", "021001").f60753a);
            b.startActivity(new Intent(b, MicroAppGroupActivity.class));
            b.overridePendingTransition(R.anim.c5, R.anim.cd);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85408a(View view) {
        m107681b();
    }

    MostUseMicroAppViewHolder(View view) {
        super(view);
        m107682b(view);
        this.f86954c = view.getContext();
    }

    /* renamed from: b */
    private void m107682b(View view) {
        this.f86953b = (RemoteImageView) view.findViewById(R.id.byh);
        this.f86952a = (TextView) view.findViewById(R.id.byj);
    }

    /* renamed from: a */
    public final void mo85409a(MicroAppInfo microAppInfo) {
        this.f86952a.setText(microAppInfo.getName());
        this.itemView.setTag(microAppInfo);
        C23323e.m76514a(this.f86953b, microAppInfo.getIcon());
        this.itemView.setOnClickListener(new C33293a(this, microAppInfo));
    }

    /* renamed from: b */
    private static void m107683b(MicroAppInfo microAppInfo) {
        String str;
        String str2 = "mp_click";
        C22984d a = C22984d.m75611a().mo59973a("mp_id", microAppInfo.getAppId()).mo59973a("author_id", C21115b.m71197a().getCurUserId()).mo59973a("click_type", "setting_page_outer").mo59973a("enter_from", "setting_page");
        String str3 = "_param_for_special";
        if (microAppInfo.isApp()) {
            str = "micro_app";
        } else {
            str = "micro_game";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85410a(MicroAppInfo microAppInfo, View view) {
        C7167b.m22380b().mo18647a().openMiniApp(view.getContext(), microAppInfo, new C33472a().mo85791b("setting_page").mo85792c("021001").mo85790a());
        m107683b(microAppInfo);
    }
}
