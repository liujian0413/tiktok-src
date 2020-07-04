package com.p280ss.android.ugc.aweme.proaccount;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomePageFragment */
public final class ProWelcomePageFragment extends AmeBaseFragment {

    /* renamed from: e */
    public static final int[] f93359e = {R.string.fs1, R.string.fs3};

    /* renamed from: f */
    public static final int[] f93360f = {R.string.fs0, R.string.fs2};

    /* renamed from: g */
    public static final int[] f93361g = {R.drawable.b88, R.drawable.b89};

    /* renamed from: h */
    public static final C35638a f93362h = new C35638a(null);

    /* renamed from: i */
    private RemoteImageView f93363i;

    /* renamed from: j */
    private DmtTextView f93364j;

    /* renamed from: k */
    private DmtTextView f93365k;

    /* renamed from: l */
    private ConstraintLayout f93366l;

    /* renamed from: m */
    private int f93367m;

    /* renamed from: n */
    private HashMap f93368n;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomePageFragment$a */
    public static final class C35638a {
        private C35638a() {
        }

        public /* synthetic */ C35638a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProWelcomePageFragment m115130a(int i, boolean z) {
            ProWelcomePageFragment proWelcomePageFragment = new ProWelcomePageFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(IWalletMainProxy.KEY_PAGE_INDEX, i);
            bundle.putBoolean("page_default", true);
            proWelcomePageFragment.setArguments(bundle);
            return proWelcomePageFragment;
        }

        /* renamed from: a */
        public static ProWelcomePageFragment m115131a(String str, String str2, String str3, int i, boolean z) {
            C7573i.m23587b(str, "imgUrl");
            C7573i.m23587b(str2, "title");
            C7573i.m23587b(str3, "desc");
            ProWelcomePageFragment proWelcomePageFragment = new ProWelcomePageFragment();
            Bundle bundle = new Bundle();
            bundle.putString("image_url", str);
            bundle.putString("title_text", str2);
            bundle.putString("desc_text", str3);
            bundle.putInt(IWalletMainProxy.KEY_PAGE_INDEX, i);
            bundle.putBoolean("page_default", false);
            proWelcomePageFragment.setArguments(bundle);
            return proWelcomePageFragment;
        }
    }

    /* renamed from: a */
    private void m115129a() {
        if (this.f93368n != null) {
            this.f93368n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m115129a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r6 = "inflater"
            kotlin.jvm.internal.C7573i.m23587b(r4, r6)
            r6 = 0
            r0 = 2131493496(0x7f0c0278, float:1.8610474E38)
            android.view.View r4 = r4.inflate(r0, r5, r6)
            r5 = 2131303377(0x7f091bd1, float:1.8224867E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_im)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r5
            r3.f93363i = r5
            r5 = 2131303382(0x7f091bd6, float:1.8224877E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_tv_title)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5
            r3.f93364j = r5
            r5 = 2131303381(0x7f091bd5, float:1.8224875E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_tv_desc)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5
            r3.f93365k = r5
            r5 = 2131303376(0x7f091bd0, float:1.8224865E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_bg)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            android.support.constraint.ConstraintLayout r5 = (android.support.constraint.ConstraintLayout) r5
            r3.f93366l = r5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f93364j
            if (r5 != 0) goto L_0x0056
            java.lang.String r0 = "mTitle"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0056:
            java.lang.String r0 = com.bytedance.ies.dmt.p262ui.widget.util.C10834d.f29332b
            r5.setFontType(r0)
            android.content.Context r5 = r3.getContext()
            int r5 = com.p280ss.android.ttve.utils.C20505c.m68012b(r5)
            android.content.Context r0 = r3.getContext()
            int r0 = com.p280ss.android.ttve.utils.C20505c.m68014c(r0)
            int r5 = r5 - r0
            android.content.Context r0 = r3.getContext()
            r1 = 1142931456(0x441fc000, float:639.0)
            float r0 = com.p280ss.android.ttve.utils.C20505c.m68010a(r0, r1)
            int r0 = (int) r0
            int r5 = r5 - r0
            r0 = 2
            if (r5 <= 0) goto L_0x00a4
            android.content.Context r5 = r3.getContext()
            int r5 = com.p280ss.android.ttve.utils.C20505c.m68012b(r5)
            android.content.Context r2 = r3.getContext()
            int r2 = com.p280ss.android.ttve.utils.C20505c.m68014c(r2)
            int r5 = r5 - r2
            android.content.Context r2 = r3.getContext()
            float r1 = com.p280ss.android.ttve.utils.C20505c.m68010a(r2, r1)
            int r1 = (int) r1
            int r5 = r5 - r1
            int r5 = r5 / r0
            android.support.constraint.ConstraintLayout r1 = r3.f93366l
            if (r1 != 0) goto L_0x00a1
            java.lang.String r2 = "mContainer"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00a1:
            r1.setPadding(r6, r5, r6, r5)
        L_0x00a4:
            android.os.Bundle r5 = r3.getArguments()
            if (r5 == 0) goto L_0x018e
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x00b3
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b3:
            java.lang.String r6 = "page_default"
            boolean r5 = r5.getBoolean(r6)
            android.os.Bundle r6 = r3.getArguments()
            if (r6 != 0) goto L_0x00c2
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00c2:
            java.lang.String r1 = "page_index"
            int r6 = r6.getInt(r1)
            r3.f93367m = r6
            if (r5 == 0) goto L_0x012e
            int r5 = r3.f93367m
            if (r5 >= r0) goto L_0x012e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f93363i
            if (r5 != 0) goto L_0x00d9
            java.lang.String r6 = "mImageView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x00d9:
            int[] r6 = f93361g
            int r0 = r3.f93367m
            r6 = r6[r0]
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f93364j
            if (r5 != 0) goto L_0x00eb
            java.lang.String r6 = "mTitle"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x00eb:
            android.content.Context r6 = r3.getContext()
            r0 = 0
            if (r6 == 0) goto L_0x0103
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0103
            int[] r1 = f93359e
            int r2 = r3.f93367m
            r1 = r1[r2]
            java.lang.String r6 = r6.getString(r1)
            goto L_0x0104
        L_0x0103:
            r6 = r0
        L_0x0104:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f93365k
            if (r5 != 0) goto L_0x0112
            java.lang.String r6 = "mDesc"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x0112:
            android.content.Context r6 = r3.getContext()
            if (r6 == 0) goto L_0x0128
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0128
            int[] r0 = f93360f
            int r1 = r3.f93367m
            r0 = r0[r1]
            java.lang.String r0 = r6.getString(r0)
        L_0x0128:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            goto L_0x018e
        L_0x012e:
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x0137
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0137:
            java.lang.String r6 = "image_url"
            java.lang.String r0 = ""
            java.lang.String r5 = r5.getString(r6, r0)
            java.lang.String r6 = "arguments!!.getString(IMAGE_URL, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.f93363i
            if (r6 != 0) goto L_0x014d
            java.lang.String r0 = "mImageView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x014d:
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r6, r5)
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x0159
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0159:
            java.lang.String r6 = "title_text"
            java.lang.String r0 = ""
            java.lang.String r5 = r5.getString(r6, r0)
            android.os.Bundle r6 = r3.getArguments()
            if (r6 != 0) goto L_0x016a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x016a:
            java.lang.String r0 = "desc_text"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.f93364j
            if (r0 != 0) goto L_0x017b
            java.lang.String r1 = "mTitle"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x017b:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f93365k
            if (r5 != 0) goto L_0x0189
            java.lang.String r0 = "mDesc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0189:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.proaccount.ProWelcomePageFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
