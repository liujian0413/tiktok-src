package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40733c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40751d;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment */
public final class VoteDetailFragment extends AmeBaseFragment implements C6905a, C25675c<User> {

    /* renamed from: g */
    public static final C40756a f105973g = new C40756a(null);

    /* renamed from: e */
    public C40751d f105974e;

    /* renamed from: f */
    public C40725g f105975f;

    /* renamed from: h */
    private VoteStruct f105976h;

    /* renamed from: i */
    private int f105977i;

    /* renamed from: j */
    private View f105978j;

    /* renamed from: k */
    private RecyclerView f105979k;

    /* renamed from: l */
    private DmtStatusView f105980l;

    /* renamed from: m */
    private VoteUserAdapter f105981m;

    /* renamed from: n */
    private HashMap f105982n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$a */
    public static final class C40756a {
        private C40756a() {
        }

        public /* synthetic */ C40756a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static VoteDetailFragment m130302a(int i, VoteStruct voteStruct) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_state", i);
            if (voteStruct != null) {
                bundle.putSerializable("key_vote", voteStruct);
            }
            VoteDetailFragment voteDetailFragment = new VoteDetailFragment();
            voteDetailFragment.setArguments(bundle);
            return voteDetailFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$b */
    static final class C40757b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VoteDetailFragment f105983a;

        C40757b(VoteDetailFragment voteDetailFragment) {
            this.f105983a = voteDetailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105983a.mo100987e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$c */
    static final class C40758c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VoteDetailFragment f105984a;

        /* renamed from: b */
        final /* synthetic */ C40733c f105985b;

        /* renamed from: c */
        final /* synthetic */ List f105986c;

        C40758c(VoteDetailFragment voteDetailFragment, C40733c cVar, List list) {
            this.f105984a = voteDetailFragment;
            this.f105985b = cVar;
            this.f105986c = list;
        }

        public final void run() {
            C40751d dVar = this.f105984a.f105974e;
            if (dVar != null) {
                dVar.mo100980a(this.f105985b);
            }
            this.f105984a.mo59099a(this.f105986c, this.f105985b.f105908b);
        }
    }

    /* renamed from: j */
    private void m130293j() {
        if (this.f105982n != null) {
            this.f105982n.clear();
        }
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m130293j();
    }

    /* renamed from: f */
    private final void m130291f() {
        if (!m130292g()) {
            mo100987e();
        }
    }

    public final void aD_() {
        if (isViewValid()) {
            VoteUserAdapter voteUserAdapter = this.f105981m;
            if (voteUserAdapter != null) {
                voteUserAdapter.ag_();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C40751d dVar = this.f105974e;
        if (dVar != null) {
            dVar.mo100978a();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f105980l;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.f105980l;
            if (dmtStatusView2 != null) {
                dmtStatusView2.mo25942f();
            }
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f105980l;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.f105980l;
            if (dmtStatusView2 != null) {
                dmtStatusView2.mo25943g();
            }
        }
    }

    public final void bd_() {
        if (this.f105976h == null) {
            ae_();
        }
        C40751d dVar = this.f105974e;
        if (dVar != null) {
            VoteStruct voteStruct = this.f105976h;
            if (voteStruct == null) {
                C7573i.m23580a();
            }
            long voteId = voteStruct.getVoteId();
            long j = 0;
            if (this.f105977i == 0) {
                VoteStruct voteStruct2 = this.f105976h;
                if (voteStruct2 == null) {
                    C7573i.m23580a();
                }
                List options = voteStruct2.getOptions();
                if (options != null) {
                    OptionsBean optionsBean = (OptionsBean) options.get(0);
                    if (optionsBean != null) {
                        j = optionsBean.getOptionId();
                    }
                }
            } else {
                VoteStruct voteStruct3 = this.f105976h;
                if (voteStruct3 == null) {
                    C7573i.m23580a();
                }
                List options2 = voteStruct3.getOptions();
                if (options2 != null) {
                    OptionsBean optionsBean2 = (OptionsBean) options2.get(1);
                    if (optionsBean2 != null) {
                        j = optionsBean2.getOptionId();
                    }
                }
            }
            dVar.mo100982b(voteId, j);
        }
    }

    /* renamed from: e */
    public final void mo100987e() {
        C40751d dVar = this.f105974e;
        if (dVar != null) {
            VoteStruct voteStruct = this.f105976h;
            if (voteStruct == null) {
                C7573i.m23580a();
            }
            long voteId = voteStruct.getVoteId();
            long j = 0;
            if (this.f105977i == 0) {
                VoteStruct voteStruct2 = this.f105976h;
                if (voteStruct2 == null) {
                    C7573i.m23580a();
                }
                List options = voteStruct2.getOptions();
                if (options != null) {
                    OptionsBean optionsBean = (OptionsBean) options.get(0);
                    if (optionsBean != null) {
                        j = optionsBean.getOptionId();
                    }
                }
            } else {
                VoteStruct voteStruct3 = this.f105976h;
                if (voteStruct3 == null) {
                    C7573i.m23580a();
                }
                List options2 = voteStruct3.getOptions();
                if (options2 != null) {
                    OptionsBean optionsBean2 = (OptionsBean) options2.get(1);
                    if (optionsBean2 != null) {
                        j = optionsBean2.getOptionId();
                    }
                }
            }
            dVar.mo100979a(voteId, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r3 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m130292g() {
        /*
            r5 = this;
            int r0 = r5.f105977i
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0038
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r5.f105975f
            if (r0 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.mo100905a()
            if (r0 == 0) goto L_0x0014
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f105909a
            if (r0 != 0) goto L_0x001b
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x001b:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r3 = r5.f105975f
            if (r3 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r3 = r3.mo100905a()
            if (r3 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r3 = r3.f105910b
            if (r3 != 0) goto L_0x002e
        L_0x0029:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c
            r3.<init>(r2, r2)
        L_0x002e:
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
            if (r4 == 0) goto L_0x006e
            return r2
        L_0x0038:
            int r0 = r5.f105977i
            if (r0 != r1) goto L_0x0080
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r5.f105975f
            if (r0 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.mo100905a()
            if (r0 == 0) goto L_0x004a
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f105911c
            if (r0 != 0) goto L_0x0051
        L_0x004a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0051:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r3 = r5.f105975f
            if (r3 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r3 = r3.mo100905a()
            if (r3 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r3 = r3.f105912d
            if (r3 != 0) goto L_0x0064
        L_0x005f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c
            r3.<init>(r2, r2)
        L_0x0064:
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
            if (r4 == 0) goto L_0x006e
            return r2
        L_0x006e:
            r5.mo59098S_()
            android.support.v7.widget.RecyclerView r2 = r5.f105979k
            if (r2 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$c r4 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$c
            r4.<init>(r5, r3, r0)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.post(r4)
        L_0x007f:
            return r1
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.m130292g():boolean");
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f105980l;
            if (dmtStatusView != null) {
                dmtStatusView.mo25944h();
            }
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            VoteUserAdapter voteUserAdapter = this.f105981m;
            if (voteUserAdapter != null) {
                voteUserAdapter.mo66507h();
            }
        }
    }

    /* renamed from: a */
    private final DmtTextView m130289a(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "context!!");
        dmtTextView.setTextColor(context.getResources().getColor(R.color.lb));
        dmtTextView.setText(i);
        dmtTextView.setTextSize(13.0f);
        return dmtTextView;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("key_state");
        } else {
            i = 0;
        }
        this.f105977i = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f105976h = (VoteStruct) serializable;
        this.f105974e = new C40751d(this, this.f105975f, this.f105977i);
    }

    /* renamed from: a */
    private final void m130290a(View view) {
        DmtStatusView dmtStatusView;
        RecyclerView recyclerView = null;
        if (view != null) {
            dmtStatusView = (DmtStatusView) view.findViewById(R.id.dav);
        } else {
            dmtStatusView = null;
        }
        this.f105980l = dmtStatusView;
        if (view != null) {
            recyclerView = (RecyclerView) view.findViewById(R.id.cqv);
        }
        this.f105979k = recyclerView;
        this.f105981m = new VoteUserAdapter();
        VoteUserAdapter voteUserAdapter = this.f105981m;
        if (voteUserAdapter != null) {
            voteUserAdapter.mo66504a((C6905a) this);
        }
        RecyclerView recyclerView2 = this.f105979k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f105981m);
        }
        RecyclerView recyclerView3 = this.f105979k;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        DmtStatusView dmtStatusView2 = this.f105980l;
        if (dmtStatusView2 != null) {
            C10803a a = C10803a.m31631a(dmtStatusView2.getContext());
            try {
                DmtTextView a2 = m130289a((int) R.string.c48);
                DmtTextView a3 = m130289a((int) R.string.fq5);
                a2.setOnClickListener(new C40757b(this));
                a.mo25963b((View) a3).mo25966c((View) a2);
            } catch (Exception unused) {
            }
            dmtStatusView2.setBuilder(a);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m130291f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59108b(java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r2.f105981m
            if (r0 == 0) goto L_0x000f
            r1 = 0
            r0.mo66516d(r1)
        L_0x000f:
            if (r4 != 0) goto L_0x0019
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r4 = r2.f105981m
            if (r4 == 0) goto L_0x0020
            r4.ah_()
            goto L_0x0020
        L_0x0019:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r4 = r2.f105981m
            if (r4 == 0) goto L_0x0020
            r4.ai_()
        L_0x0020:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r4 = r2.f105981m
            if (r4 == 0) goto L_0x002a
            java.util.List r4 = r4.mo62312a()
            if (r4 != 0) goto L_0x0031
        L_0x002a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
        L_0x0031:
            if (r3 == 0) goto L_0x0045
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.Collection r3 = (java.util.Collection) r3
            r4.addAll(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r3 = r2.f105981m
            if (r3 == 0) goto L_0x0045
            r3.mo61577b(r4)
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r3 = r2.f105981m
            if (r3 == 0) goto L_0x004e
            r4 = 1
            r3.mo66516d(r4)
            return
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.mo59108b(java.util.List, boolean):void");
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        if (isViewValid()) {
            if (!z) {
                VoteUserAdapter voteUserAdapter = this.f105981m;
                if (voteUserAdapter != null) {
                    voteUserAdapter.ah_();
                }
            } else {
                VoteUserAdapter voteUserAdapter2 = this.f105981m;
                if (voteUserAdapter2 != null) {
                    voteUserAdapter2.ai_();
                }
            }
            DmtStatusView dmtStatusView = this.f105980l;
            if (dmtStatusView != null) {
                dmtStatusView.mo25939d();
            }
            VoteUserAdapter voteUserAdapter3 = this.f105981m;
            if (voteUserAdapter3 != null) {
                voteUserAdapter3.mo58045a(list);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        this.f105978j = layoutInflater.inflate(R.layout.b50, viewGroup, false);
        m130290a(this.f105978j);
        return this.f105978j;
    }
}
