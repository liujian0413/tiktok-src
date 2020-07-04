package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.live.core.rxutils.DisposableObserverDelegate;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4410ab;
import com.bytedance.android.livesdk.chatroom.p220ui.C5259cu;
import com.bytedance.android.livesdk.chatroom.utils.C5347h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.viewmodel.C9143f;
import com.bytedance.android.livesdk.viewmodel.C9144g;
import com.bytedance.android.livesdk.viewmodel.FinishLottery;
import com.bytedance.android.livesdk.viewmodel.ILotteryAction;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryReviewPending;
import com.bytedance.android.livesdk.viewmodel.LotteryViewModel;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdk.viewmodel.ResetLottery;
import com.bytedance.android.livesdk.viewmodel.StartLottery;
import com.bytedance.android.livesdk.viewmodel.SubmitLottery;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

public final class LotteryServiceWidget extends LiveWidget implements C0067b, OnMessageListener {

    /* renamed from: a */
    public C47562b f16247a;

    /* renamed from: b */
    public LotteryViewModel f16248b;

    /* renamed from: c */
    public User f16249c;

    /* renamed from: d */
    public boolean f16250d;

    /* renamed from: e */
    private C47562b f16251e;

    /* renamed from: f */
    private Room f16252f;

    /* renamed from: g */
    private boolean f16253g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$a */
    static final class C5472a<T> implements C7326g<IUser> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f16254a;

        C5472a(LotteryServiceWidget lotteryServiceWidget) {
            this.f16254a = lotteryServiceWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(IUser iUser) {
            this.f16254a.mo13938a(User.from(iUser));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$b */
    static final class C5473b implements C7323a {

        /* renamed from: a */
        final /* synthetic */ IMessageManager f16255a;

        /* renamed from: b */
        final /* synthetic */ LotteryServiceWidget f16256b;

        C5473b(IMessageManager iMessageManager, LotteryServiceWidget lotteryServiceWidget) {
            this.f16255a = iMessageManager;
            this.f16256b = lotteryServiceWidget;
        }

        /* renamed from: a */
        public final void mo8975a() {
            this.f16255a.removeMessageListener(this.f16256b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$c */
    static final class C5474c<T> implements C7326g<Pair<? extends ILotteryState, ? extends ILotteryState>> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f16257a;

        C5474c(LotteryServiceWidget lotteryServiceWidget) {
            this.f16257a = lotteryServiceWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<? extends ILotteryState, ? extends ILotteryState> pair) {
            ILotteryState iLotteryState = (ILotteryState) pair.component1();
            pair.component2();
            if (iLotteryState != null) {
                this.f16257a.f16247a.mo119660a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$d */
    static final class C5475d implements C7323a {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f16258a;

        C5475d(LotteryServiceWidget lotteryServiceWidget) {
            this.f16258a = lotteryServiceWidget;
        }

        /* renamed from: a */
        public final void mo8975a() {
            this.f16258a.dataCenter.lambda$put$1$DataCenter("data_lottery_data_model", null);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$e */
    static final class C5476e<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f16259a;

        C5476e(LotteryServiceWidget lotteryServiceWidget) {
            this.f16259a = lotteryServiceWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            C8444d.m25673b();
            StringBuilder sb = new StringBuilder("lotteryPermission=");
            sb.append(bool);
            C8444d.m11971b("ttlive_lottery", sb.toString());
            C7573i.m23582a((Object) bool, "hasPermission");
            if (bool.booleanValue()) {
                Context context = this.f16259a.context;
                C7573i.m23582a((Object) context, "context");
                DataCenter dataCenter = this.f16259a.dataCenter;
                C7573i.m23582a((Object) dataCenter, "dataCenter");
                final C5259cu cuVar = new C5259cu(context, dataCenter);
                C5747j.m18103a().mo14165a(ToolbarButton.LOTTERY, (C5739a) cuVar);
                LotteryServiceWidget lotteryServiceWidget = this.f16259a;
                C7321c a = C47563d.m148349a((C7323a) new C7323a() {
                    /* renamed from: a */
                    public final void mo8975a() {
                        C8444d.m25673b();
                        C8444d.m11971b("ttlive_lottery", "unloading toolbar button");
                        C5747j.m18103a().mo14167b(ToolbarButton.LOTTERY, cuVar);
                    }
                });
                C7573i.m23582a((Object) a, "Disposables.fromAction {…                        }");
                lotteryServiceWidget.mo13939a(a);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$f */
    static final class C5478f extends Lambda implements C7562b<C5347h, C7581n> {

        /* renamed from: a */
        public static final C5478f f16261a = new C5478f();

        C5478f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m17707a((C5347h) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m17707a(C5347h hVar) {
            C7573i.m23587b(hVar, "$receiver");
            hVar.mo13637a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$g */
    static final class C5479g<T> implements C7326g<C4410ab> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f16262a;

        C5479g(LotteryServiceWidget lotteryServiceWidget) {
            this.f16262a = lotteryServiceWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C4410ab abVar) {
            LotteryViewModel lotteryViewModel = this.f16262a.f16248b;
            if (lotteryViewModel != null) {
                C9143f fVar = lotteryViewModel.f24818a;
                if (fVar != null) {
                    fVar.mo22345a((ILotteryAction) new SubmitLottery());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$h */
    static final class C5480h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9249a f16263a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f16264b;

        /* renamed from: c */
        final /* synthetic */ String f16265c;

        C5480h(C9249a aVar, ObjectRef objectRef, String str) {
            this.f16263a = aVar;
            this.f16264b = objectRef;
            this.f16265c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C7561a) this.f16264b.element).invoke();
            C9178j.m27302j().mo22380i().handle(this.f16263a.mo22709a(), Uri.parse(this.f16265c));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$i */
    static final class C5481i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f16266a;

        /* renamed from: b */
        final /* synthetic */ String f16267b;

        C5481i(ObjectRef objectRef, String str) {
            this.f16266a = objectRef;
            this.f16267b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C7561a) this.f16266a.element).invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$j */
    static final class C5482j extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C9245h f16268a;

        C5482j(C9245h hVar) {
            this.f16268a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m17709a() {
            C9245h hVar = this.f16268a;
            if (hVar != null) {
                hVar.dismiss();
            }
        }

        public final /* synthetic */ Object invoke() {
            m17709a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$k */
    static final class C5483k extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C5483k f16269a = new C5483k();

        C5483k() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "service onDestroy");
        this.f16252f = null;
        mo13938a((User) null);
        this.f16248b = null;
        this.f16247a.dispose();
        this.f16247a = new C47562b();
        this.f16251e.dispose();
        this.f16251e = new C47562b();
    }

    public final void onCreate() {
        long j;
        super.onCreate();
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "service onCreate");
        this.f16252f = (Room) this.dataCenter.get("data_room", null);
        Object obj = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C7573i.m23582a(obj, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f16250d = ((Boolean) obj).booleanValue();
        Object obj2 = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
        C7573i.m23582a(obj2, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
        this.f16253g = ((Boolean) obj2).booleanValue();
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        C7573i.m23582a((Object) user, "userService");
        mo13938a(User.from(user.mo22165a()));
        C7321c f = user.mo22186f().mo19325f((C7326g<? super T>) new C5472a<Object>(this));
        C7573i.m23582a((Object) f, "userService.observeCurre…er.from(it)\n            }");
        mo13939a(f);
        this.f16248b = (LotteryViewModel) getViewModel(LotteryViewModel.class, this);
        LotteryViewModel lotteryViewModel = this.f16248b;
        if (lotteryViewModel != null) {
            DisposableObserverDelegate a = C3306n.m12379a(new C5347h(), C5478f.f16261a);
            mo13939a((C7321c) a);
            C7492s b = lotteryViewModel.f24818a.mo22346b().mo19303b((C7498y<? super T>) a);
            C7573i.m23582a((Object) b, "dataModel.stateChanged().doOnEach(logInjector)");
            C7321c f2 = C3306n.m12381a(b).mo19325f((C7326g<? super T>) new C5474c<Object>(this));
            C7573i.m23582a((Object) f2, "dataModel.stateChanged()…d(from, to)\n            }");
            mo13939a(f2);
            this.dataCenter.lambda$put$1$DataCenter("data_lottery_data_model", lotteryViewModel.f24818a);
            C7321c a2 = C47563d.m148349a((C7323a) new C5475d(this));
            C7573i.m23582a((Object) a2, "Disposables.fromAction {…TTERY_DATA_MODEL, null) }");
            mo13939a(a2);
            if (this.f16250d) {
                C8444d.m25673b();
                C8444d.m11971b("ttlive_lottery", "checking lottery permission");
                Room room = this.f16252f;
                long j2 = 0;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                User user2 = this.f16249c;
                if (user2 != null) {
                    j2 = user2.getId();
                }
                C7321c d = LotteryViewModel.m27172a(j, j2).mo19140d((C7326g<? super T>) new C5476e<Object>(this));
                C7573i.m23582a((Object) d, "checkLotteryPermission(r…      }\n                }");
                mo13939a(d);
            }
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LOTTERY_EVENT.getIntType(), this);
            C7321c a3 = C47563d.m148349a((C7323a) new C5473b(iMessageManager, this));
            C7573i.m23582a((Object) a3, "Disposables.fromAction {…veMessageListener(this) }");
            mo13939a(a3);
        }
        C7321c f3 = C9097a.m27146a().mo22266a(C4410ab.class).mo19325f((C7326g<? super T>) new C5479g<Object>(this));
        C7573i.m23582a((Object) f3, "RxBus.getInstance().regi…ubmitLottery())\n        }");
        mo13939a(f3);
    }

    /* renamed from: a */
    public final boolean mo13939a(C7321c cVar) {
        return this.f16251e.mo119661a(cVar);
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        long j;
        C7573i.m23587b(cls, "modelClass");
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "creating viewModel");
        Room room = this.f16252f;
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        User user = this.f16249c;
        if (user != null) {
            j2 = user.getId();
        }
        return (C0063u) new LotteryViewModel(j, j2);
    }

    /* renamed from: a */
    public final void mo13938a(User user) {
        Object obj;
        C8444d.m25673b();
        String str = "ttlive_lottery";
        StringBuilder sb = new StringBuilder("service user updated, userId=");
        if (user != null) {
            obj = Long.valueOf(user.getId());
        } else {
            obj = "(user is null)";
        }
        sb.append(obj);
        C8444d.m11971b(str, sb.toString());
        this.f16249c = user;
    }

    /* renamed from: a */
    private final void m17697a(String str) {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "showRejectedDialog");
        try {
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = (C7561a) C5483k.f16269a;
            C9249a aVar = new C9249a(this.context, 4);
            aVar.mo22710a((int) R.string.f6h);
            aVar.mo22718b((int) R.string.f6e);
            aVar.mo22716a(false);
            SpannableString spannableString = new SpannableString(aVar.mo22709a().getString(R.string.f6g));
            spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, spannableString.length(), 33);
            aVar.mo22723b(0, (CharSequence) spannableString, (OnClickListener) new C5480h(aVar, objectRef, str));
            aVar.mo22722b(1, (int) R.string.f6f, (OnClickListener) new C5481i(objectRef, str));
            aVar.mo22717a(16.0f);
            objectRef.element = (C7561a) new C5482j(aVar.mo22729d());
        } catch (Throwable th) {
            C8444d.m25673b();
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    public final void onMessage(IMessage iMessage) {
        long j;
        long j2;
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("service onMessage ");
        sb.append(iMessage);
        C8444d.m11971b("ttlive_lottery", sb.toString());
        if (iMessage instanceof LotteryEventMessage) {
            LotteryEventMessage lotteryEventMessage = (LotteryEventMessage) iMessage;
            int i = lotteryEventMessage.lotteryStatus;
            if (i != 5) {
                switch (i) {
                    case 1:
                        LotteryViewModel lotteryViewModel = this.f16248b;
                        if (lotteryViewModel != null) {
                            long a = C9144g.m27208a(lotteryEventMessage.lotteryDrawTime);
                            C9143f fVar = lotteryViewModel.f24818a;
                            long j3 = lotteryEventMessage.lotteryId;
                            Room room = this.f16252f;
                            long j4 = 0;
                            if (room != null) {
                                j = room.getId();
                            } else {
                                j = 0;
                            }
                            Room room2 = this.f16252f;
                            if (room2 != null) {
                                j2 = room2.getOwnerUserId();
                            } else {
                                j2 = 0;
                            }
                            User user = this.f16249c;
                            if (user != null) {
                                j4 = user.getId();
                            }
                            StartLottery startLottery = new StartLottery(j3, j, j2, j4, a);
                            fVar.mo22345a((ILotteryAction) startLottery);
                            break;
                        } else {
                            return;
                        }
                    case 2:
                    case 3:
                        break;
                }
            }
            LotteryViewModel lotteryViewModel2 = this.f16248b;
            if (lotteryViewModel2 != null) {
                int i2 = lotteryEventMessage.lotteryStatus;
                if (i2 != 5) {
                    switch (i2) {
                        case 2:
                            if (lotteryViewModel2.f24818a.f24846a instanceof LotteryWaiting) {
                                lotteryViewModel2.f24818a.mo22345a((ILotteryAction) new FinishLottery());
                                break;
                            }
                            break;
                        case 3:
                            lotteryViewModel2.f24818a.mo22345a((ILotteryAction) new ResetLottery());
                            break;
                    }
                } else {
                    if (lotteryViewModel2.f24818a.f24846a instanceof LotteryReviewPending) {
                        lotteryViewModel2.f24818a.mo22345a((ILotteryAction) new ResetLottery());
                    }
                    if (this.f16250d) {
                        String str = lotteryEventMessage.lotteryRulePageScheme;
                        if (str == null) {
                            str = "";
                        }
                        m17697a(str);
                    }
                }
            }
        }
    }
}
