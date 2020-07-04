package com.p280ss.android.ugc.aweme.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.C23460b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.d */
public final class C23316d {

    /* renamed from: a */
    public static final C23316d f61379a = new C23316d();

    /* renamed from: com.ss.android.ugc.aweme.base.d$a */
    static final class C23317a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Intent f61380a;

        /* renamed from: b */
        final /* synthetic */ Context f61381b;

        /* renamed from: c */
        final /* synthetic */ View f61382c;

        /* renamed from: d */
        final /* synthetic */ Intent f61383d;

        C23317a(Intent intent, Context context, View view, Intent intent2) {
            this.f61380a = intent;
            this.f61381b = context;
            this.f61382c = view;
            this.f61383d = intent2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f61383d.putExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", true);
            this.f61383d.removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            this.f61381b.startActivity(this.f61380a);
        }
    }

    private C23316d() {
    }

    /* renamed from: a */
    public static final boolean m76492a(Intent intent) {
        boolean z;
        boolean z2;
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("VENDOR_BACK_URL_FOR_INTENT_KEY");
        String stringExtra2 = intent.getStringExtra("VENDOR_BTN_NAME_FOR_INTENT_KEY");
        CharSequence charSequence = stringExtra;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = stringExtra2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final C23460b m76490a(Intent intent, Activity activity) {
        C7573i.m23587b(intent, "intent");
        C7573i.m23587b(activity, "activity");
        C23460b bVar = new C23460b(intent, activity);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, C23486n.m77122a(90.0d), 0, 0);
        bVar.setLayoutParams(layoutParams);
        return bVar;
    }

    /* renamed from: a */
    public static final void m76491a(Intent intent, DmtTextView dmtTextView, View view, Context context) {
        boolean z;
        C7573i.m23587b(dmtTextView, "backBtnView");
        C7573i.m23587b(view, "contentView");
        C7573i.m23587b(context, "context");
        if (intent != null) {
            CharSequence stringExtra = intent.getStringExtra("VENDOR_BTN_NAME_FOR_INTENT_KEY");
            if (stringExtra == null || stringExtra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dmtTextView.setText(stringExtra);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            if (!(intent2 == null || intent2.resolveActivity(context.getPackageManager()) == null)) {
                view.setOnClickListener(new C23317a(intent2, context, view, intent));
            }
        }
    }
}
