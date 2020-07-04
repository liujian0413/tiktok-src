package com.bytedance.android.livesdk.chatroom.interact.model;

import com.google.gson.p276a.C6593c;

public class RivalExtraInfo {
    @C6593c(mo15949a = "text")

    /* renamed from: a */
    public String f13721a;
    @C6593c(mo15949a = "text_type")

    /* renamed from: b */
    public int f13722b;
    @C6593c(mo15949a = "label")

    /* renamed from: c */
    public String f13723c;
    @C6593c(mo15949a = "anchor_layer")

    /* renamed from: d */
    public int f13724d;

    public enum AnchorLayer {
        AnchorLayerUnknown,
        AnchorLayerTop,
        AnchorLayerSMALL
    }

    public enum TextType {
        TextTypeUnknown,
        CurRoomFanTicket,
        TotalDiamondCount,
        Distance,
        DistanceCity
    }
}
