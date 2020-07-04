package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.c */
final class C25818c {

    /* renamed from: a */
    private Activity f68280a;

    /* renamed from: b */
    private C25822g f68281b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo67134a() {
        if (C7163a.m22363a() && this.f68281b.getCrossPlatformParams().f68476d.f68524s && ((Boolean) SharePrefCache.inst().getDebugWebBar().mo59877d()).booleanValue()) {
            ViewStub viewStub = (ViewStub) this.f68280a.findViewById(R.id.dh7);
            viewStub.inflate();
            this.f68280a.findViewById(R.id.sh).setOnLongClickListener(new C25819d(this, viewStub));
            EditText editText = (EditText) this.f68280a.findViewById(R.id.a6g);
            String str = "";
            try {
                str = URLDecoder.decode(this.f68281b.getCrossPlatformParams().f68473a.f68430c, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            editText.setText(str);
            this.f68280a.findViewById(R.id.sh).setOnClickListener(new C25820e(this, editText));
        }
    }

    C25818c(Activity activity, C25822g gVar) {
        this.f68280a = activity;
        this.f68281b = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67135a(EditText editText, View view) {
        if (editText.getText() != null) {
            C25833b.m84968c(this.f68280a, editText.getText().toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo67136a(ViewStub viewStub, View view) {
        viewStub.setVisibility(8);
        this.f68281b.getCrossPlatformParams().f68476d.f68524s = false;
        SharePrefCache.inst().getDebugWebBar().mo59871a(Boolean.valueOf(false));
        return true;
    }
}
