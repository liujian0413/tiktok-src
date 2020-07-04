package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.e */
public final class C24890e {

    /* renamed from: a */
    public static final C24890e f65634a = new C24890e();

    private C24890e() {
    }

    /* renamed from: a */
    public static final boolean m81674a(Loft loft) {
        boolean z;
        CharSequence charSequence;
        boolean z2;
        boolean z3;
        C7573i.m23587b(loft, "loft");
        CharSequence id = loft.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && loft.getAnimationRes() != null) {
            LoftAnimationRes animationRes = loft.getAnimationRes();
            Boolean bool = null;
            if (animationRes != null) {
                charSequence = animationRes.getDownloadUrl();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && loft.getVideoList() != null) {
                List videoList = loft.getVideoList();
                if (videoList != null) {
                    Collection collection = videoList;
                    if (collection == null || collection.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                }
                if (bool == null) {
                    C7573i.m23580a();
                }
                if (bool.booleanValue()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m81675b(Loft loft) {
        boolean z;
        C7573i.m23587b(loft, "loft");
        CharSequence id = loft.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || loft.getEndTime() == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - 259200000;
        Integer endTime = loft.getEndTime();
        if (endTime == null) {
            C7573i.m23580a();
        }
        if (currentTimeMillis > ((long) endTime.intValue()) * 1000 || loft.getStatus() == C24889d.f65632d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m81676c(Loft loft) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        C7573i.m23587b(loft, "loft");
        CharSequence id = loft.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || loft.getAnimationRes() == null || !m81674a(loft)) {
            return false;
        }
        LoftAnimationRes animationRes = loft.getAnimationRes();
        if (animationRes == null) {
            C7573i.m23580a();
        }
        CharSequence floatLeftTopUri = animationRes.getFloatLeftTopUri();
        if (floatLeftTopUri == null || floatLeftTopUri.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            CharSequence floatRightTopUri = animationRes.getFloatRightTopUri();
            if (floatRightTopUri == null || floatRightTopUri.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                CharSequence floatLeftBottomUri = animationRes.getFloatLeftBottomUri();
                if (floatLeftBottomUri == null || floatLeftBottomUri.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    CharSequence floatRightBottomUri = animationRes.getFloatRightBottomUri();
                    if (floatRightBottomUri == null || floatRightBottomUri.length() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        CharSequence backgroundUri = animationRes.getBackgroundUri();
                        if (backgroundUri == null || backgroundUri.length() == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            CharSequence goodsBackgroundUri = animationRes.getGoodsBackgroundUri();
                            if (goodsBackgroundUri == null || goodsBackgroundUri.length() == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z7) {
                                CharSequence goodsUri = animationRes.getGoodsUri();
                                if (goodsUri == null || goodsUri.length() == 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (!z8) {
                                    CharSequence logoLeftUri = animationRes.getLogoLeftUri();
                                    if (logoLeftUri == null || logoLeftUri.length() == 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        CharSequence logoRightUri = animationRes.getLogoRightUri();
                                        if (logoRightUri == null || logoRightUri.length() == 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (!z10) {
                                            return true;
                                        }
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
}
