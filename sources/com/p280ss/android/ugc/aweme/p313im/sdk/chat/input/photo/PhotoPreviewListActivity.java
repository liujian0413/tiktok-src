package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity */
public class PhotoPreviewListActivity extends AmeActivity {

    /* renamed from: a */
    public ArrayList<PhotoParam> f80863a;

    /* renamed from: b */
    public View f80864b;

    /* renamed from: c */
    public View f80865c;

    /* renamed from: d */
    public TextView f80866d;

    /* renamed from: e */
    public TextView f80867e;

    /* renamed from: f */
    public ImageView f80868f;

    /* renamed from: g */
    public View f80869g;

    /* renamed from: h */
    public C30913u f80870h;

    /* renamed from: i */
    public C30897h f80871i;

    /* renamed from: j */
    private String f80872j;

    /* renamed from: k */
    private int f80873k;

    /* renamed from: l */
    private ViewPager f80874l;

    /* renamed from: m */
    private C30872j f80875m;

    /* renamed from: n */
    private C31882a f80876n;

    /* renamed from: o */
    private PhotoPreviewPagerAdapter f80877o;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: e */
    private void m100580e() {
        Intent intent = new Intent();
        intent.putExtra("send_photo", true);
        setResult(49, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo80782a() {
        ArrayList arrayList = new ArrayList();
        if (C23477d.m77081a((Collection<T>) this.f80870h.mo80834b())) {
            arrayList.add(this.f80871i);
        } else {
            arrayList.addAll(this.f80870h.mo80834b());
        }
        C30963v.m100755a().mo81336a(this.f80872j, (List<PhotoParam>) PhotoParam.fromPhotoItems(arrayList));
        this.f80870h.mo80838e();
        m100580e();
    }

    /* renamed from: b */
    private void m100577b() {
        this.f80874l = (ViewPager) findViewById(R.id.eej);
        this.f80864b = findViewById(R.id.d3d);
        this.f80864b.setSelected(this.f80870h.f80964b);
        this.f80866d = (TextView) findViewById(R.id.d2x);
        this.f80866d.setText(this.f80870h.mo80837d());
        this.f80865c = findViewById(R.id.jx);
        this.f80867e = (TextView) findViewById(R.id.d2b);
        this.f80868f = (ImageView) findViewById(R.id.d2a);
        this.f80869g = findViewById(R.id.d2c);
        m100578c();
    }

    /* renamed from: c */
    private void m100578c() {
        if (C6307b.m19566a((Collection<T>) this.f80863a)) {
            finish();
            return;
        }
        if (this.f80873k < 0 || this.f80863a == null || this.f80873k >= this.f80863a.size()) {
            this.f80873k = 0;
        }
        this.f80870h.mo80830a(this.f80867e, this.f80868f, null, ((PhotoParam) this.f80863a.get(this.f80873k)).getPath());
        this.f80877o = new PhotoPreviewPagerAdapter(getSupportFragmentManager(), this.f80863a);
        this.f80871i = this.f80870h.mo80833b(((PhotoParam) this.f80863a.get(this.f80873k)).getPath());
        this.f80874l.setAdapter(this.f80877o);
        this.f80874l.setCurrentItem(this.f80873k);
        m100579d();
    }

    /* renamed from: d */
    private void m100579d() {
        if (this.f80875m == null) {
            this.f80875m = new C30872j() {
                public final void onClick(View view) {
                    if (view.equals(PhotoPreviewListActivity.this.f80866d)) {
                        new C6928b(PhotoPreviewListActivity.this, new C6943d() {
                            public final void sendMsg() {
                                PhotoPreviewListActivity.this.mo80782a();
                            }
                        }).sendMsg();
                    } else if (view.equals(PhotoPreviewListActivity.this.f80864b)) {
                        PhotoPreviewListActivity.this.f80864b.setSelected(!PhotoPreviewListActivity.this.f80864b.isSelected());
                        PhotoPreviewListActivity.this.f80870h.f80964b = PhotoPreviewListActivity.this.f80864b.isSelected();
                    } else if (view.equals(PhotoPreviewListActivity.this.f80865c)) {
                        PhotoPreviewListActivity.this.finish();
                    } else {
                        if (view.equals(PhotoPreviewListActivity.this.f80868f)) {
                            if (view.isSelected()) {
                                PhotoPreviewListActivity.this.f80870h.mo80835b(PhotoPreviewListActivity.this.f80871i);
                            } else if (PhotoPreviewListActivity.this.f80870h.mo80836c() >= C30913u.f80961a) {
                                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bpb);
                                return;
                            } else {
                                PhotoPreviewListActivity.this.f80870h.mo80831a(PhotoPreviewListActivity.this.f80871i);
                            }
                            view.setSelected(!view.isSelected());
                            PhotoPreviewListActivity.this.f80870h.mo80829a(null, PhotoPreviewListActivity.this.f80869g, PhotoPreviewListActivity.this.f80867e, PhotoPreviewListActivity.this.f80868f, null, PhotoPreviewListActivity.this.f80871i.f80944a.f52149b);
                            PhotoPreviewListActivity.this.f80866d.setText(PhotoPreviewListActivity.this.f80870h.mo80837d());
                        }
                    }
                }
            };
        }
        if (this.f80876n == null) {
            this.f80876n = C31882a.m103579n();
        }
        this.f80876n.mo82725a(this.f80865c, this.f80864b, this.f80866d, this.f80864b, this.f80868f);
        C30872j.m100536a((OnClickListener) this.f80875m, this.f80866d, this.f80864b, this.f80865c, this.f80868f);
        this.f80874l.addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                PhotoPreviewListActivity.this.f80871i = PhotoPreviewListActivity.this.f80870h.mo80833b(((PhotoParam) PhotoPreviewListActivity.this.f80863a.get(i)).getPath());
                if (PhotoPreviewListActivity.this.f80871i != null && PhotoPreviewListActivity.this.f80871i.f80944a != null) {
                    PhotoPreviewListActivity.this.f80868f.setSelected(PhotoPreviewListActivity.this.f80870h.mo80832a(PhotoPreviewListActivity.this.f80871i.f80944a.f52149b));
                    PhotoPreviewListActivity.this.f80870h.mo80830a(PhotoPreviewListActivity.this.f80867e, PhotoPreviewListActivity.this.f80868f, null, PhotoPreviewListActivity.this.f80871i.f80944a.f52149b);
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f80872j);
        bundle.putInt("photo_start_index", this.f80873k);
        bundle.putSerializable("photo_param_list", this.f80863a);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.s8);
        C6956a.m21633b().setupStatusBar(this);
        m100576a(bundle);
        m100577b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m100576a(Bundle bundle) {
        if (bundle != null) {
            this.f80863a = (ArrayList) bundle.getSerializable("photo_param_list");
            this.f80872j = bundle.getString("session_id");
            this.f80873k = bundle.getInt("photo_start_index");
        } else {
            this.f80863a = (ArrayList) getIntent().getSerializableExtra("photo_param_list");
            this.f80872j = getIntent().getStringExtra("session_id");
            this.f80873k = getIntent().getIntExtra("photo_start_index", 0);
        }
        this.f80870h = C30913u.m100638a();
        if (C6307b.m19566a((Collection<T>) this.f80863a)) {
            this.f80863a = PhotoParam.fromPhotoItems(this.f80870h.f80965c);
        }
    }

    /* renamed from: a */
    public static void m100575a(Activity activity, String str, int i, int i2) {
        Intent intent = new Intent(activity, PhotoPreviewListActivity.class);
        intent.putExtra("session_id", str);
        intent.putExtra("photo_start_index", i);
        activity.startActivityForResult(intent, 48);
    }
}
