package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.C14793ay;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rk */
public final class C16006rk extends C16014rs {

    /* renamed from: a */
    private final Map<String, String> f44930a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f44931b;

    public C16006rk(ami ami, Map<String, String> map) {
        super(ami, "storePicture");
        this.f44930a = map;
        this.f44931b = ami.mo39466d();
    }

    /* renamed from: a */
    public final void mo41938a() {
        if (this.f44931b == null) {
            mo41951a("Activity context is not available");
        } else if (!acl.m45559f(this.f44931b).mo40682c()) {
            mo41951a("Feature is not supported by the device.");
        } else {
            String str = (String) this.f44930a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                mo41951a("Image url cannot be empty.");
            } else if (!URLUtil.isValidUrl(str)) {
                String str2 = "Invalid image url: ";
                String valueOf = String.valueOf(str);
                mo41951a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } else {
                String lastPathSegment = Uri.parse(str).getLastPathSegment();
                if (!acl.m45550c(lastPathSegment)) {
                    String str3 = "Image type not recognized: ";
                    String valueOf2 = String.valueOf(lastPathSegment);
                    mo41951a(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                    return;
                }
                Resources f = C14793ay.m42898d().mo39096f();
                Builder e = acl.m45555e(this.f44931b);
                e.setTitle(f != null ? f.getString(R.string.dhq) : "Save image");
                e.setMessage(f != null ? f.getString(R.string.dhr) : "Allow Ad to store image in Picture gallery?");
                e.setPositiveButton(f != null ? f.getString(R.string.dhs) : "Accept", new C16008rm(this, str, lastPathSegment));
                e.setNegativeButton(f != null ? f.getString(R.string.dht) : "Decline", new C16009rn(this));
                e.create().show();
            }
        }
    }
}
