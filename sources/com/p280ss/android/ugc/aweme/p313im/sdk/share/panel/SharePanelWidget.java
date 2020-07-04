package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27525a;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27526b;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27527c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.ImShareSoftAndMiniEmojiExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.Widget;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31055x;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C31806a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C31814b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C7056c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.C31823a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31807a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31813h;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.adapter.SharePanelHeadAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.model.FakeMoreIMContact;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel.C31845a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31859ae;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImShareDialog;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.SpecificHorizontalSpaceItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1352a.C32019b;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32021a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget */
public final class SharePanelWidget extends Widget implements C31806a, C31845a {

    /* renamed from: e */
    public static final C31825a f83253e = new C31825a(null);

    /* renamed from: b */
    public DmtEditText f83254b;

    /* renamed from: c */
    public final C32021a f83255c;

    /* renamed from: d */
    public final C32019b f83256d;

    /* renamed from: f */
    private final Context f83257f = this.f83255c.f83735e;

    /* renamed from: g */
    private SharePanelViewModel f83258g;

    /* renamed from: h */
    private RecyclerView f83259h;

    /* renamed from: i */
    private SharePanelHeadAdapter f83260i;

    /* renamed from: j */
    private View f83261j;

    /* renamed from: k */
    private RemoteImageView f83262k;

    /* renamed from: l */
    private DmtTextView f83263l;

    /* renamed from: m */
    private C31814b f83264m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$a */
    public static final class C31825a {
        private C31825a() {
        }

        public /* synthetic */ C31825a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$b */
    static final class C31826b extends Lambda implements C7562b<Conversation, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f83265a;

        C31826b(SharePanelWidget sharePanelWidget) {
            this.f83265a = sharePanelWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m103297a((Conversation) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103297a(Conversation conversation) {
            if (conversation != null) {
                IMContact a = C6959c.m21648a(conversation);
                if (a != null) {
                    this.f83265a.mo82643a(C7525m.m23466c(a));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$c */
    static final class C31827c implements C6943d {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f83266a;

        /* renamed from: b */
        final /* synthetic */ List f83267b;

        C31827c(SharePanelWidget sharePanelWidget, List list) {
            this.f83266a = sharePanelWidget;
            this.f83267b = list;
        }

        public final void sendMsg() {
            boolean z;
            String str;
            C31858ad.m103406a();
            C31858ad.m103407a(this.f83267b.size());
            C31813h.f83230a.mo82626a(this.f83266a.f83255c.f83736f, this.f83267b);
            KeyboardUtils.m77057c(SharePanelWidget.m103277a(this.f83266a));
            C32019b bVar = this.f83266a.f83256d;
            SharePackage sharePackage = this.f83266a.f83255c.f83736f;
            if (this.f83267b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo80290a(sharePackage, z);
            List list = this.f83267b;
            Editable text = SharePanelWidget.m103277a(this.f83266a).getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            C7052b.m21958a(list, str, this.f83266a.f83255c.f83736f, (BaseContent) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$d */
    public static final class C31828d implements C27525a {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f83268a;

        C31828d(SharePanelWidget sharePanelWidget) {
            this.f83268a = sharePanelWidget;
        }

        /* renamed from: a */
        public final void mo70744a(String str) {
            C31858ad.m103417a(this.f83268a.f83255c.f83736f);
            SharePanelWidget.m103277a(this.f83268a).requestFocus();
            KeyboardUtils.m77055a(SharePanelWidget.m103277a(this.f83268a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$e */
    static final class C31829e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f83269a;

        C31829e(SharePanelWidget sharePanelWidget) {
            this.f83269a = sharePanelWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f83269a.mo82649d();
        }
    }

    /* renamed from: c */
    public final View mo82648c() {
        View view = this.f83261j;
        if (view == null) {
            C7573i.m23583a("editLayout");
        }
        return view;
    }

    /* renamed from: a */
    public final List<IMContact> mo82641a() {
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        return C7525m.m23509d((Collection<? extends T>) sharePanelViewModel.mo82667a());
    }

    /* renamed from: e */
    private final void m103280e() {
        this.f83258g = new SharePanelViewModel(this.f83255c.f83736f);
        Lifecycle lifecycle = getLifecycle();
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        lifecycle.mo55a(sharePanelViewModel);
        SharePanelViewModel sharePanelViewModel2 = this.f83258g;
        if (sharePanelViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        sharePanelViewModel2.f83303b = this;
    }

    /* renamed from: h */
    private final void m103283h() {
        LayoutInflater.from(this.f83257f).inflate(R.layout.a96, this.f83255c.f83733c, true);
        View findViewById = this.f83255c.f83733c.findViewById(R.id.d2s);
        C7573i.m23582a((Object) findViewById, "payload.sendContainer.findViewById(R.id.send)");
        this.f83263l = (DmtTextView) findViewById;
        DmtTextView dmtTextView = this.f83263l;
        if (dmtTextView == null) {
            C7573i.m23583a("sendTv");
        }
        dmtTextView.setOnClickListener(new C31829e(this));
    }

    /* renamed from: b */
    public final void mo82645b() {
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        sharePanelViewModel.mo82667a().clear();
        SharePanelHeadAdapter sharePanelHeadAdapter = this.f83260i;
        if (sharePanelHeadAdapter == null) {
            C7573i.m23583a("headAdapter");
        }
        sharePanelHeadAdapter.notifyDataSetChanged();
        RecyclerView recyclerView = this.f83259h;
        if (recyclerView == null) {
            C7573i.m23583a("headRecyclerView");
        }
        recyclerView.mo5541b(0);
        m103284i();
        m103285j();
    }

    /* renamed from: i */
    private final void m103284i() {
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        if (sharePanelViewModel.mo82667a().isEmpty()) {
            View view = this.f83261j;
            if (view == null) {
                C7573i.m23583a("editLayout");
            }
            view.setVisibility(8);
            DmtEditText dmtEditText = this.f83254b;
            if (dmtEditText == null) {
                C7573i.m23583a("editText");
            }
            KeyboardUtils.m77057c(dmtEditText);
            return;
        }
        View view2 = this.f83261j;
        if (view2 == null) {
            C7573i.m23583a("editLayout");
        }
        view2.setVisibility(0);
        RemoteImageView remoteImageView = this.f83262k;
        if (remoteImageView == null) {
            C7573i.m23583a("shareCover");
        }
        ImShareDialog.m103855a(remoteImageView, this.f83255c.f83736f);
        SharePackage sharePackage = this.f83255c.f83736f;
        View view3 = this.f83261j;
        if (view3 == null) {
            C7573i.m23583a("editLayout");
        }
        C31830a.m103299a(sharePackage, view3);
    }

    /* renamed from: j */
    private final void m103285j() {
        int i;
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        if (sharePanelViewModel.mo82667a().isEmpty()) {
            DmtTextView dmtTextView = this.f83263l;
            if (dmtTextView == null) {
                C7573i.m23583a("sendTv");
            }
            dmtTextView.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView2 = this.f83263l;
        if (dmtTextView2 == null) {
            C7573i.m23583a("sendTv");
        }
        dmtTextView2.setVisibility(0);
        DmtTextView dmtTextView3 = this.f83263l;
        if (dmtTextView3 == null) {
            C7573i.m23583a("sendTv");
        }
        SharePanelViewModel sharePanelViewModel2 = this.f83258g;
        if (sharePanelViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        if (sharePanelViewModel2.mo82667a().size() == 1) {
            i = R.string.bp9;
        } else {
            C31814b bVar = this.f83264m;
            if (bVar == null || !bVar.f83233a) {
                i = R.string.a2k;
            } else {
                i = R.string.a2h;
            }
        }
        dmtTextView3.setText(i);
    }

    /* renamed from: k */
    private final void m103286k() {
        boolean z;
        this.f83256d.mo80292a("chat_merge", this.f83255c.f83736f);
        if (!this.f83255c.f83734d) {
            this.f83255c.f83736f.f20186l.putString("enter_method", "more");
            Bundle bundle = new Bundle();
            bundle.putParcelable("share_package", this.f83255c.f83736f);
            SharePanelViewModel sharePanelViewModel = this.f83258g;
            if (sharePanelViewModel == null) {
                C7573i.m23583a("viewModel");
            }
            if (sharePanelViewModel.mo82667a().size() > 0) {
                String str = "key_selected_contact";
                SharePanelViewModel sharePanelViewModel2 = this.f83258g;
                if (sharePanelViewModel2 == null) {
                    C7573i.m23583a("viewModel");
                }
                bundle.putSerializable(str, new LinkedHashSet(sharePanelViewModel2.mo82667a()));
                bundle.putInt("key_select_mode", 3);
            }
            String str2 = "key_share_create_group_select";
            C31814b bVar = this.f83264m;
            if (bVar != null) {
                z = bVar.f83233a;
            } else {
                z = false;
            }
            bundle.putBoolean(str2, z);
            RelationSelectActivity.m21881a(this.f83257f, bundle, null);
        }
    }

    /* renamed from: d */
    public final void mo82649d() {
        int i;
        if (!this.f83256d.mo80294a(this.f83255c.f83736f)) {
            C6921a.m21555a("SharePanelWidget cancel share by callback");
            return;
        }
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        List d = C7525m.m23509d((Collection<? extends T>) sharePanelViewModel.mo82667a());
        if (d.isEmpty()) {
            C10761a.m31399c(this.f83257f, (int) R.string.a2i).mo25750a();
            return;
        }
        DmtEditText dmtEditText = this.f83254b;
        if (dmtEditText == null) {
            C7573i.m23583a("editText");
        }
        Editable text = dmtEditText.getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        if (i > C31863ai.m103525a()) {
            C10761a.m31399c(this.f83257f, (int) R.string.bmn).mo25750a();
            return;
        }
        C31814b bVar = this.f83264m;
        if (bVar != null) {
            if (!bVar.f83233a) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo82627a(d, (C7562b<? super Conversation, C7581n>) new C31826b<Object,C7581n>(this));
                return;
            }
        }
        mo82643a(d);
    }

    /* renamed from: f */
    private final void m103281f() {
        SharePanelHeadLayout sharePanelHeadLayout = new SharePanelHeadLayout(this.f83257f, null, 0, 6, null);
        sharePanelHeadLayout.setWidget(this);
        this.f83255c.f83731a.addView(sharePanelHeadLayout);
        View findViewById = sharePanelHeadLayout.findViewById(R.id.cqb);
        C7573i.m23582a((Object) findViewById, "headLayout.findViewById(R.id.recycle_view)");
        this.f83259h = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f83259h;
        if (recyclerView == null) {
            C7573i.m23583a("headRecyclerView");
        }
        recyclerView.mo5525a((C1272h) new SpecificHorizontalSpaceItemDecoration(C23486n.m77122a(12.0d), C23486n.m77122a(6.0d), C23486n.m77122a(26.0d)));
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        this.f83260i = new SharePanelHeadAdapter(sharePanelViewModel);
        RecyclerView recyclerView2 = this.f83259h;
        if (recyclerView2 == null) {
            C7573i.m23583a("headRecyclerView");
        }
        SharePanelHeadAdapter sharePanelHeadAdapter = this.f83260i;
        if (sharePanelHeadAdapter == null) {
            C7573i.m23583a("headAdapter");
        }
        recyclerView2.setAdapter(sharePanelHeadAdapter);
        RecyclerView recyclerView3 = this.f83259h;
        if (recyclerView3 == null) {
            C7573i.m23583a("headRecyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f83257f, 0, false));
    }

    /* renamed from: g */
    private final void m103282g() {
        LayoutInflater.from(this.f83257f).inflate(R.layout.a95, this.f83255c.f83732b, true);
        ViewGroup viewGroup = this.f83255c.f83732b;
        View findViewById = viewGroup.findViewById(R.id.c0n);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.multi_share_rv)");
        this.f83261j = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.c0m);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.multi_share_et)");
        this.f83254b = (DmtEditText) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.c0l);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.multi_share_cover)");
        this.f83262k = (RemoteImageView) findViewById3;
        DmtEditText dmtEditText = this.f83254b;
        if (dmtEditText == null) {
            C7573i.m23583a("editText");
        }
        dmtEditText.setFilters(new InputFilter[]{new C31055x(C31863ai.m103525a())});
        if (C6399b.m19945u()) {
            IIMService iIMService = IMService.get();
            if (iIMService != null) {
                C7093b abInterface = iIMService.getAbInterface();
                if (abInterface != null && abInterface.mo18356d()) {
                    View findViewById4 = this.f83255c.f83732b.findViewById(R.id.bh3);
                    C7573i.m23582a((Object) findViewById4, "payload.editContainer.fi…R.id.layout_create_group)");
                    ViewGroup viewGroup2 = (ViewGroup) findViewById4;
                    View findViewById5 = this.f83255c.f83732b.findViewById(R.id.b85);
                    C7573i.m23582a((Object) findViewById5, "payload.editContainer.fi…yId(R.id.iv_create_group)");
                    C31814b bVar = new C31814b(new C31823a(viewGroup2, (ImageView) findViewById5, true), this, false, 4, null);
                    this.f83264m = bVar;
                }
            }
        }
        if (ImShareSoftAndMiniEmojiExperiment.INSTANCE.showMiniEmojiPanel()) {
            ViewGroup viewGroup3 = (ViewGroup) this.f83255c.f83732b.findViewById(R.id.bie);
            C31828d dVar = new C31828d(this);
            C7573i.m23582a((Object) viewGroup3, "emojiLayout");
            DmtEditText dmtEditText2 = this.f83254b;
            if (dmtEditText2 == null) {
                C7573i.m23583a("editText");
            }
            C27526b bVar2 = new C27526b(viewGroup3, dmtEditText2, C31863ai.m103525a(), this.f83257f.getResources().getString(R.string.bjt), dVar);
            new C27527c(bVar2).mo70749b();
        }
    }

    /* renamed from: a */
    public final void mo82536a(boolean z) {
        m103285j();
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtEditText m103277a(SharePanelWidget sharePanelWidget) {
        DmtEditText dmtEditText = sharePanelWidget.f83254b;
        if (dmtEditText == null) {
            C7573i.m23583a("editText");
        }
        return dmtEditText;
    }

    /* renamed from: b */
    public final void mo82646b(List<IMContact> list) {
        C7573i.m23587b(list, "list");
        m103279c(list);
    }

    /* renamed from: a */
    public final void mo82642a(SharePackage sharePackage) {
        C7573i.m23587b(sharePackage, "sharePackage");
        this.f83255c.mo82989a(sharePackage);
        m103284i();
    }

    /* renamed from: c */
    private final void m103279c(List<IMContact> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7056c.m21976b(false);
            this.f83255c.f83731a.setVisibility(8);
            return;
        }
        C7056c.m21976b(true);
        SharePanelHeadAdapter sharePanelHeadAdapter = this.f83260i;
        if (sharePanelHeadAdapter == null) {
            C7573i.m23583a("headAdapter");
        }
        sharePanelHeadAdapter.mo82651a(list);
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f != null) {
            f.logIMShareHeadShow();
        }
    }

    /* renamed from: a */
    public final void mo82643a(List<IMContact> list) {
        C31858ad.m103406a();
        String str = null;
        C31858ad.m103418a(this.f83255c.f83736f, (BaseContent) null, list.size());
        SharePackage sharePackage = this.f83255c.f83736f;
        DmtEditText dmtEditText = this.f83254b;
        if (dmtEditText == null) {
            C7573i.m23583a("editText");
        }
        Editable text = dmtEditText.getText();
        if (text != null) {
            str = text.toString();
        }
        C31859ae.m103519a(sharePackage, str, list);
        new C6928b(this.f83257f, new C31827c(this, list)).sendMsg();
    }

    /* renamed from: b */
    public final void mo82647b(boolean z) {
        if (!z && ImShareSoftAndMiniEmojiExperiment.INSTANCE.showSoftInputWhenClickAvatar()) {
            DmtEditText dmtEditText = this.f83254b;
            if (dmtEditText == null) {
                C7573i.m23583a("editText");
            }
            dmtEditText.requestFocus();
            DmtEditText dmtEditText2 = this.f83254b;
            if (dmtEditText2 == null) {
                C7573i.m23583a("editText");
            }
            KeyboardUtils.m77055a(dmtEditText2);
        }
    }

    public SharePanelWidget(C32021a aVar, C32019b bVar) {
        C7573i.m23587b(aVar, "payload");
        C7573i.m23587b(bVar, "callback");
        this.f83255c = aVar;
        this.f83256d = bVar;
        C7056c.m21975a(true);
        create();
        m103280e();
        m103281f();
        m103283h();
        m103282g();
        SharePanelViewModel sharePanelViewModel = this.f83258g;
        if (sharePanelViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        sharePanelViewModel.mo82669b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m103278b(com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r5, boolean r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            java.lang.String r1 = "AwemeImManager.instance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.im.service.model.c r0 = r0.getIMSetting()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.f83740c
            goto L_0x001a
        L_0x0018:
            r0 = 10
        L_0x001a:
            r1 = 1
            if (r6 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r6 = r4.f83258g
            if (r6 != 0) goto L_0x0026
            java.lang.String r2 = "viewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0026:
            java.util.Set r6 = r6.mo82667a()
            int r6 = r6.size()
            if (r6 < r0) goto L_0x0067
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r6 = r4.f83258g
            if (r6 != 0) goto L_0x0039
            java.lang.String r2 = "viewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0039:
            java.util.Set r6 = r6.mo82667a()
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x0067
            com.ss.android.ugc.aweme.im.sdk.share.b r5 = r4.f83264m
            if (r5 == 0) goto L_0x004b
            r5 = 2131823944(0x7f110d48, float:1.9280702E38)
            goto L_0x004e
        L_0x004b:
            r5 = 2131823945(0x7f110d49, float:1.9280704E38)
        L_0x004e:
            android.content.Context r6 = r4.f83257f
            android.content.Context r2 = r4.f83257f
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r1[r3] = r0
            java.lang.String r5 = r2.getString(r5, r1)
            com.bytedance.ies.dmt.ui.c.a r5 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r6, r5)
            r5.mo25750a()
            return r3
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.SharePanelWidget.m103278b(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    /* renamed from: a */
    public final boolean mo82644a(IMContact iMContact, boolean z) {
        SharePanelWidget sharePanelWidget;
        C7573i.m23587b(iMContact, "contact");
        if (iMContact instanceof FakeMoreIMContact) {
            sharePanelWidget = this;
        } else {
            sharePanelWidget = null;
        }
        if (sharePanelWidget != null) {
            m103286k();
            return false;
        }
        C31807a.f83208c.mo18256a();
        if (!m103278b(iMContact, z)) {
            return false;
        }
        if (z) {
            C31858ad.m103406a().mo82716a(this.f83255c.f83736f, iMContact, false);
            SharePanelViewModel sharePanelViewModel = this.f83258g;
            if (sharePanelViewModel == null) {
                C7573i.m23583a("viewModel");
            }
            sharePanelViewModel.mo82667a().add(iMContact);
            this.f83256d.mo80292a("chat_mergeIM", this.f83255c.f83736f);
        } else {
            SharePanelViewModel sharePanelViewModel2 = this.f83258g;
            if (sharePanelViewModel2 == null) {
                C7573i.m23583a("viewModel");
            }
            sharePanelViewModel2.mo82667a().remove(iMContact);
        }
        C31814b bVar = this.f83264m;
        if (bVar != null) {
            SharePanelViewModel sharePanelViewModel3 = this.f83258g;
            if (sharePanelViewModel3 == null) {
                C7573i.m23583a("viewModel");
            }
            bVar.mo82629a(C7525m.m23523m(sharePanelViewModel3.mo82667a()));
        }
        this.f83256d.mo80289a(iMContact, z);
        m103284i();
        m103285j();
        return true;
    }
}
