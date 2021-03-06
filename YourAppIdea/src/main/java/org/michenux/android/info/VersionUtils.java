package org.michenux.android.info;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public class VersionUtils {

	public static int getVersionCode( Context context ) {
        PackageInfo manager= null;
        try {
            manager = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
        return manager.versionCode;
	}

    public static String getVersionName( Context context ) {
        PackageInfo manager= null;
        try {
            manager = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
        return manager.versionName;
    }
}
