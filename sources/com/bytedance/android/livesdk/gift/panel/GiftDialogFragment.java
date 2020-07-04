package com.bytedance.android.livesdk.gift.panel;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.C4423ao;
import com.bytedance.android.livesdk.chatroom.event.C4441k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8263r.C8264a;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.C8289y;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.C8159n;
import com.bytedance.android.livesdk.gift.model.C8161p;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.p372b.C7879a;
import com.bytedance.android.livesdk.gift.p373c.C7885d;
import com.bytedance.android.livesdk.gift.panel.C8186l.C8188a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8170c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendGiftType;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p460k.C9498a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7498y;

public class GiftDialogFragment extends LiveDialogFragment implements C8188a {

    /* renamed from: a */
    public SendToType f22329a;

    /* renamed from: b */
    public GiftDialogViewModel f22330b;

    /* renamed from: c */
    public WidgetManager f22331c;

    /* renamed from: d */
    public DataCenter f22332d;

    /* renamed from: e */
    public C8264a f22333e;

    /* renamed from: f */
    private Activity f22334f;

    /* renamed from: g */
    private Room f22335g;

    /* renamed from: h */
    private User f22336h;

    /* renamed from: i */
    private boolean f22337i;

    /* renamed from: k */
    private boolean f22338k;

    /* renamed from: l */
    private String f22339l;

    /* renamed from: m */
    private boolean f22340m;

    /* renamed from: n */
    private PanelType f22341n;

    /* renamed from: o */
    private boolean f22342o;

    /* renamed from: p */
    private C8186l f22343p;

    /* renamed from: q */
    private View f22344q;

    /* renamed from: r */
    private View f22345r;

    /* renamed from: s */
    private boolean f22346s;

    /* renamed from: t */
    private boolean f22347t;

    /* renamed from: u */
    private C7879a f22348u;

    /* renamed from: v */
    private View f22349v;

    /* renamed from: w */
    private boolean f22350w;

    /* renamed from: x */
    private C8986g<IUser> f22351x = new C8986g<IUser>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            super.onNext(iUser);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
            GiftDialogFragment.this.f22330b.f22464l.postValue(User.from(iUser));
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21287a(C8134a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21294a(boolean z) {
    }

    /* renamed from: d */
    private void m25012d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo21300b(boolean z) {
    }

    public void dismiss() {
        dismissAllowingStateLoss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21292a(Boolean bool) {
        dismiss();
    }

    /* renamed from: a */
    public final void mo21293a(Exception exc) {
        if (this.f22333e != null) {
            this.f22333e.mo13796a(exc, new C8177c(this));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f22330b != null) {
            this.f22330b.mo21338a((C0043i) this);
        }
    }

    /* renamed from: a */
    public final void mo21284a() {
        if (this.f11448j) {
            this.f22330b.f22470r.postValue(null);
            this.f22330b.f22465m.postValue(Boolean.valueOf(false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21295b() {
        if (getDialog() != null && getDialog().isShowing()) {
            dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (this.f22332d != null) {
            this.f22332d.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C4441k(this.f22344q.getMeasuredHeight(), false));
        }
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f22350w));
        if (this.f22330b != null) {
            this.f22330b.mo21344c();
            this.f22330b.mo21345d();
        }
        super.dismissAllowingStateLoss();
    }

    /* renamed from: h */
    public final boolean mo11346h() {
        if (this.f22332d != null) {
            this.f22332d.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C4441k(this.f22344q.getMeasuredHeight(), false));
        }
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f22350w));
        return super.mo11346h();
    }

    /* renamed from: c */
    private void m25009c() {
        View view = getView();
        if (view != null) {
            this.f22345r = view.findViewById(R.id.a9l);
            this.f22345r.setOnClickListener(new C8182h(this));
            this.f22344q = view.findViewById(R.id.a8h);
            this.f22349v = view.findViewById(R.id.aqq);
            this.f22349v.setOnClickListener(new C8183i(this));
            m25010c(view);
            if (this.f22346s) {
                Dialog dialog = getDialog();
                if (!(dialog == null || dialog.getWindow() == null)) {
                    Window window = dialog.getWindow();
                    window.addFlags(2);
                    window.setDimAmount(0.7f);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21286a(View view) {
        m25012d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21296b(View view) {
        dismiss();
    }

    /* renamed from: b */
    public final void mo21297b(C8158m mVar) {
        C9049ap.m27022a((int) R.string.fc9);
        mo21288a(mVar);
    }

    /* renamed from: c */
    public final void mo21301c(Exception exc) {
        C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.fcb);
    }

    /* renamed from: d */
    public final void mo21302d(Exception exc) {
        mo21293a(exc);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f22347t) {
            i = R.style.yt;
        } else {
            i = R.style.yr;
        }
        setStyle(1, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21298b(Boolean bool) {
        m25005a("click");
    }

    /* renamed from: b */
    private void m25008b(String str) {
        if (getActivity() != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f22337i);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
            if (((IWalletService) C3596c.m13172a(IWalletService.class)).getRechargeType() != 3) {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog(getActivity(), bundle, this.f22332d, null);
                return;
            }
            ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog(getActivity(), bundle, this.f22332d, null);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f22338k || (!this.f22337i && !C3387g.m12599a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f22338k) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f22347t) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3358ac.m12523c();
                attributes.height = C3358ac.m12520b() - C3358ac.m12525d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: a */
    private void m25005a(String str) {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f22334f, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f69)).mo22188a(1002).mo22193d("live_detail").mo22194e("gift_send").mo22192c("enableGift").mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10185a((C7498y<? super T>) this.f22351x);
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                m25008b(str);
            } else {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).openWallet(this.f22334f);
            }
        }
    }

    /* renamed from: c */
    private void m25010c(View view) {
        long j;
        this.f22331c = WidgetManager.m32095of((Fragment) this, view);
        this.f22331c.setDataCenter(this.f22332d);
        this.f22331c.load(R.id.ar0, C8175ae.m25048a(this.f22338k, this.f22329a));
        final Widget b = C8175ae.m25049b();
        this.f22331c.load(R.id.ard, b);
        final boolean isGiftListLoaded = GiftManager.inst().isGiftListLoaded();
        final Widget a = C8175ae.m25046a(this.f22329a, 0);
        if (isGiftListLoaded) {
            this.f22331c.load(R.id.arg, C8175ae.m25046a(this.f22329a, GiftManager.inst().getCurrentStrategyByLiveType()));
        } else {
            this.f22331c.load(R.id.arg, a);
        }
        C81662 r6 = new C3435e() {
            /* renamed from: a */
            public final void mo8799a(List<C8149d> list) {
                if (b instanceof GiftPanelListWidget) {
                    ((GiftPanelListWidget) b).mo21376b(list);
                }
            }

            /* renamed from: b */
            public final void mo8800b(List<GiftPage> list) {
                if (b instanceof GiftPanelListWidget) {
                    ((GiftPanelListWidget) b).mo21377c(list);
                }
                if (!isGiftListLoaded) {
                    GiftDialogFragment.this.f22331c.unload(a);
                    GiftDialogFragment.this.f22331c.load(R.id.arg, C8175ae.m25046a(GiftDialogFragment.this.f22329a, 1));
                }
            }
        };
        GiftManager inst = GiftManager.inst();
        if (this.f22335g != null) {
            j = this.f22335g.getId();
        } else {
            j = 0;
        }
        inst.syncGiftList(r6, j, 3, this.f22337i);
        this.f22331c.load(R.id.aqo, C8175ae.m25045a());
        this.f22331c.load(R.id.arf, C8175ae.m25050c());
        this.f22331c.load(R.id.ari, null);
        this.f22331c.load(R.id.ar1, null);
        this.f22331c.load(R.id.are, C8175ae.m25051d());
        this.f22331c.load(R.id.a8h, C8175ae.m25047a(this.f22332d));
        view.findViewById(R.id.aqn).setBackgroundResource(C7885d.m24168a().mo20672b());
    }

    /* renamed from: b */
    public final void mo21299b(Exception exc) {
        mo21293a(exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21290a(C8170c cVar) {
        if (!C8185k.m25053a(this.f22334f)) {
            C3517a.m12960a((Context) this.f22334f, (int) R.string.efp);
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f22334f, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22188a(1001).mo22193d("live_detail").mo22194e("gift_send").mo22192c("enableGift").mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10185a((C7498y<? super T>) this.f22351x);
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
            if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
                C9049ap.m27022a((int) R.string.f0i);
                return;
            }
            C8149d findGiftById = GiftManager.inst().findGiftById(cVar.f22367b);
            int i = 0;
            if (findGiftById != null) {
                i = findGiftById.f22235f;
                if (cVar.f22366a == SendGiftType.DOODLE_GIFT && cVar.f22370e != null) {
                    i = cVar.f22370e.f22365d;
                }
            }
            if (findGiftById == null || cVar.f22366a == SendGiftType.PROP || ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) i) || ((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest()) {
                if (cVar.f22366a == SendGiftType.GIFT && findGiftById != null && findGiftById.f22234e == 11) {
                    C7879a.m24145a(cVar.f22367b, new C8184j(this, cVar));
                } else {
                    this.f22343p.mo21311a(cVar);
                }
                if (cVar.f22369d) {
                    dismiss();
                }
                return;
            }
            if (this.f22330b.f22461i.getValue() != null) {
                ((PanelType) this.f22330b.f22461i.getValue()).ordinal();
            }
            C9049ap.m27024a(getContext(), (int) R.string.fc7);
        }
    }

    /* renamed from: a */
    public final void mo21288a(C8158m mVar) {
        if (mVar != null) {
            int a = this.f22330b.mo21336a(mVar.f22301e);
            if (this.f22333e == null || this.f22333e.mo13795a(mVar, a, !this.f22340m)) {
                if (mVar.f22311o != null && !mVar.f22311o.isEmpty()) {
                    C8284u.m25332a().mo21437a(mVar.f22311o);
                }
                ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22177a(true);
                this.f22330b.f22440B.postValue(mVar);
                this.f22330b.mo21339a(mVar);
                C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
                if (findGiftById != null) {
                    if (findGiftById.mo21278a() || findGiftById.f22234e == 11) {
                        this.f22330b.mo21344c();
                    }
                    if (this.f22340m || this.f22342o) {
                        this.f22330b.f22466n.postValue(Boolean.valueOf(true));
                        boolean z = this.f22342o;
                    } else if (!findGiftById.mo21278a()) {
                        this.f22330b.f22465m.postValue(Boolean.valueOf(true));
                    }
                    IMessageManager iMessageManager = (IMessageManager) this.f22332d.get("data_message_manager");
                    User user = (User) this.f22332d.get("data_user_in_room");
                    List<C8489ao> b = C8163o.m25002b(this.f22335g.getId(), mVar, this.f22336h, user);
                    if (iMessageManager != null) {
                        if (C6311g.m19573a(b)) {
                            iMessageManager.insertMessage(C8163o.m24999a(this.f22335g.getId(), mVar, this.f22336h, user));
                        } else {
                            for (C8489ao insertMessage : b) {
                                iMessageManager.insertMessage(insertMessage);
                            }
                        }
                    }
                    if (findGiftById.f22234e == 11) {
                        this.f22348u.mo20669a(mVar.f22313q, mVar.f22301e, this.f22336h, this.f22332d);
                        dismissAllowingStateLoss();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21289a(C8159n nVar) {
        if (this.f11448j && nVar != null) {
            User user = (User) this.f22332d.get("data_user_in_room");
            IMessageManager iMessageManager = (IMessageManager) this.f22332d.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(C8163o.m25000a(this.f22335g.getId(), nVar, user), true);
            }
            C9498a aVar = nVar.f22322b;
            if (aVar != null) {
                C8289y.m25347a().f22766a = aVar;
                this.f22330b.f22473u.postValue(PanelType.PROP);
            } else {
                C3166a.m11966e("GiftDialogFragment", "TaskGiftSendSuccess return wallet null!");
            }
            this.f22330b.mo21343b();
            this.f22330b.f22465m.postValue(Boolean.valueOf(true));
            this.f22330b.f22476x.postValue(Boolean.valueOf(true));
            if (this.f22346s) {
                dismiss();
                C8161p pVar = new C8161p();
                pVar.f22327a = true;
                C9097a.m27146a().mo22267a((Object) pVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo21285a(int i, C8169b bVar) {
        this.f22330b.mo21341a(this.f22339l, i, ((Long) this.f22332d.get("data_gift_group_id", Long.valueOf(0))).longValue(), bVar);
        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22177a(true);
        dismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        long j;
        super.onViewCreated(view, bundle);
        if (this.f22335g == null) {
            dismissAllowingStateLoss();
            return;
        }
        if (this.f22335g != null) {
            j = this.f22335g.getOwnerUserId();
        } else {
            j = 0;
        }
        if (this.f22329a == SendToType.GUEST) {
            j = this.f22336h.getId();
        }
        this.f22343p = new C8186l(this.f22335g, j, this.f22339l);
        this.f22343p.mo9142a(this);
        this.f22330b = (GiftDialogViewModel) C0069x.m157a((Fragment) this).mo147a(GiftDialogViewModel.class);
        this.f22330b.f22457e = this.f22335g;
        this.f22330b.f22453a = this.f22337i;
        this.f22330b.f22454b = this.f22338k;
        this.f22330b.f22458f = this.f22336h;
        this.f22330b.f22455c = this.f22329a;
        this.f22330b.f22459g = this.f22341n;
        this.f22330b.f22460h = this.f22346s;
        if (this.f22332d != null) {
            this.f22332d.lambda$put$1$DataCenter("data_gift_dialog_view_model", this.f22330b);
        }
        this.f22330b.f22467o.observe(this, new C8167a(this));
        this.f22330b.f22468p.observe(this, new C8176b(this));
        this.f22330b.f22469q.observe(this, new C8178d(this));
        this.f22330b.f22470r.observe(this, new C8179e(this));
        this.f22330b.f22446H.observe(this, new C8180f(this));
        this.f22330b.f22465m.observe(this, new C8181g(this));
        m25009c();
        if (this.f22348u != null) {
            this.f22348u.f21280e = this.f22330b;
        }
        this.f22350w = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21291a(C8170c cVar, boolean z) {
        if (z) {
            this.f22343p.mo21311a(cVar);
        } else {
            C9049ap.m27022a((int) R.string.ell);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ank, viewGroup, false);
    }

    /* renamed from: a */
    public static GiftDialogFragment m25004a(Activity activity, Room room, User user, PanelType panelType, boolean z, boolean z2, String str, boolean z3, C7879a aVar) {
        boolean z4;
        GiftDialogFragment giftDialogFragment = new GiftDialogFragment();
        giftDialogFragment.f22334f = activity;
        giftDialogFragment.f22335g = room;
        giftDialogFragment.f22336h = user;
        giftDialogFragment.f22337i = z;
        giftDialogFragment.f22338k = z2;
        giftDialogFragment.f22339l = str;
        giftDialogFragment.f22346s = z3;
        if (user == null || user.getId() == room.getOwnerUserId()) {
            giftDialogFragment.f22329a = SendToType.ANCHOR;
        } else {
            giftDialogFragment.f22329a = SendToType.GUEST;
        }
        boolean z5 = false;
        if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo10240a()).intValue() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        giftDialogFragment.f22340m = z4;
        giftDialogFragment.f22341n = panelType;
        giftDialogFragment.f22342o = false;
        if (z2 && (z || C3387g.m12599a(activity))) {
            z5 = true;
        }
        giftDialogFragment.f22347t = z5;
        giftDialogFragment.f22348u = aVar;
        return giftDialogFragment;
    }
}
