package com.p280ss.android.ugc.aweme.p1685ug.praise;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.AbsPraiseGuideDialog */
public abstract class AbsPraiseGuideDialog extends AppCompatDialog {

    /* renamed from: a */
    public static final C42723a f111021a = new C42723a(null);

    /* renamed from: b */
    private final C42736c f111022b;

    /* renamed from: c */
    private final String f111023c;

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.AbsPraiseGuideDialog$a */
    public static final class C42723a {
        private C42723a() {
        }

        public /* synthetic */ C42723a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.AbsPraiseGuideDialog$b */
    static final class C42724b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsPraiseGuideDialog f111024a;

        C42724b(AbsPraiseGuideDialog absPraiseGuideDialog) {
            this.f111024a = absPraiseGuideDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111024a.mo104329e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.AbsPraiseGuideDialog$c */
    static final class C42725c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsPraiseGuideDialog f111025a;

        C42725c(AbsPraiseGuideDialog absPraiseGuideDialog) {
            this.f111025a = absPraiseGuideDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111025a.mo104330f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.AbsPraiseGuideDialog$d */
    static final class C42726d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsPraiseGuideDialog f111026a;

        C42726d(AbsPraiseGuideDialog absPraiseGuideDialog) {
            this.f111026a = absPraiseGuideDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111026a.mo104331g();
        }
    }

    /* renamed from: a */
    public abstract String mo104326a();

    /* renamed from: c */
    public abstract void mo104327c();

    /* renamed from: d */
    public abstract void mo104328d();

    /* renamed from: f */
    public final void mo104330f() {
        m135622a("rating_cancel");
        dismiss();
    }

    /* renamed from: e */
    public final void mo104329e() {
        m135622a("rating_feedback");
        this.f111022b.mo104344a(true);
        mo104327c();
        dismiss();
    }

    /* renamed from: g */
    public final void mo104331g() {
        m135622a("rating_submit");
        this.f111022b.mo104346b(true);
        mo104328d();
        dismiss();
    }

    /* renamed from: h */
    private final void m135623h() {
        setContentView((int) R.layout.kb);
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(R.id.dwh);
        Button button2 = (Button) findViewById(R.id.dum);
        TextView textView = (TextView) findViewById(R.id.dhk);
        TextView textView2 = (TextView) findViewById(R.id.a8a);
        TextView textView3 = (TextView) findViewById(R.id.ajw);
        if (textView3 != null) {
            textView3.setText(mo104326a());
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            AppStoreMessage appStoreScore = a.getAppStoreScore();
            C7573i.m23582a((Object) appStoreScore, "message");
            if (!TextUtils.isEmpty(appStoreScore.getTitle()) && textView != null) {
                textView.setText(appStoreScore.getTitle());
            }
            if (!TextUtils.isEmpty(appStoreScore.getText()) && textView2 != null) {
                textView2.setText(appStoreScore.getText());
            }
        } catch (NullValueException unused) {
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new C42724b(this));
        }
        if (button != null) {
            button.setOnClickListener(new C42725c(this));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C42726d(this));
        }
    }

    /* renamed from: a */
    private final void m135622a(String str) {
        C6907h.m21524a(str, (Map) new C22984d().mo59973a("rating_window_type", this.f111023c).f60753a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m135623h();
        m135622a("rating_show");
        this.f111022b.mo104342a(System.currentTimeMillis());
        this.f111022b.mo104343a(String.valueOf(C6399b.m19933i()));
    }

    public AbsPraiseGuideDialog(Context context, boolean z) {
        String str;
        C7573i.m23587b(context, "context");
        super(context);
        this.f111022b = new C42736c(z);
        if (z) {
            str = "like";
        } else {
            str = "activation";
        }
        this.f111023c = str;
    }
}
