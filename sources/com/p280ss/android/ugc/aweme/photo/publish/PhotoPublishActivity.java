package com.p280ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity */
public class PhotoPublishActivity extends AmeActivity {

    /* renamed from: a */
    PhotoPublishFragment f90655a;

    /* renamed from: b */
    TextView f90656b;

    /* renamed from: c */
    private PhotoContext f90657c;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        m112170a();
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    private void m112170a() {
        PhotoContext c = ((PhotoPublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy)).mo88233c();
        Intent intent = new Intent();
        intent.putExtra("photo_model", c);
        setResult(-1, intent);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", true);
        super.onResume();
        if (this.f90655a != null && this.f90655a.mo88238h()) {
            this.f90656b.setText(R.string.czp);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131492917})
    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.jn) {
            C6907h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page").setJsonObject(new C6909j().mo16966a("is_photo", "1").mo16967a()));
            String str2 = "enter_video_edit_page";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90657c.creationId).mo59973a("shoot_way", this.f90657c.mShootWay).mo59970a("draft_id", this.f90657c.draftId).mo59973a("content_type", "photo").mo59973a("filter_list", this.f90657c.mFilterName).mo59970a("filter_id_list", this.f90657c.mFilterId);
            String str3 = "content_source";
            if (this.f90657c.mPhotoFrom == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("video_cnt", 0).mo59970a("pic_cnt", 1).mo59970a("is_multi_content", 0).f60753a);
            m112170a();
            ActivityCompat.m2243b(this);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dv);
        this.f90656b = (TextView) findViewById(R.id.title);
        this.f90657c = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f90655a = (PhotoPublishFragment) supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f90655a == null) {
            this.f90655a = PhotoPublishFragment.m112172a(this.f90657c);
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f90655a).mo2604c();
        }
        String str2 = "enter_video_post_page";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90657c.creationId).mo59973a("shoot_way", this.f90657c.mShootWay).mo59970a("draft_id", this.f90657c.draftId).mo59973a("filter_list", this.f90657c.mFilterName).mo59970a("filter_id_list", this.f90657c.mFilterId).mo59973a("content_type", "photo");
        String str3 = "content_source";
        if (this.f90657c.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("video_cnt", 0).mo59970a("pic_cnt", 1).mo59970a("is_multi_content", 0).f60753a);
        if (C39805en.m127445a()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).statusBarDarkFont(C6399b.m19946v()).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true).statusBarDarkFont(C6399b.m19946v()).init();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: a */
    public static void m112171a(Activity activity, PhotoContext photoContext, int i) {
        Intent intent = new Intent();
        intent.setClass(activity, PhotoPublishActivity.class);
        intent.putExtra("photo_model", photoContext);
        activity.startActivityForResult(intent, i);
    }
}
