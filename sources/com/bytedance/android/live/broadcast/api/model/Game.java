package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.C3339m;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p276a.C6593c;

public class Game {
    @C6593c(mo15949a = "game_id")
    public long gameId;
    @C6593c(mo15949a = "icon")
    public ImageModel icon;
    @C6593c(mo15949a = "name")
    public String name;

    public String toJsonString() {
        if (C3339m.m12453c() != null) {
            return C3339m.m12453c().mo15979b((Object) this);
        }
        return C2317a.m9932a().mo15979b((Object) this);
    }

    public static Game fromJson(String str) {
        try {
            if (C3339m.m12453c() != null) {
                return (Game) C3339m.m12453c().mo15974a(str, Game.class);
            }
            return (Game) C2317a.m9932a().mo15974a(str, Game.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
