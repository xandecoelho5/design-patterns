package br.com.xandecoelho5.factory.apple.factory;

import br.com.xandecoelho5.factory.apple.model.*;
import br.com.xandecoelho5.factory.apple.model.enums.IPhoneType;
import br.com.xandecoelho5.factory.apple.model.enums.IPhoneVersion;

public abstract class IPhoneFactory {

    public static IPhone createIPhone(IPhoneVersion version, IPhoneType type) {
        if (version.equals(IPhoneVersion.V_11)) {
            return type.equals(IPhoneType.STANDARD) ? new IPhone11() : new IPhone11Pro();
        }
        return type.equals(IPhoneType.STANDARD) ? new IPhoneX() : new IPhoneXSMax();
    }
}
