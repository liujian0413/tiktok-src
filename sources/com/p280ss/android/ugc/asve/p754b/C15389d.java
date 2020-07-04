package com.p280ss.android.ugc.asve.p754b;

import android.graphics.Bitmap;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEEditor.GET_FRAMES_FLAGS;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.SET_RANGE_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VEListener.C45205a;
import com.p280ss.android.vesdk.VEListener.C45209e;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEListener.C45217m;
import com.p280ss.android.vesdk.VEListener.C45220p;
import com.p280ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p280ss.android.vesdk.VEMVAudioInfo;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p280ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p280ss.android.vesdk.runtime.C45345b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.b.d */
public interface C15389d {
    /* renamed from: A */
    int mo38744A();

    /* renamed from: B */
    int mo38745B();

    /* renamed from: C */
    int mo38746C();

    /* renamed from: a */
    int mo38747a(float f);

    /* renamed from: a */
    int mo38748a(int i, float f);

    /* renamed from: a */
    int mo38749a(int i, float f, float f2);

    /* renamed from: a */
    int mo38750a(int i, int i2, int i3);

    /* renamed from: a */
    int mo38751a(int i, int i2, int i3, int i4, float f, float f2);

    /* renamed from: a */
    int mo38752a(int i, int i2, int i3, int i4, int i5);

    /* renamed from: a */
    int mo38753a(int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: a */
    int mo38754a(int i, int i2, int i3, boolean z);

    /* renamed from: a */
    int mo38755a(int i, int i2, ROTATE_DEGREE rotate_degree);

    /* renamed from: a */
    int mo38756a(int i, int i2, SET_RANGE_MODE set_range_mode);

    /* renamed from: a */
    int mo38757a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4);

    /* renamed from: a */
    int mo38758a(int i, int i2, String str);

    /* renamed from: a */
    int mo38759a(int i, int i2, String str, byte[] bArr, int i3, int i4, C45205a aVar);

    /* renamed from: a */
    int mo38760a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2);

    /* renamed from: a */
    int mo38761a(int i, int i2, boolean z, C45209e eVar);

    /* renamed from: a */
    int mo38762a(int i, ROTATE_DEGREE rotate_degree);

    /* renamed from: a */
    int mo38763a(int i, SEEK_MODE seek_mode);

    /* renamed from: a */
    int mo38764a(int i, SEEK_MODE seek_mode, C45217m mVar);

    /* renamed from: a */
    int mo38765a(int i, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo38766a(int i, String str);

    /* renamed from: a */
    int mo38767a(int i, String str, int i2, int i3, String str2);

    /* renamed from: a */
    int mo38768a(int i, ByteBuffer byteBuffer);

    /* renamed from: a */
    int mo38769a(int i, boolean z);

    /* renamed from: a */
    int mo38770a(int i, float[] fArr);

    /* renamed from: a */
    int mo38771a(int i, ByteBuffer[] byteBufferArr);

    /* renamed from: a */
    int mo38772a(C15390e eVar);

    /* renamed from: a */
    int mo38773a(SCALE_MODE scale_mode);

    /* renamed from: a */
    int mo38774a(VEInfoStickerBufferListener vEInfoStickerBufferListener);

    /* renamed from: a */
    int mo38775a(VERecordData vERecordData, boolean z);

    /* renamed from: a */
    int mo38776a(C45255af afVar);

    /* renamed from: a */
    int mo38777a(C45255af afVar, int i, int i2);

    /* renamed from: a */
    int mo38778a(String str);

    /* renamed from: a */
    int mo38779a(String str, float f);

    /* renamed from: a */
    int mo38780a(String str, float f, float f2, float f3, float f4);

    /* renamed from: a */
    int mo38781a(String str, int i, int i2);

    /* renamed from: a */
    int mo38782a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);

    /* renamed from: a */
    int mo38783a(String str, int i, int i2, boolean z);

    /* renamed from: a */
    int mo38784a(String str, String str2);

    /* renamed from: a */
    int mo38785a(String str, String str2, float f);

    /* renamed from: a */
    int mo38786a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    int mo38787a(String str, String str2, String str3);

    /* renamed from: a */
    int mo38788a(String str, String[] strArr);

    /* renamed from: a */
    int mo38789a(String str, String[] strArr, String[] strArr2);

    /* renamed from: a */
    int mo38791a(int[] iArr);

    /* renamed from: a */
    int mo38792a(int[] iArr, int i, int i2, GET_FRAMES_FLAGS get_frames_flags, C45220p pVar);

    /* renamed from: a */
    int mo38793a(String[] strArr, String[] strArr2);

    /* renamed from: a */
    Bitmap mo38794a(int i);

    /* renamed from: a */
    VESize mo38795a(int i, int i2);

    /* renamed from: a */
    C45345b mo38796a();

    /* renamed from: a */
    void mo38797a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    void mo38798a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo38802a(String[] strArr);

    /* renamed from: a */
    boolean mo38803a(int i, int i2, float f);

    /* renamed from: a */
    boolean mo38805a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C45215k kVar) throws VEException;

    /* renamed from: a */
    int[] mo38807a(int[] iArr, int[] iArr2, String[] strArr);

    /* renamed from: a */
    int[] mo38808a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2);

    /* renamed from: b */
    float mo38809b(String str);

    /* renamed from: b */
    int mo38810b(int i, float f);

    /* renamed from: b */
    int mo38811b(int i, float f, float f2);

    /* renamed from: b */
    int mo38812b(int i, int i2);

    /* renamed from: b */
    int mo38813b(int i, int i2, int i3);

    /* renamed from: b */
    int mo38814b(int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: b */
    int mo38815b(int i, String str);

    /* renamed from: b */
    int mo38816b(int i, float[] fArr);

    /* renamed from: b */
    int mo38817b(String str, float f);

    /* renamed from: b */
    int mo38818b(String str, float f, float f2, float f3, float f4);

    /* renamed from: b */
    int mo38820b(int[] iArr);

    /* renamed from: b */
    int mo38821b(String[] strArr);

    /* renamed from: b */
    void mo38824b(C45329l lVar);

    /* renamed from: c */
    int mo38825c(int i, float f);

    /* renamed from: c */
    int mo38826c(String str);

    /* renamed from: c */
    int mo38827c(int[] iArr);

    /* renamed from: c */
    VESize mo38828c();

    /* renamed from: c */
    void mo38829c(int i);

    /* renamed from: c */
    void mo38830c(int i, int i2);

    /* renamed from: c */
    void mo38831c(C45329l lVar);

    /* renamed from: c */
    void mo38832c(boolean z);

    /* renamed from: d */
    int mo38833d(int i);

    /* renamed from: d */
    int mo38834d(String str);

    /* renamed from: d */
    Bitmap mo38835d();

    /* renamed from: e */
    int mo38838e(int i, int i2);

    /* renamed from: e */
    int mo38839e(boolean z);

    /* renamed from: e */
    MVInfoBean mo38840e();

    /* renamed from: e */
    boolean mo38841e(int i);

    /* renamed from: f */
    int mo38842f();

    /* renamed from: f */
    int mo38843f(int i);

    /* renamed from: f */
    int mo38844f(int i, int i2);

    /* renamed from: g */
    int mo38846g(int i, int i2);

    /* renamed from: g */
    VEMVAudioInfo mo38847g();

    /* renamed from: g */
    void mo38848g(boolean z);

    /* renamed from: g */
    float[] mo38849g(int i) throws VEException;

    /* renamed from: h */
    VEState mo38850h();

    /* renamed from: h */
    void mo38851h(boolean z);

    /* renamed from: h */
    float[] mo38852h(int i) throws VEException;

    /* renamed from: i */
    int mo38853i(int i);

    /* renamed from: i */
    String[] mo38855i();

    /* renamed from: j */
    String[] mo38857j();

    /* renamed from: k */
    int mo38858k(int i);

    /* renamed from: k */
    String[] mo38859k();

    /* renamed from: l */
    int mo38860l();

    /* renamed from: m */
    int mo38862m();

    /* renamed from: m */
    int mo38863m(int i);

    /* renamed from: n */
    int mo38864n(int i);

    /* renamed from: n */
    List<VEClipAlgorithmParam> mo38865n();

    /* renamed from: o */
    int mo38866o(int i);

    /* renamed from: p */
    int mo38868p();

    /* renamed from: p */
    void mo38869p(int i);

    /* renamed from: q */
    int mo38870q(int i);

    /* renamed from: r */
    float mo38872r(int i);

    /* renamed from: r */
    void mo38873r();

    /* renamed from: s */
    float mo38874s(int i);

    /* renamed from: t */
    void mo38876t();

    /* renamed from: t */
    boolean mo38877t(int i);

    /* renamed from: u */
    int mo38878u() throws VEException;

    /* renamed from: v */
    int mo38879v();

    /* renamed from: w */
    int mo38880w();

    /* renamed from: x */
    int mo38881x();

    /* renamed from: y */
    int mo38882y();

    /* renamed from: z */
    int mo38883z();
}
