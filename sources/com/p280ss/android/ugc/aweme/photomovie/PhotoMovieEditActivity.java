package com.p280ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34870b;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34888d;
import com.p280ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule;
import com.p280ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule.C34878a;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.p280ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule;
import com.p280ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule.C34906a;
import com.p280ss.android.ugc.aweme.photomovie.edit.p1455a.C34867a;
import com.p280ss.android.ugc.aweme.photomovie.edit.p1455a.C34869b;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39677l;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39677l.C39680a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41387m;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.gamora.editor.p1742a.C44000a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity */
public class PhotoMovieEditActivity extends AmeActivity implements OnClickListener, C34906a, C41387m {

    /* renamed from: a */
    public AVMusic f90834a;

    /* renamed from: b */
    protected boolean f90835b;

    /* renamed from: c */
    public PhotoMoviePlayerModule f90836c;

    /* renamed from: d */
    public PhotoMovieCoverModule f90837d;

    /* renamed from: e */
    public C34869b f90838e;

    /* renamed from: f */
    public C39677l f90839f;

    /* renamed from: g */
    private TextView f90840g;

    /* renamed from: h */
    private TextView f90841h;

    /* renamed from: i */
    private FrameLayout f90842i;

    /* renamed from: j */
    private FrameLayout f90843j;

    /* renamed from: k */
    private FrameLayout f90844k;

    /* renamed from: l */
    private TextView f90845l;

    /* renamed from: m */
    private C34870b f90846m;

    /* renamed from: n */
    private PhotoMovieChangeModule f90847n;

    /* renamed from: o */
    private PhotoMovieMusicModule f90848o;

    /* renamed from: p */
    private PhotoMovieContext f90849p;

    /* renamed from: b */
    public final boolean mo88338b() {
        return this.f90835b;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        m112311a(false);
        super.finish();
    }

    public void onDestroy() {
        m112311a(false);
        super.onDestroy();
    }

    /* renamed from: d */
    private void m112314d() {
        this.f90836c.mo88465a((C34860g) new C34861a() {
            /* renamed from: a */
            public final void mo74767a() {
                super.mo74767a();
                if (PhotoMovieEditActivity.this.f90839f != null) {
                    PhotoMovieEditActivity.this.f90839f.f103172f = false;
                }
            }

            /* renamed from: d */
            public final void mo74768d() {
                super.mo74768d();
                if (PhotoMovieEditActivity.this.f90839f != null) {
                    PhotoMovieEditActivity.this.f90839f.f103172f = true;
                }
            }
        });
    }

    public void onBackPressed() {
        findViewById(R.id.azg).performClick();
    }

    /* renamed from: a */
    public static JSONObject m112308a() {
        return new C6909j().mo16966a("is_photo", "0").mo16966a("position", "mid_page").mo16966a("media_type", "pic_movie").mo16967a();
    }

    /* renamed from: c */
    private void m112313c() {
        this.f90839f = new C39677l(this.f90843j, this, this, this.f90838e.mo88396c());
        this.f90839f.mo98957a(1);
        this.f90839f.f103168b = new C39680a() {
            /* renamed from: a */
            public final void mo88184a(C29296g gVar) {
                PhotoMovieEditActivity.this.f90838e.mo88392a(gVar);
                PhotoMovieEditActivity.this.f90836c.mo88464a(gVar);
                C6907h.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("slide").setJsonObject(PhotoMovieEditActivity.m112308a()));
            }

            /* renamed from: a */
            public final void mo88185a(C29296g gVar, C29296g gVar2, float f) {
                PhotoMovieEditActivity.this.f90836c.mo88468a(gVar.f77273h, gVar2.f77273h, f);
            }
        };
        this.f90838e.mo88393a(this.f90839f);
    }

    /* renamed from: f */
    private void m112316f() {
        if (C44000a.m139267a(this)) {
            if (C43057di.m136601a(this)) {
                findViewById(R.id.dy3).setBackground(getResources().getDrawable(R.drawable.f124294do));
            } else {
                findViewById(R.id.dy3).setBackground(getResources().getDrawable(R.drawable.dn));
            }
        }
        findViewById(R.id.dy3).setOnClickListener(this);
    }

    /* renamed from: e */
    private PhotoMovieContext m112315e() {
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
        if (photoMovieContext == null) {
            C10761a.m31403c((Context) this, getString(R.string.b1n)).mo25750a();
            finish();
        }
        if (photoMovieContext.mImageList != null && photoMovieContext.mImageList.size() <= 2) {
            photoMovieContext.mImageList.add(photoMovieContext.mImageList.get(0));
        }
        photoMovieContext.mMusicList = (List) getIntent().getSerializableExtra("photo_movie_context_music_list");
        if (!photoMovieContext.mIsFromDraft && photoMovieContext.mMusic == null && photoMovieContext.mMusicList.size() > 0) {
            photoMovieContext.mMusic = (AVMusic) photoMovieContext.mMusicList.get(0);
        }
        return photoMovieContext;
    }

    /* renamed from: a */
    private void m112311a(boolean z) {
        this.f90835b = z;
    }

    /* renamed from: a */
    public final void mo88333a(Bitmap bitmap) {
        if (this.f90837d != null) {
            this.f90837d.mo88411a(bitmap);
        }
    }

    /* renamed from: b */
    private void m112312b(PhotoMovieContext photoMovieContext) {
        int i;
        if (photoMovieContext.mMusic == null) {
            i = R.drawable.acz;
        } else {
            i = R.drawable.aq0;
        }
        this.f90841h.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
    }

    /* renamed from: a */
    public final void mo88332a(int i) {
        if (i == 0) {
            if (!C6399b.m19946v()) {
                this.f90845l.setText(getString(R.string.cu0));
            }
            this.f90845l.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.aq1), null, null);
            return;
        }
        if (!C6399b.m19946v()) {
            this.f90845l.setText(getString(R.string.cu1));
        }
        this.f90845l.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.aq2), null, null);
    }

    /* renamed from: a */
    private void m112310a(PhotoMovieContext photoMovieContext) {
        this.f90842i = (FrameLayout) findViewById(R.id.bhu);
        this.f90843j = (FrameLayout) findViewById(R.id.bh2);
        this.f90844k = (FrameLayout) findViewById(R.id.bgs);
        this.f90840g = (TextView) findViewById(R.id.dy1);
        this.f90845l = (TextView) findViewById(R.id.dy0);
        this.f90841h = (TextView) findViewById(R.id.dy2);
        this.f90840g.setOnClickListener(new C34863c(this, photoMovieContext));
        m112316f();
        this.f90841h.setOnClickListener(new C34864d(this, photoMovieContext));
        findViewById(R.id.azg).setOnClickListener(this);
        findViewById(R.id.dhy).setOnClickListener(this);
        if (photoMovieContext.mIsFromDraft) {
            findViewById(R.id.dhy).setVisibility(0);
        }
        findViewById(R.id.azg).setOnClickListener(this);
        this.f90845l.setOnClickListener(new C34865e(this));
        mo88332a(photoMovieContext.mPlayType);
        m112312b(photoMovieContext);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.dy3) {
            C35563c.f93245h.mo83207b();
            C6907h.onEvent(MobClick.obtain().setEventName("next").setLabelName("mid_page").setJsonObject(C6869c.m21381a().mo16887a("media_type", "pic_movie").mo16888b()));
            PhotoMovieContext a = this.f90836c.mo88460a();
            a.setVideoLength((int) this.f90836c.mo88471d());
            a.mFilterId = this.f90838e.mo88396c().f77266a;
            a.mFilterName = this.f90838e.mo88396c().f77268c;
            C42311e.m134571a(C34843a.m112376a(a), C34843a.m112377b(a), Scene.EDIT, Scene.PUBLISH);
            C22488a.m74376a().mo59049a((Activity) this, a, 1);
            return;
        }
        if (id == R.id.azg || id == R.id.dhy) {
            if (this.f90836c.mo88460a().mFrom == 1 || this.f90836c.mo88460a().mFrom == 2) {
                Dialog a2 = new C10741a(this).mo25657b((int) R.string.ea3).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PhotoMovieEditActivity.this.finish();
                        C39360dw.m125725a().mo97928a(PhotoMovieEditActivity.this.f90834a);
                    }
                }).mo25656a().mo25637a();
                if (!C39805en.m127445a() && !C22911a.m75401a(this)) {
                    C23487o.m77138a(a2);
                }
                a2.show();
                return;
            }
            C35563c.f93227I.mo87989a(this, this.f90836c.mo88460a());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 1;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.akt);
        m112311a(true);
        if (!C39805en.m127445a() && !C22911a.m75401a(this)) {
            C23487o.m77136a((Activity) this);
        }
        this.f90849p = m112315e();
        m112310a(this.f90849p);
        this.f90836c = new PhotoMoviePlayerModule(this, this.f90843j, this.f90849p);
        this.f90838e = new C34867a(this, this.f90836c, findViewById(R.id.cbb), this.f90844k);
        this.f90838e.mo88394a(m112308a());
        this.f90846m = new C34888d(this.f90836c, this.f90838e);
        m112313c();
        m112314d();
        String str = "enter_video_edit_page";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90849p.creationId).mo59973a("shoot_way", this.f90849p.mShootWay).mo59970a("draft_id", this.f90849p.draftId).mo59973a("content_type", "slideshow").mo59973a("content_source", "upload").mo59973a("filter_list", this.f90838e.mo88396c().f77268c).mo59970a("filter_id_list", this.f90838e.mo88396c().f77266a).mo59970a("video_cnt", 0).mo59970a("pic_cnt", this.f90849p.mRealImageCount);
        String str2 = "is_multi_content";
        if (this.f90849p.mRealImageCount <= 1) {
            i = 0;
        }
        C6907h.m21524a(str, (Map) a.mo59970a(str2, i).f60753a);
        this.f90834a = C39360dw.m125725a().mo97931b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88334a(View view) {
        if (this.f90847n == null) {
            PhotoMovieChangeModule photoMovieChangeModule = new PhotoMovieChangeModule(this, this, this.f90844k, this.f90836c, this.f90846m);
            this.f90847n = photoMovieChangeModule;
            this.f90847n.f90947h = new C34878a() {
                /* renamed from: a */
                public final void mo88342a(int i, int i2) {
                    PhotoMovieEditActivity.this.mo88332a(i);
                }
            };
        }
        this.f90846m.mo88397a(this.f90847n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88337b(PhotoMovieContext photoMovieContext, View view) {
        C6907h.m21524a("click_modify_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", photoMovieContext.creationId).mo59973a("shoot_way", photoMovieContext.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("content_source", "upload").mo59973a("content_type", "slideshow").mo59973a("scene_id", "1004").f60753a);
        if (!this.f90846m.mo88398a()) {
            this.f90838e.mo88395b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88335a(PhotoMovieContext photoMovieContext, View view) {
        if (this.f90848o == null) {
            PhotoMovieMusicModule photoMovieMusicModule = new PhotoMovieMusicModule(this, this.f90844k, this.f90836c, this.f90846m, this, photoMovieContext.mShootWay, photoMovieContext.creationId);
            this.f90848o = photoMovieMusicModule;
        }
        this.f90846m.mo88397a(this.f90848o);
    }

    /* renamed from: a */
    public final void mo88336a(String str, AVMusic aVMusic, String str2) {
        this.f90849p.musicOrigin = str;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) intent.getParcelableExtra("photo_movie_context");
            if (photoMovieContext != null) {
                this.f90836c.mo88460a().title = photoMovieContext.title;
                this.f90836c.mo88460a().structList = photoMovieContext.structList;
                this.f90836c.mo88460a().isPrivate = photoMovieContext.isPrivate;
                this.f90836c.mo88460a().challenges = photoMovieContext.challenges;
                this.f90836c.mo88460a().poiId = photoMovieContext.poiId;
                this.f90836c.mo88460a().mFinalVideoTmpPath = photoMovieContext.mFinalVideoTmpPath;
                this.f90836c.mo88460a().mCoverStartTm = photoMovieContext.mCoverStartTm;
            }
        }
    }

    /* renamed from: a */
    public static void m112309a(Context context, PhotoMovieContext photoMovieContext, List<AVMusic> list, String str) {
        Intent intent = new Intent(context, PhotoMovieEditActivity.class);
        photoMovieContext.mShootWay = str;
        intent.putExtra("photo_movie_context", photoMovieContext);
        intent.putExtra("photo_movie_context_music_list", (Serializable) list);
        context.startActivity(intent);
    }
}
