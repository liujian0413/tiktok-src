package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.interact.data.C4759a;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.List;
import p346io.reactivex.C7492s;

public interface LinkPKApi {
    @C6457h(mo15740a = "/webcast/linkmic/battle/auto_match/")
    C7492s<C3479d<LinkAutoMatchModel>> autoMatch(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "is_first") int i, @C6474y(mo15757a = "match_type") int i2, @C6474y(mo15757a = "sub_type") int i3);

    @C6457h(mo15740a = "/webcast/linkmic/battle/invite/")
    C7492s<C3479d<Void>> battleInvite(@C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/battle/reject/")
    C7492s<C3479d<Void>> battleReject(@C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/battle/stats/")
    C7492s<C3479d<C9380q>> battleStats(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "anchor_id") long j2);

    @C6457h(mo15740a = "/webcast/linkmic/battle/cancel_match/")
    C7492s<C3479d<Void>> cancleMatch();

    @C6457h(mo15740a = "/webcast/linkmic/battle/cut_short_count/")
    C7492s<C3479d<Object>> cutShortCount();

    @C6457h(mo15740a = "/webcast/linkmic/battle/finish/")
    C7492s<C3479d<Void>> finish(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "battle_source") int i, @C6474y(mo15757a = "is_cut_short") int i2, @C6474y(mo15757a = "sub_type") long j2);

    @C6457h(mo15740a = "/hotsoon/linkmic/v3/battle/mode_finish/")
    C7492s<C3479d<C4759a>> finishMode(@C6474y(mo15757a = "mode") int i, @C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/hotsoon/linkmic/v3/battle/mode_get/")
    C7492s<C3479d<List<Object>>> getMode(@C6474y(mo15757a = "mode") int i);

    @C6457h(mo15740a = "/webcast/linkmic/battle/open/")
    C7492s<C3479d<Void>> openBattle(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "duration") int i, @C6474y(mo15757a = "match_type") int i2, @C6474y(mo15757a = "theme") String str);

    @C6457h(mo15740a = "/hotsoon/linkmic/v3/battle/mode_set/")
    C7492s<C3479d<Void>> setMode(@C6474y(mo15757a = "mode") int i, @C6474y(mo15757a = "open") int i2);

    @C6457h(mo15740a = "/hotsoon/linkmic/v3/battle/mode_start/")
    C7492s<C3479d<Void>> startMode(@C6474y(mo15757a = "mode") int i, @C6474y(mo15757a = "channel_id") long j);
}
