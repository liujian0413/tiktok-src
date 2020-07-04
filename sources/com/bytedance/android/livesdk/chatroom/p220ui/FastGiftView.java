package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.presenter.C5040t;
import com.bytedance.android.livesdk.chatroom.presenter.C5040t.C5042a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.widget.C9252i;
import com.bytedance.android.livesdk.widget.C9252i.C9253a;
import com.bytedance.android.livesdk.widget.CircleProgressView;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.FastGiftView */
public class FastGiftView extends FrameLayout implements C5042a, C6310a {

    /* renamed from: A */
    private boolean f14540A;

    /* renamed from: B */
    private Activity f14541B;

    /* renamed from: C */
    private boolean f14542C;

    /* renamed from: D */
    private boolean f14543D;

    /* renamed from: E */
    private boolean f14544E;

    /* renamed from: F */
    private String f14545F;

    /* renamed from: G */
    private TextView f14546G;

    /* renamed from: H */
    private C5080a f14547H;

    /* renamed from: a */
    public AnimatorSet f14548a;

    /* renamed from: b */
    public Dialog f14549b;

    /* renamed from: c */
    public C8791d f14550c;

    /* renamed from: d */
    public boolean f14551d;

    /* renamed from: e */
    public C5040t f14552e;

    /* renamed from: f */
    public Runnable f14553f;

    /* renamed from: g */
    public Runnable f14554g;

    /* renamed from: h */
    private int f14555h;

    /* renamed from: i */
    private AutoRTLImageView f14556i;

    /* renamed from: j */
    private CircleProgressView f14557j;

    /* renamed from: k */
    private ObjectAnimator f14558k;

    /* renamed from: l */
    private View f14559l;

    /* renamed from: m */
    private TextView f14560m;

    /* renamed from: n */
    private ObjectAnimator f14561n;

    /* renamed from: o */
    private Dialog f14562o;

    /* renamed from: p */
    private Dialog f14563p;

    /* renamed from: q */
    private boolean f14564q;

    /* renamed from: r */
    private int f14565r;

    /* renamed from: s */
    private int f14566s;

    /* renamed from: t */
    private int f14567t;

    /* renamed from: u */
    private int f14568u;

    /* renamed from: v */
    private C6309f f14569v;

    /* renamed from: w */
    private DataCenter f14570w;

    /* renamed from: x */
    private Room f14571x;

    /* renamed from: y */
    private boolean f14572y;

    /* renamed from: z */
    private boolean f14573z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.FastGiftView$a */
    public interface C5080a {
    }

    /* renamed from: g */
    private boolean m16362g() {
        this.f14570w.get("data_user_in_room");
        LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo10240a();
        return false;
    }

    /* renamed from: o */
    private void m16370o() {
        m16358a(this.f14552e.f14324e);
        this.f14552e.mo13079j();
    }

    /* renamed from: c */
    public final void mo13088c() {
        if (this.f14551d) {
            C9049ap.m27022a((int) R.string.es1);
        }
    }

    /* renamed from: n */
    private void m16369n() {
        if (this.f14546G != null) {
            ViewParent parent = this.f14546G.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14546G);
            }
        }
    }

    /* renamed from: j */
    private boolean m16365j() {
        if (((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) this.f14552e.mo13076g())) {
            return false;
        }
        String channel = ((IHostContext) C3596c.m13172a(IHostContext.class)).getChannel();
        if ("test".equals(channel) || "local_test".equals(channel)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m16366k() {
        if (this.f14541B instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f14573z);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "shortcut_gift");
            ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f14541B, bundle, this.f14570w, null);
        }
    }

    /* renamed from: p */
    private static void m16371p() {
        C8443c.m25663a().mo21607a("shortcut_gift_show", Room.class, new C8438j().mo21598a("live_detail").mo21600c("bottom_tab").mo21599b("live").mo21603f("other"));
    }

    /* renamed from: r */
    private static void m16373r() {
        C8443c.m25663a().mo21607a("shortcut_gift_click", Room.class, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail").mo21600c("bottom_tab"));
    }

    /* renamed from: s */
    private static void m16374s() {
        C8443c.m25663a().mo21607a("first_recharge_success", Room.class, new C8438j().mo21598a("live_detail").mo21600c("live").mo21599b("live").mo21603f("other"));
    }

    /* renamed from: a */
    public final void mo13083a() {
        if (this.f14551d && this.f14552e.mo13074d()) {
            C9049ap.m27022a((int) R.string.fc7);
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                m16366k();
                return;
            }
            Activity a = C3384d.m12589a(getContext());
            if (a != null) {
                ((IHostApp) C3596c.m13172a(IHostApp.class)).openWallet(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14551d = true;
        m16360e();
        this.f14552e.mo9142a((C5042a) this);
        mo13087b();
        ((C3245ad) C9097a.m27146a().mo22266a(C8296e.class).mo19297a((C7494t<T, ? extends R>) C3255e.m12296a((View) this))).mo10182a((C7326g<? super T>) new C7326g<C8296e>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C8296e eVar) throws Exception {
                FastGiftView.this.onEvent(eVar);
            }
        });
    }

    /* renamed from: f */
    private TextView m16361f() {
        TextView textView = new TextView(getContext());
        int b = (int) C9738o.m28708b(getContext(), 24.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 4.0f);
        LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 28.0f), (int) C9738o.m28708b(getContext(), 12.0f));
        layoutParams.topMargin = b;
        layoutParams.leftMargin = b2;
        layoutParams.rightMargin = b2;
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundResource(R.drawable.ce9);
        textView.setTextSize(8.0f);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setText(R.string.erv);
        return textView;
    }

    /* renamed from: i */
    private void m16364i() {
        boolean z;
        if (!m16365j()) {
            if (this.f14571x == null || this.f14571x.mRoomAuthStatus == null || !this.f14571x.mRoomAuthStatus.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C9049ap.m27022a((int) R.string.edv);
            }
            if (this.f14552e.f14321b) {
                m16363h();
            } else if (this.f14551d && this.f14552e.mo13074d() && !this.f14552e.f14322c) {
                this.f14552e.mo13069a(getContext());
            }
        } else if (((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo10240a()).booleanValue()) {
            mo13083a();
        } else {
            C9049ap.m27022a((int) R.string.fc7);
        }
    }

    /* renamed from: m */
    private void m16368m() {
        if (this.f14552e.mo13077h()) {
            if (this.f14558k == null) {
                this.f14558k = ObjectAnimator.ofFloat(this.f14557j, "progress", new float[]{360.0f, 0.0f});
                this.f14558k.setDuration(((long) this.f14555h) * 1000);
            } else if (this.f14558k.isRunning()) {
                this.f14558k.cancel();
            }
            this.f14557j.setVisibility(0);
            this.f14558k.start();
            if (this.f14569v.hasMessages(2)) {
                this.f14569v.removeMessages(2);
            }
            this.f14569v.sendEmptyMessageDelayed(2, ((long) this.f14555h) * 1000);
            return;
        }
        this.f14572y = false;
        this.f14556i.setVisibility(0);
        this.f14557j.setVisibility(8);
        m16370o();
    }

    /* renamed from: q */
    private static void m16372q() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("convenient_gift_show", hashMap, Room.class, new C8438j().mo21598a("live_detail").mo21600c("bottom_tab").mo21599b("live").mo21603f("other"));
    }

    /* renamed from: b */
    public final void mo13087b() {
        if (this.f14551d && this.f14540A) {
            if (this.f14573z) {
                this.f14570w.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.valueOf(false));
                this.f14564q = true;
            } else if (!this.f14564q && this.f14552e.mo13074d()) {
                this.f14564q = true;
                C5343e.m17045b(this.f14556i, C5040t.m16160e().f22231b, this.f14566s, this.f14566s, 0);
                this.f14570w.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.valueOf(true));
                postDelayed(new Runnable() {
                    public final void run() {
                        if (FastGiftView.this.f14551d && ((IPropertyCache) C3596c.m13172a(IPropertyCache.class)).mo22767a(Properties.NEED_FAST_GIFT_HINT) && FastGiftView.this.isShown()) {
                            FastGiftView.this.f14550c = (C8791d) ((C8791d) ((C8791d) C8791d.m26348b(FastGiftView.this.getContext()).mo21843a((int) R.layout.axv)).mo21855c(true)).mo21842a();
                            FastGiftView.this.f14550c.mo21849a(FastGiftView.this, 1, 4, C3358ac.m12510a(20.0f), C3358ac.m12510a(-4.0f));
                            FastGiftView.this.postDelayed(FastGiftView.this.f14554g, 3000);
                            ((IPropertyCache) C3596c.m13172a(IPropertyCache.class)).mo22766a((C9283a) Properties.NEED_FAST_GIFT_HINT, false);
                        }
                    }
                }, 500);
                m16371p();
                if (isShown()) {
                    m16372q();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f14551d = false;
        this.f14552e.mo8963a();
        removeCallbacks(this.f14554g);
        if (this.f14563p != null && this.f14563p.isShowing()) {
            C5331x.m17002a(this.f14563p);
        }
        if (this.f14562o != null && this.f14562o.isShowing()) {
            C5331x.m17002a(this.f14562o);
        }
        if (this.f14549b != null && this.f14549b.isShowing()) {
            C5331x.m17002a(this.f14549b);
        }
        if (this.f14550c != null && this.f14550c.mo21856c()) {
            this.f14550c.dismiss();
        }
        this.f14541B = null;
        this.f14570w = null;
        this.f14564q = false;
        this.f14572y = false;
        this.f14540A = false;
        this.f14542C = false;
        this.f14543D = false;
        this.f14568u = this.f14555h;
        this.f14569v.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    /* renamed from: h */
    private void m16363h() {
        if (this.f14551d && this.f14552e.mo13074d()) {
            C8149d e = C5040t.m16160e();
            C8443c.m25663a().mo21607a("shortcut_popup_show", Room.class, C8438j.class);
            if (this.f14563p != null) {
                if (!this.f14563p.isShowing()) {
                    this.f14563p.show();
                }
                return;
            }
            C9252i.m27529a();
            C9253a a = C9252i.m27528a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aoi, null);
            ((TextView) inflate.findViewById(R.id.bok)).setText(R.string.ers);
            ((TextView) inflate.findViewById(R.id.bof)).setText(R.string.erp);
            ((TextView) inflate.findViewById(R.id.boj)).setText(getContext().getString(R.string.err, new Object[]{Integer.valueOf(e.f22235f)}));
            a.mo22724b(inflate);
            this.f14563p = a.mo22722b(0, (int) R.string.es0, (OnClickListener) new C5329v(this)).mo22722b(1, (int) R.string.ero, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    HashMap hashMap = new HashMap();
                    hashMap.put("button_type", "cancel");
                    C8443c.m25663a().mo21606a("shortcut_popup_click", hashMap, Room.class, C8438j.class);
                }
            }).mo22729d();
        }
    }

    /* renamed from: l */
    private void m16367l() {
        if (this.f14552e.mo13077h()) {
            if (!this.f14572y) {
                this.f14556i.setVisibility(8);
                this.f14559l.setVisibility(0);
                this.f14560m.setVisibility(0);
                m16359b(false);
            }
            if (this.f14561n == null) {
                this.f14561n = ObjectAnimator.ofFloat(this.f14559l, "rotation", new float[]{0.0f, 360.0f});
                this.f14561n.setDuration(500);
                this.f14561n.setInterpolator(new LinearInterpolator());
                this.f14561n.setRepeatCount(-1);
                this.f14561n.setRepeatMode(1);
            } else if (this.f14561n.isRunning()) {
                this.f14561n.cancel();
            }
            this.f14572y = true;
            this.f14568u = this.f14555h;
            this.f14560m.setText(String.valueOf(this.f14568u));
            this.f14561n.start();
            this.f14569v.removeMessages(1);
            this.f14569v.sendEmptyMessageDelayed(1, 1000);
            return;
        }
        this.f14572y = false;
        this.f14556i.setVisibility(0);
        this.f14559l.setVisibility(8);
        this.f14560m.setVisibility(8);
        m16359b(true);
        m16370o();
    }

    /* renamed from: d */
    public final void mo13193d() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (a != null && a.childrenManagerForbidWalletFunctions()) {
            C3517a.m12960a(getContext(), (int) R.string.edf);
        } else if (this.f14551d && this.f14552e.mo13074d() && !this.f14552e.f14322c) {
            m16373r();
            if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(getContext(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22188a(-1).mo22193d("live_detail").mo22194e("enableGift").mo22192c("bottom_tab").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
                m16362g();
                m16364i();
            }
        }
    }

    /* renamed from: e */
    private void m16360e() {
        m16359b(true);
        this.f14557j = new CircleProgressView(getContext());
        this.f14557j.setLayoutParams(new ViewGroup.LayoutParams(this.f14565r, this.f14565r));
        this.f14557j.setVisibility(8);
        addView(this.f14557j);
        this.f14559l = new View(getContext());
        this.f14559l.setLayoutParams(new ViewGroup.LayoutParams(this.f14565r, this.f14565r));
        this.f14559l.setBackgroundResource(R.drawable.c5l);
        this.f14559l.setVisibility(8);
        addView(this.f14559l);
        this.f14560m = new TextView(getContext());
        int b = (int) C9738o.m28708b(getContext(), 32.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 2.0f);
        LayoutParams layoutParams = new LayoutParams(b, b);
        layoutParams.topMargin = b2;
        layoutParams.leftMargin = b2;
        this.f14560m.setLayoutParams(layoutParams);
        this.f14560m.setBackgroundResource(R.drawable.ce8);
        this.f14560m.setTextSize(16.0f);
        this.f14560m.setGravity(17);
        this.f14560m.setTextColor(-1);
        this.f14560m.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (FastGiftView.this.f14551d && !FastGiftView.this.f14552e.f14322c) {
                    FastGiftView.this.mo13193d();
                }
            }
        });
        this.f14560m.setVisibility(8);
        addView(this.f14560m);
        this.f14556i = new AutoRTLImageView(getContext());
        int b3 = (int) C9738o.m28708b(getContext(), 5.0f);
        LayoutParams layoutParams2 = new LayoutParams(this.f14566s, this.f14566s);
        layoutParams2.topMargin = b3;
        layoutParams2.leftMargin = b3;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(b3);
        }
        this.f14556i.setLayoutParams(layoutParams2);
        RoundingParams roundingParams = new C13439b(getResources()).mo32908a().f35619a;
        if (roundingParams != null) {
            roundingParams.mo32879a((float) this.f14567t);
        }
        this.f14556i.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (FastGiftView.this.f14551d && !FastGiftView.this.f14552e.f14322c && (FastGiftView.this.f14548a == null || !FastGiftView.this.f14548a.isRunning())) {
                    if (!FastGiftView.this.f14552e.mo13077h()) {
                        if (FastGiftView.this.f14548a == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(FastGiftView.this, "scaleX", new float[]{1.0f, 1.3f, 1.0f});
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(FastGiftView.this, "scaleY", new float[]{1.0f, 1.3f, 1.0f});
                            FastGiftView.this.f14548a = new AnimatorSet();
                            FastGiftView.this.f14548a.setInterpolator(new LinearInterpolator());
                            FastGiftView.this.f14548a.setDuration(300);
                            FastGiftView.this.f14548a.playTogether(new Animator[]{ofFloat, ofFloat2});
                        }
                        FastGiftView.this.f14548a.start();
                        FastGiftView.this.postDelayed(FastGiftView.this.f14553f, 300);
                        return;
                    }
                    FastGiftView.this.mo13193d();
                }
            }
        });
        addView(this.f14556i);
    }

    public void setOnGiftClickListener(C5080a aVar) {
        this.f14547H = aVar;
    }

    public FastGiftView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo13085a(String str) {
        if (this.f14551d) {
            C9049ap.m27028a(str);
        }
    }

    /* renamed from: b */
    private void m16359b(boolean z) {
        int i;
        if (z) {
            i = R.drawable.cej;
        } else {
            i = 0;
        }
        setBackgroundResource(i);
    }

    public void onEvent(C8296e eVar) {
        if (this.f14542C && this.f14543D) {
            m16374s();
        }
        this.f14542C = false;
    }

    public void setNeverPay(boolean z) {
        if (!z || ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b() > 0) {
            this.f14542C = z;
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            switch (message.what) {
                case 1:
                    this.f14568u--;
                    if (this.f14568u <= 0) {
                        this.f14572y = false;
                        this.f14556i.setVisibility(0);
                        this.f14559l.setVisibility(8);
                        this.f14560m.setVisibility(8);
                        m16359b(true);
                        this.f14569v.removeMessages(1);
                        if (this.f14561n != null && this.f14561n.isRunning()) {
                            this.f14561n.end();
                        }
                        m16370o();
                        return;
                    }
                    this.f14572y = true;
                    this.f14560m.setText(String.valueOf(this.f14568u));
                    this.f14569v.sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    this.f14557j.setVisibility(8);
                    m16370o();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m16358a(int i) {
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("gift_type", "convenient_gift");
            hashMap.put("gift_cnt", String.valueOf(i));
            hashMap.put("gift_id", String.valueOf(this.f14552e.mo13075f()));
            hashMap.put("money", String.valueOf(this.f14552e.mo13076g() * i));
            hashMap.put("request_page", "shortcut");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Long.valueOf(this.f14552e.mo13075f()), Integer.valueOf(i));
            hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
            hashMap.put("growth_deepevent", "1");
            C8443c.m25663a().mo21606a("send_gift", hashMap, new C8438j().mo21598a("live_detail").mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other"), Room.class, ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog());
        }
    }

    /* renamed from: a */
    public final void mo13084a(C8158m mVar) {
        int i;
        if (this.f14551d && mVar != null) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22177a(true);
            if (this.f14570w != null) {
                User user = (User) this.f14570w.get("data_user_in_room");
                IMessageManager iMessageManager = (IMessageManager) this.f14570w.get("data_message_manager");
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(C8163o.m24998a(this.f14571x.getId(), mVar, user));
                }
            }
            this.f14552e.mo13078i();
            if (((Integer) LiveSettingKeys.LIVE_FAST_GIFT_COMBO_STYLE.mo10240a()).intValue() == 1) {
                m16368m();
            } else {
                m16367l();
            }
            int i2 = 0;
            if (C9074l.m27086b(this.f14570w) && this.f14571x.author() != null) {
                C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
                JSONObject jSONObject = new JSONObject();
                String str = "amount";
                if (findGiftById == null) {
                    i = 0;
                } else {
                    try {
                        i = findGiftById.f22235f;
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str, String.valueOf(i));
                jSONObject.put("anchor_id", String.valueOf(this.f14571x.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f14571x.getId()));
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.f14570w));
            }
            if (C9074l.m27089d(this.f14570w) && this.f14571x.author() != null) {
                C8149d findGiftById2 = GiftManager.inst().findGiftById(mVar.f22301e);
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "amount";
                if (findGiftById2 != null) {
                    try {
                        i2 = findGiftById2.f22235f;
                    } catch (JSONException unused2) {
                    }
                }
                jSONObject2.put(str2, String.valueOf(i2));
                jSONObject2.put("anchor_id", String.valueOf(this.f14571x.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f14571x.getId()));
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.f14570w));
            }
        }
    }

    /* renamed from: a */
    public final void mo13086a(boolean z) {
        if (this.f14551d && this.f14540A) {
            C5343e.m17045b(this.f14556i, C5040t.m16160e().f22231b, this.f14566s, this.f14566s, 0);
            if (z) {
                if (this.f14546G == null) {
                    this.f14546G = m16361f();
                } else {
                    m16369n();
                }
                addView(this.f14546G);
                return;
            }
            m16369n();
        }
    }

    public FastGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13191a(DialogInterface dialogInterface, int i) {
        this.f14552e.mo13073b();
        dialogInterface.dismiss();
        m16364i();
        HashMap hashMap = new HashMap();
        hashMap.put("button_type", "send");
        C8443c.m25663a().mo21606a("shortcut_popup_click", hashMap, Room.class, C8438j.class);
    }

    public FastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14568u = this.f14555h;
        this.f14545F = "";
        this.f14553f = new Runnable() {
            public final void run() {
                FastGiftView.this.mo13193d();
            }
        };
        this.f14554g = new Runnable() {
            public final void run() {
                if (FastGiftView.this.f14551d && FastGiftView.this.f14549b != null && FastGiftView.this.f14549b.isShowing()) {
                    C5330w.m17001a(FastGiftView.this.f14549b);
                }
                if (FastGiftView.this.f14551d && FastGiftView.this.f14550c != null && FastGiftView.this.f14550c.mo21856c()) {
                    FastGiftView.this.f14550c.dismiss();
                }
            }
        };
        this.f14547H = null;
        this.f14565r = (int) C9738o.m28708b(getContext(), 36.0f);
        this.f14566s = (int) C9738o.m28708b(getContext(), 26.0f);
        this.f14567t = (int) C9738o.m28708b(getContext(), 20.0f);
        this.f14555h = ((Integer) C5864b.f17252G.mo10240a()).intValue();
        this.f14552e = new C5040t();
        this.f14569v = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo13192a(DataCenter dataCenter, Activity activity, String str) {
        this.f14570w = dataCenter;
        this.f14571x = (Room) dataCenter.get("data_room");
        this.f14552e.f14323d = this.f14571x;
        this.f14573z = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        this.f14541B = activity;
        this.f14545F = str;
        this.f14540A = true;
        this.f14544E = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        this.f14552e.f14320a = this.f14545F;
        mo13087b();
    }
}
