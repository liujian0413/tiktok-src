package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.room.C3490g;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p447e.C9396b;
import com.bytedance.android.livesdkapi.p447e.C9399d;
import com.bytedance.android.livesdkapi.p447e.p449b.C9397a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public final class PreviewCommodityWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9374a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewCommodityWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: c */
    public static final C3000a f9375c = new C3000a(null);

    /* renamed from: b */
    public boolean f9376b;

    /* renamed from: d */
    private final C7541d f9377d = C7546e.m23569a(new C3010k(this));

    /* renamed from: e */
    private C7321c f9378e;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$a */
    public static final class C3000a {
        private C3000a() {
        }

        public /* synthetic */ C3000a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$b */
    static final class C3001b<T> implements C0053p<LiveMode> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9379a;

        C3001b(PreviewCommodityWidget previewCommodityWidget) {
            this.f9379a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveMode liveMode) {
            this.f9379a.mo9816a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$c */
    static final class C3002c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9380a;

        C3002c(PreviewCommodityWidget previewCommodityWidget) {
            this.f9380a = previewCommodityWidget;
        }

        public final void onClick(View view) {
            this.f9380a.mo9818c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$d */
    static final class C3003d<T> implements C7326g<C4454x> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9381a;

        C3003d(PreviewCommodityWidget previewCommodityWidget) {
            this.f9381a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C4454x xVar) {
            PreviewCommodityWidget previewCommodityWidget = this.f9381a;
            C7573i.m23582a((Object) xVar, "liveLoginEvent");
            previewCommodityWidget.onEvent(xVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$e */
    static final class C3004e {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9382a;

        C3004e(PreviewCommodityWidget previewCommodityWidget) {
            this.f9382a = previewCommodityWidget;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$f */
    static final class C3005f<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9383a;

        C3005f(PreviewCommodityWidget previewCommodityWidget) {
            this.f9383a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            C7573i.m23582a((Object) bool, "hashGoods");
            if (bool.booleanValue()) {
                ILiveSDKService iLiveSDKService = (ILiveSDKService) C3596c.m13172a(ILiveSDKService.class);
                if (iLiveSDKService != null) {
                    C3490g liveCommerceService = iLiveSDKService.liveCommerceService();
                    if (liveCommerceService != null) {
                        BaseDialogFragment a = liveCommerceService.mo10498a(this.f9383a.context, null);
                        if (a != null) {
                            a.getLifecycle().mo55a(new PreviewCommodityWidget$onSelectCommodity$1$1(this, a));
                            Context context = this.f9383a.context;
                            if (context != null) {
                                a.show(((FragmentActivity) context).getSupportFragmentManager(), "LIVE_SHOP_EDIT");
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
                return;
            }
            C3517a.m12960a(this.f9383a.context, (int) R.string.f3l);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$g */
    static final class C3006g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9384a;

        C3006g(PreviewCommodityWidget previewCommodityWidget) {
            this.f9384a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C9076n.m27095a(this.f9384a.context, th);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$h */
    static final class C3007h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9385a;

        /* renamed from: b */
        final /* synthetic */ C9312a f9386b;

        C3007h(PreviewCommodityWidget previewCommodityWidget, C9312a aVar) {
            this.f9385a = previewCommodityWidget;
            this.f9386b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f9386b.mo22118a(Boolean.valueOf(true));
            this.f9385a.mo9816a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$i */
    static final class C3008i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C3008i f9387a = new C3008i();

        C3008i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$j */
    static final class C3009j {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9388a;

        C3009j(PreviewCommodityWidget previewCommodityWidget) {
            this.f9388a = previewCommodityWidget;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$k */
    static final class C3010k extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9389a;

        C3010k(PreviewCommodityWidget previewCommodityWidget) {
            this.f9389a = previewCommodityWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9389a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$l */
    static final class C3011l<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9390a;

        C3011l(PreviewCommodityWidget previewCommodityWidget) {
            this.f9390a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            boolean z;
            View view = this.f9390a.contentView;
            C7573i.m23582a((Object) view, "contentView");
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.a0p);
            C7573i.m23582a((Object) checkedTextView, "contentView.commodity");
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            checkedTextView.setChecked(z);
            C7573i.m23582a((Object) bool, "checked");
            if (bool.booleanValue() && !this.f9390a.f9376b) {
                this.f9390a.f9376b = true;
                View view2 = this.f9390a.contentView;
                C7573i.m23582a((Object) view2, "contentView");
                ((CheckedTextView) view2.findViewById(R.id.a0p)).postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3011l f9391a;

                    {
                        this.f9391a = r1;
                    }

                    public final void run() {
                        C3517a.m12960a(this.f9391a.f9390a.context, (int) R.string.f3k);
                    }
                }, 300);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$m */
    static final class C3013m<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f9392a;

        C3013m(PreviewCommodityWidget previewCommodityWidget) {
            this.f9392a = previewCommodityWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C9076n.m27095a(this.f9392a.context, th);
        }
    }

    /* renamed from: d */
    private final StartLiveViewModel m11630d() {
        return (StartLiveViewModel) this.f9377d.getValue();
    }

    public final int getLayoutId() {
        return R.layout.alq;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f9378e != null) {
            C7321c cVar = this.f9378e;
            if (cVar != null && !cVar.isDisposed()) {
                C7321c cVar2 = this.f9378e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo9818c() {
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        if (user != null) {
            IUser a = user.mo22165a();
            if (a != null) {
                C7573i.m23582a((Object) a, "ServiceManager.getServic…()?.currentUser ?: return");
                if (((C9399d) C3596c.m13172a(C9399d.class)) != null) {
                    new C9397a(String.valueOf(a.getId()), a.getSecUid());
                    new C3009j(this);
                }
            }
        }
    }

    /* renamed from: e */
    private final boolean m11631e() {
        C3592a aVar = (C3592a) C3596c.m13172a(C3592a.class);
        if (aVar != null) {
            C8984e user = aVar.user();
            if (user != null) {
                IUser a = user.mo22165a();
                if (a != null) {
                    C7573i.m23582a((Object) a, "ServiceManager.getServic…          ?: return false");
                    if (!C9290a.f25466a && a.isEnableShowCommerceSale()) {
                        if (((LiveMode) m11630d().mo9597d().getValue()) == LiveMode.VIDEO) {
                            return true;
                        }
                        LiveMode liveMode = (LiveMode) m11630d().mo9597d().getValue();
                        LiveMode liveMode2 = LiveMode.THIRD_PARTY;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo9817b() {
        C3592a aVar = (C3592a) C3596c.m13172a(C3592a.class);
        if (aVar != null) {
            C8984e user = aVar.user();
            if (user != null) {
                IUser a = user.mo22165a();
                if (a != null) {
                    C7573i.m23582a((Object) a, "ServiceManager.getServic…                ?: return");
                    if (m11631e()) {
                        View view = this.contentView;
                        C7573i.m23582a((Object) view, "contentView");
                        view.setVisibility(0);
                        ILiveSDKService iLiveSDKService = (ILiveSDKService) C3596c.m13172a(ILiveSDKService.class);
                        if (iLiveSDKService != null) {
                            C3490g liveCommerceService = iLiveSDKService.liveCommerceService();
                            if (liveCommerceService != null) {
                                C7492s b = liveCommerceService.mo10500b(Long.valueOf(a.getId()));
                                if (b != null) {
                                    b.mo19280a((C7326g<? super T>) new C3011l<Object>(this), (C7326g<? super Throwable>) new C3013m<Object>(this));
                                }
                            }
                        }
                        return;
                    }
                    View view2 = this.contentView;
                    C7573i.m23582a((Object) view2, "contentView");
                    view2.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9816a() {
        C3592a aVar = (C3592a) C3596c.m13172a(C3592a.class);
        if (aVar != null) {
            C8984e user = aVar.user();
            if (user != null) {
                IUser a = user.mo22165a();
                if (a != null) {
                    C7573i.m23582a((Object) a, "ServiceManager.getServic…                ?: return");
                    C9312a aVar2 = new C9312a("has_show_commodity_dialog", Boolean.valueOf(false));
                    Object a2 = aVar2.mo22117a();
                    C7573i.m23582a(a2, "hasShowCommodity.value");
                    if (((Boolean) a2).booleanValue()) {
                        ILiveSDKService iLiveSDKService = (ILiveSDKService) C3596c.m13172a(ILiveSDKService.class);
                        if (iLiveSDKService != null) {
                            C3490g liveCommerceService = iLiveSDKService.liveCommerceService();
                            if (liveCommerceService != null) {
                                C7492s a3 = liveCommerceService.mo10499a(Long.valueOf(a.getId()));
                                if (a3 != null) {
                                    a3.mo19280a((C7326g<? super T>) new C3005f<Object>(this), (C7326g<? super Throwable>) new C3006g<Object>(this));
                                }
                            }
                        }
                        return;
                    }
                    new C3534a(this.context).mo10648a((int) R.string.f3t).mo10658b((int) R.string.f3s).mo10649a((int) R.string.f3r, (DialogInterface.OnClickListener) new C3007h(this, aVar2)).mo10659b((int) R.string.f3q, (DialogInterface.OnClickListener) C3008i.f9387a).mo10656a(false).mo10657a().show();
                }
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        m11630d().mo9597d().observe(this, new C3001b(this));
        ViewGroup viewGroup = this.containerView;
        C7573i.m23582a((Object) viewGroup, "containerView");
        ((CheckedTextView) viewGroup.findViewById(R.id.a0p)).setCheckMarkDrawable(R.drawable.c9p);
        this.containerView.setOnClickListener(new C3002c(this));
        if (this.f9378e != null) {
            C7321c cVar = this.f9378e;
            if (cVar != null && !cVar.isDisposed()) {
                C7321c cVar2 = this.f9378e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
        this.f9378e = C9097a.m27146a().mo22266a(C4454x.class).mo19325f((C7326g<? super T>) new C3003d<Object>(this));
        C3592a aVar = (C3592a) C3596c.m13172a(C3592a.class);
        if (aVar != null) {
            C8984e user = aVar.user();
            if (user != null) {
                IUser a = user.mo22165a();
                if (a != null) {
                    C7573i.m23582a((Object) a, "ServiceManager.getServic…                ?: return");
                    if (((C9399d) C3596c.m13172a(C9399d.class)) != null) {
                        new C3004e(this);
                        new C9396b(String.valueOf(a.getId()), a.getSecUid());
                    }
                }
            }
        }
    }

    public final void onEvent(C4454x xVar) {
        C7573i.m23587b(xVar, "event");
        mo9817b();
    }
}
