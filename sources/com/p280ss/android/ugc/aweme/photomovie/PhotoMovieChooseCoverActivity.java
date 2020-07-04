package com.p280ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.ActivityCompat;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34866a;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34870b;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34888d;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule.C34881a;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity */
public class PhotoMovieChooseCoverActivity extends AmeActivity {

    /* renamed from: a */
    public PhotoMoviePlayerModule f90809a;

    /* renamed from: b */
    private Handler f90810b;

    /* renamed from: c */
    private TextureView f90811c;

    /* renamed from: d */
    private FrameLayout f90812d;

    /* renamed from: e */
    private FrameLayout f90813e;

    /* renamed from: f */
    private PhotoMovieCoverModule f90814f;

    /* renamed from: g */
    private C34870b f90815g;

    public void onBackPressed() {
        ActivityCompat.m2243b(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.s, R.anim.t);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f90810b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    private void m112297a() {
        this.f90809a = new PhotoMoviePlayerModule(this, this.f90812d, (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context"));
        this.f90809a.mo88469b();
        this.f90815g = new C34888d(this.f90809a, new C34866a() {
            /* renamed from: a */
            public final boolean mo88313a() {
                return true;
            }
        });
        PhotoMovieCoverModule photoMovieCoverModule = new PhotoMovieCoverModule(this, this, this.f90813e, this.f90809a, this.f90815g, new C34881a() {
            /* renamed from: b */
            public final void mo88315b() {
                PhotoMovieChooseCoverActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo88314a() {
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", PhotoMovieChooseCoverActivity.this.f90809a.mo88460a());
                PhotoMovieChooseCoverActivity.this.setResult(-1, intent);
                PhotoMovieChooseCoverActivity.this.finish();
            }
        });
        this.f90814f = photoMovieCoverModule;
        this.f90815g.mo88397a(this.f90814f);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityCompat.m2246d(this);
        setContentView((int) R.layout.aks);
        this.f90811c = (TextureView) findViewById(R.id.cbd);
        this.f90812d = (FrameLayout) findViewById(R.id.bk9);
        this.f90813e = (FrameLayout) findViewById(R.id.bgs);
        this.f90810b = new Handler();
        m112297a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m112298a(Activity activity, PhotoMovieContext photoMovieContext, int i) {
        Intent intent = new Intent(activity, PhotoMovieChooseCoverActivity.class);
        intent.putExtra("photo_movie_context", photoMovieContext);
        activity.startActivityForResult(intent, 4);
        activity.overridePendingTransition(R.anim.s, R.anim.t);
    }
}
