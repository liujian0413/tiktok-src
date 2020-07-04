package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity */
public class VideoPreviewActivity extends AmeActivity {

    /* renamed from: d */
    private static int f107159d = 250;

    /* renamed from: a */
    public MediaPlayer f107160a;

    /* renamed from: b */
    public String f107161b;

    /* renamed from: c */
    ScreenSizeAspectFrameLayout f107162c;

    /* renamed from: e */
    private ZoomInfo f107163e;

    /* renamed from: f */
    private int f107164f;

    /* renamed from: g */
    private int f107165g;

    /* renamed from: h */
    private long f107166h;

    /* renamed from: i */
    private Timer f107167i;

    /* renamed from: j */
    private TextureView f107168j;

    /* renamed from: k */
    private View f107169k;

    /* renamed from: l */
    private float f107170l;

    public void onBackPressed() {
        m131415h();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo101739b() {
        if (this.f107160a != null) {
            if (this.f107160a.isPlaying()) {
                this.f107160a.stop();
            }
            this.f107160a.release();
            this.f107160a = null;
        }
    }

    /* renamed from: c */
    public final void mo101740c() {
        if (this.f107160a != null && this.f107160a.isPlaying()) {
            this.f107160a.pause();
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        mo101739b();
        if (this.f107167i != null) {
            this.f107167i.cancel();
            this.f107167i = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f107160a != null && this.f107160a.isPlaying()) {
            this.f107160a.pause();
        }
    }

    /* renamed from: d */
    private void m131411d() {
        m131413f();
        this.f107162c = (ScreenSizeAspectFrameLayout) findViewById(R.id.ap_);
        this.f107162c.setOnClickListener(new C41258am(this));
        this.f107169k = findViewById(16908290);
    }

    /* renamed from: e */
    private void m131412e() {
        this.f107161b = getIntent().getStringExtra("file_path");
        this.f107163e = (ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f107170l = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.f107167i = new Timer("video_preview_player_timer");
    }

    /* renamed from: g */
    private void m131414g() {
        ZoomAnimationUtils.m136230a(this.f107163e, (View) this.f107168j, (AnimatorListener) null);
        ZoomAnimationUtils.m136229a(this.f107169k, new ColorDrawable(getResources().getColor(17170444)), 0, NormalGiftView.ALPHA_255);
    }

    /* renamed from: h */
    private void m131415h() {
        ZoomAnimationUtils.m136229a(this.f107169k, new ColorDrawable(getResources().getColor(17170444)), NormalGiftView.ALPHA_255, 0);
        ZoomAnimationUtils.m136231b(this.f107163e, this.f107168j, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                VideoPreviewActivity.this.mo101740c();
            }
        });
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f107160a != null && !this.f107160a.isPlaying()) {
            this.f107160a.start();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", false);
    }

    /* renamed from: f */
    private void m131413f() {
        int[] a = FFMpegManager.m64569a().mo51828a(this.f107161b);
        if (a[0] == 0) {
            this.f107166h = (long) a[1];
            this.f107164f = a[2];
            this.f107165g = a[3];
            FFMpegManager.m64569a().mo51829b();
        } else {
            C9738o.m28693a((Context) this, (int) R.string.csd);
            FFMpegManager.m64569a().mo51829b();
            finish();
        }
        this.f107168j = (TextureView) findViewById(R.id.ddp);
        this.f107168j.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                VideoPreviewActivity.this.mo101739b();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Uri parse = Uri.parse(VideoPreviewActivity.this.f107161b);
                VideoPreviewActivity.this.f107160a = MediaPlayer.create(VideoPreviewActivity.this, parse);
                if (VideoPreviewActivity.this.f107160a == null) {
                    C9738o.m28693a((Context) VideoPreviewActivity.this, (int) R.string.cus);
                    VideoPreviewActivity.this.finish();
                    return;
                }
                VideoPreviewActivity.this.mo101737a();
                VideoPreviewActivity.this.f107160a.setAudioStreamType(3);
                VideoPreviewActivity.this.f107160a.setSurface(new Surface(surfaceTexture));
                VideoPreviewActivity.this.f107160a.start();
                VideoPreviewActivity.this.f107160a.setOnCompletionListener(new OnCompletionListener() {
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                    }
                });
                VideoPreviewActivity.this.f107160a.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (VideoPreviewActivity.this.f107160a != null) {
                            VideoPreviewActivity.this.f107160a.release();
                            VideoPreviewActivity.this.f107160a = null;
                        }
                        return false;
                    }
                });
            }
        });
        if (C39805en.m127445a()) {
            C39804em.m127430a((View) this.f107168j, (Context) this, this.f107164f, this.f107165g);
            return;
        }
        if (!(this.f107165g == 0 || this.f107164f == 0)) {
            C39804em.m127434a((View) this.f107168j, this.f107164f, this.f107165g);
        }
    }

    /* renamed from: a */
    public final void mo101737a() {
        if (((long) this.f107160a.getDuration()) - this.f107166h > ((long) f107159d)) {
            this.f107160a.setLooping(false);
            this.f107167i.schedule(new TimerTask() {
                public final void run() {
                    if (VideoPreviewActivity.this.f107160a != null) {
                        try {
                            VideoPreviewActivity.this.f107160a.seekTo(0);
                        } catch (IllegalStateException e) {
                            C42880h.m136156a(e.toString());
                        }
                    }
                }
            }, this.f107166h, this.f107166h);
            return;
        }
        this.f107160a.setLooping(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101738a(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e2);
        m131412e();
        m131411d();
        m131414g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m131410a(Activity activity, View view, String str, float f) {
        if (activity != null) {
            Intent intent = new Intent(activity, VideoPreviewActivity.class);
            intent.putExtra("extra_zoom_info", ZoomAnimationUtils.m136228a(view));
            intent.putExtra("file_path", str);
            intent.putExtra("wh_ratio", f);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }
}
