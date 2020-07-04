package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0371c;
import android.support.design.widget.TabLayout.C0376f;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.C40744a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialogFragment;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.views.ChallengeViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment */
public final class VoteBottomSheetDialogFragment extends ViewPagerBottomSheetDialogFragment {

    /* renamed from: d */
    public static final C40763a f105998d = new C40763a(null);

    /* renamed from: a */
    public ChallengeViewPager f105999a;

    /* renamed from: b */
    public C40764b f106000b;

    /* renamed from: c */
    public C40725g f106001c;

    /* renamed from: e */
    private View f106002e;

    /* renamed from: f */
    private TabLayout f106003f;

    /* renamed from: g */
    private VoteViewPagerAdapter f106004g;

    /* renamed from: h */
    private DmtTextView f106005h;

    /* renamed from: i */
    private ImageView f106006i;

    /* renamed from: j */
    private VoteStruct f106007j;

    /* renamed from: k */
    private HashMap f106008k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$a */
    public static final class C40763a {
        private C40763a() {
        }

        public /* synthetic */ C40763a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static VoteBottomSheetDialogFragment m130307a(VoteStruct voteStruct) {
            int i;
            if (voteStruct != null) {
                List options = voteStruct.getOptions();
                if (options != null) {
                    i = options.size();
                } else {
                    i = 0;
                }
                if (i >= 2) {
                    VoteBottomSheetDialogFragment voteBottomSheetDialogFragment = new VoteBottomSheetDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_vote", voteStruct);
                    voteBottomSheetDialogFragment.setArguments(bundle);
                    return voteBottomSheetDialogFragment;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$b */
    public interface C40764b {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$c */
    static final class C40765c implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ VoteBottomSheetDialogFragment f106009a;

        C40765c(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f106009a = voteBottomSheetDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C40744a.m130260a((ViewPager) this.f106009a.f105999a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$d */
    static final class C40766d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VoteBottomSheetDialogFragment f106010a;

        C40766d(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f106010a = voteBottomSheetDialogFragment;
        }

        public final void run() {
            this.f106010a.mo101005a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$e */
    static final class C40767e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VoteBottomSheetDialogFragment f106011a;

        C40767e(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f106011a = voteBottomSheetDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106011a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$f */
    public static final class C40768f implements C0371c {
        C40768f() {
        }

        /* renamed from: a */
        public final void mo1669a(C0376f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1539f;
            } else {
                view = null;
            }
            C40796i iVar = (C40796i) view;
            if (iVar != null) {
                iVar.setSelect(true);
            }
        }

        /* renamed from: b */
        public final void mo1670b(C0376f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1539f;
            } else {
                view = null;
            }
            C40796i iVar = (C40796i) view;
            if (iVar != null) {
                iVar.setSelect(false);
            }
        }
    }

    /* renamed from: b */
    private void m130305b() {
        if (this.f106008k != null) {
            this.f106008k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m130305b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        if (r4 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101005a() {
        /*
            r10 = this;
            android.content.Context r0 = r10.getContext()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.views.ChallengeViewPager r1 = r10.f105999a
            android.support.v4.view.ViewPager r1 = (android.support.p022v4.view.ViewPager) r1
            r0.setupWithViewPager(r1)
        L_0x0012:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i
            android.content.Context r1 = r10.getContext()
            r2 = 1
            r0.<init>(r1, r2)
            android.widget.TableLayout$LayoutParams r1 = new android.widget.TableLayout$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.setLayoutParams(r1)
            r1 = 0
            r0.setPadding(r1, r1, r1, r1)
            android.support.design.widget.TabLayout r4 = r10.f106003f
            if (r4 != 0) goto L_0x0032
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0032:
            android.support.design.widget.TabLayout$f r4 = r4.getTabAt(r1)
            if (r4 == 0) goto L_0x003d
            android.view.View r0 = (android.view.View) r0
            r4.mo1687a(r0)
        L_0x003d:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i
            android.content.Context r4 = r10.getContext()
            r0.<init>(r4, r1)
            android.widget.TableLayout$LayoutParams r4 = new android.widget.TableLayout$LayoutParams
            r4.<init>(r3, r3)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r0.setLayoutParams(r4)
            r0.setPadding(r1, r1, r1, r1)
            android.support.design.widget.TabLayout r3 = r10.f106003f
            if (r3 != 0) goto L_0x005a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005a:
            android.support.design.widget.TabLayout$f r3 = r3.getTabAt(r2)
            if (r3 == 0) goto L_0x0065
            android.view.View r0 = (android.view.View) r0
            r3.mo1687a(r0)
        L_0x0065:
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 != 0) goto L_0x006c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$f r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$f
            r3.<init>()
            android.support.design.widget.TabLayout$b r3 = (android.support.design.widget.TabLayout.C0370b) r3
            r0.addOnTabSelectedListener(r3)
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 != 0) goto L_0x007d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007d:
            android.support.design.widget.TabLayout$f r0 = r0.getTabAt(r1)
            r3 = 0
            if (r0 == 0) goto L_0x0087
            android.view.View r0 = r0.f1539f
            goto L_0x0088
        L_0x0087:
            r0 = r3
        L_0x0088:
            if (r0 == 0) goto L_0x013c
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40796i) r0
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r10.f106007j
            if (r4 == 0) goto L_0x00a4
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r4.get(r1)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = r4.getOptionText()
            if (r4 != 0) goto L_0x00a6
        L_0x00a4:
            java.lang.String r4 = ""
        L_0x00a6:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r10.f106007j
            r6 = 0
            if (r5 == 0) goto L_0x00bf
            java.util.List r5 = r5.getOptions()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r5.get(r1)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x00bf
            long r8 = r5.getVoteCount()
            goto L_0x00c0
        L_0x00bf:
            r8 = r6
        L_0x00c0:
            r0.mo101061a(r4, r8)
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 != 0) goto L_0x00ca
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00ca:
            android.support.design.widget.TabLayout$f r0 = r0.getTabAt(r2)
            if (r0 == 0) goto L_0x00d3
            android.view.View r0 = r0.f1539f
            goto L_0x00d4
        L_0x00d3:
            r0 = r3
        L_0x00d4:
            if (r0 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40796i) r0
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r10.f106007j
            if (r4 == 0) goto L_0x00f0
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = r4.getOptionText()
            if (r4 != 0) goto L_0x00f2
        L_0x00f0:
            java.lang.String r4 = ""
        L_0x00f2:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r10.f106007j
            if (r5 == 0) goto L_0x0108
            java.util.List r5 = r5.getOptions()
            if (r5 == 0) goto L_0x0108
            java.lang.Object r5 = r5.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x0108
            long r6 = r5.getVoteCount()
        L_0x0108:
            r0.mo101061a(r4, r6)
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 != 0) goto L_0x0112
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0112:
            android.support.design.widget.TabLayout$f r0 = r0.getTabAt(r2)
            if (r0 == 0) goto L_0x011a
            android.view.View r3 = r0.f1539f
        L_0x011a:
            if (r3 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r3 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40796i) r3
            r3.setSelect(r1)
            android.support.design.widget.TabLayout r0 = r10.f106003f
            if (r0 != 0) goto L_0x0128
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0128:
            r0.setSelectedTabIndicatorHeight(r1)
            return
        L_0x012c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
            r0.<init>(r1)
            throw r0
        L_0x0134:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
            r0.<init>(r1)
            throw r0
        L_0x013c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.mo101005a():void");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.g5);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f106007j = (VoteStruct) serializable;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnShowListener(new C40765c(this));
        return onCreateDialog;
    }

    public final void show(C0608j jVar, String str) {
        C7573i.m23587b(jVar, "manager");
        C7573i.m23587b(str, "tag");
        try {
            super.show(jVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "inflater"
            kotlin.jvm.internal.C7573i.m23587b(r5, r7)
            r7 = 0
            r0 = 2131495439(0x7f0c0a0f, float:1.8614415E38)
            android.view.View r5 = r5.inflate(r0, r6, r7)
            java.lang.String r6 = "inflater.inflate(R.layou…dialog, container, false)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            r4.f106002e = r5
            android.view.View r5 = r4.f106002e
            if (r5 != 0) goto L_0x001d
            java.lang.String r6 = "rootView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x001d:
            r6 = 2131301975(0x7f091657, float:1.8222023E38)
            android.view.View r5 = r5.findViewById(r6)
            android.support.design.widget.TabLayout r5 = (android.support.design.widget.TabLayout) r5
            r4.f106003f = r5
            android.view.View r5 = r4.f106002e
            if (r5 != 0) goto L_0x0031
            java.lang.String r6 = "rootView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x0031:
            r6 = 2131303265(0x7f091b61, float:1.822464E38)
            android.view.View r5 = r5.findViewById(r6)
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = (com.p280ss.android.ugc.aweme.views.ChallengeViewPager) r5
            r4.f105999a = r5
            android.view.View r5 = r4.f106002e
            if (r5 != 0) goto L_0x0045
            java.lang.String r6 = "rootView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x0045:
            r6 = 2131302118(0x7f0916e6, float:1.8222313E38)
            android.view.View r5 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5
            r4.f106005h = r5
            android.view.View r5 = r4.f106002e
            if (r5 != 0) goto L_0x0059
            java.lang.String r6 = "rootView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x0059:
            r6 = 2131298888(0x7f090a48, float:1.8215762E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f106006i = r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter
            android.support.v4.app.j r6 = r4.getChildFragmentManager()
            java.lang.String r0 = "childFragmentManager"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)
            r5.<init>(r6)
            r4.f106004g = r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r5 = r4.f106004g
            if (r5 != 0) goto L_0x007b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007b:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f105846a
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r4.f106007j
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r6 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.C40756a.m130302a(r7, r6)
            r5.add(r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r5 = r4.f106004g
            if (r5 != 0) goto L_0x008d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x008d:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f105846a
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r4.f106007j
            r0 = 1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r6 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.C40756a.m130302a(r0, r6)
            r5.add(r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r5 = r4.f106004g
            if (r5 != 0) goto L_0x00a0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a0:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f105846a
            java.lang.Object r5 = r5.get(r7)
            if (r5 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r5 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r6 = r4.f106001c
            r5.f105975f = r6
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r5 = r4.f106004g
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b5:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f105846a
            java.lang.Object r5 = r5.get(r0)
            if (r5 == 0) goto L_0x015b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r5 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r6 = r4.f106001c
            r5.f105975f = r6
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = r4.f105999a
            if (r5 == 0) goto L_0x00ca
            r5.setPagingEnable(r7)
        L_0x00ca:
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = r4.f105999a
            if (r5 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r6 = r4.f106004g
            android.support.v4.view.PagerAdapter r6 = (android.support.p022v4.view.PagerAdapter) r6
            r5.setAdapter(r6)
        L_0x00d5:
            android.support.design.widget.TabLayout r5 = r4.f106003f
            if (r5 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$d r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$d
            r6.<init>(r4)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.post(r6)
        L_0x00e3:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r4.f106007j
            r1 = 0
            if (r5 == 0) goto L_0x00fc
            java.util.List r5 = r5.getOptions()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r5.get(r7)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x00fc
            long r5 = r5.getVoteCount()
            goto L_0x00fd
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r4.f106007j
            if (r3 == 0) goto L_0x0113
            java.util.List r3 = r3.getOptions()
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r3.get(r0)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            if (r3 == 0) goto L_0x0113
            long r1 = r3.getVoteCount()
        L_0x0113:
            r3 = 0
            long r5 = r5 + r1
            java.lang.String r5 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f106005h
            if (r6 == 0) goto L_0x0143
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131829447(0x7f1122c7, float:1.9291863E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "resources.getString(R.string.vote_total)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r7] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r5 = com.C1642a.m8034a(r1, r5)
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
        L_0x0143:
            android.widget.ImageView r5 = r4.f106006i
            if (r5 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$e r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$e
            r6.<init>(r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
        L_0x0151:
            android.view.View r5 = r4.f106002e
            if (r5 != 0) goto L_0x015a
            java.lang.String r6 = "rootView"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x015a:
            return r5
        L_0x015b:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r5.<init>(r6)
            throw r5
        L_0x0163:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
