package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.model.C2752c;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p393h.C8297f;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public final class PreviewCoverPickerWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9396a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewCoverPickerWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewCoverPickerWidget.class), "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    public C3131s f9397b;

    /* renamed from: c */
    public BaseDialogFragment f9398c;

    /* renamed from: d */
    private BaseFragment f9399d;

    /* renamed from: e */
    private final C7541d f9400e = C7546e.m23569a(new C3021g(this));

    /* renamed from: f */
    private final C7541d f9401f = C7546e.m23569a(new C3020f(this));

    /* renamed from: g */
    private C7321c f9402g;

    /* renamed from: h */
    private C7321c f9403h;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$a */
    static final class C3015a<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9404a;

        C3015a(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9404a = previewCoverPickerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (!(num == null || num == null || num.intValue() != 1)) {
                C3131s sVar = this.f9404a.f9397b;
                if (sVar != null) {
                    sVar.mo9959c();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$b */
    static final class C3016b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9405a;

        C3016b(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9405a = previewCoverPickerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            String str;
            if (num != null && num.intValue() == 1) {
                C0052o i = this.f9405a.mo9826a().mo9602i();
                C3131s sVar = this.f9405a.f9397b;
                if (sVar != null) {
                    str = sVar.mo9951a();
                } else {
                    str = null;
                }
                i.postValue(str);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$c */
    static final class C3017c<T> implements C7326g<C8297f> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9406a;

        C3017c(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9406a = previewCoverPickerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C8297f fVar) {
            if (fVar == null) {
                C7573i.m23580a();
            }
            switch (fVar.f22779a) {
                case 1:
                    if (this.f9406a.f9397b != null) {
                        C3131s sVar = this.f9406a.f9397b;
                        if (sVar != null) {
                            sVar.mo9959c();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 2:
                    this.f9406a.mo9828a(fVar.f22780b);
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$d */
    static final class C3018d<T> implements C0053p<LiveMode> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9407a;

        C3018d(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9407a = previewCoverPickerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveMode liveMode) {
            C3131s sVar = this.f9407a.f9397b;
            if (sVar != null) {
                sVar.mo9954a(liveMode);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$e */
    static final class C3019e<T> implements C0053p<C2755e> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9408a;

        C3019e(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9408a = previewCoverPickerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C2755e eVar) {
            if (eVar != null) {
                C3131s sVar = this.f9408a.f9397b;
                if (sVar != null) {
                    int i = (int) eVar.f8729b;
                    ImageModel imageModel = eVar.f8728a;
                    boolean z = true;
                    if (eVar.f8733f != 1) {
                        z = false;
                    }
                    sVar.mo9952a(i, imageModel, z);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$f */
    static final class C3020f extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9409a;

        C3020f(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9409a = previewCoverPickerWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f9409a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$g */
    static final class C3021g extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9410a;

        C3021g(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f9410a = previewCoverPickerWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9410a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$h */
    static final class C3022h<T> implements C7326g<C3479d<C2752c>> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f9411a;

        /* renamed from: b */
        final /* synthetic */ boolean f9412b;

        C3022h(PreviewCoverPickerWidget previewCoverPickerWidget, boolean z) {
            this.f9411a = previewCoverPickerWidget;
            this.f9412b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C2752c> dVar) {
            boolean z;
            String str;
            if (dVar.data != null) {
                C2752c cVar = (C2752c) dVar.data;
                if (cVar.f8723d != null && cVar.f8723d.f8724a) {
                    C3338l<String> lVar = LiveConfigSettingKeys.LIVE_NOTICE_URL;
                    C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LIVE_NOTICE_URL");
                    String str2 = (String) lVar.mo10240a();
                    if (str2 != null) {
                        if (str2.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Uri parse = Uri.parse(str2);
                            if (parse != null) {
                                String queryParameter = parse.getQueryParameter("width");
                                String queryParameter2 = parse.getQueryParameter("height");
                                if (queryParameter != null && queryParameter2 != null) {
                                    try {
                                        int parseInt = Integer.parseInt(queryParameter);
                                        int parseInt2 = Integer.parseInt(queryParameter2);
                                        Builder builder = new Builder();
                                        Builder path = builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                                        String str3 = "type";
                                        if (this.f9412b) {
                                            str = "live";
                                        } else {
                                            str = "upload";
                                        }
                                        path.appendQueryParameter(str3, str).build();
                                        String builder2 = builder.toString();
                                        C7573i.m23582a((Object) builder2, "builder.toString()");
                                        BaseDialogFragment baseDialogFragment = this.f9411a.f9398c;
                                        if (baseDialogFragment != null) {
                                            baseDialogFragment.dismissAllowingStateLoss();
                                        }
                                        PreviewCoverPickerWidget previewCoverPickerWidget = this.f9411a;
                                        C2324b a = C3596c.m13172a(C3141a.class);
                                        if (a == null) {
                                            C7573i.m23580a();
                                        }
                                        previewCoverPickerWidget.f9398c = ((C3141a) a).webViewManager().mo11533a(C3979c.m13951a(builder2).mo11555a(parseInt).mo11560b(parseInt2).mo11566e(17));
                                        if (this.f9411a.f9398c != null) {
                                            Context context = this.f9411a.getContext();
                                            if (context != null) {
                                                BaseDialogFragment.m12686a((FragmentActivity) context, (DialogFragment) this.f9411a.f9398c);
                                            } else {
                                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$i */
    static final class C3023i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C3023i f9413a = new C3023i();

        C3023i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: b */
    private final StartLiveEventViewModel m11642b() {
        return (StartLiveEventViewModel) this.f9401f.getValue();
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9826a() {
        return (StartLiveViewModel) this.f9400e.getValue();
    }

    public final int getLayoutId() {
        return R.layout.alr;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3131s sVar = this.f9397b;
        if (sVar != null) {
            sVar.mo9958b();
        }
        C7321c cVar = this.f9403h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f9399d = null;
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f9397b == null) {
            m11643c();
        }
        C0043i iVar = this;
        m11642b().mo9469c().observe(iVar, new C3015a(this));
        m11642b().mo9470d().observe(iVar, new C3016b(this));
    }

    /* renamed from: c */
    private final void m11643c() {
        this.f9397b = new C3131s(this.contentView, this.f9399d, mo9826a());
        this.f9403h = C9097a.m27146a().mo22266a(C8297f.class).mo19325f((C7326g<? super T>) new C3017c<Object>(this));
        C0043i iVar = this;
        mo9826a().mo9597d().observe(iVar, new C3018d(this));
        mo9826a().mo9592a().observe(iVar, new C3019e(this));
    }

    /* renamed from: a */
    public final void mo9827a(BaseFragment baseFragment) {
        C7573i.m23587b(baseFragment, "fragment");
        this.f9399d = baseFragment;
        if (this.isViewValid) {
            m11643c();
        }
    }

    /* renamed from: a */
    public final void mo9828a(boolean z) {
        this.f9402g = C2515f.m10417f().mo9076c().mo9168c().getBroadcastConfig().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3022h<Object>(this, z), (C7326g<? super Throwable>) C3023i.f9413a);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C3131s sVar = this.f9397b;
        if (sVar != null) {
            sVar.mo9957a(i, i2, intent);
        }
    }
}
