package com.p280ss.android.ugc.aweme.account.login.p974ui;

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
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment */
public class InputCaptchaFragment extends DialogFragment {

    /* renamed from: a */
    public EditText f58408a;

    /* renamed from: b */
    public TextView f58409b;

    /* renamed from: c */
    public View f58410c;

    /* renamed from: d */
    public C21823a f58411d;

    /* renamed from: e */
    public C21824b f58412e;

    /* renamed from: f */
    public int f58413f;

    /* renamed from: g */
    private ImageView f58414g;

    /* renamed from: h */
    private View f58415h;

    /* renamed from: i */
    private String f58416i;

    /* renamed from: j */
    private boolean f58417j;

    /* renamed from: k */
    private boolean f58418k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment$a */
    public interface C21823a {
        /* renamed from: a */
        void mo57346a();

        /* renamed from: a */
        void mo57347a(String str, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment$b */
    public interface C21824b {
        /* renamed from: b */
        void mo58201b();
    }

    /* renamed from: a */
    public final void mo58195a() {
        this.f58417j = false;
        dismiss();
    }

    public void onStop() {
        super.onStop();
        this.f58418k = false;
    }

    public void onStart() {
        super.onStart();
        this.f58418k = true;
        mo58197a(this.f58416i, "", this.f58413f);
        C11029b bVar = (C11029b) getDialog();
        if (bVar != null) {
            bVar.mo26627a(-1).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (InputCaptchaFragment.this.f58411d == null) {
                        InputCaptchaFragment.this.dismiss();
                    } else if (TextUtils.isEmpty(InputCaptchaFragment.this.f58408a.getText().toString())) {
                        InputCaptchaFragment.this.f58410c.setVisibility(8);
                        InputCaptchaFragment.this.f58409b.setText(R.string.b1o);
                        InputCaptchaFragment.this.f58409b.setVisibility(0);
                    } else {
                        InputCaptchaFragment.this.f58411d.mo57347a(InputCaptchaFragment.this.f58408a.getText().toString(), InputCaptchaFragment.this.f58413f);
                    }
                }
            });
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f58409b != null) {
            this.f58409b.setVisibility(4);
        }
        super.onDismiss(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f58416i = arguments.getString("captcha_data");
        this.f58413f = arguments.getInt("captcha_scenario");
        setCancelable(false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C11030a a = C22347v.m73994a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.adv, null);
        this.f58414g = (ImageView) inflate.findViewById(R.id.t1);
        this.f58415h = inflate.findViewById(R.id.ut);
        this.f58408a = (EditText) inflate.findViewById(R.id.t4);
        this.f58409b = (TextView) inflate.findViewById(R.id.afj);
        this.f58410c = inflate.findViewById(R.id.clj);
        this.f58415h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (InputCaptchaFragment.this.f58411d != null) {
                    InputCaptchaFragment.this.f58411d.mo57346a();
                }
            }
        });
        a.mo26639a(inflate);
        a.mo26635a((int) R.string.bxw, (DialogInterface.OnClickListener) null);
        a.mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (InputCaptchaFragment.this.f58412e != null) {
                    InputCaptchaFragment.this.f58412e.mo58201b();
                }
            }
        });
        return a.mo26644a();
    }

    public void show(C0608j jVar, String str) {
        try {
            super.show(jVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo58196a(C0608j jVar, String str) {
        if (!this.f58417j) {
            this.f58417j = true;
            show(jVar, str);
        }
    }

    /* renamed from: a */
    public static InputCaptchaFragment m72938a(String str, int i, C21823a aVar) {
        InputCaptchaFragment inputCaptchaFragment = new InputCaptchaFragment();
        Bundle bundle = new Bundle();
        bundle.putString("captcha_data", str);
        bundle.putInt("captcha_scenario", i);
        inputCaptchaFragment.setArguments(bundle);
        inputCaptchaFragment.f58411d = aVar;
        return inputCaptchaFragment;
    }

    /* renamed from: a */
    public final void mo58197a(String str, String str2, int i) {
        if (this.f58418k) {
            this.f58413f = i;
            this.f58416i = str;
            if (this.f58414g != null) {
                LayoutParams layoutParams = this.f58414g.getLayoutParams();
                try {
                    byte[] decode = Base64.decode(this.f58416i, 1);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    this.f58414g.setImageBitmap(decodeByteArray);
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
                this.f58410c.setVisibility(0);
                this.f58409b.setVisibility(8);
                return;
            }
            this.f58410c.setVisibility(8);
            this.f58409b.setVisibility(0);
            this.f58409b.setText(str2);
        }
    }
}
