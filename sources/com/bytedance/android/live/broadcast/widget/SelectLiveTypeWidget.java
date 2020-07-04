package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
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

public final class SelectLiveTypeWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9448a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SelectLiveTypeWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    private final C7541d f9449b = C7546e.m23569a(new C3045c(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$a */
    static final class C3043a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f9450a;

        C3043a(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f9450a = selectLiveTypeWidget;
        }

        public final void onClick(View view) {
            this.f9450a.mo9850a().mo9597d().postValue(LiveMode.VIDEO);
            this.f9450a.mo9851a(true);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$b */
    static final class C3044b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f9451a;

        C3044b(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f9451a = selectLiveTypeWidget;
        }

        public final void onClick(View view) {
            this.f9451a.mo9850a().mo9597d().postValue(LiveMode.THIRD_PARTY);
            this.f9451a.mo9851a(false);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$c */
    static final class C3045c extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f9452a;

        C3045c(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f9452a = selectLiveTypeWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9452a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9850a() {
        return (StartLiveViewModel) this.f9449b.getValue();
    }

    public final int getLayoutId() {
        return R.layout.b0_;
    }

    public final void onCreate() {
        boolean z;
        super.onCreate();
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ((LinearLayout) view.findViewById(R.id.eb0)).setOnClickListener(new C3043a(this));
        View view2 = this.contentView;
        C7573i.m23582a((Object) view2, "contentView");
        ((LinearLayout) view2.findViewById(R.id.apy)).setOnClickListener(new C3044b(this));
        C8947c<String> cVar = C8946b.f24358J;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.LIVE_START_LIVE_MODE_NAME");
        Object a = cVar.mo22117a();
        C7573i.m23582a(a, "LivePluginProperties.LIV…TART_LIVE_MODE_NAME.value");
        LiveMode valueOf = LiveMode.valueOf((String) a);
        if (valueOf == LiveMode.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        mo9851a(z);
        mo9850a().mo9597d().postValue(valueOf);
    }

    /* renamed from: a */
    public final void mo9851a(boolean z) {
        if (z) {
            View view = this.contentView;
            C7573i.m23582a((Object) view, "contentView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.eb0);
            C7573i.m23582a((Object) linearLayout, "contentView.video_model_block");
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.eb1);
            C7573i.m23582a((Object) imageView, "contentView.video_model_block.video_model_icon");
            Context context = getContext();
            C7573i.m23582a((Object) context, "getContext()");
            imageView.setBackground(context.getResources().getDrawable(R.drawable.bzc));
            View view2 = this.contentView;
            C7573i.m23582a((Object) view2, "contentView");
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.eb0);
            C7573i.m23582a((Object) linearLayout2, "contentView.video_model_block");
            TextView textView = (TextView) linearLayout2.findViewById(R.id.eb2);
            C7573i.m23582a((Object) textView, "contentView.video_model_block.video_model_text");
            textView.setAlpha(0.9f);
            View view3 = this.contentView;
            C7573i.m23582a((Object) view3, "contentView");
            LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.apy);
            C7573i.m23582a((Object) linearLayout3, "contentView.game_model_block");
            ImageView imageView2 = (ImageView) linearLayout3.findViewById(R.id.apw);
            C7573i.m23582a((Object) imageView2, "contentView.game_model_block.game_mode_icon");
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "getContext()");
            imageView2.setBackground(context2.getResources().getDrawable(R.drawable.bz8));
            View view4 = this.contentView;
            C7573i.m23582a((Object) view4, "contentView");
            LinearLayout linearLayout4 = (LinearLayout) view4.findViewById(R.id.apy);
            C7573i.m23582a((Object) linearLayout4, "contentView.game_model_block");
            TextView textView2 = (TextView) linearLayout4.findViewById(R.id.apx);
            C7573i.m23582a((Object) textView2, "contentView.game_model_block.game_mode_text");
            textView2.setAlpha(0.5f);
            return;
        }
        View view5 = this.contentView;
        C7573i.m23582a((Object) view5, "contentView");
        LinearLayout linearLayout5 = (LinearLayout) view5.findViewById(R.id.eb0);
        C7573i.m23582a((Object) linearLayout5, "contentView.video_model_block");
        ImageView imageView3 = (ImageView) linearLayout5.findViewById(R.id.eb1);
        C7573i.m23582a((Object) imageView3, "contentView.video_model_block.video_model_icon");
        Context context3 = getContext();
        C7573i.m23582a((Object) context3, "getContext()");
        imageView3.setBackground(context3.getResources().getDrawable(R.drawable.bzd));
        View view6 = this.contentView;
        C7573i.m23582a((Object) view6, "contentView");
        LinearLayout linearLayout6 = (LinearLayout) view6.findViewById(R.id.eb0);
        C7573i.m23582a((Object) linearLayout6, "contentView.video_model_block");
        TextView textView3 = (TextView) linearLayout6.findViewById(R.id.eb2);
        C7573i.m23582a((Object) textView3, "contentView.video_model_block.video_model_text");
        textView3.setAlpha(0.5f);
        View view7 = this.contentView;
        C7573i.m23582a((Object) view7, "contentView");
        LinearLayout linearLayout7 = (LinearLayout) view7.findViewById(R.id.apy);
        C7573i.m23582a((Object) linearLayout7, "contentView.game_model_block");
        ImageView imageView4 = (ImageView) linearLayout7.findViewById(R.id.apw);
        C7573i.m23582a((Object) imageView4, "contentView.game_model_block.game_mode_icon");
        Context context4 = getContext();
        C7573i.m23582a((Object) context4, "getContext()");
        imageView4.setBackground(context4.getResources().getDrawable(R.drawable.bz7));
        View view8 = this.contentView;
        C7573i.m23582a((Object) view8, "contentView");
        LinearLayout linearLayout8 = (LinearLayout) view8.findViewById(R.id.apy);
        C7573i.m23582a((Object) linearLayout8, "contentView.game_model_block");
        TextView textView4 = (TextView) linearLayout8.findViewById(R.id.apx);
        C7573i.m23582a((Object) textView4, "contentView.game_model_block.game_mode_text");
        textView4.setAlpha(0.9f);
    }
}
