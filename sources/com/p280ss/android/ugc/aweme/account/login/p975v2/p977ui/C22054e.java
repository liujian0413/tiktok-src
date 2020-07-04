package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor.InterceptorCaptchaData;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e */
public final class C22054e {

    /* renamed from: a */
    public C22055a f58979a;

    /* renamed from: b */
    public C22056b f58980b;

    /* renamed from: c */
    private Activity f58981c;

    /* renamed from: d */
    private ImageView f58982d;

    /* renamed from: e */
    private View f58983e;

    /* renamed from: f */
    private EditText f58984f;

    /* renamed from: g */
    private TextView f58985g;

    /* renamed from: h */
    private View f58986h;

    /* renamed from: i */
    private String f58987i;

    /* renamed from: j */
    private String f58988j;

    /* renamed from: k */
    private C11029b f58989k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$a */
    public interface C22055a {
        void onOk(String str, String str2);

        void onRefreshCaptcha();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$b */
    public interface C22056b {
        void onCancel();
    }

    /* renamed from: a */
    public final void mo58405a() {
        this.f58989k.show();
    }

    public final void dismiss() {
        this.f58989k.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58406a(DialogInterface dialogInterface) {
        this.f58989k.mo26627a(-1).setOnClickListener(new C22150i(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58410b(View view) {
        if (this.f58979a != null) {
            this.f58979a.onRefreshCaptcha();
        }
    }

    public C22054e(Activity activity) {
        this.f58981c = activity;
        C11030a a = C22347v.m73994a(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.adv, null);
        this.f58982d = (ImageView) inflate.findViewById(R.id.t1);
        this.f58983e = inflate.findViewById(R.id.ut);
        this.f58984f = (EditText) inflate.findViewById(R.id.t4);
        this.f58985g = (TextView) inflate.findViewById(R.id.afj);
        this.f58986h = inflate.findViewById(R.id.clj);
        this.f58983e.setOnClickListener(new C22057f(this));
        a.mo26639a(inflate);
        a.mo26642a(false);
        a.mo26635a((int) R.string.bxw, (OnClickListener) null);
        a.mo26646b((int) R.string.w_, (OnClickListener) new C22148g(this));
        this.f58989k = a.mo26644a();
        this.f58989k.setOnShowListener(new C22149h(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58408a(View view) {
        if (this.f58979a == null) {
            this.f58989k.dismiss();
        } else if (TextUtils.isEmpty(this.f58984f.getText().toString())) {
            this.f58986h.setVisibility(8);
            this.f58985g.setText(R.string.b1o);
            this.f58985g.setVisibility(0);
        } else {
            this.f58979a.onOk(this.f58984f.getText().toString(), this.f58988j);
        }
    }

    /* renamed from: a */
    public final void mo58409a(InterceptorCaptchaData interceptorCaptchaData) {
        this.f58988j = interceptorCaptchaData.scenario;
        this.f58987i = interceptorCaptchaData.captcha;
        if (this.f58982d != null) {
            LayoutParams layoutParams = this.f58982d.getLayoutParams();
            byte[] decode = Base64.decode(this.f58987i, 1);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                this.f58982d.setImageBitmap(decodeByteArray);
                if (decodeByteArray.getWidth() <= 0 || decodeByteArray.getHeight() <= 0) {
                    layoutParams.height = 0;
                } else {
                    layoutParams.width = this.f58981c.getResources().getDimensionPixelSize(R.dimen.cs);
                    layoutParams.height = (layoutParams.width * decodeByteArray.getHeight()) / decodeByteArray.getWidth();
                }
            }
        }
        if (TextUtils.isEmpty(interceptorCaptchaData.errorMsg)) {
            this.f58986h.setVisibility(0);
            this.f58985g.setVisibility(8);
            return;
        }
        this.f58986h.setVisibility(8);
        this.f58985g.setVisibility(0);
        this.f58985g.setText(interceptorCaptchaData.errorMsg);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58407a(DialogInterface dialogInterface, int i) {
        if (this.f58980b != null) {
            this.f58980b.onCancel();
        }
    }
}
