package com.p280ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.BaseShareContext;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.opensdk.share.share.C34697a;
import com.p280ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p280ss.android.ugc.aweme.opensdk.share.share.Share.Response;
import com.p280ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.e */
public final class C34685e {

    /* renamed from: a */
    private Activity f90460a;

    /* renamed from: b */
    private Request f90461b;

    /* renamed from: c */
    private BaseShareContext f90462c;

    /* renamed from: a */
    public final void mo88008a() {
        if (this.f90461b != null) {
            Response response = new Response();
            response.errorCode = 0;
            response.state = this.f90461b.mState;
            response.subErrorCode = 0;
            m111983a(this.f90461b, response);
        }
    }

    public C34685e(Activity activity, BaseShareContext baseShareContext) {
        if (baseShareContext != null && !TextUtils.isEmpty(baseShareContext.mClientKey)) {
            this.f90460a = activity;
            this.f90461b = C34697a.m112008a(baseShareContext.getShareRequestBundle());
            this.f90462c = baseShareContext;
        }
    }

    /* renamed from: a */
    public final void mo88009a(String str, int i) {
        String str2;
        if (this.f90461b != null) {
            Response response = new Response();
            response.subErrorCode = i;
            response.errorCode = C34674a.m111969a(i);
            response.state = this.f90461b.mState;
            response.errorMsg = str;
            String str3 = "share_error_status";
            C22984d a = C22984d.m75611a().mo59973a("launch_from", this.f90461b.mClientKey);
            String str4 = "style_id";
            if (this.f90461b.extras != null) {
                str2 = this.f90461b.extras.getString("style_id", "");
            } else {
                str2 = "";
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59970a("error_code", i).f60753a);
            m111983a(this.f90461b, response);
        }
    }

    /* renamed from: a */
    private boolean m111983a(Request request, Response response) {
        if (request == null) {
            return false;
        }
        String callerPackage = request.getCallerPackage();
        String str = request.callerLocalEntry;
        if (TextUtils.isEmpty(callerPackage) || this.f90460a == null || TextUtils.isEmpty(str) || !response.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        response.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, str));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            if (!(this.f90460a instanceof SystemShareActivity) && !(this.f90460a instanceof MainActivity)) {
                if (!C6399b.m19944t()) {
                    Intent intent2 = new Intent(this.f90460a, SystemShareActivity.class);
                    intent2.putExtra("share_error_code", response.subErrorCode);
                    intent2.putExtra("share_error_msg", response.errorMsg);
                    intent2.putExtra("base_share_context", this.f90462c);
                    this.f90460a.startActivity(intent2);
                    this.f90460a.finish();
                    return true;
                }
            }
            this.f90460a.startActivity(intent);
            this.f90460a.finish();
            return true;
        } catch (Exception unused) {
            this.f90460a.finish();
            return false;
        }
    }
}
