package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Message;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.model.C2750b;
import com.bytedance.android.live.broadcast.model.C2750b.C2751a;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.monitor.C2759b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.p134e.C2562b;
import com.bytedance.android.live.broadcast.p134e.C2567e.C2568a;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveFragment;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.C9465g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
import kotlin.text.C7634n;

public final class StartLiveWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9456a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveWidget.class), "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveWidget.class), "progressDialog", "getProgressDialog()Landroid/app/ProgressDialog;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveWidget.class), "tipAnimation", "getTipAnimation()Landroid/animation/ValueAnimator;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveWidget.class), "tipBottomMargin", "getTipBottomMargin()I"))};

    /* renamed from: c */
    public static final C3047a f9457c = new C3047a(null);

    /* renamed from: b */
    public final StartLiveFragment f9458b;

    /* renamed from: d */
    private boolean f9459d = true;

    /* renamed from: e */
    private boolean f9460e;

    /* renamed from: f */
    private final C7541d f9461f = C7546e.m23569a(new C3059m(this));

    /* renamed from: g */
    private final C7541d f9462g = C7546e.m23569a(new C3058l(this));

    /* renamed from: h */
    private final C7541d f9463h = C7546e.m23569a(new C3057k(this));

    /* renamed from: i */
    private final C7541d f9464i = C7546e.m23569a(new C3060n(this));

    /* renamed from: j */
    private final C7541d f9465j = C7546e.m23569a(C3061o.f9480a);

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$a */
    public static final class C3047a {
        private C3047a() {
        }

        public /* synthetic */ C3047a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$b */
    static final class C3048b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9466a;

        C3048b(StartLiveWidget startLiveWidget) {
            this.f9466a = startLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f9466a.mo9862b().mo9469c().postValue(Integer.valueOf(1));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$c */
    static final class C3049c implements OnClickListener {

        /* renamed from: a */
        public static final C3049c f9467a = new C3049c();

        C3049c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$d */
    static final class C3050d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9468a;

        /* renamed from: b */
        final /* synthetic */ String f9469b;

        C3050d(StartLiveWidget startLiveWidget, String str) {
            this.f9468a = startLiveWidget;
            this.f9469b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            BaseDialogFragment a = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11533a(C3979c.m13951a(this.f9469b).mo11555a((int) C34943c.f91128x).mo11560b((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
            Context context = this.f9468a.context;
            if (context != null) {
                BaseDialogFragment.m12686a((FragmentActivity) context, (DialogFragment) a);
                dialogInterface.dismiss();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$e */
    static final class C3051e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9470a;

        C3051e(StartLiveWidget startLiveWidget) {
            this.f9470a = startLiveWidget;
        }

        public final void onClick(View view) {
            if (this.f9470a.f9458b.mo9477c()) {
                this.f9470a.mo9862b().mo9470d().postValue(Integer.valueOf(1));
                this.f9470a.mo9856a().mo9610q();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$f */
    static final class C3052f<T> implements C0053p<LiveMode> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9471a;

        C3052f(StartLiveWidget startLiveWidget) {
            this.f9471a = startLiveWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveMode liveMode) {
            this.f9471a.mo9860a(liveMode);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$g */
    static final class C3053g<T> implements C0053p<Message> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9472a;

        C3053g(StartLiveWidget startLiveWidget) {
            this.f9472a = startLiveWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Message message) {
            this.f9472a.mo9857a(message);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$h */
    static final class C3054h<T> implements C0053p<Room> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9473a;

        C3054h(StartLiveWidget startLiveWidget) {
            this.f9473a = startLiveWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Room room) {
            this.f9473a.mo9861a(room);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$i */
    static final class C3055i<T> implements C0053p<C3479d<C2750b>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9474a;

        C3055i(StartLiveWidget startLiveWidget) {
            this.f9474a = startLiveWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C3479d<C2750b> dVar) {
            this.f9474a.mo9859a(dVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$j */
    static final class C3056j<T> implements C0053p<C2755e> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9475a;

        C3056j(StartLiveWidget startLiveWidget) {
            this.f9475a = startLiveWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C2755e eVar) {
            this.f9475a.mo9858a(eVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$k */
    static final class C3057k extends Lambda implements C7561a<ProgressDialog> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9476a;

        C3057k(StartLiveWidget startLiveWidget) {
            this.f9476a = startLiveWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProgressDialog invoke() {
            Context context = this.f9476a.getContext();
            Context context2 = this.f9476a.context;
            C7573i.m23582a((Object) context2, "context");
            return C9044al.m27011b(context, context2.getResources().getString(R.string.ehh));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$l */
    static final class C3058l extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9477a;

        C3058l(StartLiveWidget startLiveWidget) {
            this.f9477a = startLiveWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f9477a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$m */
    static final class C3059m extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9478a;

        C3059m(StartLiveWidget startLiveWidget) {
            this.f9478a = startLiveWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9478a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$n */
    static final class C3060n extends Lambda implements C7561a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f9479a;

        C3060n(StartLiveWidget startLiveWidget) {
            this.f9479a = startLiveWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ValueAnimator invoke() {
            return this.f9479a.mo9863c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$o */
    static final class C3061o extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C3061o f9480a = new C3061o();

        C3061o() {
            super(0);
        }

        /* renamed from: a */
        private static int m11706a() {
            return C3358ac.m12510a(4.0f);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m11706a());
        }
    }

    /* renamed from: d */
    private final ProgressDialog m11683d() {
        return (ProgressDialog) this.f9463h.getValue();
    }

    /* renamed from: e */
    private final ValueAnimator m11684e() {
        return (ValueAnimator) this.f9464i.getValue();
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9856a() {
        return (StartLiveViewModel) this.f9461f.getValue();
    }

    /* renamed from: b */
    public final StartLiveEventViewModel mo9862b() {
        return (StartLiveEventViewModel) this.f9462g.getValue();
    }

    public final int getLayoutId() {
        return R.layout.b0a;
    }

    /* renamed from: a */
    public final void mo9861a(Room room) {
        boolean z = true;
        if (!Room.isValid(room)) {
            ProgressDialog d = m11683d();
            C7573i.m23582a((Object) d, "progressDialog");
            if (d.isShowing()) {
                m11683d().dismiss();
            }
            Exception illegalStateException = new IllegalStateException("invalid room");
            C9076n.m27096a(this.context, (Throwable) illegalStateException, (int) R.string.ehi);
            if (((LiveMode) mo9856a().mo9597d().getValue()) != LiveMode.AUDIO) {
                z = false;
            }
            BroadcastMonitor.m11027a(illegalStateException, z);
            TimeCostUtil.m12199a(Tag.CreateLive);
            return;
        }
        this.f9460e = true;
        C2515f.m10417f().mo9075b().mo9216d();
        C2515f.m10417f().mo9074a().mo8900c();
        if (room == null) {
            C7573i.m23580a();
        }
        m11681b(room);
    }

    /* renamed from: i */
    private final void m11688i() {
        mo9856a().mo9611r();
    }

    public final void onPause() {
        m11686g();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        m11685f();
    }

    /* renamed from: g */
    private final void m11686g() {
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.da3);
        C7573i.m23582a((Object) constraintLayout, "contentView.start_live_layout");
        constraintLayout.setVisibility(8);
        if (m11684e().isRunning()) {
            m11684e().cancel();
        }
    }

    /* renamed from: h */
    private final void m11687h() {
        new C9249a(this.context, 0).mo22716a(true).mo22718b((int) R.string.fde).mo22722b(0, (int) R.string.ecy, (OnClickListener) new C3048b(this)).mo22722b(1, (int) R.string.eci, (OnClickListener) C3049c.f9467a).mo22720b().show();
    }

    public final void onDestroy() {
        if (!this.f9460e) {
            C2515f.m10417f().mo9075b().mo9216d();
            C2515f.m10417f().mo9074a().mo8900c();
        } else {
            this.f9460e = false;
        }
        super.onDestroy();
    }

    /* renamed from: c */
    public final ValueAnimator mo9863c() {
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) view.findViewById(R.id.da3), "translationY", new float[]{0.0f, (float) C3358ac.m12510a(4.0f), 0.0f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        return ofFloat;
    }

    /* renamed from: f */
    private final void m11685f() {
        String str;
        int i;
        C2755e eVar = (C2755e) mo9856a().mo9592a().getValue();
        if (eVar != null) {
            str = eVar.f8731d;
        } else {
            str = null;
        }
        if (!C6319n.m19593a(str) && ((LiveMode) mo9856a().mo9597d().getValue()) == LiveMode.VIDEO) {
            if (this.f9459d) {
                C8443c a = C8443c.m25663a();
                String str2 = "livesdk_live_take_guide_show";
                Map hashMap = new HashMap();
                String str3 = "guide_type";
                C2755e eVar2 = (C2755e) mo9856a().mo9592a().getValue();
                if (eVar2 != null) {
                    i = eVar2.f8734g;
                } else {
                    i = 0;
                }
                hashMap.put(str3, String.valueOf(i));
                a.mo21606a(str2, hashMap, new Object[0]);
                this.f9459d = false;
            }
            View view = this.contentView;
            C7573i.m23582a((Object) view, "contentView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.da3);
            C7573i.m23582a((Object) constraintLayout, "contentView.start_live_layout");
            constraintLayout.setVisibility(0);
            m11684e().start();
        }
    }

    public final void onCreate() {
        super.onCreate();
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ((TextView) view.findViewById(R.id.pj)).setOnClickListener(new C3051e(this));
        StartLiveViewModel a = mo9856a();
        Context context = this.context;
        C7573i.m23582a((Object) context, "context");
        StartLiveViewModel a2 = mo9856a();
        C7573i.m23582a((Object) a2, "startLiveViewModel");
        StartLiveEventViewModel b = mo9862b();
        C7573i.m23582a((Object) b, "startLiveEventViewModel");
        a.mo9593a(context, a2, b);
        C0043i iVar = this;
        mo9856a().mo9597d().observe(iVar, new C3052f(this));
        mo9856a().mo9607n().observe(iVar, new C3053g(this));
        mo9856a().mo9608o().observe(iVar, new C3054h(this));
        mo9856a().mo9609p().observe(iVar, new C3055i(this));
        mo9856a().mo9592a().observe(iVar, new C3056j(this));
    }

    /* renamed from: a */
    public final void mo9858a(C2755e eVar) {
        if (eVar != null) {
            if (C6319n.m19593a(eVar.f8731d)) {
                m11686g();
                return;
            }
            View view = this.contentView;
            C7573i.m23582a((Object) view, "contentView");
            TextView textView = (TextView) view.findViewById(R.id.e2a);
            C7573i.m23582a((Object) textView, "contentView.tv_start_live_tip");
            textView.setText(eVar.f8731d);
            m11685f();
        }
    }

    public StartLiveWidget(StartLiveFragment startLiveFragment) {
        C7573i.m23587b(startLiveFragment, "startLiveFragment");
        this.f9458b = startLiveFragment;
    }

    /* renamed from: a */
    private final void m11679a(ApiServerException apiServerException) {
        String str;
        Map hashMap = new HashMap();
        String str2 = "is_obs";
        if (((LiveMode) mo9856a().mo9597d().getValue()) == LiveMode.THIRD_PARTY) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        hashMap.put("_param_live_platform", "live");
        C8443c.m25663a().mo21606a("enter_verify_page", hashMap, new C8438j().mo21599b("live"));
        C3596c.m13172a(C9465g.class);
        if (this.context != null) {
            apiServerException.getExtra();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    private final void m11680a(Exception exc) {
        boolean z;
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            int errorCode = apiServerException.getErrorCode();
            if (errorCode == 10018) {
                m11688i();
            } else if (errorCode == 20054) {
                m11679a(apiServerException);
            } else if (errorCode == 30011) {
                m11687h();
            } else if (TextUtils.isEmpty(apiServerException.getMessage())) {
                Context context = this.context;
                if (context != null) {
                    C9076n.m27096a((Context) (Activity) context, (Throwable) exc, (int) R.string.ehi);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            } else {
                Context context2 = this.context;
                if (context2 != null) {
                    C9076n.m27097a((Context) (Activity) context2, (Throwable) exc, apiServerException.getMessage());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        } else {
            Context context3 = this.context;
            if (context3 != null) {
                C9076n.m27096a((Context) (Activity) context3, (Throwable) exc, (int) R.string.ehi);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        C8448g.m25682a(this.context);
        if (((LiveMode) mo9856a().mo9597d().getValue()) == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        BroadcastMonitor.m11027a(exc, z);
    }

    /* renamed from: b */
    private final void m11681b(Room room) {
        int i;
        boolean z;
        C2562b.m10531a(null, room, (LiveMode) mo9856a().mo9597d().getValue(), (Game) mo9856a().mo9599f().getValue(), C2568a.m10553a((Integer) mo9856a().mo9600g().getValue()), (Boolean) mo9856a().mo9595b().getValue());
        if (mo9856a().mo9601h().getValue() != null && !TextUtils.isEmpty((CharSequence) mo9856a().mo9601h().getValue())) {
            C2759b.m11037a(room, (LiveMode) mo9856a().mo9597d().getValue());
        }
        C2619g.m10719a(room.getId());
        IPropertyCache b = ((C9439a) C3596c.m13172a(C9439a.class)).mo23190b();
        C8947c<Float> cVar = C8946b.f24362N;
        C8947c<Float> cVar2 = C8946b.f24363O;
        LiveMode liveMode = (LiveMode) mo9856a().mo9597d().getValue();
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        C7573i.m23582a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
        IUser a = user.mo22165a();
        if (!(a instanceof User)) {
            a = null;
        }
        User user2 = (User) a;
        C4884aq aqVar = (C4884aq) mo9856a().mo9603j().getValue();
        if (aqVar != null) {
            i = aqVar.f13993a;
        } else {
            i = -1;
        }
        C2562b.m10530a(b, cVar, cVar2, room, liveMode, user2, i);
        if (((LiveMode) mo9856a().mo9597d().getValue()) == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        BroadcastMonitor.m11029a(z);
        m11682c(room);
    }

    /* renamed from: c */
    private final void m11682c(Room room) {
        Class cls;
        boolean z;
        C8443c.m25663a().mo21607a("live_action", new Object[0]);
        try {
            Context context = this.context;
            LiveMode liveMode = (LiveMode) mo9856a().mo9597d().getValue();
            if (liveMode == null || !liveMode.isStreamingBackground) {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(5);
            } else {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(6);
            }
            Intent intent = new Intent(context, cls);
            if (LiveMode.THIRD_PARTY == ((LiveMode) mo9856a().mo9597d().getValue()) || LiveMode.SCREEN_RECORD == ((LiveMode) mo9856a().mo9597d().getValue())) {
                C8947c<Boolean> cVar = C8946b.f24405ad;
                C7573i.m23582a((Object) cVar, "LivePluginProperties.LIVE_GAME_QUIT_CLICKED");
                cVar.mo22118a(Boolean.valueOf(false));
            }
            intent.putExtra("data_dou_plus_promote_entry", (Serializable) mo9856a().mo9605l().getValue());
            C8947c<String> cVar2 = C8946b.f24358J;
            C7573i.m23582a((Object) cVar2, "LivePluginProperties.LIVE_START_LIVE_MODE_NAME");
            LiveMode liveMode2 = (LiveMode) mo9856a().mo9597d().getValue();
            if (liveMode2 == null) {
                liveMode2 = LiveMode.VIDEO;
            }
            cVar2.mo22118a(liveMode2.name());
            Context context2 = this.context;
            if (context2 != null) {
                ((FragmentActivity) context2).startActivity(intent);
                DouPlusEntry douPlusEntry = (DouPlusEntry) mo9856a().mo9605l().getValue();
                if (douPlusEntry != null) {
                    z = douPlusEntry.hasDouPlusEntry;
                } else {
                    z = false;
                }
                room.isDouPlusPromotion = z;
                C2324b a = C3596c.m13172a(C3495l.class);
                C7573i.m23582a((Object) a, "ServiceManager.getServic…IRoomService::class.java)");
                ((C3495l) a).setCurrentRoom(room);
                ((C9439a) C3596c.m13172a(C9439a.class)).mo23189a().mo23110a(true);
                Context context3 = this.context;
                if (context3 != null) {
                    ((FragmentActivity) context3).finish();
                    Context context4 = this.context;
                    if (context4 != null) {
                        ((FragmentActivity) context4).overridePendingTransition(0, 0);
                        ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager().mo9650a();
                        ProgressDialog d = m11683d();
                        C7573i.m23582a((Object) d, "progressDialog");
                        if (d.isShowing()) {
                            m11683d().dismiss();
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        } catch (Exception unused) {
            ProgressDialog d2 = m11683d();
            C7573i.m23582a((Object) d2, "progressDialog");
            if (d2.isShowing()) {
                m11683d().dismiss();
            }
        } catch (Throwable th) {
            ProgressDialog d3 = m11683d();
            C7573i.m23582a((Object) d3, "progressDialog");
            if (d3.isShowing()) {
                m11683d().dismiss();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo9857a(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null) {
            int i = message.what;
            if (i == 0) {
                ProgressDialog d = m11683d();
                C7573i.m23582a((Object) d, "progressDialog");
                if (!d.isShowing()) {
                    m11683d().show();
                }
            } else if (i == 10 && (message.obj == null || (message.obj instanceof Exception))) {
                ProgressDialog d2 = m11683d();
                C7573i.m23582a((Object) d2, "progressDialog");
                if (d2.isShowing()) {
                    m11683d().dismiss();
                }
                Object obj = message.obj;
                if (obj != null) {
                    m11680a((Exception) obj);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Exception");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9859a(C3479d<C2750b> dVar) {
        CharSequence charSequence;
        String str;
        if (dVar != null) {
            C2750b bVar = (C2750b) dVar.data;
            if (bVar != null) {
                C2751a aVar = bVar.f8713a;
                if (aVar != null) {
                    if (aVar.f8717d) {
                        String a = C3358ac.m12515a((int) R.string.epc);
                        if (a != null) {
                            charSequence = a;
                        } else {
                            return;
                        }
                    } else {
                        long j = aVar.f8714a - (dVar.extra.now / 1000);
                        Object obj = dVar.data;
                        C7573i.m23582a(obj, "response.data");
                        C2751a aVar2 = ((C2750b) obj).f8713a;
                        C7573i.m23582a((Object) aVar2, "response.data.latestBanRecord");
                        int i = (int) ((j + ((long) aVar2.f8715b)) / 60);
                        if (i < 60) {
                            str = C3358ac.m12516a(R.plurals.a2, i, Integer.valueOf(i));
                        } else if (i < 1440) {
                            i /= 60;
                            str = C3358ac.m12516a(R.plurals.a1, i, Integer.valueOf(i));
                        } else {
                            i /= 1440;
                            str = C3358ac.m12516a(R.plurals.a0, i, Integer.valueOf(i));
                        }
                        String valueOf = String.valueOf(i);
                        if (str != null) {
                            CharSequence charSequence2 = str;
                            Collection b = C7634n.m23769b(charSequence2, new String[]{valueOf}, false, 0, 6, (Object) null);
                            if (b != null) {
                                Object[] array = b.toArray(new String[0]);
                                if (array != null) {
                                    String[] strArr = (String[]) array;
                                    SpannableString spannableString = new SpannableString(charSequence2);
                                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff2200")), strArr[0].length(), strArr[0].length() + valueOf.length(), 33);
                                    charSequence = spannableString;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                            }
                        } else {
                            return;
                        }
                    }
                    C3338l<String> lVar = LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL;
                    C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL");
                    String uri = Uri.parse((String) lVar.mo10240a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f8718e)).build().toString();
                    C7573i.m23582a((Object) uri, "Uri.parse(LiveConfigSett…              .toString()");
                    new C9249a(this.context).mo22727c(charSequence).mo22722b(0, (int) R.string.epd, (OnClickListener) new C3050d(this, uri)).mo22720b().show();
                    C2759b.m11035a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9860a(LiveMode liveMode) {
        if (liveMode != null) {
            switch (C3092ak.f9564a[liveMode.ordinal()]) {
                case 1:
                    View view = this.contentView;
                    C7573i.m23582a((Object) view, "contentView");
                    ((TextView) view.findViewById(R.id.pj)).setText(R.string.edi);
                    m11685f();
                    return;
                case 2:
                    View view2 = this.contentView;
                    C7573i.m23582a((Object) view2, "contentView");
                    ((TextView) view2.findViewById(R.id.pj)).setText(R.string.edl);
                    break;
            }
        }
        m11686g();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
