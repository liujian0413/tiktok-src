package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p029v7.widget.ListPopupWindow;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.impl.C8114a;
import com.bytedance.android.livesdk.gift.impl.C8114a.C8115a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8170c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.MonetaryType;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendGiftType;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p534b.C10296b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class GiftPanelBottomWidget extends Widget implements OnClickListener, C6310a {

    /* renamed from: a */
    public TextView f22480a;

    /* renamed from: b */
    public ListPopupWindow f22481b;

    /* renamed from: c */
    public C10296b f22482c;

    /* renamed from: d */
    private View f22483d;

    /* renamed from: e */
    private TextView f22484e;

    /* renamed from: f */
    private TextView f22485f;

    /* renamed from: g */
    private View f22486g;

    /* renamed from: h */
    private TextView f22487h;

    /* renamed from: i */
    private View f22488i;

    /* renamed from: j */
    private TextView f22489j;

    /* renamed from: k */
    private SpecialCombView f22490k;

    /* renamed from: l */
    private C8134a f22491l;

    /* renamed from: m */
    private MonetaryType f22492m = MonetaryType.DIAMOND;

    /* renamed from: n */
    private int f22493n;

    /* renamed from: o */
    private int f22494o = ((Integer) C5864b.f17252G.mo10240a()).intValue();

    /* renamed from: p */
    private ObjectAnimator f22495p;

    /* renamed from: q */
    private Handler f22496q = new C6309f(this);

    /* renamed from: r */
    private GiftDialogViewModel f22497r;

    /* renamed from: s */
    private boolean f22498s;

    /* renamed from: t */
    private C7321c f22499t;

    /* renamed from: u */
    private C47562b f22500u = new C47562b();

    /* renamed from: v */
    private String f22501v = ((String) LiveConfigSettingKeys.LIVE_GOLDEN_BEAN_TASK_SCHEMA.mo10240a());

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget$5 */
    static /* synthetic */ class C82085 {

        /* renamed from: a */
        static final /* synthetic */ int[] f22506a = new int[MonetaryType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$MonetaryType[] r0 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.MonetaryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22506a = r0
                int[] r0 = f22506a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$MonetaryType r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.MonetaryType.GOLDEN_BEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22506a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$MonetaryType r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.MonetaryType.DIAMOND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget.C82085.<clinit>():void");
        }
    }

    public int getLayoutId() {
        return R.layout.anf;
    }

    /* renamed from: f */
    private void m25138f() {
        this.f22497r.f22468p.postValue(Boolean.valueOf(true));
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* renamed from: c */
    private void m25133c() {
        m25127a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter());
        this.f22499t = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19325f((C7326g<? super T>) new C7326g<Long>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Long l) throws Exception {
                GiftPanelBottomWidget.this.mo21348a();
            }
        });
    }

    /* renamed from: h */
    private void m25140h() {
        if (this.f22495p != null && this.f22495p.isRunning()) {
            this.f22495p.cancel();
        }
        if (this.f22496q.hasMessages(1001)) {
            this.f22496q.removeMessages(1001);
        }
        this.f22489j.setVisibility(0);
        this.f22490k.setVisibility(8);
        m25128a(this.f22491l, true);
    }

    /* renamed from: a */
    public final void mo21348a() {
        if (isViewValid()) {
            C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
            if (!TextUtils.isEmpty(walletCenter.mo11161f())) {
                this.f22485f.setText(walletCenter.mo11161f());
            } else {
                this.f22485f.setText(R.string.fdw);
            }
            m25127a(walletCenter);
            mo21350a(this.f22491l);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22496q.hasMessages(1001)) {
            this.f22496q.removeMessages(1001);
        }
        if (this.f22499t != null && !this.f22499t.isDisposed()) {
            this.f22499t.dispose();
        }
        this.f22497r.mo21338a((C0043i) this);
        if (this.f22500u != null && !this.f22500u.isDisposed()) {
            this.f22500u.dispose();
        }
    }

    /* renamed from: e */
    private void m25137e() {
        C8134a aVar = (C8134a) this.f22497r.f22470r.getValue();
        int a = this.f22497r.mo21335a();
        C8169b bVar = (C8169b) this.f22497r.f22471s.getValue();
        if (bVar == null) {
            if (aVar != null) {
                C8170c cVar = new C8170c(m25130b(aVar.f22203a), aVar.mo21275p(), a, aVar.mo21264e());
                this.f22497r.f22467o.postValue(cVar);
            }
        } else if (bVar.f22362a.size() < ((Integer) C5864b.f17250E.mo10240a()).intValue()) {
            this.f22497r.f22472t.postValue(Boolean.valueOf(true));
        } else {
            this.f22497r.f22467o.postValue(new C8170c(SendGiftType.DOODLE_GIFT, bVar, true));
        }
    }

    /* renamed from: g */
    private void m25139g() {
        if (this.f22481b == null || !this.f22481b.mo4894e()) {
            if (this.f22481b == null) {
                m25135d();
            }
            Drawable drawable = this.context.getResources().getDrawable(R.drawable.c8q);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            if (this.f22480a.getId() == R.id.d36) {
                this.f22480a.setCompoundDrawables(drawable, null, null, null);
            } else {
                this.f22480a.setCompoundDrawables(null, null, drawable, null);
            }
            this.f22481b.mo4892d();
            Resources resources = this.context.getResources();
            ListView f = this.f22481b.mo4895f();
            if (f != null) {
                f.setVerticalScrollBarEnabled(false);
                f.setDivider(new ColorDrawable(resources.getColor(R.color.aka)));
                f.setDividerHeight(resources.getDimensionPixelSize(R.dimen.py));
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f22482c = C10296b.m30493a(this.context);
        this.f22497r = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f22498s = this.f22497r.f22453a;
        m25131b();
        m25133c();
        this.f22497r.f22470r.observe(this, new C8241i(this));
        this.f22497r.f22465m.observe(this, new C8242j(this));
        this.f22497r.f22471s.observe(this, new C8243k(this));
        this.f22500u.mo119660a();
        this.f22500u.mo119661a(C9097a.m27146a().mo22266a(C8296e.class).mo19325f((C7326g<? super T>) new C7326g<C8296e>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C8296e eVar) throws Exception {
                GiftPanelBottomWidget.this.onEvent(eVar);
            }
        }));
    }

    /* renamed from: b */
    private void m25131b() {
        this.f22483d = this.contentView.findViewById(R.id.cou);
        this.f22484e = (TextView) this.contentView.findViewById(R.id.dtc);
        this.f22485f = (TextView) this.contentView.findViewById(R.id.v5);
        this.f22486g = this.contentView.findViewById(R.id.v4);
        this.f22487h = (TextView) this.contentView.findViewById(R.id.cos);
        this.f22488i = this.contentView.findViewById(R.id.coq);
        this.f22489j = (TextView) this.contentView.findViewById(R.id.d2s);
        this.f22480a = (TextView) this.contentView.findViewById(R.id.d35);
        this.f22490k = (SpecialCombView) this.contentView.findViewById(R.id.d3e);
        this.f22485f.setOnClickListener(this);
        this.f22486g.setOnClickListener(this);
        this.f22489j.setOnClickListener(this);
        this.f22480a.setOnClickListener(this);
        this.f22490k.setOnClickListener(this);
        this.f22490k.setCountDownTime(this.f22494o);
        this.f22486g.setVisibility(8);
        Drawable drawable = this.context.getResources().getDrawable(R.drawable.c41);
        drawable.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.context, 16.0f), (int) C9738o.m28708b(this.context, 16.0f)));
        if (C3519c.m12965a(this.context)) {
            this.f22484e.setCompoundDrawables(null, null, drawable, null);
        } else {
            this.f22484e.setCompoundDrawables(drawable, null, null, null);
        }
        mo21350a((C8134a) null);
    }

    /* renamed from: d */
    private void m25135d() {
        this.f22481b = new ListPopupWindow(this.context);
        this.f22481b.mo5480a((OnDismissListener) new OnDismissListener() {
            public final void onDismiss() {
                Drawable drawable = GiftPanelBottomWidget.this.context.getResources().getDrawable(R.drawable.c8p);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                if (GiftPanelBottomWidget.this.f22480a.getId() == R.id.d36) {
                    GiftPanelBottomWidget.this.f22480a.setCompoundDrawables(drawable, null, null, null);
                } else {
                    GiftPanelBottomWidget.this.f22480a.setCompoundDrawables(null, null, drawable, null);
                }
                GiftPanelBottomWidget.this.f22481b = null;
            }
        });
        this.f22481b.mo5487c(this.context.getResources().getDimensionPixelSize(R.dimen.q2));
        this.f22481b.mo5488d(this.context.getResources().getDimensionPixelSize(R.dimen.q0));
        this.f22481b.mo5484b(this.context.getResources().getDimensionPixelSize(R.dimen.q1));
        if (C3519c.m12965a(this.context)) {
            this.f22481b.f4807g = -this.context.getResources().getDimensionPixelSize(R.dimen.pz);
        } else {
            this.f22481b.f4807g = this.context.getResources().getDimensionPixelSize(R.dimen.pz);
        }
        this.f22481b.mo5249a((ListAdapter) new C8114a(GiftManager.inst().getGroupCountInfo(), new C8115a() {
            /* renamed from: a */
            public final void mo21235a(int i) {
                if (GiftPanelBottomWidget.this.isViewValid()) {
                    if (GiftPanelBottomWidget.this.f22481b != null) {
                        GiftPanelBottomWidget.this.f22481b.dismiss();
                    }
                    if (i > 0 && i <= 1314) {
                        GiftPanelBottomWidget.this.f22482c.mo25021a("hotsoon.pref.GIFT_GROUP_COUNT", (Object) Integer.valueOf(i)).mo25023a();
                        GiftPanelBottomWidget.this.mo21349a(i);
                    }
                }
            }
        }));
        this.f22481b.f4814n = this.f22480a;
        this.f22481b.mo5479a(this.context.getResources().getDrawable(R.drawable.bq_));
        this.f22481b.mo5481a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21350a(C8134a aVar) {
        m25128a(aVar, false);
        m25134c(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21351a(C8169b bVar) {
        m25128a(this.f22491l, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21352a(Boolean bool) {
        if (bool.booleanValue()) {
            m25136d(this.f22491l);
        } else {
            m25140h();
        }
    }

    /* renamed from: b */
    private static SendGiftType m25130b(int i) {
        if (i == 4) {
            return SendGiftType.TASK_GIFT;
        }
        if (i == 6) {
            return SendGiftType.GIFT_AD;
        }
        switch (i) {
            case 1:
                return SendGiftType.GIFT;
            case 2:
                return SendGiftType.PROP;
            default:
                return SendGiftType.NORMAL;
        }
    }

    public void onEvent(C8296e eVar) {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        mo21350a(this.f22491l);
    }

    public void handleMsg(Message message) {
        if (message.what == 1001) {
            this.f22489j.setVisibility(0);
            this.f22490k.setVisibility(8);
            if (this.f22495p != null && this.f22495p.isStarted()) {
                this.f22495p.cancel();
            }
            mo21350a(this.f22491l);
            this.f22497r.mo21344c();
            this.f22497r.mo21345d();
            this.f22497r.f22465m.postValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    private void m25127a(C3693c cVar) {
        long j = 0;
        if (this.f22492m == MonetaryType.GOLDEN_BEAN) {
            TextView textView = this.f22484e;
            if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                j = (long) cVar.mo11162g();
            }
            textView.setText(String.valueOf(j));
            return;
        }
        TextView textView2 = this.f22484e;
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            j = cVar.mo11155b();
        }
        textView2.setText(String.valueOf(j));
    }

    /* renamed from: c */
    private void m25134c(C8134a aVar) {
        if (aVar != null && (aVar.f22206d instanceof C8149d)) {
            C8149d dVar = (C8149d) aVar.f22206d;
            if (dVar.f22234e == 11) {
                this.f22497r.f22478z.postValue(Long.valueOf(dVar.f22233d));
                return;
            }
        }
        this.f22497r.f22478z.postValue(Long.valueOf(0));
    }

    /* renamed from: d */
    private void m25136d(C8134a aVar) {
        if (aVar != null && aVar.mo21261b()) {
            this.f22489j.setVisibility(8);
            this.f22480a.setVisibility(8);
            this.f22490k.setVisibility(0);
            if (this.f22495p != null && this.f22495p.isRunning()) {
                this.f22495p.cancel();
            }
            this.f22495p = ObjectAnimator.ofFloat(this.f22490k, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) this.f22494o) * 1000);
            this.f22495p.start();
            this.f22490k.startScaleAnim(((long) this.f22494o) * 1000, null);
            if (this.f22496q.hasMessages(1001)) {
                this.f22496q.removeMessages(1001);
            }
            this.f22496q.sendEmptyMessageDelayed(1001, ((long) this.f22494o) * 1000);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.v5) {
            m25138f();
            return;
        }
        if (view.getId() != R.id.v4) {
            if (view.getId() == R.id.d2s) {
                if (this.f22491l != null) {
                    m25137e();
                } else if (((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b() <= 0) {
                    m25138f();
                }
            } else if (view.getId() == R.id.d35 || view.getId() == R.id.d36) {
                m25139g();
            } else if (view.getId() == R.id.d3e) {
                m25137e();
            }
        }
    }

    /* renamed from: a */
    private void m25129a(MonetaryType monetaryType) {
        Drawable drawable;
        int i;
        if (this.f22492m != monetaryType) {
            C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
            this.f22492m = monetaryType;
            if (C82085.f22506a[monetaryType.ordinal()] != 1) {
                drawable = this.context.getResources().getDrawable(R.drawable.c41);
                this.f22486g.setVisibility(8);
                this.f22485f.setVisibility(0);
                m25127a(walletCenter);
            } else {
                drawable = this.context.getResources().getDrawable(R.drawable.c5o);
                View view = this.f22486g;
                if (TextUtils.isEmpty(this.f22501v)) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                this.f22485f.setVisibility(8);
                m25127a(walletCenter);
            }
            drawable.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.context, 16.0f), (int) C9738o.m28708b(this.context, 16.0f)));
            if (C3519c.m12965a(this.context)) {
                this.f22484e.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.f22484e.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo21349a(int i) {
        this.f22493n = i;
        this.f22497r.f22456d = i;
        this.f22480a.setText(String.valueOf(this.f22493n));
        C8134a aVar = (C8134a) this.f22497r.f22470r.getValue();
        if (aVar != null && this.f22497r != null && this.f22497r.f22471s.getValue() == null) {
            this.f22497r.f22439A.postValue(Integer.valueOf(this.f22493n * aVar.mo21260a()));
        }
    }

    /* renamed from: a */
    private void m25128a(C8134a aVar, boolean z) {
        MonetaryType monetaryType;
        int i;
        if (this.f22491l == null || this.f22491l != aVar || z) {
            this.f22489j.setText(R.string.fc6);
            this.f22491l = aVar;
            int i2 = 8;
            if (aVar == null) {
                if (((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b() <= 0) {
                    this.f22489j.setBackgroundResource(R.drawable.btq);
                    this.f22489j.setText(R.string.fdw);
                } else {
                    this.f22489j.setBackgroundResource(R.drawable.bsw);
                }
                this.f22489j.setVisibility(0);
                this.f22480a.setVisibility(8);
                mo21349a(1);
            } else if (aVar.f22203a == 4 || this.f22497r.f22471s.getValue() != null || !aVar.mo21261b()) {
                this.f22489j.setBackgroundResource(R.drawable.btq);
                this.f22489j.setVisibility(0);
                this.f22480a.setVisibility(8);
                mo21349a(1);
            } else {
                this.f22493n = this.f22482c.mo25019a("hotsoon.pref.GIFT_GROUP_COUNT", 1);
                this.f22480a.setText(String.valueOf(this.f22493n));
                this.f22480a.setVisibility(0);
                TextView textView = this.f22480a;
                if (C3519c.m12965a(this.context)) {
                    i = R.drawable.bsy;
                } else {
                    i = R.drawable.bsx;
                }
                textView.setBackgroundResource(i);
                this.f22489j.setBackgroundResource(R.drawable.btq);
                this.f22489j.setVisibility(0);
                mo21349a(this.f22493n);
            }
            this.f22487h.setVisibility(8);
            this.f22488i.setVisibility(8);
            TextView textView2 = this.f22485f;
            if (this.f22492m != MonetaryType.GOLDEN_BEAN) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            this.f22484e.setVisibility(0);
            this.f22489j.setVisibility(0);
            if (aVar == null || !aVar.mo21263d()) {
                monetaryType = MonetaryType.DIAMOND;
            } else {
                monetaryType = MonetaryType.GOLDEN_BEAN;
            }
            m25129a(monetaryType);
        }
    }
}
