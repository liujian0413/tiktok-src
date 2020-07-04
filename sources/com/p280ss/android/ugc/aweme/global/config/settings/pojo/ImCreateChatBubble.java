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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble */
public final class ImCreateChatBubble extends Message<ImCreateChatBubble, Builder> {
    public static final DefaultValueProtoAdapter<ImCreateChatBubble> ADAPTER = new ProtoAdapter_ImCreateChatBubble();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show_flag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer time_interval;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ImCreateChatBubble, Builder> {
        public Integer show_flag;
        public Integer time_interval;

        public final ImCreateChatBubble build() {
            return new ImCreateChatBubble(this.show_flag, this.time_interval, super.buildUnknownFields());
        }

        public final Builder show_flag(Integer num) {
            this.show_flag = num;
            return this;
        }

        public final Builder time_interval(Integer num) {
            this.time_interval = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble$ProtoAdapter_ImCreateChatBubble */
    static final class ProtoAdapter_ImCreateChatBubble extends DefaultValueProtoAdapter<ImCreateChatBubble> {
        public final ImCreateChatBubble redact(ImCreateChatBubble imCreateChatBubble) {
            return imCreateChatBubble;
        }

        public ProtoAdapter_ImCreateChatBubble() {
            super(FieldEncoding.LENGTH_DELIMITED, ImCreateChatBubble.class);
        }

        public final ImCreateChatBubble decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ImCreateChatBubble) null);
        }

        public final int encodedSize(ImCreateChatBubble imCreateChatBubble) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, imCreateChatBubble.show_flag) + ProtoAdapter.INT32.encodedSizeWithTag(2, imCreateChatBubble.time_interval) + imCreateChatBubble.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ImCreateChatBubble imCreateChatBubble) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, imCreateChatBubble.show_flag);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, imCreateChatBubble.time_interval);
            protoWriter.writeBytes(imCreateChatBubble.unknownFields());
        }

        public final ImCreateChatBubble decode(ProtoReader protoReader, ImCreateChatBubble imCreateChatBubble) throws IOException {
            Builder builder;
            ImCreateChatBubble imCreateChatBubble2 = (ImCreateChatBubble) C10938a.m32097a().mo26425a(ImCreateChatBubble.class, imCreateChatBubble);
            if (imCreateChatBubble2 != null) {
                builder = imCreateChatBubble2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_flag((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.time_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (imCreateChatBubble2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getShowFlag() throws NullValueException {
        if (this.show_flag != null) {
            return this.show_flag;
        }
        throw new NullValueException();
    }

    public final Integer getTimeInterval() throws NullValueException {
        if (this.time_interval != null) {
            return this.time_interval;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_flag = this.show_flag;
        builder.time_interval = this.time_interval;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.show_flag != null) {
            i = this.show_flag.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.time_interval != null) {
            i3 = this.time_interval.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_flag != null) {
            sb.append(", show_flag=");
            sb.append(this.show_flag);
        }
        if (this.time_interval != null) {
            sb.append(", time_interval=");
            sb.append(this.time_interval);
        }
        StringBuilder replace = sb.replace(0, 2, "ImCreateChatBubble{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImCreateChatBubble)) {
            return false;
        }
        ImCreateChatBubble imCreateChatBubble = (ImCreateChatBubble) obj;
        if (!unknownFields().equals(imCreateChatBubble.unknownFields()) || !Internal.equals(this.show_flag, imCreateChatBubble.show_flag) || !Internal.equals(this.time_interval, imCreateChatBubble.time_interval)) {
            return false;
        }
        return true;
    }

    public ImCreateChatBubble(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public ImCreateChatBubble(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_flag = num;
        this.time_interval = num2;
    }
}
