package com.uco.mundoorigami.crosscutting;

import java.util.UUID;

public class UtilUUID {

    public static final String DEFAUL_UUID_STRING="00000000-0000-0000-0000-000000000000";
    public static final UUID DEFAUL_UUID=UUID.fromString(DEFAUL_UUID_STRING);



    public static final UUID getDefaulUUID(final UUID uuid)
    {
        return (uuid== null)? DEFAUL_UUID:uuid;
    }

    public static final boolean isEqual(final UUID uuidone, final UUID uuidTwo)
    {
        return getDefaulUUID(uuidone).equals(getDefaulUUID(uuidTwo));
    }
    public static final UUID getnewUUID() {
        UUID uuid;
        do
        {
            uuid=UUID.randomUUID();
        }while(isEqual(uuid,DEFAUL_UUID));
        return uuid;
    }
    public static final UUID getUUIDFromString(final String uuidString)
    {
        UUID uuid=DEFAUL_UUID;
        if(uuidString != null && !"".equals(uuidString.trim()))
        {
            try {
                uuid = UUID.fromString(uuidString);
            }
            catch(IllegalArgumentException e)
            {
                // TODO: falta que usted gestione la excepcion!!!
            }

        }
        return uuid;
    }

    public static final String getstringFromUUID(final UUID uuid)
    {
        String uuidStrin= DEFAUL_UUID_STRING;

        if(uuid !=null)
        {
            uuidStrin=uuid.toString();
        }

        return uuidStrin;
    }

}
