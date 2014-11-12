package com.txuritan.patch;

public class Info
{
	public static final String NAME = "Patch";
	public static final String MODID = "patch";
    public static final String VER = "1.6.4-A-0.0.2-0";
    public static final String DEP = "before:TxOre;before:GregTech";
    
    /*  --Version Setup--
     * Version "1.6.4 1-2.3.4-5"
     * 1.6.4 <Minecraft Version>
     * 1 <Build State"'A/1' Alpha, 'B/2' Beta, 'O/3' Omega">
     * 2 <Full Release Omega Build Number>
     * 3 <Full Release Beta Build Number>
     * 4 <Full Release Alpha Build Number>
     * 5 <Bug Fix Build Number>
     */
    
    public static final String CLIENT = "com.txuritan.patch.core.ref.proxy.ProxyClient";
	public static final String COMMON = "com.txuritan.patch.core.ref.proxy.ProxyCommon";
}
