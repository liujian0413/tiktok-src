package com.p280ss.android.medialib.camera;

import android.graphics.SurfaceTexture;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.IESCameraInterface */
public interface IESCameraInterface {

    /* renamed from: u */
    public static final int[] f53148u = {2, 0, 1, 3};

    /* renamed from: v */
    public static final int[] f53149v = {1, 2, 0, 3};

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$CameraRatio */
    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3
    }

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$a */
    public interface C19629a {
        /* renamed from: a */
        void mo52246a();
    }

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$b */
    public interface C19630b {
        /* renamed from: a */
        void mo52247a(ImageFrame imageFrame);
    }

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$c */
    public interface C19631c {
        /* renamed from: a */
        void mo52248a(int i, ImageFrame imageFrame);
    }

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$d */
    public interface C19632d {
    }

    /* renamed from: com.ss.android.medialib.camera.IESCameraInterface$e */
    public interface C19633e {
        /* renamed from: a */
        void mo52249a(int i, float f, boolean z);

        /* renamed from: a */
        void mo52250a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo52251a();
    }

    /* renamed from: a */
    void mo52214a(float f);

    /* renamed from: a */
    void mo52215a(int i, int i2, C19630b bVar);

    /* renamed from: a */
    void mo52216a(SurfaceTexture surfaceTexture);

    /* renamed from: a */
    void mo52217a(C19629a aVar);

    /* renamed from: a */
    void mo52218a(C19631c cVar);

    /* renamed from: a */
    void mo52219a(C19632d dVar);

    /* renamed from: a */
    void mo52220a(C19633e eVar);

    /* renamed from: a */
    void mo52221a(C19663e eVar);

    /* renamed from: a */
    void mo52222a(boolean z);

    /* renamed from: a */
    boolean mo52223a();

    /* renamed from: a */
    boolean mo52224a(int i);

    /* renamed from: a */
    boolean mo52225a(int i, int i2, float f, float[] fArr, int i3);

    /* renamed from: a */
    boolean mo52226a(int i, C19662d dVar);

    /* renamed from: b */
    int mo52227b(int i);

    /* renamed from: b */
    void mo52228b();

    /* renamed from: b */
    void mo52229b(float f);

    /* renamed from: b */
    void mo52230b(SurfaceTexture surfaceTexture);

    /* renamed from: b */
    void mo52231b(boolean z);

    /* renamed from: b */
    boolean mo52232b(int i, C19662d dVar);

    /* renamed from: c */
    void mo52233c();

    /* renamed from: d */
    void mo52234d();

    /* renamed from: e */
    void mo52235e();

    /* renamed from: f */
    void mo52236f();

    /* renamed from: g */
    int mo52237g();

    /* renamed from: h */
    int[] mo52238h();

    /* renamed from: i */
    float mo52239i();

    /* renamed from: j */
    boolean mo52240j();

    /* renamed from: k */
    int[] mo52241k();

    /* renamed from: l */
    List<int[]> mo52242l();

    /* renamed from: m */
    int mo52243m();

    /* renamed from: n */
    boolean mo52244n();

    /* renamed from: o */
    int mo52245o();
}
