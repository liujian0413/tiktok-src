package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class PreviewCloseWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9370a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewCloseWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    private final C7541d f9371b = C7546e.m23569a(new C2999b(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCloseWidget$a */
    static final class C2998a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCloseWidget f9372a;

        C2998a(PreviewCloseWidget previewCloseWidget) {
            this.f9372a = previewCloseWidget;
        }

        public final void onClick(View view) {
            this.f9372a.mo9814a().mo9467a().postValue(Integer.valueOf(1));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCloseWidget$b */
    static final class C2999b extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCloseWidget f9373a;

        C2999b(PreviewCloseWidget previewCloseWidget) {
            this.f9373a = previewCloseWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f9373a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveEventViewModel mo9814a() {
        return (StartLiveEventViewModel) this.f9371b.getValue();
    }

    public final int getLayoutId() {
        return R.layout.alp;
    }

    public final void onCreate() {
        super.onCreate();
        this.containerView.setOnClickListener(new C2998a(this));
    }
}
