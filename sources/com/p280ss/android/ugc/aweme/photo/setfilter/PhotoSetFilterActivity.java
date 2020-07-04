package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.PhotoView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity */
public class PhotoSetFilterActivity extends AmeActivity implements OnClickListener, OnTouchListener, C34817l {

    /* renamed from: a */
    public SetFilterLayout f90770a;

    /* renamed from: b */
    public int f90771b;

    /* renamed from: c */
    private boolean f90772c;

    /* renamed from: d */
    private PhotoView f90773d;

    /* renamed from: e */
    private PhotoContext f90774e;

    /* renamed from: f */
    private ImageView f90775f;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private C0053p<List<C29296g>> m112271d() {
        return new C0053p<List<C29296g>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(List<C29296g> list) {
                PhotoSetFilterActivity.this.f90770a.setData(list);
            }
        };
    }

    /* renamed from: b */
    private void m112268b() {
        this.f90773d.mo52493b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90774e.mFilterIndex).mo74978b(), 0.0f);
    }

    /* renamed from: c */
    private void m112270c() {
        this.f90773d.mo52493b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90774e.mFilterIndex).mo74978b(), this.f90774e.mFilterRate);
    }

    /* renamed from: e */
    private JSONObject m112272e() {
        String str = "upload";
        if (this.f90774e.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new C6909j().mo16966a("is_photo", "1").mo16966a("shoot_way", str).mo16966a("position", "mid_page").mo16967a();
    }

    /* renamed from: a */
    private void m112265a() {
        this.f90773d = (PhotoView) findViewById(R.id.cb8);
        this.f90773d.mo88157a(this, this.f90774e);
        this.f90773d.mo52493b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90771b).mo74978b(), this.f90774e.mFilterRate);
        this.f90770a = (SetFilterLayout) findViewById(R.id.akd);
        this.f90770a.setPhotoContext(this.f90774e);
        this.f90770a.setOnFilterChangeListener(this);
        this.f90770a.setData(C35563c.m114837d().mo74830d());
        C35563c.m114837d().mo74818a().observe(this, m112271d());
        this.f90775f = (ImageView) findViewById(R.id.ak5);
        this.f90775f.setOnClickListener(this);
        this.f90775f.setOnTouchListener(this);
        if (VERSION.SDK_INT >= 21) {
            Slide slide = new Slide();
            slide.setDuration(300);
            getWindow().setEnterTransition(slide);
            getWindow().setReturnTransition(slide);
            getWindow().getSharedElementEnterTransition().addListener(new TransitionListener() {
                public final void onTransitionCancel(Transition transition) {
                }

                public final void onTransitionPause(Transition transition) {
                }

                public final void onTransitionResume(Transition transition) {
                }

                public final void onTransitionStart(Transition transition) {
                }

                public final void onTransitionEnd(Transition transition) {
                    PhotoSetFilterActivity.this.f90770a.setFilterIndex(PhotoSetFilterActivity.this.f90771b);
                }
            });
            return;
        }
        this.f90770a.setFilterIndex(this.f90771b);
    }

    /* renamed from: a */
    private static void m112267a(View view) {
        if (view != null) {
            ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f}).start();
        }
    }

    /* renamed from: b */
    private static void m112269b(View view) {
        if (view != null) {
            ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).start();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onCreate", true);
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.dw);
        this.f90774e = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        this.f90772c = getIntent().getBooleanExtra("is_first_open_filter", true);
        if (this.f90772c) {
            i = 0;
        } else {
            i = this.f90774e.mFilterIndex;
        }
        this.f90771b = i;
        m112265a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onCreate", false);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m112267a(view);
            m112268b();
        } else if (motionEvent.getAction() == 1) {
            m112269b(view);
            m112270c();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88249a(PhotoContext photoContext, int i) {
        this.f90774e = photoContext;
        int i2 = this.f90771b;
        if (i != 0) {
            i2 = photoContext.mFilterIndex;
        }
        this.f90773d.mo52493b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(i2).mo74978b(), photoContext.mFilterRate);
        if (i == 1 || i == 0) {
            if (i == 1) {
                C6907h.onEvent(new MobClick().setLabelName("mid_page").setEventName("filter_confirm").setJsonObject(m112272e()));
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
            C6907h.m21521a((Context) this, "filter_strength", "mid_page", String.valueOf((int) (photoContext.mFilterRate * 100.0f)), "0", m112272e());
        } else if (i == 5) {
            JSONObject e = m112272e();
            try {
                e.put("filter_name", C35563c.f93224F.mo70097l().mo74949b().mo74965b(this.f90774e.mFilterIndex));
            } catch (JSONException unused) {
            }
            C6907h.m21521a((Context) this, "filter_click", "mid_page", "0", "0", e);
        }
    }

    /* renamed from: a */
    public static void m112266a(Activity activity, PhotoContext photoContext, boolean z, View view, int i) {
        Intent intent = new Intent();
        intent.setClass(activity, PhotoSetFilterActivity.class);
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
