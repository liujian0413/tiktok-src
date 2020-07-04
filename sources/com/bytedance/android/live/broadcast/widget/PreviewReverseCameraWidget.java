package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
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

public final class PreviewReverseCameraWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9429a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewReverseCameraWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    private final C7541d f9430b = C7546e.m23569a(new C3034b(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget$a */
    static final class C3033a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewReverseCameraWidget f9431a;

        C3033a(PreviewReverseCameraWidget previewReverseCameraWidget) {
            this.f9431a = previewReverseCameraWidget;
        }

        public final void onClick(View view) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(200);
            rotateAnimation.setInterpolator(new AccelerateInterpolator());
            View view2 = this.f9431a.contentView;
            C7573i.m23582a((Object) view2, "contentView");
            ((ImageView) view2.findViewById(R.id.sn)).startAnimation(rotateAnimation);
            Integer num = (Integer) this.f9431a.mo9841a().mo9598e().getValue();
            if (num == null) {
                num = Integer.valueOf(1);
            }
            C7573i.m23582a((Object) num, "startLiveViewModel.camer…ewModel.CAMERA_TYPE_FRONT");
            int intValue = 1 - num.intValue();
            this.f9431a.mo9841a().mo9598e().postValue(Integer.valueOf(intValue));
            C8947c<Integer> cVar = C8946b.f24477g;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.KEY_LIVE_CAMERA_TYPE");
            cVar.mo22120b(Integer.valueOf(intValue));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget$b */
    static final class C3034b extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewReverseCameraWidget f9432a;

        C3034b(PreviewReverseCameraWidget previewReverseCameraWidget) {
            this.f9432a = previewReverseCameraWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9432a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9841a() {
        return (StartLiveViewModel) this.f9430b.getValue();
    }

    public final int getLayoutId() {
        return R.layout.b09;
    }

    public final void onCreate() {
        super.onCreate();
        Integer num = (Integer) mo9841a().mo9598e().getValue();
        if (num == null) {
            num = Integer.valueOf(1);
        }
        C7573i.m23582a((Object) num, "startLiveViewModel.camer…ewModel.CAMERA_TYPE_FRONT");
        int intValue = num.intValue();
        C8947c<Integer> cVar = C8946b.f24477g;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.KEY_LIVE_CAMERA_TYPE");
        cVar.mo22120b(Integer.valueOf(intValue));
        this.contentView.setOnClickListener(new C3033a(this));
    }
}
