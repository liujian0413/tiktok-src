package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.widget.Space;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.widget.p1067a.C23506a;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior.C34723a;
import com.p280ss.android.ugc.aweme.photo.local.MediaChooseFragment;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity */
public class ChooseMediaActivity extends AmeActivity {

    /* renamed from: a */
    int f86149a;

    /* renamed from: b */
    public PhotoMovieContext f86150b;

    /* renamed from: c */
    public List<MediaModel> f86151c;

    /* renamed from: d */
    private boolean f86152d;

    /* renamed from: e */
    private boolean f86153e;

    /* renamed from: f */
    private TextView f86154f;

    /* renamed from: g */
    private ImageView f86155g;

    /* renamed from: h */
    private TextView f86156h;

    /* renamed from: i */
    private MediaChooseFragment f86157i;

    /* renamed from: j */
    private C33794a f86158j = new C33794a() {
        /* renamed from: a */
        public final void mo84845a(PhotoMovieContext photoMovieContext) {
            int i;
            if (photoMovieContext == null) {
                i = 0;
            } else {
                i = photoMovieContext.getImageCount();
            }
            ChooseMediaActivity.this.f86150b = photoMovieContext;
            ChooseMediaActivity.this.mo84837a(i, false);
        }

        /* renamed from: a */
        public final void mo84844a(MediaModel mediaModel) {
            if ((ChooseMediaActivity.this.f86149a & 1) > 0) {
                C33175g.m107023a(false, false);
                Intent intent = new Intent();
                intent.putExtra("image_file", mediaModel.f88156b);
                ChooseMediaActivity.this.setResult(-1, intent);
                ChooseMediaActivity.this.finish();
                return;
            }
            C9738o.m28693a((Context) ChooseMediaActivity.this, (int) R.string.baw);
        }
    };

    /* renamed from: k */
    private C33177i f86159k = new C33177i() {
        /* renamed from: a */
        public final void mo84846a(List<MediaModel> list) {
            int i;
            ChooseMediaActivity.this.f86151c = list;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            ChooseMediaActivity.this.mo84837a(i, true);
        }
    };

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo84838b() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: f */
    private MediaChooseFragment m106885f() {
        return (MediaChooseFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.t);
    }

    /* renamed from: c */
    private void m106882c() {
        m106885f().mo88214a().addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                int i2;
                int i3 = 0;
                if (i == 0) {
                    ChooseMediaActivity chooseMediaActivity = ChooseMediaActivity.this;
                    if (ChooseMediaActivity.this.f86151c != null) {
                        i3 = ChooseMediaActivity.this.f86151c.size();
                    }
                    chooseMediaActivity.mo84837a(i3, true);
                    return;
                }
                ChooseMediaActivity chooseMediaActivity2 = ChooseMediaActivity.this;
                if (ChooseMediaActivity.this.f86150b == null) {
                    i2 = 0;
                } else {
                    i2 = ChooseMediaActivity.this.f86150b.getImageCount();
                }
                chooseMediaActivity2.mo84837a(i2, false);
            }
        });
    }

    /* renamed from: d */
    private void m106883d() {
        MediaChooseFragment f = m106885f();
        if (!C6311g.m19573a(this.f86151c)) {
            f.mo88215a(this.f86151c);
        }
    }

    /* renamed from: a */
    public final void mo84836a() {
        int i;
        MediaChooseFragment f = m106885f();
        int i2 = 0;
        if (!C6311g.m19573a(this.f86151c)) {
            i = this.f86151c.size();
        } else {
            i = 0;
        }
        if (this.f86150b != null) {
            i2 = this.f86150b.getImageCount();
        }
        C33175g.m107022a(f.mo88218f(), i, i2);
        if (f.mo88218f()) {
            m106883d();
        } else {
            m106884e();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity", "onResume", true);
        super.onResume();
        final MediaChooseFragment f = m106885f();
        if (!this.f86153e && f != null) {
            m106882c();
            f.mo88214a().post(new Runnable() {
                public final void run() {
                    f.mo88216d();
                    f.mo88217e();
                }
            });
            this.f86153e = true;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity", "onResume", false);
    }

    /* renamed from: e */
    private void m106884e() {
        int i;
        if (this.f86150b == null) {
            i = 0;
        } else {
            i = this.f86150b.getImageCount();
        }
        if (i != 1) {
            if (i > 1) {
                Intent intent = new Intent();
                intent.putExtra("photo_movie_context", this.f86150b);
                setResult(-1, intent);
                finish();
            }
        } else if ((this.f86149a & 1) > 0) {
            Intent intent2 = new Intent();
            intent2.putExtra("image_file", (String) this.f86150b.mImageList.get(0));
            intent2.putExtra("image_poidata", this.f86150b.poiData);
            setResult(-1, intent2);
            finish();
        } else {
            C10761a.m31399c((Context) this, (int) R.string.baw).mo25750a();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.cy);
        this.f86149a = getIntent().getIntExtra("ARG_SUPPORT_FLAGS", 0);
        this.f86152d = getIntent().getBooleanExtra("ARG_MULTI_VIDEO_ENABLE", true);
        this.f86154f = (TextView) findViewById(R.id.dqc);
        this.f86155g = (ImageView) findViewById(R.id.jo);
        this.f86156h = (TextView) findViewById(R.id.e3f);
        this.f86156h.getPaint().setFakeBoldText(true);
        this.f86155g.setOnClickListener(C23506a.m77197a(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ChooseMediaActivity.this.finish();
            }
        }));
        this.f86154f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ChooseMediaActivity.this.mo84836a();
            }
        });
        ((Space) findViewById(R.id.d8v)).setMinimumHeight(C23482j.m77101d());
        final LocalViewPagerBottomSheetBehavior a = C34723a.m112047a(findViewById(R.id.a7r));
        a.mo88143e(R.id.dmd);
        getSupportFragmentManager().mo2649a((C0609a) new C0609a() {
            public final void onFragmentActivityCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
                super.onFragmentActivityCreated(jVar, fragment, bundle);
                if (fragment instanceof MediaChooseFragment) {
                    a.mo60680a(((MediaChooseFragment) fragment).mo88214a());
                }
            }
        }, false);
        a.f61460k = new C23369a() {
            /* renamed from: a */
            public final void mo60691a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo60692a(View view, int i) {
                if (i == 5) {
                    ChooseMediaActivity.this.mo84838b();
                }
            }
        };
        a.f61453d = true;
        a.mo60679a(C23482j.m77095a(this) + C23482j.m77104e(this));
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f86157i = (MediaChooseFragment) supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f86157i == null) {
            this.f86157i = MediaChooseFragment.m112153a(null, this.f86149a, this.f86152d, this.f86158j, this.f86159k);
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f86157i).mo2606d();
            this.f86157i.f90628g = true;
            this.f86157i.f90632k = getIntent().getLongExtra("ARG_MIN_DURATION", C39810eq.m127460a());
        } else {
            this.f86157i.f90626e = this.f86158j;
            this.f86157i.f90627f = this.f86159k;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mediachoose.ChooseMediaActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo84837a(int i, boolean z) {
        if (i <= 0) {
            this.f86154f.setVisibility(8);
            return;
        }
        if (this.f86154f.getVisibility() == 8) {
            this.f86154f.setVisibility(0);
            this.f86154f.setAlpha(0.0f);
        }
        if (i == 1) {
            if ((this.f86149a & 1) > 0 || z) {
                this.f86154f.setText(C1642a.m8034a(getString(R.string.cln), new Object[]{Integer.valueOf(i)}));
                this.f86154f.animate().alpha(1.0f).setDuration(200).start();
                return;
            }
            this.f86154f.setText(C1642a.m8034a(getString(R.string.bav), new Object[]{Integer.valueOf(i)}));
            this.f86154f.animate().alpha(0.5f).setDuration(200).start();
        } else if (i == 2) {
            if (z) {
                this.f86154f.setText(C1642a.m8034a(getString(R.string.cln), new Object[]{Integer.valueOf(i)}));
            } else {
                this.f86154f.setText(C1642a.m8034a(getString(R.string.bav), new Object[]{Integer.valueOf(i)}));
            }
            this.f86154f.animate().alpha(1.0f).setDuration(200).start();
        } else {
            if (z) {
                this.f86154f.setText(C1642a.m8034a(getString(R.string.cln), new Object[]{Integer.valueOf(i)}));
            } else {
                this.f86154f.setText(C1642a.m8034a(getString(R.string.bav), new Object[]{Integer.valueOf(i)}));
            }
            this.f86154f.setAlpha(1.0f);
        }
    }
}
