package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23847e;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23853a;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment */
public class DiscoverMusicFragment extends AmeBaseFragment implements C0053p<C23083a>, C6905a, C25766a {

    /* renamed from: e */
    public DataCenter f63091e;

    /* renamed from: f */
    public WidgetManager f63092f;

    /* renamed from: g */
    public DiscoverWidgetAdapter f63093g;

    /* renamed from: h */
    C33746f<C23822c> f63094h;

    /* renamed from: i */
    public C23853a f63095i;

    /* renamed from: j */
    private int f63096j;

    /* renamed from: k */
    private C23844b f63097k;

    /* renamed from: l */
    private C23847e f63098l;

    /* renamed from: m */
    private int f63099m;
    RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: j */
    public final View mo61750j() {
        return this.mListView;
    }

    /* renamed from: e */
    private void m78310e() {
        if (isViewValid() && this.f63093g != null) {
            this.f63093g.ag_();
        }
    }

    public final void bd_() {
        int i = this.f63099m - 2;
        if (i < 0) {
            i = 0;
        }
        this.f63095i.mo61937a(i, 10);
        m78310e();
    }

    /* renamed from: a */
    private void m78307a() {
        DiscoverWidgetAdapter discoverWidgetAdapter = new DiscoverWidgetAdapter(this.f63092f, this.f63091e, this.f63097k, this.f63098l, this.f63094h, this.f63096j);
        this.f63093g = discoverWidgetAdapter;
        this.f63093g.mo66504a((C6905a) this);
        this.f63093g.f67550q = getResources().getColor(R.color.lz);
    }

    /* renamed from: d */
    private void m78309d() {
        List list = (List) this.f63091e.mo60136b("data_sticker", null);
        if (((Boolean) this.f63091e.mo60136b("data_sticker_music_from_video", Boolean.valueOf(true))).booleanValue()) {
            if (this.f63091e.mo60135a("data_challenge") != null) {
                this.f63093g.mo61882a(true, 5);
            } else if (list != null && list.size() > 0) {
                this.f63093g.mo61882a(true, 4);
            }
        } else if (list != null && list.size() > 0) {
            this.f63093g.mo61882a(true, 4);
        } else if (this.f63091e.mo60135a("data_challenge") != null) {
            this.f63093g.mo61882a(true, 5);
        }
    }

    /* renamed from: a */
    public final void mo62032a(int i) {
        if (this.f63093g != null) {
            this.f63093g.mo61884c(i);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.f63096j = i;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!(this.mListView == null || !z || this.f63093g == null)) {
            this.f63093g.mo61881a(true);
        }
    }

    /* renamed from: a */
    public final void mo62034a(C23844b bVar) {
        this.f63097k = bVar;
        if (this.f63093g != null) {
            this.f63093g.f62906d = this.f63097k;
        }
    }

    /* renamed from: a */
    public final void mo62035a(C23847e eVar) {
        this.f63098l = eVar;
        if (this.f63093g != null) {
            this.f63093g.f62907e = this.f63098l;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f60948a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x003c
            r2 = 3322014(0x32b09e, float:4.655133E-39)
            if (r1 == r2) goto L_0x0032
            r2 = 510590654(0x1e6efebe, float:1.26522945E-20)
            if (r1 == r2) goto L_0x0028
            r2 = 1110903186(0x42370992, float:45.759346)
            if (r1 == r2) goto L_0x001e
            goto L_0x0046
        L_0x001e:
            java.lang.String r1 = "collection_feed_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 3
            goto L_0x0047
        L_0x0028:
            java.lang.String r1 = "should_load_more_pick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x0032:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x003c:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 2
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x00c9;
                case 2: goto L_0x0072;
                case 3: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01b4
        L_0x004d:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r0 = "collection_feed_status"
            java.lang.Object r7 = r7.mo60135a(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x01b4
            int r7 = r7.intValue()
            if (r7 != r5) goto L_0x01b4
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.mo66516d(r4)
            return
        L_0x006b:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.ah_()
            goto L_0x01b4
        L_0x0072:
            java.lang.Object r7 = r7.mo60161a()
            com.ss.android.ugc.aweme.choosemusic.a.a r7 = (com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a) r7
            boolean r0 = r6.mUserVisibleHint
            if (r0 == 0) goto L_0x00c8
            int r0 = r7.f62880c
            if (r0 != r3) goto L_0x0081
            goto L_0x00c8
        L_0x0081:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x0090
            int r0 = r7.f62881d
            if (r0 != r5) goto L_0x0090
            int r0 = r7.f62878a
            if (r0 != 0) goto L_0x0090
            return
        L_0x0090:
            int r0 = r7.f62878a
            if (r0 != r5) goto L_0x00ab
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            int r7 = r7.f62881d
            if (r7 != r5) goto L_0x00a0
            r7 = 2131821750(0x7f1104b6, float:1.9276252E38)
            goto L_0x00a3
        L_0x00a0:
            r7 = 2131821398(0x7f110356, float:1.9275538E38)
        L_0x00a3:
            com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r7)
            r7.mo25750a()
            return
        L_0x00ab:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x01b4
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            int r7 = r7.f62881d
            if (r7 != r5) goto L_0x00bd
            r7 = 2131821756(0x7f1104bc, float:1.9276264E38)
            goto L_0x00c0
        L_0x00bd:
            r7 = 2131821399(0x7f110357, float:1.927554E38)
        L_0x00c0:
            com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31383a(r0, r7)
            r7.mo25750a()
            return
        L_0x00c8:
            return
        L_0x00c9:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r0 = "list"
            java.lang.Object r7 = r7.mo60135a(r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01ad
            int r0 = r7.size()
            if (r0 > 0) goto L_0x00dd
            goto L_0x01ad
        L_0x00dd:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r6.f63093g
            int r0 = r0.getItemCount()
            int r7 = r7.size()
            r6.f63099m = r7
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r2 = "is_busi_sticker"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r7 = r7.mo60136b(r2, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0107
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 == 0) goto L_0x0107
            r6.m78309d()
            goto L_0x0130
        L_0x0107:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r2 = "data_sticker"
            java.lang.Object r7 = r7.mo60136b(r2, r1)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0120
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0120
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r1 = 4
            r7.mo61882a(r5, r1)
            goto L_0x0130
        L_0x0120:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r1 = "data_challenge"
            java.lang.Object r7 = r7.mo60135a(r1)
            if (r7 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r1 = 5
            r7.mo61882a(r5, r1)
        L_0x0130:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r6.f63091e
            java.lang.String r2 = "show_music_radio"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r1 = r1.mo60136b(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r7.f62909g = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            int r1 = r6.f63099m
            r7.f62908f = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            int r7 = r7.getItemCount()
            int r7 = r7 - r0
            if (r7 <= 0) goto L_0x0176
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Redmi 6A"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Redmi 6"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x016a
            goto L_0x0170
        L_0x016a:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r1 = r6.f63093g
            r1.notifyItemRangeInserted(r0, r7)
            goto L_0x017b
        L_0x0170:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.notifyDataSetChanged()
            goto L_0x017b
        L_0x0176:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.notifyDataSetChanged()
        L_0x017b:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r0 = "collection_feed_has_more"
            java.lang.Object r7 = r7.mo60135a(r0)
            if (r7 == 0) goto L_0x01b4
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f63091e
            java.lang.String r0 = "collection_feed_has_more"
            java.lang.Object r7 = r7.mo60135a(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r5) goto L_0x019b
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.ai_()
            goto L_0x01b4
        L_0x019b:
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.mo66516d(r4)
            goto L_0x01b4
        L_0x01a7:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r7 = r6.f63093g
            r7.ah_()
            return
        L_0x01ad:
            return
        L_0x01ae:
            com.ss.android.ugc.aweme.choosemusic.d.a r7 = r6.f63095i
            r7.mo61941a(r5, r1, r1, r4)
            return
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: a */
    public final void mo62036a(C33746f<C23822c> fVar) {
        this.f63094h = fVar;
        if (this.f63093g != null) {
            this.f63093g.f62910h = this.f63094h;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62033a(int i, int i2) {
        bd_();
    }

    /* renamed from: a */
    public static DiscoverMusicFragment m78306a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("challenge", str);
        }
        DiscoverMusicFragment discoverMusicFragment = new DiscoverMusicFragment();
        discoverMusicFragment.setArguments(bundle);
        return discoverMusicFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.p4, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        m78307a();
        this.mListView.setOverScrollMode(2);
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListView.setAdapter(this.f63093g);
        new C23969n(new C23931g(this), 5).mo62184a(this.mListView);
        this.f63091e.mo60132a("list", (C0053p<C23083a>) this).mo60132a("should_load_more_pick", (C0053p<C23083a>) this).mo60132a("music_collect_status", (C0053p<C23083a>) this).mo60132a("collection_feed_status", (C0053p<C23083a>) this);
        return inflate;
    }
}
