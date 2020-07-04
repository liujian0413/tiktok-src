package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47078a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class GalleryActivity extends Activity {

    /* renamed from: a */
    GalleryItem f120573a;

    /* renamed from: b */
    final C47087n f120574b = new C47088o(C47029aq.m147040a());

    public static class GalleryItem implements Serializable {
        public final List<MediaEntity> mediaEntities;
        public final int mediaEntityIndex;
        public final long tweetId;

        public GalleryItem(int i, List<MediaEntity> list) {
            this(0, i, list);
        }

        public GalleryItem(long j, int i, List<MediaEntity> list) {
            this.tweetId = j;
            this.mediaEntityIndex = i;
            this.mediaEntities = list;
        }
    }

    /* renamed from: c */
    private C0935e m146928c() {
        return new C0935e() {

            /* renamed from: a */
            int f120575a = -1;

            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                if (this.f120575a >= 0) {
                    GalleryActivity.this.mo118170b();
                }
                this.f120575a++;
                GalleryActivity.this.mo118169a(i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (this.f120575a == -1 && i == 0 && ((double) f) == 0.0d) {
                    GalleryActivity.this.mo118169a(i);
                    this.f120575a++;
                }
            }
        };
    }

    /* renamed from: d */
    private C47078a m146929d() {
        return new C47078a() {
            /* renamed from: a */
            public final void mo118173a() {
                GalleryActivity.this.mo118168a();
                GalleryActivity.this.finish();
                GalleryActivity.this.overridePendingTransition(0, R.anim.dl);
            }
        };
    }

    /* renamed from: f */
    private void m146931f() {
        this.f120574b.mo118355a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118168a() {
        this.f120574b.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118170b() {
        this.f120574b.mo118357b();
    }

    public void onBackPressed() {
        mo118168a();
        super.onBackPressed();
        overridePendingTransition(0, R.anim.dl);
    }

    /* renamed from: e */
    private GalleryItem m146930e() {
        MediaEntity mediaEntity = (MediaEntity) getIntent().getSerializableExtra("MEDIA_ENTITY");
        if (mediaEntity != null) {
            return new GalleryItem(0, Collections.singletonList(mediaEntity));
        }
        return (GalleryItem) getIntent().getSerializableExtra("GALLERY_ITEM");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118169a(int i) {
        this.f120574b.mo118356a(ScribeItem.fromMediaEntity(this.f120573a.tweetId, (MediaEntity) this.f120573a.mediaEntities.get(i)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b0l);
        this.f120573a = m146930e();
        if (bundle == null) {
            m146931f();
        }
        C47086m mVar = new C47086m(this, m146929d());
        mVar.mo118354a(this.f120573a.mediaEntities);
        ViewPager viewPager = (ViewPager) findViewById(R.id.e66);
        viewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.vo));
        viewPager.addOnPageChangeListener(m146928c());
        viewPager.setAdapter(mVar);
        viewPager.setCurrentItem(this.f120573a.mediaEntityIndex);
    }
}
