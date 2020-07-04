package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DeleteDialog */
public class DeleteDialog extends BottomSheetDialog {

    /* renamed from: b */
    public Aweme f75598b;

    /* renamed from: c */
    private String f75599c;

    /* renamed from: d */
    private Activity f75600d;

    /* renamed from: e */
    private C28343z<C28318an> f75601e;

    /* renamed from: f */
    private int f75602f;
    CoordinatorLayout mRootView;

    public void cancel() {
        dismiss();
    }

    /* renamed from: c */
    private void m94452c() {
        C10741a aVar = new C10741a(this.f75600d);
        aVar.mo25649a((int) R.string.anv);
        aVar.mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ans, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeleteDialog.this.mo73781a(2);
                DeleteDialog.this.dismiss();
            }
        }).mo25656a().mo25637a();
    }

    public void onClick(View view) {
        m94452c();
    }

    /* renamed from: a */
    private static int m94449a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    private static int m94450a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    private void m94451a(View view) {
        final BottomSheetBehavior a = BottomSheetBehavior.m1365a((View) view.getParent());
        if (a != null) {
            a.f1347m = new C0343a() {
                /* renamed from: a */
                public final void mo1372a(View view, float f) {
                }

                /* renamed from: a */
                public final void mo1373a(View view, int i) {
                    if (i == 5) {
                        DeleteDialog.this.dismiss();
                        a.mo1357b(4);
                    }
                }
            };
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.k2);
        ButterKnife.bind((Dialog) this);
        int a = m94449a(getOwnerActivity()) - m94450a(getContext());
        Window window = getWindow();
        if (window != null) {
            if (a == 0) {
                a = -1;
            }
            window.setLayout(-1, a);
            m94451a((View) this.mRootView);
            window.setGravity(80);
            LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
    }

    /* renamed from: a */
    public final void mo73781a(int i) {
        if (this.f75601e != null) {
            this.f75601e.mo64929a(new C28318an(2, this.f75598b));
        }
    }

    public DeleteDialog(Activity activity, C28343z<C28318an> zVar, String str, int i) {
        super(activity, R.style.t3);
        this.f75600d = activity;
        setOwnerActivity(activity);
        this.f75601e = zVar;
        this.f75599c = str;
        this.f75602f = i;
    }
}
