package cc.frz.smartmedia.kiosk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(final Context context, final Intent intent)
	{
		final Intent i = new Intent(context, SmartdisplayMediaKioskActivity.class);
		i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(i);
	}
}