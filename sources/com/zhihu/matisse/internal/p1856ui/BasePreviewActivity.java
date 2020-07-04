package com.zhihu.matisse.internal.p1856ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.model.C47343a;
import com.zhihu.matisse.internal.p1855a.C47330d;
import com.zhihu.matisse.internal.p1855a.C47331e;
import com.zhihu.matisse.internal.p1856ui.adapter.PreviewPagerAdapter;
import com.zhihu.matisse.internal.p1856ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.p1856ui.widget.CheckView;
import com.zhihu.matisse.internal.p1856ui.widget.IncapableDialog;
import com.zhihu.matisse.p1854b.C47325b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.BasePreviewActivity */
public abstract class BasePreviewActivity extends AppCompatActivity implements C0935e, OnClickListener, C47325b {

    /* renamed from: a */
    protected final C47343a f121488a = new C47343a(this);

    /* renamed from: b */
    protected C47338d f121489b;

    /* renamed from: c */
    protected ViewPager f121490c;

    /* renamed from: d */
    protected PreviewPagerAdapter f121491d;

    /* renamed from: e */
    protected CheckView f121492e;

    /* renamed from: f */
    protected TextView f121493f;

    /* renamed from: g */
    protected TextView f121494g;

    /* renamed from: h */
    protected TextView f121495h;

    /* renamed from: i */
    protected int f121496i = -1;

    /* renamed from: j */
    public CheckRadioView f121497j;

    /* renamed from: k */
    protected boolean f121498k;

    /* renamed from: l */
    private LinearLayout f121499l;

    /* renamed from: m */
    private FrameLayout f121500m;

    /* renamed from: n */
    private FrameLayout f121501n;

    /* renamed from: o */
    private boolean f121502o = false;

    /* renamed from: a */
    public final void mo119394a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C47350a.m147880a(this, context);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onBackPressed() {
        m147863a(false);
        super.onBackPressed();
    }

    /* renamed from: d */
    public final int mo119399d() {
        int f = this.f121488a.mo119393f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            Item item = (Item) this.f121488a.mo119384b().get(i2);
            if (item.mo119354b() && C47330d.m147777a(item.f121437d) > ((float) this.f121489b.f121464t)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private void mo119378a() {
        this.f121497j.setChecked(this.f121498k);
        if (!this.f121498k) {
            this.f121497j.setColor(-1);
        }
        if (mo119399d() > 0 && this.f121498k) {
            IncapableDialog.m147907a("", getString(R.string.c8g, new Object[]{Integer.valueOf(this.f121489b.f121464t)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            this.f121497j.setChecked(false);
            this.f121497j.setColor(-1);
            this.f121498k = false;
        }
    }

    /* renamed from: c */
    public final void mo119398c() {
        int f = this.f121488a.mo119393f();
        if (f == 0) {
            this.f121494g.setText(R.string.c8_);
            this.f121494g.setEnabled(false);
        } else if (f != 1 || !this.f121489b.mo119363c()) {
            this.f121494g.setEnabled(true);
            this.f121494g.setText(getString(R.string.c89, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f121494g.setText(R.string.c8_);
            this.f121494g.setEnabled(true);
        }
        if (this.f121489b.f121462r) {
            this.f121499l.setVisibility(0);
            mo119378a();
            return;
        }
        this.f121499l.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo119343b() {
        if (this.f121489b.f121463s) {
            if (this.f121502o) {
                this.f121501n.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) this.f121501n.getMeasuredHeight()).start();
                this.f121500m.animate().translationYBy((float) (-this.f121500m.getMeasuredHeight())).setInterpolator(new FastOutSlowInInterpolator()).start();
            } else {
                this.f121501n.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) (-this.f121501n.getMeasuredHeight())).start();
                this.f121500m.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) this.f121500m.getMeasuredHeight()).start();
            }
            this.f121502o = !this.f121502o;
        }
    }

    /* renamed from: b */
    public final boolean mo119397b(Item item) {
        C47336b d = this.f121488a.mo119389d(item);
        C47336b.m147801a(this, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f121488a.mo119385b(bundle);
        bundle.putBoolean("checkState", this.f121498k);
        super.onSaveInstanceState(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.sf) {
            onBackPressed();
            return;
        }
        if (view.getId() == R.id.se) {
            m147863a(true);
            finish();
        }
    }

    /* renamed from: a */
    private void m147863a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f121488a.mo119380a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.f121498k);
        setResult(-1, intent);
    }

    public void onPageSelected(int i) {
        CheckView checkView;
        CheckView checkView2;
        PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f121490c.getAdapter();
        if (!(this.f121496i == -1 || this.f121496i == i)) {
            ((PreviewItemFragment) previewPagerAdapter.instantiateItem(this.f121490c, this.f121496i)).mo119407a();
            Item c = previewPagerAdapter.mo119418c(i);
            boolean z = true;
            if (this.f121489b.f121450f) {
                int e = this.f121488a.mo119391e(c);
                this.f121492e.setCheckedNum(e);
                if (e > 0) {
                    checkView2 = this.f121492e;
                } else {
                    checkView2 = this.f121492e;
                    if (this.f121488a.mo119392e()) {
                        z = false;
                    }
                }
                checkView2.setEnabled(z);
            } else {
                boolean c2 = this.f121488a.mo119388c(c);
                this.f121492e.setChecked(c2);
                if (c2) {
                    checkView = this.f121492e;
                } else {
                    checkView = this.f121492e;
                    if (this.f121488a.mo119392e()) {
                        z = false;
                    }
                }
                checkView.setEnabled(z);
            }
            mo119395a(c);
        }
        this.f121496i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119395a(Item item) {
        if (item.mo119355c()) {
            this.f121495h.setVisibility(0);
            TextView textView = this.f121495h;
            StringBuilder sb = new StringBuilder();
            sb.append(C47330d.m147777a(item.f121437d));
            sb.append("M");
            textView.setText(sb.toString());
        } else {
            this.f121495h.setVisibility(8);
        }
        if (item.mo119356d()) {
            this.f121499l.setVisibility(8);
            return;
        }
        if (this.f121489b.f121462r) {
            this.f121499l.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        setTheme(C47338d.m147803a().f121448d);
        super.onCreate(bundle);
        if (!C47338d.m147803a().f121460p) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.d7);
        if (C47331e.m147785b()) {
            getWindow().addFlags(67108864);
        }
        this.f121489b = C47338d.m147803a();
        if (this.f121489b.mo119364d()) {
            setRequestedOrientation(this.f121489b.f121449e);
        }
        if (bundle == null) {
            this.f121488a.mo119381a(getIntent().getBundleExtra("extra_default_bundle"));
            this.f121498k = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f121488a.mo119381a(bundle);
            this.f121498k = bundle.getBoolean("checkState");
        }
        this.f121493f = (TextView) findViewById(R.id.sf);
        this.f121494g = (TextView) findViewById(R.id.se);
        this.f121495h = (TextView) findViewById(R.id.d7h);
        this.f121493f.setOnClickListener(this);
        this.f121494g.setOnClickListener(this);
        this.f121490c = (ViewPager) findViewById(R.id.c9z);
        this.f121490c.addOnPageChangeListener(this);
        this.f121491d = new PreviewPagerAdapter(getSupportFragmentManager(), null);
        this.f121490c.setAdapter(this.f121491d);
        this.f121492e = (CheckView) findViewById(R.id.vg);
        this.f121492e.setCountable(this.f121489b.f121450f);
        this.f121500m = (FrameLayout) findViewById(R.id.oe);
        this.f121501n = (FrameLayout) findViewById(R.id.dmw);
        this.f121492e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (BasePreviewActivity.this.f121491d.getCount() > 0) {
                    Item c = BasePreviewActivity.this.f121491d.mo119418c(BasePreviewActivity.this.f121490c.getCurrentItem());
                    if (BasePreviewActivity.this.f121488a.mo119388c(c)) {
                        BasePreviewActivity.this.f121488a.mo119386b(c);
                        if (BasePreviewActivity.this.f121489b.f121450f) {
                            BasePreviewActivity.this.f121492e.setCheckedNum(Integer.MIN_VALUE);
                        } else {
                            BasePreviewActivity.this.f121492e.setChecked(false);
                        }
                    } else if (BasePreviewActivity.this.mo119397b(c)) {
                        BasePreviewActivity.this.f121488a.mo119383a(c);
                        if (BasePreviewActivity.this.f121489b.f121450f) {
                            BasePreviewActivity.this.f121492e.setCheckedNum(BasePreviewActivity.this.f121488a.mo119391e(c));
                        } else {
                            BasePreviewActivity.this.f121492e.setChecked(true);
                        }
                    }
                    BasePreviewActivity.this.mo119398c();
                    if (BasePreviewActivity.this.f121489b.f121461q != null) {
                        BasePreviewActivity.this.f121488a.mo119387c();
                        BasePreviewActivity.this.f121488a.mo119390d();
                    }
                }
            }
        });
        this.f121499l = (LinearLayout) findViewById(R.id.c9k);
        this.f121497j = (CheckRadioView) findViewById(R.id.c9j);
        this.f121499l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                int d = BasePreviewActivity.this.mo119399d();
                if (d > 0) {
                    IncapableDialog.m147907a("", BasePreviewActivity.this.getString(R.string.c8f, new Object[]{Integer.valueOf(d), Integer.valueOf(BasePreviewActivity.this.f121489b.f121464t)})).show(BasePreviewActivity.this.getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                }
                BasePreviewActivity.this.f121498k = true ^ BasePreviewActivity.this.f121498k;
                BasePreviewActivity.this.f121497j.setChecked(BasePreviewActivity.this.f121498k);
                if (!BasePreviewActivity.this.f121498k) {
                    BasePreviewActivity.this.f121497j.setColor(-1);
                }
            }
        });
        mo119398c();
    }
}
