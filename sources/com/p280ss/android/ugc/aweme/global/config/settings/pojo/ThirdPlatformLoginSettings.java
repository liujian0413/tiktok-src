package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdPlatformLoginSettings */
public final class ThirdPlatformLoginSettings extends Message<ThirdPlatformLoginSettings, Builder> {
    public static final DefaultValueProtoAdapter<ThirdPlatformLoginSettings> ADAPTER = new ProtoAdapter_ThirdPlatformLoginSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct#ADAPTER", label = 2, tag = 1)
    public final List<LoginJumpStruct> login_jump;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct#ADAPTER", label = 2, tag = 2)
    public final List<BindWindowsStruct> other_bind_window;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct#ADAPTER", label = 2, tag = 3)
    public final List<BindWindowsStruct> profile_bind_window;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdPlatformLoginSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ThirdPlatformLoginSettings, Builder> {
        public List<LoginJumpStruct> login_jump = Internal.newMutableList();
        public List<BindWindowsStruct> other_bind_window = Internal.newMutableList();
        public List<BindWindowsStruct> profile_bind_window = Internal.newMutableList();

        public final ThirdPlatformLoginSettings build() {
            return new ThirdPlatformLoginSettings(this.login_jump, this.other_bind_window, this.profile_bind_window, super.buildUnknownFields());
        }

        public final Builder login_jump(List<LoginJumpStruct> list) {
            Internal.checkElementsNotNull(list);
            this.login_jump = list;
            return this;
        }

        public final Builder other_bind_window(List<BindWindowsStruct> list) {
            Internal.checkElementsNotNull(list);
            this.other_bind_window = list;
            return this;
        }

        public final Builder profile_bind_window(List<BindWindowsStruct> list) {
            Internal.checkElementsNotNull(list);
            this.profile_bind_window = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdPlatformLoginSettings$ProtoAdapter_ThirdPlatformLoginSettings */
    static final class ProtoAdapter_ThirdPlatformLoginSettings extends DefaultValueProtoAdapter<ThirdPlatformLoginSettings> {
        public final ThirdPlatformLoginSettings redact(ThirdPlatformLoginSettings thirdPlatformLoginSettings) {
            return thirdPlatformLoginSettings;
        }

        public ProtoAdapter_ThirdPlatformLoginSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, ThirdPlatformLoginSettings.class);
        }

        public final ThirdPlatformLoginSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ThirdPlatformLoginSettings) null);
        }

        public final int encodedSize(ThirdPlatformLoginSettings thirdPlatformLoginSettings) {
            return LoginJumpStruct.ADAPTER.asRepeated().encodedSizeWithTag(1, thirdPlatformLoginSettings.login_jump) + BindWindowsStruct.ADAPTER.asRepeated().encodedSizeWithTag(2, thirdPlatformLoginSettings.other_bind_window) + BindWindowsStruct.ADAPTER.asRepeated().encodedSizeWithTag(3, thirdPlatformLoginSettings.profile_bind_window) + thirdPlatformLoginSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ThirdPlatformLoginSettings thirdPlatformLoginSettings) throws IOException {
            LoginJumpStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, thirdPlatformLoginSettings.login_jump);
            BindWindowsStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, thirdPlatformLoginSettings.other_bind_window);
            BindWindowsStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, thirdPlatformLoginSettings.profile_bind_window);
            protoWriter.writeBytes(thirdPlatformLoginSettings.unknownFields());
        }

        public final ThirdPlatformLoginSettings decode(ProtoReader protoReader, ThirdPlatformLoginSettings thirdPlatformLoginSettings) throws IOException {
            Builder builder;
            ThirdPlatformLoginSettings thirdPlatformLoginSettings2 = (ThirdPlatformLoginSettings) C10938a.m32097a().mo26425a(ThirdPlatformLoginSettings.class, thirdPlatformLoginSettings);
            if (thirdPlatformLoginSettings2 != null) {
                builder = thirdPlatformLoginSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<LoginJumpStruct> newMutableList = Internal.newMutableList();
            List<BindWindowsStruct> newMutableList2 = Internal.newMutableList();
            List<BindWindowsStruct> newMutableList3 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(LoginJumpStruct.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(LoginJumpStruct.class)));
                            break;
                        case 2:
                            newMutableList2.add(BindWindowsStruct.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(BindWindowsStruct.class)));
                            break;
                        case 3:
                            newMutableList3.add(BindWindowsStruct.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(BindWindowsStruct.class)));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (thirdPlatformLoginSettings2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.login_jump = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.other_bind_window = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder.profile_bind_window = newMutableList3;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<LoginJumpStruct> getLoginJump() {
        return this.login_jump;
    }

    public final List<BindWindowsStruct> getOtherBindWindow() {
        return this.other_bind_window;
    }

    public final List<BindWindowsStruct> getProfileBindWindow() {
        return this.profile_bind_window;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.login_jump.hashCode()) * 37) + this.other_bind_window.hashCode()) * 37) + this.profile_bind_window.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.login_jump = Internal.copyOf("login_jump", this.login_jump);
        builder.other_bind_window = Internal.copyOf("other_bind_window", this.other_bind_window);
        builder.profile_bind_window = Internal.copyOf("profile_bind_window", this.profile_bind_window);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.login_jump.isEmpty()) {
            sb.append(", login_jump=");
            sb.append(this.login_jump);
        }
        if (!this.other_bind_window.isEmpty()) {
            sb.append(", other_bind_window=");
            sb.append(this.other_bind_window);
        }
        if (!this.profile_bind_window.isEmpty()) {
            sb.append(", profile_bind_window=");
            sb.append(this.profile_bind_window);
        }
        StringBuilder replace = sb.replace(0, 2, "ThirdPlatformLoginSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPlatformLoginSettings)) {
            return false;
        }
        ThirdPlatformLoginSettings thirdPlatformLoginSettings = (ThirdPlatformLoginSettings) obj;
        if (!unknownFields().equals(thirdPlatformLoginSettings.unknownFields()) || !this.login_jump.equals(thirdPlatformLoginSettings.login_jump) || !this.other_bind_window.equals(thirdPlatformLoginSettings.other_bind_window) || !this.profile_bind_window.equals(thirdPlatformLoginSettings.profile_bind_window)) {
            return false;
        }
        return true;
    }

    public ThirdPlatformLoginSettings(List<LoginJumpStruct> list, List<BindWindowsStruct> list2, List<BindWindowsStruct> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public ThirdPlatformLoginSettings(List<LoginJumpStruct> list, List<BindWindowsStruct> list2, List<BindWindowsStruct> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.login_jump = Internal.immutableCopyOf("login_jump", list);
        this.other_bind_window = Internal.immutableCopyOf("other_bind_window", list2);
        this.profile_bind_window = Internal.immutableCopyOf("profile_bind_window", list3);
    }
}
