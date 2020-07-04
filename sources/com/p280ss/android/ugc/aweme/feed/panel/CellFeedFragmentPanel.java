package com.p280ss.android.ugc.aweme.feed.panel;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23660c;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.p280ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.C28533o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.p1238ui.SearchCellDecoration;
import com.p280ss.android.ugc.aweme.feed.p1238ui.TimeLineDecoration;
import com.p280ss.android.ugc.aweme.main.C32958db;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel */
public class CellFeedFragmentPanel extends AbsCellFeedFragmentPanel implements C25663d<AbsCellViewHolder>, C25675c<Aweme>, C25676d, C28467s {

    /* renamed from: g */
    protected C23389b f75268g;

    /* renamed from: h */
    public C28533o f75269h;

    /* renamed from: i */
    public boolean f75270i = true;

    /* renamed from: j */
    protected String f75271j;

    /* renamed from: k */
    protected boolean f75272k;

    /* renamed from: l */
    public int f75273l;

    /* renamed from: m */
    protected boolean f75274m;
    protected SwipeRefreshLayout mRefreshLayout;

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
    }

    /* renamed from: k */
    public final void mo73307k() {
        this.f75270i = false;
        m93863q();
    }

    /* renamed from: q */
    private void m93863q() {
        if (this.f75262c != null) {
            this.f75262c.mo66544a();
        }
    }

    public final void aD_() {
        if (mo73385bf()) {
            this.f75263d.ag_();
        }
    }

    /* renamed from: aw */
    public final void mo73305aw() {
        super.mo73305aw();
        if (mo73488bw()) {
            this.f75270i = false;
            m93863q();
        }
    }

    /* renamed from: e */
    public C1273i mo73297e() {
        return new WrapGridLayoutManager(mo105655bv(), 2, 1, false);
    }

    /* renamed from: j */
    public final void mo73306j() {
        m93861o();
        m93860b(false);
        m93862p();
    }

    public final void aE_() {
        if (mo73385bf() && !this.f75272k) {
            this.f75268g.setRefreshing(true);
        }
    }

    public final void ae_() {
        if (mo73385bf()) {
            this.f75268g.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
        }
    }

    /* renamed from: g */
    public final CellFeedAdapter mo73299g() {
        int i;
        if (this.f75263d != null) {
            return this.f75263d;
        }
        if (this.f75273l == 7) {
            i = 1;
        } else {
            i = 0;
        }
        CellFeedAdapter cellFeedAdapter = new CellFeedAdapter(this, this.f75271j, this.f75260a, this, i, this.f75273l);
        return cellFeedAdapter;
    }

    /* renamed from: o */
    private void m93861o() {
        if (mo73385bf()) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = this.mListView.mo5539b(this.mListView.getChildAt(i));
                if (b.mItemViewType == 0) {
                    AbsCellViewHolder absCellViewHolder = (AbsCellViewHolder) b;
                    if (absCellViewHolder != null && !absCellViewHolder.mo67073m()) {
                        absCellViewHolder.mo67069c();
                        absCellViewHolder.mo67070d(true);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private void m93862p() {
        if (this.f75263d != null && !this.f75270i && this.mListView != null) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = this.mListView.mo5539b(this.mListView.getChildAt(i));
                if (b.mItemViewType == 0) {
                    mo61737a((AbsCellViewHolder) b);
                }
            }
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (mo73385bf()) {
            if (this.f75263d.getItemCount() == 0) {
                this.f75268g.setRefreshing(false);
                if (this.mStatusView != null) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.mo25942f();
                }
            } else {
                this.f75268g.setRefreshing(true);
            }
        }
    }

    /* renamed from: l */
    public final void mo67632l() {
        super.mo67632l();
        if (mo73488bw() && C6903bc.m21497p().mo86710b(this.f113033ay)) {
            this.f75270i = false;
            m93862p();
            m93860b(true);
        }
    }

    /* renamed from: f */
    public C1272h mo73298f() {
        if (this.f75273l == 9) {
            if (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 5) {
                return new SearchCellDecoration(8);
            }
            if (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) != 3) {
                return new SearchCellDecoration(1);
            }
        }
        return new TimeLineDecoration((int) C9738o.m28708b(mo105655bv(), 1.0f));
    }

    /* renamed from: d */
    public final void mo67623d(boolean z) {
        this.f75272k = z;
    }

    /* renamed from: b */
    private void m93860b(boolean z) {
        if (this.f75262c != null) {
            this.f75262c.mo66545a(false, z);
        }
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
        if (mo73385bf()) {
            this.f75263d.notifyItemRemoved(i);
        }
    }

    @C7709l
    public void onDynamicEvent(C23660c cVar) {
        if (cVar.f62378a == 0) {
            m93860b(true);
        } else {
            m93863q();
        }
    }

    /* renamed from: a */
    public final void mo73304a(boolean z) {
        if (z) {
            this.f75263d.ai_();
        } else if (C6399b.m19944t()) {
            this.f75263d.mo66516d(false);
        } else {
            this.f75263d.ah_();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (mo73385bf()) {
            this.f75263d.mo66507h();
        }
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        if (mo73385bf()) {
            this.f75268g.setRefreshing(false);
            if (!this.f75272k) {
                C10761a.m31399c((Context) this.f113033ay, (int) R.string.c43).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public final void mo73303a(String str) {
        if (this.mListView != null && (this.mListView instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.mListView).setLabel(str);
        }
        C42980bm.m136450a(str).mo104686a(this.mListView);
        if (this.f75263d != null && (this.f75263d instanceof LoadMoreRecyclerViewAdapter)) {
            this.f75263d.f67552s = str;
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (mo73385bf()) {
            this.f75268g.setRefreshing(false);
            if (!this.f75274m) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo25944h();
                return;
            }
            C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea A[Catch:{ JSONException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd A[Catch:{ JSONException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61737a(com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x022d
            boolean r0 = r12.mo73385bf()
            if (r0 != 0) goto L_0x000a
            goto L_0x022d
        L_0x000a:
            int r0 = r12.f75273l
            r1 = 9
            if (r0 == r1) goto L_0x022c
            int r0 = r12.f75273l
            r1 = 15
            if (r0 != r1) goto L_0x0018
            goto L_0x022c
        L_0x0018:
            r0 = 1
            r12.f75270i = r0
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r2 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()
            int r3 = r12.f75273l
            org.json.JSONObject r10 = r1.getRequestIdAndOrderJsonObject(r2, r3)
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = r12.f75271j     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = "homepage_fresh"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = "homepage_fresh"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0138 }
        L_0x004d:
            r0 = r1
            goto L_0x009f
        L_0x004f:
            java.lang.String r1 = r12.f75271j     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = "homepage_hot"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x004d
        L_0x0063:
            java.lang.String r1 = r12.f75271j     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = "homepage_follow"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "homepage_follow"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x004d
        L_0x0077:
            java.lang.String r1 = r12.f75271j     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = "categorized_city_poi"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = "categorized_city_poi"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x004d
        L_0x008b:
            java.lang.String r1 = r12.f75271j     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = "homepage_channel"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = "homepage_channel"
            java.lang.String r0 = "style"
            java.lang.String r2 = "text"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x004d
        L_0x009f:
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107205a(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            int r3 = r12.f75273l     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107206a(r2, r3)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.Long r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107233j(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "content"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107237l(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "display"
            java.lang.String r2 = "dual"
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107223e(r1)     // Catch:{ JSONException -> 0x0137 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0137 }
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107223e(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
        L_0x00f7:
            boolean r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107220c(r0)     // Catch:{ JSONException -> 0x0137 }
            if (r1 == 0) goto L_0x0129
            java.lang.String r1 = "poi_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107229h(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "poi_channel"
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107214b()     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "city_info"
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107231i(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
        L_0x0129:
            java.lang.String r1 = "is_photo"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107239n(r2)     // Catch:{ JSONException -> 0x0137 }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x0137 }
            goto L_0x0139
        L_0x0137:
            r1 = r0
        L_0x0138:
            r0 = r1
        L_0x0139:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()
            boolean r1 = r1.isLive()
            if (r1 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "impression"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "live"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 != 0) goto L_0x016c
            java.lang.String r2 = ""
            goto L_0x017a
        L_0x016c:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.mo66487d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            long r2 = r2.roomId
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x017a:
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setExtValueString(r2)
            com.ss.android.ugc.aweme.app.g.c r2 = new com.ss.android.ugc.aweme.app.g.c
            r2.<init>()
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.mo66487d()
            java.lang.String r4 = r4.getAuthorUid()
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "page_name"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r0)
            java.lang.String r3 = "position"
            java.lang.String r4 = "homepage_fresh"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "city_info"
            java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.mo66487d()
            java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107231i(r4)
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.mo66487d()
            int r5 = r12.f75273l
            java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107206a(r4, r5)
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            org.json.JSONObject r2 = r2.mo16888b()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r2)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()
            java.lang.String r2 = r1.getAuthorUid()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            long r3 = r1.roomId
            java.lang.String r5 = "homepage_fresh"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()
            java.lang.String r6 = r1.getRequestId()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.mo66487d()
            int r7 = r1.getAwemePosition()
            r8 = -1
            r9 = 0
            r10 = 0
            java.lang.String r11 = "live_cover"
            com.p280ss.android.ugc.aweme.story.live.C41989d.m133479a(r2, r3, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x020f
        L_0x01ff:
            android.content.Context r4 = r12.mo105655bv()
            java.lang.String r5 = "show"
            java.lang.String r7 = r13.mo67072l()
            r8 = 0
            r6 = r0
            com.p280ss.android.ugc.aweme.common.C6907h.m21519a(r4, r5, r6, r7, r8, r10)
        L_0x020f:
            com.ss.android.ugc.aweme.metrics.ar r1 = new com.ss.android.ugc.aweme.metrics.ar
            r1.<init>()
            com.ss.android.ugc.aweme.metrics.ar r0 = r1.mo85126a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r13.mo66487d()
            int r1 = r12.f75273l
            com.ss.android.ugc.aweme.metrics.ar r13 = r0.mo85128c(r13, r1)
            java.lang.String r0 = "dual"
            com.ss.android.ugc.aweme.metrics.ar r13 = r13.mo85133g(r0)
            r13.mo85252e()
            return
        L_0x022c:
            return
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel.mo61737a(com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder):void");
    }

    /* renamed from: a */
    public final void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        this.f75268g = new C32958db(this.mRefreshLayout);
    }

    /* renamed from: b */
    public final void mo59108b(List<Aweme> list, boolean z) {
        if (mo73385bf()) {
            this.f75268g.setRefreshing(false);
            this.f75263d.mo61577b(list);
            m93860b(true);
            mo73304a(z);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Aweme> list, boolean z) {
        if (mo73385bf()) {
            this.mStatusView.mo25939d();
            this.mStatusView.setVisibility(8);
            this.f75268g.setRefreshing(false);
            this.f75274m = true;
            this.f75263d.mo66516d(true);
            this.f75263d.mo58045a(list);
            mo73304a(z);
            if (this.f75269h != null) {
                this.f75269h.mo68436j();
            }
            m93860b(true);
        }
    }

    /* renamed from: c */
    public final void mo59110c(List<Aweme> list, boolean z) {
        if (mo73385bf()) {
            if (z || this.f75272k) {
                this.f75263d.mo66501d(list);
                if (!this.f75272k && ax_()) {
                    mo73295b(0);
                    m93860b(true);
                }
            } else if (mo73488bw() && this.f113033ay != null && C6903bc.m21497p().mo86708a(this.f113033ay)) {
                C10761a.m31409e((Context) this.f113033ay, (int) R.string.am0).mo25750a();
                mo73295b(0);
            }
            this.f75268g.setRefreshing(false);
        }
    }

    public CellFeedFragmentPanel(String str, C23685d dVar, C28532n nVar, int i) {
        super(dVar, nVar);
        this.f75271j = str;
        this.f75273l = i;
    }
}
