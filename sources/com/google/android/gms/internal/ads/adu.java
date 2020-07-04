package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@C6505uv
public final class adu extends C15741hp {

    /* renamed from: a */
    private final Context f40074a;

    /* renamed from: a */
    public static bug m45660a(Context context) {
        bug bug = new bug(new C15821ko(new File(context.getCacheDir(), "admob_volley"), 20971520), new adu(context, new C15979qk()));
        bug.mo41336a();
        return bug;
    }

    private adu(Context context, C15960ps psVar) {
        super(psVar);
        this.f40074a = context;
    }

    /* renamed from: a */
    public final bor mo39236a(bqk<?> bqk) throws zzae {
        if (bqk.f43254d && bqk.f43251a == 0) {
            if (Pattern.matches((String) bym.m50299d().mo41272a(C15585bw.f43903cr), bqk.f43252b) && afb.m45738c(this.f40074a, 13400000)) {
                bor a = new C15771is(this.f40074a).mo39236a(bqk);
                if (a != null) {
                    String str = "Got gmscore asset response: ";
                    String valueOf = String.valueOf(bqk.f43252b);
                    acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return a;
                }
                String str2 = "Failed to get gmscore asset response: ";
                String valueOf2 = String.valueOf(bqk.f43252b);
                acd.m45438a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
        }
        return super.mo39236a(bqk);
    }
}
