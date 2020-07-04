package com.p280ss.android.ugc.aweme.sharer.p338ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38378b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareActionBar;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareChannelBar;
import com.p280ss.android.ugc.aweme.sharer.p338ui.p1546a.C38368a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.p1546a.C38368a.C38369a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog */
public class SkeletonShareDialog extends BottomSheetSharePanel {

    /* renamed from: d */
    public final Context f99581d;

    /* renamed from: e */
    public C38380c f99582e;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog$a */
    static final class C38360a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f99583a;

        /* renamed from: b */
        final /* synthetic */ SkeletonShareDialog f99584b;

        C38360a(C7561a aVar, SkeletonShareDialog skeletonShareDialog) {
            this.f99583a = aVar;
            this.f99584b = skeletonShareDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (((Boolean) this.f99583a.invoke()).booleanValue()) {
                ((ShareActionBar) this.f99584b.findViewById(R.id.d5f)).postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38360a f99585a;

                    {
                        this.f99585a = r1;
                    }

                    public final void run() {
                        ((ShareActionBar) this.f99585a.f99584b.findViewById(R.id.d5f)).mo95954b();
                    }
                }, 300);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog$b */
    public static final class C38362b implements C38378b {

        /* renamed from: a */
        final /* synthetic */ SkeletonShareDialog f99586a;

        C38362b(SkeletonShareDialog skeletonShareDialog) {
            this.f99586a = skeletonShareDialog;
        }

        /* renamed from: a */
        public final void mo95944a(C38389f fVar) {
            C7573i.m23587b(fVar, "action");
            if (!this.f99586a.f99582e.f99636i.mo18862a(fVar, this.f99586a.f99581d)) {
                fVar.mo95712a(this.f99586a.f99581d, this.f99586a.f99582e.f99636i);
            }
            C38386d dVar = this.f99586a.f99582e.f99639l;
            if (dVar != null) {
                dVar.mo67218a(fVar, this.f99586a.f99582e.f99636i, this.f99586a.f99581d);
            }
            if (fVar.mo95718e()) {
                this.f99586a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog$c */
    static final class C38363c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SkeletonShareDialog f99587a;

        C38363c(SkeletonShareDialog skeletonShareDialog) {
            this.f99587a = skeletonShareDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C38386d dVar = this.f99587a.f99582e.f99639l;
            if (dVar != null) {
                dVar.mo67219b(this.f99587a.f99582e.f99636i, this.f99587a.f99581d);
            }
            this.f99587a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog$d */
    static final class C38364d extends Lambda implements C7562b<C38343b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ SkeletonShareDialog f99588a;

        C38364d(SkeletonShareDialog skeletonShareDialog) {
            this.f99588a = skeletonShareDialog;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m122553a((C38343b) obj));
        }

        /* renamed from: a */
        private boolean m122553a(C38343b bVar) {
            C7573i.m23587b(bVar, "it");
            if (!bVar.mo95743a(this.f99588a.f99581d)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog$e */
    public static final class C38365e implements C38379c {

        /* renamed from: a */
        final /* synthetic */ SkeletonShareDialog f99589a;

        /* renamed from: b */
        final /* synthetic */ C38380c f99590b;

        /* renamed from: a */
        public final void mo63024a(C38343b bVar) {
            boolean z;
            C7573i.m23587b(bVar, "channel");
            if (!this.f99590b.f99636i.mo18861a(bVar, this.f99589a.f99581d)) {
                z = bVar.mo71406a(this.f99590b.f99636i.mo18860a(bVar), this.f99589a.f99581d);
            } else {
                z = true;
            }
            C38386d dVar = this.f99590b.f99639l;
            if (dVar != null) {
                dVar.mo67216a(bVar, z, this.f99590b.f99636i, this.f99589a.f99581d);
            }
            if (!bVar.mo95748g()) {
                this.f99589a.dismiss();
            }
        }

        C38365e(SkeletonShareDialog skeletonShareDialog, C38380c cVar) {
            this.f99589a = skeletonShareDialog;
            this.f99590b = cVar;
        }
    }

    /* renamed from: c */
    private final void mo95706c() {
        if (this.f99582e.f99638k != null) {
            ((FrameLayout) findViewById(R.id.d5r)).addView(this.f99582e.f99638k);
        }
    }

    /* renamed from: f */
    private final void m122550f() {
        ((DmtTextView) findViewById(R.id.d5h)).setOnClickListener(new C38363c(this));
    }

    public void dismiss() {
        super.dismiss();
        C38386d dVar = this.f99582e.f99639l;
        if (dVar != null) {
            dVar.mo67217a(this.f99582e.f99636i, this.f99581d);
        }
    }

    /* renamed from: d */
    private final void m122548d() {
        boolean z;
        Collection collection = this.f99582e.f99629b;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ShareActionBar shareActionBar = (ShareActionBar) findViewById(R.id.d5f);
            C7573i.m23582a((Object) shareActionBar, "share_panel_action_bar");
            shareActionBar.setVisibility(8);
            View findViewById = findViewById(R.id.d5c);
            C7573i.m23582a((Object) findViewById, "share_line");
            findViewById.setVisibility(8);
            return;
        }
        ((ShareActionBar) findViewById(R.id.d5f)).mo95953a(this.f99582e.f99629b);
        ((ShareActionBar) findViewById(R.id.d5f)).mo95952a((C38378b) new C38362b(this));
        C7561a<Boolean> aVar = this.f99582e.f99641n;
        if (aVar != null) {
            setOnShowListener(new C38360a(aVar, this));
        }
    }

    /* renamed from: e */
    private final void m122549e() {
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.d5q);
        C7573i.m23582a((Object) dmtTextView, "share_panel_title");
        dmtTextView.setText(this.f99581d.getResources().getText(this.f99582e.f99632e));
        ((DmtTextView) findViewById(R.id.d5q)).setTextColor(C0683b.m2912c(this.f99581d, this.f99582e.f99633f));
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.d5q);
        C7573i.m23582a((Object) dmtTextView2, "share_panel_title");
        dmtTextView2.setAlpha(this.f99582e.f99634g);
        DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.d5h);
        C7573i.m23582a((Object) dmtTextView3, "share_panel_cancel");
        dmtTextView3.setText(this.f99581d.getResources().getText(this.f99582e.f99635h));
    }

    /* renamed from: a */
    public final void mo95940a(C38380c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f99582e = cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.a56);
        C38369a aVar = C38368a.f99591a;
        BottomSheetDialog bottomSheetDialog = this;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.d5n);
        C7573i.m23582a((Object) linearLayout, "share_panel_root_layout");
        aVar.mo95946a(bottomSheetDialog, linearLayout);
        mo95706c();
        m122546b(this.f99582e);
        m122548d();
        m122549e();
        m122550f();
    }

    /* renamed from: b */
    private final void m122546b(C38380c cVar) {
        boolean z;
        if (cVar.f99631d) {
            C7525m.m23480a(cVar.f99628a, (C7562b<? super T, Boolean>) new C38364d<Object,Boolean>(this));
        }
        if (!cVar.f99630c) {
            Collection collection = cVar.f99628a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ((ShareChannelBar) findViewById(R.id.d5o)).mo95959a(cVar.f99628a);
                ((ShareChannelBar) findViewById(R.id.d5o)).mo95958a((C38379c) new C38365e(this, cVar));
                return;
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.d5k);
        C7573i.m23582a((Object) linearLayout, "share_panel_first_line_layout");
        linearLayout.setVisibility(8);
    }

    public SkeletonShareDialog(Context context, int i, C38380c cVar) {
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(cVar, "config");
        super(context, i);
        this.f99581d = context;
        this.f99582e = cVar;
    }
}
