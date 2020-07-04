package com.p280ss.android.ugc.aweme.sharer.p338ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.f */
public interface C38389f {

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.f$a */
    public static final class C38390a {
        /* renamed from: a */
        public static void m122628a(C38389f fVar, Context context) {
            C7573i.m23587b(context, "context");
        }

        /* renamed from: a */
        public static void m122629a(C38389f fVar, ImageView imageView) {
            C7573i.m23587b(imageView, "iconView");
        }

        /* renamed from: a */
        public static void m122630a(C38389f fVar, TextView textView) {
            C7573i.m23587b(textView, "textView");
            textView.setText(textView.getResources().getString(fVar.mo95716c()));
        }
    }

    /* renamed from: a */
    int mo95710a();

    /* renamed from: a */
    void mo95711a(Context context);

    /* renamed from: a */
    void mo95712a(Context context, SharePackage sharePackage);

    /* renamed from: a */
    void mo95713a(ImageView imageView);

    /* renamed from: a */
    void mo95714a(TextView textView);

    /* renamed from: b */
    String mo95715b();

    /* renamed from: c */
    int mo95716c();

    /* renamed from: d */
    boolean mo95717d();

    /* renamed from: e */
    boolean mo95718e();
}
