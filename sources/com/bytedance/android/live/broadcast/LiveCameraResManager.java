package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C1942b;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public enum LiveCameraResManager {
    INST;
    
    private static final String BEAUTY_FILE_NAME = null;
    private static final String BEAUTY_FILE_NAME_COMPOSER = null;
    private static final String BEAUTY_FILE_NAME_COMPOSER_QINGYAN = null;
    private static final String BEAUTY_FILE_NAME_QINGYAN = null;
    private static final String EFFECT_COMPOSER = null;
    private static final String FACE_DETECTION_FILE_NAME = null;
    private static final String FACE_DETECTION_FILE_V3_NAME = null;
    private static final String FILTER_DIRECTORY = null;
    private static final String FILTER_FILE_NAME = null;
    private static final String[] FOLDER_RES_FILES = null;
    private static final String RESHAPE_COMPOSER_FILE_NAME = null;
    private static final String RESHAPE_COMPOSER_QINYAN_FILE_NAME = null;
    private static final String[] RES_FILES = null;
    private static final String[] RES_NOT_UNZIP_FILES = null;
    private static final String ROI = null;
    private static String sLiveCameraResStoragePath;
    public C0052o<Boolean> isLoadedRes;
    private boolean isLoadingRes;
    private String lastTimeFailedReason;
    private final Map<String, Object> monitorExtra;

    public final String getLastTimeFailedReason() {
        return this.lastTimeFailedReason;
    }

    public final String getBeautyComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(BEAUTY_FILE_NAME_COMPOSER);
        return sb.toString();
    }

    public final String getBeautyFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(BEAUTY_FILE_NAME);
        String sb2 = sb.toString();
        if (C3388h.m12606a(sb2)) {
            return sb2;
        }
        return "";
    }

    public final String getFaceReshapeFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(FACE_DETECTION_FILE_NAME);
        return sb.toString();
    }

    public final String getFilterFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(FILTER_FILE_NAME);
        return sb.toString();
    }

    public final String getLiveComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(EFFECT_COMPOSER);
        return sb.toString();
    }

    public final String getModelFilePath() {
        if (((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).getHostModeFilePath() != null) {
            return ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).getHostModeFilePath();
        }
        return sLiveCameraResStoragePath;
    }

    public final String getROIResPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(ROI);
        return sb.toString();
    }

    public final String getReshapeComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(RESHAPE_COMPOSER_FILE_NAME);
        return sb.toString();
    }

    public final boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.20".equals(C8946b.f24479i.mo22117a())));
        }
        return ((Boolean) this.isLoadedRes.getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void loadResources() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isLoadingRes     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            java.lang.String r0 = "0.0.20"
            com.bytedance.android.livesdk.sharedpref.c<java.lang.String> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24479i     // Catch:{ all -> 0x0075 }
            java.lang.Object r1 = r1.mo22117a()     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0075 }
            r1 = 1
            if (r0 == 0) goto L_0x0046
            android.arch.lifecycle.o<java.lang.Boolean> r0 = r4.isLoadedRes     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x002c
            android.arch.lifecycle.o<java.lang.Boolean> r0 = r4.isLoadedRes     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0075 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0044
        L_0x002c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0075 }
            io.reactivex.s r0 = p346io.reactivex.C7492s.m23301b(r0)     // Catch:{ all -> 0x0075 }
            io.reactivex.z r1 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()     // Catch:{ all -> 0x0075 }
            io.reactivex.s r0 = r0.mo19294a(r1)     // Catch:{ all -> 0x0075 }
            com.bytedance.android.live.broadcast.o r1 = new com.bytedance.android.live.broadcast.o     // Catch:{ all -> 0x0075 }
            r1.<init>(r4)     // Catch:{ all -> 0x0075 }
            r0.mo19325f(r1)     // Catch:{ all -> 0x0075 }
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            r4.isLoadingRes = r1     // Catch:{ all -> 0x0075 }
            com.bytedance.android.live.broadcast.p r0 = new com.bytedance.android.live.broadcast.p     // Catch:{ all -> 0x0075 }
            r0.<init>(r4)     // Catch:{ all -> 0x0075 }
            io.reactivex.e r0 = p346io.reactivex.C7329e.m22975a(r0)     // Catch:{ all -> 0x0075 }
            io.reactivex.z r1 = p346io.reactivex.p351i.C7333a.m23044b()     // Catch:{ all -> 0x0075 }
            io.reactivex.e r0 = r0.mo19159b(r1)     // Catch:{ all -> 0x0075 }
            io.reactivex.z r1 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()     // Catch:{ all -> 0x0075 }
            io.reactivex.e r0 = r0.mo19152a(r1)     // Catch:{ all -> 0x0075 }
            com.bytedance.android.live.broadcast.q r1 = new com.bytedance.android.live.broadcast.q     // Catch:{ all -> 0x0075 }
            r1.<init>(r4)     // Catch:{ all -> 0x0075 }
            com.bytedance.android.live.broadcast.r r2 = new com.bytedance.android.live.broadcast.r     // Catch:{ all -> 0x0075 }
            r2.<init>(r4)     // Catch:{ all -> 0x0075 }
            com.bytedance.android.live.broadcast.s r3 = new com.bytedance.android.live.broadcast.s     // Catch:{ all -> 0x0075 }
            r3.<init>(r4)     // Catch:{ all -> 0x0075 }
            r0.mo19143a(r1, r2, r3)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.LiveCameraResManager.loadResources():void");
    }

    static {
        FILTER_DIRECTORY = C3358ac.m12515a((int) R.string.f2m);
        EFFECT_COMPOSER = C3358ac.m12515a((int) R.string.f2l);
        FACE_DETECTION_FILE_NAME = C3358ac.m12515a((int) R.string.f2q);
        FACE_DETECTION_FILE_V3_NAME = C3358ac.m12515a((int) R.string.f2r);
        FILTER_FILE_NAME = C3358ac.m12515a((int) R.string.f2t);
        BEAUTY_FILE_NAME = C3358ac.m12515a((int) R.string.f2g);
        BEAUTY_FILE_NAME_QINGYAN = C3358ac.m12515a((int) R.string.f2j);
        BEAUTY_FILE_NAME_COMPOSER_QINGYAN = C3358ac.m12515a((int) R.string.f2e);
        BEAUTY_FILE_NAME_COMPOSER = C3358ac.m12515a((int) R.string.f2d);
        RESHAPE_COMPOSER_FILE_NAME = C3358ac.m12515a((int) R.string.f2v);
        RESHAPE_COMPOSER_QINYAN_FILE_NAME = C3358ac.m12515a((int) R.string.f2x);
        ROI = C3358ac.m12515a((int) R.string.f2y);
        String[] f = C3358ac.m12530f(R.array.al);
        RES_FILES = new String[f.length];
        for (int i = 0; i < f.length; i++) {
            String[] strArr = RES_FILES;
            StringBuilder sb = new StringBuilder();
            sb.append(f[i]);
            sb.append(".zip");
            strArr[i] = sb.toString();
        }
        FOLDER_RES_FILES = C3358ac.m12530f(R.array.am);
        RES_NOT_UNZIP_FILES = C3358ac.m12530f(R.array.ap);
        File dir = C3358ac.m12528e().getDir(FILTER_DIRECTORY, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dir.getAbsolutePath());
        sb2.append(File.separator);
        sLiveCameraResStoragePath = sb2.toString();
    }

    private boolean load() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        AssetManager assets = C3358ac.m12528e().getAssets();
        boolean z = true;
        for (String str : RES_FILES) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(sLiveCameraResStoragePath);
                sb.append(File.separator);
                sb.append(str);
                copy(assets, str, sb.toString());
            } catch (IOException e) {
                this.monitorExtra.put("copy_res_file_error", e.toString());
                C3166a.m11963b("LiveCameraResManager", (Throwable) e);
                z = false;
            }
        }
        for (String str2 : FOLDER_RES_FILES) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sLiveCameraResStoragePath);
                sb2.append(File.separator);
                sb2.append(str2);
                copyDir(assets, str2, sb2.toString());
            } catch (IOException e2) {
                this.monitorExtra.put("copy_res_folder_error", e2.toString());
                C3166a.m11963b("LiveCameraResManager", (Throwable) e2);
                z = false;
            }
        }
        for (String str3 : RES_NOT_UNZIP_FILES) {
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sLiveCameraResStoragePath);
                sb3.append(File.separator);
                sb3.append(str3);
                copy(assets, str3, sb3.toString());
            } catch (IOException e3) {
                this.monitorExtra.put("copy_res_file_error", e3.toString());
                C3166a.m11963b("LiveCameraResManager", (Throwable) e3);
                z = false;
            }
        }
        for (String unzip : RES_FILES) {
            try {
                unzip(unzip);
            } catch (IOException e4) {
                this.monitorExtra.put("unzip_res_file_error", e4.toString());
                C3166a.m11963b("LiveCameraResManager", (Throwable) e4);
                z = false;
            }
        }
        return z;
    }

    private void unzip(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(sLiveCameraResStoragePath);
        sb.append(str);
        C3388h.m12603a(sb.toString(), sLiveCameraResStoragePath);
    }

    public final C1942b getResourceFinder(Context context) {
        C1942b resourceFinder = ((IHostContext) C3596c.m13172a(IHostContext.class)).getResourceFinder();
        if (resourceFinder == null) {
            return new AssetResourceFinder(context.getAssets(), INST.getModelFilePath());
        }
        return resourceFinder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copy(android.content.res.AssetManager r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ all -> 0x0058 }
            okio.Source r5 = okio.Okio.source(r4)     // Catch:{ all -> 0x0053 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x004f }
            r1.<init>(r6)     // Catch:{ all -> 0x004f }
            boolean r6 = r1.exists()     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x001e
            r1.delete()     // Catch:{ all -> 0x004f }
        L_0x001e:
            okio.Sink r6 = okio.Okio.sink(r1)     // Catch:{ all -> 0x004f }
            okio.BufferedSink r1 = okio.Okio.buffer(r6)     // Catch:{ all -> 0x0049 }
            r1.writeAll(r5)     // Catch:{ all -> 0x0042 }
            r1.flush()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            if (r6 == 0) goto L_0x0036
            r6.close()
        L_0x0036:
            if (r5 == 0) goto L_0x003b
            r5.close()
        L_0x003b:
            if (r4 == 0) goto L_0x0041
            r4.close()
            return
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            r2 = r1
            r1 = r4
            r4 = r6
            r6 = r0
            r0 = r2
            goto L_0x005c
        L_0x0049:
            r1 = move-exception
            r2 = r1
            r1 = r4
            r4 = r6
            r6 = r2
            goto L_0x005c
        L_0x004f:
            r6 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x005c
        L_0x0053:
            r6 = move-exception
            r1 = r4
            r4 = r0
            r5 = r4
            goto L_0x005c
        L_0x0058:
            r6 = move-exception
            r4 = r0
            r5 = r4
            r1 = r5
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            r0.close()
        L_0x0061:
            if (r4 == 0) goto L_0x0066
            r4.close()
        L_0x0066:
            if (r5 == 0) goto L_0x006b
            r5.close()
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()
        L_0x0070:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.LiveCameraResManager.copy(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    private void copyDir(AssetManager assetManager, String str, String str2) throws IOException {
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(str3);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(File.separator);
                sb3.append(str3);
                copyDir(assetManager, sb2, sb3.toString());
            }
            return;
        }
        copy(assetManager, str, str2);
    }
}
