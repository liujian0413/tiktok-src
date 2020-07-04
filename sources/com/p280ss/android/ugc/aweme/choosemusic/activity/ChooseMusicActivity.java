package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.widget.Space;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.base.widget.p1067a.C23506a;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity */
public class ChooseMusicActivity extends AmeSSActivity {

    /* renamed from: a */
    public DmtTextView f62889a;

    /* renamed from: b */
    public boolean f62890b;

    /* renamed from: c */
    public ViewPagerBottomSheetBehavior f62891c;

    /* renamed from: d */
    private TextView f62892d;

    /* renamed from: e */
    private int f62893e;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo61869b() {
        finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        mo61867a();
        super.onBackPressed();
    }

    /* renamed from: e */
    private void m78042e() {
        C33784d.m108927a((Activity) this, 10086, this.f62893e);
        C23888c.m78195b();
    }

    public void finish() {
        super.finish();
        KeyboardUtils.m77057c(this.f62889a);
        overridePendingTransition(0, R.anim.t);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_homepage");
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: d */
    private static boolean m78041d() {
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
        if (C33703a.m108720d() == 0) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: c */
    private void m78040c() {
        int i;
        this.f62892d = (TextView) findViewById(R.id.e0x);
        TextView textView = this.f62892d;
        if (m78041d()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f62892d.setOnClickListener(C23506a.m77197a(new C23828b(this)));
    }

    /* renamed from: a */
    public final void mo61867a() {
        if (this.f62890b) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61868a(View view) {
        KeyboardUtils.m77057c(this.f62889a);
        m78042e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo61870b(View view) {
        mo61867a();
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.au);
        this.f62889a = (DmtTextView) findViewById(R.id.e3f);
        this.f62889a.setText(getIntent().getStringExtra("title"));
        this.f62889a.setFontType(C10834d.f29332b);
        m78040c();
        findViewById(R.id.jo).setOnClickListener(new C23827a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        if (bundleExtra != null && bundleExtra.getBoolean("has_lyric", false)) {
            findViewById(R.id.dk1).setBackgroundColor(Color.parseColor("#D8000000"));
            ((ImageView) findViewById(R.id.jo)).setImageResource(R.drawable.b1n);
            this.f62889a.setTextColor(Color.parseColor("#ffffff"));
            findViewById(R.id.aoy).setBackgroundColor(Color.parseColor("#D8000000"));
        }
        ((Space) findViewById(R.id.d8v)).setMinimumHeight(C23482j.m77101d());
        this.f62891c = ViewPagerBottomSheetBehavior.m76628a(findViewById(R.id.a7r));
        this.f62891c.f61460k = new C23369a() {
            /* renamed from: a */
            public final void mo60691a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo60692a(View view, int i) {
                if (i == 5) {
                    ChooseMusicActivity.this.mo61867a();
                    ChooseMusicActivity.this.mo61869b();
                }
            }
        };
        this.f62891c.f61453d = true;
        this.f62891c.mo60679a(C23482j.m77095a(this) + C23482j.m77104e(this));
        C0608j supportFragmentManager = getSupportFragmentManager();
        if (((ChooseMusicFragment) supportFragmentManager.mo2642a((int) R.id.aoy)) == null) {
            this.f62893e = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setMusicChooseType(this.f62893e);
            String stringExtra = getIntent().getStringExtra("challenge");
            String stringExtra2 = getIntent().getStringExtra("creation_id");
            String stringExtra3 = getIntent().getStringExtra("shoot_way");
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) ChooseMusicFragment.m78257a(this.f62893e, stringExtra, (MusicModel) getIntent().getSerializableExtra("music_model"), Style.BtnConfirm, getIntent().getBooleanExtra("music_allow_clear", false), bundleExtra, stringExtra3, stringExtra2)).mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
