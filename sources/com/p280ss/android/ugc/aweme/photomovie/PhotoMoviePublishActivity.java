package com.p280ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41539as;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity */
public class PhotoMoviePublishActivity extends AmeActivity {

    /* renamed from: a */
    public PhotoMovieContext f90867a;

    /* renamed from: b */
    TextView f90868b;

    /* renamed from: c */
    TextView f90869c;

    /* renamed from: d */
    TextView f90870d;

    /* renamed from: e */
    private PhotoMoviePublishFragment f90871e;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo88354b() {
        return ((PhotoMoviePublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy)).f90888k;
    }

    public void finish() {
        super.finish();
        if (C41539as.m132299a() < 3) {
            C41539as.m132300a(0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: d */
    private PhotoMovieContext m112337d() {
        return ((PhotoMoviePublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy)).mo88369b();
    }

    /* renamed from: c */
    public final void mo88355c() {
        PhotoMovieContext d = m112337d();
        Intent intent = new Intent();
        intent.putExtra("photo_movie_context", d);
        setResult(-1, intent);
    }

    public void onBackPressed() {
        if (this.f90867a == null || this.f90867a.mIsFromDraft) {
            super.onBackPressed();
            return;
        }
        mo88355c();
        finish();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", true);
        super.onResume();
        if (this.f90871e != null && this.f90871e.mo88372c()) {
            this.f90870d.setText(R.string.czp);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo88352a() {
        new C10741a(this).mo25657b((int) R.string.dau).mo25650a((int) R.string.bbe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                PhotoMoviePublishActivity.this.finish();
            }
        }).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25656a().mo25637a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88353a(ArrayList<AVMusic> arrayList) {
        PhotoMovieEditActivity.m112309a(this, m112337d(), arrayList, "edit_draft");
    }

    /* renamed from: a */
    public static void m112336a(PhotoMovieContext photoMovieContext) {
        String str = "enter_video_edit_page";
        int i = 0;
        C22984d a = C22984d.m75611a().mo59973a("creation_id", photoMovieContext.creationId).mo59973a("shoot_way", photoMovieContext.mShootWay).mo59970a("draft_id", photoMovieContext.draftId).mo59973a("filter_list", photoMovieContext.mFilterName).mo59970a("filter_id_list", photoMovieContext.mFilterId).mo59973a("content_type", "slideshow").mo59973a("content_source", "upload").mo59970a("video_cnt", 0).mo59970a("pic_cnt", photoMovieContext.mRealImageCount);
        String str2 = "is_multi_content";
        if (photoMovieContext.mRealImageCount > 1) {
            i = 1;
        }
        C6907h.m21524a(str, (Map) a.mo59970a(str2, i).f60753a);
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dt);
        this.f90868b = (TextView) findViewById(R.id.jn);
        this.f90869c = (TextView) findViewById(R.id.sp);
        this.f90870d = (TextView) findViewById(R.id.title);
        this.f90867a = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
        final ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("photo_movie_context_music_list");
        if (!this.f90867a.mIsFromDraft) {
            this.f90868b.setText(null);
            this.f90868b.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C6907h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    PhotoMoviePublishActivity.m112336a(PhotoMoviePublishActivity.this.f90867a);
                    PhotoMoviePublishActivity.this.mo88355c();
                    PhotoMoviePublishActivity.this.finish();
                }
            });
        } else {
            this.f90868b.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C6907h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    PhotoMoviePublishActivity.this.mo88353a(arrayList);
                    PhotoMoviePublishActivity.m112336a(PhotoMoviePublishActivity.this.f90867a);
                    PhotoMoviePublishActivity.this.finish();
                }
            });
            this.f90869c.setVisibility(0);
            this.f90869c.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C35574k.m114859a().mo70110y().mo83122g()) {
                        Intent intent = new Intent();
                        intent.setFlags(536870912);
                        C22488a.m74376a().mo59046a((Activity) PhotoMoviePublishActivity.this, intent);
                    } else if (PhotoMoviePublishActivity.this.mo88354b()) {
                        PhotoMoviePublishActivity.this.mo88352a();
                    } else {
                        PhotoMoviePublishActivity.this.finish();
                    }
                }
            });
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f90871e = (PhotoMoviePublishFragment) supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f90871e == null) {
            this.f90871e = PhotoMoviePublishFragment.m112342a(this.f90867a);
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f90871e).mo2604c();
        }
        String str = "enter_video_post_page";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90867a.creationId).mo59973a("shoot_way", this.f90867a.mShootWay).mo59970a("draft_id", this.f90867a.draftId).mo59973a("filter_list", this.f90867a.mFilterName).mo59970a("filter_id_list", this.f90867a.mFilterId).mo59973a("content_type", "slideshow").mo59973a("content_source", "upload").mo59970a("video_cnt", 0).mo59970a("pic_cnt", this.f90867a.mRealImageCount);
        String str2 = "is_multi_content";
        if (this.f90867a.mRealImageCount > 1) {
            i = 1;
        } else {
            i = 0;
        }
        C6907h.m21524a(str, (Map) a.mo59970a(str2, i).f60753a);
        if (C39805en.m127445a()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).statusBarDarkFont(C6399b.m19946v()).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true).statusBarDarkFont(C6399b.m19946v()).init();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: a */
    public static void m112334a(Activity activity, PhotoMovieContext photoMovieContext, int i) {
        Intent intent = new Intent();
        intent.setClass(activity, PhotoMoviePublishActivity.class);
        intent.putExtra("photo_movie_context", photoMovieContext);
        activity.startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f90871e != null && this.f90871e.isAdded()) {
            this.f90871e.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static void m112335a(Context context, PhotoMovieContext photoMovieContext, List<AVMusic> list) {
        if (photoMovieContext != null) {
            Intent intent = new Intent();
            intent.setClass(context, PhotoMoviePublishActivity.class);
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("photo_movie_context_music_list", (Serializable) list);
            intent.putExtra("photo_movie_context", photoMovieContext);
            context.startActivity(intent);
        }
    }
}
