package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C9730f;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.C21636a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a */
public final class C21605a extends C21635g {

    /* renamed from: a */
    public TextView f58012a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$a */
    static final class C21606a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C21605a f58013a;

        C21606a(C21605a aVar) {
            this.f58013a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58013a.f58068h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            return C9730f.m28665a(jSONObject, "description", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$b */
    static final class C21607b<TTaskResult, TContinuationResult> implements C1591g<String, Object> {

        /* renamed from: a */
        final /* synthetic */ C21605a f58014a;

        C21607b(C21605a aVar) {
            this.f58014a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<String> hVar) {
            if (C43173w.m136926a((C1592h) hVar)) {
                C7573i.m23582a((Object) hVar, "it");
                if (!TextUtils.isEmpty((CharSequence) hVar.mo6890e())) {
                    C21605a.m72367a(this.f58014a).setText((CharSequence) hVar.mo6890e());
                    return null;
                }
            }
            TextView a = C21605a.m72367a(this.f58014a);
            AppCompatActivity d = this.f58014a.mo57850d();
            if (d == null) {
                C7573i.m23580a();
            }
            a.setText(d.getString(R.string.ael));
            return null;
        }
    }

    /* renamed from: b */
    private final void m72368b() {
        if (this.f58068h != null) {
            C1592h.m7853a((Callable<TResult>) new C21606a<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C21607b<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final View mo57818a() {
        if (this.f58071k.getLayoutResource() <= 0) {
            this.f58071k.setLayoutResource(R.layout.abp);
        }
        View inflate = this.f58071k.inflate();
        View findViewById = inflate.findViewById(R.id.na);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.blocked_authenticator_text)");
        this.f58012a = (TextView) findViewById;
        m72368b();
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m72367a(C21605a aVar) {
        TextView textView = aVar.f58012a;
        if (textView == null) {
            C7573i.m23583a("errorText");
        }
        return textView;
    }

    public C21605a(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "stub");
        C7573i.m23587b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
