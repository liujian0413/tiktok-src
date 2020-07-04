package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.autodispose.C3244ac;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.p159b.C3377b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.LinkState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.C4484aj;
import com.bytedance.android.livesdk.chatroom.interact.C4485ak;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4593cj;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4593cj.C4595a;
import com.bytedance.android.livesdk.chatroom.p210c.C4301d;
import com.bytedance.android.livesdk.chatroom.p210c.C4307e;
import com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5066c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper.Callback;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p346io.reactivex.C47854l;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public class LinkCrossRoomWidget extends LiveWidget implements C0053p<KVData>, C4595a, Callback {

    /* renamed from: b */
    private static int f16028b;

    /* renamed from: c */
    private static int f16029c;

    /* renamed from: d */
    private static int f16030d;

    /* renamed from: A */
    private boolean f16031A;

    /* renamed from: B */
    private C7321c f16032B;

    /* renamed from: a */
    public C5066c f16033a;

    /* renamed from: e */
    private boolean f16034e;

    /* renamed from: f */
    private Room f16035f;

    /* renamed from: g */
    private int f16036g;

    /* renamed from: h */
    private C4593cj f16037h;

    /* renamed from: i */
    private LinkCrossRoomDataHolder f16038i;

    /* renamed from: j */
    private SEIHelper f16039j;

    /* renamed from: k */
    private C4487am f16040k;

    /* renamed from: l */
    private ViewGroup f16041l;

    /* renamed from: m */
    private ImageView f16042m;

    /* renamed from: n */
    private TextView f16043n;

    /* renamed from: o */
    private FrameLayout f16044o;

    /* renamed from: p */
    private View f16045p;

    /* renamed from: q */
    private Guideline f16046q;

    /* renamed from: r */
    private TextView f16047r;

    /* renamed from: s */
    private TextView f16048s;

    /* renamed from: t */
    private C4307e f16049t;

    /* renamed from: u */
    private C4301d<TextView> f16050u;

    /* renamed from: v */
    private C4301d<VHeadView> f16051v;

    /* renamed from: w */
    private C4301d<HSImageView> f16052w;

    /* renamed from: x */
    private C9245h f16053x;

    /* renamed from: y */
    private LinkPKWidget f16054y;

    /* renamed from: z */
    private SEI f16055z;

    static abstract class SubWidget extends LiveWidget {

        /* renamed from: a */
        LinkCrossRoomDataHolder f16056a;

        /* renamed from: b */
        Room f16057b;

        /* renamed from: c */
        boolean f16058c;

        public void onCreate() {
            super.onCreate();
            this.f16056a = LinkCrossRoomDataHolder.m13782a();
            this.f16057b = (Room) this.dataCenter.get("data_room");
            this.f16058c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        }

        SubWidget(View view, ViewGroup viewGroup) {
            this.contentView = view;
            this.containerView = viewGroup;
        }
    }

    /* renamed from: j */
    public static int m17464j() {
        return f16028b;
    }

    /* renamed from: k */
    public static int m17465k() {
        return f16029c;
    }

    /* renamed from: l */
    public static int m17466l() {
        return f16030d;
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ax4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo13839i() {
        m17468n();
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13832a(Integer num) throws Exception {
        C4484aj.m14988a(this.f16038i, this.f16035f.getIdStr());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13827a(TextView textView, User user) {
        textView.setText(user.getNickName());
        if (this.f16034e) {
            textView.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13830a(VHeadView vHeadView) {
        vHeadView.setOnClickListener(new C5610bh(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13831a(VHeadView vHeadView, User user) {
        C5343e.m17031a((ImageView) vHeadView, user.getAvatarThumb(), (int) R.drawable.c4_);
        if (this.f16034e) {
            vHeadView.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13828a(HSImageView hSImageView) {
        if (!this.f16034e) {
            hSImageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13829a(HSImageView hSImageView, User user) {
        if (C6311g.m19573a(this.f16035f.getCover().getUrls())) {
            C5343e.m17039a(hSImageView, user.getAvatarLarge(), (C13842b) new C9092w(8));
        } else {
            C5343e.m17039a(hSImageView, this.f16035f.getCover(), (C13842b) new C9092w(8));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13833a(JSONObject jSONObject) throws Exception {
        this.f16037h.mo12460e();
    }

    /* renamed from: a */
    public final void mo12469a(boolean z) {
        m17454a(z ? 0 : R.string.cvr);
        StringBuilder sb = new StringBuilder("Guest entered");
        sb.append(z ? "foreground" : "background");
        mo12468a(sb.toString());
    }

    /* renamed from: a */
    public final void mo12468a(String str) {
        m17463c(str);
    }

    /* renamed from: d */
    public final void mo12472d() {
        C9049ap.m27022a((int) R.string.eus);
    }

    /* renamed from: f */
    public final void mo12473f() {
        C9049ap.m27022a((int) R.string.env);
    }

    /* renamed from: g */
    public final void mo12474g() {
        m17454a(0);
    }

    /* renamed from: b */
    public final void mo12470b() {
        C9049ap.m27023a((int) R.string.enu, 1);
        this.f16037h.mo12458d();
    }

    /* renamed from: c */
    public final void mo12471c() {
        C9049ap.m27022a((int) R.string.exg);
        this.f16037h.mo12458d();
    }

    /* renamed from: h */
    public final void mo13838h() {
        if (this.f16037h != null) {
            this.f16037h.mo12458d();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f16034e) {
            this.f16037h.mo12449a(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f16034e) {
            this.f16037h.mo12449a(true);
        }
    }

    /* renamed from: a */
    public final void mo12466a() {
        if (this.f16054y == null) {
            enableSubWidgetManager();
            this.f16054y = new LinkPKWidget(this.contentView, this.containerView);
            this.subWidgetManager.load(this.f16054y);
        }
    }

    /* renamed from: n */
    private void m17468n() {
        boolean z;
        if (LinkState.TURN_ON_ENGINE_SUCCEED.compareTo((LinkState) this.f16038i.get("data_link_state", LinkState.DISABLED)) <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9049ap.m27022a((int) R.string.ent);
        } else if (this.f16054y != null) {
            this.f16054y.mo13887f();
        } else {
            if (this.f16053x == null) {
                this.f16053x = new C9249a(this.context).mo22731d((CharSequence) C3358ac.m12515a((int) R.string.eue)).mo22722b(0, (int) R.string.f96, (OnClickListener) new C5608bf(this)).mo22722b(1, (int) R.string.ecm, C5609bg.f16673a).mo22710a((int) R.string.eue).mo22720b();
                this.f16053x.f25361b.setVisibility(8);
            }
            if (!this.f16053x.isShowing()) {
                this.f16053x.show();
            }
        }
    }

    /* renamed from: o */
    private void m17469o() {
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.f16038i.f11667e);
        userProfileEvent.interactLogLabel = "right_anchor";
        this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", userProfileEvent);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(this.f16035f.getOwnerUserId()));
        if (this.f16038i.f11672j == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "pk");
        }
        C8443c.m25663a().mo21606a("right_anchor_click", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail").mo21602e("live_detail"), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
    }

    /* renamed from: p */
    private void m17470p() {
        boolean z;
        if (!C3377b.m12564b() || C3377b.m12562a() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f16036g = C3358ac.m12523c();
        if (z) {
            this.f16036g = (int) (((float) C3358ac.m12520b()) * 0.5625f);
        }
        LayoutParams layoutParams = (LayoutParams) this.contentView.getLayoutParams();
        if (z) {
            layoutParams.width = this.f16036g;
            layoutParams.gravity = 17;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.contentView.setLayoutParams(layoutParams);
    }

    /* renamed from: m */
    private void m17467m() {
        this.f16049t = new C4307e(this.f16038i, this.contentView);
        if (this.f16038i.lifecycleOwner != null && this.f16038i.lifecycleOwner.getLifecycle() != null) {
            this.f16050u = this.f16049t.mo11982a((int) R.id.dyh).mo11977a(new C5606bd(this)).mo11978a("data_guest_user", new C5612bj(this)).mo11979a();
            this.f16051v = this.f16049t.mo11982a((int) R.id.aum).mo11977a(new C5613bk(this)).mo11978a("data_guest_user", new C5614bl(this)).mo11979a();
            this.f16052w = this.f16049t.mo11982a((int) R.id.bbn).mo11977a(new C5615bm(this)).mo11978a("data_guest_user", new C5616bn(this)).mo11979a();
        }
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        this.f16035f = (Room) this.dataCenter.get("data_room");
        this.f16034e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16038i = LinkCrossRoomDataHolder.m13782a();
        this.f16038i.f11664b = true;
        if (this.f16038i.lifecycleOwner == null) {
            C3166a.m11966e("DATA_CENTER", "LifecycleOwner == null! ");
            return;
        }
        if (this.f16038i != LinkCrossRoomDataHolder.f11658a) {
            this.f16038i.observeForever("data_link_state", this).observeForever("cmd_log_link", this);
        }
        this.f16036g = C3358ac.m12523c();
        if (!C3377b.m12564b() || C3377b.m12562a() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f16036g = (int) (((float) C3358ac.m12520b()) * 0.5625f);
        }
        double d = (double) ((((float) this.f16036g) * 1.0f) / 360.0f);
        Double.isNaN(d);
        f16028b = (int) (d * 108.0d);
        int i = this.f16036g / 2;
        f16029c = i;
        f16030d = (int) (((((float) i) * 1.0f) / 9.0f) * 13.0f);
        m17470p();
        this.f16044o.setVisibility(0);
        this.f16048s = (TextView) this.contentView.findViewById(R.id.dve);
        this.f16045p = this.contentView.findViewById(R.id.a24);
        this.f16046q = (Guideline) this.contentView.findViewById(R.id.asb);
        this.f16041l = (ViewGroup) this.contentView.findViewById(R.id.bkg);
        this.f16042m = (ImageView) this.contentView.findViewById(R.id.bb0);
        this.f16043n = (TextView) this.contentView.findViewById(R.id.e3_);
        m17467m();
        if (this.f16034e) {
            m17455a(f16028b, f16030d);
        } else {
            this.f16039j = new SEIHelper(this);
            this.f16048s.setVisibility(8);
            this.f16032B = ((C3245ad) C7492s.m23301b(Integer.valueOf(1)).mo19320e((long) ((Integer) LiveConfigSettingKeys.LIVE_PK_SEI_OVER_TIME.mo10240a()).intValue(), TimeUnit.SECONDS).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5605bc<Object>(this));
        }
        this.f16037h = new C4593cj(this.dataCenter, this.f16040k);
        this.f16037h.mo9142a((C4595a) this);
        if (this.f16034e) {
            this.f16037h.mo12450b();
        }
        if (!this.f16034e && this.f16038i.f11672j <= 0) {
            C4485ak.m15001a();
        }
        if (this.f16034e || this.f16038i.f11672j <= 0) {
            this.f16041l.setVisibility(0);
            this.f16042m.setVisibility(8);
            this.f16043n.setVisibility(8);
        } else {
            mo12466a();
        }
        this.f16038i.f11685w = System.currentTimeMillis();
        this.dataCenter.lambda$put$1$DataCenter("data_link_cross_load", Boolean.valueOf(true));
        m17463c("LinkCrossRoomWidget loaded");
    }

    public void onDestroy() {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_link_cross_load", Boolean.valueOf(false));
        }
        C8435g gVar = new C8435g();
        if (this.f16038i.f11672j > 0 && this.f16038i.f11680r == 0) {
            gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
        }
        if (this.f16034e) {
            C8443c.m25663a().mo21607a("connection_over", gVar.mo21593a(String.valueOf((System.currentTimeMillis() - this.f16038i.f11685w) / 1000)), new C8438j().mo21599b("live").mo21603f("other"), this.f16038i.mo11449b());
            if (this.f16038i.get("data_pk_state") == PkState.PK) {
                if (LinkCrossRoomDataHolder.m13782a().f11672j > 0 && LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                    gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                }
                C8443c.m25663a().mo21607a("livesdk_pk_end", new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("other"), gVar.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - this.f16038i.f11686x) / 1000)), this.f16038i.mo11449b(), Room.class);
            } else if (this.f16038i.get("data_pk_state") == PkState.PENAL) {
                C8443c.m25663a().mo21607a("punish_end", gVar.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - this.f16038i.f11688z) / 1000)), this.f16038i.mo11449b(), Room.class);
            }
        }
        try {
            this.f16037h.mo8963a();
            this.f16049t.mo11983a();
            this.f16038i.removeObserver(this);
            if (!this.f16034e) {
                C4485ak.m15002b();
            }
            this.f16038i.mo11450c();
        } catch (Throwable unused) {
            C3166a.m11966e("DATA_CENTER", "should crash at onDestroy()");
        }
        this.f16044o.removeAllViews();
        this.f16044o.setBackgroundColor(0);
        this.f16044o.setVisibility(8);
        super.onDestroy();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13835b(View view) {
        m17469o();
    }

    /* renamed from: c */
    private void m17463c(String str) {
        m17460b(str, "");
    }

    /* renamed from: a */
    private void m17458a(Enum enumR) {
        m17463c(enumR.name());
    }

    public boolean isVersionSupported(int i) {
        if (this.f16034e || i != 2) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m17470p();
        if (this.f16055z != null) {
            onSeiUpdated(this.f16055z);
        }
        m17459b(f16028b, f16030d);
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m17462b(JSONObject jSONObject) throws Exception {
        if (TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_Android") || TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_IOS")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m17454a(int i) {
        this.f16044o.removeView(this.f16047r);
        if (i == 0) {
            ((HSImageView) this.f16052w.f12507a).setVisibility(8);
            this.f16048s.setVisibility(8);
            return;
        }
        this.f16047r = new TextView(this.context);
        LayoutParams layoutParams = new LayoutParams(f16029c, f16030d);
        layoutParams.topMargin = f16028b;
        layoutParams.leftMargin = f16029c;
        this.f16047r.setLayoutParams(layoutParams);
        this.f16047r.setGravity(17);
        if (i == R.string.enx) {
            this.f16047r.setTextColor(-1);
        } else {
            this.f16047r.setTextColor(-16777216);
        }
        this.f16047r.setTextSize(16.0f);
        this.f16047r.setText(i);
        this.f16044o.addView(this.f16047r);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -612633460:
                    if (key.equals("data_pk_result")) {
                        c = 3;
                        break;
                    }
                    break;
                case 436641052:
                    if (key.equals("data_pk_steal_tower_state")) {
                        c = 2;
                        break;
                    }
                    break;
                case 872172481:
                    if (key.equals("data_link_state")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1227596154:
                    if (key.equals("cmd_log_link")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    LinkState linkState = (LinkState) kVData.getData();
                    m17458a((Enum) linkState);
                    if (LinkState.CONNECTION_SUCCEED.equals(linkState) && this.f16038i.f11672j > 0) {
                        mo12466a();
                        return;
                    }
                case 1:
                case 2:
                case 3:
                    m17458a((Enum) kVData.getData());
                    return;
                case 4:
                    m17463c((String) kVData.getData());
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13836b(String str) {
        if (!this.f16034e && this.f16039j != null) {
            this.f16039j.updateSei(str);
            if (this.f16031A && ((Boolean) LiveConfigSettingKeys.LIVE_PK_SEI_UPDATE.mo10240a()).booleanValue()) {
                ((C3244ac) C7319aa.m22930a(str).mo19134b((C7327h<? super T, ? extends R>) new C5617bo<Object,Object>(str)).mo19130a(C5618bp.f16682a).mo19272a((C47854l<T, ? extends R>) autoDisposeWithTransformer())).mo10180a(new C5619bq(this), C5607be.f16671a);
            }
        }
    }

    public void onSeiUpdated(SEI sei) {
        if (!this.f16034e && isViewValid() && sei.getGridList() != null && !sei.getGridList().isEmpty()) {
            boolean z = false;
            Region region = (Region) sei.getGridList().get(0);
            if (region != null) {
                this.f16055z = sei;
                this.f16031A = true;
                if (this.f16038i.f11667e <= 0) {
                    Iterator it = sei.getGridList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Region) it.next()).getUserId() != TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                                this.f16038i.f11667e = region.getUserId();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f16037h.mo12450b();
                float width = (((float) this.f16036g) * 1.0f) / ((float) sei.getWidth());
                double height = (double) sei.getHeight();
                double y = region.getY();
                Double.isNaN(height);
                double d = height * y;
                double d2 = (double) width;
                Double.isNaN(d2);
                f16028b = (int) (d * d2);
                double height2 = region.getHeight();
                double height3 = (double) sei.getHeight();
                Double.isNaN(height3);
                double d3 = height2 * height3;
                Double.isNaN(d2);
                f16030d = (int) (d3 * d2);
                this.dataCenter.lambda$put$1$DataCenter("cmd_adjust_video_interact_stream_bottom", Integer.valueOf(f16028b + f16030d));
                if (this.f16054y == null) {
                    this.f16038i.f11661C = sei;
                }
                m17455a(f16028b, f16030d);
                if (region.getStatus() == 0) {
                    m17454a(0);
                } else if (region.getStatus() == 1) {
                    m17454a((int) R.string.cvr);
                }
                if (this.f16032B != null && !this.f16032B.isDisposed()) {
                    this.f16032B.dispose();
                    C4484aj.m14987a(this.f16038i, sei, this.f16035f.getIdStr());
                }
                StringBuilder sb = new StringBuilder("SEI Updated, LinkPkWidget:");
                if (this.f16054y == null) {
                    z = true;
                }
                sb.append(String.valueOf(z));
                mo12468a(sb.toString());
                StringBuilder sb2 = new StringBuilder(",marginTop:");
                sb2.append(f16028b);
                sb2.append(",height:");
                sb2.append(f16030d);
                sb2.append(",region.getHeight()=");
                sb2.append(region.getHeight());
                sb2.append(",region.getWidth()=");
                sb2.append(region.getWidth());
                sb2.append(",region.getY()=");
                sb2.append(region.getY());
                m17460b("SEI Debug Stream Height", sb2.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13825a(View view) {
        m17469o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13837b(boolean z) {
        int i;
        View view = this.contentView;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13826a(TextView textView) {
        textView.setOnClickListener(new C5611bi(this));
    }

    public LinkCrossRoomWidget(C4487am amVar, FrameLayout frameLayout) {
        this.f16040k = amVar;
        this.f16044o = frameLayout;
    }

    /* renamed from: a */
    static final /* synthetic */ JSONObject m17453a(String str, String str2) throws Exception {
        return new JSONObject(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13834b(DialogInterface dialogInterface, int i) {
        if (isViewValid()) {
            this.f16037h.mo12458d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo12467a(long j, long j2) {
        if (this.f16033a != null) {
            this.f16033a.mo13174a(j, j2);
        }
    }

    /* renamed from: b */
    private void m17459b(int i, int i2) {
        boolean z = false;
        C4448r rVar = new C4448r(0);
        rVar.f12905b = Integer.valueOf(i + i2 + C3358ac.m12510a(64.0f));
        if (this.f16038i.f11672j > 0) {
            z = true;
        }
        rVar.f12906c = z;
        this.dataCenter.lambda$put$1$DataCenter("cmd_pk_state_change", rVar);
        C3222b.m12218a().mo10145b(Tag.LivePk.name(), getLifecycle(), getContext(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        C3222b.m12218a().mo10136a(Tag.LivePk.name(), getLifecycle(), getContext(), (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
    }

    /* renamed from: b */
    private void m17460b(String str, String str2) {
        String str3;
        new StringBuilder();
        if (!this.f16034e) {
            str3 = "audience";
        } else if (this.f16038i.f11671i) {
            str3 = "inviter";
        } else {
            str3 = "invitee";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        hashMap.put("role", str3);
        hashMap.put("channel_id", Long.valueOf(this.f16038i.f11665c));
        hashMap.put("room_id", Long.valueOf(this.f16035f.getId()));
        hashMap.put("guest_uid", Long.valueOf(this.f16038i.f11667e));
        hashMap.put("start_time", Long.valueOf(this.f16038i.f11674l));
        hashMap.put("duration", Integer.valueOf(this.f16038i.f11672j));
        hashMap.put("pk_id", Long.valueOf(this.f16038i.f11666d));
        hashMap.put("link_mic_id", Integer.valueOf(this.f16038i.f11677o));
        hashMap.put("guest_link_mic_id", Integer.valueOf(this.f16038i.f11670h));
        hashMap.put("vendor", this.f16037h.mo12462h().name());
        hashMap.put("extra", str2);
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    private void m17455a(int i, int i2) {
        String str;
        m17459b(i, i2);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f16045p.getLayoutParams();
        layoutParams.height = i2;
        this.f16045p.setLayoutParams(layoutParams);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(i);
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, sb.toString()));
        this.f16046q.setGuidelineBegin(i);
        if (!this.f16034e) {
            ((VHeadView) this.f16051v.f12507a).setVisibility(0);
            ((TextView) this.f16050u.f12507a).setVisibility(0);
        }
        if (this.f16054y != null) {
            this.f16054y.mo13886d();
        }
        if (this.f16045p.getVisibility() != 0) {
            this.f16045p.setVisibility(0);
            if (this.f16035f.getLinkMicInfo() == null) {
                C8435g gVar = new C8435g();
                if (this.f16034e) {
                    if (this.f16035f.getId() == this.f16038i.f11665c) {
                        gVar.mo21594b(this.f16035f.getOwner().getId()).mo21596c(this.f16038i.f11667e);
                    } else {
                        gVar.mo21594b(this.f16038i.f11667e).mo21596c(this.f16035f.getOwner().getId());
                    }
                    HashMap hashMap = new HashMap();
                    if (this.f16038i.f11672j > 0 && this.f16038i.f11680r == 0) {
                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                    }
                    if (this.f16038i.f11680r == 1 || this.f16038i.f11680r == 2) {
                        String str2 = "is_rematch";
                        if (this.f16038i.f11687y) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        hashMap.put(str2, str);
                    }
                    LinkCrossRoomDataHolder.m13782a().f11685w = SystemClock.elapsedRealtime();
                    C8443c.m25663a().mo21606a("connection_success", hashMap, new C8438j().mo21598a("live_detail").mo21603f("other").mo21599b("live"), gVar.mo21592a(Boolean.valueOf(this.f16038i.f11687y)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                    return;
                }
                C8443c.m25663a().mo21607a("connection_transform", new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), gVar, LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                if (this.f16038i.f11672j > 0) {
                    if (this.f16038i.f11680r == 0) {
                        gVar.mo21591a(this.f16038i.f11669g);
                    }
                    C8443c.m25663a().mo21607a("pk_transform", new C8438j().mo21599b("live_function").mo21598a("live_detail"), gVar, LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                }
            }
        }
    }
}
