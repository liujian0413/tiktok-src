package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter */
public class RecentlyMicroAppListAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    private List<MicroAppInfo> f86955a = new ArrayList();

    /* renamed from: b */
    private List<String> f86956b = new ArrayList();

    /* renamed from: c */
    private int f86957c;

    /* renamed from: d */
    private boolean f86958d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter$a */
    interface C33292a {
        /* renamed from: a */
        void mo85415a(String str);
    }

    public int getItemCount() {
        int size = this.f86955a.size();
        if (this.f86957c == 0) {
            return size;
        }
        if (this.f86957c == 1) {
            return (this.f86958d ? 1 : 0) + size;
        }
        StringBuilder sb = new StringBuilder("invalid item type");
        sb.append(this.f86957c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo85412a(List<MicroAppInfo> list) {
        this.f86955a.clear();
        this.f86955a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo85414b(List<MicroAppInfo> list) {
        this.f86955a.clear();
        this.f86955a.addAll(list);
        notifyDataSetChanged();
    }

    public RecentlyMicroAppListAdapter(int i) {
        this.f86957c = i;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (this.f86957c == 0) {
            m107690b(vVar, i);
            return;
        }
        if (this.f86957c == 1) {
            m107689a(vVar, i);
        }
    }

    /* renamed from: a */
    private void m107689a(C1293v vVar, int i) {
        if (vVar instanceof MostUseMicroAppViewHolder) {
            if (i <= this.f86955a.size() - 1) {
                MicroAppInfo microAppInfo = (MicroAppInfo) this.f86955a.get(i);
                ((MostUseMicroAppViewHolder) vVar).mo85409a(microAppInfo);
                m107688a(vVar.itemView.getContext(), microAppInfo);
            } else if (this.f86958d) {
                ((MostUseMicroAppViewHolder) vVar).mo85407a();
            }
        }
    }

    /* renamed from: b */
    private void m107690b(C1293v vVar, int i) {
        MicroAppInfo microAppInfo = (MicroAppInfo) this.f86955a.get(i);
        if (vVar instanceof RecentlyMicroAppViewHolder) {
            ((RecentlyMicroAppViewHolder) vVar).mo85416a(microAppInfo, i, (C33292a) new C33295c(this, i, microAppInfo));
        }
        m107688a(vVar.itemView.getContext(), microAppInfo);
    }

    /* renamed from: a */
    private void m107688a(Context context, MicroAppInfo microAppInfo) {
        String str;
        if (context != null && microAppInfo != null && this.f86957c != 1) {
            String appId = microAppInfo.getAppId();
            if (!this.f86956b.contains(appId)) {
                this.f86956b.add(appId);
                C7167b.m22380b().mo18647a().preloadMiniApp(appId, microAppInfo.getType());
                String str2 = "mp_show";
                C22984d a = C22984d.m75611a().mo59973a("mp_id", microAppInfo.getAppId()).mo59973a("author_id", C21115b.m71197a().getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_inner");
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

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f86957c == 0) {
            return new RecentlyMicroAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xw, viewGroup, false));
        }
        if (this.f86957c == 1) {
            return new MostUseMicroAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adw, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder("invalid item type");
        sb.append(this.f86957c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo85413a(List<MicroAppInfo> list, boolean z) {
        this.f86958d = z;
        this.f86955a.clear();
        this.f86955a.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85411a(int i, MicroAppInfo microAppInfo, String str) {
        if (i != 0) {
            this.f86955a.remove(i);
            this.f86955a.add(0, microAppInfo);
            notifyDataSetChanged();
        }
    }
}
