package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.f */
public final class C39528f extends LinearLayout {

    /* renamed from: a */
    public static final C39529a f102592a = new C39529a(null);

    /* renamed from: b */
    private DmtTextView f102593b;

    /* renamed from: c */
    private RemoteImageView f102594c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.f$a */
    public static final class C39529a {
        private C39529a() {
        }

        public /* synthetic */ C39529a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C39528f m126252a(Context context, int i, int i2) {
            C7573i.m23587b(context, "context");
            C39528f fVar = new C39528f(context);
            fVar.setText(i);
            fVar.setIcon(i2);
            return fVar;
        }
    }

    /* renamed from: a */
    private final void m126251a() {
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.b2m, this);
            View findViewById = findViewById(R.id.rr);
            C7573i.m23582a((Object) findViewById, "this.findViewById(R.id.btn_tool_tv)");
            this.f102593b = (DmtTextView) findViewById;
            View findViewById2 = findViewById(R.id.rq);
            C7573i.m23582a((Object) findViewById2, "this.findViewById(R.id.btn_tool_iv)");
            this.f102594c = (RemoteImageView) findViewById2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public C39528f(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m126251a();
    }

    public final void setContentDescription(int i) {
        DmtTextView dmtTextView = this.f102593b;
        if (dmtTextView == null) {
            C7573i.m23583a("mToolTv");
        }
        dmtTextView.setContentDescription(getContext().getString(i));
    }

    public final void setIcon(int i) {
        RemoteImageView remoteImageView = this.f102594c;
        if (remoteImageView == null) {
            C7573i.m23583a("mToolIv");
        }
        remoteImageView.setImageDrawable(getResources().getDrawable(i));
    }

    public final void setText(int i) {
        DmtTextView dmtTextView = this.f102593b;
        if (dmtTextView == null) {
            C7573i.m23583a("mToolTv");
        }
        dmtTextView.setText(getContext().getString(i));
    }

    public final void setIcon(Drawable drawable) {
        C7573i.m23587b(drawable, "icon");
        RemoteImageView remoteImageView = this.f102594c;
        if (remoteImageView == null) {
            C7573i.m23583a("mToolIv");
        }
        remoteImageView.setImageDrawable(drawable);
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "text");
        DmtTextView dmtTextView = this.f102593b;
        if (dmtTextView == null) {
            C7573i.m23583a("mToolTv");
        }
        dmtTextView.setText(str);
    }
}
