package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22559a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity */
public final class TeenagerModeAppealActivity extends AmeBaseActivity {

    /* renamed from: a */
    public static final C22607a f60188a = new C22607a(null);

    /* renamed from: b */
    private int f60189b = -1;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$a */
    public static final class C22607a {
        private C22607a() {
        }

        public /* synthetic */ C22607a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$b */
    static final class C22608b implements OnClickListener {

        /* renamed from: a */
        public static final C22608b f60190a = new C22608b();

        C22608b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22603f.m74720a("teen_mode", "appeal");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$c */
    static final class C22609c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeenagerModeAppealActivity f60191a;

        C22609c(TeenagerModeAppealActivity teenagerModeAppealActivity) {
            this.f60191a = teenagerModeAppealActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f60191a.finish();
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ey;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    public final void onBackPressed() {
        if (this.f60189b != 1) {
            super.onBackPressed();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: c */
    private final void m74751c() {
        boolean z;
        View findViewById = findViewById(R.id.bvw);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.logout_appeal_button)");
        ((TextView) findViewById).setOnClickListener(C22608b.f60190a);
        View findViewById2 = findViewById(R.id.dgv);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.teenager_logout_whiteclose)");
        ImageView imageView = (ImageView) findViewById2;
        imageView.setOnClickListener(new C22609c(this));
        if (this.f60189b != 1) {
            z = true;
        } else {
            z = false;
        }
        C23487o.m77146a(z, imageView);
        View findViewById3 = findViewById(R.id.gz);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.appeal_title)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.gy);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.appeal_content)");
        TextView textView2 = (TextView) findViewById4;
        if (this.f60189b == 1) {
            textView.setText(R.string.j_);
            textView2.setText(R.string.j8);
        } else if (this.f60189b == 2) {
            textView.setText(R.string.c6z);
            textView2.setText(R.string.e6b);
        }
        LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            double b = (double) C9738o.m28709b((Context) this);
            Double.isNaN(b);
            layoutParams2.topMargin = (int) (b * 0.3d);
            textView.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C22559a aVar) {
        C7573i.m23587b(aVar, "event");
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f60189b = getIntent().getIntExtra("type", -1);
        m74751c();
    }
}
