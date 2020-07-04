package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.login.C21364f;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a.C22164a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22172c;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.base.p1056b.C23275a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginView */
public class ThirdPartyLoginView extends LinearLayout {

    /* renamed from: a */
    public ViewGroup f58531a;

    /* renamed from: b */
    public View f58532b;

    /* renamed from: c */
    private LinearLayout f58533c;

    /* renamed from: d */
    private C22172c f58534d;

    /* renamed from: e */
    private String f58535e;

    /* renamed from: f */
    private String f58536f;

    /* renamed from: g */
    private Bundle f58537g;

    public void setNeedHidePlatform(String str) {
    }

    public void setBundle(Bundle bundle) {
        this.f58537g = bundle;
    }

    public void setEventType(String str) {
        this.f58535e = str;
    }

    public void setPosition(String str) {
        this.f58536f = str;
    }

    public ThirdPartyLoginView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ String mo58267a(C23275a aVar) {
        if (!aVar.mo60565b()) {
            return null;
        }
        m73025a(getContext(), (String) aVar.mo60564a(), this.f58537g, this.f58536f, this.f58535e);
        return null;
    }

    public ThirdPartyLoginView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyLoginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b4n, this);
        this.f58531a = (ViewGroup) findViewById(R.id.dir);
        this.f58533c = (LinearLayout) findViewById(R.id.b3c);
        this.f58532b = findViewById(R.id.bzu);
        this.f58534d = new C22172c(null, C22164a.m73600a((C23278c) new C21881r(this), (Boolean) null), null);
        int b = (int) C9738o.m28708b(getContext(), 44.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
        for (C22162a aVar : this.f58534d.f59227c) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(this.f58533c.getContext());
            LayoutParams layoutParams = new LayoutParams(b, b);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(b2);
            } else {
                layoutParams.setMargins(0, 0, b2, 0);
            }
            appCompatImageView.setLayoutParams(layoutParams);
            appCompatImageView.setScaleType(ScaleType.FIT_CENTER);
            appCompatImageView.setImageResource(aVar.f59214a);
            appCompatImageView.setOnClickListener(aVar.f59215b);
            this.f58533c.addView(appCompatImageView);
        }
        this.f58532b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                LayoutTransition layoutTransition = ((ViewGroup) ThirdPartyLoginView.this.f58531a.getParent()).getLayoutTransition();
                layoutTransition.enableTransitionType(4);
                layoutTransition.setDuration(4, 400);
                layoutTransition.enableTransitionType(3);
                layoutTransition.setDuration(3, 200);
                ThirdPartyLoginView.this.f58532b.setVisibility(8);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ThirdPartyLoginView.this.f58531a.getLayoutParams();
                layoutParams.gravity = 8388611;
                layoutParams.leftMargin = 0;
                layoutParams.width = C9738o.m28691a(ThirdPartyLoginView.this.getContext()) - C23486n.m77122a(80.0d);
                ThirdPartyLoginView.this.f58531a.setLayoutParams(layoutParams);
            }
        });
        this.f58531a.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (ThirdPartyLoginView.this.f58532b.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m73025a(Context context, String str, Bundle bundle, String str2, String str3) {
        if (!C21882s.m73049a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            return;
        }
        C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", str2).mo56946a("enter_from", str3).mo56946a("platform", str).mo56946a("enter_type", "click_login").mo56946a("group_id", C21220e.m71415a(bundle)).mo56946a("log_pb", C21220e.m71418b(bundle)).f56672a);
        if (str != null) {
            new C21221f().mo57145a(str2).mo57146b(str).mo57141b();
            Intent intent = new Intent(context, AuthorizeActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("platform", str);
            intent.putExtra("enter_from", str3);
            intent.putExtra("enter_method", str2);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 1001);
            }
            C21364f.m71592a(str, str3, str2);
        }
    }
}
