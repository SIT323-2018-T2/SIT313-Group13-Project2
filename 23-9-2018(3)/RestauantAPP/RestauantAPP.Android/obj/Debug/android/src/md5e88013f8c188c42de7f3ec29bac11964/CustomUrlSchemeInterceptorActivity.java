package md5e88013f8c188c42de7f3ec29bac11964;


public class CustomUrlSchemeInterceptorActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("RestauantAPP.Droid.CustomUrlSchemeInterceptorActivity, RestauantAPP.Android", CustomUrlSchemeInterceptorActivity.class, __md_methods);
	}


	public CustomUrlSchemeInterceptorActivity ()
	{
		super ();
		if (getClass () == CustomUrlSchemeInterceptorActivity.class)
			mono.android.TypeManager.Activate ("RestauantAPP.Droid.CustomUrlSchemeInterceptorActivity, RestauantAPP.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
