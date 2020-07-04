package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1642a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.i */
public final class C39537i {

    /* renamed from: a */
    public TextView f102612a;

    /* renamed from: a */
    public final void mo98397a(Context context, ViewGroup viewGroup, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        if (C7163a.m22363a() && C35563c.f93231M.mo93305a(Property.ShowVideoInfo)) {
            if (this.f102612a == null) {
                View findViewById = LayoutInflater.from(context).inflate(R.layout.gx, viewGroup).findViewById(R.id.eao);
                if (findViewById != null) {
                    this.f102612a = (TextView) findViewById;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            TextView textView = this.f102612a;
            if (textView == null) {
                C7573i.m23583a("infoView");
            }
            textView.bringToFront();
            textView.setVisibility(0);
            Locale locale = Locale.US;
            C7573i.m23582a((Object) locale, "Locale.US");
            String a = C1642a.m8035a(locale, "fps: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            textView.setText(a);
        }
    }
}
