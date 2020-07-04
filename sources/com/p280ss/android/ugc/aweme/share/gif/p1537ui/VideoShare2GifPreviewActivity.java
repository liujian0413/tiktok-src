package com.p280ss.android.ugc.aweme.share.gif.p1537ui;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.content.FileProvider;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p280ss.android.ugc.aweme.share.improve.C38065a;
import com.p280ss.android.ugc.aweme.share.seconditem.ShareItemView;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity */
public class VideoShare2GifPreviewActivity extends AmeActivity implements C0042h {

    /* renamed from: a */
    private VideoShare2GifEditContext f99096a;

    /* renamed from: b */
    private boolean f99097b;
    RemoteImageView gifImageView;
    LinearLayout llShareContainer;
    DmtTextView tvShareTitle;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f99097b) {
            setResult(-1);
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
    }

    /* renamed from: a */
    private void m121453a() {
        if (VERSION.SDK_INT >= 21) {
            this.gifImageView.setClipToOutline(true);
            this.gifImageView.setOutlineProvider(new C43070ds(C23486n.m77122a(4.0d)));
        }
        if (!TextUtils.isEmpty(this.f99096a.f99035e) && this.f99096a.f99040j > 0 && this.f99096a.f99039i > 0) {
            LayoutParams layoutParams = this.gifImageView.getLayoutParams();
            layoutParams.width = this.f99096a.f99039i;
            layoutParams.height = this.f99096a.f99040j;
            this.gifImageView.setLayoutParams(layoutParams);
            Uri fromFile = Uri.fromFile(new File(this.f99096a.f99035e));
            C13380c.m39172c().mo33181b(fromFile);
            C23323e.m76515a(this.gifImageView, fromFile.toString(), this.f99096a.f99039i, this.f99096a.f99040j);
        }
        this.tvShareTitle.setFontType(C10834d.f29332b);
        m121455b();
    }

    /* renamed from: b */
    private void m121455b() {
        String[] gifImageShareList = C37984ap.m121302b().getGifImageShareList();
        if (gifImageShareList != null && gifImageShareList.length > 0) {
            for (String str : gifImageShareList) {
                if (!TextUtils.isEmpty(str)) {
                    C38343b a = C38065a.m121467a(str, this);
                    if (a != null) {
                        ShareItemView a2 = ShareItemView.m122196a((Context) this, a.mo95740c(), C0683b.m2903a((Context) this, a.mo95736a()), (OnClickListener) new C38060a(this, a, str));
                        a2.setTextColor(R.color.a51);
                        if (a.mo95743a(this)) {
                            this.llShareContainer.addView(a2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void handleUiClickEvent(View view) {
        if (view.getId() == R.id.dqq) {
            C6907h.m21524a("gif_re_edit", (Map) new HashMap());
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ff);
        ButterKnife.bind((Activity) this);
        this.f99096a = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        if (this.f99096a == null) {
            finish();
        }
        m121453a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static Uri m121452a(Context context, File file) {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }

    /* renamed from: a */
    public static void m121454a(Activity activity, VideoShare2GifEditContext videoShare2GifEditContext, int i) {
        Intent intent = new Intent(activity, VideoShare2GifPreviewActivity.class);
        intent.putExtra("extra_data", videoShare2GifEditContext);
        activity.startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95701a(C38343b bVar, String str, View view) {
        C6907h.m21525a("share_as_gif", new C6909j().mo16966a("group_id", this.f99096a.f99032b).mo16966a("author_id", this.f99096a.f99046p).mo16966a("enter_from", this.f99096a.f99047q).mo16966a("log_pb", this.f99096a.f99048r).mo16966a("platform", bVar.mo95739b()).mo16967a());
        Uri a = m121452a(this, new File(this.f99096a.f99035e));
        if (TextUtils.equals(str, "facebook")) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.setClassName(getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
            intent.putExtra("android.intent.extra.STREAM", a);
            startActivity(Intent.createChooser(Intent.createChooser(intent, ""), ""));
        } else {
            bVar.mo95744a(new C38357h(a, this.f99096a.f99035e), (Context) this);
        }
        this.f99097b = true;
    }
}
