package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreativeKitShareStart extends Message<CreativeKitShareStart, Builder> {
    public static final ProtoAdapter<CreativeKitShareStart> ADAPTER = new ProtoAdapter_CreativeKitShareStart();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase#ADAPTER", tag = 1)
    public final CreativeKitEventBase creative_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<CreativeKitShareStart, Builder> {
        public CreativeKitEventBase creative_kit_event_base;

        public final CreativeKitShareStart build() {
            return new CreativeKitShareStart(this.creative_kit_event_base, super.buildUnknownFields());
        }

        public final Builder creative_kit_event_base(CreativeKitEventBase creativeKitEventBase) {
            this.creative_kit_event_base = creativeKitEventBase;
            return this;
        }
    }

    static final class ProtoAdapter_CreativeKitShareStart extends ProtoAdapter<CreativeKitShareStart> {
        public ProtoAdapter_CreativeKitShareStart() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitShareStart.class);
        }

        public final int encodedSize(CreativeKitShareStart creativeKitShareStart) {
            return CreativeKitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitShareStart.creative_kit_event_base) + creativeKitShareStart.unknownFields().size();
        }

        public final CreativeKitShareStart redact(CreativeKitShareStart creativeKitShareStart) {
            Builder newBuilder = creativeKitShareStart.newBuilder();
            if (newBuilder.creative_kit_event_base != null) {
                newBuilder.creative_kit_event_base = (CreativeKitEventBase) CreativeKitEventBase.ADAPTER.redact(newBuilder.creative_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CreativeKitShareStart decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.creative_kit_event_base((CreativeKitEventBase) CreativeKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreativeKitShareStart creativeKitShareStart) throws IOException {
            CreativeKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitShareStart.creative_kit_event_base);
            protoWriter.writeBytes(creativeKitShareStart.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.creative_kit_event_base != null) {
            i = this.creative_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_event_base = this.creative_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_event_base != null) {
            sb.append(", creative_kit_event_base=");
            sb.append(this.creative_kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "CreativeKitShareStart{");
        replace.append('}');
        return replace.toString();
    }

    public CreativeKitShareStart(CreativeKitEventBase creativeKitEventBase) {
        this(creativeKitEventBase, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitShareStart)) {
            return false;
        }
        CreativeKitShareStart creativeKitShareStart = (CreativeKitShareStart) obj;
        if (!unknownFields().equals(creativeKitShareStart.unknownFields()) || !Internal.equals(this.creative_kit_event_base, creativeKitShareStart.creative_kit_event_base)) {
            return false;
        }
        return true;
    }

    public CreativeKitShareStart(CreativeKitEventBase creativeKitEventBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.creative_kit_event_base = creativeKitEventBase;
    }
}
