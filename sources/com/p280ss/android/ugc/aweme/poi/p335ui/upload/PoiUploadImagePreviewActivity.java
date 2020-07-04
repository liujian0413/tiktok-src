package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.poi.model.C35125n;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity */
public final class PoiUploadImagePreviewActivity extends AmeBaseActivity implements OnClickListener, C35431e {

    /* renamed from: e */
    public static final C35422a f92918e = new C35422a(null);

    /* renamed from: a */
    public SparseArray<AvatarUri> f92919a;

    /* renamed from: b */
    public List<String> f92920b;

    /* renamed from: c */
    public AtomicInteger f92921c;

    /* renamed from: d */
    public AtomicInteger f92922d;

    /* renamed from: q */
    private PoiUploadImgPreviewAdapter f92923q;

    /* renamed from: r */
    private boolean f92924r = true;

    /* renamed from: s */
    private String f92925s;

    /* renamed from: t */
    private List<C6310a> f92926t;

    /* renamed from: u */
    private ArrayList<String> f92927u;

    /* renamed from: v */
    private C35427c f92928v;

    /* renamed from: w */
    private HashMap f92929w;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$a */
    public static final class C35422a {
        private C35422a() {
        }

        public /* synthetic */ C35422a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m114424a(String str, Activity activity, ArrayList<String> arrayList) {
            C7573i.m23587b(str, "poiId");
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(arrayList, "uriList");
            Intent intent = new Intent(activity, PoiUploadImagePreviewActivity.class);
            intent.putExtra("poi_id", str);
            intent.putExtra("upload_img_uri_list", arrayList);
            activity.startActivityForResult(intent, 17);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$b */
    public static final class C35423b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ PoiUploadImagePreviewActivity f92930a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C35423b(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity) {
            this.f92930a = poiUploadImagePreviewActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f92930a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$c */
    static final class C35424c implements C6310a {

        /* renamed from: a */
        final /* synthetic */ PoiUploadImagePreviewActivity f92931a;

        /* renamed from: b */
        final /* synthetic */ int f92932b;

        C35424c(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity, int i) {
            this.f92931a = poiUploadImagePreviewActivity;
            this.f92932b = i;
        }

        public final void handleMsg(Message message) {
            if (this.f92931a.f92919a != null && this.f92931a.f92922d != null && this.f92931a.f92921c != null && this.f92931a.f92920b != null) {
                if (message.obj instanceof ApiServerException) {
                    Context context = this.f92931a;
                    Object obj = message.obj;
                    if (obj != null) {
                        C10761a.m31403c(context, ((ApiServerException) obj).getErrorMsg()).mo25750a();
                        SparseArray<AvatarUri> sparseArray = this.f92931a.f92919a;
                        if (sparseArray != null) {
                            sparseArray.put(this.f92932b, new AvatarUri());
                        }
                        AtomicInteger atomicInteger = this.f92931a.f92922d;
                        if (atomicInteger != null) {
                            atomicInteger.incrementAndGet();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    }
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (C23477d.m77083b(avatarUri.urlList)) {
                            SparseArray<AvatarUri> sparseArray2 = this.f92931a.f92919a;
                            if (sparseArray2 == null) {
                                C7573i.m23580a();
                            }
                            sparseArray2.put(this.f92932b, avatarUri);
                            AtomicInteger atomicInteger2 = this.f92931a.f92921c;
                            if (atomicInteger2 == null) {
                                C7573i.m23580a();
                            }
                            atomicInteger2.incrementAndGet();
                        } else {
                            SparseArray<AvatarUri> sparseArray3 = this.f92931a.f92919a;
                            if (sparseArray3 == null) {
                                C7573i.m23580a();
                            }
                            sparseArray3.put(this.f92932b, new AvatarUri());
                            AtomicInteger atomicInteger3 = this.f92931a.f92922d;
                            if (atomicInteger3 == null) {
                                C7573i.m23580a();
                            }
                            atomicInteger3.incrementAndGet();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    }
                } else {
                    SparseArray<AvatarUri> sparseArray4 = this.f92931a.f92919a;
                    if (sparseArray4 == null) {
                        C7573i.m23580a();
                    }
                    sparseArray4.put(this.f92932b, new AvatarUri());
                    AtomicInteger atomicInteger4 = this.f92931a.f92922d;
                    if (atomicInteger4 == null) {
                        C7573i.m23580a();
                    }
                    atomicInteger4.incrementAndGet();
                }
                AtomicInteger atomicInteger5 = this.f92931a.f92922d;
                if (atomicInteger5 == null) {
                    C7573i.m23580a();
                }
                int i = atomicInteger5.get();
                AtomicInteger atomicInteger6 = this.f92931a.f92921c;
                if (atomicInteger6 == null) {
                    C7573i.m23580a();
                }
                int i2 = i + atomicInteger6.get();
                List<String> list = this.f92931a.f92920b;
                if (list != null && i2 == list.size()) {
                    AtomicInteger atomicInteger7 = this.f92931a.f92921c;
                    if (atomicInteger7 == null) {
                        C7573i.m23580a();
                    }
                    int i3 = atomicInteger7.get();
                    List<String> list2 = this.f92931a.f92920b;
                    if (list2 == null) {
                        C7573i.m23580a();
                    }
                    if (i3 == list2.size()) {
                        this.f92931a.mo58711c();
                        return;
                    }
                    this.f92931a.mo59893d();
                }
            }
        }
    }

    /* renamed from: b */
    private View m114411b(int i) {
        if (this.f92929w == null) {
            this.f92929w = new HashMap();
        }
        View view = (View) this.f92929w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92929w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.e0;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: m */
    private final void m114416m() {
        Context context = this;
        if (!C35426b.m114433a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            return;
        }
        if (this.f92920b != null) {
            m114417n();
        }
    }

    /* renamed from: j */
    private final void m114413j() {
        OnClickListener onClickListener = this;
        ((LinearLayout) m114411b(R.id.fj)).setOnClickListener(onClickListener);
        ((LinearLayout) m114411b(R.id.clp)).setOnClickListener(onClickListener);
        ((DmtTextView) m114411b(R.id.dd5)).setOnClickListener(onClickListener);
    }

    /* renamed from: l */
    private final void m114415l() {
        StringBuilder sb = new StringBuilder("https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/protocol/poi_pic.html?ts=");
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", false);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("use_webview_title", true);
        C35460p.m114545a((Context) this, sb2, bundle);
    }

    /* renamed from: d */
    public final void mo59893d() {
        ((DmtStatusView) m114411b(R.id.dav)).mo25939d();
        Toast toast = new Toast(C6399b.m19921a());
        toast.setView(LayoutInflater.from(this).inflate(R.layout.b3t, null));
        toast.setDuration(0);
        toast.setGravity(17, 0, 0);
        C35426b.m114432a(toast);
    }

    /* renamed from: i */
    private final void m114412i() {
        this.f92920b = getIntent().getStringArrayListExtra("upload_img_uri_list");
        String stringExtra = getIntent().getStringExtra("poi_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f92925s = stringExtra;
        List<String> list = this.f92920b;
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) m114411b(R.id.chn);
            C7573i.m23582a((Object) recyclerView, "poi_upload_img_recycler");
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f92923q = new PoiUploadImgPreviewAdapter(list);
            RecyclerView recyclerView2 = (RecyclerView) m114411b(R.id.chn);
            C7573i.m23582a((Object) recyclerView2, "poi_upload_img_recycler");
            recyclerView2.setAdapter(this.f92923q);
        }
        ((ImageView) m114411b(R.id.ax7)).setImageResource(R.drawable.af0);
    }

    /* renamed from: k */
    private final void m114414k() {
        int i;
        if (this.f92924r) {
            this.f92924r = false;
            PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter = this.f92923q;
            if (poiUploadImgPreviewAdapter != null) {
                poiUploadImgPreviewAdapter.f92933a = this.f92924r;
            }
            ((ImageView) m114411b(R.id.ax7)).setImageResource(R.drawable.af1);
        } else {
            this.f92924r = true;
            PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter2 = this.f92923q;
            if (poiUploadImgPreviewAdapter2 != null) {
                poiUploadImgPreviewAdapter2.f92933a = this.f92924r;
            }
            ((ImageView) m114411b(R.id.ax7)).setImageResource(R.drawable.af0);
        }
        PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter3 = this.f92923q;
        if (poiUploadImgPreviewAdapter3 != null) {
            PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter4 = this.f92923q;
            if (poiUploadImgPreviewAdapter4 != null) {
                i = poiUploadImgPreviewAdapter4.getItemCount();
            } else {
                i = 0;
            }
            poiUploadImgPreviewAdapter3.notifyItemRangeChanged(0, i, Boolean.valueOf(this.f92924r));
        }
    }

    /* renamed from: b */
    public final void mo58710b() {
        super.mo58710b();
        ((TextTitleBar) m114411b(R.id.djz)).setTitle((int) R.string.d18);
        ((TextTitleBar) m114411b(R.id.djz)).setOnTitleBarClickListener(new C35423b(this));
        ((DmtStatusView) m114411b(R.id.dav)).setBuilder(C10803a.m31631a((Context) this).mo25953a());
        m114412i();
        m114413j();
    }

    /* renamed from: n */
    private final void m114417n() {
        if (!C6307b.m19566a((Collection<T>) this.f92920b)) {
            ((DmtStatusView) m114411b(R.id.dav)).mo25942f();
            this.f92921c = new AtomicInteger(0);
            this.f92922d = new AtomicInteger(0);
            this.f92919a = new SparseArray<>();
            List<String> list = this.f92920b;
            if (list == null) {
                C7573i.m23580a();
            }
            m114410a(list.size());
            List<String> list2 = this.f92920b;
            if (list2 == null) {
                C7573i.m23580a();
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<String> list3 = this.f92920b;
                if (list3 == null) {
                    C7573i.m23580a();
                }
                String str = (String) list3.get(i);
                if (C6319n.m19593a(str)) {
                    SparseArray<AvatarUri> sparseArray = this.f92919a;
                    if (sparseArray == null) {
                        C7573i.m23580a();
                    }
                    sparseArray.put(i, new AvatarUri());
                    AtomicInteger atomicInteger = this.f92922d;
                    if (atomicInteger == null) {
                        C7573i.m23580a();
                    }
                    atomicInteger.incrementAndGet();
                } else if (!new File(str).exists()) {
                    SparseArray<AvatarUri> sparseArray2 = this.f92919a;
                    if (sparseArray2 == null) {
                        C7573i.m23580a();
                    }
                    sparseArray2.put(i, new AvatarUri());
                    AtomicInteger atomicInteger2 = this.f92922d;
                    if (atomicInteger2 == null) {
                        C7573i.m23580a();
                    }
                    atomicInteger2.incrementAndGet();
                } else {
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(C6399b.m19926b().f18690a);
                    sb.append("/aweme/v1/upload/image/");
                    String sb2 = sb.toString();
                    IAccountUserService f = C6861a.m21337f();
                    List<C6310a> list4 = this.f92926t;
                    if (list4 == null) {
                        C7573i.m23580a();
                    }
                    f.uploadAvatar(new C6309f((C6310a) list4.get(i)), sb2, 4194304, str, null);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo58711c() {
        String str;
        if (this.f92919a != null) {
            this.f92927u = new ArrayList<>();
            SparseArray<AvatarUri> sparseArray = this.f92919a;
            if (sparseArray == null) {
                C7573i.m23580a();
            }
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                SparseArray<AvatarUri> sparseArray2 = this.f92919a;
                if (sparseArray2 == null) {
                    C7573i.m23580a();
                }
                AvatarUri avatarUri = (AvatarUri) sparseArray2.valueAt(i);
                C7573i.m23582a((Object) avatarUri, "avatarUri");
                if (!TextUtils.isEmpty(avatarUri.uri)) {
                    ArrayList<String> arrayList = this.f92927u;
                    if (arrayList == null) {
                        C7573i.m23580a();
                    }
                    arrayList.add(avatarUri.uri);
                }
            }
            this.f92928v = new C35427c();
            C35427c cVar = this.f92928v;
            if (cVar == null) {
                C7573i.m23580a();
            }
            cVar.mo66537a(this);
            C35427c cVar2 = this.f92928v;
            if (cVar2 == null) {
                C7573i.m23580a();
            }
            cVar2.mo66536a(new C35425a());
            if (this.f92924r) {
                String string = getString(R.string.b_t);
                C7573i.m23582a((Object) string, "getString(R.string.friends_nickname)");
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                User curUser = f.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                str = C1642a.m8034a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                C7573i.m23582a((Object) str, "java.lang.String.format(format, *args)");
            } else {
                str = "";
            }
            ArrayList<String> arrayList2 = this.f92927u;
            if (arrayList2 == null) {
                C7573i.m23580a();
            }
            String a = C7525m.m23492a(arrayList2, ",", null, null, 0, null, null, 62, null);
            C35427c cVar3 = this.f92928v;
            if (cVar3 == null) {
                C7573i.m23580a();
            }
            cVar3.mo56976a(this.f92925s, a, str);
        }
    }

    /* renamed from: a */
    public final void mo90168a(Exception exc) {
        mo59893d();
    }

    /* renamed from: a */
    private final void m114410a(int i) {
        this.f92926t = new ArrayList();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C6310a cVar = new C35424c(this, i2);
                List<C6310a> list = this.f92926t;
                if (list == null) {
                    C7573i.m23580a();
                }
                list.add(cVar);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (C7573i.m23585a((Object) view, (Object) (LinearLayout) m114411b(R.id.fj))) {
            m114414k();
        } else if (C7573i.m23585a((Object) view, (Object) (LinearLayout) m114411b(R.id.clp))) {
            m114415l();
        } else {
            if (C7573i.m23585a((Object) view, (Object) (DmtTextView) m114411b(R.id.dd5))) {
                m114416m();
            }
        }
    }

    /* renamed from: a */
    public final void mo90167a(C35125n nVar) {
        C7573i.m23587b(nVar, "response");
        if (nVar.f91882a) {
            ((DmtStatusView) m114411b(R.id.dav)).mo25939d();
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.e3j).mo25750a();
            setResult(-1);
            finish();
            return;
        }
        mo59893d();
    }
}
