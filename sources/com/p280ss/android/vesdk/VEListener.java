package com.p280ss.android.vesdk;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEListener */
public class VEListener {

    /* renamed from: com.ss.android.vesdk.VEListener$VEEditorEffectListener */
    public interface VEEditorEffectListener {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$VEInfoStickerBufferListener */
    public interface VEInfoStickerBufferListener {
        Bitmap onGetBuffer(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$a */
    public interface C45205a {
        /* renamed from: a */
        void mo108037a(String str, int i, byte[] bArr);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$b */
    public interface C45206b {
        /* renamed from: a */
        void mo56363a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$c */
    public interface C45207c {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$d */
    public interface C45208d {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$e */
    public interface C45209e {
        /* renamed from: a */
        void mo97464a(float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$f */
    public interface C45210f {
        /* renamed from: a */
        void mo55926a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$g */
    public interface C45211g extends C45212h {
        /* renamed from: a */
        void mo55988a(int i, int i2, String str);

        /* renamed from: a */
        void mo55989a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$h */
    public interface C45212h {
        /* renamed from: a */
        void mo55986a();

        /* renamed from: a */
        void mo55987a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$i */
    public interface C45213i {
        /* renamed from: a */
        void mo106502a(int i, int i2, float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$j */
    public interface C45214j {
        /* renamed from: a */
        void mo55925a(int i, String str, String str2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$k */
    public interface C45215k {
        void onCompileDone();

        void onCompileError(int i, int i2, float f, String str);

        void onCompileProgress(float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$l */
    public interface C45216l {
        /* renamed from: a */
        void mo99223a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$m */
    public interface C45217m {
        /* renamed from: a */
        void mo98376a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$n */
    public interface C45218n {
        /* renamed from: a */
        void mo102091a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$o */
    public interface C45219o {
        /* renamed from: a */
        void mo38884a();
    }

    /* renamed from: com.ss.android.vesdk.VEListener$p */
    public interface C45220p {
        /* renamed from: a */
        int mo96655a(byte[] bArr, int i, int i2, int i3, float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$q */
    public interface C45221q {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$r */
    public interface C45222r {
        /* renamed from: a */
        void mo56362a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$s */
    public interface C45223s {
        /* renamed from: a */
        VESize mo108038a(List<VESize> list, List<VESize> list2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$t */
    public interface C45224t {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$u */
    public interface C45225u extends C45226v {
        /* renamed from: a */
        void mo55870a(int i, int i2, String str);

        /* renamed from: b */
        void mo55873b(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$v */
    public interface C45226v {
        /* renamed from: a */
        void mo55871a(int i, String str);

        /* renamed from: a */
        void mo55872a(boolean z);
    }
}
