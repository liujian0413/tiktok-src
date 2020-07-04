package com.p280ss.android.ugc.aweme.account.ftc.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity */
public final class DeleteVideoAlertActivity extends AmeActivity implements OnClickListener {

    /* renamed from: b */
    public static final C21178a f56952b = new C21178a(null);

    /* renamed from: a */
    public String f56953a;

    /* renamed from: c */
    private HashMap f56954c;

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity$a */
    public static final class C21178a {
        private C21178a() {
        }

        public /* synthetic */ C21178a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity$b */
    static final class C21179b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteVideoAlertActivity f56955a;

        C21179b(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f56955a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6907h.m21524a("export_video_no_confirm", (Map) C21102b.m71165a().mo56946a("enter_method", "pop_up").mo56944a("type", TextUtils.equals(this.f56955a.f56953a, "from_create_account_password") ? 1 : 0).f56672a);
            Intent intent = new Intent(this.f56955a, OperatorCompleteActivity.class);
            intent.putExtra("age_gate_response", this.f56955a.getIntent().getSerializableExtra("age_gate_response"));
            this.f56955a.startActivity(intent);
            C22345t.m73977h(false);
            this.f56955a.finish();
        }
    }

    /* renamed from: a */
    private View m71350a(int i) {
        if (this.f56954c == null) {
            this.f56954c = new HashMap();
        }
        View view = (View) this.f56954c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f56954c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b_);
        OnClickListener onClickListener = this;
        ((LinearLayout) m71350a(R.id.ei2)).setOnClickListener(onClickListener);
        ((LinearLayout) m71350a(R.id.c4g)).setOnClickListener(onClickListener);
        C22345t.m73977h(true);
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("enter_from");
        } else {
            str = null;
        }
        this.f56953a = str;
        if (TextUtils.equals(this.f56953a, "from_create_account_password")) {
            ((TextView) findViewById(R.id.a7a)).setText(R.string.ao6);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity", "onCreate", false);
    }

    public final void onClick(View view) {
        Integer num;
        int i;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ei2) {
            C6907h.m21524a("export_video_yes", (Map) C21102b.m71165a().mo56946a("enter_method", "pop_up").mo56944a("type", TextUtils.equals(this.f56953a, "from_create_account_password") ? 1 : 0).f56672a);
            Intent intent = new Intent(this, ExportVideoActivity.class);
            intent.putExtra("age_gate_response", getIntent().getSerializableExtra("age_gate_response"));
            startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
            return;
        }
        if (num != null && num.intValue() == R.id.c4g) {
            C6907h.m21524a("export_video_no", (Map) C21102b.m71165a().mo56946a("enter_method", "pop_up").mo56944a("type", TextUtils.equals(this.f56953a, "from_create_account_password") ? 1 : 0).f56672a);
            C10741a a = new C10741a(this).mo25649a((int) R.string.b_x);
            if (TextUtils.equals(this.f56953a, "from_create_account_password")) {
                i = R.string.afw;
            } else {
                i = R.string.b_y;
            }
            a.mo25657b(i).mo25658b((int) R.string.ve, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.vj, (DialogInterface.OnClickListener) new C21179b(this)).mo25656a().mo25637a();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1024 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
