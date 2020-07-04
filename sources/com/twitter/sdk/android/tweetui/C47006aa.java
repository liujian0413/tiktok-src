package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.twitter.sdk.android.core.C46827f;
import com.twitter.sdk.android.core.models.C46959o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.twitter.sdk.android.tweetui.aa */
final class C47006aa implements OnClickListener {

    /* renamed from: a */
    final C46959o f120628a;

    /* renamed from: b */
    final C47029aq f120629b;

    /* renamed from: c */
    final C47023al f120630c;

    /* renamed from: a */
    private void m146969a() {
        this.f120630c.mo118227a(this.f120628a);
    }

    public final void onClick(View view) {
        m146970a(view.getContext(), view.getResources());
    }

    /* renamed from: b */
    private String m146972b(Resources resources) {
        return resources.getString(R.string.fh0, new Object[]{this.f120628a.f120422D.name, this.f120628a.f120422D.screenName});
    }

    /* renamed from: a */
    private String m146968a(Resources resources) {
        return resources.getString(R.string.fgz, new Object[]{this.f120628a.f120422D.screenName, Long.toString(this.f120628a.f120435i)});
    }

    /* renamed from: a */
    private static void m146971a(Intent intent, Context context) {
        C46827f.m146486b(context, intent);
    }

    C47006aa(C46959o oVar, C47029aq aqVar) {
        this(oVar, aqVar, new C47024am(aqVar));
    }

    /* renamed from: a */
    private static Intent m146967a(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        return intent;
    }

    /* renamed from: a */
    private void m146970a(Context context, Resources resources) {
        if (this.f120628a != null && this.f120628a.f120422D != null) {
            m146969a();
            m146971a(Intent.createChooser(m146967a(m146972b(resources), m146968a(resources)), resources.getString(R.string.fh1)), context);
        }
    }

    private C47006aa(C46959o oVar, C47029aq aqVar, C47023al alVar) {
        this.f120628a = oVar;
        this.f120629b = aqVar;
        this.f120630c = alVar;
    }
}
