package com.p280ss.android.ugc.asve.sandbox.p927a;

import android.util.SparseArray;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.model.FaceAttribute;
import com.p280ss.android.medialib.model.FaceAttributeInfo;
import com.p280ss.android.medialib.model.FaceDetectInfo;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.C21020e;
import com.p280ss.android.ugc.asve.sandbox.C21020e.C21021a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a.C20903a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i.C20930a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o.C20948a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q.C20954a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s.C20960a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v.C20969a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w.C20972a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x.C20975a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y.C20978a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z.C20981a;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45399j;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.p280ss.android.vesdk.faceinfo.C45313a;
import com.p280ss.android.vesdk.faceinfo.C45314b;
import com.p280ss.android.vesdk.faceinfo.C45317d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.c */
public final class C20852c {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$a */
    public static final class C20853a extends C21021a {
        C20853a() {
        }

        /* renamed from: a */
        public final C21020e mo56369a() {
            return this;
        }

        /* renamed from: b */
        public final void mo56376b() {
        }

        /* renamed from: a */
        public final C21020e mo56370a(int i) {
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56371a(String str) {
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56374a(List<String> list) {
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56375a(List<ComposerInfo> list, int i) {
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56372a(String str, String str2, float f) {
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56373a(String str, String str2, int i) {
            C7573i.m23587b(str2, "extra");
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$b */
    static final class C20854b implements C45404o {

        /* renamed from: a */
        final /* synthetic */ C20974x f56281a;

        C20854b(C20974x xVar) {
            this.f56281a = xVar;
        }

        /* renamed from: a */
        public final void mo56377a(boolean z) {
            this.f56281a.mo56366a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$c */
    public static final class C20855c implements C21062a {

        /* renamed from: a */
        final /* synthetic */ C20959s f56282a;

        C20855c(C20959s sVar) {
            this.f56282a = sVar;
        }

        /* renamed from: a */
        public final void mo56378a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
            C7573i.m23587b(aSSimpleFaceInfoArr, "infos");
            this.f56282a.mo56389a(aSSimpleFaceInfoArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$d */
    static final class C20856d implements OnARTextCountCallback {

        /* renamed from: a */
        final /* synthetic */ C20971w f56283a;

        C20856d(C20971w wVar) {
            this.f56283a = wVar;
        }

        public final void onResult(int i) {
            this.f56283a.mo56395a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$e */
    static final class C20857e implements OnARTextContentCallback {

        /* renamed from: a */
        final /* synthetic */ C20902a f56284a;

        C20857e(C20902a aVar) {
            this.f56284a = aVar;
        }

        public final void onResult(String[] strArr) {
            if (strArr != null) {
                this.f56284a.mo56394a(strArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$f */
    static final class C20858f implements IStickerRequestCallback {

        /* renamed from: a */
        final /* synthetic */ C20977y f56285a;

        C20858f(C20977y yVar) {
            this.f56285a = yVar;
        }

        public final void onStickerRequested(long j, boolean z) {
            this.f56285a.mo56404a(j, z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$g */
    static final class C20859g implements C45398i {

        /* renamed from: a */
        final /* synthetic */ C20953q f56286a;

        /* renamed from: b */
        final /* synthetic */ C20953q f56287b;

        C20859g(C20953q qVar, C20953q qVar2) {
            this.f56286a = qVar;
            this.f56287b = qVar2;
        }

        /* renamed from: a */
        public final void mo56379a(SparseArray<Long> sparseArray, float f) {
            int size = sparseArray.size();
            Integer[] numArr = new Integer[size];
            for (int i = 0; i < size; i++) {
                numArr[i] = Integer.valueOf(0);
            }
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                lArr[i2] = Long.valueOf(0);
            }
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                Long l = (Long) sparseArray.get(keyAt);
                numArr[i3] = Integer.valueOf(keyAt);
                C7573i.m23582a((Object) l, "time");
                lArr[i3] = l;
            }
            C20953q qVar = this.f56287b;
            int[] a = C7519g.m23432a(numArr);
            long[] a2 = C7519g.m23433a(lArr);
            if (Float.isNaN(f)) {
                f = 0.0f;
            }
            qVar.mo56406a(a, a2, f);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$h */
    static final class C20860h implements OnCherEffectParmaCallback {

        /* renamed from: a */
        final /* synthetic */ C20947o f56288a;

        C20860h(C20947o oVar) {
            this.f56288a = oVar;
        }

        public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f56288a.mo56388a(strArr, dArr, zArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$i */
    static final class C20861i implements C1944a {

        /* renamed from: a */
        final /* synthetic */ C20968v f56289a;

        C20861i(C20968v vVar) {
            this.f56289a = vVar;
        }

        public final void onMessageReceived(int i, int i2, int i3, String str) {
            this.f56289a.mo56391a(i, i2, i3, str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$j */
    static final class C20862j implements C45336r {

        /* renamed from: a */
        final /* synthetic */ C20980z f56290a;

        C20862j(C20980z zVar) {
            this.f56290a = zVar;
        }

        /* renamed from: a */
        public final void mo56380a(boolean z, boolean z2) {
            this.f56290a.mo56364a(z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$k */
    public static final class C20863k implements C20761c {

        /* renamed from: a */
        final /* synthetic */ C21020e f56291a;

        /* renamed from: a */
        public final void mo56144a() {
            this.f56291a.mo56376b();
        }

        /* renamed from: b */
        public final C20761c mo56145b() {
            this.f56291a.mo56369a();
            return this;
        }

        C20863k(C21020e eVar) {
            this.f56291a = eVar;
        }

        /* renamed from: a */
        public final C20761c mo56138a(int i) {
            this.f56291a.mo56370a(i);
            return this;
        }

        /* renamed from: a */
        public final C20761c mo56139a(String str) {
            C7573i.m23587b(str, "path");
            this.f56291a.mo56371a(str);
            return this;
        }

        /* renamed from: a */
        public final C20761c mo56142a(List<String> list) {
            C7573i.m23587b(list, "paths");
            this.f56291a.mo56374a(list);
            return this;
        }

        /* renamed from: a */
        public final C20761c mo56143a(List<ComposerInfo> list, int i) {
            C7573i.m23587b(list, "paths");
            this.f56291a.mo56375a(list, i);
            return this;
        }

        /* renamed from: a */
        public final C20761c mo56140a(String str, String str2, float f) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "featureTag");
            this.f56291a.mo56372a(str, str2, f);
            return this;
        }

        /* renamed from: a */
        public final C20761c mo56141a(String str, String str2, int i) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "extra");
            this.f56291a.mo56373a(str, str2, i);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$l */
    public static final class C20864l extends C21021a {

        /* renamed from: a */
        final /* synthetic */ C20761c f56292a;

        /* renamed from: b */
        public final void mo56376b() {
            this.f56292a.mo56144a();
        }

        /* renamed from: a */
        public final C21020e mo56369a() {
            this.f56292a.mo56145b();
            return this;
        }

        C20864l(C20761c cVar) {
            this.f56292a = cVar;
        }

        /* renamed from: a */
        public final C21020e mo56370a(int i) {
            this.f56292a.mo56138a(i);
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56371a(String str) {
            C7573i.m23587b(str, "path");
            this.f56292a.mo56139a(str);
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56374a(List<String> list) {
            C7573i.m23587b(list, "paths");
            this.f56292a.mo56142a(list);
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56375a(List<ComposerInfo> list, int i) {
            C7573i.m23587b(list, "paths");
            this.f56292a.mo56143a(list, i);
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56372a(String str, String str2, float f) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "featureTag");
            this.f56292a.mo56140a(str, str2, f);
            return this;
        }

        /* renamed from: a */
        public final C21020e mo56373a(String str, String str2, int i) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "extra");
            this.f56292a.mo56141a(str, str2, i);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$m */
    static final class C20865m implements FaceInfoCallback {

        /* renamed from: a */
        final /* synthetic */ C21062a f56293a;

        C20865m(C21062a aVar) {
            this.f56293a = aVar;
        }

        public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
            C21062a aVar = this.f56293a;
            if (faceAttributeInfo != null) {
                Object[] array = C20852c.m69859a(faceAttributeInfo).toArray(new ASSimpleFaceInfo[0]);
                if (array != null) {
                    aVar.mo56378a((ASSimpleFaceInfo[]) array);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$n */
    public static final class C20866n implements C45399j {

        /* renamed from: a */
        final /* synthetic */ C21062a f56294a;

        C20866n(C21062a aVar) {
            this.f56294a = aVar;
        }

        /* renamed from: a */
        public final void mo56381a(C45314b bVar, C45317d dVar) {
            if (bVar != null) {
                C21062a aVar = this.f56294a;
                Object[] array = C20852c.m69860a(bVar).toArray(new ASSimpleFaceInfo[0]);
                if (array != null) {
                    aVar.mo56378a((ASSimpleFaceInfo[]) array);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: a */
    public static final C45404o m69858a(C20974x xVar) {
        C7573i.m23587b(xVar, "$this$proxy");
        return new C20854b(xVar);
    }

    /* renamed from: a */
    public static final C20975a m69848a(C45404o oVar) {
        C7573i.m23587b(oVar, "$this$stub");
        return new C20840ac(oVar);
    }

    /* renamed from: a */
    public static final C20972a m69847a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "$this$stub");
        return new C20885p(onARTextCountCallback);
    }

    /* renamed from: a */
    public static final C20978a m69849a(IStickerRequestCallback iStickerRequestCallback) {
        C7573i.m23587b(iStickerRequestCallback, "$this$stub");
        return new C20893x(iStickerRequestCallback);
    }

    /* renamed from: a */
    public static final C45398i m69857a(C20953q qVar) {
        C7573i.m23587b(qVar, "$this$proxy");
        return new C20859g(qVar, qVar);
    }

    /* renamed from: a */
    public static final C20954a m69844a(C45398i iVar) {
        C7573i.m23587b(iVar, "$this$stub");
        return new C20895z(iVar);
    }

    /* renamed from: a */
    public static final C20948a m69843a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "$this$stub");
        return new C20879j(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public static final C20969a m69846a(C1944a aVar) {
        C7573i.m23587b(aVar, "$this$stub");
        return new C20882m(aVar);
    }

    /* renamed from: a */
    public static final C45336r m69856a(C20980z zVar) {
        C7573i.m23587b(zVar, "$this$proxy");
        return new C20862j(zVar);
    }

    /* renamed from: a */
    public static final C20981a m69850a(C45336r rVar) {
        C7573i.m23587b(rVar, "$this$stub");
        return new C20838aa(rVar);
    }

    /* renamed from: a */
    public static final C21021a m69852a(C20761c cVar) {
        C7573i.m23587b(cVar, "$this$stub");
        return new C20864l(cVar);
    }

    /* renamed from: a */
    private static ASSimpleFaceInfo m69853a(FaceAttribute faceAttribute) {
        C7573i.m23587b(faceAttribute, "$this$toSimpleFaceInfo");
        return new ASSimpleFaceInfo(faceAttribute.getBoyProb());
    }

    /* renamed from: a */
    public static final List<ASSimpleFaceInfo> m69859a(FaceAttributeInfo faceAttributeInfo) {
        C7573i.m23587b(faceAttributeInfo, "$this$toSimpleFaceInfos");
        List<ASSimpleFaceInfo> arrayList = new ArrayList<>();
        FaceAttribute[] info = faceAttributeInfo.getInfo();
        C7573i.m23582a((Object) info, "info");
        for (FaceAttribute faceAttribute : info) {
            C7573i.m23582a((Object) faceAttribute, "it");
            arrayList.add(m69853a(faceAttribute));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final C20960a m69845a(C21062a aVar) {
        C7573i.m23587b(aVar, "$this$stub");
        return new C20880k(aVar);
    }

    /* renamed from: a */
    public static final C21062a m69855a(C20959s sVar) {
        C7573i.m23587b(sVar, "$this$proxy");
        return new C20855c(sVar);
    }

    /* renamed from: a */
    public static final List<ASSimpleFaceInfo> m69860a(C45314b bVar) {
        C7573i.m23587b(bVar, "$this$toSimpleFaceInfo");
        List<ASSimpleFaceInfo> arrayList = new ArrayList<>();
        C45313a[] aVarArr = bVar.f116651a;
        C7573i.m23582a((Object) aVarArr, "info");
        for (C45313a aVar : aVarArr) {
            C7573i.m23582a((Object) aVar, "it");
            arrayList.add(m69854a(aVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static ASSimpleFaceInfo m69854a(C45313a aVar) {
        C7573i.m23587b(aVar, "$this$toSimpleFaceInfo");
        return new ASSimpleFaceInfo(aVar.f116629b);
    }

    /* renamed from: a */
    public static final C21021a m69851a() {
        return new C20853a();
    }

    /* renamed from: a */
    public static final C1944a m69835a(C20968v vVar) {
        C7573i.m23587b(vVar, "$this$proxy");
        return new C20861i(vVar);
    }

    /* renamed from: b */
    public static final FaceInfoCallback m69861b(C21062a aVar) {
        C7573i.m23587b(aVar, "$this$toVEFaceInfoCallback");
        return new C20865m(aVar);
    }

    /* renamed from: c */
    public static final C45399j m69862c(C21062a aVar) {
        C7573i.m23587b(aVar, "$this$toVERecoderFaceInfoCallback");
        return new C20866n(aVar);
    }

    /* renamed from: a */
    public static final OnARTextContentCallback m69836a(C20902a aVar) {
        C7573i.m23587b(aVar, "$this$proxy");
        return new C20857e(aVar);
    }

    /* renamed from: a */
    public static final OnARTextCountCallback m69837a(C20971w wVar) {
        C7573i.m23587b(wVar, "$this$proxy");
        return new C20856d(wVar);
    }

    /* renamed from: a */
    public static final OnCherEffectParmaCallback m69838a(C20947o oVar) {
        C7573i.m23587b(oVar, "$this$proxy");
        return new C20860h(oVar);
    }

    /* renamed from: a */
    public static final IStickerRequestCallback m69839a(C20977y yVar) {
        C7573i.m23587b(yVar, "$this$proxy");
        return new C20858f(yVar);
    }

    /* renamed from: a */
    public static final C20761c m69840a(C21020e eVar) {
        C7573i.m23587b(eVar, "$this$proxy");
        return new C20863k(eVar);
    }

    /* renamed from: a */
    public static final C20903a m69841a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "$this$stub");
        return new C20884o(onARTextContentCallback);
    }

    /* renamed from: a */
    public static final C20930a m69842a(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "$this$stub");
        return new C20892w(bVar);
    }
}
