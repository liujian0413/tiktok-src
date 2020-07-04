package com.p280ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.photo.C34731e;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity */
public class PhotoPreviewActivity extends AmeActivity {

    /* renamed from: a */
    private boolean f90650a;
    @BindView(2131493563)
    ImageView mImageView;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo88223a() {
        return Boolean.valueOf(this.f90650a);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493563})
    public void onClick(View view) {
        ActivityCompat.m2243b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo88224a(PhotoContext photoContext) {
        m112165b(photoContext);
        this.f90650a = true;
        return null;
    }

    /* renamed from: b */
    private void m112165b(PhotoContext photoContext) {
        LayoutParams layoutParams;
        if (photoContext != null && photoContext.mHeight != 0 && photoContext.mWidth != 0) {
            ImageView imageView = this.mImageView;
            if (C39805en.m127445a()) {
                layoutParams = C39804em.m127433a((Context) this, photoContext.mWidth, photoContext.mHeight, 0);
            } else {
                layoutParams = m112166c(photoContext);
            }
            imageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private LayoutParams m112166c(PhotoContext photoContext) {
        int i;
        int e = C39805en.m127452e(this);
        int b = C39805en.m127447b(this);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (photoContext.mHeight * 9 < photoContext.mWidth * 16 || e * 9 < b * 16) {
            layoutParams.width = b;
            layoutParams.height = (photoContext.mHeight * b) / photoContext.mWidth;
            layoutParams.topMargin = (e - layoutParams.height) / 2;
            if (layoutParams.topMargin >= 0) {
                i = layoutParams.topMargin;
            } else {
                i = 0;
            }
            layoutParams.topMargin = i;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (photoContext.mWidth * e) / photoContext.mHeight;
            layoutParams.height = e;
            layoutParams.leftMargin = (b - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        return layoutParams;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.du);
        PhotoContext photoContext = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        C0991u.m4192a((View) this.mImageView, "photo_preview_transition");
        C34731e.m112070a(this.mImageView, photoContext.getTmpPhotoUri(C35563c.f93238a), (C7561a<C7581n>) new C34784a<C7581n>(this, photoContext));
        if (C39805en.m127445a()) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            if (C6776h.m20953d()) {
                C10994a.m32205a((Activity) this);
            } else {
                C10994a.m32208b(this);
            }
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            new C38576cg(this).mo96554a(new C34785b(this), new C34786c(this, photoContext));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo88225a(PhotoContext photoContext, Integer num) {
        m112165b(photoContext);
        return null;
    }

    /* renamed from: a */
    public static void m112164a(Activity activity, PhotoContext photoContext, View view) {
        Intent intent = new Intent();
        intent.setClass(activity, PhotoPreviewActivity.class);
        intent.putExtra("photo_model", photoContext);
        C0991u.m4192a(view, "photo_preview_transition");
        activity.startActivity(intent, C0598c.m2483a(activity, view, "photo_preview_transition").mo2580a());
    }
}
