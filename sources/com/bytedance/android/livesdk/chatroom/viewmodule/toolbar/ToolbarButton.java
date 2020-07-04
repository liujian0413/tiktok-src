package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import com.zhiliaoapp.musically.df_live_zego_link.R;

public enum ToolbarButton {
    INTERACTION(R.drawable.cga, R.drawable.cga),
    RED_ENVELOPE(R.drawable.cgh, R.drawable.cgh),
    PROMOTION_CARD(R.drawable.cge, R.drawable.cge),
    MORE(R.layout.az7),
    SHARE(R.drawable.cgm, R.drawable.cgl, R.string.fcl),
    BROADCAST_SHARE(R.drawable.cg4, R.drawable.cgl, R.string.fcl),
    MANAGE(R.drawable.cg2, R.drawable.cg1, R.string.f08),
    MANAGE_UNFOLD(R.layout.az6),
    SWITCH_SCREEN_ORIENTATION(R.drawable.cgp, R.drawable.cgo, R.string.f4l),
    GIFT_ANIMATION(R.drawable.cg_, R.drawable.cg_),
    RECORD(R.drawable.cgg, R.drawable.cgg),
    DECORATION(R.drawable.cg6, R.drawable.cg6, R.string.eqb),
    REVERSE_CAMERA(0, R.drawable.cgi, R.string.fbp),
    STICKER(0, R.drawable.cgn, R.string.f4h),
    BEAUTY(0, R.drawable.cgq, R.string.f43),
    FILTER(0, R.drawable.cgr, R.string.ekv),
    REVERSE_MIRROR(0, R.drawable.cgk, R.string.fbq),
    SWITCH_VIDEO_QUALITY(R.layout.az_),
    PUSH_URL(0, R.drawable.cgf, R.string.fac),
    FAST_GIFT(R.layout.az3),
    GIFT(R.layout.aue),
    BROADCAST_BARRAGE(R.drawable.c56, R.drawable.c56),
    BARRAGE(R.drawable.c6p, R.drawable.c6p),
    TURNTABLE(R.layout.az9),
    AUDIO_TOGGLE(R.drawable.c6o, R.drawable.c6o, R.string.f_9),
    RADIO_COVER(R.drawable.c7h, R.drawable.c7h),
    MESSAGE_PUSH(R.drawable.c88, R.drawable.c88, R.string.f75),
    GAME_QUIZ(R.drawable.cgw, 0),
    AUTO_REPLY(R.drawable.cg3, R.drawable.cg3, R.string.ebo),
    PK(R.layout.az8),
    GESTURE_MAGIC(0, R.drawable.cgs, R.string.esh),
    GOODS(R.drawable.ccj, R.drawable.ccz, R.string.f3j),
    RECHARGE_GUIDE(R.drawable.cbx, 0),
    CLOSE_ROOM(R.drawable.cbv, 0),
    PACKAGE_PURCHASE(R.layout.ay2),
    COMMERCE(R.layout.ayz),
    XG_GOODS(R.layout.aza),
    LOTTERY(R.drawable.cbw, 0),
    EMOTION(R.drawable.ci0, 0),
    DIVIDER(R.layout.avh),
    CHAT(R.drawable.cg5, 0),
    XT_LANDSCAPE_SHARE(R.drawable.ciq, R.drawable.cgl, R.string.fcl),
    SIGNAL(R.drawable.cdj, 0),
    PROMOTION_VIDEO(R.drawable.c4q, R.drawable.c4q, R.string.etl),
    HOUR_RANK(R.drawable.c62, 0),
    DUTY_GIFT(R.layout.az2),
    AUTO_CAR(R.layout.ald),
    DOUYIN_CLOSE(R.layout.az1),
    DOUYIN_GAME(R.drawable.c3j, R.drawable.cct, R.string.erv),
    VOTE(R.drawable.cca, R.drawable.cca, R.string.epb),
    XIGUA_GAME_QUIZ(R.drawable.ccf, R.drawable.ccf, R.string.fg8),
    INCOME_MORE(R.layout.az5),
    DOUYIN_OFFICIAL_IMMERSE(R.layout.avi),
    DOUYIN_OFFICIAL_QUALITY(R.layout.avj),
    DOUYIN_OFFICIAL_EFFECT(R.drawable.c0h, R.drawable.c0h),
    XT_GAMELIVE_INTERACTION(R.drawable.c6k, R.drawable.c6k, R.string.eoa),
    BROADCAST_TASK(R.drawable.blm, R.drawable.blm, R.string.ecd);
    
    private int drawableFolded;
    private int drawableUnfolded;
    private int layoutId;
    private int titleId;

    public final int getDrawableFolded() {
        return this.drawableFolded;
    }

    public final int getDrawableUnfolded() {
        return this.drawableUnfolded;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public final String getTag() {
        return getClass().getName();
    }

    private ToolbarButton(int i) {
        this.layoutId = R.layout.az0;
        this.layoutId = i;
    }

    private ToolbarButton(int i, int i2) {
        this(r7, r8, i, i2, 0);
    }

    private ToolbarButton(int i, int i2, int i3) {
        this.layoutId = R.layout.az0;
        this.drawableUnfolded = i;
        this.drawableFolded = i2;
        this.titleId = i3;
    }
}
