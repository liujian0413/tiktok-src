package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting */
public final class LiveCnySetting extends Message<LiveCnySetting, Builder> {
    public static final DefaultValueProtoAdapter<LiveCnySetting> ADAPTER = new ProtoAdapter_LiveCnySetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean force_update_room;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LiveCnySetting, Builder> {
        public Boolean force_update_room = Boolean.valueOf(true);

        public final LiveCnySetting build() {
            return new LiveCnySetting(this.force_update_room, super.buildUnknownFields());
        }

        public final Builder force_update_room(Boolean bool) {
            this.force_update_room = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting$ProtoAdapter_LiveCnySetting */
    static final class ProtoAdapter_LiveCnySetting extends DefaultValueProtoAdapter<LiveCnySetting> {
        public final LiveCnySetting redact(LiveCnySetting liveCnySetting) {
            return liveCnySetting;
        }

        public ProtoAdapter_LiveCnySetting() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveCnySetting.class);
        }

        public final LiveCnySetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LiveCnySetting) null);
        }

        public final int encodedSize(LiveCnySetting liveCnySetting) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, liveCnySetting.force_update_room) + liveCnySetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LiveCnySetting liveCnySetting) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, liveCnySetting.force_update_room);
            protoWriter.writeBytes(liveCnySetting.unknownFields());
        }

        public final LiveCnySetting decode(ProtoReader protoReader, LiveCnySetting liveCnySetting) throws IOException {
            Builder builder;
            LiveCnySetting liveCnySetting2 = (LiveCnySetting) C10938a.m32097a().mo26425a(LiveCnySetting.class, liveCnySetting);
            if (liveCnySetting2 != null) {
                builder = liveCnySetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (liveCnySetting2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.force_update_room((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final Boolean getForceUpdateRoom() throws NullValueException {
        if (this.force_update_room != null) {
            return this.force_update_room;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.force_update_room != null) {
            i = this.force_update_room.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.force_update_room = this.force_update_room;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.force_update_room != null) {
            sb.append(", force_update_room=");
            sb.append(this.force_update_room);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveCnySetting{");
        replace.append('}');
        return replace.toString();
    }

    public LiveCnySetting(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCnySetting)) {
            return false;
        }
        LiveCnySetting liveCnySetting = (LiveCnySetting) obj;
        if (!unknownFields().equals(liveCnySetting.unknownFields()) || !Internal.equals(this.force_update_room, liveCnySetting.force_update_room)) {
            return false;
        }
        return true;
    }

    public LiveCnySetting(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.force_update_room = bool;
    }
}
