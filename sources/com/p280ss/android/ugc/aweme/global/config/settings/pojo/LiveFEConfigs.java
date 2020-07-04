package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveFEConfigs */
public final class LiveFEConfigs extends Message<LiveFEConfigs, Builder> {
    public static final DefaultValueProtoAdapter<LiveFEConfigs> ADAPTER = new ProtoAdapter_LiveFEConfigs();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel#ADAPTER", tag = 1)
    public final HonorLevel honor_level;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveFEConfigs$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LiveFEConfigs, Builder> {
        public HonorLevel honor_level;

        public final LiveFEConfigs build() {
            return new LiveFEConfigs(this.honor_level, super.buildUnknownFields());
        }

        public final Builder honor_level(HonorLevel honorLevel) {
            this.honor_level = honorLevel;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveFEConfigs$ProtoAdapter_LiveFEConfigs */
    static final class ProtoAdapter_LiveFEConfigs extends DefaultValueProtoAdapter<LiveFEConfigs> {
        public final LiveFEConfigs redact(LiveFEConfigs liveFEConfigs) {
            return liveFEConfigs;
        }

        public ProtoAdapter_LiveFEConfigs() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveFEConfigs.class);
        }

        public final LiveFEConfigs decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LiveFEConfigs) null);
        }

        public final int encodedSize(LiveFEConfigs liveFEConfigs) {
            return HonorLevel.ADAPTER.encodedSizeWithTag(1, liveFEConfigs.honor_level) + liveFEConfigs.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LiveFEConfigs liveFEConfigs) throws IOException {
            HonorLevel.ADAPTER.encodeWithTag(protoWriter, 1, liveFEConfigs.honor_level);
            protoWriter.writeBytes(liveFEConfigs.unknownFields());
        }

        public final LiveFEConfigs decode(ProtoReader protoReader, LiveFEConfigs liveFEConfigs) throws IOException {
            Builder builder;
            LiveFEConfigs liveFEConfigs2 = (LiveFEConfigs) C10938a.m32097a().mo26425a(LiveFEConfigs.class, liveFEConfigs);
            if (liveFEConfigs2 != null) {
                builder = liveFEConfigs2.newBuilder();
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
                        if (liveFEConfigs2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.honor_level((HonorLevel) HonorLevel.ADAPTER.decode(protoReader, builder.honor_level));
                }
            }
        }
    }

    public final HonorLevel getHonorLevel() throws NullValueException {
        if (this.honor_level != null) {
            return this.honor_level;
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
        if (this.honor_level != null) {
            i = this.honor_level.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.honor_level = this.honor_level;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.honor_level != null) {
            sb.append(", honor_level=");
            sb.append(this.honor_level);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveFEConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public LiveFEConfigs(HonorLevel honorLevel) {
        this(honorLevel, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveFEConfigs)) {
            return false;
        }
        LiveFEConfigs liveFEConfigs = (LiveFEConfigs) obj;
        if (!unknownFields().equals(liveFEConfigs.unknownFields()) || !Internal.equals(this.honor_level, liveFEConfigs.honor_level)) {
            return false;
        }
        return true;
    }

    public LiveFEConfigs(HonorLevel honorLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.honor_level = honorLevel;
    }
}
