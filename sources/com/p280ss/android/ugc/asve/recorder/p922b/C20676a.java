package com.p280ss.android.ugc.asve.recorder.p922b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VEListener.C45210f;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.recorder.b.a */
public interface C20676a {
    /* renamed from: a */
    int mo55883a(double d, boolean z, float f, int i, int i2, boolean z2);

    /* renamed from: a */
    int mo55884a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z);

    /* renamed from: a */
    int mo55885a(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: a */
    int mo55886a(Surface surface, String str);

    /* renamed from: a */
    int mo55887a(String str, int i, int i2, C7562b<? super Integer, C7581n> bVar);

    /* renamed from: a */
    int mo55888a(List<ASMediaSegment> list, String str, String str2, int i);

    /* renamed from: a */
    RecorderConcatResult mo55889a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo55890a();

    /* renamed from: a */
    void mo55891a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar);

    /* renamed from: a */
    void mo55892a(float f);

    /* renamed from: a */
    void mo55893a(float f, int i, int i2);

    /* renamed from: a */
    void mo55894a(int i);

    /* renamed from: a */
    void mo55895a(Surface surface);

    /* renamed from: a */
    void mo55896a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar);

    /* renamed from: a */
    void mo55897a(C45393e eVar);

    /* renamed from: a */
    void mo55898a(String str);

    /* renamed from: a */
    void mo55899a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C7562b<? super Integer, C7581n> bVar);

    /* renamed from: a */
    void mo55900a(String str, long j, long j2);

    /* renamed from: a */
    void mo55901a(String str, String str2, boolean z, String str3, String str4, C7562b<? super RecorderConcatResult, C7581n> bVar);

    /* renamed from: a */
    void mo55902a(List<ASMediaSegment> list, String str, String str2, int i, C45210f fVar);

    /* renamed from: a */
    void mo55903a(C7562b<? super Integer, C7581n> bVar);

    /* renamed from: a */
    void mo55904a(boolean z);

    /* renamed from: b */
    int mo55905b(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: b */
    void mo55906b();

    /* renamed from: b */
    void mo55907b(Surface surface);

    /* renamed from: b */
    void mo55908b(Surface surface, String str);

    /* renamed from: b */
    void mo55909b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar);

    /* renamed from: b */
    void mo55910b(C7562b<? super Integer, C7581n> bVar);

    /* renamed from: b */
    boolean mo55911b(boolean z);

    /* renamed from: c */
    long mo55912c();

    /* renamed from: c */
    void mo55913c(boolean z);

    /* renamed from: d */
    void mo55914d();

    /* renamed from: d */
    void mo55915d(boolean z);

    /* renamed from: e */
    void mo55916e();

    /* renamed from: e */
    void mo55917e(boolean z);

    /* renamed from: f */
    void mo55918f();

    /* renamed from: g */
    long mo55919g();

    /* renamed from: h */
    boolean mo55920h();

    /* renamed from: i */
    void mo55921i();

    /* renamed from: j */
    void mo55922j();

    /* renamed from: k */
    void mo55923k();
}
