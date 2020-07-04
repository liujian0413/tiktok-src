package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p1288h.C30221c.C30224c;
import com.p280ss.android.ugc.aweme.p1288h.C30221c.C30224c.C30225a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35580p;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.C40938a;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.recorder.C44442a;
import com.p280ss.android.ugc.gamora.recorder.C44462c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog */
public final class ChristmasCountDownDialog implements C0042h, C6310a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f107021a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChristmasCountDownDialog.class), "countDownLiveData", "getCountDownLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public final C41132a f107022b;

    /* renamed from: c */
    public VideoRecordNewActivity f107023c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f107024d = new ScheduledThreadPoolExecutor(1);

    /* renamed from: e */
    public final C6309f f107025e = new C6309f(this);

    /* renamed from: f */
    public Dialog f107026f;

    /* renamed from: g */
    public volatile long f107027g = 1;

    /* renamed from: h */
    public volatile boolean f107028h;

    /* renamed from: i */
    public String f107029i = "";

    /* renamed from: j */
    public String f107030j = "";

    /* renamed from: k */
    public String f107031k = "";

    /* renamed from: l */
    public String f107032l = "";

    /* renamed from: m */
    public String f107033m = "";

    /* renamed from: n */
    private final C7541d f107034n = C7546e.m23569a(C41133b.f107035a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$a */
    public interface C41132a {
        /* renamed from: a */
        void mo101600a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$b */
    static final class C41133b extends Lambda implements C7561a<C0052o<ArrayList<String>>> {

        /* renamed from: a */
        public static final C41133b f107035a = new C41133b();

        C41133b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<ArrayList<String>> m131325a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m131325a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$c */
    static final class C41134c<T> implements C0053p<ArrayList<String>> {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f107036a;

        /* renamed from: b */
        final /* synthetic */ DmtTextView f107037b;

        /* renamed from: c */
        final /* synthetic */ DmtTextView f107038c;

        C41134c(DmtTextView dmtTextView, DmtTextView dmtTextView2, DmtTextView dmtTextView3) {
            this.f107036a = dmtTextView;
            this.f107037b = dmtTextView2;
            this.f107038c = dmtTextView3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(ArrayList<String> arrayList) {
            if (arrayList != null && arrayList.size() == 3) {
                DmtTextView dmtTextView = this.f107036a;
                if (dmtTextView != null) {
                    dmtTextView.setText((CharSequence) arrayList.get(0));
                }
                DmtTextView dmtTextView2 = this.f107037b;
                if (dmtTextView2 != null) {
                    dmtTextView2.setText((CharSequence) arrayList.get(1));
                }
                DmtTextView dmtTextView3 = this.f107038c;
                if (dmtTextView3 != null) {
                    dmtTextView3.setText((CharSequence) arrayList.get(2));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$d */
    static final class C41135d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChristmasCountDownDialog f107039a;

        C41135d(ChristmasCountDownDialog christmasCountDownDialog) {
            this.f107039a = christmasCountDownDialog;
        }

        public final void run() {
            this.f107039a.mo101596a();
            if (this.f107039a.f107027g <= 0) {
                this.f107039a.f107025e.sendEmptyMessage(1);
            } else {
                this.f107039a.f107025e.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$e */
    static final class C41136e implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ChristmasCountDownDialog f107040a;

        C41136e(ChristmasCountDownDialog christmasCountDownDialog) {
            this.f107040a = christmasCountDownDialog;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f107040a.onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$f */
    public static final class C41137f extends C42939as {

        /* renamed from: a */
        final /* synthetic */ ChristmasCountDownDialog f107041a;

        C41137f(ChristmasCountDownDialog christmasCountDownDialog) {
            this.f107041a = christmasCountDownDialog;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            if (ChristmasCountDownDialog.m131317a(this.f107041a).isShowing()) {
                C41355e.m131921a(ChristmasCountDownDialog.m131317a(this.f107041a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ChristmasCountDownDialog$g */
    public static final class C41138g extends C42939as {

        /* renamed from: a */
        final /* synthetic */ ChristmasCountDownDialog f107042a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f107043b;

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            this.f107042a.f107022b.mo101600a(this.f107042a.f107029i);
            C6907h.m21524a("xmas_limited_activity_shoot", (Map) C22984d.m75611a().mo59973a("creation_id", this.f107043b.f99787w).mo59973a("enter_from", "video_shoot_page").mo59973a("shoot_way", this.f107043b.f99788x).mo59973a("shoot_category", "prop_limited").mo59973a("prop_id", this.f107042a.f107029i).mo59973a("gen", this.f107042a.f107033m).f60753a);
            if (ChristmasCountDownDialog.m131317a(this.f107042a).isShowing()) {
                C41356f.m131922a(ChristmasCountDownDialog.m131317a(this.f107042a));
            }
        }

        C41138g(ChristmasCountDownDialog christmasCountDownDialog, ShortVideoContext shortVideoContext) {
            this.f107042a = christmasCountDownDialog;
            this.f107043b = shortVideoContext;
        }
    }

    /* renamed from: c */
    private C0052o<ArrayList<String>> m131320c() {
        return (C0052o) this.f107034n.getValue();
    }

    /* renamed from: a */
    public final void mo101596a() {
        this.f107027g--;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.f107028h) {
            this.f107024d.shutdownNow();
            this.f107023c.getLifecycle().mo56b(this);
            this.f107028h = false;
        }
    }

    /* renamed from: b */
    public final boolean mo101598b() {
        String str;
        List<C44462c> a = C44442a.m140572a();
        if (C6307b.m19566a((Collection<T>) a)) {
            return false;
        }
        for (C44462c cVar : a) {
            if (cVar.f114729b == null) {
                return false;
            }
            if (cVar.f114729b.f113645e && (cVar.f114729b.f113643c.equals(C43119fc.m136748a(R.string.dcr)) || cVar.f114729b.f113643c.equals(C43119fc.m136748a(R.string.dcp)))) {
                return false;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C35580p pVar = C35563c.f93259v;
        C7573i.m23582a((Object) pVar, "AVEnv.BRIDGE_SERVICE");
        C30221c c = pVar.mo83154c();
        if (c == null) {
            return false;
        }
        C30224c cVar2 = c.f79526p;
        if (cVar2 == null || C6307b.m19566a((Collection<T>) cVar2.f79536c) || TextUtils.isEmpty(cVar2.f79535b) || TextUtils.isEmpty(cVar2.f79534a)) {
            return false;
        }
        String str2 = cVar2.f79534a;
        if (str2 == null) {
            C7573i.m23580a();
        }
        this.f107030j = str2;
        String str3 = cVar2.f79535b;
        if (str3 == null) {
            C7573i.m23580a();
        }
        this.f107031k = str3;
        List<C30225a> list = cVar2.f79536c;
        if (list != null) {
            for (C30225a aVar : list) {
                if (aVar != null) {
                    List<Long> list2 = aVar.f79537a;
                    if (list2 != null && !C6307b.m19566a((Collection<T>) list2) && list2.size() == 2) {
                        Object obj = list2.get(0);
                        C7573i.m23582a(obj, "timePeriods.get(0)");
                        if (currentTimeMillis > ((Number) obj).longValue()) {
                            Object obj2 = list2.get(1);
                            C7573i.m23582a(obj2, "timePeriods.get(1)");
                            if (currentTimeMillis < ((Number) obj2).longValue() && !TextUtils.isEmpty(aVar.f79539c) && !TextUtils.isEmpty(aVar.f79538b) && C40938a.m130780b(C7573i.m23577a(aVar.f79539c, (Object) list2.toString()))) {
                                String str4 = aVar.f79539c;
                                if (str4 == null) {
                                    C7573i.m23580a();
                                }
                                this.f107029i = str4;
                                String str5 = aVar.f79538b;
                                if (str5 == null) {
                                    C7573i.m23580a();
                                }
                                this.f107032l = str5;
                                this.f107027g = ((Number) list2.get(1)).longValue() - currentTimeMillis;
                                if (c.f79527q == 0) {
                                    str = "donation";
                                } else {
                                    str = "lottery";
                                }
                                this.f107033m = str;
                                C40938a.m130777a(C7573i.m23577a(aVar.f79539c, (Object) list2.toString()));
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ Dialog m131317a(ChristmasCountDownDialog christmasCountDownDialog) {
        Dialog dialog = christmasCountDownDialog.f107026f;
        if (dialog == null) {
            C7573i.m23583a("dialog");
        }
        return dialog;
    }

    /* renamed from: a */
    private ArrayList<String> m131318a(long j) {
        long j2;
        ArrayList<String> arrayList = new ArrayList<>();
        long j3 = 0;
        if (j > 60) {
            long j4 = j / 60;
            j %= 60;
            if (j4 > 60) {
                j3 = j4 / 60;
                j2 = j4 % 60;
            } else {
                j2 = j4;
            }
        } else {
            j2 = 0;
        }
        arrayList.add(m131319b(j3));
        arrayList.add(m131319b(j2));
        arrayList.add(m131319b(j));
        return arrayList;
    }

    /* renamed from: b */
    private static String m131319b(long j) {
        if (j < 10) {
            StringBuilder sb = new StringBuilder("0");
            sb.append(j);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        return sb2.toString();
    }

    public final void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
        if (message.what == 0) {
            m131320c().setValue(m131318a(this.f107027g));
            return;
        }
        onDestroy();
        Dialog dialog = this.f107026f;
        if (dialog == null) {
            C7573i.m23583a("dialog");
        }
        if (dialog.isShowing()) {
            Dialog dialog2 = this.f107026f;
            if (dialog2 == null) {
                C7573i.m23583a("dialog");
            }
            C41328d.m131900a(dialog2);
        }
    }

    /* renamed from: a */
    public final void mo101597a(ShortVideoContext shortVideoContext) {
        ShortVideoContext shortVideoContext2 = shortVideoContext;
        if (shortVideoContext2 != null) {
            Builder builder = new Builder(this.f107023c);
            View inflate = LayoutInflater.from(this.f107023c).inflate(R.layout.ls, null);
            builder.setView(inflate);
            try {
                AlertDialog create = builder.create();
                C7573i.m23582a((Object) create, "builder.create()");
                this.f107026f = create;
                Dialog dialog = this.f107026f;
                if (dialog == null) {
                    C7573i.m23583a("dialog");
                }
                dialog.show();
                Dialog dialog2 = this.f107026f;
                if (dialog2 == null) {
                    C7573i.m23583a("dialog");
                }
                Window window = dialog2.getWindow();
                if (window == null) {
                    C7573i.m23580a();
                }
                window.setBackgroundDrawableResource(17170445);
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.width = C9738o.m28691a((Context) this.f107023c) - (((int) C9738o.m28708b((Context) this.f107023c, 48.0f)) * 2);
                window.setDimAmount(0.0f);
                window.setAttributes(attributes);
                RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.aww);
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.app);
                Button button = (Button) inflate.findViewById(R.id.xk);
                DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.e4b);
                DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(R.id.dy4);
                View findViewById = inflate.findViewById(R.id.b0g);
                View findViewById2 = inflate.findViewById(R.id.b0h);
                DmtTextView dmtTextView3 = (DmtTextView) findViewById.findViewById(R.id.dyv);
                DmtTextView dmtTextView4 = (DmtTextView) findViewById2.findViewById(R.id.dyv);
                DmtTextView dmtTextView5 = (DmtTextView) inflate.findViewById(R.id.b0i).findViewById(R.id.dyv);
                C7573i.m23582a((Object) dmtTextView, "useTv");
                dmtTextView.setText(this.f107030j);
                C7573i.m23582a((Object) dmtTextView2, "msgTv");
                dmtTextView2.setText(this.f107031k);
                dmtTextView.setTypeface(dmtTextView.getTypeface(), 1);
                Drawable a = C38501ax.m123066a(0, -1, 1, (int) C9738o.m28708b((Context) this.f107023c, 6.0f));
                C7573i.m23582a((Object) relativeLayout, "parentView");
                relativeLayout.setBackground(a);
                C23323e.m76514a(remoteImageView, this.f107032l);
                m131320c().observe(this.f107023c, new C41134c(dmtTextView3, dmtTextView4, dmtTextView5));
                m131320c().setValue(m131318a(this.f107027g));
                this.f107028h = true;
                this.f107024d.scheduleAtFixedRate(new C41135d(this), 1000, 1000, TimeUnit.MILLISECONDS);
                this.f107023c.getLifecycle().mo55a(this);
                Dialog dialog3 = this.f107026f;
                if (dialog3 == null) {
                    C7573i.m23583a("dialog");
                }
                dialog3.setOnDismissListener(new C41136e(this));
                button.setOnClickListener(new C41137f(this));
                dmtTextView.setOnClickListener(new C41138g(this, shortVideoContext2));
                C6907h.m21524a("xmas_limited_activity_show", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext2.f99787w).mo59973a("enter_from", "video_shoot_page").mo59973a("shoot_way", shortVideoContext2.f99788x).mo59973a("shoot_category", "prop_limited").mo59973a("prop_id", this.f107029i).mo59973a("gen", this.f107033m).f60753a);
            } catch (Exception unused) {
            }
        }
    }

    public ChristmasCountDownDialog(VideoRecordNewActivity videoRecordNewActivity, C41132a aVar) {
        C7573i.m23587b(videoRecordNewActivity, "videoRecordNewActivity");
        C7573i.m23587b(aVar, "cb");
        this.f107023c = videoRecordNewActivity;
        this.f107022b = aVar;
    }
}
