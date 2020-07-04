package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a */
public final class C39221a extends AlertDialog {

    /* renamed from: a */
    public C39222a f101666a;

    /* renamed from: b */
    private boolean f101667b;

    /* renamed from: c */
    private CharSequence f101668c;

    /* renamed from: d */
    private boolean f101669d;

    /* renamed from: e */
    private int f101670e;

    /* renamed from: f */
    private int f101671f = 100;

    /* renamed from: g */
    private TextView f101672g;

    /* renamed from: h */
    private CircularProgressView f101673h;

    /* renamed from: i */
    private ImageView f101674i;

    /* renamed from: j */
    private TextView f101675j;

    /* renamed from: k */
    private View f101676k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$a */
    public interface C39222a {
        /* renamed from: a */
        void mo97462a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$b */
    static final class C39223b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39221a f101677a;

        C39223b(C39221a aVar) {
            this.f101677a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39222a aVar = this.f101677a.f101666a;
            if (aVar != null) {
                aVar.mo97462a();
            }
        }
    }

    public final void dismiss() {
        CircularProgressView circularProgressView = this.f101673h;
        if (circularProgressView == null) {
            C7573i.m23583a("mLodingProgressView");
        }
        circularProgressView.mo61115b();
        super.dismiss();
    }

    /* renamed from: a */
    private final void m125222a() {
        View findViewById = findViewById(R.id.cwi);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root)");
        this.f101676k = findViewById;
        View findViewById2 = findViewById(R.id.by6);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.message)");
        this.f101672g = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.b_w);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.iv_loading)");
        this.f101673h = (CircularProgressView) findViewById3;
        View findViewById4 = findViewById(R.id.sq);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.cancelImageView)");
        this.f101674i = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.cky);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.progress)");
        this.f101675j = (TextView) findViewById5;
        ImageView imageView = this.f101674i;
        if (imageView == null) {
            C7573i.m23583a("mCancelView");
        }
        imageView.setOnClickListener(new C39223b(this));
    }

    /* renamed from: a */
    public final void mo97550a(C39222a aVar) {
        C7573i.m23587b(aVar, "onCancelViewListener");
        this.f101666a = aVar;
    }

    public C39221a(Context context) {
        C7573i.m23587b(context, "context");
        super(context, 3);
    }

    /* renamed from: b */
    private final void m125224b(int i) {
        if (this.f101667b) {
            CircularProgressView circularProgressView = this.f101673h;
            if (circularProgressView == null) {
                C7573i.m23583a("mLodingProgressView");
            }
            circularProgressView.setMaxProgress((float) i);
        }
        this.f101671f = i;
    }

    /* renamed from: a */
    private void m125223a(boolean z) {
        int i;
        if (this.f101667b) {
            CircularProgressView circularProgressView = this.f101673h;
            if (circularProgressView == null) {
                C7573i.m23583a("mLodingProgressView");
            }
            circularProgressView.setIndeterminate(z);
            TextView textView = this.f101675j;
            if (textView == null) {
                C7573i.m23583a("mProgressTextView");
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f101669d = z;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ab7);
        m125222a();
        this.f101667b = true;
        setMessage(this.f101668c);
        m125223a(this.f101669d);
        m125224b(this.f101671f);
        mo97549a(this.f101670e);
        setCanceledOnTouchOutside(false);
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f101667b) {
            TextView textView = this.f101672g;
            if (textView == null) {
                C7573i.m23583a("mMessageView");
            }
            textView.setText(charSequence);
            TextView textView2 = this.f101672g;
            if (textView2 == null) {
                C7573i.m23583a("mMessageView");
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        this.f101668c = charSequence;
    }

    /* renamed from: a */
    public final void mo97549a(int i) {
        if (this.f101667b) {
            TextView textView = this.f101675j;
            if (textView == null) {
                C7573i.m23583a("mProgressTextView");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            textView.setText(sb.toString());
            CircularProgressView circularProgressView = this.f101673h;
            if (circularProgressView == null) {
                C7573i.m23583a("mLodingProgressView");
            }
            circularProgressView.setProgress((float) i);
        }
        this.f101670e = i;
    }
}
