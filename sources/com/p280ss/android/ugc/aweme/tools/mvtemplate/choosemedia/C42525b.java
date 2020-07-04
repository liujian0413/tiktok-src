package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39694c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40129c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42536a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.p280ss.android.vesdk.VEMVAlgorithmConfig.AlgorithmInfo;
import com.p280ss.android.vesdk.VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b */
public final class C42525b implements C40129c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f110575a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42525b.class), "api", "getApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/choosemedia/AfrApi;"))};

    /* renamed from: b */
    public C41654d f110576b;

    /* renamed from: c */
    public boolean f110577c;

    /* renamed from: d */
    public String f110578d;

    /* renamed from: e */
    public C7321c f110579e;

    /* renamed from: f */
    public final Map<String, String> f110580f = new LinkedHashMap();

    /* renamed from: g */
    public final Map<String, String> f110581g = new LinkedHashMap();

    /* renamed from: h */
    public final Map<String, List<Pair<String, String>>> f110582h = new LinkedHashMap();

    /* renamed from: i */
    public final FragmentActivity f110583i;

    /* renamed from: j */
    private MvThemeData f110584j;

    /* renamed from: k */
    private AVETParameter f110585k;

    /* renamed from: l */
    private ShortVideoContext f110586l;

    /* renamed from: m */
    private AVChallenge f110587m;

    /* renamed from: n */
    private final C7541d f110588n = C7546e.m23569a(C42526a.f110589a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$a */
    static final class C42526a extends Lambda implements C7561a<AfrApi> {

        /* renamed from: a */
        public static final C42526a f110589a = new C42526a();

        C42526a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m135156a();
        }

        /* renamed from: a */
        private static AfrApi m135156a() {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
            Object obj = EffectPlatform.f72451c.get(0);
            C7573i.m23582a(obj, "EffectPlatform.HOST[0]");
            return (AfrApi) iRetrofitFactory.createBuilder(((Host) obj).getItemName()).mo26430a().mo26435a(AfrApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$b */
    static final class C42527b<T, R> implements C7327h<Object[], R> {

        /* renamed from: a */
        public static final C42527b f110590a = new C42527b();

        C42527b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m135157a((Object[]) obj);
        }

        /* renamed from: a */
        private static List<AfrResponse> m135157a(Object[] objArr) {
            C7573i.m23587b(objArr, "response");
            List<AfrResponse> arrayList = new ArrayList<>();
            for (AfrApiResponse afrApiResponse : objArr) {
                if (afrApiResponse instanceof AfrApiResponse) {
                    AfrApiResponse afrApiResponse2 = afrApiResponse;
                    if (afrApiResponse2.getData() != null) {
                        AfrResponse data = afrApiResponse2.getData();
                        if (data == null) {
                            C7573i.m23580a();
                        }
                        arrayList.add(data);
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$c */
    static final class C42528c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C42525b f110591a;

        /* renamed from: b */
        final /* synthetic */ IntRef f110592b;

        C42528c(C42525b bVar, IntRef intRef) {
            this.f110591a = bVar;
            this.f110592b = intRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ArrayList<AfrFileBean> apply(List<AfrResponse> list) {
            boolean z;
            C7573i.m23587b(list, "list");
            ArrayList<AfrFileBean> arrayList = new ArrayList<>();
            Iterable iterable = list;
            Collection arrayList2 = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AfrResponse afrResponse = (AfrResponse) next;
                if (afrResponse.getKey().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || afrResponse.getAfrData() == null) {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            for (AfrResponse afrResponse2 : (List) arrayList2) {
                List arrayList3 = new ArrayList();
                List afrData = afrResponse2.getAfrData();
                if (afrData == null) {
                    C7573i.m23580a();
                }
                Iterator it2 = afrData.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AfrData afrData2 = (AfrData) it2.next();
                    if (!C42525b.m135148a(afrData2)) {
                        arrayList3.clear();
                        this.f110592b.element++;
                        break;
                    }
                    String pic = afrData2.getPic();
                    if (pic == null) {
                        C7573i.m23580a();
                    }
                    String a = C42525b.m135145a(C42525b.m135143a(pic));
                    if (a != null) {
                        arrayList3.add(new Pair(afrData2.getAlgorithm(), a));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    this.f110591a.f110582h.put(afrResponse2.getKey(), arrayList3);
                    Object obj = this.f110591a.f110581g.get(afrResponse2.getKey());
                    if (obj == null) {
                        C7573i.m23580a();
                    }
                    arrayList.add(new AfrFileBean((String) obj, arrayList3));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$d */
    static final class C42529d<T> implements C7326g<ArrayList<AfrFileBean>> {

        /* renamed from: a */
        final /* synthetic */ C42525b f110593a;

        /* renamed from: b */
        final /* synthetic */ IntRef f110594b;

        /* renamed from: c */
        final /* synthetic */ MvCreateVideoData f110595c;

        C42529d(C42525b bVar, IntRef intRef, MvCreateVideoData mvCreateVideoData) {
            this.f110593a = bVar;
            this.f110594b = intRef;
            this.f110595c = mvCreateVideoData;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(ArrayList<AfrFileBean> arrayList) {
            boolean z;
            C41654d dVar = this.f110593a.f110576b;
            if (dVar != null) {
                dVar.dismiss();
            }
            if (this.f110594b.element == 0) {
                C7573i.m23582a((Object) arrayList, "maskFilesData");
                if (!arrayList.isEmpty()) {
                    for (AfrFileBean a : arrayList) {
                        this.f110593a.mo104119a(a, this.f110595c);
                    }
                    this.f110593a.mo104120a(this.f110595c);
                    return;
                }
            }
            if (this.f110594b.element > 0) {
                String str = this.f110593a.f110578d;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C10761a.m31403c((Context) this.f110593a.f110583i, this.f110593a.f110578d).mo25750a();
                        return;
                    }
                }
            }
            C10761a.m31403c((Context) this.f110593a.f110583i, this.f110593a.f110583i.getResources().getString(R.string.w)).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$e */
    static final class C42530e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C42525b f110596a;

        C42530e(C42525b bVar) {
            this.f110596a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C41654d dVar = this.f110596a.f110576b;
            if (dVar != null) {
                dVar.dismiss();
            }
            C10761a.m31403c((Context) this.f110596a.f110583i, this.f110596a.f110583i.getResources().getString(R.string.w)).mo25750a();
            C7321c cVar = this.f110596a.f110579e;
            if (cVar != null && !cVar.isDisposed()) {
                C7321c cVar2 = this.f110596a.f110579e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$f */
    static final class C42531f implements C7323a {

        /* renamed from: a */
        final /* synthetic */ C42525b f110597a;

        C42531f(C42525b bVar) {
            this.f110597a = bVar;
        }

        /* renamed from: a */
        public final void mo8975a() {
            C7321c cVar = this.f110597a.f110579e;
            if (cVar != null && !cVar.isDisposed()) {
                C7321c cVar2 = this.f110597a.f110579e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$g */
    static final class C42532g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C42525b f110598a;

        /* renamed from: b */
        final /* synthetic */ MvCreateVideoData f110599b;

        /* renamed from: c */
        final /* synthetic */ IntRef f110600c;

        /* renamed from: d */
        final /* synthetic */ IntRef f110601d;

        /* renamed from: e */
        final /* synthetic */ IntRef f110602e;

        C42532g(C42525b bVar, MvCreateVideoData mvCreateVideoData, IntRef intRef, IntRef intRef2, IntRef intRef3) {
            this.f110598a = bVar;
            this.f110599b = mvCreateVideoData;
            this.f110600c = intRef;
            this.f110601d = intRef2;
            this.f110602e = intRef3;
        }

        public final /* synthetic */ Object call() {
            m135162a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135162a() {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(C42537b.m135179a("resize_bitmap_tmp"));
            sb.append(File.separator);
            String sb2 = sb.toString();
            Iterator it = this.f110599b.selectMediaList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (C7276d.m22812b(str)) {
                    if (this.f110598a.f110580f.containsKey(str)) {
                        Object obj = this.f110598a.f110580f.get(str);
                        if (obj == null) {
                            C7573i.m23580a();
                        }
                        arrayList.add(obj);
                    } else if (C42536a.m135173a(str) == null) {
                        arrayList.add(str);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append(C42537b.m135191c(".bmp"));
                        String sb4 = sb3.toString();
                        if (C42537b.m135185a(str, sb4, this.f110600c.element, this.f110601d.element, this.f110602e.element)) {
                            Map<String, String> map = this.f110598a.f110580f;
                            C7573i.m23582a((Object) str, "path");
                            map.put(str, sb4);
                            arrayList.add(sb4);
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f110599b.selectMediaList.clear();
                this.f110599b.selectMediaList.addAll(arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.b$h */
    static final class C42533h<TTaskResult, TContinuationResult> implements C1591g<C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C42525b f110603a;

        /* renamed from: b */
        final /* synthetic */ MvCreateVideoData f110604b;

        /* renamed from: c */
        final /* synthetic */ LongRef f110605c;

        C42533h(C42525b bVar, MvCreateVideoData mvCreateVideoData, LongRef longRef) {
            this.f110603a = bVar;
            this.f110604b = mvCreateVideoData;
            this.f110605c = longRef;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m135163a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135163a(C1592h<C7581n> hVar) {
            if (this.f110603a.f110577c) {
                C42525b bVar = this.f110603a;
                String str = this.f110604b.mvResZipPath;
                C7573i.m23582a((Object) str, "videoData.mvResZipPath");
                ArrayList<String> arrayList = this.f110604b.selectMediaList;
                C7573i.m23582a((Object) arrayList, "videoData.selectMediaList");
                bVar.mo104121a(str, (List<String>) arrayList, this.f110604b);
            } else {
                C41654d dVar = this.f110603a.f110576b;
                if (dVar != null) {
                    dVar.dismiss();
                }
                this.f110603a.mo104120a(this.f110604b);
            }
            this.f110603a.mo104118a(System.currentTimeMillis() - this.f110605c.element, this.f110604b);
        }
    }

    /* renamed from: a */
    private AfrApi m135144a() {
        return (AfrApi) this.f110588n.getValue();
    }

    /* renamed from: a */
    public final void mo104121a(String str, List<String> list, MvCreateVideoData mvCreateVideoData) {
        MvCreateVideoData mvCreateVideoData2 = mvCreateVideoData;
        List arrayList = new ArrayList();
        AlgorithmInfo[] algorithmInfoArr = VEUtils.getMVAlgorithmConfigs(str, list).infos;
        C7573i.m23582a((Object) algorithmInfoArr, "algorithmConfig.infos");
        int length = algorithmInfoArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            AlgorithmInfo algorithmInfo = algorithmInfoArr[i];
            C7573i.m23582a((Object) algorithmInfo, "algorithmInfo");
            List a = m135146a(algorithmInfo);
            if (a != null) {
                String str2 = algorithmInfo.photoPath;
                C7573i.m23582a((Object) str2, "algorithmInfo.photoPath");
                mo104119a(new AfrFileBean(str2, a), mvCreateVideoData2);
            } else {
                AlgorithmItem[] algorithmItemArr = algorithmInfo.items;
                C7573i.m23582a((Object) algorithmItemArr, "algorithmInfo.items");
                String str3 = "";
                for (AlgorithmItem algorithmItem : algorithmItemArr) {
                    if (algorithmItem.isNeedServerExecute) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(algorithmItem.algorithmName);
                        sb.append(',');
                        str3 = sb.toString();
                    }
                }
                String a2 = C7634n.m23738a(str3, (CharSequence) ",");
                if (a2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    String b = m135149b();
                    Map<String, String> map = this.f110581g;
                    String str4 = algorithmInfo.photoPath;
                    C7573i.m23582a((Object) str4, "algorithmInfo.photoPath");
                    map.put(b, str4);
                    C7492s b2 = m135144a().getAfrMask(a2, b, new TypedFile("image/*", new File(algorithmInfo.photoPath)), C42524a.f110574a).mo19304b(C7333a.m23044b());
                    C7573i.m23582a((Object) b2, "api.getAfrMask(algorithm…scribeOn(Schedulers.io())");
                    arrayList.add(b2);
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            m135147a(arrayList, mvCreateVideoData2);
            return;
        }
        C41654d dVar = this.f110576b;
        if (dVar != null) {
            dVar.dismiss();
        }
        mo104120a(mvCreateVideoData2);
    }

    /* renamed from: a */
    public final void mo104119a(AfrFileBean afrFileBean, MvCreateVideoData mvCreateVideoData) {
        for (Pair pair : afrFileBean.getMaskFiles()) {
            MvThemeData mvThemeData = this.f110584j;
            if (mvThemeData != null) {
                List<String> list = mvThemeData.f110508n;
                if (list != null && list.contains(pair.getFirst())) {
                    mvCreateVideoData.photoToSave.add(pair.getSecond());
                }
            }
        }
        mvCreateVideoData.maskFileData.add(afrFileBean);
    }

    /* renamed from: a */
    public final void mo104120a(MvCreateVideoData mvCreateVideoData) {
        C6907h.m21524a("upload_event_next", (Map) C22984d.m75611a().mo59973a("content_type", "photo").mo59973a("upload_type", "mv").f60753a);
        Intent intent = new Intent();
        MvThemeData mvThemeData = this.f110584j;
        mvCreateVideoData.musicIds = mvThemeData != null ? mvThemeData.mo104046b() : null;
        MvThemeData mvThemeData2 = this.f110584j;
        if (mvThemeData2 != null && !TextUtils.isEmpty(mvThemeData2.mo104044a())) {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            aVUploadMiscInfoStruct.mvThemeId = mvThemeData2.mo104044a();
            intent.putExtra("av_upload_struct", aVUploadMiscInfoStruct);
            if (!C23477d.m77081a((Collection<T>) mvThemeData2.mo104046b())) {
                intent.putExtra("first_sticker_music_ids", new C6600e().mo15979b((Object) mvThemeData2.mo104046b()));
            }
            CharSequence a = mvThemeData2.mo104044a();
            ShortVideoContext shortVideoContext = this.f110586l;
            if (shortVideoContext == null) {
                C7573i.m23583a("shortVideoContext");
            }
            if (TextUtils.equals(a, shortVideoContext.f99723aA)) {
                String str = "extra_bind_mv_id";
                ShortVideoContext shortVideoContext2 = this.f110586l;
                if (shortVideoContext2 == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                intent.putExtra(str, shortVideoContext2.f99723aA);
            }
            mvCreateVideoData.mvResUnzipPath = mvThemeData2.mo104050e();
            mvCreateVideoData.mvType = mvThemeData2.f110505k;
            mvCreateVideoData.mvAutoSaveToast = mvThemeData2.f110507m;
        }
        String a2 = C42537b.m135179a("contact_video");
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(File.separator);
        sb.append(C42537b.m135191c(".mp4"));
        mvCreateVideoData.contactVideoPath = sb.toString();
        intent.putExtra("key_mv_theme_data", mvCreateVideoData);
        intent.putExtra("key_mv_theme_enter", true);
        AVETParameter aVETParameter = this.f110585k;
        if (aVETParameter != null) {
            C39360dw a3 = C39360dw.m125725a();
            C7573i.m23582a((Object) a3, "PublishManager.inst()");
            List<AVChallenge> list = a3.f102247b;
            if (this.f110587m != null) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                AVChallenge aVChallenge = this.f110587m;
                if (aVChallenge == null) {
                    C7573i.m23580a();
                }
                list.add(aVChallenge);
            }
            String str2 = "extra_edit_preview_info";
            EditPreviewInfo a4 = new C39694c(720, 1280).mo99057a(mvCreateVideoData);
            if (a4 != null) {
                intent.putExtra(str2, a4);
                String str3 = "challenge";
                if (list != null) {
                    intent.putExtra(str3, (Serializable) list);
                    intent.putExtra("shoot_way", aVETParameter.getShootWay());
                    intent.putExtra("creation_id", aVETParameter.getCreationId());
                    intent.putExtra("shoot_mode", aVETParameter.getShootMode());
                    intent.putExtra("draft_id", aVETParameter.getDraftId());
                    intent.putExtra("origin", 1);
                    intent.putExtra("content_type", "mv");
                    intent.putExtra("content_source", "upload");
                    String str4 = "task_id";
                    ShortVideoContext shortVideoContext3 = this.f110586l;
                    if (shortVideoContext3 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    intent.putExtra(str4, shortVideoContext3.f99715T);
                    String str5 = "tag_id";
                    ShortVideoContext shortVideoContext4 = this.f110586l;
                    if (shortVideoContext4 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    intent.putExtra(str5, shortVideoContext4.f99718W);
                    ShortVideoContext shortVideoContext5 = this.f110586l;
                    if (shortVideoContext5 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    if (!C6307b.m19566a((Collection<T>) shortVideoContext5.f99716U)) {
                        StringBuilder sb2 = new StringBuilder();
                        ShortVideoContext shortVideoContext6 = this.f110586l;
                        if (shortVideoContext6 == null) {
                            C7573i.m23583a("shortVideoContext");
                        }
                        Iterator it = shortVideoContext6.f99716U.iterator();
                        while (it.hasNext()) {
                            String str6 = (String) it.next();
                            sb2.append("#");
                            sb2.append(str6);
                            sb2.append(" ");
                        }
                        ShortVideoContext shortVideoContext7 = this.f110586l;
                        if (shortVideoContext7 == null) {
                            C7573i.m23583a("shortVideoContext");
                        }
                        shortVideoContext7.f99709N = sb2.toString();
                        String str7 = "video_title";
                        ShortVideoContext shortVideoContext8 = this.f110586l;
                        if (shortVideoContext8 == null) {
                            C7573i.m23583a("shortVideoContext");
                        }
                        intent.putExtra(str7, shortVideoContext8.f99709N);
                    }
                    String str8 = "poi_data_in_tools_line";
                    ShortVideoContext shortVideoContext9 = this.f110586l;
                    if (shortVideoContext9 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    intent.putExtra(str8, shortVideoContext9.f99704I);
                    String str9 = "commerce_data_in_tools_line";
                    ShortVideoContext shortVideoContext10 = this.f110586l;
                    if (shortVideoContext10 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    intent.putExtra(str9, shortVideoContext10.f99757ar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        VEVideoPublishEditActivity.m125843a((Context) this.f110583i, intent, 1);
    }

    /* renamed from: b */
    private static String m135149b() {
        return String.valueOf(System.nanoTime());
    }

    /* renamed from: a */
    public static Bitmap m135143a(String str) {
        byte[] decode = Base64.decode(str, 0);
        Options options = new Options();
        options.inPreferredConfig = Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        if (decodeByteArray == null) {
            return null;
        }
        return decodeByteArray;
    }

    public C42525b(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f110583i = fragmentActivity;
    }

    /* renamed from: a */
    public static boolean m135148a(AfrData afrData) {
        boolean z;
        String pic = afrData.getPic();
        if (pic != null) {
            if (pic.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || ((double) afrData.getMaskRadio()) <= 0.01d) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m135145a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C42537b.m135179a("resize_bitmap_tmp"));
        sb.append(File.separator);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(C42537b.m135191c(".bmp"));
        String sb4 = sb3.toString();
        boolean a = C42536a.m135172a(bitmap, new File(sb4), 100, CompressFormat.PNG);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (a) {
            return sb4;
        }
        return null;
    }

    /* renamed from: a */
    private final List<Pair<String, String>> m135146a(AlgorithmInfo algorithmInfo) {
        if (!this.f110581g.containsValue(algorithmInfo.photoPath)) {
            return null;
        }
        String str = "";
        Iterator it = this.f110581g.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            if (C7573i.m23585a((Object) (String) entry.getValue(), (Object) algorithmInfo.photoPath)) {
                str = str2;
                break;
            }
        }
        return (List) this.f110582h.get(str);
    }

    /* renamed from: b */
    private final void m135150b(MvCreateVideoData mvCreateVideoData) {
        C41654d dVar;
        LongRef longRef = new LongRef();
        longRef.element = System.currentTimeMillis();
        if (this.f110577c) {
            dVar = C41654d.m132586b(this.f110583i, this.f110583i.getString(R.string.y));
        } else {
            dVar = C41654d.m132586b(this.f110583i, this.f110583i.getString(R.string.dtv));
        }
        this.f110576b = dVar;
        C41654d dVar2 = this.f110576b;
        if (dVar2 != null) {
            dVar2.setIndeterminate(true);
        }
        IntRef intRef = new IntRef();
        intRef.element = 720;
        IntRef intRef2 = new IntRef();
        intRef2.element = 1280;
        IntRef intRef3 = new IntRef();
        intRef3.element = 1;
        MvThemeData mvThemeData = this.f110584j;
        if (mvThemeData != null) {
            if (!(mvThemeData.f110502h == 0 || mvThemeData.f110503i == 0)) {
                intRef.element = mvThemeData.f110502h;
                intRef2.element = mvThemeData.f110503i;
            }
            if (C7573i.m23585a((Object) "AspectFill", (Object) mvThemeData.f110501g)) {
                intRef3.element = 1;
            } else if (C7573i.m23585a((Object) "AspectFit", (Object) mvThemeData.f110501g)) {
                intRef3.element = 3;
            } else if (C7573i.m23585a((Object) "AspectWidth", (Object) mvThemeData.f110501g)) {
                intRef3.element = 2;
            } else if (C7573i.m23585a((Object) "FreeMode", (Object) mvThemeData.f110501g)) {
                intRef3.element = 4;
            } else if (C7573i.m23585a((Object) "CenterZoom", (Object) mvThemeData.f110501g)) {
                intRef3.element = 5;
            }
        }
        mvCreateVideoData.srcSelectMediaList.clear();
        mvCreateVideoData.srcSelectMediaList.addAll(mvCreateVideoData.selectMediaList);
        C42532g gVar = new C42532g(this, mvCreateVideoData, intRef, intRef2, intRef3);
        C1592h.m7853a((Callable<TResult>) gVar).mo6876a((C1591g<TResult, TContinuationResult>) new C42533h<TResult,TContinuationResult>(this, mvCreateVideoData, longRef), C1592h.f5958b);
    }

    /* renamed from: a */
    private final void m135147a(List<C7492s<AfrApiResponse>> list, MvCreateVideoData mvCreateVideoData) {
        IntRef intRef = new IntRef();
        intRef.element = 0;
        this.f110579e = C7492s.m23288a((Iterable<? extends C7496w<? extends T>>) list, (C7327h<? super Object[], ? extends R>) C42527b.f110590a).mo19317d((C7327h<? super T, ? extends R>) new C42528c<Object,Object>(this, intRef)).mo19294a(C47549a.m148327a()).mo19281a((C7326g<? super T>) new C42529d<Object>(this, intRef, mvCreateVideoData), (C7326g<? super Throwable>) new C42530e<Object>(this), (C7323a) new C42531f(this));
    }

    /* renamed from: a */
    public final void mo104118a(long j, MvCreateVideoData mvCreateVideoData) {
        if (!C23477d.m77081a((Collection<T>) mvCreateVideoData.selectMediaList) && this.f110584j != null) {
            String str = "aweme_mv_generate_duration";
            C38510bb a = C38510bb.m123095a().mo96480a("duration", Long.valueOf(j)).mo96479a("pictureCount", Integer.valueOf(mvCreateVideoData.selectMediaList.size()));
            String str2 = "mvID";
            MvThemeData mvThemeData = this.f110584j;
            if (mvThemeData == null) {
                C7573i.m23580a();
            }
            C6893q.m21444a(str, 0, a.mo96481a(str2, mvThemeData.mo104044a()).mo96482b());
        }
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        Serializable serializable;
        boolean z;
        C7573i.m23587b(intent, "data");
        if (i == 10001) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            String stringExtra = intent.getStringExtra("key_mv_resource_zip_path");
            C7573i.m23582a((Object) stringExtra, "data.getStringExtra(AVCo…KEY_MV_RESOURCE_ZIP_PATH)");
            Bundle bundleExtra = intent.getBundleExtra("key_extra_info");
            String str = null;
            if (bundleExtra != null) {
                serializable = bundleExtra.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.f110587m = (AVChallenge) serializable;
            MvCreateVideoData mvCreateVideoData = new MvCreateVideoData();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                ArrayList<String> arrayList = mvCreateVideoData.selectMediaList;
                C7573i.m23582a((Object) mediaModel, "mediaModel");
                arrayList.add(mediaModel.f88156b);
            }
            mvCreateVideoData.mvResZipPath = stringExtra;
            this.f110584j = (MvThemeData) intent.getParcelableExtra("key_select_mv_data");
            MvThemeData mvThemeData = this.f110584j;
            if (mvThemeData != null) {
                str = mvThemeData.mo104057l();
            }
            this.f110578d = str;
            MvThemeData mvThemeData2 = this.f110584j;
            if (mvThemeData2 != null) {
                z = mvThemeData2.f110506l;
            } else {
                z = false;
            }
            this.f110577c = z;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C7573i.m23582a((Object) parcelableExtra, "data.getParcelableExtra(KEY_SHORT_VIDEO_CONTEXT)");
            this.f110586l = (ShortVideoContext) parcelableExtra;
            ShortVideoContext shortVideoContext = this.f110586l;
            if (shortVideoContext == null) {
                C7573i.m23583a("shortVideoContext");
            }
            this.f110585k = shortVideoContext.mo96148i();
            if (!C23477d.m77081a((Collection<T>) mvCreateVideoData.selectMediaList) && !TextUtils.isEmpty(stringExtra)) {
                m135150b(mvCreateVideoData);
            }
        }
    }
}
