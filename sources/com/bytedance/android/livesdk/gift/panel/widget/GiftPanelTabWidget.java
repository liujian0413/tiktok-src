package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v7.p030a.p031a.C1065a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.C8262q;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class GiftPanelTabWidget extends Widget implements OnClickListener {

    /* renamed from: a */
    private TextView f22572a;

    /* renamed from: b */
    private TextView f22573b;

    /* renamed from: c */
    private TextView f22574c;

    /* renamed from: d */
    private TextView f22575d;

    /* renamed from: e */
    private TextView f22576e;

    /* renamed from: f */
    private TextView f22577f;

    /* renamed from: g */
    private View f22578g;

    /* renamed from: h */
    private View f22579h;

    /* renamed from: i */
    private View f22580i;

    /* renamed from: j */
    private boolean f22581j;

    /* renamed from: k */
    private View f22582k;

    /* renamed from: l */
    private long f22583l;

    /* renamed from: m */
    private View f22584m;

    /* renamed from: n */
    private GiftDialogViewModel f22585n;

    /* renamed from: o */
    private boolean f22586o;

    public int getLayoutId() {
        return R.layout.anq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21380a() {
        m25219a(this.f22585n.f22459g);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22585n != null) {
            this.f22585n.mo21338a((C0043i) this);
        }
    }

    /* renamed from: c */
    private void m25222c() {
        if (((Boolean) C8946b.f24471by.mo22117a()).booleanValue()) {
            mo21384b(true);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.dataCenter != null) {
            this.f22585n = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f22585n != null) {
                m25220b();
                this.f22585n.f22462j.observe(this, new C8223ae(this));
                this.f22585n.f22463k.observe(this, new C8224af(this));
            }
        }
    }

    /* renamed from: d */
    private void m25224d() {
        int i;
        PanelType panelType;
        PanelType panelType2;
        Room room = (Room) this.dataCenter.get("data_room", null);
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f22573b.setVisibility(8);
        TextView textView = this.f22574c;
        if (C8262q.m25255d(room, booleanValue)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f22575d.setVisibility(8);
        int a = C8262q.m25250a(room, booleanValue);
        if (a != 3) {
            switch (a) {
                case 0:
                    this.f22572a.setVisibility(0);
                    return;
                case 1:
                    m25226e();
                    GiftDialogViewModel giftDialogViewModel = this.f22585n;
                    if (C8262q.m25255d(room, booleanValue)) {
                        panelType2 = PanelType.PROP;
                    } else {
                        panelType2 = PanelType.GIFT;
                    }
                    giftDialogViewModel.f22459g = panelType2;
                    return;
            }
        } else {
            this.f22572a.setVisibility(0);
            GiftDialogViewModel giftDialogViewModel2 = this.f22585n;
            if (this.f22574c.isShown()) {
                panelType = PanelType.PROP;
            } else {
                panelType = PanelType.GIFT;
            }
            giftDialogViewModel2.f22459g = panelType;
        }
    }

    /* renamed from: e */
    private void m25226e() {
        if (this.f22572a != null) {
            Drawable b = C1065a.m4641b(this.context, R.drawable.c2z);
            if (b != null) {
                b.setBounds(new Rect(0, 0, (int) C9738o.m28708b(this.context, 18.0f), (int) C9738o.m28708b(this.context, 18.0f)));
            }
            if (C3519c.m12965a(this.context)) {
                this.f22572a.setCompoundDrawables(b, null, null, null);
            } else {
                this.f22572a.setCompoundDrawables(null, null, b, null);
            }
            this.f22581j = true;
        }
    }

    /* renamed from: b */
    private void m25220b() {
        boolean z = false;
        if (this.f22585n.f22460h) {
            this.contentView.setAlpha(0.3f);
            this.contentView.setEnabled(false);
        }
        this.containerView.setVisibility(0);
        this.f22572a = (TextView) this.contentView.findViewById(R.id.dlq);
        this.f22573b = (TextView) this.contentView.findViewById(R.id.dlp);
        this.f22575d = (TextView) this.contentView.findViewById(R.id.dlr);
        this.f22576e = (TextView) this.contentView.findViewById(R.id.dls);
        this.f22574c = (TextView) this.contentView.findViewById(R.id.dlt);
        this.f22578g = this.contentView.findViewById(R.id.clm);
        this.f22579h = this.contentView.findViewById(R.id.cll);
        this.f22580i = this.contentView.findViewById(R.id.a5l);
        m25224d();
        this.f22582k = this.contentView.findViewById(R.id.aq0);
        this.f22577f = (TextView) this.contentView.findViewById(R.id.c4w);
        this.f22582k.setOnClickListener(new C8225ag(this));
        this.f22580i.setVisibility(0);
        this.f22584m = this.contentView.findViewById(R.id.c4v);
        User from = User.from(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a());
        if (!(from == null || from.getNobleLevelInfo() == null || from.getNobleLevelInfo().getNobleLevel() <= 0)) {
            z = true;
        }
        this.f22586o = z;
        this.f22573b.setVisibility(8);
        this.f22584m.setVisibility(8);
        this.f22572a.setOnClickListener(this);
        this.f22573b.setOnClickListener(this);
        this.f22575d.setOnClickListener(this);
        this.f22574c.setOnClickListener(this);
        this.f22576e.setOnClickListener(this);
        this.f22584m.setOnClickListener(this);
        this.containerView.post(new C8226ah(this));
        this.f22585n.f22478z.observe(this, new C8227ai(this));
        m25222c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21384b(boolean z) {
        int i;
        View view = this.f22578g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo21383a(boolean z) {
        int i;
        View view = this.f22579h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m25217a(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22580i, "x", new float[]{this.f22580i.getX(), f});
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21381a(long j) {
        int i;
        C8149d findGiftById = GiftManager.inst().findGiftById(j);
        View view = this.f22582k;
        if (findGiftById != null) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.f22583l = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21382a(View view) {
        String findGameGiftRuleUrl = GiftManager.inst().findGameGiftRuleUrl(this.f22583l);
        if (findGameGiftRuleUrl != null) {
            ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, Uri.parse(findGameGiftRuleUrl));
            this.f22585n.mo21346f();
        }
    }

    /* renamed from: a */
    private void m25219a(PanelType panelType) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float f;
        if (this.f22585n.f22461i.getValue() != panelType) {
            C0052o<Boolean> oVar = this.f22585n.f22441C;
            boolean z6 = true;
            if (panelType == PanelType.PROP) {
                z = true;
            } else {
                z = false;
            }
            oVar.postValue(Boolean.valueOf(z));
            TextView textView = this.f22572a;
            if (panelType == PanelType.GIFT) {
                z2 = true;
            } else {
                z2 = false;
            }
            m25218a(textView, z2);
            TextView textView2 = this.f22573b;
            if (panelType == PanelType.FANS_CLUB_GIFT) {
                z3 = true;
            } else {
                z3 = false;
            }
            m25218a(textView2, z3);
            TextView textView3 = this.f22575d;
            if (panelType == PanelType.HONOR_LEVEL_GIFT) {
                z4 = true;
            } else {
                z4 = false;
            }
            m25218a(textView3, z4);
            TextView textView4 = this.f22574c;
            if (panelType == PanelType.PROP) {
                z5 = true;
            } else {
                z5 = false;
            }
            m25218a(textView4, z5);
            TextView textView5 = this.f22576e;
            if (panelType != PanelType.NOBLE_GIFT) {
                z6 = false;
            }
            m25218a(textView5, z6);
            int width = this.f22580i.getWidth();
            switch (panelType) {
                case GIFT:
                    f = this.f22572a.getX();
                    i = this.f22572a.getWidth();
                    break;
                case FANS_CLUB_GIFT:
                    f = this.f22573b.getX();
                    i = this.f22573b.getWidth();
                    break;
                case HONOR_LEVEL_GIFT:
                    f = this.f22575d.getX();
                    i = this.f22575d.getWidth();
                    break;
                case PROP:
                    f = this.f22574c.getX();
                    i = this.f22574c.getWidth();
                    break;
                case NOBLE_GIFT:
                    f = this.f22576e.getX();
                    i = this.f22576e.getWidth();
                    break;
                default:
                    return;
            }
            int i2 = (i - width) / 2;
            if (i2 < 0) {
                i2 = 0;
            }
            m25217a(f + ((float) i2));
            this.f22585n.f22470r.postValue(null);
            this.f22585n.f22471s.postValue(null);
            this.f22585n.f22465m.postValue(Boolean.valueOf(false));
            this.f22585n.f22461i.postValue(panelType);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (view.getId() == R.id.dlq) {
            if (this.f22581j) {
                C9049ap.m27022a((int) R.string.edv);
            } else {
                m25219a(PanelType.GIFT);
            }
        } else if (view.getId() == R.id.dlp) {
            m25219a(PanelType.FANS_CLUB_GIFT);
            if (((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
                str2 = String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("orientation", String.valueOf(room.getOrientation()));
            }
            hashMap.put("user_id", str2);
            C8443c.m25663a().mo21606a("fans_club_gift_show", hashMap, new C8438j(), Room.class);
        } else if (view.getId() == R.id.dlr) {
            m25219a(PanelType.HONOR_LEVEL_GIFT);
            if (((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
                str = String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
            } else {
                str = "";
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("user_id", str);
            C8443c.m25663a().mo21606a("level_gift_tab_click", hashMap2, new C8438j(), Room.class);
        } else if (view.getId() == R.id.dlt) {
            m25219a(PanelType.PROP);
            C8284u.m25332a().mo21442d();
            this.f22578g.setVisibility(8);
        } else if (view.getId() == R.id.dls) {
            m25219a(PanelType.NOBLE_GIFT);
        } else {
            if (view.getId() == R.id.c4v) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("type", "gift");
                C8443c.m25663a().mo21606a("livesdk_nobility_page_click", hashMap3, new Object[0]);
                ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, Uri.parse((String) LiveConfigSettingKeys.LIVE_NOBLE_INTRODUCE_SCHEMA.mo10240a()).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3358ac.m12527e(C3361af.m12532a(this.context)))).build());
            }
        }
    }

    /* renamed from: a */
    private void m25218a(TextView textView, boolean z) {
        int i;
        if (this.context != null) {
            Resources resources = this.context.getResources();
            if (z) {
                i = R.color.as5;
            } else {
                i = R.color.anh;
            }
            textView.setTextColor(resources.getColor(i));
        }
    }
}
