package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33033s;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.model.MusicCategory;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33867a;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33868b;
import com.p280ss.android.ugc.aweme.music.presenter.C33803e;
import com.p280ss.android.ugc.aweme.music.presenter.C33826r;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListActivity */
public class MusicListActivity extends AmeSSActivity implements C33803e, C33868b {

    /* renamed from: a */
    String f88353a;

    /* renamed from: b */
    String f88354b;

    /* renamed from: c */
    public C33826r f88355c;

    /* renamed from: d */
    boolean f88356d = true;

    /* renamed from: e */
    public MusicListFragment f88357e;

    /* renamed from: f */
    private int f88358f;

    /* renamed from: g */
    private Challenge f88359g;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final void mo86420a() {
        this.f88356d = false;
    }

    /* renamed from: b */
    public final void mo86508b() {
        finish();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_category");
    }

    public void finish() {
        C42961az.m136381b(new C33768c(null));
        ((C33033s) ServiceManager.get().getService(C33033s.class)).mo60030a(this);
        super.finish();
    }

    /* renamed from: d */
    private void m109161d() {
        if (!"860".equals(this.f88353a) || C30538p.m99745a()) {
            this.mTitleBar.getEndText().setVisibility(8);
        } else {
            this.mTitleBar.getEndText().setVisibility(0);
        }
    }

    /* renamed from: c */
    private void m109160c() {
        this.mTitleBar.setTitle((CharSequence) this.f88354b);
        this.mTitleBar.setColorMode(0);
        ImageView imageView = (ImageView) this.mTitleBar.findViewById(R.id.jo);
        if (C6394b.m19906b()) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cmn));
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                MusicListActivity.this.mo86508b();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                SmartRouter.buildRoute((Context) MusicListActivity.this, "//webview").withParam("hide_status_bar", true).withParam("hide_more", true).withParam(bundle).withParam("url", "https://aweme.snssdk.com/magic/runtime/?id=845").open();
                C6907h.onEvent(MobClick.obtain().setEventName("upload_music").setLabelName("song_category").setValue(MusicListActivity.this.f88353a));
            }
        });
        this.mTitleBar.setColorMode(0);
        this.mTitleBar.mo25878b(false);
        this.f88355c = new C33826r(this);
        this.f88357e = (MusicListFragment) getSupportFragmentManager().mo2642a((int) R.id.a24);
        if (this.f88357e == null) {
            this.f88357e = MusicListFragment.m109170a(this.f88358f, Style.BtnConfirmAndShoot);
            C0633q a = getSupportFragmentManager().mo2645a();
            a.mo2586a(R.id.a24, this.f88357e, "album_list_tag");
            a.mo2606d();
        }
        this.f88357e.f88368i = this;
        if (!TextUtils.isEmpty(this.f88353a)) {
            this.f88355c.mo86433a(this.f88353a, 0, 30);
            this.f88357e.f88370k = true;
            this.f88357e.f88372m = new C33867a() {
                /* renamed from: a */
                public final void mo62095a() {
                    if (MusicListActivity.this.f88355c.f88210c) {
                        if (MusicListActivity.this.f88357e.f88366g != null) {
                            MusicListActivity.this.f88357e.f88366g.ag_();
                        }
                        MusicListActivity.this.f88355c.mo86432a(MusicListActivity.this.f88353a);
                    }
                }
            };
            this.f88357e.f88364e = new MusicCategory(this.f88354b, this.f88353a);
        }
        m109161d();
    }

    /* renamed from: a */
    public final void mo86421a(MusicList musicList) {
        if (musicList != null) {
            if (this.f88357e.f88366g != null) {
                if (this.f88355c.f88210c) {
                    this.f88357e.f88366g.ai_();
                } else {
                    this.f88357e.f88366g.ah_();
                }
            }
            if (musicList.items != null) {
                this.f88357e.mo86512a(musicList.items, 3);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.df);
        this.f88353a = getIntent().getStringExtra("mc_id");
        this.f88354b = getIntent().getStringExtra("title_name");
        this.f88358f = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        if (this.f88353a == null) {
            this.f88353a = "860";
        }
        if (this.f88354b == null) {
            this.f88354b = getString(R.string.cre);
        }
        this.f88359g = (Challenge) getIntent().getSerializableExtra("challenge");
        m109160c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo62086a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicListFragment.mo86519n() == 0 || musicListFragment.mo86519n() == 2) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
        intent.putExtra("shoot_way", "song_category");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
    }
}
