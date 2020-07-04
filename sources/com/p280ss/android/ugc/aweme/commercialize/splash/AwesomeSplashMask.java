package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashMask */
public final class AwesomeSplashMask extends RelativeLayout {

    /* renamed from: a */
    public Map<String, String> f66125a = new HashMap();

    /* renamed from: b */
    public Aweme f66126b;

    /* renamed from: c */
    private int f66127c = 4;

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.jk);
        if (findViewById != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin += C23482j.m77101d();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C25352e.m83231n(AwesomeSplashMask.this.f66126b)) {
                    String openUrl = AwesomeSplashMask.this.f66126b.getAwemeRawAd().getOpenUrl();
                    if (!TextUtils.isEmpty(openUrl) && TextUtils.equals(Uri.parse(openUrl).getHost(), "challenge")) {
                        C19290j jVar = new C19290j(AwesomeSplashMask.this.f66126b.getAwemeRawAd().getOpenUrl());
                        jVar.mo51188a("extra_challenge_from", "awesome_splash");
                        AwesomeSplashMask.this.f66126b.getAwemeRawAd().setOpenUrl(jVar.mo51184a());
                    }
                    C25371n.m83435a(view.getContext(), AwesomeSplashMask.this.f66126b, AwesomeSplashMask.this.f66125a);
                }
            }
        });
        View findViewById2 = findViewById(R.id.jm);
        if (C6399b.m19944t()) {
            findViewById2.setVisibility(8);
            if (C43057di.m136601a(getContext())) {
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.jl);
                LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.removeRule(11);
                }
                layoutParams.addRule(9);
                layoutParams.leftMargin = C23486n.m77122a(10.0d);
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    HashMap hashMap = new HashMap();
                    if (C43057di.m136601a(AwesomeSplashMask.this.getContext())) {
                        hashMap.put("click_x", String.valueOf(((float) C23482j.m77098b(AwesomeSplashMask.this.getContext())) - motionEvent.getRawX()));
                    } else {
                        hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
                    }
                    hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
                    AwesomeSplashMask.this.f66125a.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
                }
                return false;
            }
        });
    }

    public AwesomeSplashMask(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f66127c == 4 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        if (this.f66127c != 2 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onEvent(C25053a aVar) {
        this.f66127c = aVar.f66130a;
        this.f66126b = aVar.f66131b;
        if (this.f66127c == 3) {
            animate().alpha(0.0f).setDuration(260).start();
            C24976t.m82139az(getContext(), this.f66126b);
        }
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
