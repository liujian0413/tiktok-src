package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.photo.p1451a.C34727a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.StatedButton;
import com.p280ss.android.ugc.aweme.profile.presenter.C36024g;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity */
public class ProfileCoverPreviewActivity extends AmeSSActivity {

    /* renamed from: a */
    private UrlModel f95003a;

    /* renamed from: b */
    private boolean f95004b;

    /* renamed from: c */
    private C36024g f95005c;
    TextView mChangeBtn;
    RemoteImageView mCoverImage;
    StatedButton mDownloadBtn;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ag, R.anim.ah);
    }

    /* renamed from: a */
    private void m117073a() {
        this.f95003a = (UrlModel) getIntent().getSerializableExtra("header_cover_url");
        int i = 0;
        this.f95004b = getIntent().getBooleanExtra("is_self", false);
        TextView textView = this.mChangeBtn;
        if (!this.f95004b) {
            i = 8;
        }
        textView.setVisibility(i);
        C23323e.m76524b(this.mCoverImage, this.f95003a);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f95005c != null) {
            this.f95005c.mo91673a(bundle);
        }
    }

    /* renamed from: b */
    private void m117076b(String str) {
        C22477b.m74364a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C36410cx(this, str));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e8);
        ButterKnife.bind((Activity) this);
        overridePendingTransition(R.anim.ag, R.anim.ah);
        m117073a();
        this.f95005c = new C36024g(this, null, true);
        this.f95005c.mo91675b(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92201a(C1592h hVar) throws Exception {
        C10761a.m31383a((Context) this, (int) R.string.dir).mo25750a();
        this.mDownloadBtn.mo92994c();
        return null;
    }

    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.b7x) {
            view.announceForAccessibility(getText(R.string.pp));
            finish();
        } else if (id == R.id.drh) {
            this.f95005c.mo91670a();
        } else {
            if (id == R.id.b8n) {
                String a = C23323e.m76499a(this.f95003a);
                if (!TextUtils.isEmpty(a)) {
                    m117076b(a);
                    return;
                }
                C10761a.m31399c((Context) this, (int) R.string.did).mo25750a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo92202a(String str) throws Exception {
        String a = C23139a.m76055a(AwemeApplication.m21341a());
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
        sb.append(".png");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append(File.separator);
        sb3.append(sb2);
        String sb4 = sb3.toString();
        C7276d.m22820d(C23323e.m76500a(str), sb4);
        C34727a.m112060a(this, sb4);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92204b(DialogInterface dialogInterface, int i) {
        C42969bc.m136401a(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f95005c.mo91672a(i, i2, intent);
    }

    /* renamed from: a */
    public static void m117074a(Context context, UrlModel urlModel, boolean z) {
        Intent intent = new Intent(context, ProfileCoverPreviewActivity.class);
        intent.putExtra("header_cover_url", urlModel);
        intent.putExtra("is_self", z);
        context.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92203a(String str, String[] strArr, int[] iArr) {
        if (strArr.length <= 0 || iArr[0] != 0) {
            new C10741a(this).mo25650a((int) R.string.afp, (OnClickListener) new C36414da(this)).mo25658b((int) R.string.w_, C36415db.f95573a).mo25657b((int) R.string.lb).mo25656a().mo25637a();
            return;
        }
        this.mDownloadBtn.mo92992a();
        C1592h.m7853a((Callable<TResult>) new C36411cy<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C36412cz<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
