package com.p280ss.android.ugc.aweme.mobile.p1401ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.mobile.ui.InputCaptchaFragment */
public class InputCaptchaFragment extends DialogFragment {

    /* renamed from: a */
    public EditText f87737a;

    /* renamed from: b */
    public TextView f87738b;

    /* renamed from: c */
    public View f87739c;

    /* renamed from: d */
    public C33619a f87740d;

    /* renamed from: e */
    public int f87741e;

    /* renamed from: f */
    private ImageView f87742f;

    /* renamed from: g */
    private View f87743g;

    /* renamed from: h */
    private String f87744h;

    /* renamed from: i */
    private boolean f87745i;

    /* renamed from: com.ss.android.ugc.aweme.mobile.ui.InputCaptchaFragment$a */
    public interface C33619a {
    }

    public void onStop() {
        super.onStop();
        this.f87745i = false;
    }

    public void onStart() {
        super.onStart();
        this.f87745i = true;
        m108511a(this.f87744h, "", this.f87741e);
        C11029b bVar = (C11029b) getDialog();
        if (bVar != null) {
            bVar.mo26627a(-1).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (InputCaptchaFragment.this.f87740d == null) {
                        InputCaptchaFragment.this.dismiss();
                    } else if (TextUtils.isEmpty(InputCaptchaFragment.this.f87737a.getText().toString())) {
                        InputCaptchaFragment.this.f87739c.setVisibility(8);
                        InputCaptchaFragment.this.f87738b.setText(R.string.b1o);
                        InputCaptchaFragment.this.f87738b.setVisibility(0);
                    } else {
                        InputCaptchaFragment.this.f87737a.getText();
                    }
                }
            });
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f87738b != null) {
            this.f87738b.setVisibility(4);
        }
        super.onDismiss(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f87744h = arguments.getString("captcha_data");
        this.f87741e = arguments.getInt("captcha_scenario");
        setCancelable(false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C11030a aVar = new C11030a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.adv, null);
        this.f87742f = (ImageView) inflate.findViewById(R.id.t1);
        this.f87743g = inflate.findViewById(R.id.ut);
        this.f87737a = (EditText) inflate.findViewById(R.id.t4);
        this.f87738b = (TextView) inflate.findViewById(R.id.afj);
        this.f87739c = inflate.findViewById(R.id.clj);
        this.f87743g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        aVar.mo26639a(inflate);
        aVar.mo26635a((int) R.string.bxw, (DialogInterface.OnClickListener) null);
        aVar.mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        return aVar.mo26644a();
    }

    public void show(C0608j jVar, String str) {
        try {
            super.show(jVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    private void m108511a(String str, String str2, int i) {
        if (this.f87745i) {
            this.f87741e = i;
            this.f87744h = str;
            if (this.f87742f != null) {
                LayoutParams layoutParams = this.f87742f.getLayoutParams();
                try {
                    byte[] decode = Base64.decode(this.f87744h, 1);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    this.f87742f.setImageBitmap(decodeByteArray);
                    if (decodeByteArray.getWidth() <= 0 || decodeByteArray.getHeight() <= 0) {
                        layoutParams.height = 0;
                    } else {
                        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.cs);
                        layoutParams.height = (layoutParams.width * decodeByteArray.getHeight()) / decodeByteArray.getWidth();
                    }
                } catch (Exception unused) {
                    layoutParams.height = 0;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                this.f87739c.setVisibility(0);
                this.f87738b.setVisibility(8);
                return;
            }
            this.f87739c.setVisibility(8);
            this.f87738b.setVisibility(0);
            this.f87738b.setText(str2);
        }
    }
}
