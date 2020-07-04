package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.SafeHandler;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.PhotoView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.transition.C41124a;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity */
public class EffectPhotoSetFilterActivity extends AmeActivity implements OnClickListener, OnTouchListener, C34817l {

    /* renamed from: a */
    public C34816k f90697a;

    /* renamed from: b */
    public int f90698b;

    /* renamed from: c */
    private boolean f90699c;

    /* renamed from: d */
    private C29230az f90700d;

    /* renamed from: e */
    private PhotoView f90701e;

    /* renamed from: f */
    private PhotoContext f90702f;

    /* renamed from: g */
    private ImageView f90703g;

    /* renamed from: h */
    private Handler f90704h;

    /* renamed from: i */
    private boolean f90705i;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: g */
    private C0053p<Map<EffectCategoryResponse, List<C29296g>>> m112201g() {
        return new C34809d(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88248a() {
        this.f90697a.setFilterIndex(this.f90698b);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f90697a.mo88256a();
    }

    /* renamed from: e */
    private void m112199e() {
        String b = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90702f.mFilterIndex).mo74978b();
        if (this.f90705i) {
            this.f90701e.mo52489a(b, 0.0f);
        } else {
            this.f90701e.mo52493b(b, 0.0f);
        }
    }

    /* renamed from: f */
    private void m112200f() {
        String b = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90702f.mFilterIndex).mo74978b();
        if (this.f90705i) {
            this.f90701e.mo52489a(b, this.f90702f.mFilterRate);
        } else {
            this.f90701e.mo52493b(b, this.f90702f.mFilterRate);
        }
    }

    /* renamed from: h */
    private JSONObject m112202h() {
        String str = "upload";
        if (this.f90702f.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new C6909j().mo16966a("is_photo", "1").mo16966a("shoot_way", str).mo16966a("position", "mid_page").mo16967a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88251b() {
        getWindow().getSharedElementEnterTransition().addListener(new C41124a() {
            public final void onTransitionEnd(Transition transition) {
                EffectPhotoSetFilterActivity.this.f90697a.setFilterIndex(EffectPhotoSetFilterActivity.this.f90698b);
            }
        });
    }

    /* renamed from: d */
    private void m112198d() {
        String str;
        C29296g a = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90702f.mFilterIndex);
        EffectCategoryResponse b = C35563c.m114837d().mo74825b(a);
        if (b == null) {
            str = "";
        } else {
            str = b.name;
        }
        C42962b.f111525a.mo104671a("select_filter", C22984d.m75611a().mo59973a("creation_id", this.f90702f.creationId).mo59973a("shoot_way", this.f90702f.mShootWay).mo59970a("draft_id", this.f90702f.draftId).mo59973a("enter_method", "click").mo59973a("enter_from", "video_shoot_page").mo59973a("filter_name", a.f77268c).mo59970a("filter_id", a.f77266a).mo59973a("tab_name", str).f60753a);
    }

    /* renamed from: c */
    private void m112197c() {
        this.f90701e = (PhotoView) findViewById(R.id.cb8);
        if (C39805en.m127445a()) {
            LayoutParams layoutParams = (LayoutParams) this.f90701e.getLayoutParams();
            layoutParams.topMargin = C39805en.m127450c(this);
            this.f90701e.setLayoutParams(layoutParams);
        }
        this.f90701e.mo88157a(this, this.f90702f);
        String b = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90698b).mo74978b();
        if (this.f90705i) {
            this.f90701e.mo52489a(b, this.f90702f.mFilterRate);
        } else {
            this.f90701e.mo52493b(b, this.f90702f.mFilterRate);
        }
        this.f90697a = (C34816k) findViewById(R.id.akd);
        this.f90697a.setPhotoContext(this.f90702f);
        this.f90697a.setOnFilterChangeListener(this);
        this.f90697a.setData(C35563c.m114837d().mo74830d());
        this.f90697a.setFilterIntensityStore(this.f90700d);
        C34816k kVar = this.f90697a;
        PhotoView photoView = this.f90701e;
        photoView.getClass();
        kVar.setFilterInternalDefaultIntensityGetter(C34806a.m112287a(photoView));
        C35563c.m114837d().mo74824b().observe(this, m112201g());
        this.f90703g = (ImageView) findViewById(R.id.ak5);
        this.f90703g.setOnClickListener(this);
        this.f90703g.setOnTouchListener(this);
        if (VERSION.SDK_INT >= 21) {
            Slide slide = new Slide();
            slide.setDuration(300);
            getWindow().setEnterTransition(slide);
            getWindow().setReturnTransition(slide);
            this.f90704h.post(new C34807b(this));
            return;
        }
        this.f90704h.post(new C34808c(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88250a(Map map) {
        this.f90697a.setData(map);
    }

    /* renamed from: a */
    private static void m112195a(View view) {
        if (view != null) {
            ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f}).start();
        }
    }

    /* renamed from: b */
    private static void m112196b(View view) {
        if (view != null) {
            ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).start();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", true);
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        this.f90705i = C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust);
        if (this.f90705i) {
            i = R.layout.ds;
        } else {
            i = R.layout.dr;
        }
        setContentView(i);
        if (C39805en.m127445a()) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            C39805en.m127444a((Activity) this);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        this.f90704h = new SafeHandler(this);
        this.f90702f = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        this.f90699c = getIntent().getBooleanExtra("is_first_open_filter", true);
        if (this.f90699c) {
            i2 = 0;
        } else {
            i2 = this.f90702f.mFilterIndex;
        }
        this.f90698b = i2;
        this.f90700d = C29197ac.m95828a("PhotoEditActivity");
        m112197c();
        m112198d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", false);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m112195a(view);
            m112199e();
        } else if (motionEvent.getAction() == 1) {
            m112196b(view);
            m112200f();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88249a(PhotoContext photoContext, int i) {
        this.f90702f = photoContext;
        int i2 = this.f90698b;
        if (i != 0) {
            i2 = photoContext.mFilterIndex;
        }
        String b = C35563c.f93224F.mo70097l().mo74949b().mo74962a(i2).mo74978b();
        if (this.f90705i) {
            this.f90701e.mo52489a(b, photoContext.mFilterRate);
        } else {
            this.f90701e.mo52493b(b, photoContext.mFilterRate);
        }
        if (i == 1 || i == 0) {
            if (i == 1) {
                C6907h.onEvent(new MobClick().setLabelName("mid_page").setEventName("filter_confirm").setJsonObject(m112202h()));
            }
            Intent intent = new Intent();
            intent.putExtra("photo_model", photoContext);
            intent.putExtra("set_filter_result", i);
            setResult(-1, intent);
            if (VERSION.SDK_INT >= 21) {
                finishAfterTransition();
            } else {
                finish();
            }
        } else if (i == 2) {
            C6907h.m21521a((Context) this, "filter_strength", "mid_page", String.valueOf((int) (photoContext.mFilterRate * 100.0f)), "0", m112202h());
        } else if (i == 5) {
            JSONObject h = m112202h();
            try {
                h.put("filter_name", C35563c.f93224F.mo70097l().mo74949b().mo74965b(this.f90702f.mFilterIndex));
            } catch (JSONException unused) {
            }
            C6907h.m21521a((Context) this, "filter_click", "mid_page", "0", "0", h);
            m112198d();
        }
    }

    /* renamed from: a */
    public static void m112194a(Activity activity, PhotoContext photoContext, boolean z, View view, int i) {
        Intent intent = new Intent();
        intent.setClass(activity, EffectPhotoSetFilterActivity.class);
        intent.putExtra("photo_model", photoContext);
        intent.putExtra("is_first_open_filter", z);
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName("photo");
            Slide slide = new Slide();
            slide.setDuration(300);
            activity.getWindow().setExitTransition(slide);
            activity.getWindow().setReenterTransition(slide);
            activity.startActivityForResult(intent, 1, ActivityOptions.makeSceneTransitionAnimation(activity, view, "photo").toBundle());
            return;
        }
        activity.startActivityForResult(intent, 1);
    }
}
