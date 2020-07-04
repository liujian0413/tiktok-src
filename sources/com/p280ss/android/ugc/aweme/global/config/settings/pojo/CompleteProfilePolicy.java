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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CompleteProfilePolicy */
public final class CompleteProfilePolicy extends Message<CompleteProfilePolicy, Builder> {
    public static final DefaultValueProtoAdapter<CompleteProfilePolicy> ADAPTER = new ProtoAdapter_CompleteProfilePolicy();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CompleteProfilePolicy$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CompleteProfilePolicy, Builder> {
        public Integer interval;
        public Integer times;

        public final CompleteProfilePolicy build() {
            return new CompleteProfilePolicy(this.times, this.interval, super.buildUnknownFields());
        }

        public final Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public final Builder times(Integer num) {
            this.times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CompleteProfilePolicy$ProtoAdapter_CompleteProfilePolicy */
    static final class ProtoAdapter_CompleteProfilePolicy extends DefaultValueProtoAdapter<CompleteProfilePolicy> {
        public final CompleteProfilePolicy redact(CompleteProfilePolicy completeProfilePolicy) {
            return completeProfilePolicy;
        }

        public ProtoAdapter_CompleteProfilePolicy() {
            super(FieldEncoding.LENGTH_DELIMITED, CompleteProfilePolicy.class);
        }

        public final CompleteProfilePolicy decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CompleteProfilePolicy) null);
        }

        public final int encodedSize(CompleteProfilePolicy completeProfilePolicy) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, completeProfilePolicy.times) + ProtoAdapter.INT32.encodedSizeWithTag(2, completeProfilePolicy.interval) + completeProfilePolicy.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CompleteProfilePolicy completeProfilePolicy) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, completeProfilePolicy.times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, completeProfilePolicy.interval);
            protoWriter.writeBytes(completeProfilePolicy.unknownFields());
        }

        public final CompleteProfilePolicy decode(ProtoReader protoReader, CompleteProfilePolicy completeProfilePolicy) throws IOException {
            Builder builder;
            CompleteProfilePolicy completeProfilePolicy2 = (CompleteProfilePolicy) C10938a.m32097a().mo26425a(CompleteProfilePolicy.class, completeProfilePolicy);
            if (completeProfilePolicy2 != null) {
                builder = completeProfilePolicy2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (completeProfilePolicy2 != null) {
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

    public final Integer getInterval() throws NullValueException {
        if (this.interval != null) {
            return this.interval;
        }
        throw new NullValueException();
    }

    public final Integer getTimes() throws NullValueException {
        if (this.times != null) {
            return this.times;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.times = this.times;
        builder.interval = this.interval;
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
        if (this.times != null) {
            i = this.times.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.interval != null) {
            i3 = this.interval.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.times != null) {
            sb.append(", times=");
            sb.append(this.times);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        StringBuilder replace = sb.replace(0, 2, "CompleteProfilePolicy{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteProfilePolicy)) {
            return false;
        }
        CompleteProfilePolicy completeProfilePolicy = (CompleteProfilePolicy) obj;
        if (!unknownFields().equals(completeProfilePolicy.unknownFields()) || !Internal.equals(this.times, completeProfilePolicy.times) || !Internal.equals(this.interval, completeProfilePolicy.interval)) {
            return false;
        }
        return true;
    }

    public CompleteProfilePolicy(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public CompleteProfilePolicy(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.times = num;
        this.interval = num2;
    }
}
