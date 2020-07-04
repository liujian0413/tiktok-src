package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.widget.Space;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.base.widget.p1067a.C23506a;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity */
public class OnlineMusicFragmentActivity extends AmeSSActivity {

    /* renamed from: a */
    public TextView f62895a;

    /* renamed from: b */
    public TextView f62896b;

    /* renamed from: c */
    Space f62897c;

    /* renamed from: d */
    public boolean f62898d;

    /* renamed from: e */
    private ViewPagerBottomSheetBehavior f62899e;

    /* renamed from: f */
    private int f62900f;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m78053d() {
        C33784d.m108927a((Activity) this, 10086, this.f62900f);
        C23888c.m78195b();
    }

    public void finish() {
        super.finish();
        KeyboardUtils.m77057c(this.f62895a);
        overridePendingTransition(0, R.anim.ah);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_homepage");
    }

    /* renamed from: c */
    private static boolean m78052c() {
        boolean z;
        boolean z2 = false;
        try {
            z = C30199h.m98861a().getEnableLocalMusicEntrance().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C33703a.m108720d() != 0) {
            z2 = true;
        }
        return z2;
    }

    public void onBackPressed() {
        if (this.f62899e != null) {
            this.f62899e.mo60683b(5);
            return;
        }
        mo61873a();
        super.onBackPressed();
    }

    /* renamed from: b */
    private void m78051b() {
        int i;
        this.f62896b = (TextView) findViewById(R.id.dxd);
        TextView textView = this.f62896b;
        if (m78052c()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f62896b.setOnClickListener(C23506a.m77197a(new C23829c(this)));
    }

    /* renamed from: a */
    public final void mo61873a() {
        if (this.f62898d) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61874a(View view) {
        KeyboardUtils.m77057c(this.f62895a);
        m78053d();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.fb);
        this.f62895a = (TextView) findViewById(R.id.e3f);
        this.f62895a.setText(getIntent().getStringExtra("title"));
        findViewById(R.id.dqq).setOnClickListener(C23506a.m77197a(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m77057c(OnlineMusicFragmentActivity.this.f62895a);
                OnlineMusicFragmentActivity.this.mo61873a();
                OnlineMusicFragmentActivity.this.finish();
            }
        }));
        findViewById(R.id.dqq).setVisibility(8);
        m78051b();
        this.f62897c = (Space) findViewById(R.id.d8v);
        this.f62897c.setMinimumHeight(C23482j.m77101d());
        this.f62899e = ViewPagerBottomSheetBehavior.m76628a(findViewById(R.id.a7r));
        this.f62899e.f61460k = new C23369a() {
            /* renamed from: a */
            public final void mo60691a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo60692a(View view, int i) {
                if (i == 5) {
                    OnlineMusicFragmentActivity.this.mo61873a();
                    OnlineMusicFragmentActivity.this.finish();
                }
            }
        };
        this.f62899e.f61453d = true;
        this.f62899e.mo60679a(C23482j.m77095a(this) + C23482j.m77104e(this));
        this.f62899e.f61454e = true;
        C0608j supportFragmentManager = getSupportFragmentManager();
        if (((OnlineMusicFragment) supportFragmentManager.mo2642a((int) R.id.aoy)) == null) {
            this.f62900f = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            String stringExtra = getIntent().getStringExtra("challenge");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            String stringExtra2 = getIntent().getStringExtra("creation_id");
            String stringExtra3 = getIntent().getStringExtra("shoot_way");
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) OnlineMusicFragment.m78537a(this.f62900f, stringExtra, musicModel, Style.BtnConfirm, booleanExtra, getIntent().getBundleExtra("arguments"), getIntent().getStringExtra("enter_from"), stringExtra3, stringExtra2)).mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
