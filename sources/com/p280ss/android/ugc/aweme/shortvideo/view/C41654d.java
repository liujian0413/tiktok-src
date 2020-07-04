package com.p280ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.d */
public class C41654d extends ProgressDialog implements OnKeyListener {

    /* renamed from: a */
    public boolean f108248a = false;

    /* renamed from: b */
    private boolean f108249b;

    /* renamed from: c */
    private CharSequence f108250c;

    /* renamed from: d */
    private Drawable f108251d;

    /* renamed from: e */
    private String f108252e;

    /* renamed from: f */
    private long f108253f;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo102303b() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b_w);
        if (circularProgressView != null) {
            circularProgressView.mo61115b();
        }
        super.dismiss();
    }

    public void dismiss() {
        C41655e eVar = new C41655e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            C6726a.m20844b(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo102302a() {
        View findViewById = findViewById(R.id.cky);
        if (findViewById != null) {
            if (this.f108248a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    private void m132585a(String str) {
        if (this.f108249b) {
            TextView textView = (TextView) findViewById(R.id.djk);
            if (textView != null && !C6319n.m19593a(str)) {
                textView.setText(str);
                C9738o.m28712b((View) textView, 0);
            }
        }
        this.f108252e = str;
    }

    /* renamed from: a */
    private void m132583a(Drawable drawable) {
        if (this.f108249b) {
            View findViewById = findViewById(R.id.cwi);
            if (findViewById != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0683b.m2903a(getContext(), (int) R.drawable.hk)}));
            }
        }
        this.f108251d = drawable;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a5_);
        this.f108249b = true;
        setMessage(this.f108250c);
        setIndeterminate(false);
        m132585a(this.f108252e);
        if (this.f108251d != null) {
            m132583a(this.f108251d);
        }
        setOnKeyListener(this);
        this.f108253f = System.currentTimeMillis();
    }

    public void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f108249b) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b_w);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.cky);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f108249b) {
            TextView textView = (TextView) findViewById(R.id.by6);
            if (textView != null) {
                textView.setText(charSequence);
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
        this.f108250c = charSequence;
    }

    public void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.cky);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b_w);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    public C41654d(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: b */
    public static C41654d m132586b(Context context, String str) {
        C41654d dVar = new C41654d(context, 3);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str);
        dVar.mo102302a();
        return dVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.f108253f) / 1000);
            } catch (JSONException unused) {
            }
            C6893q.m21447a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }
}
