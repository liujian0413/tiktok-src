package com.p280ss.android.ugc.aweme.commercialize;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity */
public class PoiCouponInputActivity extends AmeActivity {

    /* renamed from: a */
    public static final int[] f64645a = {4, 9, 14};

    /* renamed from: b */
    private int f64646b = R.drawable.oh;

    /* renamed from: c */
    private int f64647c = R.drawable.b0o;
    View clear;
    ImageView confirm;

    /* renamed from: d */
    private boolean f64648d;

    /* renamed from: e */
    private int f64649e;

    /* renamed from: f */
    private final C24499a f64650f = new C24499a();

    /* renamed from: g */
    private ObjectAnimator f64651g = null;
    EditText input;
    TextTitleBar titleBar;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity$a */
    static class C24499a {

        /* renamed from: a */
        private CharSequence f64654a;

        /* renamed from: b */
        private StringBuilder f64655b;

        /* renamed from: c */
        private int f64656c;

        /* renamed from: d */
        private int f64657d;

        /* renamed from: e */
        private int f64658e;

        /* renamed from: f */
        private int f64659f;

        /* renamed from: g */
        private int f64660g;

        /* renamed from: h */
        private boolean f64661h;

        private C24499a() {
        }

        /* renamed from: c */
        private StringBuilder m80487c() {
            if (this.f64655b == null) {
                this.f64655b = new StringBuilder();
                this.f64655b.append(this.f64654a.subSequence(0, this.f64659f));
            }
            return this.f64655b;
        }

        /* renamed from: d */
        private boolean m80488d() {
            for (int i : PoiCouponInputActivity.f64645a) {
                if (i == this.f64660g) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m80485b() {
            m80487c();
            this.f64659f++;
            if (this.f64656c >= this.f64660g) {
                this.f64656c--;
            }
            if (this.f64657d >= this.f64660g) {
                this.f64657d--;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo64266a() {
            while (this.f64659f < this.f64658e && this.f64660g < 14) {
                char charAt = this.f64654a.charAt(this.f64659f);
                if (m80488d()) {
                    if (charAt == ' ') {
                        m80484a(charAt);
                    } else {
                        m80486b(' ');
                    }
                } else if (Character.isDigit(charAt)) {
                    m80484a(charAt);
                } else {
                    m80485b();
                }
            }
        }

        /* renamed from: a */
        private void m80484a(char c) {
            if (this.f64655b != null) {
                this.f64655b.append(c);
            }
            this.f64659f++;
            this.f64660g++;
        }

        /* renamed from: b */
        private void m80486b(char c) {
            m80487c().append(' ');
            if (this.f64656c >= this.f64660g) {
                this.f64656c++;
            }
            if (this.f64657d >= this.f64660g) {
                this.f64657d++;
            }
            this.f64660g++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo64267a(EditText editText) {
            this.f64654a = editText.getText();
            this.f64655b = null;
            this.f64656c = editText.getSelectionStart();
            this.f64657d = editText.getSelectionEnd();
            this.f64658e = this.f64654a.length();
            boolean z = false;
            this.f64659f = 0;
            this.f64660g = 0;
            if (this.f64658e >= 14) {
                z = true;
            }
            this.f64661h = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo64268a(PoiCouponInputActivity poiCouponInputActivity) {
            if (this.f64655b != null) {
                poiCouponInputActivity.mo64261a(this.f64655b, Math.min(this.f64656c, 14), Math.min(this.f64657d, 14));
            } else if (this.f64661h) {
                poiCouponInputActivity.mo64261a(this.f64654a.subSequence(0, 14), Math.min(this.f64656c, 14), Math.min(this.f64657d, 14));
            }
            this.f64654a = null;
            this.f64655b = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void onClearClicked() {
        m80479d();
    }

    /* renamed from: a */
    private boolean m80476a() {
        if (this.input.getText().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m80479d() {
        this.f64648d = true;
        try {
            this.input.setText("");
        } finally {
            this.f64648d = false;
        }
    }

    public void onResume() {
        super.onResume();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.input, 1);
        }
    }

    /* renamed from: b */
    private boolean m80477b() {
        Editable text = this.input.getText();
        int length = text.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isDigit(text.charAt(i2))) {
                i++;
            }
        }
        if (i == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private String m80478c() {
        StringBuilder sb = new StringBuilder();
        Editable text = this.input.getText();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(text.charAt(i))) {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void onInputChanged() {
        int i;
        View view = this.clear;
        boolean z = false;
        if (m80476a()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        ImageView imageView = this.confirm;
        if (this.f64651g == null && m80477b()) {
            z = true;
        }
        imageView.setEnabled(z);
        if (!this.f64648d) {
            this.f64650f.mo64267a(this.input);
            this.f64650f.mo64266a();
            this.f64650f.mo64268a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onConfirmClicked() {
        String c = m80478c();
        m80479d();
        this.confirm.setImageResource(this.f64647c);
        this.f64651g = ObjectAnimator.ofFloat(this.confirm, "rotation", new float[]{0.0f, 360.0f});
        this.f64651g.setDuration(800);
        int i = 1;
        this.f64651g.setRepeatMode(1);
        this.f64651g.setRepeatCount(-1);
        this.f64651g.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                PoiCouponInputActivity.this.confirm.setRotation(0.0f);
            }
        });
        this.f64651g.start();
        if (this.f64649e != 1) {
            i = 0;
        }
        C18253l a = CouponRedeemApi.m80560a(c, i);
        a.mo6818a(new C24753h(this, a, c), C23364n.f61448a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.dx);
        ButterKnife.bind((Activity) this);
        this.f64649e = getIntent().getIntExtra("from_page", 0);
        this.confirm.setEnabled(false);
        this.titleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                PoiCouponInputActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r3.f64651g != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r3.f64651g.cancel();
        r3.f64651g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r3.confirm.setImageResource(r3.f64646b);
        r3.confirm.setEnabled(m80477b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r3.f64651g == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        if (r3.f64651g == null) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo64260a(com.google.common.util.concurrent.C18253l r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r4 = (com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponDetailApiResponse) r4     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            if (r4 == 0) goto L_0x001b
            int r1 = r4.statusCode     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            if (r1 == 0) goto L_0x001b
            android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            java.lang.String r4 = r4.statusMsg     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r5, r4)     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            r4.mo25750a()     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            goto L_0x0032
        L_0x001b:
            if (r4 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetail r1 = r4.coupon     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetail r1 = r4.coupon     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            int r1 = r1.couponType     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            r2 = 10
            if (r1 != r2) goto L_0x002d
            com.p280ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity.m80454a(r3, r5)     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
            goto L_0x0032
        L_0x002d:
            java.lang.String r1 = "input"
            com.p280ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity.m80495a(r3, r5, r4, r1)     // Catch:{ InterruptedException -> 0x007b, ExecutionException -> 0x0050 }
        L_0x0032:
            android.animation.ObjectAnimator r4 = r3.f64651g
            if (r4 == 0) goto L_0x003d
        L_0x0036:
            android.animation.ObjectAnimator r4 = r3.f64651g
            r4.cancel()
            r3.f64651g = r0
        L_0x003d:
            android.widget.ImageView r4 = r3.confirm
            int r5 = r3.f64646b
            r4.setImageResource(r5)
            android.widget.ImageView r4 = r3.confirm
            boolean r5 = r3.m80477b()
            r4.setEnabled(r5)
            return
        L_0x004e:
            r4 = move-exception
            goto L_0x005f
        L_0x0050:
            r4 = 2131825037(0x7f11118d, float:1.9282919E38)
            com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r3, r4)     // Catch:{ all -> 0x004e }
            r4.mo25750a()     // Catch:{ all -> 0x004e }
            android.animation.ObjectAnimator r4 = r3.f64651g
            if (r4 == 0) goto L_0x003d
            goto L_0x0036
        L_0x005f:
            android.animation.ObjectAnimator r5 = r3.f64651g
            if (r5 == 0) goto L_0x006a
            android.animation.ObjectAnimator r5 = r3.f64651g
            r5.cancel()
            r3.f64651g = r0
        L_0x006a:
            android.widget.ImageView r5 = r3.confirm
            int r0 = r3.f64646b
            r5.setImageResource(r0)
            android.widget.ImageView r5 = r3.confirm
            boolean r0 = r3.m80477b()
            r5.setEnabled(r0)
            throw r4
        L_0x007b:
            android.animation.ObjectAnimator r4 = r3.f64651g
            if (r4 == 0) goto L_0x003d
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.PoiCouponInputActivity.mo64260a(com.google.common.util.concurrent.l, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo64261a(CharSequence charSequence, int i, int i2) {
        this.f64648d = true;
        try {
            this.input.setText(charSequence);
            this.input.setSelection(i, i2);
        } finally {
            this.f64648d = false;
        }
    }
}
