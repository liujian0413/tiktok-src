package com.p280ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VEListener.C45210f;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.recorder.view.h */
public final class C20814h implements C20676a {

    /* renamed from: a */
    private final C20676a f56196a;

    /* renamed from: a */
    public final int mo55883a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56196a.mo55883a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final int mo55884a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C7573i.m23587b(str, "path");
        String str4 = str2;
        C7573i.m23587b(str4, "strDetectModelsDir");
        return this.f56196a.mo55884a(i, i2, str3, i3, i4, str4, i5, z);
    }

    /* renamed from: a */
    public final int mo55885a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return this.f56196a.mo55885a(context, audioRecorderInterface);
    }

    /* renamed from: a */
    public final int mo55886a(Surface surface, String str) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        return this.f56196a.mo55886a(surface, str);
    }

    /* renamed from: a */
    public final int mo55887a(String str, int i, int i2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(bVar, "callback");
        return this.f56196a.mo55887a(str, i, i2, bVar);
    }

    /* renamed from: a */
    public final int mo55888a(List<ASMediaSegment> list, String str, String str2, int i) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        return this.f56196a.mo55888a(list, str, str2, i);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo55889a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        return this.f56196a.mo55889a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo55890a() {
        this.f56196a.mo55890a();
    }

    /* renamed from: a */
    public final void mo55891a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar) {
        C7562b<? super Integer, C7581n> bVar2 = bVar;
        C7573i.m23587b(bVar2, "callback");
        this.f56196a.mo55891a(d, z, f, i, i2, z2, bVar2);
    }

    /* renamed from: a */
    public final void mo55892a(float f) {
        this.f56196a.mo55892a(f);
    }

    /* renamed from: a */
    public final void mo55893a(float f, int i, int i2) {
        this.f56196a.mo55893a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo55894a(int i) {
        this.f56196a.mo55894a(i);
    }

    /* renamed from: a */
    public final void mo55895a(Surface surface) {
        this.f56196a.mo55895a(surface);
    }

    /* renamed from: a */
    public final void mo55896a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f56196a.mo55896a(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo55897a(C45393e eVar) {
        this.f56196a.mo55897a(eVar);
    }

    /* renamed from: a */
    public final void mo55898a(String str) {
        this.f56196a.mo55898a(str);
    }

    /* renamed from: a */
    public final void mo55899a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(compressFormat, "format");
        C7573i.m23587b(bVar, "callback");
        this.f56196a.mo55899a(str, i, i2, z, compressFormat, bVar);
    }

    /* renamed from: a */
    public final void mo55900a(String str, long j, long j2) {
        this.f56196a.mo55900a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo55901a(String str, String str2, boolean z, String str3, String str4, C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        this.f56196a.mo55901a(str, str2, z, str3, str4, bVar);
    }

    /* renamed from: a */
    public final void mo55902a(List<ASMediaSegment> list, String str, String str2, int i, C45210f fVar) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C7573i.m23587b(fVar, "listener");
        this.f56196a.mo55902a(list, str, str2, i, fVar);
    }

    /* renamed from: a */
    public final void mo55903a(C7562b<? super Integer, C7581n> bVar) {
        this.f56196a.mo55903a(bVar);
    }

    /* renamed from: a */
    public final void mo55904a(boolean z) {
        this.f56196a.mo55904a(z);
    }

    /* renamed from: b */
    public final int mo55905b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return this.f56196a.mo55905b(context, audioRecorderInterface);
    }

    /* renamed from: b */
    public final void mo55906b() {
        this.f56196a.mo55906b();
    }

    /* renamed from: b */
    public final void mo55907b(Surface surface) {
        C7573i.m23587b(surface, "surface");
        this.f56196a.mo55907b(surface);
    }

    /* renamed from: b */
    public final void mo55908b(Surface surface, String str) {
        this.f56196a.mo55908b(surface, str);
    }

    /* renamed from: b */
    public final void mo55909b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f56196a.mo55909b(surface, str, bVar);
    }

    /* renamed from: b */
    public final void mo55910b(C7562b<? super Integer, C7581n> bVar) {
        this.f56196a.mo55910b(bVar);
    }

    /* renamed from: b */
    public final boolean mo55911b(boolean z) {
        return this.f56196a.mo55911b(z);
    }

    /* renamed from: c */
    public final long mo55912c() {
        return this.f56196a.mo55912c();
    }

    /* renamed from: c */
    public final void mo55913c(boolean z) {
        this.f56196a.mo55913c(z);
    }

    /* renamed from: d */
    public final void mo55914d() {
        this.f56196a.mo55914d();
    }

    /* renamed from: d */
    public final void mo55915d(boolean z) {
        this.f56196a.mo55915d(z);
    }

    /* renamed from: e */
    public final void mo55916e() {
        this.f56196a.mo55916e();
    }

    /* renamed from: e */
    public final void mo55917e(boolean z) {
        this.f56196a.mo55917e(z);
    }

    /* renamed from: f */
    public final void mo55918f() {
        this.f56196a.mo55918f();
    }

    /* renamed from: g */
    public final long mo55919g() {
        return this.f56196a.mo55919g();
    }

    /* renamed from: h */
    public final boolean mo55920h() {
        return this.f56196a.mo55920h();
    }

    /* renamed from: i */
    public final void mo55921i() {
        this.f56196a.mo55921i();
    }

    /* renamed from: j */
    public final void mo55922j() {
        this.f56196a.mo55922j();
    }

    /* renamed from: k */
    public final void mo55923k() {
        this.f56196a.mo55923k();
    }

    public C20814h(C20676a aVar) {
        C7573i.m23587b(aVar, "ctrl");
        this.f56196a = aVar;
    }
}
