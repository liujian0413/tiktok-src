package com.p280ss.android.ugc.aweme.account.login.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.a */
public final class C22156a extends Dialog {

    /* renamed from: a */
    public C22157a f59195a;

    /* renamed from: b */
    public OnClickListener f59196b;

    /* renamed from: c */
    public OnClickListener f59197c;

    /* renamed from: d */
    public final C22158b f59198d;

    /* renamed from: e */
    private View f59199e;

    /* renamed from: f */
    private DmtTextView f59200f;

    /* renamed from: g */
    private AutoLinefeedTextView f59201g;

    /* renamed from: h */
    private DmtTextView f59202h;

    /* renamed from: i */
    private DmtTextView f59203i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$a */
    public interface C22157a {
        /* renamed from: a */
        void mo57660a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$b */
    public static final class C22158b {

        /* renamed from: a */
        public final String f59204a;

        /* renamed from: b */
        public final String f59205b;

        /* renamed from: c */
        public final String f59206c;

        /* renamed from: d */
        public final String f59207d;

        /* renamed from: e */
        public final String f59208e;

        /* renamed from: f */
        public final String f59209f;

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f59209f, (java.lang.Object) r3.f59209f) != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0047
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b
                if (r0 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.account.login.view.a$b r3 = (com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b) r3
                java.lang.String r0 = r2.f59204a
                java.lang.String r1 = r3.f59204a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59205b
                java.lang.String r1 = r3.f59205b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59206c
                java.lang.String r1 = r3.f59206c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59207d
                java.lang.String r1 = r3.f59207d
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59208e
                java.lang.String r1 = r3.f59208e
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59209f
                java.lang.String r3 = r3.f59209f
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r3 = 0
                return r3
            L_0x0047:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f59204a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f59205b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f59206c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f59207d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f59208e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f59209f;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(title=");
            sb.append(this.f59204a);
            sb.append(", desc=");
            sb.append(this.f59205b);
            sb.append(", firstItem=");
            sb.append(this.f59206c);
            sb.append(", secondItem=");
            sb.append(this.f59207d);
            sb.append(", enterType=");
            sb.append(this.f59208e);
            sb.append(", phoneNum=");
            sb.append(this.f59209f);
            sb.append(")");
            return sb.toString();
        }

        public C22158b(String str, String str2, String str3, String str4, String str5, String str6) {
            C7573i.m23587b(str, "title");
            C7573i.m23587b(str2, "desc");
            C7573i.m23587b(str3, "firstItem");
            C7573i.m23587b(str4, "secondItem");
            C7573i.m23587b(str5, "enterType");
            C7573i.m23587b(str6, "phoneNum");
            this.f59204a = str;
            this.f59205b = str2;
            this.f59206c = str3;
            this.f59207d = str4;
            this.f59208e = str5;
            this.f59209f = str6;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$c */
    static final class C22159c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22156a f59210a;

        C22159c(C22156a aVar) {
            this.f59210a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22157a aVar = this.f59210a.f59195a;
            if (aVar != null) {
                aVar.mo57660a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$d */
    static final class C22160d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22156a f59211a;

        C22160d(C22156a aVar) {
            this.f59211a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f59211a.f59196b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$e */
    static final class C22161e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22156a f59212a;

        C22161e(C22156a aVar) {
            this.f59212a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f59212a.f59197c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void show() {
        super.show();
        C6907h.m21524a("phone_verification_channel_alert", (Map) new C21102b().mo56946a("enter_type", this.f59198d.f59208e).f56672a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ajb);
        this.f59199e = findViewById(R.id.sp);
        this.f59200f = (DmtTextView) findViewById(R.id.e3f);
        this.f59201g = (AutoLinefeedTextView) findViewById(R.id.dt5);
        this.f59202h = (DmtTextView) findViewById(R.id.duk);
        this.f59203i = (DmtTextView) findViewById(R.id.e1i);
        DmtTextView dmtTextView = this.f59200f;
        if (dmtTextView != null) {
            dmtTextView.setText(this.f59198d.f59204a);
        }
        AutoLinefeedTextView autoLinefeedTextView = this.f59201g;
        if (autoLinefeedTextView != null) {
            autoLinefeedTextView.mo58473a(this.f59198d.f59205b, this.f59198d.f59209f);
        }
        DmtTextView dmtTextView2 = this.f59202h;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(this.f59198d.f59206c);
        }
        DmtTextView dmtTextView3 = this.f59203i;
        if (dmtTextView3 != null) {
            dmtTextView3.setText(this.f59198d.f59207d);
        }
        View view = this.f59199e;
        if (view != null) {
            view.setOnClickListener(new C22159c(this));
        }
        DmtTextView dmtTextView4 = this.f59202h;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnClickListener(new C22160d(this));
        }
        DmtTextView dmtTextView5 = this.f59203i;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnClickListener(new C22161e(this));
        }
        setCanceledOnTouchOutside(false);
    }

    public C22156a(Context context, C22158b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar, "param");
        super(context, R.style.uu);
        this.f59198d = bVar;
    }
}
