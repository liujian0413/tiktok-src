package com.bytedance.android.livesdk.commerce;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.live.core.widget.simple.C3423a;
import com.bytedance.android.live.core.widget.simple.C3424b;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.utils.V3Utils;
import com.bytedance.android.livesdk.utils.V3Utils.TYPE;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class LiveGoodsDialogFragment extends LiveDialogFragment {

    /* renamed from: d */
    public static final C5829a f17165d = new C5829a(null);

    /* renamed from: a */
    public long f17166a;

    /* renamed from: b */
    public long f17167b;

    /* renamed from: c */
    public TextView f17168c;

    /* renamed from: e */
    private RecyclerView f17169e;

    /* renamed from: f */
    private HashMap f17170f;

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$a */
    public static final class C5829a {
        private C5829a() {
        }

        public /* synthetic */ C5829a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$b */
    static final class C5830b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsDialogFragment f17171a;

        C5830b(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f17171a = liveGoodsDialogFragment;
        }

        public final void onClick(View view) {
            this.f17171a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$c */
    static final class C5831c<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsDialogFragment f17172a;

        C5831c(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f17172a = liveGoodsDialogFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num == null || C7573i.m23576a(num.intValue(), 0) <= 0) {
                TextView textView = this.f17172a.f17168c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                return;
            }
            TextView textView2 = this.f17172a.f17168c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f17172a.f17168c;
            if (textView3 != null) {
                textView3.setText(C3358ac.m12517a((int) R.string.f3n, num));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$d */
    static final class C5832d<T> implements C0053p<NetworkStat> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f17173a;

        C5832d(ObjectRef objectRef) {
            this.f17173a = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(NetworkStat networkStat) {
            if (networkStat != null) {
                if (networkStat == NetworkStat.f9752c) {
                    ((LoadingStatusView) this.f17173a.element).mo10830c();
                } else {
                    ((LoadingStatusView) this.f17173a.element).setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$e */
    public static final class C5833e extends C3423a<C5851e, Object> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsDialogFragment f17174a;

        /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$e$a */
        static final class C5834a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5833e f17175a;

            /* renamed from: b */
            final /* synthetic */ C5851e f17176b;

            C5834a(C5833e eVar, C5851e eVar2) {
                this.f17175a = eVar;
                this.f17176b = eVar2;
            }

            public final void onClick(View view) {
                V3Utils.m26945a(TYPE.CLICK, "", "").mo22223a("room_id", this.f17175a.f17174a.f17167b).mo22223a("anchor_id", this.f17175a.f17174a.f17166a).mo22224a("commodity_id", this.f17176b.f17219b).mo22225a("hotsoonlive_commodity_click");
                TTLiveSDKContext.getHostService().mo22365f().mo22047a((Context) this.f17175a.f17174a.getActivity(), this.f17176b.f17224g);
            }
        }

        /* renamed from: a */
        public final int mo10346a() {
            return R.layout.asj;
        }

        C5833e(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f17174a = liveGoodsDialogFragment;
        }

        /* renamed from: a */
        public final boolean mo10350a(Object obj) {
            return obj instanceof C5851e;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo10348a(SimpleViewHolder simpleViewHolder, C5851e eVar) {
            C7573i.m23587b(simpleViewHolder, "simpleViewHolder");
            C7573i.m23587b(eVar, "data");
            if (System.currentTimeMillis() - simpleViewHolder.mo10337a("start_time") > 100) {
                V3Utils.m26945a(TYPE.SHOW, "", "").mo22223a("room_id", this.f17174a.f17167b).mo22223a("anchor_id", this.f17174a.f17166a).mo22224a("commodity_id", eVar.f17219b).mo22225a("hotsoonlive_commodity_show");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo10349a(SimpleViewHolder simpleViewHolder, C5851e eVar, int i) {
            String str;
            C7573i.m23587b(simpleViewHolder, "simpleViewHolder");
            C7573i.m23587b(eVar, "data");
            simpleViewHolder.mo10341a((int) R.id.title, eVar.f17222e);
            simpleViewHolder.mo10341a((int) R.id.cjd, String.valueOf(eVar.f17221d / 100));
            if (!TextUtils.isEmpty(eVar.f17225h)) {
                simpleViewHolder.mo10341a((int) R.id.bwx, eVar.f17225h);
            } else {
                simpleViewHolder.mo10343b((int) R.id.bwx);
            }
            int i2 = eVar.f17221d % 100;
            StringBuilder sb = new StringBuilder();
            if (i2 > 10) {
                str = ClassUtils.PACKAGE_SEPARATOR;
            } else {
                str = ".0";
            }
            sb.append(str);
            sb.append(i2);
            simpleViewHolder.mo10341a((int) R.id.cje, sb.toString());
            simpleViewHolder.mo10341a((int) R.id.cxx, C3358ac.m12517a((int) R.string.f3p, Integer.valueOf(eVar.f17223f)));
            C3404s.m12659b((ImageView) simpleViewHolder.mo10338a((int) R.id.a4g), eVar.f17220c);
            simpleViewHolder.itemView.setOnClickListener(new C5834a(this, eVar));
            simpleViewHolder.mo10342a("start_time", (Object) Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$f */
    public static final class C5835f extends C3423a<C5852f, Object> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsViewModel f17177a;

        /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsDialogFragment$f$a */
        static final class C5836a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5835f f17178a;

            /* renamed from: b */
            final /* synthetic */ C5852f f17179b;

            C5836a(C5835f fVar, C5852f fVar2) {
                this.f17178a = fVar;
                this.f17179b = fVar2;
            }

            public final void onClick(View view) {
                this.f17178a.f17177a.mo14338a(this.f17179b);
            }
        }

        /* renamed from: a */
        public final int mo10346a() {
            return R.layout.ask;
        }

        C5835f(LiveGoodsViewModel liveGoodsViewModel) {
            this.f17177a = liveGoodsViewModel;
        }

        /* renamed from: a */
        public final boolean mo10350a(Object obj) {
            return obj instanceof C5852f;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo10349a(SimpleViewHolder simpleViewHolder, C5852f fVar, int i) {
            C7573i.m23587b(simpleViewHolder, "simpleViewHolder");
            C7573i.m23587b(fVar, "data");
            simpleViewHolder.mo10341a((int) R.id.text, fVar.f17227b);
            simpleViewHolder.mo10339a((int) R.id.a6z, (OnClickListener) new C5836a(this, fVar));
        }
    }

    /* renamed from: a */
    private void m18276a() {
        if (this.f17170f != null) {
            this.f17170f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m18276a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yh);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            dismiss();
            return;
        }
        this.f17166a = arguments.getLong("user_id");
        this.f17167b = arguments.getLong("room_id");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.x_).setOnClickListener(new C5830b(this));
        this.f17168c = (TextView) view.findViewById(R.id.a3d);
        ObjectRef objectRef = new ObjectRef();
        T findViewById = view.findViewById(R.id.dav);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.status_view)");
        objectRef.element = (LoadingStatusView) findViewById;
        this.f17169e = (RecyclerView) view.findViewById(R.id.bn1);
        RecyclerView recyclerView = this.f17169e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getActivity(), 1, false));
        }
        C0063u a = C0069x.m157a((Fragment) this).mo147a(LiveGoodsViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…odsViewModel::class.java)");
        LiveGoodsViewModel liveGoodsViewModel = (LiveGoodsViewModel) a;
        C0043i iVar = this;
        liveGoodsViewModel.f17181k.observe(iVar, new C5831c(this));
        liveGoodsViewModel.f9871c.observe(iVar, new C5832d(objectRef));
        liveGoodsViewModel.mo14337a(this.f17166a).mo10332a((C3424b<T>) new C5833e<T>(this)).mo10332a((C3424b<T>) new C5835f<T>(liveGoodsViewModel)).mo10331a(this.f17169e).mo10334d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.anr, viewGroup, false);
    }
}
