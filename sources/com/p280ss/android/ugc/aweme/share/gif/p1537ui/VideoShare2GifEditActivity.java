package com.p280ss.android.ugc.aweme.share.gif.p1537ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.ugc.aweme.share.gif.C38044a;
import com.p280ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a.C38757a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity */
public class VideoShare2GifEditActivity extends AmeActivity {

    /* renamed from: a */
    public boolean f99084a = true;

    /* renamed from: b */
    public VideoShare2GifEditContext f99085b;

    /* renamed from: c */
    private C17457s<IVideo2GifService> f99086c = new C17457s<IVideo2GifService>() {

        /* renamed from: a */
        IVideo2GifService f99087a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public IVideo2GifService mo44946a() {
            if (this.f99087a == null) {
                this.f99087a = ((IAVService) ServiceManager.get().getService(IAVService.class)).video2GifService();
            }
            return this.f99087a;
        }
    };

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m121447d() {
        findViewById(R.id.c44).setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                VideoShare2GifEditActivity.this.mo95698a();
            }
        });
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    /* renamed from: c */
    private void m121446c() {
        this.f99085b = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        if (this.f99085b == null || !C7276d.m22812b(this.f99085b.f99031a)) {
            finish();
        }
    }

    /* renamed from: b */
    private void m121445b() {
        if (getSupportFragmentManager().mo2642a((int) R.id.am3) == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.am3, ((IVideo2GifService) this.f99086c.mo44946a()).getGifCutVideoFragment(this.f99085b)).mo2604c();
        }
    }

    /* renamed from: a */
    public final void mo95698a() {
        if (this.f99084a && this.f99085b != null && !TextUtils.isEmpty(this.f99085b.f99031a)) {
            this.f99084a = false;
            this.f99085b.f99036f = C38044a.m121417b();
            this.f99085b.f99035e = C38044a.m121412a(this.f99085b.f99032b);
            final C41654d b = C41654d.m132586b(this, getResources().getString(R.string.bas));
            b.setIndeterminate(false);
            ((IVideo2GifService) this.f99086c.mo44946a()).convert2Gif(this.f99085b, new ConvertListener() {
                public final void onStart() {
                }

                public final void onUpdateProgress(int i) {
                    b.setProgress(i);
                }

                public final void onDone(boolean z) {
                    VideoShare2GifEditActivity.this.f99084a = true;
                    b.dismiss();
                    if (z) {
                        C38044a.m121415a(new File(VideoShare2GifEditActivity.this.f99085b.f99035e), VideoShare2GifEditActivity.this);
                        VideoShare2GifPreviewActivity.m121454a((Activity) VideoShare2GifEditActivity.this, VideoShare2GifEditActivity.this.f99085b, 1);
                        return;
                    }
                    VideoShare2GifEditActivity.this.f99085b.f99035e = null;
                    C10761a.m31396b((Context) VideoShare2GifEditActivity.this, VideoShare2GifEditActivity.this.getString(R.string.bat), 1).mo25750a();
                }

                public final void onConfigured(C38757a aVar) {
                    C6907h.m21525a("gif_generate", new C6909j().mo16966a("height", String.valueOf(aVar.f100723b)).mo16966a("width", String.valueOf(aVar.f100722a)).mo16966a("gif_length_in_video", String.valueOf(aVar.f100725d - aVar.f100724c)).mo16966a("gif_offset", String.valueOf(aVar.f100724c)).mo16966a("group_id", VideoShare2GifEditActivity.this.f99085b.f99032b).mo16966a("author_id", VideoShare2GifEditActivity.this.f99085b.f99046p).mo16966a("speed", String.valueOf(aVar.f100726e)).mo16967a());
                }
            });
        }
    }

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.jn) {
            C6907h.m21524a("gif_quit_editing", (Map) new HashMap());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.fg);
        ButterKnife.bind((Activity) this);
        m121446c();
        m121447d();
        m121445b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m121444a(Context context, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intent intent = new Intent(context, VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.f99032b = str;
        videoShare2GifEditContext.f99048r = str5;
        videoShare2GifEditContext.f99047q = str4;
        videoShare2GifEditContext.f99046p = str2;
        videoShare2GifEditContext.f99031a = str3;
        videoShare2GifEditContext.f99033c = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        context.startActivity(intent);
    }
}
