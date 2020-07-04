package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.aa */
public final class C43487aa implements C11093e {

    /* renamed from: a */
    protected WeakReference<Context> f112627a;

    /* renamed from: b */
    private C11087a f112628b;

    public C43487aa(WeakReference<Context> weakReference, C11087a aVar) {
        this.f112627a = weakReference;
        this.f112628b = aVar;
    }

    /* renamed from: a */
    public final void mo105415a(C11097i iVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", z ? 1 : 0);
        } catch (JSONException unused) {
        }
        this.f112628b.mo27030a(iVar.f30169b, jSONObject);
    }

    public final void call(final C11097i iVar, JSONObject jSONObject) throws Exception {
        String str;
        if (this.f112627a.get() != null) {
            iVar.f30173f = false;
            String optString = iVar.f30171d.optString(C38347c.f99553h);
            String optString2 = iVar.f30171d.optString("title");
            String optString3 = iVar.f30171d.optString("confirm_text");
            String optString4 = iVar.f30171d.optString("cancel_text");
            final boolean optBoolean = iVar.f30171d.optBoolean("swap");
            C10741a aVar = new C10741a((Context) this.f112627a.get());
            C10741a b = aVar.mo25653a(optString2).mo25660b(optString);
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            C10741a a = b.mo25654a(str, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C43487aa.this.mo105415a(iVar, !optBoolean);
                }
            });
            if (!optBoolean) {
                optString3 = optString4;
            }
            a.mo25661b(optString3, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C43487aa.this.mo105415a(iVar, optBoolean);
                }
            });
            aVar.mo25656a().mo25637a().setCancelable(false);
        }
    }
}
