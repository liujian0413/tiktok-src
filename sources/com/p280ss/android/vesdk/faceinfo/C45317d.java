package com.p280ss.android.vesdk.faceinfo;

import com.p280ss.android.medialib.model.FaceDetect;
import com.p280ss.android.medialib.model.FaceDetectInfo;
import com.p280ss.android.vesdk.faceinfo.C45315c.C45316a;

/* renamed from: com.ss.android.vesdk.faceinfo.d */
public final class C45317d {

    /* renamed from: a */
    public C45315c[] f116674a;

    /* renamed from: a */
    public static C45317d m143104a(FaceDetectInfo faceDetectInfo) {
        if (faceDetectInfo == null || faceDetectInfo.getInfo() == null) {
            return null;
        }
        C45317d dVar = new C45317d();
        C45315c[] cVarArr = new C45315c[faceDetectInfo.getInfo().length];
        FaceDetect[] info = faceDetectInfo.getInfo();
        int length = info.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FaceDetect faceDetect = info[i];
            C45315c cVar = new C45315c();
            cVar.f116652a = faceDetect.getRect();
            cVar.f116654c = faceDetect.getPoints();
            cVar.f116661j = faceDetect.getAction();
            cVar.f116659h = faceDetect.getEyeDistance();
            if (faceDetect.getFaceExtInfo() != null) {
                C45316a aVar = new C45316a();
                aVar.f116665b = faceDetect.getFaceExtInfo().eyebrowCount;
                aVar.f116670g = faceDetect.getFaceExtInfo().eyeBrowLeftPoints;
                aVar.f116671h = faceDetect.getFaceExtInfo().eyeBrowRightPoints;
                aVar.f116664a = faceDetect.getFaceExtInfo().eyeCount;
                aVar.f116668e = faceDetect.getFaceExtInfo().eyeLeftPoints;
                aVar.f116669f = faceDetect.getFaceExtInfo().eyeRightPoints;
                aVar.f116666c = faceDetect.getFaceExtInfo().lipCount;
                aVar.f116672i = faceDetect.getFaceExtInfo().irisLeftPoints;
                aVar.f116673j = faceDetect.getFaceExtInfo().irisRightPoints;
                aVar.f116667d = faceDetect.getFaceExtInfo().irisCount;
                cVar.f116663l = aVar;
            }
            cVar.f116660i = faceDetect.getFaceID();
            cVar.f116657f = faceDetect.getPitch();
            cVar.f116655d = faceDetect.getPointVisibility();
            cVar.f116658g = faceDetect.getRoll();
            cVar.f116656e = faceDetect.getYaw();
            cVar.f116653b = faceDetect.getScore();
            cVar.f116662k = faceDetect.getTrackCount();
            int i3 = i2 + 1;
            cVarArr[i2] = cVar;
            i++;
            i2 = i3;
        }
        dVar.f116674a = cVarArr;
        return dVar;
    }
}
