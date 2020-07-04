package com.bytedance.android.live.gson;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class RoomTypeAdapter implements C6708j<Room> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        return m12749b(kVar, type, iVar);
    }

    /* renamed from: b */
    private static Room m12749b(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        Room room = (Room) C2317a.m9933b().mo15971a(kVar, type);
        room.init();
        return room;
    }
}
