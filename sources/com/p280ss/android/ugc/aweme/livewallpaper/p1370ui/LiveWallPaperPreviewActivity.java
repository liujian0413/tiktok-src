package com.p280ss.android.ugc.aweme.livewallpaper.p1370ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ListAdapter;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.livewallpaper.C32549a;
import com.p280ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c.C32575a;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36350as;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36350as.C36351a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity */
public class LiveWallPaperPreviewActivity extends AmeSSActivity implements Callback {

    /* renamed from: a */
    public LiveWallPaperBean f85026a;

    /* renamed from: b */
    private C32549a f85027b;
    SurfaceView mPreviewSurface;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C32571c.m105458a().mo83855a("paper_set");
    }

    public void setLiveWallPaper() {
        if (!C32577e.m105494a((Activity) this, this.f85026a.getId())) {
            C32571c.m105458a().mo83856a("paper_set", new C32575a() {
                /* renamed from: a */
                public final void mo83852a(boolean z, String str) {
                    if (z) {
                        C10761a.m31383a(LiveWallPaperPreviewActivity.this.getApplicationContext(), (int) R.string.dmg).mo25750a();
                        C32577e.m105486a(0, "");
                        LiveWallPaperPreviewActivity.this.finish();
                    } else {
                        C32577e.m105486a(1, str);
                    }
                    C32577e.m105491a(LiveWallPaperPreviewActivity.this.f85026a.getId(), "paper_set", z);
                }
            });
            this.f85026a.setSource("paper_set");
            C32571c.m105458a().mo83854a(this.f85026a);
            C32571c.m105458a().mo83853a((Activity) this);
            C32577e.m105490a(this.f85026a.getId());
        }
    }

    public void onClickMore() {
        C25712a aVar = new C25712a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C36351a(getResources().getString(R.string.anl), false));
        arrayList.add(new C36351a(getResources().getString(R.string.w_), false));
        final C36350as asVar = new C36350as(this, arrayList);
        aVar.mo66613a((ListAdapter) asVar, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (LiveWallPaperPreviewActivity.this.getResources().getString(R.string.anl).equals(asVar.mo92458a(i))) {
                    new C10741a(LiveWallPaperPreviewActivity.this).mo25660b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.anv)).mo25654a(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.afn), (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C32571c.m105458a().mo83859b(LiveWallPaperPreviewActivity.this.f85026a.getId());
                            LiveWallPaperPreviewActivity.this.finish();
                        }
                    }).mo25661b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.w_), (OnClickListener) null).mo25656a().mo25637a();
                }
            }
        });
        try {
            aVar.mo66615b();
        } catch (NotFoundException e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    public void exit(View view) {
        finish();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f85027b.mo83819a(surfaceHolder);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f85027b.mo83821a(surfaceHolder, this.f85026a.getVideoPath(), this.f85026a.getWidth(), this.f85026a.getHeight(), true);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f85026a = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        if (this.f85026a == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView((int) R.layout.cv);
        C25713b.m84475a(findViewById(R.id.dal));
        this.mPreviewSurface.getHolder().addCallback(this);
        this.f85027b = new C32549a(null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && C32577e.m105495a((Context) this, getPackageName())) {
            C10761a.m31383a(getApplicationContext(), (int) R.string.dmg).mo25750a();
            C32577e.m105491a(this.f85026a.getId(), "paper_set", true);
            C32577e.m105486a(0, "");
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f85027b.mo83820a(surfaceHolder, i, i2, i3);
    }
}
