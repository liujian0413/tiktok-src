package com.p280ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.view.C0991u;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.C34822a;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter.C34917a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34849a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity */
public class PhotoMoviePreViewActivity extends AmeActivity implements OnClickListener, C34917a {

    /* renamed from: a */
    public Handler f90854a;

    /* renamed from: b */
    public TextureView f90855b;

    /* renamed from: c */
    public ImageView f90856c;

    /* renamed from: d */
    public int f90857d;

    /* renamed from: e */
    public int f90858e;

    public void onBackPressed() {
        ActivityCompat.m2243b(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo88344a() {
        if (isViewValid()) {
            this.f90855b.bringToFront();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f90854a.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    private void m112330b() {
        if (VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            AutoTransition autoTransition2 = new AutoTransition();
            getWindow().setSharedElementReturnTransition(autoTransition2);
            autoTransition.addListener(new C34849a() {
                public final void onTransitionEnd(Transition transition) {
                    PhotoMoviePreViewActivity.this.f90855b.setAlpha(1.0f);
                }

                public final void onTransitionStart(Transition transition) {
                    PhotoMoviePreViewActivity.this.f90855b.setAlpha(0.0f);
                }
            });
            autoTransition2.addListener(new C34849a() {
                public final void onTransitionStart(Transition transition) {
                    PhotoMoviePreViewActivity.this.f90855b.setAlpha(0.0f);
                }
            });
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ActivityCompat.m2243b(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityCompat.m2246d(this);
        setContentView((int) R.layout.akr);
        m112330b();
        findViewById(R.id.jo).setOnClickListener(this);
        this.f90855b = (TextureView) findViewById(R.id.cj7);
        this.f90855b.setOnClickListener(this);
        this.f90854a = new Handler();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
        this.f90856c = (ImageView) findViewById(R.id.cj3);
        C0991u.m4192a((View) this.f90856c, "transition_img_name");
        mo88345a(720, 960);
        photoMovieContext.getPhotoMovieCover(new C34822a() {
            /* renamed from: a */
            public final void mo70305a(final Bitmap bitmap, final int i, final int i2) {
                PhotoMoviePreViewActivity.this.f90854a.post(new Runnable() {
                    public final void run() {
                        if (bitmap != null) {
                            PhotoMoviePreViewActivity.this.f90857d = i;
                            PhotoMoviePreViewActivity.this.f90858e = i2;
                            PhotoMoviePreViewActivity.this.f90856c.setImageBitmap(bitmap);
                            PhotoMoviePreViewActivity.this.mo88345a(PhotoMoviePreViewActivity.this.f90857d, PhotoMoviePreViewActivity.this.f90858e);
                            PhotoMoviePreViewActivity.this.f90856c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                                public final boolean onPreDraw() {
                                    PhotoMoviePreViewActivity.this.f90856c.getViewTreeObserver().removeOnPreDrawListener(this);
                                    ActivityCompat.m2247e(PhotoMoviePreViewActivity.this);
                                    return true;
                                }
                            });
                            return;
                        }
                        ActivityCompat.m2247e(PhotoMoviePreViewActivity.this);
                    }
                });
            }
        });
        new PhotoMoviePlayerPresenter(this, this.f90855b, photoMovieContext).f91074b = this;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo88345a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int b = C23482j.m77098b(this);
            LayoutParams layoutParams = this.f90856c.getLayoutParams();
            int i3 = (int) (((((float) b) * 1.0f) * ((float) i2)) / ((float) i));
            layoutParams.width = b;
            layoutParams.height = i3;
            this.f90856c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static void m112329a(Activity activity, ImageView imageView, PhotoMovieContext photoMovieContext) {
        Intent intent = new Intent(activity, PhotoMoviePreViewActivity.class);
        intent.putExtra("photo_movie_context", photoMovieContext);
        C0991u.m4192a((View) imageView, "transition_img_name");
        activity.startActivity(intent, C0598c.m2483a(activity, (View) imageView, "transition_img_name").mo2580a());
    }
}
