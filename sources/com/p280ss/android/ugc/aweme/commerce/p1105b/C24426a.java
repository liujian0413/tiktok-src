package com.p280ss.android.ugc.aweme.commerce.p1105b;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.gson.C18373n;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.p1216fe.method.CloseHalfDialogBridge.C27878a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commerce.b.a */
public final class C24426a extends Dialog {

    /* renamed from: a */
    private final Activity f64485a;

    /* renamed from: b */
    private final int f64486b;

    /* renamed from: c */
    private final String f64487c;

    /* renamed from: d */
    private final float f64488d;

    /* renamed from: e */
    private final boolean f64489e = true;

    /* renamed from: f */
    private final int f64490f;

    public final void dismiss() {
        C24427b.m80326a(this);
        C42961az.m136383d(this);
        ((CrossPlatformWebView) findViewById(R.id.cvw)).mo67493g(this.f64485a);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void closeHalfDialog(C27878a aVar) {
        boolean z;
        C7573i.m23587b(aVar, "event");
        C6709k a = new C18373n().mo47346a(aVar.f73453a.toString());
        C7573i.m23582a((Object) a, "JsonParser().parse(event.params.toString())");
        C6709k b = a.mo16136m().mo16149b("reactId");
        if (b == null || b.mo16135l()) {
            z = false;
        } else {
            String c = b.mo15998c();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewById(R.id.cvw);
            C7573i.m23582a((Object) crossPlatformWebView, "rn_user_data");
            z = C7573i.m23585a((Object) c, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.k7, null);
        C7573i.m23582a((Object) inflate, "view");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(C23482j.m77098b(getContext()), this.f64486b));
        C24510b bVar = new C24510b(this.f64490f, this.f64488d, this.f64488d, 0.0f, 0.0f);
        inflate.setBackground(bVar);
        setContentView(inflate);
        setCanceledOnTouchOutside(this.f64489e);
        ((CrossPlatformWebView) findViewById(R.id.cvw)).mo67464a(17, 0, 0, 0, 0);
        ((CrossPlatformWebView) findViewById(R.id.cvw)).mo67474a(this.f64487c, true);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            layoutParams = window2.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = this.f64486b;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        C42961az.m136382c(this);
    }

    public C24426a(Activity activity, int i, String str, float f, boolean z, int i2) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "url");
        super(activity, R.style.uu);
        this.f64485a = activity;
        this.f64486b = i;
        this.f64487c = str;
        this.f64488d = f;
        this.f64490f = i2;
    }
}
