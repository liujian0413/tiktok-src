package com.p280ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponRedeemApiResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity */
public final class CouponVerifyConsumptionSuccessActivity extends AmeActivity implements OnClickListener {

    /* renamed from: a */
    public static final C24490a f64624a = new C24490a(null);

    /* renamed from: b */
    private HashMap f64625b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity$a */
    public static final class C24490a {

        /* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity$a$a */
        static final class C24491a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C18253l f64626a;

            /* renamed from: b */
            final /* synthetic */ Context f64627b;

            C24491a(C18253l lVar, Context context) {
                this.f64626a = lVar;
                this.f64627b = context;
            }

            public final void run() {
                try {
                    CouponRedeemApiResponse couponRedeemApiResponse = (CouponRedeemApiResponse) this.f64626a.get();
                    if (couponRedeemApiResponse == null || couponRedeemApiResponse.statusCode != 0) {
                        C10761a.m31403c(this.f64627b, couponRedeemApiResponse.statusMsg).mo25750a();
                    } else {
                        C24490a.m80455a(this.f64627b);
                    }
                } catch (InterruptedException unused) {
                } catch (ExecutionException unused2) {
                    C10761a.m31399c(this.f64627b, (int) R.string.cjm).mo25750a();
                }
            }
        }

        private C24490a() {
        }

        public /* synthetic */ C24490a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m80455a(Context context) {
            C7573i.m23587b(context, "context");
            Intent intent = new Intent(context, CouponVerifyConsumptionSuccessActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m80456a(Context context, String str) {
            if (context != null && str != null) {
                C18253l a = CouponRedeemApi.m80559a(str);
                a.mo6818a(new C24491a(a, context), C23364n.f61448a);
            }
        }
    }

    /* renamed from: a */
    private View m80453a(int i) {
        if (this.f64625b == null) {
            this.f64625b = new HashMap();
        }
        View view = (View) this.f64625b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f64625b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public static final void m80454a(Context context, String str) {
        C24490a.m80456a(context, str);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.b6a || id == R.id.dsk) {
                finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.b4);
        OnClickListener onClickListener = this;
        ((ImageView) m80453a(R.id.b6a)).setOnClickListener(onClickListener);
        ((DmtTextView) m80453a(R.id.dsk)).setOnClickListener(onClickListener);
    }
}
