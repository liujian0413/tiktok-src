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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo */
public final class LikePraiseDialogInfo extends Message<LikePraiseDialogInfo, Builder> {
    public static final DefaultValueProtoAdapter<LikePraiseDialogInfo> ADAPTER = new ProtoAdapter_LikePraiseDialogInfo();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer new_like_num;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer two_dialog_interval;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LikePraiseDialogInfo, Builder> {
        public Integer new_like_num;
        public Integer two_dialog_interval;

        public final LikePraiseDialogInfo build() {
            return new LikePraiseDialogInfo(this.new_like_num, this.two_dialog_interval, super.buildUnknownFields());
        }

        public final Builder new_like_num(Integer num) {
            this.new_like_num = num;
            return this;
        }

        public final Builder two_dialog_interval(Integer num) {
            this.two_dialog_interval = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo$ProtoAdapter_LikePraiseDialogInfo */
    static final class ProtoAdapter_LikePraiseDialogInfo extends DefaultValueProtoAdapter<LikePraiseDialogInfo> {
        public final LikePraiseDialogInfo redact(LikePraiseDialogInfo likePraiseDialogInfo) {
            return likePraiseDialogInfo;
        }

        public ProtoAdapter_LikePraiseDialogInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, LikePraiseDialogInfo.class);
        }

        public final LikePraiseDialogInfo decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LikePraiseDialogInfo) null);
        }

        public final int encodedSize(LikePraiseDialogInfo likePraiseDialogInfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, likePraiseDialogInfo.new_like_num) + ProtoAdapter.INT32.encodedSizeWithTag(2, likePraiseDialogInfo.two_dialog_interval) + likePraiseDialogInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LikePraiseDialogInfo likePraiseDialogInfo) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, likePraiseDialogInfo.new_like_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, likePraiseDialogInfo.two_dialog_interval);
            protoWriter.writeBytes(likePraiseDialogInfo.unknownFields());
        }

        public final LikePraiseDialogInfo decode(ProtoReader protoReader, LikePraiseDialogInfo likePraiseDialogInfo) throws IOException {
            Builder builder;
            LikePraiseDialogInfo likePraiseDialogInfo2 = (LikePraiseDialogInfo) C10938a.m32097a().mo26425a(LikePraiseDialogInfo.class, likePraiseDialogInfo);
            if (likePraiseDialogInfo2 != null) {
                builder = likePraiseDialogInfo2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.new_like_num((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.two_dialog_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (likePraiseDialogInfo2 != null) {
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

    public final Integer getNewLikeNum() throws NullValueException {
        if (this.new_like_num != null) {
            return this.new_like_num;
        }
        throw new NullValueException();
    }

    public final Integer getTwoDialogInterval() throws NullValueException {
        if (this.two_dialog_interval != null) {
            return this.two_dialog_interval;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.new_like_num = this.new_like_num;
        builder.two_dialog_interval = this.two_dialog_interval;
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
        if (this.new_like_num != null) {
            i = this.new_like_num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.two_dialog_interval != null) {
            i3 = this.two_dialog_interval.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.new_like_num != null) {
            sb.append(", new_like_num=");
            sb.append(this.new_like_num);
        }
        if (this.two_dialog_interval != null) {
            sb.append(", two_dialog_interval=");
            sb.append(this.two_dialog_interval);
        }
        StringBuilder replace = sb.replace(0, 2, "LikePraiseDialogInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikePraiseDialogInfo)) {
            return false;
        }
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) obj;
        if (!unknownFields().equals(likePraiseDialogInfo.unknownFields()) || !Internal.equals(this.new_like_num, likePraiseDialogInfo.new_like_num) || !Internal.equals(this.two_dialog_interval, likePraiseDialogInfo.two_dialog_interval)) {
            return false;
        }
        return true;
    }

    public LikePraiseDialogInfo(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public LikePraiseDialogInfo(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_like_num = num;
        this.two_dialog_interval = num2;
    }
}
