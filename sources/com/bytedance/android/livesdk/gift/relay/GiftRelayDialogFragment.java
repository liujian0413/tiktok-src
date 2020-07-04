package com.bytedance.android.livesdk.gift.relay;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.mvp.SendGiftFailException;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c.C8272a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

public class GiftRelayDialogFragment extends LiveDialogFragment implements OnClickListener, C9302a {

    /* renamed from: A */
    private C9301a f22651A;

    /* renamed from: B */
    private C8271c f22652B;

    /* renamed from: C */
    private String f22653C;

    /* renamed from: D */
    private String f22654D;

    /* renamed from: E */
    private TextView f22655E;

    /* renamed from: F */
    private View f22656F;

    /* renamed from: G */
    private int f22657G = ((Integer) C5864b.f17252G.mo10240a()).intValue();

    /* renamed from: H */
    private BaseDialogFragment f22658H;

    /* renamed from: I */
    private C8158m f22659I;

    /* renamed from: J */
    private C8986g<IUser> f22660J = new C8986g<IUser>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            super.onNext(iUser);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        }
    };

    /* renamed from: a */
    public boolean f22661a;

    /* renamed from: b */
    private Activity f22662b;

    /* renamed from: c */
    private DataCenter f22663c;

    /* renamed from: d */
    private Room f22664d;

    /* renamed from: e */
    private boolean f22665e;

    /* renamed from: f */
    private boolean f22666f;

    /* renamed from: g */
    private boolean f22667g;

    /* renamed from: h */
    private long f22668h;

    /* renamed from: i */
    private View f22669i;

    /* renamed from: k */
    private View f22670k;

    /* renamed from: l */
    private RecyclerView f22671l;

    /* renamed from: m */
    private GiftRelayAdapter f22672m;

    /* renamed from: n */
    private TextView f22673n;

    /* renamed from: o */
    private TextView f22674o;

    /* renamed from: p */
    private View f22675p;

    /* renamed from: q */
    private TextView f22676q;

    /* renamed from: r */
    private TextView f22677r;

    /* renamed from: s */
    private TextView f22678s;

    /* renamed from: t */
    private C7321c f22679t;

    /* renamed from: u */
    private View f22680u;

    /* renamed from: v */
    private View f22681v;

    /* renamed from: w */
    private boolean f22682w;

    /* renamed from: x */
    private C7321c f22683x;

    /* renamed from: y */
    private SpecialCombView f22684y;

    /* renamed from: z */
    private ObjectAnimator f22685z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21409a() throws Exception {
        this.f22682w = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21413a(C8272a aVar) {
        C8272a aVar2 = this.f22672m.f22646b;
        if (aVar2 != null) {
            int a = this.f22672m.mo21404a(aVar2);
            if (a >= 0) {
                C1293v f = this.f22671l.mo5575f(a);
                if (f instanceof GiftRelayViewHolder) {
                    ((GiftRelayViewHolder) f).mo21420a(false);
                }
            }
        }
        this.f22678s.setBackgroundResource(aVar == aVar2 ? R.drawable.c20 : R.drawable.bz3);
        if (this.f22651A.hasMessages(0)) {
            this.f22651A.removeMessages(0);
            this.f22651A.sendEmptyMessage(0);
        }
    }

    /* renamed from: a */
    public final void mo21414a(DataCenter dataCenter) {
        this.f22663c = dataCenter;
        this.f22663c.observe("data_is_gift_relay_showing", new C8275c(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21415a(KVData kVData) {
        if (kVData != null && this.f22678s != null) {
            this.f22678s.setText(this.f22662b.getResources().getString(kVData.getData() != null && ((Boolean) kVData.getData()).booleanValue() ? R.string.emc : R.string.fcz));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21411a(long j, long j2, C3479d dVar) throws Exception {
        m25268a((C8158m) dVar.data);
        C8282s.m25314a(j, this.f22664d.getId(), SystemClock.uptimeMillis() - j2);
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 0) {
            this.f22678s.setVisibility(0);
            this.f22684y.setVisibility(8);
            if (this.f22685z != null && this.f22685z.isStarted()) {
                this.f22685z.cancel();
            }
            m25278j();
        }
    }

    /* renamed from: d */
    private void m25274d() {
        if (this.f11448j) {
            m25267a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b());
        }
    }

    public void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        if (this.f22661a && this.f22663c != null && this.f22664d != null) {
            this.f22663c.lambda$put$1$DataCenter("cmd_send_gift", this.f22664d.getOwner());
            this.f22661a = false;
        }
    }

    /* renamed from: c */
    private void m25273c() {
        m25267a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b());
        this.f22679t = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19325f((C7326g<? super T>) new C8274b<Object>(this));
    }

    /* renamed from: f */
    private void m25276f() {
        if (getActivity() != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f22666f);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "click");
            ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog(getActivity(), bundle, this.f22663c, null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22679t != null && !this.f22679t.isDisposed()) {
            this.f22679t.dispose();
        }
        if (this.f22683x != null && !this.f22683x.isDisposed()) {
            this.f22683x.dispose();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f22672m.f22646b != null) {
            int a = this.f22672m.mo21404a(this.f22672m.f22646b);
            if (a >= 0) {
                C1293v f = this.f22671l.mo5575f(a);
                if (f instanceof GiftRelayViewHolder) {
                    ((GiftRelayViewHolder) f).mo21420a(false);
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        int intValue = ((Integer) this.f22663c.get("data_gift_relay_recent_sent_index", Integer.valueOf(-1))).intValue();
        if (intValue == -1) {
            m25266a(0);
        } else {
            m25266a(intValue);
        }
    }

    /* renamed from: e */
    private void m25275e() {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f22662b, C8987h.m26865a().mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10185a((C7498y<? super T>) this.f22660J);
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                m25276f();
            } else {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).openWallet(this.f22662b);
            }
        }
    }

    /* renamed from: k */
    private void m25279k() {
        this.f22678s.setVisibility(8);
        this.f22684y.setVisibility(0);
        if (this.f22685z != null && this.f22685z.isRunning()) {
            this.f22685z.cancel();
        }
        this.f22685z = ObjectAnimator.ofFloat(this.f22684y, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) this.f22657G) * 1000);
        this.f22685z.start();
        this.f22684y.startScaleAnim(((long) this.f22657G) * 1000, null);
        if (this.f22651A.hasMessages(0)) {
            this.f22651A.removeMessages(0);
        }
        this.f22651A.sendEmptyMessageDelayed(0, ((long) this.f22657G) * 1000);
    }

    /* renamed from: i */
    private void m25277i() {
        long j;
        if (this.f22672m != null && this.f22672m.f22646b != null) {
            C8272a aVar = this.f22672m.f22646b;
            if (this.f22652B != null) {
                j = this.f22652B.f22712c;
            } else {
                j = 0;
            }
            int i = aVar.f22716b;
            C8149d findGiftById = GiftManager.inst().findGiftById(j);
            if (findGiftById != null) {
                if (!((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) findGiftById.f22235f) && !((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest()) {
                    m25275e();
                } else if (!this.f22682w) {
                    this.f22682w = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, this.f22664d.getId(), this.f22664d.getOwnerUserId(), i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                    C8276d dVar = new C8276d(this, j, uptimeMillis);
                    this.f22683x = a.mo19281a((C7326g<? super T>) dVar, (C7326g<? super Throwable>) new C8277e<Object>(this, j), (C7323a) new C8278f(this));
                }
            }
        }
    }

    /* renamed from: j */
    private void m25278j() {
        String str;
        if (this.f22659I != null) {
            C8149d findGiftById = GiftManager.inst().findGiftById(this.f22659I.f22301e);
            if (findGiftById != null) {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f22659I.f22320x)) {
                    hashMap.put("request_page", this.f22659I.f22320x);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Long.valueOf(this.f22659I.f22301e), Integer.valueOf(this.f22659I.f22304h));
                hashMap.put("gift_info", C7895a.m24190a(hashMap2));
                hashMap.put("gift_cnt", String.valueOf(this.f22659I.f22304h));
                hashMap.put("money", String.valueOf(this.f22659I.f22304h * findGiftById.f22235f));
                hashMap.put("gift_type", "endless_gift");
                C8443c a = C8443c.m25663a();
                String str2 = "send_gift";
                Object[] objArr = new Object[4];
                C8438j jVar = new C8438j();
                if (this.f22666f) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr[0] = jVar.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                objArr[1] = Room.class;
                objArr[2] = this.f22659I;
                objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                a.mo21606a(str2, hashMap, objArr);
                this.f22659I = null;
            }
        }
    }

    /* renamed from: b */
    private void m25271b() {
        int i;
        int i2;
        View view = getView();
        if (view != null) {
            this.f22669i = view.findViewById(R.id.aru);
            this.f22670k = view.findViewById(R.id.as7);
            this.f22671l = (RecyclerView) view.findViewById(R.id.bn1);
            this.f22676q = (TextView) view.findViewById(R.id.dtc);
            this.f22677r = (TextView) view.findViewById(R.id.v5);
            this.f22678s = (TextView) view.findViewById(R.id.d2s);
            this.f22680u = view.findViewById(R.id.aro);
            this.f22681v = view.findViewById(R.id.as4);
            this.f22673n = (TextView) view.findViewById(R.id.as1);
            this.f22674o = (TextView) view.findViewById(R.id.as2);
            this.f22675p = view.findViewById(R.id.as3);
            this.f22684y = (SpecialCombView) view.findViewById(R.id.d3e);
            this.f22684y.setCountDownTime(this.f22657G);
            this.f22655E = (TextView) view.findViewById(R.id.as5);
            this.f22656F = view.findViewById(R.id.as6);
            this.f22669i.setOnClickListener(this);
            this.f22670k.setOnClickListener(this);
            this.f22677r.setOnClickListener(this);
            this.f22678s.setOnClickListener(this);
            this.f22680u.setOnClickListener(this);
            this.f22681v.setOnClickListener(this);
            this.f22684y.setOnClickListener(this);
            this.f22673n.setOnClickListener(this);
            this.f22674o.setOnClickListener(this);
            View view2 = this.f22680u;
            if (this.f22661a) {
                i = R.drawable.c1z;
            } else {
                i = R.drawable.c21;
            }
            view2.setBackgroundResource(i);
            if (this.f22663c != null) {
                boolean booleanValue = ((Boolean) this.f22663c.get("data_is_gift_relay_showing", Boolean.valueOf(false))).booleanValue();
                TextView textView = this.f22678s;
                Resources resources = this.f22662b.getResources();
                if (booleanValue) {
                    i2 = R.string.emc;
                } else {
                    i2 = R.string.fcz;
                }
                textView.setText(resources.getString(i2));
            }
            this.f22652B = GiftManager.inst().getGiftRelayInfo(this.f22668h);
            this.f22672m = new GiftRelayAdapter(this.f22662b, this.f22652B);
            this.f22671l.setAdapter(this.f22672m);
            if (this.f22652B != null) {
                this.f22672m.mo21407a(this.f22652B.f22713d);
                m25269a(this.f22652B.f22714e);
                this.f22654D = this.f22652B.f22710a;
                if (this.f22654D == null || this.f22654D.isEmpty()) {
                    this.f22681v.setVisibility(8);
                }
                this.f22653C = this.f22652B.f22711b;
                if (this.f22653C == null || this.f22653C.isEmpty()) {
                    this.f22675p.setVisibility(8);
                }
            }
            this.f22671l.setLayoutManager(new LinearLayoutManager(this.f22662b, 0, false));
            this.f22672m.f22647c = new C8268a(this);
            Drawable drawable = this.f22662b.getResources().getDrawable(R.drawable.c41);
            drawable.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.f22662b, 16.0f), (int) C9738o.m28708b((Context) this.f22662b, 16.0f)));
            if (C3519c.m12965a(this.f22662b)) {
                this.f22676q.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.f22676q.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21416a(Long l) throws Exception {
        m25274d();
    }

    /* renamed from: a */
    private void m25267a(long j) {
        TextView textView = this.f22676q;
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            j = 0;
        }
        textView.setText(String.valueOf(j));
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f22667g) {
            i = R.style.yt;
        } else {
            i = R.style.yr;
        }
        setStyle(1, i);
    }

    /* renamed from: a */
    private void m25266a(int i) {
        if (i >= 0) {
            for (C8272a aVar : this.f22672m.f22645a) {
                if (aVar != null) {
                    int a = this.f22672m.mo21404a(aVar);
                    if (a >= 0) {
                        C1293v f = this.f22671l.mo5575f(a);
                        if (f instanceof GiftRelayViewHolder) {
                            ((GiftRelayViewHolder) f).mo21420a(false);
                        }
                    }
                }
            }
            C1293v f2 = this.f22671l.mo5575f(i);
            if (f2 instanceof GiftRelayViewHolder) {
                ((GiftRelayViewHolder) f2).mo21420a(true);
            }
            this.f22678s.setBackgroundResource(R.drawable.bz3);
            this.f22672m.mo21405a(i);
        }
    }

    /* renamed from: b */
    private void m25272b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                if (new URI(str).getHost() != null) {
                    if (this.f22658H != null) {
                        this.f22658H.dismissAllowingStateLoss();
                        this.f22658H = null;
                    }
                    if (getContext() != null) {
                        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
                        double d = (double) i;
                        Double.isNaN(d);
                        this.f22658H = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11533a(C3979c.m13951a(str).mo11555a(i).mo11560b((int) (d * 1.4d)).mo11566e(80));
                        if (this.f22658H != null) {
                            BaseDialogFragment.m12686a((FragmentActivity) getContext(), (DialogFragment) this.f22658H);
                        }
                    }
                }
            } catch (URISyntaxException unused) {
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f22665e || (!this.f22666f && !C3387g.m12599a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f22665e) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f22667g) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3358ac.m12523c();
                attributes.height = C3358ac.m12520b() - C3358ac.m12525d();
                window.setAttributes(attributes);
            } else {
                window.setLayout(-1, -1);
            }
        }
        this.f22651A = new C9301a(this);
    }

    /* renamed from: a */
    private void m25268a(C8158m mVar) {
        if (mVar != null) {
            m25279k();
            this.f22659I = mVar;
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
            if (this.f22663c != null) {
                IMessageManager iMessageManager = (IMessageManager) this.f22663c.get("data_message_manager", null);
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(C8163o.m25003c(this.f22664d.getId(), mVar, this.f22664d.getOwner(), (User) this.f22663c.get("data_user_in_room", null)));
                    if (mVar.f22312p != null) {
                        mo21410a(mVar.f22312p.f22708m, mVar.f22312p.f22707l);
                    }
                    this.f22663c.lambda$put$1$DataCenter("data_gift_relay_recent_sent_index", Integer.valueOf(this.f22672m.mo21404a(this.f22672m.f22646b)));
                }
            }
        }
    }

    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (id == R.id.aru) {
                if (this.f22655E.getVisibility() == 0 && this.f22656F.getVisibility() == 0) {
                    this.f22655E.setVisibility(8);
                    this.f22656F.setVisibility(8);
                    return;
                }
                this.f22661a = false;
                dismissAllowingStateLoss();
            } else if (id == R.id.v5) {
                m25275e();
            } else if (id == R.id.d2s || id == R.id.d3e) {
                m25277i();
            } else if (id == R.id.as4 || id == R.id.as7) {
                m25272b(this.f22654D);
                HashMap hashMap = new HashMap();
                Room room = (Room) this.f22663c.get("data_room", null);
                if (room != null) {
                    long id2 = room.getOwner().getId();
                    long id3 = room.getId();
                    hashMap.put("anchor_id", String.valueOf(id2));
                    hashMap.put("room_id", String.valueOf(id3));
                }
                C8443c.m25663a().mo21606a("livesdk_endless_gift_rule_click", hashMap, new Object[0]);
            } else if (id == R.id.aro) {
                dismissAllowingStateLoss();
            } else {
                if (id == R.id.as1 || id == R.id.as2) {
                    m25272b(this.f22653C);
                    HashMap hashMap2 = new HashMap();
                    Room room2 = (Room) this.f22663c.get("data_room", null);
                    if (room2 != null) {
                        long id4 = room2.getOwner().getId();
                        long id5 = room2.getId();
                        hashMap2.put("anchor_id", String.valueOf(id4));
                        hashMap2.put("room_id", String.valueOf(id5));
                    }
                    C8443c.m25663a().mo21606a("livesdk_endless_gift_rank_click", hashMap2, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    private void m25269a(String str) {
        if (str != null && !str.isEmpty() && C7285c.m22838a(this.f22662b, "live_sp_gift_relay", 0).getBoolean("show_tips", true)) {
            C7285c.m22838a(this.f22662b, "live_sp_gift_relay", 0).edit().putBoolean("show_tips", false).apply();
            this.f22655E.setVisibility(0);
            this.f22656F.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            String str2 = "";
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '<') {
                    if (!str2.isEmpty()) {
                        arrayList.add(str2);
                        str2 = "";
                    }
                    z = false;
                    z2 = false;
                    z3 = true;
                } else if (charAt == '>') {
                    z = true;
                    z3 = false;
                } else if (z && z2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(charAt);
                    str2 = sb2.toString();
                    sb.append(charAt);
                } else if (!z3) {
                    sb.append(charAt);
                } else if (charAt == '#') {
                    z2 = true;
                }
            }
            String sb3 = sb.toString();
            SpannableString spannableString = new SpannableString(sb3);
            for (String str3 : arrayList) {
                if (str3 != null && !str3.isEmpty()) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#F5A60A"));
                    int indexOf = sb3.indexOf(str3);
                    spannableString.setSpan(foregroundColorSpan, indexOf, str3.length() + indexOf, 34);
                }
            }
            this.f22655E.setText(spannableString);
        }
    }

    /* renamed from: a */
    private void m25270a(Throwable th) {
        if (!(th instanceof SendGiftFailException)) {
            boolean z = th instanceof ApiServerException;
            if (!z || ((ApiServerException) th).getErrorCode() != 40001) {
                if (z) {
                    C9049ap.m27028a(((ApiServerException) th).getPrompt());
                    return;
                } else {
                    C9049ap.m27022a((int) R.string.fcb);
                    return;
                }
            }
        }
        m25275e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21412a(long j, Throwable th) throws Exception {
        this.f22682w = false;
        m25270a(th);
        C8282s.m25315a(j, this.f22664d.getId(), th);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m25271b();
        m25273c();
    }

    /* renamed from: a */
    public final void mo21410a(long j, long j2) {
        if (j == 1) {
            this.f22673n.setText(this.f22662b.getResources().getString(R.string.emj));
            TextView textView = this.f22674o;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22662b.getResources().getString(R.string.eme, new Object[]{String.valueOf(j)}));
            sb.append(" ");
            textView.setText(sb.toString());
        } else if (j > 100 || j < 1) {
            this.f22673n.setText(this.f22662b.getResources().getString(R.string.emj));
            TextView textView2 = this.f22674o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f22662b.getResources().getString(R.string.eml));
            sb2.append(" ");
            textView2.setText(sb2.toString());
        } else {
            this.f22673n.setText(this.f22662b.getResources().getString(R.string.emk, new Object[]{String.valueOf(j2)}));
            TextView textView3 = this.f22674o;
            Resources resources = this.f22662b.getResources();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.valueOf(j));
            sb3.append(" ");
            textView3.setText(resources.getString(R.string.eme, new Object[]{sb3.toString()}));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.anp, viewGroup, false);
    }

    /* renamed from: a */
    public static GiftRelayDialogFragment m25265a(Activity activity, Room room, boolean z, boolean z2, String str, long j) {
        boolean z3;
        GiftRelayDialogFragment giftRelayDialogFragment = new GiftRelayDialogFragment();
        giftRelayDialogFragment.f22662b = activity;
        giftRelayDialogFragment.f22664d = room;
        giftRelayDialogFragment.f22665e = z;
        giftRelayDialogFragment.f22666f = z2;
        if (!z || (!z2 && !C3387g.m12599a(activity))) {
            z3 = false;
        } else {
            z3 = true;
        }
        giftRelayDialogFragment.f22667g = z3;
        giftRelayDialogFragment.f22661a = "gift_panel".equals(str);
        giftRelayDialogFragment.f22668h = j;
        return giftRelayDialogFragment;
    }
}
