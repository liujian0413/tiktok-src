package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1592h;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p */
public final class C40808p {

    /* renamed from: a */
    public static final C40808p f106130a = new C40808p();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p$a */
    static final class C40809a<T> implements C0053p<LiveDataWrapper<CategoryPageModel>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerViewModel f106131a;

        C40809a(InfoStickerViewModel infoStickerViewModel) {
            this.f106131a = infoStickerViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(final LiveDataWrapper<CategoryPageModel> liveDataWrapper) {
            if (liveDataWrapper != null && STATUS.SUCCESS == liveDataWrapper.f88768b) {
                C1592h.m7853a((Callable<TResult>) new Callable<TResult>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40809a f106132a;

                    {
                        this.f106132a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        m130421a();
                        return C7581n.f20898a;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
                    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    private void m130421a() {
                        /*
                            r13 = this;
                            com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper r0 = r3
                            M r0 = r0.f88767a
                            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = (com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r0
                            r1 = 0
                            if (r0 == 0) goto L_0x0010
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r2 = r0.category_effects
                            if (r2 == 0) goto L_0x0010
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = r2.effects
                            goto L_0x0011
                        L_0x0010:
                            r2 = r1
                        L_0x0011:
                            com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40808p.m130419a(r2)
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            if (r0 == 0) goto L_0x0039
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r3 = r0.category_effects
                            if (r3 == 0) goto L_0x0039
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r3.effects
                            if (r3 == 0) goto L_0x0039
                            java.lang.Iterable r3 = (java.lang.Iterable) r3
                            java.util.Iterator r3 = r3.iterator()
                        L_0x0029:
                            boolean r4 = r3.hasNext()
                            if (r4 == 0) goto L_0x0039
                            java.lang.Object r4 = r3.next()
                            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r4
                            com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40808p.m130418a(r4, r2)
                            goto L_0x0029
                        L_0x0039:
                            java.util.ArrayList r3 = com.p280ss.android.ugc.aweme.beauty.C23544m.m77323b(r2)
                            java.lang.Iterable r3 = (java.lang.Iterable) r3
                            java.util.Iterator r4 = r3.iterator()
                        L_0x0043:
                            boolean r5 = r4.hasNext()
                            if (r5 == 0) goto L_0x005b
                            java.lang.Object r5 = r4.next()
                            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r5 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r5
                            if (r5 == 0) goto L_0x0056
                            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r5.getUlikeBeautyExtra()
                            goto L_0x0057
                        L_0x0056:
                            r5 = r1
                        L_0x0057:
                            com.p280ss.android.ugc.aweme.beauty.C23544m.m77319a(r5)
                            goto L_0x0043
                        L_0x005b:
                            if (r0 == 0) goto L_0x0064
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = r0.category_effects
                            if (r4 == 0) goto L_0x0064
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = r4.effects
                            goto L_0x0065
                        L_0x0064:
                            r4 = r1
                        L_0x0065:
                            if (r4 == 0) goto L_0x00d4
                            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p$a r4 = r13.f106132a
                            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r4 = r4.f106131a
                            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.category_effects
                            r5 = 1
                            if (r0 == 0) goto L_0x00ca
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r0.effects
                            if (r0 == 0) goto L_0x00ca
                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                            java.util.ArrayList r6 = new java.util.ArrayList
                            r6.<init>()
                            java.util.Collection r6 = (java.util.Collection) r6
                            java.util.Iterator r0 = r0.iterator()
                        L_0x0081:
                            boolean r7 = r0.hasNext()
                            if (r7 == 0) goto L_0x00c7
                            java.lang.Object r7 = r0.next()
                            r8 = r7
                            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r8
                            java.util.Iterator r9 = r3.iterator()
                        L_0x0092:
                            boolean r10 = r9.hasNext()
                            if (r10 == 0) goto L_0x00bb
                            java.lang.Object r10 = r9.next()
                            r11 = r10
                            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r11 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r11
                            if (r11 == 0) goto L_0x00a6
                            java.lang.String r11 = r11.getEffectId()
                            goto L_0x00a7
                        L_0x00a6:
                            r11 = r1
                        L_0x00a7:
                            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                            java.lang.String r12 = "effect"
                            kotlin.jvm.internal.C7573i.m23582a(r8, r12)
                            java.lang.String r12 = r8.getEffectId()
                            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                            boolean r11 = android.text.TextUtils.equals(r11, r12)
                            if (r11 == 0) goto L_0x0092
                            goto L_0x00bc
                        L_0x00bb:
                            r10 = r1
                        L_0x00bc:
                            if (r10 == 0) goto L_0x00c0
                            r8 = 1
                            goto L_0x00c1
                        L_0x00c0:
                            r8 = 0
                        L_0x00c1:
                            if (r8 == 0) goto L_0x0081
                            r6.add(r7)
                            goto L_0x0081
                        L_0x00c7:
                            r1 = r6
                            java.util.List r1 = (java.util.List) r1
                        L_0x00ca:
                            r4.mo100816a(r1, r5)
                            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p$a r0 = r13.f106132a
                            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r0 = r0.f106131a
                            r0.mo100817a(r5)
                        L_0x00d4:
                            com.p280ss.android.ugc.aweme.beauty.C23540j.m77316a(r2)
                            com.p280ss.android.ugc.aweme.beauty.C23544m.m77320a(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40808p.C40809a.C408101.m130421a():void");
                    }
                });
            }
        }
    }

    private C40808p() {
    }

    /* renamed from: a */
    public static final void m130417a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        if (C35574k.m114859a().mo70091f().mo93342a(Property.UlikeBeautyDownloadEnable)) {
            InfoStickerViewModel a = C40805n.m130407a(fragmentActivity);
            C7573i.m23582a((Object) a, "InfoStickerModule.obtainViewModel(activity)");
            a.mo100820b("beautify", "all", 75, 0, 0, "").observe(fragmentActivity, new C40809a(a));
        }
    }

    /* renamed from: a */
    public static void m130419a(List<? extends Effect> list) {
        if (list != null && !list.isEmpty()) {
            for (Effect effect : list) {
                StringBuilder sb = new StringBuilder();
                File file = EffectPlatform.f72449a;
                C7573i.m23582a((Object) file, "EffectPlatform.LOCAL_CACHEDIR");
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
                sb.append(effect.getId());
                sb.append(".zip");
                effect.setZipPath(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                File file2 = EffectPlatform.f72449a;
                C7573i.m23582a((Object) file2, "EffectPlatform.LOCAL_CACHEDIR");
                sb2.append(file2.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append(effect.getId());
                effect.setUnzipPath(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m130418a(Effect effect, ArrayList<UlikeBeautyData> arrayList) {
        CharSequence charSequence;
        String str;
        String str2;
        String str3 = null;
        if (effect != null) {
            charSequence = effect.getExtra();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                C6600e S = C35574k.m114859a().mo70085S();
                if (effect != null) {
                    str = effect.getExtra();
                } else {
                    str = null;
                }
                ComposerBeautyExtra composerBeautyExtra = (ComposerBeautyExtra) S.mo15974a(str, ComposerBeautyExtra.class);
                if (effect != null) {
                    str2 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                if (effect != null) {
                    str3 = effect.getEffectId();
                }
                arrayList.add(new UlikeBeautyData(composerBeautyExtra, str2, str3));
            } catch (JsonSyntaxException unused) {
            }
        }
    }
}
