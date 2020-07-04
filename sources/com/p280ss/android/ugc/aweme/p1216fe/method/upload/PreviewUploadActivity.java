package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity */
public final class PreviewUploadActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f73839a;

    /* renamed from: b */
    private HashMap f73840b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$a */
    static final class C28032a implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f73841a;

        C28032a(PreviewUploadActivity previewUploadActivity) {
            this.f73841a = previewUploadActivity;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            DmtTextView dmtTextView = (DmtTextView) this.f73841a.mo71482a(R.id.e8_);
            C7573i.m23582a((Object) dmtTextView, "upload_confirm");
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) this.f73841a.mo71482a(R.id.e89);
            C7573i.m23582a((Object) dmtTextView2, "upload_cancel");
            dmtTextView2.setVisibility(0);
            C7573i.m23582a((Object) mediaPlayer, "it");
            mediaPlayer.setLooping(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$b */
    static final class C28033b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f73842a;

        C28033b(PreviewUploadActivity previewUploadActivity) {
            this.f73842a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f73842a.f73839a);
            this.f73842a.setResult(-1, intent);
            this.f73842a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$c */
    static final class C28034c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f73843a;

        C28034c(PreviewUploadActivity previewUploadActivity) {
            this.f73843a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f73843a.f73839a);
            this.f73843a.setResult(0, intent);
            this.f73843a.finish();
        }
    }

    /* renamed from: a */
    public final View mo71482a(int i) {
        if (this.f73840b == null) {
            this.f73840b = new HashMap();
        }
        View view = (View) this.f73840b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f73840b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (((VideoView) mo71482a(R.id.ebx)) != null) {
            ((VideoView) mo71482a(R.id.ebx)).suspend();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (((VideoView) mo71482a(R.id.ebx)) != null) {
            VideoView videoView = (VideoView) mo71482a(R.id.ebx);
            C7573i.m23582a((Object) videoView, "video_view");
            if (!videoView.isPlaying()) {
                ((VideoView) mo71482a(R.id.ebx)).start();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    public final void onStop() {
        super.onStop();
        if (((VideoView) mo71482a(R.id.ebx)) != null) {
            VideoView videoView = (VideoView) mo71482a(R.id.ebx);
            C7573i.m23582a((Object) videoView, "video_view");
            if (videoView.isPlaying()) {
                ((VideoView) mo71482a(R.id.ebx)).pause();
            }
        }
    }

    /* renamed from: a */
    private final void m91641a() {
        this.f73839a = getIntent().getStringExtra("filePath");
        if (this.f73839a != null) {
            VideoView videoView = (VideoView) mo71482a(R.id.ebx);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.f73839a);
            videoView.setOnPreparedListener(new C28032a(this));
        }
        FrameLayout frameLayout = (FrameLayout) mo71482a(R.id.e8b);
        Window window = getWindow();
        C7573i.m23582a((Object) window, "window");
        frameLayout.setBackgroundColor(window.getNavigationBarColor());
        ((DmtTextView) mo71482a(R.id.e8_)).setOnClickListener(new C28033b(this));
        ((DmtTextView) mo71482a(R.id.e89)).setOnClickListener(new C28034c(this));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e1);
        m91641a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }
}
