package com.p280ss.android.ugc.aweme.video.p1701e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.video.e.c */
public final class C43217c {

    /* renamed from: a */
    public ViewGroup f111879a;

    /* renamed from: b */
    public TableLayout f111880b;

    /* renamed from: c */
    private Context f111881c;

    /* renamed from: com.ss.android.ugc.aweme.video.e.c$a */
    static class C43219a {

        /* renamed from: a */
        public TextView f111882a;

        /* renamed from: b */
        public TextView f111883b;

        private C43219a() {
        }

        /* renamed from: a */
        public final void mo104897a(String str) {
            if (this.f111882a != null) {
                this.f111882a.setText(str);
            }
        }

        /* renamed from: b */
        public final void mo104898b(String str) {
            if (this.f111883b != null) {
                this.f111883b.setText(str);
            }
        }
    }

    public C43217c(Context context) {
        this(context, R.layout.akd);
    }

    /* renamed from: a */
    private static C43219a m137066a(View view) {
        C43219a aVar = (C43219a) view.getTag();
        if (aVar != null) {
            return aVar;
        }
        C43219a aVar2 = new C43219a();
        aVar2.f111882a = (TextView) view.findViewById(R.id.c33);
        aVar2.f111883b = (TextView) view.findViewById(R.id.e_l);
        view.setTag(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private View m137065a(String str, String str2) {
        return m137064a((int) R.layout.akf, str, str2);
    }

    private C43217c(Context context, int i) {
        this.f111881c = context;
        this.f111879a = (ViewGroup) LayoutInflater.from(this.f111881c).inflate(R.layout.akd, null);
        this.f111880b = (TableLayout) this.f111879a.findViewById(R.id.dfy);
    }

    /* renamed from: a */
    public final View mo104895a(int i, String str) {
        return m137065a(this.f111881c.getString(i), str);
    }

    /* renamed from: a */
    public final void mo104896a(View view, String str) {
        m137066a(view).mo104898b(str);
    }

    /* renamed from: a */
    private void m137067a(View view, String str, String str2) {
        C43219a a = m137066a(view);
        a.mo104897a(str);
        a.mo104898b(str2);
    }

    /* renamed from: a */
    private View m137064a(int i, String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f111881c).inflate(R.layout.akf, this.f111880b, false);
        m137067a((View) viewGroup, str, str2);
        this.f111880b.addView(viewGroup);
        return viewGroup;
    }
}
