package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2420b;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2427e.C2428a;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.C2636q.C2637a;
import com.bytedance.android.live.broadcast.effect.C2636q.C2639c;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.monitor.C2759b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class PreviewBeautyWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9355a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewBeautyWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewBeautyWidget.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    public C9349d f9356b;

    /* renamed from: c */
    private LiveBeautyFilterDialogFragment f9357c;

    /* renamed from: d */
    private final C7541d f9358d = C7546e.m23569a(new C2995f(this));

    /* renamed from: e */
    private final C7541d f9359e = C7546e.m23569a(new C2990a(this));

    /* renamed from: f */
    private final C2994e f9360f;

    /* renamed from: g */
    private final C2991b f9361g;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$a */
    static final class C2990a extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9362a;

        C2990a(PreviewBeautyWidget previewBeautyWidget) {
            this.f9362a = previewBeautyWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f9362a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$b */
    public static final class C2991b implements C2420b {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9363a;

        /* renamed from: a */
        public final int mo8881a(boolean z) {
            return -1;
        }

        /* renamed from: a */
        public final int mo8878a() {
            C9349d dVar = this.f9363a.f9356b;
            if (dVar != null) {
                return dVar.mo9578a("");
            }
            return 0;
        }

        C2991b(PreviewBeautyWidget previewBeautyWidget) {
            this.f9363a = previewBeautyWidget;
        }

        /* renamed from: a */
        public final int mo8882a(String[] strArr) {
            C7573i.m23587b(strArr, "nodePaths");
            C9349d dVar = this.f9363a.f9356b;
            if (dVar != null) {
                return dVar.mo9580a(strArr);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8880a(String str, boolean z) {
            C7573i.m23587b(str, "path");
            C9349d dVar = this.f9363a.f9356b;
            if (dVar != null) {
                return dVar.mo9578a(str);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8879a(String str, String str2, float f) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "nodeTag");
            C9349d dVar = this.f9363a.f9356b;
            if (dVar != null) {
                return dVar.mo9579a(str, str2, f);
            }
            return 0;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$c */
    public static final class C2992c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9364a;

        C2992c(PreviewBeautyWidget previewBeautyWidget) {
            this.f9364a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f9364a.mo9806a().mo9471e().postValue(Integer.valueOf(0));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$d */
    static final class C2993d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9365a;

        C2993d(PreviewBeautyWidget previewBeautyWidget) {
            this.f9365a = previewBeautyWidget;
        }

        public final void onClick(View view) {
            this.f9365a.mo9809c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$e */
    public static final class C2994e implements C2585a {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9366a;

        C2994e(PreviewBeautyWidget previewBeautyWidget) {
            this.f9366a = previewBeautyWidget;
        }

        /* renamed from: a */
        public final void mo8810a(int i) {
            C9349d dVar = this.f9366a.f9356b;
            if (dVar != null) {
                dVar.mo9587b(i);
            }
            C8947c<Integer> cVar = C8946b.f24361M;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.LIVE_FILTER_ID");
            cVar.mo22118a(Integer.valueOf(i));
            this.f9366a.mo9807a(i);
            C2759b.m11036a(i, "click");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$f */
    static final class C2995f extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9367a;

        C2995f(PreviewBeautyWidget previewBeautyWidget) {
            this.f9367a = previewBeautyWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9367a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveEventViewModel mo9806a() {
        return (StartLiveEventViewModel) this.f9359e.getValue();
    }

    public final int getLayoutId() {
        return R.layout.azx;
    }

    public PreviewBeautyWidget() {
        C2624k.m10736a().mo9267b();
        this.f9360f = new C2994e(this);
        this.f9361g = new C2991b(this);
    }

    /* renamed from: b */
    public final void mo9808b() {
        C2515f.m10417f().mo9074a().mo8894b();
        C9349d dVar = this.f9356b;
        if (dVar != null) {
            C8947c<Integer> cVar = C8946b.f24361M;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.LIVE_FILTER_ID");
            Object a = cVar.mo22117a();
            C7573i.m23582a(a, "LivePluginProperties.LIVE_FILTER_ID.value");
            dVar.mo9587b(((Number) a).intValue());
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.contentView.setOnClickListener(new C2993d(this));
        m11614d();
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        C2636q b2 = b.mo9214b();
        Context context = this.context;
        if (context != null) {
            b2.m10772a((FragmentActivity) context, (C2639c) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: d */
    private final void m11614d() {
        C2515f.m10417f().mo9074a().mo8888a(new C2428a().mo8913a(C7525m.m23464b((Object[]) new String[]{C2418b.f7950a, C2418b.f7953d, "beauty"})).mo8915b(C7525m.m23457a("effect_gift")).mo8912a((C2420b) this.f9361g).mo8914a());
    }

    /* renamed from: c */
    public final void mo9809c() {
        C8443c.m25663a().mo21607a("takepage_beauty_icon_click", new Object[0]);
        if (!C3134u.m11873a(C3358ac.m12528e())) {
            C9049ap.m27022a((int) R.string.fcw);
            return;
        }
        mo9806a().mo9471e().postValue(Integer.valueOf(2));
        C2588b b = C2515f.m10417f().mo9075b();
        Context context = this.context;
        if (context != null) {
            this.f9357c = b.mo9211a((FragmentActivity) context, (C2585a) this.f9360f);
            LiveBeautyFilterDialogFragment liveBeautyFilterDialogFragment = this.f9357c;
            if (liveBeautyFilterDialogFragment != null) {
                liveBeautyFilterDialogFragment.mo9178a((OnDismissListener) new C2992c(this));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo9807a(int i) {
        if (this.f9356b != null) {
            C2624k a = C2624k.m10736a();
            C7573i.m23582a((Object) a, "LiveFilterManager.inst()");
            float a2 = C2619g.m10718a(a.f8419b, i);
            C2624k a3 = C2624k.m10736a();
            C7573i.m23582a((Object) a3, "LiveFilterManager.inst()");
            if (!C6311g.m19573a(a3.f8419b) && i >= 0) {
                C2624k a4 = C2624k.m10736a();
                C7573i.m23582a((Object) a4, "LiveFilterManager.inst()");
                if (i < a4.f8419b.size()) {
                    C2624k a5 = C2624k.m10736a();
                    C7573i.m23582a((Object) a5, "LiveFilterManager.inst()");
                    String a6 = C2663f.m10856a("beautyTag", (FilterModel) a5.f8419b.get(i));
                    C2588b b = C2515f.m10417f().mo9075b();
                    C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
                    C9355c b2 = b.mo9212a().mo9322b(a6);
                    if (b2 != null && b2.f25570i != null) {
                        C2421c a7 = C2515f.m10417f().mo9074a();
                        a7.mo8892a(C2418b.f7953d, b2);
                        Float c = a7.mo8899c(b2.f25570i.f25589b);
                        if (c == null) {
                            c = Float.valueOf(C2637a.m10781a(b2, b2.f25570i.f25588a));
                        }
                        int i2 = (int) a2;
                        if (c.floatValue() > C2637a.m10781a(b2, i2)) {
                            a7.mo8891a(b2.f25570i.f25589b, C2637a.m10781a(b2, i2));
                        }
                    }
                }
            }
        }
    }
}
