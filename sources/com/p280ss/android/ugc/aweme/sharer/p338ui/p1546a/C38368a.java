package com.p280ss.android.ugc.aweme.sharer.p338ui.p1546a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.BottomSheetDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a */
public final class C38368a {

    /* renamed from: a */
    public static final C38369a f99591a = new C38369a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a$a */
    public static final class C38369a {

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.a.a$a$a */
        public static final class C38370a extends C0343a {

            /* renamed from: a */
            final /* synthetic */ BottomSheetDialog f99592a;

            /* renamed from: b */
            final /* synthetic */ BottomSheetBehavior f99593b;

            /* renamed from: a */
            public final void mo1372a(View view, float f) {
                C7573i.m23587b(view, "bottomSheet");
            }

            C38370a(BottomSheetDialog bottomSheetDialog, BottomSheetBehavior bottomSheetBehavior) {
                this.f99592a = bottomSheetDialog;
                this.f99593b = bottomSheetBehavior;
            }

            /* renamed from: a */
            public final void mo1373a(View view, int i) {
                C7573i.m23587b(view, "bottomSheet");
                if (i == 5) {
                    this.f99592a.cancel();
                    this.f99593b.mo1357b(4);
                }
            }
        }

        private C38369a() {
        }

        public /* synthetic */ C38369a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        private static void m122558b(BottomSheetDialog bottomSheetDialog, View view) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m1365a((View) parent);
                if (a != null) {
                    Window window = bottomSheetDialog.getWindow();
                    if (window != null) {
                        LayoutParams attributes = window.getAttributes();
                        if (attributes != null) {
                            a.mo1352a(attributes.height);
                        }
                    }
                    return;
                }
                C7573i.m23582a((Object) a, "behavior");
                a.mo1357b(3);
                a.f1347m = new C38370a(bottomSheetDialog, a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        /* renamed from: a */
        public final void mo95946a(BottomSheetDialog bottomSheetDialog, View view) {
            C7573i.m23587b(bottomSheetDialog, "dialog");
            C7573i.m23587b(view, "rootView");
            Context context = bottomSheetDialog.getContext();
            Window window = bottomSheetDialog.getWindow();
            int b = C9738o.m28709b(context) - C9738o.m28717e(context);
            if (window != null) {
                if (b == 0) {
                    b = -1;
                }
                m122557a(window, -1, b);
                m122558b(bottomSheetDialog, view);
                window.setGravity(80);
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.findViewById(R.id.a7r).setBackgroundDrawable(new ColorDrawable(0));
                bottomSheetDialog.setCanceledOnTouchOutside(true);
            }
        }

        /* renamed from: a */
        private static void m122557a(Window window, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append("-");
            sb.append(Build.MODEL);
            CharSequence sb2 = sb.toString();
            if (TextUtils.equals("vivo-V1821A", sb2) || TextUtils.equals("vivo-V1821T", sb2)) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, i2);
            }
        }
    }
}
