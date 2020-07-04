package com.p280ss.android.ugc.aweme.photo.edit;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.medialib.image.C19743b.C19746b;
import com.p280ss.android.medialib.image.ImageRenderView.C19741a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.PhotoView;
import com.p280ss.android.ugc.aweme.photo.edit.p1452a.C34745a;
import com.p280ss.android.ugc.aweme.photo.edit.p1453b.C34750a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity */
public class PhotoEditActivity extends AmeActivity implements OnClickListener, C34750a {

    /* renamed from: a */
    public C34745a f90555a;

    /* renamed from: b */
    public PhotoView f90556b;

    /* renamed from: c */
    public boolean f90557c;

    /* renamed from: d */
    private RelativeLayout f90558d;

    /* renamed from: e */
    private RelativeLayout f90559e;

    /* renamed from: f */
    private C29230az f90560f = C29197ac.m95828a("PhotoEditActivity");

    /* renamed from: g */
    private ViewGroup f90561g;

    /* renamed from: h */
    private TextView f90562h;

    /* renamed from: i */
    private ImageView f90563i;

    /* renamed from: j */
    private View f90564j;

    /* renamed from: k */
    private C41654d f90565k;

    /* renamed from: b */
    public final PhotoView mo88172b() {
        return this.f90556b;
    }

    /* renamed from: c */
    public final ViewGroup mo88173c() {
        return this.f90561g;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        this.f90563i.performClick();
    }

    /* renamed from: e */
    public final void mo88175e() {
        if (this.f90556b != null) {
            this.f90565k.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo88174d() {
        this.f90565k = C41653c.m132582a(this, getResources().getString(R.string.bsw));
    }

    /* renamed from: f */
    private void m112083f() {
        this.f90561g = (ViewGroup) findViewById(R.id.cwi);
        this.f90563i = (ImageView) findViewById(R.id.jn);
        this.f90563i.setOnClickListener(this);
        this.f90562h = (TextView) findViewById(R.id.c47);
        this.f90562h.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                PhotoEditActivity.this.f90555a.mo88182a();
            }
        });
        this.f90556b = (PhotoView) findViewById(R.id.cb8);
        this.f90564j = findViewById(R.id.ak1);
        this.f90564j.setOnClickListener(new C34749b(this));
        if (C39805en.m127445a()) {
            this.f90558d = (RelativeLayout) findViewById(R.id.a3b);
            this.f90559e = (RelativeLayout) findViewById(R.id.a3a);
            this.f90559e.setVisibility(0);
            this.f90558d.setVisibility(0);
        }
    }

    /* renamed from: g */
    private LayoutParams m112084g() {
        int i;
        int e = C39805en.m127452e(this);
        int b = C39805en.m127447b(this);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (this.f90555a.mo88191e() * 9 < this.f90555a.mo88190d() * 16 || e * 9 < b * 16) {
            layoutParams.width = b;
            layoutParams.height = (this.f90555a.mo88191e() * b) / this.f90555a.mo88190d();
            layoutParams.topMargin = (e - layoutParams.height) / 2;
            if (layoutParams.topMargin >= 0) {
                i = layoutParams.topMargin;
            } else {
                i = 0;
            }
            layoutParams.topMargin = i;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (this.f90555a.mo88190d() * e) / this.f90555a.mo88191e();
            layoutParams.height = e;
            layoutParams.leftMargin = (b - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        return layoutParams;
    }

    /* renamed from: h */
    private void m112085h() {
        final LayoutParams layoutParams;
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
        this.f90555a = new C34745a(this);
        this.f90555a.f90575c = this.f90560f;
        this.f90555a.mo88183a(getIntent());
        if (C39805en.m127445a()) {
            layoutParams = C39804em.m127432a((Context) this, this.f90555a.mo88190d(), this.f90555a.mo88191e());
        } else {
            layoutParams = m112084g();
        }
        this.f90556b.post(new Runnable() {
            public final void run() {
                PhotoEditActivity.this.f90556b.setLayoutParams(layoutParams);
                if (C39805en.m127445a()) {
                    PhotoEditActivity.this.mo88167a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo88167a() {
        if (C39805en.m127445a()) {
            switch (C39804em.f103457a) {
                case 1:
                    m112081b(true);
                    m112082c(true);
                    return;
                case 2:
                    m112081b(false);
                    m112082c(true);
                    return;
                case 3:
                    m112081b(true);
                    m112082c(false);
                    return;
                case 4:
                    m112081b(true);
                    m112082c(true);
                    return;
                case 5:
                    m112081b(false);
                    m112082c(true);
                    return;
                case 6:
                    m112081b(true);
                    m112082c(false);
                    return;
                case 7:
                    m112081b(false);
                    m112082c(false);
                    return;
                default:
                    m112081b(false);
                    m112082c(false);
                    return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88169a(ViewGroup.LayoutParams layoutParams) {
        this.f90556b.setLayoutParams(layoutParams);
        mo88167a();
    }

    /* renamed from: c */
    private void m112082c(boolean z) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cp);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f90559e.getLayoutParams();
        if (!z) {
            dimensionPixelSize = 0;
        }
        layoutParams.bottomMargin = dimensionPixelSize;
        this.f90559e.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private void m112081b(boolean z) {
        int i;
        int c = C39805en.m127450c(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f90558d.getLayoutParams();
        if (z) {
            i = c;
        } else {
            i = 0;
        }
        layoutParams.topMargin = i;
        this.f90558d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.dke);
        LayoutParams layoutParams2 = (LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.topMargin = (int) (((float) c) + C9738o.m28708b((Context) this, 28.0f));
        relativeLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.a4q);
        LayoutParams layoutParams3 = (LayoutParams) linearLayout.getLayoutParams();
        if (!z) {
            c = 0;
        }
        layoutParams3.topMargin = c;
        linearLayout.setLayoutParams(layoutParams3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo88166a(Integer num) {
        this.f90556b.post(new C34751c(this, C39804em.m127432a((Context) this, this.f90555a.mo88190d(), this.f90555a.mo88191e())));
        return null;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.jn) {
            C6907h.m21521a((Context) this, "back_to_shoot", "mid_page", "0", "0", new C6909j().mo16966a("is_photo", "1").mo16967a());
            if (this.f90555a.mo88189c()) {
                new C10741a(this).mo25657b((int) R.string.apw).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.apv, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PhotoEditActivity.this, C35563c.f93240c.mo83137d());
                        intent.setFlags(335544320);
                        PhotoEditActivity.this.startActivity(intent);
                        PhotoEditActivity.this.finish();
                    }
                }).mo25656a().mo25637a();
            } else {
                C35563c.f93227I.mo87989a(this, this.f90555a.f90574b);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", true);
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.dp);
        if (C39805en.m127445a()) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            C39805en.m127444a((Activity) this);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        m112083f();
        m112085h();
        if (C39805en.m127445a()) {
            new C38576cg(this).mo96555a(new C34744a(this));
        }
        String str2 = "enter_video_edit_page";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90555a.f90574b.creationId).mo59973a("shoot_way", this.f90555a.f90574b.mShootWay).mo59970a("draft_id", this.f90555a.f90574b.draftId).mo59973a("filter_list", this.f90555a.f90574b.mFilterName).mo59970a("filter_id_list", this.f90555a.f90574b.mFilterId).mo59973a("content_type", "photo");
        String str3 = "content_source";
        if (this.f90555a.f90574b.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("video_cnt", 0).mo59970a("pic_cnt", 1).mo59970a("is_multi_content", 0).f60753a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88168a(View view) {
        this.f90555a.mo88188b();
        C6907h.m21524a("click_modify_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", this.f90555a.f90574b.creationId).mo59973a("shoot_way", this.f90555a.f90574b.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("content_type", "photo").mo59973a("content_source", "upload").mo59973a("enter_from", "video_edit_page").mo59973a("scene_id", "1004").f60753a);
    }

    /* renamed from: a */
    public final void mo88171a(boolean z) {
        this.f90564j.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo88170a(String str, C19741a aVar) {
        this.f90556b.mo52490a(str, CompressFormat.PNG, aVar);
    }

    /* renamed from: a */
    public static void m112080a(Context context, PhotoContext photoContext) {
        Intent intent = new Intent();
        intent.setClass(context, PhotoEditActivity.class);
        intent.putExtra("photo_model", photoContext);
        context.startActivity(intent);
    }

    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        this.f90557c = false;
        this.f90556b.mo52432c();
        PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
        int intExtra = intent.getIntExtra("set_filter_result", 0);
        if (photoContext != null) {
            this.f90555a.mo88187a(photoContext, intExtra);
        }
        ActivityCompat.m2246d(this);
        this.f90556b.setDrawFrameCallback(new C19746b() {
            /* renamed from: a */
            public final void mo52515a() {
                PhotoEditActivity.this.f90556b.post(new Runnable() {
                    public final void run() {
                        if (!PhotoEditActivity.this.f90557c) {
                            PhotoEditActivity.this.f90557c = true;
                            ActivityCompat.m2247e(PhotoEditActivity.this);
                            PhotoEditActivity.this.f90556b.setDrawFrameCallback(null);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m112079a(Activity activity, PhotoContext photoContext, int i) {
        Intent intent = new Intent(activity, PhotoEditActivity.class);
        intent.putExtra("photo_model", photoContext);
        activity.startActivityForResult(intent, 1002);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && VERSION.SDK_INT < 21) {
            PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
            int intExtra = intent.getIntExtra("set_filter_result", 0);
            if (photoContext != null) {
                this.f90555a.mo88187a(photoContext, intExtra);
            }
        }
        if (i == 1 && i2 == -1) {
            this.f90555a.mo88186a((PhotoContext) intent.getSerializableExtra("photo_model"));
            setResult(-1);
        }
    }
}
