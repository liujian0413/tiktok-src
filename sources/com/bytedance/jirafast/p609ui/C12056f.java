package com.bytedance.jirafast.p609ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.jirafast.ui.f */
public final class C12056f extends Dialog {

    /* renamed from: a */
    public Button f32094a;

    /* renamed from: b */
    public Button f32095b;

    /* renamed from: c */
    public Button f32096c;

    /* renamed from: d */
    public Button f32097d;

    /* renamed from: e */
    public Button f32098e;

    /* renamed from: f */
    public C12058a f32099f;

    /* renamed from: g */
    private OnClickListener f32100g = new OnClickListener() {
        public final void onClick(View view) {
            int i;
            if (view == C12056f.this.f32094a) {
                i = 1;
            } else if (view == C12056f.this.f32095b) {
                i = 2;
            } else if (view == C12056f.this.f32096c) {
                i = 3;
            } else if (view == C12056f.this.f32097d) {
                i = 4;
            } else if (view == C12056f.this.f32098e) {
                i = 5;
            } else {
                i = 0;
            }
            if (C12056f.this.f32099f != null && (view instanceof Button)) {
                C12056f.this.f32099f.mo29677a(((Button) view).getText().toString(), i);
            }
            C12056f.this.dismiss();
        }
    };

    /* renamed from: com.bytedance.jirafast.ui.f$a */
    public interface C12058a {
        /* renamed from: a */
        void mo29677a(String str, int i);
    }

    public C12056f(Context context) {
        super(context, R.style.vx);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a45);
        Window window = getWindow();
        window.setLayout(-1, -2);
        window.setGravity(80);
        window.setWindowAnimations(R.style.vy);
        this.f32094a = (Button) findViewById(R.id.ber);
        this.f32094a.setOnClickListener(this.f32100g);
        this.f32095b = (Button) findViewById(R.id.bes);
        this.f32095b.setOnClickListener(this.f32100g);
        this.f32096c = (Button) findViewById(R.id.bet);
        this.f32096c.setOnClickListener(this.f32100g);
        this.f32097d = (Button) findViewById(R.id.beu);
        this.f32097d.setOnClickListener(this.f32100g);
        this.f32098e = (Button) findViewById(R.id.beu);
        this.f32097d.setOnClickListener(this.f32100g);
        this.f32098e = (Button) findViewById(R.id.bew);
        this.f32098e.setOnClickListener(this.f32100g);
    }
}
