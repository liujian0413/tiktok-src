package com.p280ss.android.vesdk.faceinfo;

import com.p280ss.android.medialib.model.FaceAttribute;
import com.p280ss.android.medialib.model.FaceAttributeInfo;

/* renamed from: com.ss.android.vesdk.faceinfo.b */
public final class C45314b {

    /* renamed from: a */
    public C45313a[] f116651a;

    /* renamed from: a */
    public static C45314b m143103a(FaceAttributeInfo faceAttributeInfo) {
        if (faceAttributeInfo == null) {
            return null;
        }
        C45314b bVar = new C45314b();
        FaceAttribute[] info = faceAttributeInfo.getInfo();
        int i = 0;
        if (info == null) {
            bVar.f116651a = new C45313a[0];
        } else {
            C45313a[] aVarArr = new C45313a[info.length];
            bVar.f116651a = aVarArr;
            int length = info.length;
            int i2 = 0;
            while (i < length) {
                FaceAttribute faceAttribute = info[i];
                C45313a aVar = new C45313a();
                int i3 = i2 + 1;
                aVarArr[i2] = aVar;
                if (faceAttribute != null) {
                    aVar.f116628a = faceAttribute.getAge();
                    aVar.f116641n = faceAttribute.getAngryScore();
                    aVar.f116635h = faceAttribute.getRacialProbs();
                    aVar.f116638k = faceAttribute.getArousal();
                    aVar.f116641n = faceAttribute.getAngryScore();
                    aVar.f116630c = faceAttribute.getAttractive();
                    aVar.f116649v = faceAttribute.getBlurScore();
                    aVar.f116629b = faceAttribute.getBoyProb();
                    aVar.f116633f = faceAttribute.getExpProbs();
                    aVar.f116632e = faceAttribute.getExpType();
                    aVar.f116631d = faceAttribute.getHappyScore();
                    aVar.f116650w = faceAttribute.getIllumination();
                    aVar.f116646s = faceAttribute.getLipstickProb();
                    aVar.f116643p = faceAttribute.getMaskProb();
                    aVar.f116645r = faceAttribute.getMustacheProb();
                    aVar.f116637j = faceAttribute.getQuality();
                    aVar.f116634g = faceAttribute.getRacialType();
                    aVar.f116636i = faceAttribute.getRealFaceProb();
                    aVar.f116640m = faceAttribute.getSadScore();
                    aVar.f116642o = faceAttribute.getSurpriseScore();
                    aVar.f116639l = faceAttribute.getValence();
                    aVar.f116647t = faceAttribute.getWearGlassProb();
                    aVar.f116644q = faceAttribute.getWearHatProb();
                    aVar.f116648u = faceAttribute.getWearSunglassProb();
                }
                i++;
                i2 = i3;
            }
        }
        return bVar;
    }
}
