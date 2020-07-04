package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Application;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicState */
public final class RecordChooseMusicState implements C11670t {
    private final Pair<Float, Float> chooseMusicAlphaAnim;
    private final boolean chooseMusicEnable;
    private final boolean chooseMusicVisible;
    private final int ivChooseMusicAlpha;
    private final Drawable ivChooseMusicDrawable;
    private final boolean ivChooseMusicVisible;
    private final float tvChooseMusicAlpha;
    private final boolean tvChooseMusicClickable;
    private final String tvChooseMusicText;
    private final boolean tvChooseMusicVisible;

    public RecordChooseMusicState() {
        this(0.0f, 0, null, false, false, false, null, false, false, null, 1023, null);
    }

    public static /* synthetic */ RecordChooseMusicState copy$default(RecordChooseMusicState recordChooseMusicState, float f, int i, String str, boolean z, boolean z2, boolean z3, Drawable drawable, boolean z4, boolean z5, Pair pair, int i2, Object obj) {
        RecordChooseMusicState recordChooseMusicState2 = recordChooseMusicState;
        int i3 = i2;
        return recordChooseMusicState.copy((i3 & 1) != 0 ? recordChooseMusicState2.tvChooseMusicAlpha : f, (i3 & 2) != 0 ? recordChooseMusicState2.ivChooseMusicAlpha : i, (i3 & 4) != 0 ? recordChooseMusicState2.tvChooseMusicText : str, (i3 & 8) != 0 ? recordChooseMusicState2.ivChooseMusicVisible : z, (i3 & 16) != 0 ? recordChooseMusicState2.tvChooseMusicVisible : z2, (i3 & 32) != 0 ? recordChooseMusicState2.tvChooseMusicClickable : z3, (i3 & 64) != 0 ? recordChooseMusicState2.ivChooseMusicDrawable : drawable, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? recordChooseMusicState2.chooseMusicEnable : z4, (i3 & 256) != 0 ? recordChooseMusicState2.chooseMusicVisible : z5, (i3 & 512) != 0 ? recordChooseMusicState2.chooseMusicAlphaAnim : pair);
    }

    public final float component1() {
        return this.tvChooseMusicAlpha;
    }

    public final Pair<Float, Float> component10() {
        return this.chooseMusicAlphaAnim;
    }

    public final int component2() {
        return this.ivChooseMusicAlpha;
    }

    public final String component3() {
        return this.tvChooseMusicText;
    }

    public final boolean component4() {
        return this.ivChooseMusicVisible;
    }

    public final boolean component5() {
        return this.tvChooseMusicVisible;
    }

    public final boolean component6() {
        return this.tvChooseMusicClickable;
    }

    public final Drawable component7() {
        return this.ivChooseMusicDrawable;
    }

    public final boolean component8() {
        return this.chooseMusicEnable;
    }

    public final boolean component9() {
        return this.chooseMusicVisible;
    }

    public final RecordChooseMusicState copy(float f, int i, String str, boolean z, boolean z2, boolean z3, Drawable drawable, boolean z4, boolean z5, Pair<Float, Float> pair) {
        String str2 = str;
        C7573i.m23587b(str, "tvChooseMusicText");
        RecordChooseMusicState recordChooseMusicState = new RecordChooseMusicState(f, i, str2, z, z2, z3, drawable, z4, z5, pair);
        return recordChooseMusicState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordChooseMusicState) {
                RecordChooseMusicState recordChooseMusicState = (RecordChooseMusicState) obj;
                if (Float.compare(this.tvChooseMusicAlpha, recordChooseMusicState.tvChooseMusicAlpha) == 0) {
                    if ((this.ivChooseMusicAlpha == recordChooseMusicState.ivChooseMusicAlpha) && C7573i.m23585a((Object) this.tvChooseMusicText, (Object) recordChooseMusicState.tvChooseMusicText)) {
                        if (this.ivChooseMusicVisible == recordChooseMusicState.ivChooseMusicVisible) {
                            if (this.tvChooseMusicVisible == recordChooseMusicState.tvChooseMusicVisible) {
                                if ((this.tvChooseMusicClickable == recordChooseMusicState.tvChooseMusicClickable) && C7573i.m23585a((Object) this.ivChooseMusicDrawable, (Object) recordChooseMusicState.ivChooseMusicDrawable)) {
                                    if (this.chooseMusicEnable == recordChooseMusicState.chooseMusicEnable) {
                                        if (!(this.chooseMusicVisible == recordChooseMusicState.chooseMusicVisible) || !C7573i.m23585a((Object) this.chooseMusicAlphaAnim, (Object) recordChooseMusicState.chooseMusicAlphaAnim)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Pair<Float, Float> getChooseMusicAlphaAnim() {
        return this.chooseMusicAlphaAnim;
    }

    public final boolean getChooseMusicEnable() {
        return this.chooseMusicEnable;
    }

    public final boolean getChooseMusicVisible() {
        return this.chooseMusicVisible;
    }

    public final int getIvChooseMusicAlpha() {
        return this.ivChooseMusicAlpha;
    }

    public final Drawable getIvChooseMusicDrawable() {
        return this.ivChooseMusicDrawable;
    }

    public final boolean getIvChooseMusicVisible() {
        return this.ivChooseMusicVisible;
    }

    public final float getTvChooseMusicAlpha() {
        return this.tvChooseMusicAlpha;
    }

    public final boolean getTvChooseMusicClickable() {
        return this.tvChooseMusicClickable;
    }

    public final String getTvChooseMusicText() {
        return this.tvChooseMusicText;
    }

    public final boolean getTvChooseMusicVisible() {
        return this.tvChooseMusicVisible;
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.tvChooseMusicAlpha) * 31) + this.ivChooseMusicAlpha) * 31;
        String str = this.tvChooseMusicText;
        int i = 0;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.ivChooseMusicVisible;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.tvChooseMusicVisible;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.tvChooseMusicClickable;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        Drawable drawable = this.ivChooseMusicDrawable;
        int hashCode2 = (i4 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        boolean z4 = this.chooseMusicEnable;
        if (z4) {
            z4 = true;
        }
        int i5 = (hashCode2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.chooseMusicVisible;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        Pair<Float, Float> pair = this.chooseMusicAlphaAnim;
        if (pair != null) {
            i = pair.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordChooseMusicState(tvChooseMusicAlpha=");
        sb.append(this.tvChooseMusicAlpha);
        sb.append(", ivChooseMusicAlpha=");
        sb.append(this.ivChooseMusicAlpha);
        sb.append(", tvChooseMusicText=");
        sb.append(this.tvChooseMusicText);
        sb.append(", ivChooseMusicVisible=");
        sb.append(this.ivChooseMusicVisible);
        sb.append(", tvChooseMusicVisible=");
        sb.append(this.tvChooseMusicVisible);
        sb.append(", tvChooseMusicClickable=");
        sb.append(this.tvChooseMusicClickable);
        sb.append(", ivChooseMusicDrawable=");
        sb.append(this.ivChooseMusicDrawable);
        sb.append(", chooseMusicEnable=");
        sb.append(this.chooseMusicEnable);
        sb.append(", chooseMusicVisible=");
        sb.append(this.chooseMusicVisible);
        sb.append(", chooseMusicAlphaAnim=");
        sb.append(this.chooseMusicAlphaAnim);
        sb.append(")");
        return sb.toString();
    }

    public RecordChooseMusicState(float f, int i, String str, boolean z, boolean z2, boolean z3, Drawable drawable, boolean z4, boolean z5, Pair<Float, Float> pair) {
        C7573i.m23587b(str, "tvChooseMusicText");
        this.tvChooseMusicAlpha = f;
        this.ivChooseMusicAlpha = i;
        this.tvChooseMusicText = str;
        this.ivChooseMusicVisible = z;
        this.tvChooseMusicVisible = z2;
        this.tvChooseMusicClickable = z3;
        this.ivChooseMusicDrawable = drawable;
        this.chooseMusicEnable = z4;
        this.chooseMusicVisible = z5;
        this.chooseMusicAlphaAnim = pair;
    }

    public /* synthetic */ RecordChooseMusicState(float f, int i, String str, boolean z, boolean z2, boolean z3, Drawable drawable, boolean z4, boolean z5, Pair pair, int i2, C7571f fVar) {
        float f2;
        int i3;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        Drawable drawable2;
        boolean z9;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i4 & 2) != 0) {
            i3 = NormalGiftView.ALPHA_255;
        } else {
            i3 = i;
        }
        if ((i4 & 4) != 0) {
            Application application = C35563c.f93238a;
            C7573i.m23582a((Object) application, "AVEnv.application");
            str2 = application.getResources().getString(R.string.a3q);
            C7573i.m23582a((Object) str2, "AVEnv.application.resour…ng(R.string.choose_music)");
        } else {
            str2 = str;
        }
        boolean z10 = true;
        if ((i4 & 8) != 0) {
            z6 = true;
        } else {
            z6 = z;
        }
        if ((i4 & 16) != 0) {
            z7 = true;
        } else {
            z7 = z2;
        }
        if ((i4 & 32) != 0) {
            z8 = true;
        } else {
            z8 = z3;
        }
        Pair pair2 = null;
        if ((i4 & 64) != 0) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if ((i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            z9 = true;
        } else {
            z9 = z4;
        }
        if ((i4 & 256) == 0) {
            z10 = z5;
        }
        if ((i4 & 512) == 0) {
            pair2 = pair;
        }
        this(f2, i3, str2, z6, z7, z8, drawable2, z9, z10, pair2);
    }
}
