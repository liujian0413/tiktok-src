package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4885ar;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4859j;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface PokemonApi {
    @C6457h(mo15740a = "/hotsoon/pokemon/get_anchor_pokemon_info_with_user/")
    C7492s<C3479d<C4859j>> getPokemonInfo(@C6474y(mo15757a = "anchor_id") long j, @C6474y(mo15757a = "user_id") long j2);

    @C6456g
    @C6468s(mo15750a = "/hotsoon/pokemon/send_pokemon_to_anchor/")
    C7492s<C3479d<C4885ar>> sendPokemon(@C6454e(mo15737a = "anchor_id") long j, @C6454e(mo15737a = "gift_id") long j2, @C6454e(mo15737a = "room_id") long j3);

    @C6457h(mo15740a = "/hotsoon/pokemon/try_to_show_pokemon/")
    C7492s<C3479d<Object>> showPokemonTip(@C6474y(mo15757a = "anchor_id") long j);
}
